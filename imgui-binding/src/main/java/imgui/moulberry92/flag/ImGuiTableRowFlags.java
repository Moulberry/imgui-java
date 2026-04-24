package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Flags for {@link imgui.moulberry92.ImGui#tableNextRow(int)}
 */
@BindingSource
public final class ImGuiTableRowFlags {
    private ImGuiTableRowFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiTableRowFlags_")
    public Void __;
}
