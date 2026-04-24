package imgui.moulberry92.extension.imguizmo.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Needs view and projection matrices.
 * Matrix parameter is the source matrix (where will be gizmo be drawn) and might be transformed by the function. Return deltaMatrix is optional.
 * Translation is applied in world space.
 */
@BindingSource
public final class Operation {
    private Operation() {
    }

    @BindingAstEnum(file = "ast-ImGuizmo.json", qualType = "ImGuizmo::OPERATION")
    public Void __;
}
