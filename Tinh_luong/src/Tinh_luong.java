/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Tinh_luong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gio;
		double luong,tongluong;
		Scanner c=new Scanner(System.in);
		System.out.println("Nhập số giờ :");
		gio=c.nextInt();
		System.out.println("Nhập số lương :");
		luong=c.nextDouble();
		if(gio<=40) {
			 tongluong=luong*gio;
		}else{
			int giovuot=gio-40;
			 tongluong=luong*40+giovuot*luong*1.5;
		}
		System.out.printf("tổng lương nhận được sau %d giờ:%.1f\n",gio, tongluong);
	}

}
