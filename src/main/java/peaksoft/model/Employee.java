package peaksoft.model;

public class Employee {
    private String name;

    private Vehicle vehicle;

    public Employee() {
    }


    public Vehicle getCar() {
        return vehicle;
    }


    public void setCar(Vehicle car) {
        this.vehicle = car;
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
    public void sing(){
        System.out.println(name+" is singing");
    }

    public void drive(){
        vehicle.startVehicle();
        System.out.println(name+" is driving the vehicle");
    }

}
