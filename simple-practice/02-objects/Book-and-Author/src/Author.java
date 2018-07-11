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
}
