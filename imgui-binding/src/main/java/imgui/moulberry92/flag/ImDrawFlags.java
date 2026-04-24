package imgui.moulberry92.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

/**
 * Flags for ImDrawList functions
 */
@BindingSource
public final class ImDrawFlags {
    private ImDrawFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImDrawFlags_")
    public Void __;
}
