package it.polimi.ingsw.Observer;

import it.polimi.ingsw.Model.*;
import it.polimi.ingsw.Model.LeaderCard.LeaderCard;
import it.polimi.ingsw.Model.Marble.MarketMarble;
import it.polimi.ingsw.Network.Messages.*;
import it.polimi.ingsw.Network.Server.VirtualView;
import org.codehaus.jackson.map.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class ModelObservable extends Observable<VirtualView> {
    private final List<VirtualView> observers = new ArrayList<>();
    public void addObserver(VirtualView observer){
        synchronized (observers) {
            observers.add(observer);
        }
    }
    public void notifyFourLeaderCards(int PlayerIndex, ArrayList<LeaderCard> leaderCards){
        ArrayList<String>leaderCardsString=new ArrayList<>();
        leaderCardsString.add(leaderCards.get(0).toString());
        leaderCardsString.add(leaderCards.get(1).toString());
        leaderCardsString.add(leaderCards.get(2).toString());
        leaderCardsString.add(leaderCards.get(3).toString());

        FourLeaderCardResponse fourLeaderCardResponse = new FourLeaderCardResponse(leaderCards);
        fourLeaderCardResponse.setPlayerIndex(PlayerIndex);
        System.out.println("le crea e le invia all'indice: "+fourLeaderCardResponse.getPlayerIndex());

        //fourLeaderCardResponse.setLeaderCards(leaderCards);
        for (VirtualView obs:observers
             ) {
            obs.updateFourLeaderCardsResponse(fourLeaderCardResponse);
        }
    }


    public void notifyLeaderCardsAfterFirstDiscard(int PlayerIndex, ArrayList<LeaderCard> leaderCards){
        TwoLeaderCardsResponse twoLeaderCardsResponse = new TwoLeaderCardsResponse();
        twoLeaderCardsResponse.setPlayerIndex(PlayerIndex);
        twoLeaderCardsResponse.setLeaderCards(leaderCards);
        //update
    }
    public void notifyNewWarehouse(int PlayerIndex, Warehouse newwarehouse){
        NewWarehouseResponse newWarehouseResponse = new NewWarehouseResponse();
        newWarehouseResponse.setPlayerIndex(PlayerIndex);
        newWarehouseResponse.setNewwarehouse(newwarehouse);
        //update
    }
    public void notifyNewWarehouseFaithtrack(int PlayerIndex, Warehouse newwarehouse, MultipleyerFaithTrack faithTrack){
        NewWarehouseFaithtrackResponse newWarehouseFaithtrackResponse = new NewWarehouseFaithtrackResponse();
        newWarehouseFaithtrackResponse.setPlayerIndex(PlayerIndex);
        newWarehouseFaithtrackResponse.setNewwarehouse(newwarehouse);
        newWarehouseFaithtrackResponse.setFaithTrack(faithTrack);
        //update
    }
    public void notifyMarketTrayActionResponse(int PlayerIndex, MarketTray marketTray, ArrayList<MarketMarble> returnedmarbles){
        MarketTrayActionResponse marketTrayActionResponse = new MarketTrayActionResponse();
        marketTrayActionResponse.setPlayerIndex(PlayerIndex);
        marketTrayActionResponse.setMarketTray(marketTray);
        marketTrayActionResponse.setReturnedmarbles(returnedmarbles);
        //update
    }
    public void notifyTextMessage(int PlayerIndex, String text){
        TextMessage textMessage = new TextMessage();
        textMessage.setPlayerIndex(PlayerIndex);
        textMessage.setText(text);

    }
    public void notifyCardBuyedResponse(int PlayerIndex, Warehouse newwarehouse, Strongbox newstrongbox, SlotsBoard slotsBoard, int col, int row){
        CardBuyedResponse cardBuyedResponse = new CardBuyedResponse();
        cardBuyedResponse.setPlayerIndex(PlayerIndex);
        cardBuyedResponse.setNewwarehouse(newwarehouse);
        cardBuyedResponse.setNewstrongbox(newstrongbox);
        cardBuyedResponse.setSlotsBoard(slotsBoard);
        cardBuyedResponse.setCol(col);
        cardBuyedResponse.setRow(row);
    }
    /*protected void notify(T message, int code){
        synchronized (observers) {
            for(Observer<T> observer : observers){
                observer.update(message,code);
            }
        }
    }*/

}
