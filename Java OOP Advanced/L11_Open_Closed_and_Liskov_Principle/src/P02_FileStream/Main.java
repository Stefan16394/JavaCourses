package P02_FileStream;

public class Main {
    public static void main(String[] args) {
        StreamProgressInfo infoFromWeb = new StreamProgressInfo(new Music("Stefko","MixTape",2,3));
        StreamProgressInfo infoFromWeb1=new StreamProgressInfo(new File("Stevica",4,1));
        int info1=infoFromWeb.calculateCurrentPercent();
        int info2=infoFromWeb1.calculateCurrentPercent();
        System.out.println(info1);
        System.out.println(info2);
    }
}
