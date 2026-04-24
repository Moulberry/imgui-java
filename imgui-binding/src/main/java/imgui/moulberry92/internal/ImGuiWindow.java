package imgui.moulberry92.internal;

import imgui.moulberry92.binding.ImGuiStruct;
import imgui.moulberry92.binding.annotation.BindingField;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public class ImGuiWindow extends ImGuiStruct {
    public ImGuiWindow(final long ptr) {
        super(ptr);
        ImGui.init();
    }

    /*JNI
        #include "_common.h"
        #include "_internal.h"
        #define THIS ((ImGuiWindow*)STRUCT_PTR)
     */

    /**
     * Is scrollbar visible?
     */
    @BindingField(accessors = BindingField.Accessor.GETTER)
    public boolean ScrollbarX;

    /**
     * Is scrollbar visible?
     */
    @BindingField(accessors = BindingField.Accessor.GETTER)
    public boolean ScrollbarY;

    /*JNI
        #undef THIS
     */
}
