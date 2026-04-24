package imgui.moulberry92.callback;

import imgui.moulberry92.ImGuiViewport;
import imgui.moulberry92.ImVec2;

/**
 * Callback to represent ImGuiPlatformIO function with args: (ImGuiViewport*) - ImVec2
 */
public abstract class ImPlatformFuncViewportSuppImVec2 {
    public abstract void get(ImGuiViewport vp, ImVec2 dstImVec2);
}
