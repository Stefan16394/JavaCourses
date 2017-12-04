package P05_Card_compareTo;

public class Card implements Comparable<Card>{
    private RankPowers rankPowers;
    private SuitPowers suitPowers;

    public Card(String rankPowers, String suitPowers) {
        this.rankPowers = RankPowers.valueOf(rankPowers);
        this.suitPowers = SuitPowers.valueOf(suitPowers);
    }

    private int calculatePower()
    {
        return rankPowers.getPower()+suitPowers.getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",rankPowers,suitPowers,
                calculatePower()) ;
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(o.calculatePower(),this.calculatePower());
    }
}
