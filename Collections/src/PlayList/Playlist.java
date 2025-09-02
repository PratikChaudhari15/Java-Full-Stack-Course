package PlayList;

public class Playlist {

    private String name;
    private int cap;
    private int count;

    public Playlist(String name,int cap)
    {
        super();
        this.name = name;
        Songs = new Songs[cap];
    }
    private Songs[]Songs;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getCap() {
        return cap;
    }
    public void showPlaylist()
    {
        if (count>0)
        {
            for (int i = 0;i<count;i++)
            {
                System.out.println(Songs[i]+", ");
            }
            System.out.println();
        }
        else {
            System.out.println("Ohh There Is No SOng In Your Playlist");
        }
    }
    public boolean addSongs(String name,String singer,String duration,String writer,String movie)
    {
        if (count<Songs.length)
        {
            int i;
            Songs toBeAdded = new Songs(name,singer,duration,writer,movie);
            for (i=0;i<count;i++)
            {
                if (Songs[i].equals(toBeAdded))
                {
                    break;
                }
            }
            if (i==count)
            {
                Songs[count]= toBeAdded;
                count++;
                return true;
            }
            else {
                System.out.println("Song Alredy Present");
            }
        }
        else {
            System.out.println("Playlist is full");
        }
        return false;
    }
    // Method to remove a song by its name and movie
    public boolean removeSong(String name, String movie) {
        if (count == 0) {
            System.out.println("No songs in the playlist");
            return false;
        }

        boolean found = false;

        for (int i = 0; i < count; i++) {
            // check if this song matches
            if (Songs[i].getName().equalsIgnoreCase(name) &&
                    Songs[i].getMovie().equalsIgnoreCase(movie)) {

                found = true;

                // shift elements left
                for (int j = i; j < count - 1; j++) {
                    Songs[j] = Songs[j + 1];
                }

                Songs[count - 1] = null; // remove last duplicate
                count--;

                System.out.println(name + " removed from playlist!");
                break;
            }
        }

        if (!found) {
            System.out.println(name + " not found in playlist!");
        }

        return found;
    }

    public void shuffle
}
