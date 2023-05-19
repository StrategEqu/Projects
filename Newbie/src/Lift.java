import java.util.ArrayList;

public class Lift implements LiftMetod{
    private int weight;
    private String model;
    private int currentFloorLift = 1;

    public int getCurrentFloorLift() {
        return currentFloorLift;
    }

    public Lift(int weight) {
        this.weight = weight;
    }

    public Lift(String model, int weight) {
        this.weight = weight;
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void liftDown(int floor) {
        for (int i = currentFloorLift; ; i--) {
            if (i > floor) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else if (i == floor) {
                try {
                    Thread.sleep(1000);
                    System.out.println(floor + " этаж. Лифт приехал");
                    Thread.sleep(1500);
                    System.out.println("Двери открываются");
                    Thread.sleep(5000);
                    System.out.println("Двери закрываются");
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                this.currentFloorLift = floor;
                break;
            }
        }
    }

    @Override
    public void liftUp(int floor) {
        for (int i = currentFloorLift; i <= floor; i++) {
            if (i < floor) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else if (i == floor) {
                try {
                    Thread.sleep(1000);
                    System.out.println(floor + " этаж. Лифт приехал");
                    Thread.sleep(1500);
                    System.out.println("Двери открываются");
                    Thread.sleep(5000);
                    System.out.println("Двери закрываются");
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                this.currentFloorLift = floor;
                break;
            }
        }
    }

    @Override
    public void startingFloor(int floor) {
        for (int i = floor; ; i--) {
            if (i > 1) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else if (i == 1) {
                try {
                    Thread.sleep(1000);
                    System.out.println(i);
                    Thread.sleep(1000);
                    System.out.println("Лифт на первом этаже");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
        }
    }

    @Override
    public void moveLift(ArrayList<Integer> requiredFloor) {
        int floor;
        for (int checkFloor : requiredFloor) {
            floor = checkFloor;
            if (currentFloorLift < floor) {
                liftUp(floor);
            } else if (currentFloorLift > floor) {
                liftDown(floor);
            } else if (currentFloorLift == floor) {
                System.out.println("Лифт на " + floor + " этаже");
            }
        }
    }

    @Override
    public void LiftInit(ArrayList<Integer> array, ArrayList<Integer> requiredFloor) {
        int sum = 0;
        try {
            System.out.println("Проверка грузоподъемности...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int ar : array) {
            sum = sum + ar;
        }
        if (this.weight > sum) {
            System.out.println("Двери закрываются");
            try {
                Thread.sleep(1000);
//                Collections.sort(requiredFloor);
                moveLift(requiredFloor);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Лифт перегружен");
        }
        try {
            System.out.println("Проверяем наличие людей в кабине лифта...");
            Thread.sleep(2000);
            if (sum > 0 && currentFloorLift != 1) {
                System.out.println("В лифте нет людей, возвращаемся на 1 этаж");
                Thread.sleep(1000);
                startingFloor(currentFloorLift);
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}