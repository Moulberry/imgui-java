package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Flags for ImFontAtlas build
 */
@BindingSource
public final class ImFontAtlasFlags {
    private ImFontAtlasFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImFontAtlasFlags_")
    public Void __;
}
