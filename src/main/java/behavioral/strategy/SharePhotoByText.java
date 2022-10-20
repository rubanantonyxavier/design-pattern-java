package behavioral.strategy;

public class SharePhotoByText implements SharePhoto {
    @Override
    public void sharePhotoMethod() {
        System.out.println("Photo Shared by Text");
    }
}
