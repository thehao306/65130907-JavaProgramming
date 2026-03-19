package tth.quanlyhinhhoc;

class HinhChuNhat extends HinhHoc {
    private double chieuDai;
    private double chieuRong;

    @Override
    public void nhap() {
        super.nhap();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        chieuDai = sc.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        chieuRong = sc.nextDouble();
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
}