package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Flags for ImGui::IsWindowFocused()
 */
@BindingSource
public final class ImGuiFocusedFlags {
    private ImGuiFocusedFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiFocusedFlags_")
    public Void __;
}
