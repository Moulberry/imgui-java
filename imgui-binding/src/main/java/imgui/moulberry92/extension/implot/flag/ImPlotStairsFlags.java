package imgui.moulberry92.extension.implot.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotStairsFlags {
    private ImPlotStairsFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotStairsFlags_")
    public Void __;
}
