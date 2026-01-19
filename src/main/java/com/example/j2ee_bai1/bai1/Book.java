package  com.example.j2ee_bai1.bai1;
import java.util.Scanner;

public class Book {
    private int id;
    private String title;
    private String author;
    private long price;

    public Book() {
    }

    public Book(int id, String title, String author, long price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void inPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sách:");
        System.out.print("Mã sách: ");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.print("Tiêu đề: ");
        this.title = scanner.nextLine();
        System.out.print("Tác giả: ");
        this.author = scanner.nextLine();
        System.out.print("Giá: ");
        this.price = Long.parseLong(scanner.nextLine());
    }

    public void outPut() {
        String msg = """
                Book: id=%d, title=%s, author=%s, price=%d 
                """.formatted(id, title, author, price);
        System.out.println(msg);
    }

}