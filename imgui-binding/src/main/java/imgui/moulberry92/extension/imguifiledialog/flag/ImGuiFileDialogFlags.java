package imgui.moulberry92.extension.imguifiledialog.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;
import imgui.moulberry92.binding.annotation.ExcludedSource;

@ExcludedSource
@BindingSource
public final class ImGuiFileDialogFlags {
    private ImGuiFileDialogFlags() {
    }

    @BindingAstEnum(file = "ast-ImGuiFileDialog.json", qualType = "ImGuiFileDialogFlags_")
    public Void __;
}
