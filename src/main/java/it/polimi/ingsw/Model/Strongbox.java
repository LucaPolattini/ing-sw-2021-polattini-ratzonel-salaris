package it.polimi.ingsw.Model;

public class Strongbox {
    private int shield;
    private int coin;
    private int servant;
    private int store;
    public Strongbox() {
        this.shield = 0;
        this.coin = 0;
        this.servant = 0;
        this.store = 0;
    }

    public int getShield() {
        return shield;
    }

    public int getCoin() {
        return coin;
    }

    public int getServant() {
        return servant;
    }

    public int getStore() {
        return store;
    }

    public void AddShield() {
        this.shield++;
    }

    public void AddCoin() {
        this.coin++;
    }

    public void AddServant() {
        this.servant++;
    }

    public void AddStore() {
        this.store++;
    }
    //Remove
}
