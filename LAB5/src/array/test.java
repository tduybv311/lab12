/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        danhsachhoten dsht = new danhsachhoten();
        int luaChon = 0;
        do {
            System.out.println("--------------------MENU----------------------");
            System.out.println("1. Nhap danh sach ho va ten");
            System.out.println("2. Xuat danh sach vua nhap");
            System.out.println("3. Xuat danh sach ngau nhien");
            System.out.println("4. Sap xep giam dan va xuat");
            System.out.println("5. Xoa ho ten nhap tu ban phim");
            System.out.println("6. Ket thuc");
            System.out.println("----------------------------------------------");
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1) {
                System.out.println("Nhập họ: ");
                String Ho = sc.nextLine();
                System.out.println("Nhập tên đệm: ");
                String tenDem = sc.nextLine();
                System.out.println("Nhập tên: ");
                String Ten = sc.nextLine();
                hoten ht = new hoten(Ho, tenDem, Ten);
                dsht.themHT(ht);
            } else if (luaChon == 2) {
                dsht.inDSHT();
            } else if (luaChon == 3){
                Collections.shuffle((List<hoten>) dsht);
                dsht.inDSHT();
            } else if (luaChon == 4) {
                Collections.sort((List<hoten>) dsht);
                Collections.reverse((List<hoten>) dsht);
                dsht.inDSHT();
            } else if (luaChon == 5) {
                hoten ht = new hoten();
                dsht.xoaHT(ht);
            }
        } while (luaChon != 0);
    }
}
