/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HiztegiaSQLite;

/**
 *
 * @author alberdi.jon
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteKudeatu {

      private static final String DB = ":E:/Goi mailako zikloa/GitHub/DAM/DAM_1/PROGRAMMING/3.Ebal/UD4/HiztegiaSQLite/db/Hiztegia.db";
      private static final String DBIzena = "Hiztegia.db";
      private static String taula = "terminoak";

      public static Connection connect() {
            Connection conn = null;
            try {
                  // db parameters
                  String url = "jdbc:sqlite" + DB;
                  // create a connection to the database
                  conn = DriverManager.getConnection(url);

                  //System.out.println("Connection to SQLite has been established.");
            } catch (SQLException e) {
                  System.out.println(e.getMessage());
            }
            return conn;
      }

      public static void terminoakImprimatu() {
            String sql = "SELECT * FROM " + taula;

            try (Connection conn = connect();
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(sql)) {
                  System.out.println("Datu basearen izena " + DBIzena + " izango da eta hurrengo datuak izango ditu:");
                  System.out.println("ID\tEUSKARAZ\tGAZTELERAZ");

                  while (rs.next()) {
                        System.out.printf(rs.getInt("id") + "\t"
                                + rs.getString("euskaraz") + "\t"
                                + rs.getString("gazteleraz") + "\n");
                  }
            } catch (SQLException e) {
                  System.out.println(e.getMessage());
            }
      }

      public static void terminoaGehitu(String euskaraz, String gazteleraz) {
            String sql = "INSERT INTO " + taula + "(euskaraz,gazteleraz) VALUES(?,?)";

            try (Connection conn = connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql)) {
                  pstmt.setString(1, euskaraz);
                  pstmt.setString(2, gazteleraz);
                  pstmt.executeUpdate();
            } catch (SQLException e) {
                  System.out.println(e.getMessage());
            }
      }

      public static void terminoaAldatu(int id, String euskaraz, String gazteleraz) { //eztu itten??__________________________________________
            String sql = "UPDATE " + taula + " SET euskaraz = ? , "
                    + "gazteleraz = ? "
                    + "WHERE id = ?";

            try (Connection conn = SQLiteKudeatu.connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql)) {

                  // set the corresponding param
                  pstmt.setString(1, euskaraz);
                  pstmt.setString(2, gazteleraz);
                  // update 
                  pstmt.executeUpdate();
            } catch (SQLException e) {
                  System.out.println(e.getMessage());
            }
      }

      public static void delete(int id) {
            String sql = "DELETE FROM " + taula + " WHERE id = ?";

            try (Connection conn = connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql)) {

                  // set the corresponding param
                  pstmt.setInt(1, id);
                  // execute the delete statement
                  pstmt.executeUpdate();

            } catch (SQLException e) {
                  System.out.println(e.getMessage());
            }
      }
}
