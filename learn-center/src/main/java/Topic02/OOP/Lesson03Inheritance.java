package Topic02.OOP;

public class Lesson03Inheritance {
}

//CashierEmployee-->Employee-->Entity
//Account-->Entity


//Entity Has Hierarchical Relation with Employee and Account
class Entity {
    int id = 1;
    Entity() {
        System.out.println("Constructor of Entity");
    }
    protected void whoIs() {
        System.out.println("id: " + this.id);
    }
}

class Account extends Entity{
    Account() {
        System.out.println("Constructor of Account");
    }
}

//Employee has Single Level Inheritance
class Employee extends Entity{

    private String name = "Farhad";
    private String family = "Noori";

    Employee() {
        System.out.println("Constructor of Employee");
    }

    public String getName() {
        return this.name;
    }

    protected void whoIs() {
        super.whoIs();
        System.out.println("name: " + this.name);
        System.out.println("family: " + this.family);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.whoIs();
    }
}

//ManagerEmployee has Multi Level Inheritance
class ManagerEmployee extends Employee {

    ManagerEmployee() {
        //compiler by default invokes the constructor of parent class
        //super();
        System.out.println("Constructor of Manager Employee");
    }

    short employeeCount = 20;

    // can not assign weaker privillage
//    protected String getName(){
//
//    }

    public String getName(){
       return super.getName();
    }

    //override who of parent
    protected void whoIs() {
        //can access to public or protected parent method
        super.whoIs();
        System.out.println("Employee Count: " + this.employeeCount);
    }

    public static void main(String[] args) {
        ManagerEmployee managerEmployee = new ManagerEmployee();
        //This will call the child class version of whoIs()
        managerEmployee.whoIs();

        System.out.println("------------------------------------");

        Employee employee = new Employee();
        //This will call the parent class version of whoIs()
        employee.whoIs();
    }
}


interface X
{
     void myMethod();
}
interface Y
{
     void myMethod();
}
class MultipleInterfaceImpl implements X, Y
{
    public void myMethod()
    {
        System.out.println("Implementing more than one interfaces");
    }
    public static void main(String[] args){
        MultipleInterfaceImpl obj = new MultipleInterfaceImpl();
        obj.myMethod();
    }
}
