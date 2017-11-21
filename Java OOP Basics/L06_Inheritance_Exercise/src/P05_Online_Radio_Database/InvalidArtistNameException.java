package P05_Online_Radio_Database;

public class InvalidArtistNameException extends IlegalSong {

    public InvalidArtistNameException(String s) {
        super(s);
    }
}
