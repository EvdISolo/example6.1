public class Book {

    Author author;
    String bookTitle;
    int releaseYear;
    int pages;

    public Book(Author author, String title, int releaseYear, int pages) {
        this.author = author;
        this.releaseYear = releaseYear;
        this.bookTitle = title;
        this.pages = pages;
    }


    public boolean isBig() {
        int MIN_SIZE_FOR_BIG = 500;
        return pages > MIN_SIZE_FOR_BIG;
    }

    public boolean matches(String word) {
        return author.name.toLowerCase().contains(word.toLowerCase()) || bookTitle.toLowerCase().contains(word.toLowerCase()) || author.surname.toLowerCase().contains(word.toLowerCase());


    }

    public int estimatePrice() {
        final int Page_Price = 3;


        int price = (int) (Page_Price * pages * (Math.sqrt(author.rating)));

        return Math.max(250, price);


    }
}











