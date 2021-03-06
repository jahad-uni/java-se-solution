package Topic04.Collections.Lesson01ArrayList.Lesson05ArrayListAdvanced;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lesson01ArrayListAdvancedMethods {
}

class CompareTwoArrayList {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("hi");
        al1.add("How are you");
        al1.add("Good Morning");
        al1.add("bye");
        al1.add("Good night");

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Howdy");
        al2.add("Good Evening");
        al2.add("bye");
        al2.add("Good night");

        //Storing the comparison output in Lesson01ArrayList<String>
        ArrayList<String> al3 = new ArrayList<>();
        for (String temp : al1)
            al3.add(al2.contains(temp) ? "Yes" : "No");
        System.out.println(al3);

        //Storing the comparison output in Lesson01ArrayList<Integer>
        ArrayList<Integer> al4 = new ArrayList<>();
        for (String temp2 : al1)
            al4.add(al2.contains(temp2) ? 1 : 0);
        System.out.println(al4);
    }
}

class SwappingTwoElementsInArrayList {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("farhad");
        al.add("mehrdad");
        al.add("ali");
        al.add("saeed");
        al.add("mohammad");
        al.add("reza");

        System.out.println("Lesson01ArrayList before Swap:");
        for (String temp : al) {
            System.out.println(temp);
        }

        //Swapping 2nd(index 1) element with the 5th(index 4) element
        Collections.swap(al, 1, 4);

        System.out.println("Lesson01ArrayList after swap:");
        for (String temp : al)
            System.out.println(temp);
    }
}

class Student {
    private final String studentName;
    private final int studentAge;

    Student(String name, int age) {
        this.studentName = name;
        this.studentAge = age;
    }

    @Override
    public String toString() {
        return "Name is: " + this.studentName + " & Age is: " + this.studentAge;
    }
}

class UseOverriddenToStringMethod {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("farhad", 26));
        al.add(new Student("mehrdad", 25));
        al.add(new Student("farzad", 55));
        al.add(new Student("ali", 18));
        al.add(new Student("saeed", 22));
        for (Student tmp : al) {
            System.out.println(tmp);
        }
    }
}

class SerializationArrayListToFile {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hello");
        al.add("Hi");
        al.add("Howdy");

        try {
            FileOutputStream fos = new FileOutputStream("myFile");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

class DeSerializationFileToArrayList {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("myFile");
            ObjectInputStream ois = new ObjectInputStream(fis);
            arraylist = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        for (String tmp : arraylist)
            System.out.println(tmp);
    }
}

class CombineTwoArrayList {
    public static void main(String[] args) {
        //First Lesson01ArrayList
        ArrayList<String> arraylist1 = new ArrayList<>();
        arraylist1.add("AL1: E1");
        arraylist1.add("AL1: E2");
        arraylist1.add("AL1: E3");

        //Second Lesson01ArrayList
        ArrayList<String> arraylist2 = new ArrayList<>();
        arraylist2.add("AL2: E1");
        arraylist2.add("AL2: E2");
        arraylist2.add("AL2: E3");

        //New Lesson01ArrayList
        ArrayList<String> al = new ArrayList<>();
        al.addAll(arraylist1);
        al.addAll(arraylist2);

        for (String temp : al) {
            System.out.println(temp);
        }
    }
}

class CloneArraylistToAnotherOne {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        //Adding elements to the Lesson01ArrayList
        al.add("Apple");
        al.add("Orange");
        al.add("Mango");
        al.add("Grapes");
        System.out.println("Lesson01ArrayList: " + al);

        ArrayList<String> al2 = (ArrayList<String>) al.clone();
        System.out.println("Shallow copy of Lesson01ArrayList: " + al2);

        //add and remove on original Lesson01ArrayList
        al.add("Fig");
        al.remove("Orange");

        //Display of both ArrayLists after add & remove
        System.out.println("Original Lesson01ArrayList:" + al);
        System.out.println("Cloned Lesson01ArrayList:" + al2);
    }
}

class MakeEmptyAnArrayList {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("abc");
        al1.add("xyz");

        System.out.println("Lesson01ArrayList before clear: " + al1);
        // clear()
        //This method has better performance than removeAll()
        al1.clear();
        System.out.println("Lesson01ArrayList after clear: " + al1);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("text 1");
        al2.add("text 2");

        System.out.println("Lesson01ArrayList before removeAll: " + al2);
        al2.removeAll(al2);
        System.out.println("Lesson01ArrayList before removeAll: " + al2);
    }
}

class CheckArrayListIsEmpty {
    public static void main(String[] args) {
        //Lesson01ArrayList of Integer Type
        ArrayList<Integer> al = new ArrayList<>();
        //Checking whether the list is empty
        System.out.println("Is Lesson01ArrayList Empty: " + al.isEmpty());

        //Adding Integer elements
        al.add(1);
        al.add(88);
        al.add(9);
        al.add(17);

        //Again checking for isEmpty
        System.out.println("Is Lesson01ArrayList Empty: " + al.isEmpty());

        //Displaying elements of the list
        for (Integer num : al) {
            System.out.println(num);
        }
    }
}

class ArrayListTrimToSize {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>(50);
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(6);
        arraylist.add(7);
        arraylist.add(1);
        arraylist.add(1);
        arraylist.add(1);
        arraylist.trimToSize();
        System.out.println(arraylist);
    }
}

class ReplaceTheValueOfExistingElementInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        System.out.println("Lesson01ArrayList before update: " + arrayList);
        //Updating 1st element
        arrayList.set(0, 11);
        //Updating 2nd element
        arrayList.set(1, 22);
        //Updating 3rd element
        arrayList.set(2, 33);
        //Updating 4th element
        arrayList.set(3, 44);
        //Updating 5th element
        arrayList.set(4, 55);
        System.out.println("Lesson01ArrayList after Update: " + arrayList);
    }
}

class IncreaseTheCapacitySizeOfArrayList {
    public static void main(String[] args) {
        // Lesson01ArrayList with Capacity 4
        ArrayList<String> al = new ArrayList<>(4);
        //Added 4 elements
        al.add("Hi");
        al.add("Hello");
        al.add("Bye");
        al.add("GM");

        //Increase capacity to 5
        al.ensureCapacity(5);

        al.add("GE");

        for (String temp : al)
            System.out.println(temp);
    }
}
