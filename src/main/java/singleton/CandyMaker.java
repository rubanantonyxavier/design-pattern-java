package singleton;

public class CandyMaker {

    private static CandyMaker candyMakerInstance = null;
    private static boolean empty = true;
    private static boolean boiled = false;

    //This code is only started when the boiler is empty
    private CandyMaker() {
    }

    public static synchronized CandyMaker getInstance() {
        if (candyMakerInstance == null) {
            if (isEmpty()) {
                candyMakerInstance = new CandyMaker();
            } else {
                throw new RuntimeException("Cannot create the Instance since the Boiler is not Empty");
            }
        }
        return candyMakerInstance;
    }

    public static boolean isEmpty() {
        return empty;
    }

    public static boolean isBoiled() {
        return boiled;
    }

    public static void setEmpty(boolean value) {
        empty = value;
    }

    public static void setBoiled(boolean value) {
        boiled = value;
    }

    //to fill the boiler it must be empty, and once its full,
    //we set the empty and boiled flags
    public void fill() {
        if (isEmpty()) {
            setEmpty(false);
            setBoiled(false);
            // fill the candyMaker with milk and choclate mix
        }
    }

    //To drain the boiler, it must be full(non-empty) and also boiled.
    //once it is drained, we set the empty back to true
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            setEmpty(true);
        }
    }

    //to boil the mixture the boiler has to be full and not already boiled.
    //once its boiled we set the boiled flag to true
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the content to boil
            setBoiled(true);
        }
    }
}