/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SinhVien sv=new SinhVien(); 
		System.out.print("nhap ten:");
		sv.ten=sc.nextLine();
		sv.hocbai("Lap Trinh Java");
		System.out.print("Tao them doi tuong:\n");
		//doi tuong 1
		SinhVien sv1=new SinhVien(); 
		System.out.print("nhap ten:");
		sv1.ten=sc.nextLine();
		System.out.print("nhap tuoi:");
		sv1.tuoi=sc.nextInt();
		sc.nextLine();
		System.out.print("nhap masv:");
		sv1.masv=sc.nextLine();
		System.out.printf("%s nam nay %d co ma sinh vien la %s\n",sv1.ten,sv1.tuoi,sv1.masv);
		//doi tuong 2
		SinhVien sv2=new SinhVien(); 
		System.out.print("nhap ten:");
		sv2.ten=sc.nextLine();
		System.out.print("nhap tuoi:");
		sv2.tuoi=sc.nextInt();
		sc.nextLine();
		System.out.print("nhap masv:");
		sv2.masv=sc.nextLine();
		System.out.printf("%s nam nay %d co ma sinh vien la %s",sv2.ten,sv2.tuoi,sv2.masv);
		
	}

}
