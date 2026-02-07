/**
 * 
 */
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 
 */
public class Doc_ghi_file {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner c=new Scanner(System.in);
			FileWriter fw=new FileWriter("NhatKy.txt",true);
			String nd=c.nextLine();
				fw.write("Nhật ký:\n");
				fw.write(nd+ "\n");
				fw.close();
				
			Scanner docfile=new Scanner(new java.io.File("NhatKy.txt"));
			while(docfile.hasNextLine()) {
				System.out.println(docfile.nextLine());
			}
			docfile.close();	
			
		}
		catch(IOException e) {
			System.out.println("Lỗi:"+ e.getMessage());
			
		}
	}

}
