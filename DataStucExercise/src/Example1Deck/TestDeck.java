/*
 * Created by SAFE_IT23
 */
package Example1Deck;

import java.util.List;

public class TestDeck {

    public static void main(String[] args) {
        Deck d = new Deck();
        d.randomOrder();
        for (int i = 0; i < 10; i++) {
            List<Card> cardOnhands = d.getCardsOnHand(2);
            int value = cardOnhands.get(0).getValue() + cardOnhands.get(1).getValue();
            String pok = (value % 10 == 8 || value % 10 == 9 ? " -> POK" : "");
            System.out.println("[" + i + "] " + cardOnhands + pok);
        }
        System.out.println("--------------------");
        System.out.println(d.getCards());
    }
}
