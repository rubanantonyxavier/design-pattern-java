package structural.decorator.widgets;

import structural.decorator.widgets.page.DesktopVersionPage;
import structural.decorator.widgets.page.MobileVersionPage;
import structural.decorator.widgets.widget.*;

public class DecoratorMainClass {
    public static void main(String[] args) {
        Widgets widgets = new CalendarWidgetDecorator(new ClockWidgetDecorator(new NoWidget(new DesktopVersionPage())));

        Widgets widgets1 = new NoWidget(new MobileVersionPage());
        Widgets widgets2 = new ClockWidgetDecorator(widgets1);
        Widgets widgets3 = new DateWidgetDecorator(widgets2);

        System.out.println("=====Widget=====");
        System.out.println(widgets.addWidget());
        System.out.println("Total Rank: " + widgets.getWidgetRank());
        System.out.println("=====Widget 1=====");
        System.out.println(widgets1.addWidget());
        System.out.println("Total Rank: " + widgets1.getWidgetRank());
        System.out.println("=====Widget 2=====");
        System.out.println(widgets2.addWidget());
        System.out.println("Total Rank: " + widgets2.getWidgetRank());
        System.out.println("=====Widget 3=====");
        System.out.println(widgets3.addWidget());
        System.out.println("Total Rank: " + widgets3.getWidgetRank());
    }
}

/*
Description
I am building a webpage for my business.

The page can have different formats like a mobile version and a desktop version etc. Each format has a ranking associated with it.

You can add many a widgets to the page. Each widgets adds certain functionality to the page. The widgets are independent of each other and has a rank associated with each widget. When a widget is added to the page, the rank of the page is incremented by the rank of widget.

Write code to represent this model and calculate the rank of any given page.
------------------------------------------------------------
Acceptance criteria:
1. Solve the problem using pattern
2. Optimize the code
3. No Sonar Violations
 */
