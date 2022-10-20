package structural.decorator.widgets.page;

public class DesktopVersionPage implements PageFormat {

    int rank = 2;

    @Override
    public String addPage() {
        return "Desktop Version Page of Rank-" + rank;
    }

    @Override
    public int getPageRank() {
        return rank;
    }
}
