package imgui.moulberry92.callback;

import imgui.moulberry92.ImGuiViewport;

/**
 * Callback to represent ImGuiPlatformIO function with args: (ImGuiViewport*) - Boolean
 */
public abstract class ImPlatformFuncViewportSuppBoolean {
    public abstract boolean get(ImGuiViewport vp);
}
