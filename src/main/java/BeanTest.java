import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        Album album1 = new Album();
        album1.setId(1);
        album1.setTitle("Album 1");
        album1.setArtistId(1);
        album1.setReleaseYear(2020);

        Author author1 = new Author();
        author1.setId(1);
        author1.setName("Author 1");

        Quote quote1 = new Quote();
        quote1.setId(1);
        quote1.setContent("Quote 1");
        quote1.setAuthor(author1);

        Quote quote2 = new Quote();
        quote2.setId(2);
        quote2.setContent("Quote 2");
        quote2.setAuthor(author1);

        List<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);

        for (Quote quote: quotes) {
            System.out.println("Content: " + quote.getContent());
            System.out.println("Author Name: " + quote.getAuthor().getName());
        }
    }
}