package it.polimi.ingsw.model;

import it.polimi.ingsw.Model.DevelopmentGrid;
import it.polimi.ingsw.Model.DevCardSlot;
import it.polimi.ingsw.Model.DevelopmentCard;
import it.polimi.ingsw.Model.Deck;
import it.polimi.ingsw.Model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DevelopmentGridTest {
    private DevelopmentGrid devGrid;
    private Deck deck;

    @BeforeEach
    void initialization(){
        deck = new Deck();
        devGrid = new DevelopmentGrid(deck);
    }

    @Test
    void getTopcardsTest() {
        assertSame(devGrid.get(0,0), devGrid.getTopcards().get(0));
        assertSame(devGrid.get(0,1), devGrid.getTopcards().get(1));
    }

    @Test
    void removeCardByColorTest() {
        assertTrue(devGrid.RemoveCardByColor(DevelopmentCard.colorCard.Green));
        assertTrue(devGrid.RemoveCardByColor(DevelopmentCard.colorCard.Green));
        assertTrue(devGrid.RemoveCardByColor(DevelopmentCard.colorCard.Green));
        assertTrue(devGrid.RemoveCardByColor(DevelopmentCard.colorCard.Green));
        assertTrue(devGrid.RemoveCardByColor(DevelopmentCard.colorCard.Blue));
        assertTrue(devGrid.RemoveCardByColor(DevelopmentCard.colorCard.Purple));
        assertTrue(devGrid.RemoveCardByColor(DevelopmentCard.colorCard.Purple));
        assertTrue(devGrid.RemoveCardByColor(DevelopmentCard.colorCard.Yellow));
    }
}