package P05_Online_Radio_Database;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<Song> playlist=new ArrayList<>();
        int secondsTotal=0;
        for (int i=0;i<n;i++) {

            String[] input = sc.nextLine().split(";");
                String artist = input[0];
                String songName = input[1];

                try {
                    int minutes = Integer.valueOf(input[2].split(":")[0]);
                    int seconds = Integer.valueOf(input[2].split(":")[1]);
                    try {
                        Song song = new Song(artist, songName, minutes, seconds);
                        playlist.add(song);
                        secondsTotal += seconds + minutes * 60;
                        System.out.println("Song added.");
                    } catch (IlegalSong e) {
                        System.out.println(e.getMessage());
                    }
                }
                catch (NumberFormatException e)
                {

                }


        }
        System.out.println("Songs added: "+playlist.size());

        int hours=secondsTotal/3600;
        secondsTotal=secondsTotal%3600;
        int minutes=secondsTotal/60;
        secondsTotal=secondsTotal%60;

        System.out.printf("Playlist length: %dh %dm %ds",hours,minutes,secondsTotal);

    }
}
