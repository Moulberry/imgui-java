package imgui.moulberry92.extension.implot.flag;

import imgui.moulberry92.binding.annotation.BindingAstEnum;
import imgui.moulberry92.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotTextFlags {
    private ImPlotTextFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotTextFlags_")
    public Void __;
}
