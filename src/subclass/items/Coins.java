package subclass.items;

import interfaces.*;
import superclass.*;

public class Coins implements Interactive {
    private int coinAmount;
    private int coinSum;

    public void addCoin(int coin) {
        coinAmount += coin;
        coinSum += coin;
    }

    @Override
    public void interact(Player player) {

    }

    @Override
    public String getName() {
        return "";
    }

}
