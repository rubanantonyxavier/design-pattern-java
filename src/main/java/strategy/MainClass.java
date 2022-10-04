package strategy;

public class MainClass {
    public static void main(String[] args) {
        PhoneCameraApp cameraApp = new BasicCameraApp();
        cameraApp.takePhoto();
        cameraApp.editPhoto();
        cameraApp.savePhoto();
        cameraApp.sharePhoto(new SharePhotoByText());

        System.out.println("======================");

        cameraApp = new CameraPlusApp();
        cameraApp.takePhoto();
        cameraApp.editPhoto();
        cameraApp.savePhoto();
        cameraApp.sharePhoto(new SharePhotoByEmail());
    }
}

/*
Strategy Design Pattern:

Description
We are developing a PhoneCameraApp with four of the functionalities, take a photo, edit photo, save photo and share photo. And, we have two variants of the application BasicCameraApp, and CameraPlusApp.

Each cameraApp provides its own specialized editor, but the rest of the methods are same in both variants. We get a lot of code reuse, because the taking, saving and sharing are the same across many apps.

The share method in the application lets the user pick how they want to share the photo, and then uses that algorithm to share. Right now, the share method allows the user to share photos by text and by email.

There are new trends coming up in the industry to share the photos. You've been tasked to add another way of sharing photos to social media. But you are worried that every time there is a new way of sharing you need to modify your application. You'd love to separate that sharing code from the rest of the PhoneCameraApp.

-----------------------------------------------------------------------------------------------------------------

The task is to design the PhoneCameraApp in such a way that it is resistant to the changes of the industry. If there is a new way of sharing the photos, the user should be able to define "how to share" rather waiting for the new version of the application.
------------------------------------------------------------
Acceptance criteria:
1. Solve the problem using pattern
2. Optimize the code
3. No Sonar Violations
 */
