package rars.venus.util;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalTheme;

public record ColorTheme(
    String name,
    int rosewater,
    int flamingo,
    int pink,
    int mauve,
    int red,
    int maroon,
    int peach,
    int yellow,
    int green,
    int teal,
    int sky,
    int sapphire,
    int blue,
    int lavender,
    int backgroundDark,
    int background,
    int backgroundLight,
    int surfaceDark,
    int surface,
    int surfaceLight,
    int overlayDark,
    int overlay,
    int overlayLight,
    int subtextDark,
    int subtext,
    int text
)
{

    public static ColorTheme DEFAULT = new ColorTheme(
        "Catppuccin Mocha",
        0xF5E0DC,
        0xF2CDCD,
        0xF5C2E7,
        0xCBA6F7,
        0xF38BA8,
        0xEBA0AC,
        0xFAB387,
        0xF9E2AF,
        0xA6E3A1,
        0x94E2D5,
        0x89DCEB,
        0x74C7EC,
        0x89B4FA,
        0xB4BEFE,
        0x11111B,
        0x181825,
        0x1E1E2E,
        0x313244,
        0x45475A,
        0x585B70,
        0x6C7086,
        0x7F849C,
        0x9399B2,
        0xA6ADC8,
        0xBAC2DE,
        0xCDD6F4
    );

    public static MetalTheme createTheme(final ColorTheme theme) {
        return new DefaultMetalTheme() {

            @Override
            public String getName() {
                return theme.name();
            }

            @Override
            protected ColorUIResource getBlack() {
                return theme.getBackgroundDark();
            }

            @Override
            protected ColorUIResource getWhite() {
                return theme.getSurfaceLight();
            }

            @Override
            public ColorUIResource getFocusColor() {
                return theme.getOverlayLight();
            }

            @Override
            public ColorUIResource getDesktopColor() {
                return theme.getOverlayLight();
            }

            @Override
            public ColorUIResource getControl() {
                return theme.getBackgroundLight();
            }

            @Override
            public ColorUIResource getControlShadow() {
                return theme.getBackground();
            }

            @Override
            public ColorUIResource getControlDarkShadow() {
                return theme.getBackgroundDark();
            }

            @Override
            public ColorUIResource getControlInfo() {
                return theme.getText();
            }

            @Override
            public ColorUIResource getControlHighlight() {
                return theme.getSurfaceDark();
            }

            @Override
            public ColorUIResource getControlDisabled() {
                return theme.getSubtextDark();
            }

            @Override
            public ColorUIResource getPrimaryControl() {
                return theme.getSurfaceLight();
            }

            @Override
            public ColorUIResource getPrimaryControlShadow() {
                return theme.getSurface();
            }

            @Override
            public ColorUIResource getPrimaryControlDarkShadow() {
                return theme.getSurfaceDark();
            }

            @Override
            public ColorUIResource getPrimaryControlInfo() {
                return theme.getBackgroundDark();
            }

            @Override
            public ColorUIResource getPrimaryControlHighlight() {
                return theme.getOverlayDark();
            }

            @Override
            public ColorUIResource getSystemTextColor() {
                return theme.getText();
            }

            @Override
            public ColorUIResource getControlTextColor() {
                return theme.getText();
            }

            @Override
            public ColorUIResource getInactiveControlTextColor() {
                return theme.getSubtextDark();
            }

            @Override
            public ColorUIResource getInactiveSystemTextColor() {
                return theme.getSubtextDark();
            }

            @Override
            public ColorUIResource getUserTextColor() {
                return theme.getText();
            }

            @Override
            public ColorUIResource getTextHighlightColor() {
                return theme.getSurfaceLight();
            }

            @Override
            public ColorUIResource getHighlightedTextColor() {
                return theme.getText();
            }

            @Override
            public ColorUIResource getWindowBackground() {
                return theme.getBackgroundDark();
            }

            @Override
            public ColorUIResource getWindowTitleBackground() {
                return theme.getSurfaceLight();
            }

            @Override
            public ColorUIResource getWindowTitleForeground() {
                return theme.getText();
            }

            @Override
            public ColorUIResource getWindowTitleInactiveBackground() {
                return theme.getSurfaceDark();
            }

            @Override
            public ColorUIResource getWindowTitleInactiveForeground() {
                return theme.getSubtextDark();
            }

            @Override
            public ColorUIResource getMenuBackground() {
                return theme.getSurface();
            }

            @Override
            public ColorUIResource getMenuForeground() {
                return theme.getSubtext();
            }

            @Override
            public ColorUIResource getMenuSelectedBackground() {
                return theme.getSurfaceLight();
            }

            @Override
            public ColorUIResource getMenuSelectedForeground() {
                return theme.getText();
            }

            @Override
            public ColorUIResource getMenuDisabledForeground() {
                return theme.getSubtextDark();
            }

            @Override
            public ColorUIResource getSeparatorBackground() {
                return theme.getSurfaceLight();
            }

            @Override
            public ColorUIResource getSeparatorForeground() {
                return theme.getBackground();
            }

            @Override
            public ColorUIResource getAcceleratorForeground() {
                return theme.getBackground();
            }

            @Override
            public ColorUIResource getAcceleratorSelectedForeground() {
                return theme.getBackgroundDark();
            }
        };
    }

    public ColorUIResource getRosewater() {
        return new ColorUIResource(this.rosewater());
    }

    public ColorUIResource getFlamingo() {
        return new ColorUIResource(this.flamingo());
    }

    public ColorUIResource getPink() {
        return new ColorUIResource(this.pink());
    }

    public ColorUIResource getMauve() {
        return new ColorUIResource(this.mauve());
    }

    public ColorUIResource getRed() {
        return new ColorUIResource(this.red());
    }

    public ColorUIResource getMaroon() {
        return new ColorUIResource(this.maroon());
    }

    public ColorUIResource getPeach() {
        return new ColorUIResource(this.peach());
    }

    public ColorUIResource getYellow() {
        return new ColorUIResource(this.yellow());
    }

    public ColorUIResource getGreen() {
        return new ColorUIResource(this.green());
    }

    public ColorUIResource getTeal() {
        return new ColorUIResource(this.teal());
    }

    public ColorUIResource getSky() {
        return new ColorUIResource(this.sky());
    }

    public ColorUIResource getSapphire() {
        return new ColorUIResource(this.sapphire());
    }

    public ColorUIResource getBlue() {
        return new ColorUIResource(this.blue());
    }

    public ColorUIResource getLavender() {
        return new ColorUIResource(this.lavender());
    }

    public ColorUIResource getBackgroundDark() {
        return new ColorUIResource(this.backgroundDark());
    }

    public ColorUIResource getBackground() {
        return new ColorUIResource(this.background());
    }

    public ColorUIResource getBackgroundLight() {
        return new ColorUIResource(this.backgroundLight());
    }

    public ColorUIResource getSurfaceDark() {
        return new ColorUIResource(this.surfaceDark());
    }

    public ColorUIResource getSurface() {
        return new ColorUIResource(this.surface());
    }

    public ColorUIResource getSurfaceLight() {
        return new ColorUIResource(this.surfaceLight());
    }

    public ColorUIResource getOverlayDark() {
        return new ColorUIResource(this.overlayDark());
    }

    public ColorUIResource getOverlay() {
        return new ColorUIResource(this.overlay());
    }

    public ColorUIResource getOverlayLight() {
        return new ColorUIResource(this.overlayLight());
    }

    public ColorUIResource getSubtextDark() {
        return new ColorUIResource(this.subtextDark());
    }

    public ColorUIResource getSubtext() {
        return new ColorUIResource(this.subtext());
    }

    public ColorUIResource getText() {
        return new ColorUIResource(this.text());
    }

}
