package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Flags for ImDrawList. Those are set automatically by ImGui:: functions from ImGuiIO settings, and generally not manipulated directly.
 * It is however possible to temporarily alter flags between calls to ImDrawList:: functions.
 */
@BindingSource
public final class ImDrawListFlags {
    private ImDrawListFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImDrawListFlags_")
    public Void __;
}
