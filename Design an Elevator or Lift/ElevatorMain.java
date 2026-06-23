import java.sql.Timestamp;
import java.util.List;
import java.util.TreeSet;

class Building {
    private int buildingId;
    private List<Floor> floors;
    private List<Elevator> elevators;
    private ElevatorController elevatorController;
}

class Floor {
    private int floorId;
    private FloorPanel floorPanel;
}

class FloorPanel {
    private int floorPanelId;

    public void requestUp() {
        // TODO
    }

    public void requestDown() {
        // TODO
    }
}

class ElevatorController {
    private List<Elevator> elevators;
    private ElevatorStrategy elevatorStrategy;

    public Elevator assignElevator(FloorRequest request) {
        // TODO
    }

    public void submitCabinRequest(CabinRequest request) {
        // TODO
    }
}

class Elevator {
    private int elevatorId;
    private ElevatorState elevatorState;
    private Direction direction;
    private long maxLoad;
    private long currentLoad;
    private int currentFloor;
    private TreeSet<Integer> moveUp;
    private TreeSet<Integer> moveDown;
    private ElevatorDoor elevatorDoor;
    private WeightSensor weightSensor;
    private List<ElevatorObserver> observers;

    public void addExternalStop(FloorRequest request) {
        // TODO
    }

    public void addInternalStop(CabinRequest request) {
        // TODO
    }

    public boolean boardPassenger(long weight) {
        // TODO
    }

    public void exitPassenger(long weight) {
        // TODO
    }

    public void move() {
        // TODO
    }

    public void addObserver(ElevatorObserver observer) {
        // TODO
    }

    public void notifyObservers() {
        // TODO
    }
}

enum DoorState {
    OPEN,
    CLOSED
}

enum Direction {
    UP,
    DOWN,
    IDLE
}

enum ElevatorState {
    IDLE,
    MOVING,
    MAINTENANCE
}

class ElevatorDoor {
    private DoorState doorState;

    public void openDoor() {
        // TODO
    }

    public boolean closeDoorWithSafetyCheck() {
        // TODO
    }
}

class WeightSensor {
    private long maxLoad;
    private long currentLoad;

    public long getCurrentLoad() {
        // TODO
    }

    public boolean isOverload(long additionalWeight) {
        // TODO
    }
}

class FloorRequest {
    private int requestId;
    private int currentFloor;
    private Direction direction;
    private Timestamp currentTime;
}

class CabinRequest {
    private int requestId;
    private int elevatorId;
    private int targetFloor;
    private Timestamp currentTime;
}

// Observer design pattern
interface ElevatorObserver {
    void onUpdate(Elevator elevator);
}

class DisplayMonitor implements ElevatorObserver {
    @Override
    public void onUpdate(Elevator elevator) {
        // TODO
    }
}

// Strategy design pattern
interface ElevatorStrategy {
    Elevator chooseElevator(FloorRequest request, List<Elevator> elevators);
}

class NearestElevator implements ElevatorStrategy {
    @Override
    public Elevator chooseElevator(FloorRequest request, List<Elevator> elevators) {
        // TODO
    }
}

class LoadAwareElevator implements ElevatorStrategy {
    @Override
    public Elevator chooseElevator(FloorRequest request, List<Elevator> elevators) {
        // TODO
    }
}

class DirectionAwareElevator implements ElevatorStrategy {
    @Override
    public Elevator chooseElevator(FloorRequest request, List<Elevator> elevators) {
        // TODO
    }
}

public class ElevatorMain {
    public static void main(String[] args) {
        // TODO
    }
}
