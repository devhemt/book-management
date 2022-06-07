package assignments;
import java.util.ArrayList;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Book> arrBook = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
        try {
        	do {
                functions.menu();
                int value1;
                System.out.println("Nhập lựa chọn của bạn");
                value1 = scanner.nextInt();
            	if (value1==5) break;
            	switch (value1) {
    			case 1:
    				do {
    					functions.menuBooks();
    					System.out.println("Nhập lựa chọn của bạn");
    		        	int value2;
    		        	value2 = scanner.nextInt();
    		        	if (value2==5) break;
    		        	switch (value2) {
    					case 1:
    						functions.insertANewBook(arrBook);
    						continue;
    					case 2:
    						System.out.println("Nhập sách cần update");
    			        	String x,a;
    			        	a = scanner.nextLine();
    			        	x = scanner.nextLine();
    						functions.updateABook(arrBook,x);
    						continue;
    					case 3:
    						System.out.println("Nhập sách cần xóa");
    			        	String y,z;
    			        	z = scanner.nextLine();
    			        	y = scanner.nextLine();
    						functions.deleteABook(arrBook,y);
    						continue;
    					case 4:
    						functions.disPlayAll(arrBook);
    						continue;
    					default:
    						continue;
    					}
    				} while (1 != 2);
    			case 2:
    				do {
    					functions.menuTools();
    					System.out.println("Nhập lựa chọn của bạn");
    		        	int value3;
    		        	value3 = scanner.nextInt();
    		        	if (value3==5) break;
    		        	switch (value3) {
    					case 1:
    						System.out.println("Nhập tác giả cần tìm");
    						String y,z;
    			        	z = scanner.nextLine();
    			        	y = scanner.nextLine();
    						functions.filterByAuthor(arrBook,y);
    						continue;
    					case 2:
    						System.out.println("Nhập ngôn ngữ cần tìm");
    			        	String f,v;
    			        	v = scanner.nextLine();
    			        	f = scanner.nextLine();
    						functions.filterByLanguage(arrBook,f);
    						continue;
    					case 3:
    						System.out.println("Nhập giá cần tìm");
    			        	double x;
    			        	String a;
    			        	a = scanner.nextLine();
    			        	x = scanner.nextDouble();
    						functions.filterByPrice(arrBook,x );
    						continue;
    					case 4:
    						functions.sort(arrBook);
    						continue;
    					default:
    						continue;
    					}
    				} while (1 != 5);
    			default:
    				continue;
    			}
        	} while (1 != 2);
		} catch (Exception e) {
				System.out.println("Nhập sai, vui lòng khởi động lại!");
		}
        scanner.close();
    }

}
