import java.util.ArrayList;

public class Song {

    private String title;
    private String artist;

    private ArrayList<String> oldListeners = new ArrayList<>();

    public Song(String title, String artist)
    {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle()
    {
        return title;
    }

    public String getArtist()
    {
        return artist;
    }

    public int howMany(ArrayList<String> listeners)
    {
        int newListeners = 0;
        for (String listener : listeners)
        {
            String caseInsensitive = listener.toLowerCase();
            if (!oldListeners.contains(caseInsensitive))
            {
                oldListeners.add(caseInsensitive);
                newListeners ++;
            }
        }
        return newListeners;
    }


}
