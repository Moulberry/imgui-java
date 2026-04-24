package imgui.moulberry92.extension.nodeditor;

import imgui.moulberry92.binding.ImGuiStructDestroyable;
import imgui.moulberry92.binding.annotation.BindingField;
import imgui.moulberry92.binding.annotation.BindingSource;
import imgui.moulberry92.binding.annotation.ReturnValue;

@BindingSource
public final class NodeEditorConfig extends ImGuiStructDestroyable {
    @Override
    protected long create() {
        return nCreate();
    }

    /*JNI
        #include "_nodeeditor.h"
        #define THIS ((ax::NodeEditor::Config*)STRUCT_PTR)
     */

    private native long nCreate(); /*
        return (uintptr_t)(new ax::NodeEditor::Config());
    */

    @BindingField
    public String SettingsFile;

    public int getCanvasSizeMode() {
        return nGetCanvasSizeMode();
    }

    public void setCanvasSizeMode(final int value) {
        nSetCanvasSizeMode(value);
    }

    public native int nGetCanvasSizeMode(); /*
        return static_cast<int>(THIS->CanvasSizeMode);
    */

    public native void nSetCanvasSizeMode(int value); /*
        THIS->CanvasSizeMode = static_cast<ax::NodeEditor::CanvasSizeMode>(value);
    */

    @BindingField
    public int DragButtonIndex;

    @BindingField
    public int SelectButtonIndex;

    @BindingField
    public int NavigateButtonIndex;

    @BindingField
    public int ContextMenuButtonIndex;

    @BindingField
    public boolean EnableSmoothZoom;

    @BindingField
    public float SmoothZoomPower;

    /*JNI
        #undef THIS
     */
}
