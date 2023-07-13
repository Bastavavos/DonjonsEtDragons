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
        return "Character{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", atkPoints=" + atkPoints +
                ", hpPoints=" + hpPoints +
                '}';
    }

    public Character(String name, String type) {
        this.name = name;
        this.type = type;

        if (type.equals("warrior")) {
            this.atkPoints = 10;
            this.hpPoints = 10;
            this.basicDefItem = new DefensiveStuff("Shield", 4);
            this.basicOffItem = new OffensiveStuff("Weapon", 6);

        } else if (type.equals("wizard")) {
            this.atkPoints = 15;
            this.hpPoints = 6;
            this.basicDefItem = new DefensiveStuff("Potion", 6);
            this.basicOffItem = new OffensiveStuff("Spell", 4);
        }
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











