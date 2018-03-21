package P05_Online_Radio_Database;

public class Song {
    private String artist;
    private String songName;
    private int songMinutes;
    private int songSeconds;

    public Song(String artist, String songName, int songMinutes, int songSeconds) {
        setArtist(artist);
        setSongName(songName);
        setSongMinutes(songMinutes);
        setSongSeconds(songSeconds);
    }

    public void setArtist(String artist) {
        if (artist.length()<3 || artist.length()>20)
        {
            throw new InvalidArtistNameException("Artist name should be between 3 and 20 symbols.");
        }
        this.artist = artist;
    }

    public void setSongName(String songName) {
        if (songName.length()<3 ||songName.length()>30)
        {
            throw new InvalidSongNameException("Song name should be between 3 and 30 symbols.");
        }
        this.songName = songName;
    }

    public void setSongMinutes(int songMinutes) {
        if (songMinutes<0 || songMinutes>14)
        {
            throw new IllegalArgumentException("Song minutes should be between 0 and 14.");
        }
        this.songMinutes = songMinutes;
    }

    public void setSongSeconds(int songSeconds) {
        if (songSeconds<0 || songSeconds>59)
        {
            throw new IllegalArgumentException("Song seconds should be between 0 and 59.");
        }
        this.songSeconds = songSeconds;
    }
}
