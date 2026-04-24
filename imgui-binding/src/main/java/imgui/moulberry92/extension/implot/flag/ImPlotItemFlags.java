package imgui.moulberry92.extension.implot.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotItemFlags {
    private ImPlotItemFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotItemFlags_")
    public Void __;
}
