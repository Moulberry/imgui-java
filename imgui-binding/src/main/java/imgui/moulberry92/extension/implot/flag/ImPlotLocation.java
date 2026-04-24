package imgui.moulberry92.extension.implot.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotLocation {
    private ImPlotLocation() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotLocation_")
    public Void __;
}
