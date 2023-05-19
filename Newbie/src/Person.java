public class Person {
    private int weight;
    private int floor;
    private int currentFloorPerson;

    public Person(int weight, int floor) {
        this.weight = weight;
        this.floor = floor;
    }
    public Person(int weight, int floor, int currentFloorPerson) {
        this.weight = weight;
        this.floor = floor;
        this.currentFloorPerson = currentFloorPerson;
    }

    public int getWeight() {
        return weight;
    }

    public int getFloor() {
        return floor;
    }

    public int getCurrentFloorPerson() {
        return currentFloorPerson;
    }
}
