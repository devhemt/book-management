package assignments;

import java.util.ArrayList;


public class functions {
	static void filterByAuthor(ArrayList<Book> arrBook,String x) {
		int q=0;
        for (int i = 0; i < arrBook.size(); i++) {
            if (arrBook.get(i).getAuthor().equalsIgnoreCase(x)) {
                System.out.println(arrBook.get(i).toString());
                q++;
            }
        }
        if(q==0)
        	System.out.println("không tìm thấy");
	}
	static void filterByLanguage(ArrayList<Book> arrBook,String x) {
		int u=0;
        for (int i = 0; i < arrBook.size(); i++) {
            if (arrBook.get(i).getLanguage().equalsIgnoreCase(x)) {
                System.out.println(arrBook.get(i).toString());
                u++;
            }
        }
        if(u==0)
        	System.out.println("không tìm thấy");
	}
	static void filterByPrice(ArrayList<Book> arrBook,double x) {
		System.out.println("---Các sách của tác giả X---");
		int o = 0;
        for (int i = 0; i < arrBook.size(); i++) {
            if (arrBook.get(i).getPrice()==x) {
                System.out.println(arrBook.get(i).toString());
                o ++;
            }
        }
        if(o==0)
        	System.out.println("không tìm thấy");
	}
	static void sort(ArrayList<Book> arrBook)
    {
  
        arrBook.sort((o1, o2)
                      -> o1.getCustomProperty().compareTo(
                          o2.getCustomProperty()));
    }
	static void disPlayAll(ArrayList<Book> arrBook) {
		System.out.println("-----Thông tin tất cả sách :-----");
        for (int i = 0; i < arrBook.size(); i++) {
            System.out.println(arrBook.get(i).toString());
        }
	}
	static void insertANewBook(ArrayList<Book> arrBook) {
		System.out.println("Nhập thông tin quyển sách mới:");
        Book book = new Book();
        book.nhapSach();
        arrBook.add(book);
	}
	static void deleteABook(ArrayList<Book> arrBook,String x) {
		for (int i = 0; i < arrBook.size(); i++) {
            if (arrBook.get(i).getName().equalsIgnoreCase(x)) {
            	arrBook.remove(arrBook.get(i));
            }
        }
    }
	static void updateABook(ArrayList<Book> arrBook,String x) {
		int p=0;
		for (int i = 0; i < arrBook.size(); i++) {
            if (arrBook.get(i).getName().equalsIgnoreCase(x)) {
            	arrBook.remove(arrBook.get(i));
            	Book book = new Book();
                book.nhapSach();
                arrBook.add(book);
                p ++;
            }
		}
		if(p==0)
        	System.out.println("không tìm thấy");
     }
	static void menuBooks() {
		System.out.println("_________________________________________");
		System.out.println("|1.insert a new book  |2.update a book  |");
		System.out.println("-----------------------------------------");
		System.out.println("|3.delete a book      |4.display all    |");
		System.out.println("-----------------------------------------");
		System.out.println("5.                  EXIT                 ");
		System.out.println("_________________________________________");
	}
	static void menuTools() {
		System.out.println("______________________________________________");
		System.out.println("|1.filter by author  |2.filter by language   |");
		System.out.println("----------------------------------------------");
		System.out.println("|3.filter by price   |4.order by price desc  |");
		System.out.println("----------------------------------------------");
		System.out.println("5.                  EXIT                      ");
		System.out.println("______________________________________________");
	}
	static void menu() {
		System.out.println("___________________MENU__________________");
		System.out.println("|1.Books             |2.Tools           |");
		System.out.println("-----------------------------------------");
		System.out.println("5.                  EXIT                 ");
		System.out.println("_________________________________________");
	}
}
