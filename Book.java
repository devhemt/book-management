package assignments;

import java.util.Scanner;

public class Book {
	private String name, author, language, publishdate;
    private double price;
    private int id, ISBN;
    
     
    public Book() {
        super();
    }
 
    public Book(String name, String author, String language, String publishdate, double price, int id, int ISBN) {
        super();
        this.name = name;
        this.author = author;
        this.language = language;
        this.publishdate = publishdate;
        this.price = price;
        this.id = id;
        this.ISBN = ISBN;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
    	this.name = name;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public void setAuthor(String author) {
    	this.author = author;
    }
 
    public String getLanguage() {
        return language;
    }
    
    public void setLanguage(String language) {
    	this.language = language;
    }
    
    public String getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}

	public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
    
    public int getISBN() {
        return ISBN;
    }
 
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
 
    public void nhapSach() {
    	Scanner scanner = new Scanner(System.in);
        try {
        	System.out.print("Nhập tên sách: ");
            name = scanner.nextLine();
            System.out.print("Nhập tên tác giả: ");
            author = scanner.nextLine();
            System.out.print("Nhập ngôn ngữ: ");
            language = scanner.nextLine();
            System.out.print("Nhập ngôn ngữ: ");
            publishdate = scanner.nextLine();
            System.out.print("Nhập giá: ");
        	price = scanner.nextDouble();
            System.out.print("Nhập id: ");
            id = scanner.nextInt();
            System.out.print("Nhập ISBN : ");
            ISBN = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Nhập sai, vui lòng nhập lại!");
		}
        
    }
     
    public String toString() {
        return "Tên sách:" + this.name + ", id: " + this.id + ", tên tác giả: " + this.author + ", giá: " + 
                this.price + ", ngôn ngữ :"+ this.language + ", ISBN :" + this.ISBN +", publishdate:"+ this.publishdate ;
    }
    public String getCustomProperty()
    {
        return String.valueOf(this.price);
    }
}
