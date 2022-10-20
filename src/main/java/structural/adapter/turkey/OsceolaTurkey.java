package structural.adapter.turkey;

public class OsceolaTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Osceola Turkey Gobble");
    }

    @Override
    public void fly() {
        System.out.println("Osceola Turkey Fly");
    }
}
