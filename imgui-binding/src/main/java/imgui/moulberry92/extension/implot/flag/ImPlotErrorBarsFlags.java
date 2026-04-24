package imgui.moulberry92.extension.implot.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotErrorBarsFlags {
    private ImPlotErrorBarsFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotErrorBarsFlags_")
    public Void __;
}
