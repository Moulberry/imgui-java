package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Enumeration for PushStyleColor() / PopStyleColor()
 */
@BindingSource
public final class ImGuiCol {
    private ImGuiCol() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiCol_")
    public Void __;
}
