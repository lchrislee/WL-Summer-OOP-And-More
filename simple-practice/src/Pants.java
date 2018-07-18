public class Pants {
    String typeOfPants;
    String color;
    boolean mHasFrontZipper;
    double length;
    double width;

    public Pants() {
        this.typeOfPants = "";
        this.color = "";
        this.mHasFrontZipper = false;
        this.length = 0.0;
        this.width = 0.0;
    }
    public Pants(String typeOfPants, String color, boolean hasFrontZipper,
                 double length, double width) {
        this.typeOfPants = typeOfPants;
        this.color = color;
        this.mHasFrontZipper = hasFrontZipper;
        this.length = length;
        this.width = width;
    }
    public String getType() {
        return this.typeOfPants;
    }
    public String getColor () {
        return this.color;
    }
    public boolean gethasFrontZipper () {
        return this.mHasFrontZipper;
    }
    public double getLength() {
        return this.length;
    }
    public double getWidth() {
        return this.width;
    }
}
