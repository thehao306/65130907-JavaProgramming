package tth.quanlyhinhhoc;

class HinhTron extends HinhHoc {
    private double banKinh;

    @Override
    public void nhap() {
        super.nhap();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Nhập bán kính: ");
        banKinh = sc.nextDouble();
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
}
