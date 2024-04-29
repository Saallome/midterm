package midterm.salome_kikilashvili_2.task3;

public class LibraryTester {
    public static void main(String[] args) {
        Song song1 = new Song();
        song1.setTitle("God's Menu");
        song1.setArtist("Stray Kids");

        Song song2 = new Song();
        song2.setTitle("1, 2, 3, 4, 5");
        song2.setArtist("Han");

        PlaylistManager playlistManager = new PlaylistManager();
        playlistManager.createPlaylist(song1);
        playlistManager.createPlaylist(song2);
        playlistManager.removeSongFromPlaylist(song1);
        playlistManager.printPlaylists();
    }
}
