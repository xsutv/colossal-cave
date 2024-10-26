package subclass.items;

import interfaces.*;

public class Coins implements Interactive {
    private int coinAmount;
    private int coinSum;

    public void addCoin(int coin) {
        coinAmount += coin;
        coinSum += coin;
    }

    @Override
    public void interact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'interact'");
    }

}
