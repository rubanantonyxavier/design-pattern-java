package creational.builder;

public class Bicycle {

    private final boolean gear;
    private final boolean doubleStand;
    private final boolean doubleSeat;
    private final boolean carrier;

    public boolean isGear() {
        return gear;
    }

    public boolean isDoubleStand() {
        return doubleStand;
    }

    public boolean isDoubleSeat() {
        return doubleSeat;
    }

    public boolean isCarrier() {
        return carrier;
    }

    private Bicycle(Builder builder) {
        this.gear = builder.gear;
        this.doubleStand = builder.doubleStand;
        this.doubleSeat = builder.doubleSeat;
        this.carrier = builder.carrier;
    }

    public static class Builder {
        private boolean gear = false;
        private boolean doubleStand = false;
        private boolean doubleSeat = false;
        private boolean carrier = false;

        public Builder setGear() {
            this.gear = true;
            return this;
        }

        public Builder setDoubleStand() {
            this.doubleStand = true;
            return this;
        }

        public Builder setDoubleSeat() {
            this.doubleSeat = true;
            return this;
        }

        public Builder setCarrier() {
            this.carrier = true;
            return this;
        }

        public Bicycle build() {
            return new Bicycle(this);
        }
    }
}