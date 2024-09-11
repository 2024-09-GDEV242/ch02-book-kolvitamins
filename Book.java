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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    // Add the methods here ...
    /**
     * Get author method returns the name of the author
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * Get title method returns the title of the book
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Print author method prints the name of the author
     */
    public void printAuthor()
    {
        System.out.println("Author name: " + author);
    }
    
    /**
     * Print title method prints the book title
     */
    public void printTitle()
    {
        System.out.println("Book title: " + title);
    }
}
