package imgui.moulberry92.callback;

import imgui.moulberry92.ImGuiViewport;

/**
 * Callback to represent ImGuiPlatformIO function with args: (ImGuiViewport*) - Boolean
 */
public abstract class ImPlatformFuncViewportSuppFloat {
    public abstract float get(ImGuiViewport vp);
}
