package fr.campus.dungeon.database;

import java.sql.*;

public class Connect {
    Connection con;
    public Connect() {
        try {
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DonjonsEtDragons", "root", "");
            System.out.println("Connexion ok");
            //requête test
            Statement stmt = con.createStatement();
            String sql = "SELECT type, name, hpPoints, atkPoints FROM Hero";
            ResultSet res = stmt.executeQuery(sql);
            System.out.println(res);

            while(res.next()){
                String type = res.getString("type");
                String nom = res.getString("name");
                int hp = res.getInt("hpPoints");
                int atk = res.getInt("atkPoints");
                System.out.println("Type : " + type + " - " + "Nom : " + nom + " - " + "HP : " + hp + " - " + "ATK : " + atk);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public Connection getCon() {
        return con;
    }

//    public void setCon(Connection con) {
//        this.con = con;
//    }
}
