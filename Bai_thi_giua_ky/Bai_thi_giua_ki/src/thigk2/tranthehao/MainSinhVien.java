package thigk2.tranthehao;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSinhVien {
    public static void main(String[] args) {
        ArrayList<SinhVien> ds = new ArrayList<>();

        // Hard-code 3 sinh viên
        ds.add(new SinhVien("65130907", "Tran The Hao", 2005, 8.0));
        ds.add(new SinhVien("65137799", "Tran Van B", 2005, 7.5)); 
        ds.add(new SinhVien("67138899", "Le Van C", 2007, 9.0));

        System.out.println("Danh sách ban đầu:");
        for (SinhVien sv : ds) {
            sv.xuat();
        }

        // Nhập thêm sinh viên
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập sinh viên mới:");

        System.out.print("Mã SV: ");
        String ma = sc.nextLine();

        System.out.print("Họ tên: ");
        String ten = sc.nextLine();

        System.out.print("Năm sinh: ");
        int ns = sc.nextInt();

        System.out.print("Điểm TB: ");
        double diem = sc.nextDouble();

        ds.add(new SinhVien(ma, ten, ns, diem));

        // In lại danh sách
        System.out.println("\nDanh sách sau khi thêm:");
        for (SinhVien sv : ds) {
            sv.xuat();
        }

        // Sinh viên > 20 tuổi
        System.out.println("\nSinh viên > 20 tuổi:");
        for (SinhVien sv : ds) {
            if (sv.getTuoi() > 20) {
                sv.xuat();
            }
        }

        sc.close();
    }
}