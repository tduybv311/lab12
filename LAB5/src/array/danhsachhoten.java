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
public class danhsachhoten {
    public ArrayList<hoten> a = new ArrayList<hoten>();
    Scanner sc = new Scanner(System.in);

    public danhsachhoten(ArrayList<hoten> a) {
        this.a = a;
    }
    
    public danhsachhoten(){
        
    }

    
    public void themHT (hoten ht) {
        this.a.add(ht);
    }
    
    public void inDSHT () {
        for (hoten hoTen: a){
            System.out.println(hoTen);
        }
    }
    
    public boolean xoaHT (hoten ht) {
        return this.a.remove(ht);
    }
}
