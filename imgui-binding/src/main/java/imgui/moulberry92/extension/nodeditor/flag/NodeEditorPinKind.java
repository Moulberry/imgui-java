package imgui.moulberry92.extension.nodeditor.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class NodeEditorPinKind {
    private NodeEditorPinKind() {
    }

    @BindingAstEnum(file = "ast-imgui_node_editor.json", qualType = "ax::NodeEditor::PinKind")
    public Void __;
}
