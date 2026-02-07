
import java.util.Scanner;

public class Tinh_tien_dien {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        double tien = 0;

        System.out.println("=== BẢNG GIÁ ===");
        System.out.println("0-50kwh: 8126");
        System.out.println("51-100kwh: 8126");
        System.out.println("101-200kwh: 12006");
        System.out.println("201-300kwh: 8006");
        System.out.println(">=301kwh: 8126");
        System.out.println("=================");
        System.out.print("Nhập số kwh: ");

        int kwh = c.nextInt();

        if (kwh <= 50) {
            tien = kwh * 8126;
        } else if (kwh <= 100) {
            tien = 50 * 8126 + (kwh - 50) * 8126;
        } else if (kwh <= 200) {
            tien = 50 * 8126 + 50 * 8126 + (kwh - 100) * 12006;
        } else if (kwh <= 300) {
            tien = 50 * 8126 + 50 * 8126 + 100 * 12006 + (kwh - 200) * 8006;
        } else {
            tien = 50 * 8126 + 50 * 8126 + 100 * 12006 + 100 * 8006 + (kwh - 300) * 8126;
        }

        System.out.printf("Số tiền khi dùng %d kwh là: %.0f VND", kwh, tien);
    }
}
