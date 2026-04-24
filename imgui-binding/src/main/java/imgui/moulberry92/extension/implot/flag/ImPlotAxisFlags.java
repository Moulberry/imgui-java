package imgui.moulberry92.extension.implot.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotAxisFlags {
    private ImPlotAxisFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotAxisFlags_")
    public Void __;
}
