package P08_Card_Game;

import java.util.Comparator;

public class ComparatorS implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
          return Integer.compare(o2.calculatePower(),o1.calculatePower());
    }
}
