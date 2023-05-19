import java.util.ArrayList;

public interface LiftMetod {
    void liftDown (int floor);
    void liftUp (int floor);
    void LiftInit(ArrayList<Integer> array, ArrayList<Integer> array2);
    void moveLift (ArrayList<Integer> array2);
    void startingFloor (int floor);
}
