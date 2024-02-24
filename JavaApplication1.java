/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.sql.*;
/**
 *
 * @author User
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Upload");
            String strcon = "jdbc:mysql://localhost:3306/test";
            Connection con = DriverManager.getConnection(strcon,"root","root");
            System.out.println("Connected to db");
        }
        catch(Exception e){
            
        }
    }
    
}
