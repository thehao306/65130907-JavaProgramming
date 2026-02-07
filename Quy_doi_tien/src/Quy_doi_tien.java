/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Quy_doi_tien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double vnd;
		double usd=23.500,eur=27.000;
		Scanner c=new Scanner(System.in);
		System.out.println("Nhập số tiền:");
		vnd=c.nextDouble();
		System.out.printf("Quy đổi USD sang VND=%.3f đ\n",vnd*usd);
		System.out.printf("Quy đổi EUR sang VND=%.3f đ\n",vnd*eur);
	}

}
