package imgui.moulberry92.extension.imguiknobs.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiKnobVariant {
    private ImGuiKnobVariant() {
    }

    @BindingAstEnum(file = "ast-imgui-knobs.json", qualType = "ImGuiKnobVariant_")
    public Void __;
}
