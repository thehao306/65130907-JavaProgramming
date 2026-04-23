package thigk2.tranthehao;

import java.time.Year;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private double diemTB; 

    public SinhVien() {}

    public SinhVien(String maSV, String hoTen, int namSinh, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
    }

	// Getter & Setter
    public String getMaSV() { return maSV; }
    public void setMaSV(String maSV) { this.maSV = maSV; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public int getNamSinh() { return namSinh; }
    public void setNamSinh(int namSinh) { this.namSinh = namSinh; }

    public double getDiemTB() { return diemTB; }
    public void setDiemTB(double diemTB) { this.diemTB = diemTB; }

    public int getTuoi() {
        int namHienTai = java.time.Year.now().getValue();
        return namHienTai - namSinh;
    }

    public void xuat() {
        System.out.println(maSV + " | " + hoTen + " | " + namSinh + " | " + diemTB);
    }
}
