package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Renamed from {@code ImGuiFreeTypeBuilderFlags} in imgui 1.92.
 */
@BindingSource
public final class ImGuiFreeTypeLoaderFlags {
    private ImGuiFreeTypeLoaderFlags() {
    }

    @BindingAstEnum(file = "ast-imgui_freetype.json", qualType = "ImGuiFreeTypeLoaderFlags_", sanitizeName = "ImGuiFreeTypeLoaderFlags_")
    public Void __;
}
