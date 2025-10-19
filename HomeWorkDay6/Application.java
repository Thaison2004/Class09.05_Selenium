package HomeWorkDay5Phan3;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	      System.out.println("CHỌN PHÒNG BAN");
	      System.out.println("1. Developer");
	      System.out.println("2. Tester");
	      System.out.println("3. BA");
	      System.out.print("Nhập lựa chọn của bạn: ");
	        int choice = sc.nextInt();
	        switch (choice) {
	            case 1:
	                System.out.print("Nhập số lượng nhân viên DEV: ");
	                int nDev = sc.nextInt();
	                sc.nextLine(); 
	                Employee[] devList = new Employee[nDev];
	                for (int i = 0; i < nDev; i++) {
	                    System.out.println("Nhập thông tin nhân viên DEV thứ " + (i + 1));
	                    devList[i] = new Employee();
	                    devList[i].nhapThongTin();
	                }
	                System.out.println("\n DANH SÁCH NHÂN VIÊN DEV");
	                for (Employee e : devList) {
	                    e.inThongTin();
	                }
	                break;

	            case 2:
	                System.out.print("Nhập số lượng nhân viên TEST: ");
	                int nTest = sc.nextInt();
	                sc.nextLine();
	                Employee[] testList = new Employee[nTest];
	                for (int i = 0; i < nTest; i++) {
	                    System.out.println("Nhập thông tin nhân viên TEST thứ " + (i + 1));
	                    testList[i] = new Employee();
	                    testList[i].nhapThongTin();
	                }
	                System.out.println("\nDANH SÁCH NHÂN VIÊN TEST");
	                for (Employee e : testList) {
	                    e.inThongTin();
	                }
	                break;

	            case 3:
	                System.out.print("Nhập số lượng nhân viên BA: ");
	                int nBA = sc.nextInt();
	                sc.nextLine();
	                Employee[] baList = new Employee[nBA];
	                for (int i = 0; i < nBA; i++) {
	                    System.out.println("Nhập thông tin nhân viên BA thứ " + (i + 1));
	                    baList[i] = new Employee();
	                    baList[i].nhapThongTin();
	                }
	                System.out.println("\n DANH SÁCH NHÂN VIÊN BA");
	                for (Employee e : baList) {
	                    e.inThongTin();
	                }
	                break;

	            default:
	                System.out.println("Phòng ban không hợp lệ!");
	        }
	}

}
