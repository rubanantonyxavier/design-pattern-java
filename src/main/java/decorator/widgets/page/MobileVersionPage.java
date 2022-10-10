package decorator.widgets.page;

public class MobileVersionPage implements PageFormat {

    int rank = 1;

    @Override
    public String addPage() {
        return "Mobile Version Page of Rank-" + rank;
    }

    @Override
    public int getPageRank() {
        return rank;
    }
}
