package it.polimi.ingsw;

public class Game {

    private Player[] players;
    private MarketTray marketTray;
    private DevelopmentGrid developmentGrid;
    private MarkerStack markers ;

    public Game(Player[] players, DevelopmentCard[] developmentCards, Marker[] markers ) {
        this.players = players;
        this.developmentGrid = new DevelopmentGrid();
        this.marketTray = new MarketTray();
        this.markers = new MarkerStack(markers); // creare classe MarkerStack
    }
    private int NumberOfPlayers = players.length;

    public Player[] getPlayers() {
        return players;
    }

    public MarketTray getMarketTray() {
        return marketTray;
    }

    public DevelopmentGrid getDevelopmentGrid() {
        return developmentGrid;
    }

    public MarkerStack getMarkers() {
        return markers;
    }

    public int getNumberOfPlayers() {
        return NumberOfPlayers;
    } // numero di giocatori

}

 /*   public void startgame(){
        //Creazione di Development grid
        //Assegnazione di Leader Card a ogni player
        // settaggio di tutte le cose iniziali come creazione di ogni faithTrack/Warehouse ecc per ogni player


    }
    public void finishgame(){
        // Ricordarsi di fare i controlli nelle classi che posso far finire la partita esempio nella classed Faith Track controllare Red Position ecc
        // fai i calcoli per finire la partita



    }

}
  */
