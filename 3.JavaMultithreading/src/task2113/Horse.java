package task2113;

/**
 * Created by Юлия on 04.04.2017.
 */
public class Horse {

    String name;
    double speed;
    double distance;

    public void move() {
        distance += speed * Math.random();

    }

    public void print() {
        int distanceForComa = (int) distance;
        for (int i = 0; i < distanceForComa ; i++) {
            System.out.print(".");
        }
        System.out.print(name);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }


}
