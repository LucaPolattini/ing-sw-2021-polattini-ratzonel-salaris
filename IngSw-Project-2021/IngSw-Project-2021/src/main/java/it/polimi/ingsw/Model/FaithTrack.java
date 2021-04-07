package it.polimi.ingsw.Model;

public class FaithTrack {
    private boolean Multiplayer;
    private int RedPosition = 0;
    private int BlackPosition = 0;
    private int points = 0;
    public enum popeFavorState{
        Activate,
        Unabled,
        Deleted
    }
    private popeFavorState popeFavor1 = popeFavorState.Unabled;
    private popeFavorState popeFavor2 = popeFavorState.Unabled;
    private popeFavorState popeFavor3 = popeFavorState.Unabled;



    public int getRedPosition() {
        return RedPosition;
    } // get posizione pedina rossa

    public int getBlackPosition() {
        return BlackPosition;
    } // get posizione pedina nera

    public int getPoints() {
        return points;
    } // get punti totalizzati

    public boolean isMultiplayer() {
        return Multiplayer;
    }

    public popeFavorState getPopeFavor1() {
        return popeFavor1;
    }

    public popeFavorState getPopeFavor2() {
        return popeFavor2;
    }

    public popeFavorState getPopeFavor3() {
        return popeFavor3;
    }
}



    /*public void PopeSpaceAction(){
        // cosa speciale
    } // fai l'azione speciale

}
 public void moveForwardRed(){
        RedPosition++;
        //if RedPosition = casella in cui c'è qualcosa di speciale, fai la cosa speciale chiamando pope space action
        // if RedPosition = Numero, Points = points + valore casella
    }
    public void moveForwardBlack(){
        BlackPosition++;
        //if BlackPosition = casella in cui c'è qualcosa di speciale, fai la cosa speciale

    }
     */