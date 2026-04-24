package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Flags for ImGui::Selectable()
 */
@BindingSource
public final class ImGuiSelectableFlags {
    private ImGuiSelectableFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiSelectableFlags_")
    public Void __;
}
