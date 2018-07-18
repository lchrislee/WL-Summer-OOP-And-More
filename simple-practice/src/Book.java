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

//==============================================================================================================
    public String getTitle() {
        return this.mTitle;
    }
    public String getAuthorName() {
        return this.mAuthorName;
    }
    public String getSeriesName() {
        return this.mSeriesName;
    }
    public int getPageLength() {
        return this.mPageLength;
    }
    public int getChapterCount() {
        return this.mChapterCount;
    }
    public boolean getReleased() {
        return this.mIsReleased;
    }
    public boolean getPartOfSeries() {
        return this.mIsPartOfSeries;
    }
//==============================================================================================================
    public void setTitle(String Title) {
        this.mTitle = Title;
    }
    public void setAuthorName(String AuthorName) {
        this.mAuthorName = AuthorName;
    }
    public void setSeriesName(String SeriesName) {
        this.mSeriesName = SeriesName;
    }
    public void setPageLength(int PageLength) {
        this.mPageLength = PageLength;
    }
    public void setChapterCount(int ChapterCount) {
        this.mChapterCount = ChapterCount;
    }
    public void setReleased(boolean Released) {
        this.mIsReleased = Released;
    }
    public void setIsPartOfSeries(boolean PartOfSeries) {
        this.mIsPartOfSeries = PartOfSeries;
    }
    //==========================================================================================================
    public void estimatedReadingTime(int rateOfReading) {
        int time;
        time = this.mPageLength/rateOfReading;
        System.out.println("It will take about " + time + "h to finish your book.");
    }
    public boolean equalsTo(String name) {
        if (this.mAuthorName.equals(name)){
            return true;
        } else {
            return false;
        }
    }

}
