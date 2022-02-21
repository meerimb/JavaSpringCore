package peaksoft.model;

public class Car implements Vehicle{
    private String mark;
    private int wheel;

    public Car() {
    }

    public Car(String mark, int wheel) {
        this.mark = mark;
        this.wheel = wheel;
    }

    public void drive() {
        System.out.println(mark+  " is starting");
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", mark='" + mark + '\'' +
                ", wheel=" + wheel +
                '}';
    }

    @Override
    public void startVehicle() {
        System.out.println(mark+ " is starting...");

    }
}
