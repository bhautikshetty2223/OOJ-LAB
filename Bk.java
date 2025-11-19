import java.util.*;

class Book {
    String name;
    String author;
    double price;
    int num_pages;

    public Book(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setNumPages(int num_pages) {
        this.num_pages = num_pages;
    }

    public int getNumPages() {
        return num_pages;
    }

    public String toString() {
        return "Book Name: " + name +
               "\nAuthor: " + author +
               "\nPrice: " + price +
               "\nNumber of Pages: " + num_pages + "\n";
    }
}

public class Bk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for book " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Number of Pages: ");
            int num_pages = sc.nextInt();
            sc.nextLine(); 

            books[i] = new Book(name, author, price, num_pages);
        }

        System.out.println("\n--- Book Details ---");
        for (Book book : books) {
            System.out.println(book);
        }

        sc.close();
    }
}
