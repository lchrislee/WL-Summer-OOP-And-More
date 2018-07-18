public class Author
{
    private String  mName;
    private String  mBirthCountry;
    private String  mBirthCity;
    private int     mAge;
    private int     mBookCount;
    private boolean mIsWritingNextBook;


    public Author( String mName, String mBirthCountry, String mBirthCity, int mAge, int mBookCount,
                   boolean mIsWritingNextBook )
    {
        this.mName = mName;
        this.mBirthCountry = mBirthCountry;
        this.mBirthCity = mBirthCity;
        this.mAge = mAge;
        this.mBookCount = mBookCount;
        this.mIsWritingNextBook = mIsWritingNextBook;
    }
    public String getName() {
        return this.mName;
    }
    public String getBirthCountry() {
        return this.mBirthCountry;
    }
    public String getBirthCity() {
        return this.mBirthCity;
    }
    public int getAge() {
        return this.mAge;
    }
    public int BookCount() {
        return this.mBookCount;
    }
    public boolean IsWritingNextBook() {
        return this.mIsWritingNextBook;
    }
    //===========================================================================================================
    public void setName(String Name) {
        this.mName = Name;
    }
    public void setBirthCountry(String BirthCountry) {
        this.mBirthCountry = BirthCountry;
    }
    public void setBirthCity(String BirthCity) {
        this.mBirthCity = BirthCity;
    }
    public void setAge(int Age) {
        this.mAge = Age;
    }
    public void setBookCount(int BookCount) {
        this.mBookCount = BookCount;
    }
    public void setIsWritingNextBook(boolean NextBook) {
        this.mIsWritingNextBook = NextBook;
    }
}
