package imgui.moulberry92.extension.imguifiledialog.callback;

import imgui.moulberry92.binding.annotation.ExcludedSource;

@ExcludedSource
public abstract class ImGuiFileDialogPaneFun {
    public abstract void accept(String filter, long userDatas, boolean canContinue);
}
