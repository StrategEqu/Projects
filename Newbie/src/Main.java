import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Lift lift = new Lift("Жемчужина", 340);
        Person person = new Person(87, 5, 1);
        Person person2 = new Person(58, 9, 1);
        Person person3 = new Person(112, 3, 1);
        Person person4 = new Person(25, 7, 1);
        ArrayList<Integer> totalWeight = new ArrayList<>();
        ArrayList<Integer> requiredFloor = new ArrayList<>();
        totalWeight.add(person.getWeight());
        totalWeight.add(person2.getWeight());
        totalWeight.add(person3.getWeight());
        totalWeight.add(person4.getWeight());
        requiredFloor.add(person.getFloor());
        requiredFloor.add(person2.getFloor());
        requiredFloor.add(person3.getFloor());
        requiredFloor.add(person4.getFloor());
        try {
            lift.LiftInit(totalWeight, requiredFloor);
        } catch (Exception e) {
            System.out.println("Лифт сломан, придётся идти пешком");
        }
    }
}