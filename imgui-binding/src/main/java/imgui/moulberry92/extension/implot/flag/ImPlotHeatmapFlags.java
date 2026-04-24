package imgui.moulberry92.extension.implot.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotHeatmapFlags {
    private ImPlotHeatmapFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotHeatmapFlags_")
    public Void __;
}
