package decorator.widgets.widget;

public class ClockWidgetDecorator extends WidgetDecorator {

    int clockRank = 4;

    public ClockWidgetDecorator(Widgets widgets) {
        super(widgets);
    }

    @Override
    public String addWidget() {
        return widgets.addWidget() + " and Clock Widget of Rank-" + clockRank;
    }

    @Override
    public int getWidgetRank() {
        return widgets.getWidgetRank() + clockRank;
    }
}
