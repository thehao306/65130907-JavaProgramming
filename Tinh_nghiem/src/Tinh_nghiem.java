/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Tinh_nghiem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner c=new Scanner(System.in);
		System.out.println("Nhập a:");
		a=c.nextInt();
		System.out.println("Nhập b:");
		b=c.nextInt();
		if(a!=0&&b!=0) {
			double d=(double)-b/a;
			System.out.printf("Phương trình có nghiệm x=%f",d);
		}else if(b==0){
			System.out.println("Phương trình vô số nghiệm.");
		}else {
			System.out.println("Phương trình vô nghiệm.");
		}
	}

}
