package imgui.moulberry92.extension.nodeditor.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class NodeEditorStyleColor {
    private NodeEditorStyleColor() {
    }

    @BindingAstEnum(file = "ast-imgui_node_editor.json", qualType = "ax::NodeEditor::StyleColor", sanitizeName = "StyleColor_")
    public Void __;
}
