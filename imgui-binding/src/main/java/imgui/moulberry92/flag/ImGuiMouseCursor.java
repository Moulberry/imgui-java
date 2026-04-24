package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Enumeration for GetMouseCursor()
 * User code may request binding to display given cursor by calling SetMouseCursor(), which is why we have some cursors that are marked unused here
 */
@BindingSource
public final class ImGuiMouseCursor {
    private ImGuiMouseCursor() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiMouseCursor_")
    public Void __;
}
