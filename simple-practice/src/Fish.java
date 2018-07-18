public class Fish
{
    public static final int MOUTH_TYPE_WIDE = 0;
    public static final int MOUTH_TYPE_SMALL = 1;
    public static final int SCALE_TYPE_ROUND = 0;
    public static final int SCALE_TYPE_POINTED = 1;
    public static final int SCALE_TYPE_SKIN = 2;

    private String mName;
    private double mWeight;
    private double mLength;
    private int mAge;
    private int mMouthType;
    private int mScaleType;
    private boolean mIsAlive;

    public Fish() {
        this.mName = "";
        this.mWeight = 0.0;
        this.mLength = 0.0;
        this.mAge = 0;
        this.mIsAlive = false;
        this.mMouthType = 0;
        this.mScaleType = 0;
    }
    public void TypeofMouth(int mMouthType) {
        this.mMouthType = mMouthType;
        if(this.mMouthType == MOUTH_TYPE_WIDE) {
            System.out.println("Mouth Type: Wide");
        } else {
            System.out.println("Mouth Type: Small");
        }
    }
    public void TypeofScale(int mScaleType) {
        this.mScaleType = mScaleType;
        if(this.mScaleType == SCALE_TYPE_ROUND) {
            System.out.println("Scale Type: Round");
        } else if (this.mScaleType == SCALE_TYPE_POINTED) {
            System.out.println("Scale Type: Pointed");
        } else {
            System.out.println("Scale Type: Skin");
        }
    }
    public Fish(String mName, double mWeight, double mLength, int mAge, boolean mIsAlive, int mMouthType,
                int mScaleType) {
        this.mName = mName;
        this.mWeight = mWeight;
        this.mLength = mLength;
        this.mAge = mAge;
        this.mIsAlive = mIsAlive;
        this.mMouthType = mMouthType;
        TypeofMouth(this.mMouthType);
        this.mScaleType = mScaleType;
        TypeofScale(this.mScaleType);
    }
    public String toString () {
        return "Name: " + mName + ", Weight: " + mWeight + "lbs., Length: " + mLength +
                "in., Age: " + mAge + ", Alive: " + mIsAlive;
    }
}