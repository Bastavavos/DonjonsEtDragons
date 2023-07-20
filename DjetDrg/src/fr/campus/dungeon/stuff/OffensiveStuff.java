package fr.campus.dungeon.stuff;

public class OffensiveStuff {
    String name;
    int atkLevel;

    public void setName(String name) {
        this.name = name;
    }

    public void setAtkLevel(int atkLevel) {
        this.atkLevel = atkLevel;
    }

    @Override
    public String toString() {
        return  name + ", atkLevel = " + atkLevel + '}';
    }
}
