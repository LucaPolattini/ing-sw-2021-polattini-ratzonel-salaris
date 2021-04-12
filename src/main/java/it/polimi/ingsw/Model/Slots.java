package it.polimi.ingsw.Model;
import java.util.ArrayList;

public class Slots {
    private ArrayList<DevelopmentCard> slot1; // possiamo crearlo di 3 posti questo array? // possiamo farlo direttamente con gli id?
    private ArrayList<DevelopmentCard> slot2;
    private ArrayList<DevelopmentCard> slot3;

    private int[] ColorDevCards = {0, 0, 0, 0}; //posizione 0: purple, 1=blue, 2=yellow, 3=green
    private boolean Respect = false;


    public ArrayList<DevelopmentCard> getSlot1() {
        return slot1;
    }

    public ArrayList<DevelopmentCard> getSlot2() {
        return slot2;
    }

    public ArrayList<DevelopmentCard> getSlot3() {
        return slot3;
    }


    public DevelopmentCard getCard1Top() {
        return (slot1.get(slot1.size() - 1));
    }

    public DevelopmentCard getCard2Top() {
        return (slot1.get(slot2.size() - 1));
    }

    public DevelopmentCard getCard3Top() {
        return (slot1.get(slot3.size() - 1));
    }


    public void setSlot1(DevelopmentCard card1) {
        if (card1.getLevel() >= getCard1Top().getLevel())
            slot1.add(card1);
    }

    public void setSlot2(DevelopmentCard card1) {
        if (card1.getLevel() >= getCard1Top().getLevel())
            slot1.add(card1);
    }

    public void setSlot3(DevelopmentCard card1) {
        if (card1.getLevel() >= getCard1Top().getLevel())
            slot1.add(card1);
    }

    public boolean getDevCardsLevel2(int colorCard) { //mi ritorna true se ho una carta di quel colore di livello 2 nei miei slot
        //1: purple, 2=blue, 3=yellow, 4=green
        if (slot1.size()>0){
            switch (colorCard) {

                case 1: if(slot1.get(1).getColor().equals(DevelopmentCard.colorCard.Purple)) {
                    Respect = true;
                }
                    break;
                case 2:
                    if(slot1.get(1).getColor().equals(DevelopmentCard.colorCard.Blue)) {
                        Respect = true;
                    }
                    break;
                case 3:
                    if(slot1.get(1).getColor().equals(DevelopmentCard.colorCard.Yellow)) {
                        Respect = true;
                    }
                    break;
                case 4:
                    if(slot1.get(1).getColor().equals(DevelopmentCard.colorCard.Green)) {
                        Respect = true;
                    }
                    break;
            }
        }
        else{
            if (slot2.size()>0){
                switch (colorCard) {

                    case 1: if(slot2.get(1).getColor().equals(DevelopmentCard.colorCard.Purple)) {
                        Respect = true;
                    }
                        break;
                    case 2:
                        if(slot2.get(1).getColor().equals(DevelopmentCard.colorCard.Blue)) {
                            Respect = true;
                        }
                        break;
                    case 3:
                        if(slot2.get(1).getColor().equals(DevelopmentCard.colorCard.Yellow)) {
                            Respect = true;
                        }
                        break;
                    case 4:
                        if(slot2.get(1).getColor().equals(DevelopmentCard.colorCard.Green)) {
                            Respect = true;
                        }
                        break;
                }
            }
            else{
                if (slot3.size()>0){
                    switch (colorCard) {

                        case 1: if(slot3.get(1).getColor().equals(DevelopmentCard.colorCard.Purple)) {
                            Respect = true;
                        }
                            break;
                        case 2:
                            if(slot3.get(1).getColor().equals(DevelopmentCard.colorCard.Blue)) {
                                Respect = true;
                            }
                            break;
                        case 3:
                            if(slot3.get(1).getColor().equals(DevelopmentCard.colorCard.Yellow)) {
                                Respect = true;
                            }
                            break;
                        case 4:
                            if(slot3.get(1).getColor().equals(DevelopmentCard.colorCard.Green)) {
                                Respect = true;
                            }
                            break;
                    }
                }
            }

        }
        return Respect;
    }

    public int[] getNumberOfDevCardsForColors() { //da controllare bene
        for (DevelopmentCard card : slot1) {
            switch (card.getColor()) {

                case Purple:
                    ColorDevCards[0]++;
                    break;
                case Blue:
                    ColorDevCards[1]++;
                    break;
                case Green:
                    ColorDevCards[2]++;
                    break;
                case Yellow:
                    ColorDevCards[3]++;
                    break;
            }
        }
        for (DevelopmentCard card : slot2) {
            switch (card.getColor()) {

                case Purple:
                    ColorDevCards[0]++;
                    break;
                case Blue:
                    ColorDevCards[1]++;
                    break;
                case Green:
                    ColorDevCards[2]++;
                    break;
                case Yellow:
                    ColorDevCards[3]++;
                    break;
            }
        }
        for (DevelopmentCard card : slot3) {
            switch (card.getColor()) {

                case Purple:
                    ColorDevCards[0]++;
                    break;
                case Blue:
                    ColorDevCards[1]++;
                    break;
                case Green:
                    ColorDevCards[2]++;
                    break;
                case Yellow:
                    ColorDevCards[3]++;
                    break;
            }
        }
    /*
        for(int counter=0; counter < slot1.size(); counter++)
       {
          if(slot1[counter].getColor() == DevelopmentCard.colorCard.Purple){
              ColorDevCards[0]+=1;
          }
          else{
              if(slot1[counter].getColor() == DevelopmentCard.colorCard.Blue){
                  ColorDevCards[1]+=1;
              }
              else{
                  if(slot1[counter].getColor() == DevelopmentCard.colorCard.Yellow){
                      ColorDevCards[2]+=1;
                  }
                  else{
                      if(slot1[counter].getColor() == DevelopmentCard.colorCard.Green){
                          ColorDevCards[3]+=1;
                      }
                  }
              }

          }
       }

        for(int c=0; c < slot2.length; c++)
        {
            if(slot2[c].getColor() == DevelopmentCard.colorCard.Purple){
                ColorDevCards[0]+=1;
            }
            else{
                if(slot2[c].getColor() == DevelopmentCard.colorCard.Blue){
                    ColorDevCards[1]+=1;
                }
                else{
                    if(slot2[c].getColor() == DevelopmentCard.colorCard.Yellow){
                        ColorDevCards[2]+=1;
                    }
                    else{
                        if(slot2[c].getColor() == DevelopmentCard.colorCard.Green){
                            ColorDevCards[3]+=1;
                        }
                    }
                }

            }
        }
        for(int counter=0; counter < slot3.length; counter++)
        {
            if(slot3[counter].getColor() == DevelopmentCard.colorCard.Purple){
                ColorDevCards[0]+=1;
            }
            else{
                if(slot3[counter].getColor() == DevelopmentCard.colorCard.Blue){
                    ColorDevCards[1]+=1;
                }
                else{
                    if(slot3[counter].getColor() == DevelopmentCard.colorCard.Yellow){
                        ColorDevCards[2]+=1;
                    }
                    else{
                        if(slot3[counter].getColor() == DevelopmentCard.colorCard.Green){
                            ColorDevCards[3]+=1;
                        }
                    }
                }

            }
        } */
        return ColorDevCards;
    }

   /* public void addCard(DevelopmentCard developmentCard){

    }
}

    */
}