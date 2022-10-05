package decorator.widget;

public class DateWidgetDecorator extends WidgetDecorator {

    int dateRank = 3;

    public DateWidgetDecorator(Widgets widgets) {
        super(widgets);
    }

    @Override
    public String addWidget() {
        return widgets.addWidget() + " and Date Widget of Rank-" + dateRank;
    }

    @Override
    public int getWidgetRank() {
        return widgets.getWidgetRank() + dateRank;
    }
}
