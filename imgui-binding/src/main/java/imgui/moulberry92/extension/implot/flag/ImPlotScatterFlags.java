package imgui.moulberry92.extension.implot.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotScatterFlags {
    private ImPlotScatterFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotScatterFlags_")
    public Void __;
}
