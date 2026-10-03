class Playlist1 {

    private String[] songs;
    private int songCount;

    // Constructor
    public Playlist(int maxSize) {
        songs = new String[maxSize];
        songCount = 0;
    }

    // Add song
    public void addSong(String song) {

        if (songCount < songs.length) {
            songs[songCount] = song;
            songCount++;
        } else {
            System.out.println("Playlist is full");
        }
    }

    // Return copy of songs
    public String[] getSongs() {

        String[] copy = new String[songCount];

        for (int i = 0; i < songCount; i++) {
            copy[i] = songs[i];
        }

        return copy;
    }

    // Read-only count
    public int getSongCount() {
        return songCount;
    }
}

public class Playlist {

    public static void main(String[] args) {

        Playlist p = new Playlist(10);

        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();

        copy[0] = "Hacked";

        String[] result = p.getSongs();

        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println("Song count: " + p.getSongCount());
    }
}