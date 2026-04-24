package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * A sorting direction
 */
@BindingSource
public final class ImGuiSortDirection {
    private ImGuiSortDirection() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiSortDirection", sanitizeName = "ImGuiSortDirection_")
    public Void __;
}
