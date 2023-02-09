package song;

public class Main {
    public static void main(String[] args) {
        Genre rock = new Genre("Rock");
        Genre pop = new Genre("Pop");

        Song song1 = new ConcreteSong("AC/DC", rock);
        Song song2 = new ConcreteSong("Michael Jackson", pop);
        Song song3 = new ConcreteSong("Queen", rock);

        Song[] album1 = {song1, song2};
        Song[] album2 = {song2, song3};

        System.out.println("Album 1:");
        for (Song song : album1) {
            System.out.println("Interpret: " + song.getInterpret() + ", Genre: " + song.getGenre().getName());
        }

        System.out.println("\nAlbum 2:");
        for (Song song : album2) {
            System.out.println("Interpret: " + song.getInterpret() + ", Genre: " + song.getGenre().getName());
        }
    }
}