package behavioral.strategy;

public abstract class PhoneCameraApp {

    public abstract void editPhoto();

    public void takePhoto() {
        System.out.println("Photo Taken");
    }

    public void savePhoto() {
        System.out.println("Photo Saved");
    }

    public void sharePhoto(SharePhoto sharePhoto) {
        sharePhoto.sharePhotoMethod();
    }
}
