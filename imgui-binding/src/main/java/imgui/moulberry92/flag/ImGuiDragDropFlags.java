package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Flags for ImGui::BeginDragDropSource(), ImGui::AcceptDragDropPayload()
 */
@BindingSource
public final class ImGuiDragDropFlags {
    private ImGuiDragDropFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiDragDropFlags_")
    public Void __;
}
