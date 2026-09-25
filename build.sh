#!/usr/bin/env bash

set -euo pipefail

java_version=21

flatlaf_version='3.7.2'
flatlaf_file="flatlaf-$flatlaf_version.jar"

source_dir="src"
build_dir="build"
build_file="rars.jar"

if [ -d "$build_dir/$source_dir" ]; then
    rm -r "${build_dir:?}/${source_dir:?}"
fi
mkdir --parents "$build_dir/$source_dir"

if [ ! -f "$build_dir/$flatlaf_file" ]; then
    echo "Fetching FlatLaf $flatlaf_version"
    curl "https://repo1.maven.org/maven2/com/formdev/flatlaf/$flatlaf_version/$flatlaf_file" -o "$build_dir/$flatlaf_file" --silent
fi

if ! git submodule status | grep '(' >/dev/null; then
    echo 'Initializing Git submodule(s)'
    git submodule update --init
fi

build_version="$(git describe --tags --match 'v*' --dirty | cut -c2-)"
echo "Version = $build_version" >"$PWD/src/Version.properties"
unset build_version

echo "Compiling with Java $java_version"
# None of the files included here will have abnormal characters.
# shellcheck disable=SC2038
find "$source_dir" -name '*.java' | xargs javac --release "$java_version" -d "$build_dir/$source_dir" "$@"

echo 'Copying files'
cp ./README.md ./LICENSE "$build_dir/$source_dir"

if [[ "$OSTYPE" == 'darwin'* ]]; then
    find "$source_dir" -type f -not -name '*.java' -exec rsync -R {} "$build_dir" \;
else
    find "$source_dir" -type f -not -name '*.java' -exec cp --parents {} "$build_dir" \;
fi

cd "$build_dir/$source_dir"

echo 'Extracting FlatLaf classes'
jar --extract <"../$flatlaf_file"

echo 'Creating jar file'
cat >./META-INF/MANIFEST.MF <<EOF
Manifest-Version: 1.0
Implementation-Version: 3.1.1
Multi-Release: true
Main-Class: rars.Launch
EOF

jar --create --file="../$build_file" --manifest="./META-INF/MANIFEST.MF" ./*

echo "Done: $build_dir/$build_file"
