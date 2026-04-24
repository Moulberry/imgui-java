package imgui.moulberry92.internal.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiAxis {
    private ImGuiAxis() {
    }

    @BindingAstEnum(file = "ast-imgui_internal.json", qualType = "ImGuiAxis", sanitizeName = "ImGuiAxis_")
    public Void __;
}
