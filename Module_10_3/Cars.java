package Module_10_3;

public class Cars {
    double maxSpeed;
    int passengers;
    String type;

    public Cars(double maxSpeed, int passengers, String type) {
        this.maxSpeed = maxSpeed;
        this.passengers = passengers;
        this.type = type;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
