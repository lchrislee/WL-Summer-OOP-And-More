public class Book
{
	private String  mTitle;
	private String  mAuthorName;
	private String  mSeriesName;
	private int     mPageLength;
	private int     mChapterCount;
	private boolean mIsReleased;
	private boolean mIsPartOfSeries;

	public Book(String mTitle, String mAuthorName, String mSeriesName, int mPageLength,
	            int mChapterCount, boolean mIsReleased, boolean mIsPartOfSeries )
	{
		this.mTitle = mTitle;
		this.mAuthorName = mAuthorName;
		this.mSeriesName = mSeriesName;
		this.mPageLength = mPageLength;
		this.mChapterCount = mChapterCount;
		this.mIsReleased = mIsReleased;
		this.mIsPartOfSeries = mIsPartOfSeries;
	}
}
