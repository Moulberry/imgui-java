package imgui.moulberry92.extension.implot.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotMarker {
    private ImPlotMarker() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotMarker_")
    public Void __;
}
