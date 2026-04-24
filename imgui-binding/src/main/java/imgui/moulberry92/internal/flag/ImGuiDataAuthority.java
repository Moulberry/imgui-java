package imgui.moulberry92.internal.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Store the source authority (dock node vs window) of a field
 */
@BindingSource
public final class ImGuiDataAuthority {
    private ImGuiDataAuthority() {
    }

    @BindingAstEnum(file = "ast-imgui_internal.json", qualType = "ImGuiDataAuthority_")
    public Void __;
}
