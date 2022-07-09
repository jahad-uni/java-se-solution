package Topic04.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lesson05ArrayListOfObjectSorting {
}

class StudentWithComparable implements Comparable {
    private String studentname;
    private int rollno;
    private int studentage;

    public StudentWithComparable(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    @Override
    public int compareTo(Object o) {
        int compareage = ((StudentWithComparable) o).getStudentage();
        /* For Ascending order*/
        return this.studentage - compareage;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }

    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }
}

class ArrayListObjectSortingWithComparable {

    public static void main(String args[]) {
        ArrayList<StudentWithComparable> arraylist = new ArrayList<>();
        arraylist.add(new StudentWithComparable(223, "farhad", 26));
        arraylist.add(new StudentWithComparable(245, "mehrdad", 24));
        arraylist.add(new StudentWithComparable(209, "ramin", 32));

        Collections.sort(arraylist, Collections.reverseOrder());

        for (StudentWithComparable str : arraylist) {
            System.out.println(str);
        }
    }
}

class StudentWithComparator {
    private String studentname;
    private int rollno;
    private int studentage;

    public StudentWithComparator(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    /*Comparator for sorting the list by Student Name*/
    public static Comparator<StudentWithComparator> StuNameComparator = new Comparator<>() {

        public int compare(StudentWithComparator s1, StudentWithComparator s2) {
            String StudentName1 = s1.getStudentname().toUpperCase();
            String StudentName2 = s2.getStudentname().toUpperCase();

            //ascending order
            return StudentName1.compareTo(StudentName2);

            //descending order
            //return StudentName2.compareTo(StudentName1);
        }
    };

    /*Comparator for sorting the list by roll no*/
    public static Comparator<StudentWithComparator> StuRollno = new Comparator<>() {

        public int compare(StudentWithComparator s1, StudentWithComparator s2) {

            int rollno1 = s1.getRollno();
            int rollno2 = s2.getRollno();

            /*For ascending order*/
            return rollno1 - rollno2;

            /*For descending order*/
            //rollno2-rollno1;
        }
    };

    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }
}

class ArrayListObjectSortingWithComparator {

    public static void main(String args[]) {
        ArrayList<StudentWithComparator> arraylist = new ArrayList<>();
        arraylist.add(new StudentWithComparator(101, "farhad", 26));
        arraylist.add(new StudentWithComparator(505, "mehdi", 24));
        arraylist.add(new StudentWithComparator(809, "ramin", 32));

        /*Sorting based on Student Name*/
        System.out.println("Student Name Sorting:");
        Collections.sort(arraylist, StudentWithComparator.StuNameComparator);

        for (StudentWithComparator str : arraylist) {
            System.out.println(str);
        }

        /* Sorting on Rollno property*/
        System.out.println("RollNum Sorting:");
        Collections.sort(arraylist, StudentWithComparator.StuRollno);
        for (StudentWithComparator str : arraylist) {
            System.out.println(str);
        }
    }
}
