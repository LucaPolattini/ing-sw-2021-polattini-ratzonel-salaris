package it.polimi.ingsw.Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Method that represents a cell of the DevelopmentGrid and contains four DevelopmentCard

public class GridCell implements Serializable {
    private ArrayList<DevelopmentCard> cell = new ArrayList<>();


    private int i = 0;

    public GridCell(DevelopmentCard developmentCard1, DevelopmentCard developmentCard2, DevelopmentCard developmentCard3, DevelopmentCard developmentCard4) {
        cell.add(developmentCard1);
        cell.add(developmentCard2);
        cell.add(developmentCard3);
        cell.add(developmentCard4);
        Collections.shuffle(cell);
    }

    public DevelopmentCard RemoveTopCard() {
            DevelopmentCard temp = cell.get(cell.size() - 1);
            cell.remove(cell.size() - 1);
            return temp;

    }
    public DevelopmentCard getTopCard(){
        if (cell.size() > 0) {
            return cell.get(cell.size() - 1);
        } else {
            return null;
        }

    }

    /**
     * Removes the bottom card of the cell
     * @return true if  exist the card exists and false if not
     */
    public boolean RemoveFirstCard() {
        if (cell.size() > 0) {
            cell.remove(0);
            return true;
        } else {
            return false;
        }
    }

}