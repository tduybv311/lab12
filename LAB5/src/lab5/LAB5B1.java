/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LAB5B1 {
    
   
    public static void main(String[] args) {
        try {
            Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","1234");
            String sql = "select * form students";
            Statement st = Con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getString("MaSV"+"'"));
                System.out.println(rs.getString("Hoten"+"'"));
                System.out.println(rs.getString("Email"+"'"));
                System.out.println(rs.getString("SoDT"+"'"));
                System.out.println(rs.getString("Gioitinh"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
