package com.example.j2ee_bai1.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1Main {
    public static void main(String[] args) {
        List<Book> listBook = new ArrayList<Book>();
        Scanner scanner = new Scanner(System.in);
        String msg = """
                Chương trình quản lý sách
                1. Thêm sách
                2. xóa 1 cuốn sách theo mã sách
                3. Thay đổi thông tin sách theo mã sách
                4. Xuất thông tin tất cả sách
                5. Tìm sách theo tên sách lập trình
                6. Lấy danh sách sách theo giá
                7. Tìm kiếm sách theo tác giả
                8. Thoát
                Mời bạn chọn chức năng:
                """;
        int chon = 0;
        do {
            System.err.println(msg);
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1 -> {
                    Book book = new Book();
                    book.inPut();
                    listBook.add(book);
                }
                case 2 -> {
                    System.out.print("Nhập mã sách cần xóa: ");
                    int bookId = Integer.parseInt(scanner.nextLine());
                    Book find = listBook.stream().filter(p -> p.getId() == bookId).findFirst().orElseThrow();
                    listBook.remove(find);
                }
                case 3 -> {
                    System.out.print("Nhập mã sách cần sửa: ");
                    int bookId = Integer.parseInt(scanner.nextLine());
                    Book find = listBook.stream().filter(p -> p.getId() == bookId).findFirst().orElseThrow();
                    find.inPut();
                }
                case 4 -> {
                    System.out.println("Danh sách sách:");
                    listBook.forEach(p -> p.outPut());
                }
                case 5 -> {
                    List<Book> listBooks = listBook.stream()
                            .filter(u -> u.getTitle().toLowerCase().contains("lập trình")).toList();
                    listBooks.forEach(Book::outPut);
                }
            }
        } while (chon !=0);
    }
}
