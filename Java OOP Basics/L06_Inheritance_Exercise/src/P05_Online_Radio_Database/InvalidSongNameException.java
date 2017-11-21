package P05_Online_Radio_Database;

public class InvalidSongNameException extends IlegalSong {

    public InvalidSongNameException(String s) {
        super(s);
    }
}
