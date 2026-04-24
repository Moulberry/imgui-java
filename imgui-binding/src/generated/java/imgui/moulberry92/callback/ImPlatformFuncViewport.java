package imgui.moulberry92.callback;

import imgui.moulberry92.ImGuiViewport;

/**
 * Callback to represent ImGuiPlatformIO function with args: (ImGuiViewport*)
 */
public abstract class ImPlatformFuncViewport {
    public abstract void accept(ImGuiViewport vp);
}
