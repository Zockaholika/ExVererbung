package song;

public class ConcreteSong implements Song {
    private String interpret;
    private Genre genre;

    public ConcreteSong(String interpret, Genre genre) {
        this.interpret = interpret;
        this.genre = genre;
    }

    @Override
    public String getInterpret() {
        return interpret;
    }

    @Override
    public Genre getGenre() {
        return genre;
    }
}