package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Flags stored in ImGuiViewport::Flags, giving indications to the platform backends.
 */
@BindingSource
public final class ImGuiViewportFlags {
    private ImGuiViewportFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiViewportFlags_")
    public Void __;
}
