package subclass.items;

import interfaces.*;
import superclass.*;

public class Coins implements Interactive {
    private int coinAmount;
    private int coinSum;

    public Coins(int coins) {
        this.coinSum += coins;
    }

    public void addCoin(int coin) {
        coinAmount += coin;
        coinSum += coin;
    }

    public void removeCoin(int coin) {
        coinAmount -= coin;
        coinSum -= coin;
    }

    @Override
    public void interact(Player player) {
        System.out.print("You have " + coinAmount + " coins with a sum of " + coinSum);
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getID() {
        return "coin-ID-ertyuik1m234";
    }

    @Override
    public String toString() {
        return "Coins [coinAmount=" + coinAmount + ", coinSum=" + coinSum + "]";
    }

    

}
