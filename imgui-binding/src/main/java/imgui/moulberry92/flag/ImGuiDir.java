package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * A cardinal direction
 */
@BindingSource
public final class ImGuiDir {
    private ImGuiDir() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiDir", sanitizeName = "ImGuiDir_")
    public Void __;
}
