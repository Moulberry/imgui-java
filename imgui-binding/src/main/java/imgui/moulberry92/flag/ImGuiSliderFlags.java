package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiSliderFlags {
    private ImGuiSliderFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiSliderFlags_")
    public Void __;
}
