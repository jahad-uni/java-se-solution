package Topic02.OOP;

public class Lesson01Constructor {
}

class DefaultConstructor {
    // compiler implicit put constructor with no args for every class
    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        System.out.println(obj.hashCode());
    }
}

class NoArgsConstructor {
    String name;

    //Constructor
    NoArgsConstructor() {
        this.name = "No Args Constructor";
    }

    public static void main(String[] args) {
        NoArgsConstructor obj = new NoArgsConstructor();
        System.out.println(obj.name);
    }
}

class ParameterizedConstructorWithNoArgsConstructor {

    int empId;
    String empName;

    ParameterizedConstructorWithNoArgsConstructor() {
    }

    ParameterizedConstructorWithNoArgsConstructor(int id, String name) {
        this.empId = id;
        this.empName = name;
    }

    void info() {
        System.out.println("Id: " + empId + " Name: " + empName);
    }

    public static void main(String[] args) {
        ParameterizedConstructorWithNoArgsConstructor obj1 = new ParameterizedConstructorWithNoArgsConstructor(10245, "Chaitanya");
        ParameterizedConstructorWithNoArgsConstructor obj2 = new ParameterizedConstructorWithNoArgsConstructor(92232, "Negan");
        ParameterizedConstructorWithNoArgsConstructor obj3 = new ParameterizedConstructorWithNoArgsConstructor();

        obj1.info();
        obj2.info();
        obj3.info();
    }
}

class ParameterizedConstructorWithoutNoArgsConstructor {

    int empId;
    String empName;

    ParameterizedConstructorWithoutNoArgsConstructor(int id, String name) {
        this.empId = id;
        this.empName = name;
    }

    void info() {
        System.out.println("Id: " + empId + " Name: " + empName);
    }

    public static void main(String[] args) {
        ParameterizedConstructorWithoutNoArgsConstructor obj1 = new ParameterizedConstructorWithoutNoArgsConstructor(10245, "Chaitanya");
        ParameterizedConstructorWithoutNoArgsConstructor obj2 = new ParameterizedConstructorWithoutNoArgsConstructor(92232, "Negan");
        // line below has compiled error because there is no default constructor
        // ParameterizedConstructorWithoutNoArgsConstructor obj3 = new ParameterizedConstructorWithoutNoArgsConstructor();
        obj1.info();
        obj2.info();
    }
}

class ChainingConstructor {
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    // chaining constructor happen when constructors overloaded
    ChainingConstructor() {
        // calls constructor 2
        // this keyword should always be the first line of the constructor.
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    ChainingConstructor(int x) {
        // calls constructor 3
        // this keyword should always be the first line of the constructor.
        this(5, 15);
        System.out.println(x);
    }

    // parameterized constructor 3
    ChainingConstructor(int x, int y) {
        System.out.println(x * y);
    }

    public static void main(String[] args) {
        // invokes default constructor first
        new ChainingConstructor();
    }
}

class MyParentClass {
    MyParentClass() {
        System.out.println("MyParentClass Constructor");
    }

    MyParentClass(String name) {
        System.out.println("name: " + name);
    }
}

class MyChildClassImplicitCallParentConstructorDemo extends MyParentClass {
    // compiler implicit call parent constructor with super() keyword
    MyChildClassImplicitCallParentConstructorDemo() {
        System.out.println("MyChildClassExplicitCallParentConstructorDemo Constructor");
    }

    public static void main(String[] args) {
        new MyChildClassImplicitCallParentConstructorDemo();
    }
}

class MyChildClassExplicitCallParentConstructorDemo extends MyParentClass {
    // developer explicit call second parent constructor with super keyword
    MyChildClassExplicitCallParentConstructorDemo() {
        super("hello parent");
        System.out.println("MyChildClassExplicitCallParentConstructorDemo Constructor");
    }

    public static void main(String[] args) {
        new MyChildClassExplicitCallParentConstructorDemo();
    }
}

class CopyConstructor {
    String name;
    String family;
    String address;

    CopyConstructor(String name) {
        this.name = name;
    }

    /* This is the Copy Constructor, it
     * copies the values of one object
     * to the another object (the object
     * that invokes this constructor)
     */
    CopyConstructor(CopyConstructor cc) {
        this.name = cc.name;
        this.family = cc.family;
        this.address = cc.address;
    }

    void setFamily(String family) {
        this.family = family;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void disp() {
        System.out.println("name: " + name);
        System.out.println("family: " + name);
        System.out.println("address: " + address);
    }

    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor("farhad");
        obj1.setFamily("noori");
        obj1.setAddress("satari");
        /* Passing the object as an argument to the constructor
         * This will invoke the copy constructor
         */
        CopyConstructor obj2 = new CopyConstructor(obj1);
        obj1.disp();
        obj2.disp();
    }
}




