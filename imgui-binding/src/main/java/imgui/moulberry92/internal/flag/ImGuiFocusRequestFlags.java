package imgui.moulberry92.internal.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiFocusRequestFlags {
    private ImGuiFocusRequestFlags() {
    }

    @BindingAstEnum(file = "ast-imgui_internal.json", qualType = "ImGuiFocusRequestFlags_")
    public Void __;
}
