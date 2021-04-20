package it.polimi.ingsw.Model;

import it.polimi.ingsw.Model.LeaderCard.*;
import it.polimi.ingsw.Model.Marble.ColoredMarble;


import java.util.ArrayList;

public class Deck {
    // Creazione DevelopmentCards
    private DevelopmentCard Green11 = new DevelopmentCard(new int[]{0, 2, 0, 0}, new int[]{0, 0, 1, 0}, new int[]{0, 0, 0, 0, 1}, 1, DevelopmentCard.colorCard.Green, 1, 1);
    private DevelopmentCard Green12 = new DevelopmentCard(new int[]{1, 1, 0, 1}, new int[]{0, 0, 0, 1}, new int[]{1, 0, 0, 0, 0}, 2, DevelopmentCard.colorCard.Green, 1, 2);
    private DevelopmentCard Green13 = new DevelopmentCard(new int[]{0, 3, 0, 0}, new int[]{2, 0, 0, 0}, new int[]{0, 1, 1, 1, 0}, 3, DevelopmentCard.colorCard.Green, 1, 3);
    private DevelopmentCard Green14 = new DevelopmentCard(new int[]{0, 2, 2, 0}, new int[]{1, 0, 0, 1}, new int[]{0, 0, 2, 0, 1}, 4, DevelopmentCard.colorCard.Green, 1, 4);
    private GridCell cell00 = new GridCell(Green11, Green12, Green13, Green14);



    private DevelopmentCard Yellow11 = new DevelopmentCard(new int[]{0, 0, 0, 2}, new int[]{1, 0, 0, 0}, new int[]{0, 0, 0, 0, 1}, 5, DevelopmentCard.colorCard.Yellow, 1, 1);
    private DevelopmentCard Yellow12 = new DevelopmentCard(new int[]{0, 1, 1, 1}, new int[]{0, 1, 0, 1}, new int[]{0, 0, 1, 0, 0}, 6, DevelopmentCard.colorCard.Yellow, 1, 2);
    private DevelopmentCard Yellow13 = new DevelopmentCard(new int[]{0, 0, 0, 3}, new int[]{0, 2, 0, 0}, new int[]{1, 0, 1, 1, 0}, 7, DevelopmentCard.colorCard.Yellow, 1, 3);
    private DevelopmentCard Yellow14 = new DevelopmentCard(new int[]{0, 2, 0, 2}, new int[]{1, 0, 1, 0}, new int[]{0, 2, 0, 0, 1}, 8, DevelopmentCard.colorCard.Yellow, 1, 4);
    private GridCell cell01 = new GridCell(Yellow11, Yellow12, Yellow13, Yellow14);


    private DevelopmentCard Purple11 = new DevelopmentCard(new int[]{2, 0, 0, 0}, new int[]{0, 0, 0, 1}, new int[]{0, 0, 0, 0, 1}, 9, DevelopmentCard.colorCard.Purple, 1, 1);
    private DevelopmentCard Purple12 = new DevelopmentCard(new int[]{1, 1, 1, 0}, new int[]{0, 0, 1, 0}, new int[]{0, 1, 0, 0, 0}, 10, DevelopmentCard.colorCard.Purple, 1, 2);
    private DevelopmentCard Purple13 = new DevelopmentCard(new int[]{3, 0, 0, 0}, new int[]{0, 0, 2, 0}, new int[]{1, 1, 0, 1, 0}, 11, DevelopmentCard.colorCard.Purple, 1, 3);
    private DevelopmentCard Purple14 = new DevelopmentCard(new int[]{2, 0, 0, 2}, new int[]{0, 1, 1, 0}, new int[]{0, 0, 0, 2, 1}, 12, DevelopmentCard.colorCard.Purple, 1, 4);
    private GridCell cell02 = new GridCell(Purple11, Purple12, Purple13, Purple14);

    private DevelopmentCard Blue11 = new DevelopmentCard(new int[]{0, 0, 2, 0}, new int[]{0, 1, 0, 0}, new int[]{0, 0, 0, 0, 1}, 13, DevelopmentCard.colorCard.Blue, 1, 1);
    private DevelopmentCard Blue12 = new DevelopmentCard(new int[]{1, 0, 1, 1}, new int[]{1, 0, 0, 0}, new int[]{0, 0, 0, 1, 0}, 14, DevelopmentCard.colorCard.Blue, 1, 2);
    private DevelopmentCard Blue13 = new DevelopmentCard(new int[]{0, 0, 3, 0}, new int[]{0, 0, 0, 2}, new int[]{1, 1, 1, 0, 0}, 15, DevelopmentCard.colorCard.Blue, 1, 3);
    private DevelopmentCard Blue14 = new DevelopmentCard(new int[]{2, 0, 2, 0}, new int[]{0, 1, 0, 1}, new int[]{2, 0, 0, 0, 1}, 16, DevelopmentCard.colorCard.Blue, 1, 4);
    private GridCell cell03 = new GridCell(Blue11, Blue12, Blue13, Blue14);


    private DevelopmentCard Green21 = new DevelopmentCard(new int[]{0, 4, 0, 0}, new int[]{0, 0, 0, 1}, new int[]{0, 0, 0, 0, 2}, 17, DevelopmentCard.colorCard.Green, 2, 5);
    private DevelopmentCard Green22 = new DevelopmentCard(new int[]{2, 3, 0, 0}, new int[]{1, 1, 0, 0}, new int[]{0, 0, 0, 3, 0}, 18, DevelopmentCard.colorCard.Green, 2, 6);
    private DevelopmentCard Green23 = new DevelopmentCard(new int[]{0, 5, 0, 0}, new int[]{0, 0, 2, 0}, new int[]{0, 0, 0, 2, 2}, 19, DevelopmentCard.colorCard.Green, 2, 7);
    private DevelopmentCard Green24 = new DevelopmentCard(new int[]{0, 3, 3, 0}, new int[]{0, 0, 1, 0}, new int[]{0, 2, 0, 0, 1}, 20, DevelopmentCard.colorCard.Green, 2, 8);
    private GridCell cell10 = new GridCell(Green21, Green22, Green23, Green24);

    private DevelopmentCard Yellow21 = new DevelopmentCard(new int[]{0, 0, 0, 4}, new int[]{0, 1, 0, 0}, new int[]{0, 0, 0, 0, 2}, 21, DevelopmentCard.colorCard.Yellow, 2, 5);
    private DevelopmentCard Yellow22 = new DevelopmentCard(new int[]{0, 2, 0, 3}, new int[]{0, 1, 0, 1}, new int[]{0, 0, 3, 0, 0}, 22, DevelopmentCard.colorCard.Yellow, 2, 6);
    private DevelopmentCard Yellow23 = new DevelopmentCard(new int[]{0, 0, 0, 5}, new int[]{0, 2, 0, 0}, new int[]{2, 0, 0, 0, 2}, 23, DevelopmentCard.colorCard.Yellow, 2, 7);
    private DevelopmentCard Yellow24 = new DevelopmentCard(new int[]{3, 0, 0, 3}, new int[]{0, 1, 0, 0}, new int[]{0, 0, 2, 0, 1}, 24, DevelopmentCard.colorCard.Yellow, 2, 8);
    private GridCell cell11 = new GridCell(Yellow21, Yellow22, Yellow23, Yellow24);

    private DevelopmentCard Purple21 = new DevelopmentCard(new int[]{4, 0, 0, 0}, new int[]{0, 0, 1, 0}, new int[]{0, 0, 0, 0, 2}, 25, DevelopmentCard.colorCard.Purple, 2, 5);
    private DevelopmentCard Purple22 = new DevelopmentCard(new int[]{3, 0, 2, 0}, new int[]{1, 0, 1, 0}, new int[]{3, 0, 0, 0, 0}, 26, DevelopmentCard.colorCard.Purple, 2, 6);
    private DevelopmentCard Purple23 = new DevelopmentCard(new int[]{5, 0, 0, 0}, new int[]{0, 0, 0, 2}, new int[]{0, 0, 2, 0, 2}, 27, DevelopmentCard.colorCard.Purple, 2, 7);
    private DevelopmentCard Purple24 = new DevelopmentCard(new int[]{3, 3, 0, 0}, new int[]{0, 0, 0, 1}, new int[]{2, 0, 0, 0, 1}, 28, DevelopmentCard.colorCard.Purple, 2, 8);
    private GridCell cell12 = new GridCell(Purple21, Purple22, Purple23, Purple24);

    private DevelopmentCard Blue21 = new DevelopmentCard(new int[]{0, 0, 4, 0}, new int[]{1, 0, 0, 0}, new int[]{0, 0, 0, 0, 2}, 29, DevelopmentCard.colorCard.Blue, 2, 5);
    private DevelopmentCard Blue22 = new DevelopmentCard(new int[]{0, 0, 3, 2}, new int[]{0, 0, 1, 1}, new int[]{3, 0, 0, 0, 0}, 30, DevelopmentCard.colorCard.Blue, 2, 6);
    private DevelopmentCard Blue23 = new DevelopmentCard(new int[]{0, 0, 5, 0}, new int[]{2, 0, 0, 0}, new int[]{0, 2, 0, 0, 2}, 31, DevelopmentCard.colorCard.Blue, 2, 7);
    private DevelopmentCard Blue24 = new DevelopmentCard(new int[]{0, 0, 3, 3}, new int[]{1, 0, 0, 0}, new int[]{0, 0, 0, 2, 1}, 32, DevelopmentCard.colorCard.Blue, 2, 8);
    private GridCell cell13 = new GridCell(Blue21, Blue22, Blue23, Blue24);

    private DevelopmentCard Green31 = new DevelopmentCard(new int[]{0, 6, 0, 0}, new int[]{2, 0, 0, 0}, new int[]{0, 0, 0, 3, 2}, 33, DevelopmentCard.colorCard.Green, 3, 9);
    private DevelopmentCard Green32 = new DevelopmentCard(new int[]{2, 5, 0, 0}, new int[]{1, 0, 1, 0}, new int[]{0, 2, 0, 2, 1}, 34, DevelopmentCard.colorCard.Green, 3, 10);
    private DevelopmentCard Green33 = new DevelopmentCard(new int[]{0, 7, 0, 0}, new int[]{1, 0, 0, 0}, new int[]{0, 0, 1, 0, 3}, 35, DevelopmentCard.colorCard.Green, 3, 11);
    private DevelopmentCard Green34 = new DevelopmentCard(new int[]{0, 4, 4, 0}, new int[]{0, 0, 0, 1}, new int[]{0, 1, 3, 0, 0}, 36, DevelopmentCard.colorCard.Green, 3, 12);
    private GridCell cell20 = new GridCell(Green31, Green32, Green33, Green34);

    private DevelopmentCard Yellow31 = new DevelopmentCard(new int[]{0, 0, 0, 6}, new int[]{0, 2, 0, 0}, new int[]{3, 0, 0, 0, 2}, 37, DevelopmentCard.colorCard.Yellow, 3, 9);
    private DevelopmentCard Yellow32 = new DevelopmentCard(new int[]{2, 0, 0, 5}, new int[]{1, 0, 0, 1}, new int[]{0, 2, 2, 0, 1}, 38, DevelopmentCard.colorCard.Yellow, 3, 10);
    private DevelopmentCard Yellow33 = new DevelopmentCard(new int[]{0, 0, 0, 7}, new int[]{0, 1, 0, 0}, new int[]{1, 0, 0, 0, 3}, 39, DevelopmentCard.colorCard.Yellow, 3, 11);
    private DevelopmentCard Yellow34 = new DevelopmentCard(new int[]{4, 0, 0, 4}, new int[]{0, 1, 0, 0}, new int[]{3, 0, 0, 1, 0}, 40, DevelopmentCard.colorCard.Yellow, 3, 12);
    private GridCell cell21 = new GridCell(Yellow31, Yellow32, Yellow33, Yellow34);

    private DevelopmentCard Purple31 = new DevelopmentCard(new int[]{6, 0, 0, 0}, new int[]{0, 0, 0, 2}, new int[]{0, 0, 3, 0, 2}, 41, DevelopmentCard.colorCard.Purple, 3, 9);
    private DevelopmentCard Purple32 = new DevelopmentCard(new int[]{5, 0, 2, 0}, new int[]{0, 1, 0, 1}, new int[]{2, 0, 2, 0, 1}, 42, DevelopmentCard.colorCard.Purple, 3, 10);
    private DevelopmentCard Purple33 = new DevelopmentCard(new int[]{7, 0, 0, 0}, new int[]{0, 0, 1, 0}, new int[]{0, 0, 0, 1, 3}, 43, DevelopmentCard.colorCard.Purple, 3, 11);
    private DevelopmentCard Purple34 = new DevelopmentCard(new int[]{4, 4, 0, 0}, new int[]{0, 0, 1, 0}, new int[]{1, 0, 0, 3, 0}, 44, DevelopmentCard.colorCard.Purple, 3, 12);
    private GridCell cell22 = new GridCell(Purple31, Purple32, Purple33, Purple34);

    private DevelopmentCard Blue31 = new DevelopmentCard(new int[]{0, 0, 6, 0}, new int[]{2, 0, 0, 0}, new int[]{0, 3, 0, 0, 2}, 45, DevelopmentCard.colorCard.Blue, 3, 9);
    private DevelopmentCard Blue32 = new DevelopmentCard(new int[]{0, 0, 5, 2}, new int[]{0, 1, 1, 0}, new int[]{2, 0, 0, 2, 1}, 46, DevelopmentCard.colorCard.Blue, 3, 10);
    private DevelopmentCard Blue33 = new DevelopmentCard(new int[]{0, 0, 7, 0}, new int[]{0, 0, 0, 1}, new int[]{0, 1, 0, 0, 3}, 47, DevelopmentCard.colorCard.Blue, 3, 11);
    private DevelopmentCard Blue34 = new DevelopmentCard(new int[]{0, 0, 4, 4}, new int[]{1, 0, 0, 0}, new int[]{0, 3, 1, 0, 0}, 48, DevelopmentCard.colorCard.Blue, 3, 12);
    private GridCell cell23 = new GridCell(Blue31, Blue32, Blue33, Blue34);

    //Array con tutte le DevelopmentCards posizionate in base al loro ID (la carta con ID = 1 è posta in posizione ArrayDevelopmentCards[0]).
    //Ciò è fatto per sapere che quando l'ID=0 non è ancora stato modificato e non rappresenta nessuna carta.
    private DevelopmentCard[] ArrDevelopmentCards = {Green11, Green12, Green13, Green14, Yellow11, Yellow12, Yellow13, Yellow14, Purple11, Purple12, Purple13, Purple14, Blue11, Blue12, Blue13, Blue14, Green21, Green22, Green23, Green24, Yellow21, Yellow22, Yellow23, Yellow24, Purple21, Purple22, Purple23, Purple24, Blue21, Blue22, Blue23, Blue24, Green31, Green32, Green33, Green34, Yellow31, Yellow32, Yellow33, Yellow34, Purple31, Purple32, Purple33, Purple34, Blue31, Blue32, Blue33, Blue34};

    //inserisco l'id e mi ritorna la carta
    private DevelopmentCard SelectDevFromId(int IdDev) {
        return ArrDevelopmentCards[IdDev - 1];
    }

    //Creazione LeaderCards
    private LeaderCard ExtraRsc1 = new LeaderCard1( 1, 5, DevelopmentCard.colorCard.Blue, DevelopmentCard.colorCard.Yellow, ColoredMarble.ColorMarble.PURPLE); //pallina bianca in viola
    private LeaderCard ExtraRsc2 = new LeaderCard1( 2, 5, DevelopmentCard.colorCard.Purple, DevelopmentCard.colorCard.Green, ColoredMarble.ColorMarble.BLUE); //pallina bianca in blu
    private LeaderCard ExtraRsc3 = new LeaderCard1( 3, 5, DevelopmentCard.colorCard.Green , DevelopmentCard.colorCard.Purple, ColoredMarble.ColorMarble.YELLOW); //pallina bianca in giallo
    private LeaderCard ExtraRsc4 = new LeaderCard1( 4, 5, DevelopmentCard.colorCard.Yellow, DevelopmentCard.colorCard.Blue, ColoredMarble.ColorMarble.GREY); //pallina bianca in grigio

    private LeaderCard ReduceCost1 = new LeaderCard2(5, 2, DevelopmentCard.colorCard.Yellow, DevelopmentCard.colorCard.Green, ColoredMarble.ColorMarble.PURPLE); //meno un viola nel costo
    private LeaderCard ReduceCost2 = new LeaderCard2( 6, 2, DevelopmentCard.colorCard.Purple, DevelopmentCard.colorCard.Blue, ColoredMarble.ColorMarble.BLUE); //meno un blu nel costo
    private LeaderCard ReduceCost3 = new LeaderCard2( 7, 2, DevelopmentCard.colorCard.Yellow, DevelopmentCard.colorCard.Purple, ColoredMarble.ColorMarble.YELLOW); //meno un giallo nel costo
    private LeaderCard ReduceCost4 = new LeaderCard2( 8, 2, DevelopmentCard.colorCard.Green, DevelopmentCard.colorCard.Blue, ColoredMarble.ColorMarble.GREY); //meno un grigio nel costo

    private LeaderCard ExtraWarehouse1 = new LeaderCard3( 9, 3, ColoredMarble.ColorMarble.GREY, ColoredMarble.ColorMarble.PURPLE); //più 2 spazi viola nel warehouse
    private LeaderCard ExtraWarehouse2 = new LeaderCard3( 10, 3, ColoredMarble.ColorMarble.PURPLE, ColoredMarble.ColorMarble.PURPLE); //più 2 spazi blu nel warehouse
    private LeaderCard ExtraWarehouse3 = new LeaderCard3( 11, 3, ColoredMarble.ColorMarble.BLUE , ColoredMarble.ColorMarble.YELLOW); //più 2 spazi gialli nel warehouse
    private LeaderCard ExtraWarehouse4 = new LeaderCard3( 12, 3, ColoredMarble.ColorMarble.YELLOW, ColoredMarble.ColorMarble.GREY); //più 2 spazi grigi nel warehouse

    private LeaderCard ConvertRsc1 = new LeaderCard4( 13, 4, DevelopmentCard.colorCard.Blue, ColoredMarble.ColorMarble.PURPLE); //converte un viola in una risorsa a scelta e 1 punto fede
    private LeaderCard ConvertRsc2 = new LeaderCard4( 14, 4, DevelopmentCard.colorCard.Yellow, ColoredMarble.ColorMarble.BLUE); //converte un blu in una risorsa a scelta e 1 punto fede
    private LeaderCard ConvertRsc3 = new LeaderCard4( 15, 4, DevelopmentCard.colorCard.Green, ColoredMarble.ColorMarble.YELLOW); //converte un giallo in una risorsa a scelta e 1 punto fede
    private LeaderCard ConvertRsc4 = new LeaderCard4( 16, 4, DevelopmentCard.colorCard.Purple, ColoredMarble.ColorMarble.GREY); //converte un grigio in una risorsa a scelta e 1 punto fede

    //Array con tutte le LeaderCards posizionate in base al loro ID (la carta con ID = 1 è posta in posizione ArrayLeaderCards[0]).
    private LeaderCard[] ArrLeaderCards = {ExtraRsc1, ExtraRsc2, ExtraRsc3, ExtraRsc4, ReduceCost1, ReduceCost2, ReduceCost3, ReduceCost4, ExtraWarehouse1, ExtraWarehouse2, ExtraWarehouse3, ExtraWarehouse4, ConvertRsc1, ConvertRsc2, ConvertRsc3, ConvertRsc4};

    //inserisco l'id e mi ritorna la carta
    private LeaderCard SelectLeadFromId(int IdLead) {
        return ArrLeaderCards[IdLead - 1];
    }

    public GridCell getCell00() {
        return cell00;
    }

    public GridCell getCell01() {
        return cell01;
    }

    public GridCell getCell02() {
        return cell02;
    }

    public GridCell getCell03() {
        return cell03;
    }

    public GridCell getCell10() {
        return cell10;
    }

    public GridCell getCell11() {
        return cell11;
    }

    public GridCell getCell12() {
        return cell12;
    }

    public GridCell getCell13() {
        return cell13;
    }

    public GridCell getCell20() {
        return cell20;
    }

    public GridCell getCell21() {
        return cell21;
    }

    public GridCell getCell22() {
        return cell22;
    }

    public GridCell getCell23() {
        return cell23;
    }
}