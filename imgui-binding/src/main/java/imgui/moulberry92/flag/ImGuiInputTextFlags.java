package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Flags for ImGui::InputText()
 */
@BindingSource
public final class ImGuiInputTextFlags {
    private ImGuiInputTextFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiInputTextFlags_")
    public Void __;
}
