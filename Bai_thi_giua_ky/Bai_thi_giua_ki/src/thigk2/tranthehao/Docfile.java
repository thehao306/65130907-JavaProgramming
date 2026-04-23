package thigk2.tranthehao;

import java.io.*;
import java.util.*;

public class Docfile {
    public static void main(String[] args) {
        ArrayList<Integer> ds = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("numbers.txt")); 
            String line;

            while ((line = br.readLine()) != null) {
                ds.add(Integer.parseInt(line));
            }

            br.close();

            // In danh sách
            System.out.println("Danh sách số:");
            for (int x : ds) {
                System.out.print(x + " ");
            }

            // Lấy X (ký tự cuối MSSV)
            Scanner sc = new Scanner(System.in);
            System.out.print("\nNhập mã SV: ");
            String maSV = sc.nextLine();

            int X = Character.getNumericValue(maSV.charAt(maSV.length() - 1));

            if (ds.contains(X)) {
                System.out.println("Có tồn tại X trong danh sách");
            } else {
                System.out.println("Không tồn tại X");
            }

        } catch (Exception e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }
}
