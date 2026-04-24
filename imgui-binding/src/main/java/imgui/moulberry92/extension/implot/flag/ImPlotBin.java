package imgui.moulberry92.extension.implot.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotBin {
    private ImPlotBin() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotBin_")
    public Void __;
}
