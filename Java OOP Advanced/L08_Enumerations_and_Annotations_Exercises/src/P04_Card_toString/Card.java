package P04_Card_toString;

public class Card {
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

}
