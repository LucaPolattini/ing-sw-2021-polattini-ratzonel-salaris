package it.polimi.ingsw.Model.Markers;

import it.polimi.ingsw.Model.Player;
import it.polimi.ingsw.Model.SinglePlayerGame;

public class PlusTwoBlackMarker extends Marker {
    @Override
    public void MarkerEffect(Player player, SinglePlayerGame singlePlayerGame) {
        player.getFaithTrack().setBlackPosition(2);
    }
}