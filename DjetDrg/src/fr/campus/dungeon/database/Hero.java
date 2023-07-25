package fr.campus.dungeon.database;

import fr.campus.dungeon.character.Character;
import com.google.gson.Gson;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Hero {
    Gson gson = new Gson();
    Connect connect = new Connect();

    public void getHeroes() throws SQLException {

        Statement stmt = connect.getCon().createStatement();
        String sql = "SELECT * FROM Hero";
        ResultSet res = stmt.executeQuery(sql);
        System.out.println(res);

        while(res.next()){
            String type = res.getString("type");
            String nom = res.getString("name");
            int hp = res.getInt("hpPoints");
            int atk = res.getInt("atkPoints");
            System.out.println("Type : " + type + " - " + "Nom : " + nom + " - " + "HP : " + hp + " - " + "ATK : " + atk);
        }
    }

    public void createHero(Character hero){

        String sql = "INSERT INTO Hero (type, name, hpPoints, atkPoints, DefensiveStuff, OffensiveStuff) VALUE (?,?,?,?,?,?)";

        String type = hero.getClass().getSimpleName();
        String name = hero.getName();
        int hp = hero.getHpPoints();
        int atk = hero.getAtkPoints();
        String defensiveStuff = gson.toJson(hero.getBasicDefItem());
        String offensiveStuff = gson.toJson(hero.getBasicOffItem());

        try {
            PreparedStatement preparedStatement = connect.con.prepareStatement(sql);
            Statement stmt = connect.getCon().createStatement();
            preparedStatement.setString(1, type);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, hp);
            preparedStatement.setInt(4 , atk);
            preparedStatement.setString(5, defensiveStuff);
            preparedStatement.setString(6, offensiveStuff);

            int results = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void deleteHero() {
//
//        try {
//            Statement stmt = connect.getCon().createStatement();
//            String sql = "DELETE FROM Hero WHERE type = 'warrior'";
//            stmt.executeUpdate(sql);
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public void editHero(Character hero, String oldName) throws SQLException {

        //Statement stmt = connect.getCon().createStatement();
        String sql = "UPDATE Hero SET type=?, name=?, hpPoints=?, atkPoints=?, DefensiveStuff=?, OffensiveStuff=? WHERE name=?";
        //stmt.executeUpdate(sql);

        String type = hero.getClass().getSimpleName();
        String name = hero.getName();
        int hp = hero.getHpPoints();
        int atk = hero.getAtkPoints();
        String defensiveStuff = gson.toJson(hero.getBasicDefItem());
        String offensiveStuff = gson.toJson(hero.getBasicOffItem());

        try {
            try (PreparedStatement preparedStatement = connect.con.prepareStatement(sql)) {
                preparedStatement.setString(1, type);
                preparedStatement.setString(2, name);
                preparedStatement.setInt(3, hp);
                preparedStatement.setInt(4, atk);
                preparedStatement.setString(5, defensiveStuff);
                preparedStatement.setString(6, offensiveStuff);
                preparedStatement.setString(7, oldName);

                int results = preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

