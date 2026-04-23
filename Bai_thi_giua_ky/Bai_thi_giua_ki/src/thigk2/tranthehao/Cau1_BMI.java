package thigk2.tranthehao;

import java.util.Scanner;

public class Cau1_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều cao (m): ");
        double chieuCao = sc.nextDouble();

        System.out.print("Nhập cân nặng (kg): ");
        double canNang = sc.nextDouble();

        double bmi = canNang / (chieuCao * chieuCao);

        System.out.println("Chỉ số BMI = " + bmi);

        if (bmi < 18.5) {
            System.out.println("Gầy");
        } else if (bmi < 25) {
            System.out.println("Bình thường");
        } else if (bmi < 30) {
            System.out.println("Thừa cân");
        } else {
            System.out.println("Béo phì");
        }

        sc.close();
    }
}