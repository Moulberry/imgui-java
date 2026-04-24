package imgui.moulberry92.extension.implot.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotColormap {
    private ImPlotColormap() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotColormap_")
    public Void __;
}
