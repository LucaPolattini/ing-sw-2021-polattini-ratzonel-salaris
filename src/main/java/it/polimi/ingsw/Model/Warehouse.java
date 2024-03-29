package it.polimi.ingsw.Model;

import it.polimi.ingsw.Model.Marble.MarketMarble;

import java.io.Serializable;
import java.util.ArrayList;
// This class represent the Warehouse, every player has one Warehouse
public class Warehouse implements Serializable {

    private ArrayList<WarehouseRow> rows = new ArrayList<>();
    private int ExtraWarehouseRows = 0;

    public Warehouse() {
        this.rows.add(new WarehouseRow(1));
        this.rows.add(new WarehouseRow(2));
        this.rows.add(new WarehouseRow(3));
    } // The Warehouse is created whit 3 Warehouse row: one with space 1, one with space 2, one with space 3

    public WarehouseRow getRow(int rowNumber) {
        return rows.get(rowNumber);
    } // returns the WarehouseRow selected

    /**
     * The method adds a Marble into the WarehouseRow selected.
     * @param coloredMarble color of the marble
     * @param rowNumber row of the warehouse
     * @return true if it can be added, false if not
     */
    public boolean addToRow(MarketMarble coloredMarble, int rowNumber) {
        if (rowNumber < 0 || rowNumber > 4){
            return false;
        }
        else if (rowNumber == 3){
            if (ExtraWarehouseRows == 0)
                return false;
            else if (!(coloredMarble.getColorMarble().equals(getRow(rowNumber).getColor())))
                return false;
        }
        else if (rowNumber == 4){
            if (ExtraWarehouseRows < 2)
                return false;
            else if (!(coloredMarble.getColorMarble().equals(getRow(rowNumber).getColor())))
                return false;
        }
        else if(rowNumber == 0){
            if((rows.get(1).getColor() == coloredMarble.getColorMarble())||(rows.get(2).getColor() == coloredMarble.getColorMarble())){
                return false;
            }
        }
        else if (rowNumber == 1){
            if((rows.get(0).getColor() == coloredMarble.getColorMarble())||(rows.get(2).getColor() == coloredMarble.getColorMarble())){
                return false;
            }
        }
        else if (rowNumber == 2){
            if((rows.get(0).getColor() == coloredMarble.getColorMarble())||(rows.get(1).getColor() == coloredMarble.getColorMarble())){
                return false;
            }
        }
        return rows.get(rowNumber).addMarble(coloredMarble);
    }


    /**
     * @param rowNumber1 index of the row
     * @param rowNumber2 index of the row
     * @return true if it can be done, false if not
     */
    public boolean MoveResource(int rowNumber1, int rowNumber2){
        if (rowNumber1 == 3 || rowNumber1 == 4 || rowNumber2 == 3 ||rowNumber2 == 4 ){
            if (!(rows.get(rowNumber1).getColor().equals(rows.get(rowNumber2).getColor()))){
                return false;
            }
        }
        if(rows.get(rowNumber1).getMarbles().size()<=rows.get(rowNumber2).getSpace() && rows.get(rowNumber2).getMarbles().size()<=rows.get(rowNumber1).getSpace()){
            WarehouseRow temp = new WarehouseRow(rows.get(rowNumber2).getSpace());
            temp.setMarbles(rows.get(rowNumber2).getMarbles());
            temp.setColor(rows.get(rowNumber2).getColor());
            rows.get(rowNumber2).ChangeMarbles(rows.get(rowNumber1).getMarbles(),rows.get(rowNumber1).getColor());
            rows.get(rowNumber1).ChangeMarbles(temp.getMarbles(), temp.getColor());

            return true;
        }
        return false;
    }

    /**
     * @param color color of the marble
     * @return the number of Resources in the Warehouse that have the color selected
     */
    public int getNumberOfResource(MarketMarble.ColorMarble color){
        int i=0;
        for (WarehouseRow a: rows) {
            if (a.getMarbles().size() > 0) {
                if (a.getColor().equals(color))
                    i += a.getMarbles().size();
            }
        }
        return i;
    }

    /**
     * @param row row of the warehouse
     * @param NumberOfMarbles number of marbles
     * @param colorMarble color of the marble
     * @return true if the row selected has at least the number of marbles selected of the color selected, else if not
     */
    public boolean CheckRow(int row, int NumberOfMarbles, MarketMarble.ColorMarble colorMarble){
        if (row < 0 || row > 4){
            return false;
        }
          else if (row == 3){
              if (ExtraWarehouseRows == 0)
                  return false;
              else if (!(colorMarble.equals(getRow(row).getColor())))
                  return false;
          }
            else if (row == 4){
                if (ExtraWarehouseRows < 2)
                    return false;
            }

        if (!colorMarble.equals(getRow(row).getColor())){
            return false;
        }
        else return getRow(row).getNumberOfMarbles() >= NumberOfMarbles;
    }

    /**
     * @return the number of resources in the warehouse
     */
    public int getNumberOfTotalResourcesInWarehouse(){
        int Resources = 0;
        Resources = getNumberOfResource(MarketMarble.ColorMarble.BLUE) + getNumberOfResource(MarketMarble.ColorMarble.GREY) + getNumberOfResource(MarketMarble.ColorMarble.PURPLE) + getNumberOfResource(MarketMarble.ColorMarble.YELLOW);
        return Resources;
    }

    public ArrayList<WarehouseRow> getRows() {
        return rows;
    }

    public void setExtraWarehouseRows() {
        ExtraWarehouseRows += 1;
    }
}









