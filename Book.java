/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle,
    int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        courseText = bookCourseText;
    }

    // Add the methods here ...
    /**
     * Get author method returns the name of the author
     * For exercise 2.83
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Get title method returns the title of the book
     * For exercise 2.83
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Print author method prints the name of the author
     * For exercise 2.84
     */
    public void printAuthor()
    {
        System.out.println("Author name: " + author);
    }
    
    /**
     * Print title method prints the book title
     * For exercise 2.84
     */
    public void printTitle()
    {
        System.out.println("Book title: " + title);
    }
    
    /**
     * Get pages method returns number of pages
     * For exercise 2.85
     */
    public int getPages()
    {
        return pages;
    }
    
        /**
     * Set ref number assigns a value to the refNumber field
     * For exercise 2.88 & 2.90
     */
    public void setRefNumber(String ref)
    {
        if(refNumber.length() > 3)
        {
            refNumber = ref;
        }
        else
        {
            System.out.println("Reference number must be at least 3 characters");
        }
    }
    
    /**
     * Get ref number returns the value assigned to the
     * refNumber field
     * For exercise 2.88
     */
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * Print details method prints details of the book:
     * title, author, and pages
     * For exercise 2.87, 2.89, & 2.91
     */
    public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: "
        + author + ", Pages: " + pages);
        
        if (refNumber.length() > 0)
        {
            System.out.println("Reference number: " + refNumber);
        }
        else
        {
                System.out.println("ZZZ");
        }
        
        System.out.println(title + " has been borrowed " +
        borrowed + " times");
    }
    
    /**
     * the borrowed mutator tracks the amount of times the book is borrowed
     * For exercise 2.91
     */
    
    public void borrowed()
    {
        borrowed = borrowed + 1;
    }
    
    /**
     * The get borrowed accessor returns the borrowed field
     * For exercise 2.91
     */
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * The is course text method returns the courseText field
     * For exercise 2.92
     */
    
    public boolean isCourseText()
    {
        return courseText;
    }
}
