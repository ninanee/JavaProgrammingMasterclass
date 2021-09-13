import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        Song currentSong = findSong(title);
        if(currentSong == null){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumberOfSong, LinkedList<Song> playList) {
        int index = trackNumberOfSong - 1;
        if((index >= 0) && (index <= this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumberOfSong);
        return false;
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playList) {

        Song currentSong = findSong(titleOfSong);
        if(currentSong != null) {
           playList.add(currentSong);
           return true;
        }
        System.out.println("The song " + titleOfSong + " is not in this album");
        return false;
    }


    private Song findSong(String title) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

}
