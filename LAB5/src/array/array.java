/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class array {
    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<Double>();
    Scanner sc = new Scanner(System.in);
    
    while (true) {
        Double x = sc.nextDouble();
        a.add(x);
        
        System.out.println("Nhập thêm (Y/N)?");
        sc.nextLine();
        if (sc.nextLine().equals("N")){
            break;
        }
    }
    for(Double x: a){
        System.out.println("Các phần tử: "+x);
    }
    }
}
