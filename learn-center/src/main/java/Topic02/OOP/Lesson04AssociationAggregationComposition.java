package Topic02.OOP;

import java.util.ArrayList;
import java.util.List;

public class Lesson04AssociationAggregationComposition {
}

class Car {
    String carName;
    int carId;

    Car(String name, int id) {
        this.carName = name;
        this.carId = id;
    }
}

//Association between Car and Driver with one to one relationship
class Driver extends Car {
    String driverName;

    Driver(String name, String cname, int cid) {
        super(cname, cid);
        this.driverName = name;
    }
}

class TransportCompany {
    public static void main(String args[]) {
        Driver obj = new Driver("farhad", "mvm", 1000);
        System.out.println(obj.driverName + " is a driver of car Id: " + obj.carId);
    }
}

//Aggregation Between library and book
class Library {
    String libName;
    int libCode;
    List<Book> books = new ArrayList<>();

    Library(String name, int code) {
        this.libName = name;
        this.libCode = code;
    }
}

class Book {
    String name;
    String writer;
    String barCode;

    Book(String name, String writer, String barCode) {
        this.name = name;
        this.writer = writer;
        this.barCode = barCode;
    }
}

class LibraryCompany {
    public static void main(String[] args) {
        Library library = new Library("park-shahr", 1);
        Book book1 = new Book("100 sal tanhai", "gabriel garsia", "10");
        Book book2 = new Book("bar bad rafte", "margaret michel", "11");
        library.books.add(book1);
        library.books.add(book2);
        System.out.println("library has " + library.books.size() + " books");
    }
}

// Composition between Heart and Body
class Heart{

    Heart(){
        System.out.println("Heart Created");
    }
}

class Body{
    Heart heart;
    Body(){
        heart = new Heart();
        System.out.println("Body Created");
    }

    public static void main(String[] args) {
        Body body = new Body();
    }
}




