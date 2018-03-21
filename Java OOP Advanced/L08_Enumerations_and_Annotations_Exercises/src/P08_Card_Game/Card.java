package P08_Card_Game;

public class Card implements Comparable<Card>{
    private RankPowers rankPowers;
    private SuitPowers suitPowers;

    public Card(String rankPowers, String suitPowers) {
        this.rankPowers = RankPowers.valueOf(rankPowers);
        this.suitPowers = SuitPowers.valueOf(suitPowers);
    }

    public int calculatePower()
    {
        return rankPowers.getPower()+suitPowers.getPower();
    }

    @Override
    public String toString() {
        return String.format("%s of %s",rankPowers,suitPowers) ;
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(o.calculatePower(),this.calculatePower());
    }


}
