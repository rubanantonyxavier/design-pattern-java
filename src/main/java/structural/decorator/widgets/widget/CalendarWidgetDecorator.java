package structural.decorator.widgets.widget;

public class CalendarWidgetDecorator extends WidgetDecorator {

    int calendarRank = 5;

    public CalendarWidgetDecorator(Widgets widgets) {
        super(widgets);
    }

    @Override
    public String addWidget() {
        return widgets.addWidget() + " and Calendar Widget of Rank-" + calendarRank;
    }

    @Override
    public int getWidgetRank() {
        return widgets.getWidgetRank() + calendarRank;
    }
}
