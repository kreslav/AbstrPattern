package AbsractFactory;

import Money.Euro.Euro;
import Money.Euro.EuroCent;
import Money.Paper;
import Money.Coin;

public class EuroFactory implements MoneyFactory {
    @Override
    public Coin createCoin() {
        return new EuroCent();
    }

    @Override
    public Paper createPaper() {
        return new Euro();
    }
}
