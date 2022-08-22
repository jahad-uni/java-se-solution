package Topic08.Java8Feature.Lesson05StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson03StreamSorting {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("************** Sort Fruits in Ascending order *************");
        System.out.println("Sort Asc with Comparator");
        List<String> sortedList = fruits.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList);

        System.out.println("Sort Asc with lambda");
        List<String> sortedListWithLambda = fruits.stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());
        System.out.println(sortedListWithLambda);

        System.out.println("Sort Asc with sorted");
        List<String> sortedListSimple = fruits.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedListSimple);


        System.out.println("************** Sort Fruits in Descending order *************");
        System.out.println("Sort Desc with Comparator");
        List<String> sortedListDesc = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedListDesc);

        System.out.println("Sort Desc with Lambda Expression");
        List<String> sortedListDescWithLambda = fruits.stream()
                .sorted((o1, o2) -> o2.compareTo(o1))
                .collect(Collectors.toList());
        System.out.println(sortedListDescWithLambda);


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"farhad",37,40000000));
        employees.add(new Employee(1,"mehrdad",36,45000000));
        employees.add(new Employee(1,"ali",63,50000000));
        employees.add(new Employee(1,"ramin",32,30000000));

        System.out.println("************** Sort Employee by salary in Asc orders *************");
        System.out.println("Sort salary Asc with Comparator");
        List<Employee> employeeSalarySortedWithComparator =   employees
                .stream().sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println(employeeSalarySortedWithComparator);

        System.out.println("Sort salary Asc with Anonymous Class");
        List<Employee> employeeSalarySortedWithAnonymousClass =   employees
              .stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList());
        System.out.println(employeeSalarySortedWithAnonymousClass);

        System.out.println("Sort salary Asc with Lambda Expression");
        List<Employee> employeeSalarySortedWithLambda =   employees.stream()
                .sorted((employee1,employee2)-> (int) (employee1.getSalary() - employee2.getSalary()))
                .collect(Collectors.toList());
        System.out.println(employeeSalarySortedWithLambda);

        System.out.println("************** Sort Employee by salary in Descending orders *************");

        System.out.println("Sort salary Desc with Comparator");
        List<Employee> employeeSalarySortedWithComparatorDesc =   employees
                .stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println(employeeSalarySortedWithComparatorDesc);

        System.out.println("Sort salary Desc with Anonymous Class");
        List<Employee> employeeSalarySortedDesc =   employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary() - o1.getSalary());
            }
        }).collect(Collectors.toList());
        System.out.println(employeeSalarySortedDesc);

        System.out.println("Sort salary Desc with Lambda Expression");
        List<Employee> employeeSalarySortedWithLambdaDesc =   employees.stream()
                .sorted((employee1,employee2)-> (int) (employee2.getSalary() - employee1.getSalary()))
                .collect(Collectors.toList());
        System.out.println(employeeSalarySortedWithLambdaDesc);

        System.out.println("************** Sort Employee by Age in Asc orders *************");

        System.out.println("Sort age Asc with Comparator");
        List<Employee> employeeAgeSortedWithComparator =   employees
                .stream().sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println(employeeAgeSortedWithComparator);

        System.out.println("Sort age Asc with Anonymous Class");
        List<Employee> employeeAgeSortedWithAnonymousClass =   employees
                .stream().sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return (int) (o1.getAge() - o2.getAge());
                    }
                }).collect(Collectors.toList());
        System.out.println(employeeAgeSortedWithAnonymousClass);

        System.out.println("Sort age Asc with Lambda Expression");
        List<Employee> employeeAgeSortedWithLambda =   employees.stream()
                .sorted((employee1,employee2)-> (int) (employee1.getAge() - employee2.getAge()))
                .collect(Collectors.toList());
        System.out.println(employeeAgeSortedWithLambda);

        System.out.println("************** Sort Employee by age in Descending orders *************");

        System.out.println("Sort age Desc with Comparator");
        List<Employee> employeeAgeSortedWithComparatorDesc =   employees
                .stream().sorted(Comparator.comparingLong(Employee::getAge).reversed())
                .collect(Collectors.toList());
        System.out.println(employeeAgeSortedWithComparatorDesc);

        System.out.println("Sort age Desc with Anonymous Class");
        List<Employee> employeeAgeSortedDesc =   employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getSalary() - o1.getSalary());
            }
        }).collect(Collectors.toList());
        System.out.println(employeeAgeSortedDesc);

        System.out.println("Sort age Desc with Lambda Expression");
        List<Employee> employeeAgeSortedWithLambdaDesc =   employees.stream()
                .sorted((employee1,employee2)-> (int) (employee2.getAge() - employee1.getAge()))
                .collect(Collectors.toList());
        System.out.println(employeeAgeSortedWithLambdaDesc);


        System.out.println("************** Sort Employee by name in Asc orders *************");

        System.out.println("Sort name Asc with Comparator");
        List<Employee> employeeNameSortedWithComparator =   employees
                .stream().sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println(employeeNameSortedWithComparator);

        System.out.println("Sort name Asc with Anonymous Class");
        List<Employee> employeeNameSortedWithAnonymousClass =   employees
                .stream().sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                }).collect(Collectors.toList());
        System.out.println(employeeNameSortedWithAnonymousClass);

        System.out.println("Sort name Asc with Lambda Expression");
        List<Employee> employeeNameSortedWithLambda =   employees.stream()
                .sorted((employee1,employee2)-> employee1.getName().compareTo(employee2.getName()))
                .collect(Collectors.toList());
        System.out.println(employeeNameSortedWithLambda);


        System.out.println("************** Sort Employee by name in Descending orders *************");

        System.out.println("Sort name Desc with Comparator");
        List<Employee> employeeNameSortedWithComparatorDesc =   employees
                .stream().sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());
        System.out.println(employeeNameSortedWithComparatorDesc);

        System.out.println("Sort name Desc with Anonymous Class");
        List<Employee> employeeNameSortedDesc =   employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getName().compareTo(o1.getName());
            }
        }).collect(Collectors.toList());
        System.out.println(employeeNameSortedDesc);

        System.out.println("Sort name Desc with Lambda Expression");
        List<Employee> employeeNameSortedWithLambdaDesc =   employees.stream()
                .sorted((employee1,employee2)->employee2.getName().compareTo(employee1.getName()))
                .collect(Collectors.toList());
        System.out.println(employeeNameSortedWithLambdaDesc);

    }
}

class Employee {

    private int id;
    private String name;
    private int age;
    private long salary;

    public Employee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
