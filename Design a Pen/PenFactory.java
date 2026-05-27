abstract class Pen {
    private String brandName;
    private int price;
    private PenType penType;
    private ClosingType closingType;

    public void write(String text) {
        System.out.println("Writing: " + text);
    }
}

enum PenType {
    BALL,
    FOUNTAIN,
    GEL
}

enum ClosingType {
    TICK,
    CAP
}

class BallPen extends Pen {
    private Refill refill;

    @Override
    public void write(String text) {
        System.out.println("Writing: " + text);
    }
}

class GelPen extends Pen {
    private Refill refill;

    @Override
    public void write(String text) {
        System.out.println("Writing: " + text);
    }
}

class FountainPen extends Pen {
    private Ink ink;
    private Nib nib;

    @Override
    public void write(String text) {
        System.out.println("Writing: " + text);
    }
}

class Refill {
    private String brandName;
    private String color;
    private int price;
}

class Ink {
    private String brandName;
    private String color;
    private int price;
}

class Nib {
    private String brandName;
    private int radius;
}

public class PenFactory {

    public static Pen createPen(PenType input) {

        if (input == PenType.BALL) {
            return new BallPen();

        } else if (input == PenType.GEL) {
            return new GelPen();

        } else if (input == PenType.FOUNTAIN) {
            return new FountainPen();
        }

        throw new IllegalArgumentException("Invalid Pen Type");
    }
}