/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Scanner;
import array.danhsachhoten;
import java.util.ArrayList;

public class menu {
    Scanner sc = new Scanner(System.in);
    public void nhap (){
        while (true) {
        String x = sc.next();
        a.add(x);
        
        System.out.println("Nhập thêm (Y/N)?");
        sc.nextLine();
        if (sc.nextLine().equals("N")){
            break;
        }
    }
    }
}
