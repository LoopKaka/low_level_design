import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

class ParkingLot {
    private long id;
    private String name;
    private List<ParkingFloor> floors;
    private List<Gate> gates;

    // Methods
}

class ParkingFloor {
    private long id;
    private int floorNumber;
    private List<ParkingSpot> parkingSpots;

    // Methods
}

class ParkingSpot {
    private long id;
    private String spotNumber;
    private SpotType spotType;
    private SpotStatus status;
}

enum SpotType {
    BIKE,
    CAR,
    LARGE
}

enum SpotStatus {
    EMPTY,
    FILED
}

class Operator {
    private long id;
    private String name;
    private String phone;
    private String employeeId;

    // methods
}

class Vehicle {
    private long id;
    private String vehicleNumber;
    private VehicleType vehicleType;

    // methods
}

enum VehicleType {
    CAR, BIKE, SUV, OTHERS
}

class Gate {
    private long id;
    private int gateNumber;
    private GateType type;
    private GateStatus status;
    private Operator operator;

    // methods
}

enum GateType {
    ENTRY,
    EXIT
}

enum GateStatus {
    OPEN,
    CLOSED
}

class Ticket {
    private long id;
    private String ticketNumber;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Gate entryGate;
    private Operator entryOperator;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private TicketStatus status;

    // methods
}

enum TicketStatus {
    ACTIVE,
    COMPLETED,
    CANCELLED
}

class ParkingSession {
    private long id;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private Ticket ticket;

    // methods
}

class Bill {
    private long id;
    private Ticket ticket;
    private BigDecimal amount;
    private LocalDateTime generatedAt;
    private BillStatus status;
    private Operator generatedBy;
    private List<Payment> payments;

    // methods
}

enum BillStatus {
    PAID,
    NOT_PAID
}

class Payment {
    private long id;
    private BigDecimal amount;
    private PaymentMode mode;
    private PaymentStatus status;
    private String transactionId;
    private LocalDateTime paidAt;

    // methods
}

enum PaymentMode {
    CASH,
    CARD,
    UPI,
    ONLINE
}

enum PaymentStatus {
    INITIATED,
    SUCCESS,
    FAILED,
    REFUNDED
}

// Design Patterns
// Fee Calculation (Strategy Pattern)
interface FeeCalculationStrategy {
    BigDecimal calculateFee(
            VehicleType vehicleType,
            int parkingDuration);
}

class VehicleBased implements FeeCalculationStrategy {

    @Override
    public BigDecimal calculateFee(VehicleType vehicleType, int parkingDuration) {
        throw new UnsupportedOperationException("Unimplemented method 'calculateFee'");
    }

}

class TimeBased implements FeeCalculationStrategy {

    @Override
    public BigDecimal calculateFee(VehicleType vehicleType, int parkingDuration) {
        throw new UnsupportedOperationException("Unimplemented method 'calculateFee'");
    }

}

class VehicleAndTime implements FeeCalculationStrategy {

    @Override
    public BigDecimal calculateFee(VehicleType vehicleType, int parkingDuration) {
        throw new UnsupportedOperationException("Unimplemented method 'calculateFee'");
    }

}

// Payment (Adapter Pattern)
interface PaymentProcessor {

    Map<String, String> processPayment(Map<String, String> request);

    Map<String, String> refund(Map<String, String> request);
}

class OnlinePaymentAdapter implements PaymentProcessor {

    @Override
    public Map<String, String> processPayment(Map<String, String> request) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public Map<String, String> refund(Map<String, String> request) {
        throw new UnsupportedOperationException("Unimplemented method 'refund'");
    }
}

class OfflinePaymentAdapter implements PaymentProcessor {

    @Override
    public Map<String, String> processPayment(Map<String, String> request) {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public Map<String, String> refund(Map<String, String> request) {
        throw new UnsupportedOperationException("Unimplemented method 'refund'");
    }
}