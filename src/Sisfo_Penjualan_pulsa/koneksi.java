/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sisfo_Penjualan_pulsa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class koneksi {
    private static Connection koneksi;
    public static Connection getkoneksi(){
        if(koneksi==null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver ditemukan");
                try{
                    koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_pulsa","root","");
                    System.out.println("Database Di Temukan");
                }catch(SQLException ex){
                    System.out.println("Database Tidak DiTemukan \nPesan : "+ex.toString());
                }
            }catch(ClassNotFoundException ex){
                System.out.println("Driver tidak Ditemukan \nPesan : "+ex.toString());
            }
        }
        return koneksi;
    }
     public static Connection closeKoneksi() {

        try {
            koneksi.close();
        } catch (Exception e) {
        }
        return koneksi;
    }
     
}
