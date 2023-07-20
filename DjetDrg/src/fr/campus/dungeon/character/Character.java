package fr.campus.dungeon.character;
import fr.campus.dungeon.stuff.DefensiveStuff;
import fr.campus.dungeon.stuff.OffensiveStuff;

public class Character {
    private String name;
    private String type = "";
    private int atkPoints;
    private int hpPoints;
    private DefensiveStuff basicDefItem;
    private OffensiveStuff basicOffItem;


    @Override
    public String toString() {
        return  "name = " + name +
                ", stats {atk = " + atkPoints +
                ", hp = " + hpPoints + "}" +
                ", weapon = {" + basicOffItem + '\'' +
                ", defense = {" + basicDefItem + '\'';
    }

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAtkPoints() {
        return atkPoints;
    }

    public void setAtkPoints(int atkPoints) {
        this.atkPoints = atkPoints;
    }

    public int getHpPoints() {
        return hpPoints;
    }

    public void setHpPoints(int hpPoints) {
        this.hpPoints = hpPoints;
    }

    public DefensiveStuff getBasicDefItem() {
        return basicDefItem;
    }

    public void setBasicDefItem(DefensiveStuff basicDefItem) {
        this.basicDefItem = basicDefItem;
    }

    public OffensiveStuff getBasicOffItem() {
        return basicOffItem;
    }

    public void setBasicOffItem(OffensiveStuff basicOffItem) {
        this.basicOffItem = basicOffItem;
    }
}











