package creational.builder;

public class BuilderMainClass {

    public static void main(String[] args) {
        Bicycle.Builder builder = new Bicycle.Builder().setCarrier().setDoubleSeat().setGear();
        Bicycle bicycle = builder.build();

        System.out.println("Is Gear Included? " + bicycle.isGear());
        System.out.println("Is Double Stand Included? " + bicycle.isDoubleStand());
        System.out.println("Is Double Seat Included? " + bicycle.isDoubleSeat());
        System.out.println("Is Carrier Included? " + bicycle.isCarrier());
    }
}

/*
Builder Design Pattern:

Description
While manufacturing a Bicycle, I provide flexibility to my customer to choose if they want gears, double stands, double seats, carrier etc. A customer can opt-in or opt-out for any of the choises I provide. However once the choice is made the choice can not be changed.

Write code to represent this model and build a bicycle , leaving the flexibility of selection of extra fittings to the customer.

------------------------------------------------------------
Acceptance criteria:
1. Solve the problem using pattern
2. Optimize the code
3. No Sonar Violations
 */
