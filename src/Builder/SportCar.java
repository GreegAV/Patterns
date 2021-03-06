package Builder;

public class SportCar {
    private String name;
    private String color;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private SportCar(Builder builder) {
        this.name=builder.name;
        this.color=builder.color;
        this.maxSpeed =builder.maxSpeed;
    }

    static class Builder {
        private String name="Auto";
        private String color="None";
        private int maxSpeed=0;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public SportCar build(){
            return new SportCar(this);
        }


    }


}
