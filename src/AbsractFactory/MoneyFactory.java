package AbsractFactory;

import Money.Coin;
import Money.Paper;

public interface MoneyFactory{

    Coin createCoin();
    Paper createPaper();

}
