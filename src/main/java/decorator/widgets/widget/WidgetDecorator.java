package decorator.widgets.widget;

public class WidgetDecorator implements Widgets {

    Widgets widgets;

    public WidgetDecorator(Widgets widgets) {
        this.widgets = widgets;
    }

    @Override
    public String addWidget() {
        return widgets.addWidget();
    }

    @Override
    public int getWidgetRank() {
        return widgets.getWidgetRank();
    }
}
