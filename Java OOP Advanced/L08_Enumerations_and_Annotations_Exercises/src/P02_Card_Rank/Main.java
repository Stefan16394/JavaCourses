package P02_Card_Rank;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("Card Ranks:\n");
        for (Suits s:Suits.values())
        {
            sb.append(String.format("Ordinal value: %d; Name value: %s\n",s.ordinal(),s.name()));
        }
        System.out.print(sb.toString());
    }
}
