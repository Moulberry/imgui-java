package imgui.moulberry92.internal.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Transient per-window flags, reset at the beginning of the frame. For child window, inherited from parent on first Begin().
 * This is going to be exposed in imgui.h when stabilized enough.
 */
@BindingSource
public final class ImGuiItemFlags {
    private ImGuiItemFlags() {
    }

    @BindingAstEnum(file = "ast-imgui_internal.json", qualType = "ImGuiItemFlags_")
    public Void __;
}
