package tth.quanlyhinhhoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HinhHoc h;

        System.out.println("1. Hình chữ nhật | 2. Hình tròn | 3. Tam giác");
        int chon = sc.nextInt();
        sc.nextLine(); 

        switch (chon) {
            case 1:
                h = new HinhChuNhat();
                break;
            case 2:
                h = new HinhTron();
                break;
            case 3:
                h = new HinhTamGiac();
                break;
            default:
                return;
        }

        h.nhap();
        h.hienThiThongTin();
    }
}
