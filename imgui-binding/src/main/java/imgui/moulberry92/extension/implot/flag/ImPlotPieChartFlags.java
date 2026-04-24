package imgui.moulberry92.extension.implot.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotPieChartFlags {
    private ImPlotPieChartFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotPieChartFlags_")
    public Void __;
}
