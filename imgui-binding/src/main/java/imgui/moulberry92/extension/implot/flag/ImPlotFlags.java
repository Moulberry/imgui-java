package imgui.moulberry92.extension.implot.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotFlags {
    private ImPlotFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotFlags_")
    public Void __;
}
