package it.polimi.ingsw.Model;

public class DevelopmentCard {
    private int[] ResourcesCost; //purple, blue, yellow, grey
    private int[] ResourcesProductionCost; //purple, blue, yellow, grey
    private int[] ResourcesProductionProfit; //purple, blue, yellow, grey, red
    private int Id;
    public enum colorCard {
        Green,
        Blue,
        Yellow,
        Purple
    }
    private colorCard Color; //colore della carta
    private int Level;//livello della carta
    private int VictoryPoints; // Victory Points

    public DevelopmentCard(int[] resourcesCost, int[] resourcesProductionCost, int[] resourcesProductionProfit, int id, colorCard color, int level, int victoryPoints) {
        this.ResourcesCost = resourcesCost;
        this.ResourcesProductionCost = resourcesProductionCost;
        this.ResourcesProductionProfit = resourcesProductionProfit;
        this.Id = id;
        this.Color = color;
        this.Level = level;
        this.VictoryPoints = victoryPoints;
    }

    public int[] getResourcesCost() {
        return ResourcesCost;
    }

    public int[] getResourcesProductionCost() {
        return ResourcesProductionCost;
    }

    public int[] getResourcesProductionProfit() {
        return ResourcesProductionProfit;
    }

    public int getId() {
        return Id;
    }

    public colorCard getColor() {
        return Color;
    }

    public int getLevel() {
        return Level;
    }

    public int getVictoryPoints() {
        return VictoryPoints;
    }
}