package structural.decorator.widgets.widget;

import structural.decorator.widgets.page.PageFormat;

public class NoWidget implements Widgets {
    int rank = 0;
    PageFormat pageFormat;

    public NoWidget(PageFormat pageFormat) {
        this.pageFormat = pageFormat;
    }

    @Override
    public String addWidget() {
        return "Plain " + pageFormat.addPage();
    }

    @Override
    public int getWidgetRank() {
        return rank + pageFormat.getPageRank();
    }
}
