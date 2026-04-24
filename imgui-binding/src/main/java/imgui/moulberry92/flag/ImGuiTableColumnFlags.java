package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Flags for {@link imgui.moulberry92.ImGui#tableSetupColumn(String, int)}
 */
@BindingSource
public final class ImGuiTableColumnFlags {
    private ImGuiTableColumnFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiTableColumnFlags_")
    public Void __;
}
