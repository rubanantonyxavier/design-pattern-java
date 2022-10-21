package creational.singleton;

public class SingletonMainClass {

    public static void main(String[] args) {
        CandyMaker obj1 = CandyMaker.getInstance();
        System.out.println(obj1);
        obj1.fill();
        obj1.boil();
        obj1.drain();

        CandyMaker obj2 = CandyMaker.getInstance();
        System.out.println(obj2);
        obj2.fill();
        obj2.boil();
        obj2.drain();
    }
}

/*
Singleton Design Pattern:

Description
Implement the principles of Singleton pattern

Make the below class to be initialized only once.
Then make it Thread safe

public class CandyMaker {

    private boolean empty;
    private boolean boiled;

    //This code is only started when the boiler is empty
    public CandyMaker() {
        empty = true;
        boiled = false;
    }

    //to fill the boiler it must be empty, and once its full,
    //we set the empty and boiled flags
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the candyMaker with milk and choclate mix
        }
    }

    //To drain the boiler, it must be full(non-empty) and also boiled.
    //once it is drained, we set the empty back to true
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    //to boil the mixture the boiler has to be full and not already boiled.
    //once its boiled we set the boiled flag to true
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the content to boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}

------------------------------------------------------------
Acceptance criteria:
1. Solve the problem using pattern
2. Optimize code
3. No Sonar Violations
 */