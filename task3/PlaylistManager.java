package midterm.salome_kikilashvili_2.task3;

import java.util.ArrayList;
import java.util.List;

public class PlaylistManager {
    private List<Song> playlists = new ArrayList<>();

    public void createPlaylist(Song song) {
        playlists.add(song);
    }

    public boolean removeSongFromPlaylist(Song song) {
        boolean removed = false;
        for (int i = 0; i < playlists.size(); i++) {
            Song s = playlists.get(i);
            if (s.getTitle().equals(song.getTitle()) && s.getArtist().equals(song.getArtist())) {
                playlists.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }

    public void printPlaylists() {
        if (playlists.isEmpty()) {
            System.out.println("No playlists available.");
        } else {
            for (Song s : playlists) {
                System.out.println(s.getArtist() + ", " + s.getTitle());
                System.out.println();
            }
        }
    }
}