package behavioral.strategy;

public class SharePhotoByEmail implements SharePhoto {
    @Override
    public void sharePhotoMethod() {
        System.out.println("Photo Shared by Email");
    }
}
