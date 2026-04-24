package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Flags for ImGui::BeginCombo()
 */
@BindingSource
public final class ImGuiComboFlags {
    private ImGuiComboFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiComboFlags_")
    public Void __;
}
