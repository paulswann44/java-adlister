import java.io.Serializable;

public class Album implements Serializable {
    private int id;
    private String title;
    private int artistId;
    private int releaseYear;

    public Album() {}

    public Album(int id, String title, int artistId, int releaseYear) {
        this.id = id;
        this.title = title;
        this.artistId = artistId;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}