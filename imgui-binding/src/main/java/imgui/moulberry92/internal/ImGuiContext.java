package imgui.moulberry92.internal;

import imgui.moulberry92.binding.ImGuiStruct;

public class ImGuiContext extends ImGuiStruct {
    public ImGuiContext(final long ptr) {
        super(ptr);
        ImGui.init();
    }
}
