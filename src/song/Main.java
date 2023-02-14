package song;

public class Main {
    public static void main(String[] args) {
        Genre rock = new Genre("Rock");
        Genre pop = new Genre("Pop");

        Song song1 = new ConcreteSong("AC/DC", rock);
        Song song2 = new ConcreteSong("Michael Jackson", pop);
        Song song3 = new ConcreteSong("Queen", rock);

        Song song23 = new Song() {
            @Override
            public String getInterpret() {
                return "Micheal Jackson";
            }

            @Override
            public Genre getGenre() {
                return pop;
            }
        };
        System.out.println(song23);

    }
}