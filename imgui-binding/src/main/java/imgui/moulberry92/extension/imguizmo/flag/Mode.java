package imgui.moulberry92.extension.imguizmo.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class Mode {
    private Mode() {
    }

    @BindingAstEnum(file = "ast-ImGuizmo.json", qualType = "ImGuizmo::MODE")
    public Void __;
}
