package tth.quanlyhinhhoc;

abstract class HinhHoc {
    protected String ten;
    protected String mauSac;

    public void nhap() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhập tên hình: ");
        ten = sc.nextLine();

        System.out.print("Nhập màu sắc: ");
        mauSac = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Tên: " + ten + ", Màu sắc: " + mauSac);
    }

    public abstract double tinhDienTich();
    public abstract double tinhChuVi();

    public void hienThiThongTin() {
        xuat();
        System.out.println("Diện tích: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
    }
}