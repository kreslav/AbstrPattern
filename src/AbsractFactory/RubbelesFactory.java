package AbsractFactory;

import Money.Coin;
import Money.Paper;
import Money.Rubble.Kopeika;
import Money.Rubble.Rubble;

public class RubbelesFactory implements MoneyFactory {


    @Override
    public Coin createCoin() {
        return new Kopeika();
    }

    @Override
    public Paper createPaper() {
        return new Rubble();
    }
}
