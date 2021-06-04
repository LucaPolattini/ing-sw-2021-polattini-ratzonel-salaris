package it.polimi.ingsw.Network.Client.CModel;

import it.polimi.ingsw.Model.*;
import it.polimi.ingsw.Model.LeaderCard.*;
import it.polimi.ingsw.Model.Marble.MarketMarble;

import java.util.ArrayList;

public class PlayerBoard {
    private WarehouseClient warehosueClient = new WarehouseClient();
    private String nickname;
    private ArrayList<Integer> strongBox = new ArrayList<>(); // [0] = SHIELD/BLUE, [1] = STONE/GREY, [2] = SERVANT/PURPLE, [3] = COIN/YELLOW
    //Aggiungere contatori del colore e livello delle leaderCards
    private ArrayList<DevelopmentCard> devSlotClient = new ArrayList<>();
    private ArrayList<Production> productions = new ArrayList<>();
    private FaithTrackClient faithTrackClient = new FaithTrackClient();
    private ArrayList<LeaderCard> leaderCards = new ArrayList<>();
    private int totalCards = 0;
    private int lvl1 = 0;
    private int lvl2 = 0;
    private int lvl3 = 0;
    private int greenc = 0;
    private int yellowc = 0;
    private int bluec = 0;
    private int purplec = 0;

    public PlayerBoard() {
        strongBox.add(0);
        strongBox.add(0);
        strongBox.add(0);
        strongBox.add(0);

    }

    public WarehouseClient getWarehosueClient() {
        return warehosueClient;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setWarehosueClient(WarehouseClient warehosueClient) {
        this.warehosueClient = warehosueClient;
    }

    public ArrayList<Integer> getStrongBox() {
        return strongBox;
    }

    public void setStrongBox(ArrayList<Integer> strongBox) {
        this.strongBox = strongBox;
    }

    public ArrayList<DevelopmentCard> getDevSlotClient() {
        return devSlotClient;
    }

    public void setDevSlotClient(ArrayList<DevelopmentCard> devSlotClient) {
        this.devSlotClient = devSlotClient;
    }


    public ArrayList<Production> getProductions() {
        return productions;
    }

    public void setProductions(ArrayList<Production> productions) {
        this.productions = productions;
    }

    public FaithTrackClient getFaithTrackClient() {
        return faithTrackClient;
    }

    public void setFaithTrackClient(FaithTrackClient faithTrackClient) {
        this.faithTrackClient = faithTrackClient;
    }

    public ArrayList<LeaderCard> getLeaderCards() {
        return leaderCards;
    }

    public void setLeaderCards(ArrayList<LeaderCard> leaderCards) {
        this.leaderCards = leaderCards;
    }

    public void PrintProductionsAvailable(){
        int index = 0;
        for (Production p : productions){
            if (index == 0){
                System.out.println(0 + ":\n");
                System.out.println("You pay 2 marbles of your choice:\n");
                System.out.println("You get 1 marble of your choice\n");
            }
            if (!p.equals(productions.get(0))){
                System.out.println("Production #" + index + ":");
                System.out.println("You Pay:");
                for (CostOfCard c : productions.get(index).getProductionProfit()){
                    System.out.println(c.toString() + "\n");
                }
                System.out.println("You get:");
                for (CostOfCard c : productions.get(index).getProductionProfit()){
                    System.out.println(c.toString() +"\n");
                }
            }
            index++;
        }
    }

    public ArrayList<Integer> IndexesProductionAvailable(){
        ArrayList<Integer> prodAvail = new ArrayList<>();
        int index = 0;
        prodAvail.add(0);
        for (Production p : productions){
            if (!p.equals(productions.get(0))){
                prodAvail.add(index);
            }
            index++;
        }
        return prodAvail;
    }

    public int getTotalCards() {
        return totalCards;
    }

    public void setTotalCards() {
        this.totalCards += 1;
    }

    public int getLvl1() {
        return lvl1;
    }

    public void setLvl1() {
        this.lvl1 += 1;
    }

    public int getLvl2() {
        return lvl2;
    }

    public void setLvl2() {
        this.lvl2 += 1;
    }

    public int getLvl3() {
        return lvl3;
    }

    public void setLvl3() {
        this.lvl3 += 1;
    }

    public int getGreenc() {
        return greenc;
    }

    public void setGreenc() {
        this.greenc += 1;
    }

    public int getYellowc() {
        return yellowc;
    }

    public void setYellowc() {
        this.yellowc += 1;
    }

    public int getBluec() {
        return bluec;
    }

    public void setBluec() {
        this.bluec += 1;
    }

    public int getPurplec() {
        return purplec;
    }

    public void setPurplec() {
        this.purplec += 1;
    }

    public void PrintWarehouse(){
        System.out.println(" ----WAREHOUSE----\n");
        int indexRow = 0;
        for (WarehouseRow r : warehosueClient.getWarehouseRows()
        ) {
            if(r.getMarbles()!=null && r.getMarbles().size()!=0)
                System.out.println("ROW " + indexRow + ":" +r.getMarbles().size() + r.getMarbles().get(0).getColorMarble());
            else
                System.out.println("ROW " + indexRow + "; empty");
            indexRow++;
        }
    }
    public void PrintStrongbox(){
        System.out.println(" ----STRONGBOX----\n" +
                "SHIELDS: " + strongBox.get(0) + "\n" +
                "STONES: " + strongBox.get(1) + "\n" +
                "SERVANTS: " + strongBox.get(2) + "\n" +
                "COINS: " + strongBox.get(3) + "\n\n");
    }
    public void PrintFaithTrack(){
        System.out.println("-------FAITHTRACK--------");
        for (int a = 0; a < 24; a++) {
            if (faithTrackClient.getRedPosition() == a)
                System.out.print("[ X ]");
            else
                System.out.print("[ ]");
        }
        System.out.println("\n POPE FAVORS 1:" + faithTrackClient.getPopeFavors().get(0));
        System.out.println("\n POPE FAVORS 2:" + faithTrackClient.getPopeFavors().get(1));
        System.out.println("\n POPE FAVORS 1:" + faithTrackClient.getPopeFavors().get(2) + "\n\n");
    }
    public void PrintDevCard(){
        int nSlot = 0;
        System.out.println("---------DEVELOPMENT CARDS--------");
        for (DevelopmentCard d : devSlotClient
        ) {
            System.out.println("Slot ["+ nSlot+ "]");
            d.printCard();
            System.out.println("\n\n");
        }
        if (devSlotClient.size() == 0){
            System.out.println("Empty Slots Board\n");
        }
        System.out.println("#TotalDevCards: " + totalCards +"\n#Lvl1 cards: " + lvl1 + " #Lvl2 cards: " + lvl2 + " #Lvl3 cards: " + lvl3 + "\n#Green cards: " + greenc + " #Blue cards: " + bluec + " #Yellow cards: " + yellowc + " #Purple cards: " + purplec +"\n");
    }
    public void PrintLeaderCards(boolean all){
        System.out.println("----- LEADERCARDS -----");
        for (LeaderCard l : leaderCards
        ) {
            if (!all && !l.isActivate()) {

            } else {
                switch (l.getType()) {
                    case 1:
                        LeaderCard1 l1 = (LeaderCard1) l;
                        System.out.println("POTERE: Trasforma palline bianche in palline : " + l1.getNewColorMarble() + "\n" +
                                "NECESSITA: 1 devCard colore " + l1.getColorCostOne() + ", 2 devCard colore " + l1.getColorCostTwo() + "\n" +
                                "VICTORY POINTS: " + l1.getVictoryPoints());
                        break;
                    case 2:
                        LeaderCard2 l2 = (LeaderCard2) l;
                        System.out.println("POTERE: Riduce costo delle DevCard di una risorsa di tipo: " + l2.getDiscount() + "\n" +
                                "NECESSITA: 1 devCard colore " + l2.getFirstcolorCost() + ", 1 devCard colore " + l2.getSecondcolorCost() + "\n" +
                                "VICTORY POINTS: " + l2.getVictoryPoints());
                        break;
                    case 3:
                        LeaderCard3 l3 = (LeaderCard3) l;
                        System.out.println("POTERE: Aggiunge un extra warehouse (di 2 spazi) di colore " + l3.getColorOfExtraWarehouse() + "\n" +
                                "NECESSITA: 5 risorse di colore " + l3.getColorCost() + "\n" +
                                "VICTORY POINTS: " + l3.getVictoryPoints());
                        break;
                    case 4:
                        LeaderCard4 l4 = (LeaderCard4) l;
                        System.out.println("POTERE: Aggiunge produzione da" + l4.getProduction().getProductionCost().get(0).getCostNumber() + l4.getProduction().getProductionCost().get(0).getCostColor() + " ad un punto fede e una risorsa a tua scelta\n " +
                                "NECESSITA: DevCard di livello 2 di colore" + l4.getCostCardLevelTwo() + "\n" +
                                "VICTORY POINTS: " + l4.getVictoryPoints());
                        break;
                }
                System.out.println("------------------");

            }
        }
    }

}
