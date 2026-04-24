package imgui.moulberry92.callback;

import imgui.moulberry92.ImGuiViewport;

/**
 * Callback to represent ImGuiPlatformIO function with args: (ImGuiViewport*, String)
 */
public abstract class ImPlatformFuncViewportString {
    public abstract void accept(ImGuiViewport vp, String str);
}
