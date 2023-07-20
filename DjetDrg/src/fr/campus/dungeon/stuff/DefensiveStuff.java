package fr.campus.dungeon.stuff;

public class DefensiveStuff {
    String name;
    int defLevel;

   public void setName(String name) {
       this.name = name;
   }

   public void setDefLevel(int defLevel) {
       this.defLevel = defLevel;
   }

    @Override
    public String toString() {
        return  name + ", defLevel = " + defLevel + '}';
    }
}
