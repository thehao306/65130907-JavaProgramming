package tth.quanlyhinhhoc;

class HinhTamGiac extends HinhHoc {
    private double a, b, c;

    @Override
    public void nhap() {
        super.nhap();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        a = sc.nextDouble();

        System.out.print("Nhập cạnh b: ");
        b = sc.nextDouble();

        System.out.print("Nhập cạnh c: ");
        c = sc.nextDouble();
    }

    public boolean kiemTraHopLe() {
        return (a + b > c && a + c > b && b + c > a);
    }

    @Override
    public double tinhChuVi() {
        if (!kiemTraHopLe()) return 0;
        return a + b + c;
    }

    @Override
    public double tinhDienTich() {
        if (!kiemTraHopLe()) return 0;

        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void hienThiThongTin() {
        if (!kiemTraHopLe()) {
            System.out.println("Tam giác không hợp lệ!");
        } else {
            super.hienThiThongTin();
        }
    }
}
