package AbsractFactory;

import Money.Coin;
import Money.Dollars.Cent;
import Money.Dollars.Dollar;
import Money.Paper;

public class DollarsFactory implements MoneyFactory {

    @Override
    public Coin createCoin() {
        return new Cent();
    }

    @Override
    public Paper createPaper() {
        return new Dollar();
    }
}
