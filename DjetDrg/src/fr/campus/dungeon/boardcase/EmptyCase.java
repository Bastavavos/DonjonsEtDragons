package fr.campus.dungeon.boardcase;

public class EmptyCase implements Case {
    String vide;

    @Override
    public void display() {
    this.vide ="Nothing here";
    }

    @Override
    public String toString() {
        return "EmptyCase {" + vide + '}';
    }
}
