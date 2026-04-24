package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Flags for ColorEdit3() / ColorEdit4() / ColorPicker3() / ColorPicker4() / ColorButton()
 */
@BindingSource
public final class ImGuiColorEditFlags {
    private ImGuiColorEditFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiColorEditFlags_")
    public Void __;
}
