package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Flags for ImGui::BeginTabBar()
 */
@BindingSource
public final class ImGuiTabBarFlags {
    private ImGuiTabBarFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiTabBarFlags_")
    public Void __;
}
