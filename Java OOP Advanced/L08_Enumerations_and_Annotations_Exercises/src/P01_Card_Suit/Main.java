package P01_Card_Suit;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("Card Suits:\n");
        for (Suits s:Suits.values())
        {
            sb.append(String.format("Ordinal value: %d; Name value: %s\n",s.ordinal(),s.name()));
        }
        System.out.print(sb.toString());
    }
}
