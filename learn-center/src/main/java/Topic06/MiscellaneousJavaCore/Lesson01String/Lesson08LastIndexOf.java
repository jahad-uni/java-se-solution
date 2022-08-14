package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson08LastIndexOf {

    public static void main(String[] args) {

        // ********** Java String lastIndexOf() Method **********
        String str1 = new String("This is a Beginners Java tutorial");
        String str2 = new String("Beginners");
        String str3 = new String("Java");
        String str4 = new String("Javas");
        System.out.println("Last 'J' in str1: "+str1.lastIndexOf('J'));
        System.out.println("Last 'J' in str1 whose index<=15:"+str1.lastIndexOf('J', 15));
        System.out.println("Last 'J' in str1 whose index<=30:"+str1.lastIndexOf('J', 20));
        System.out.println("Last occurrence of str2 in str1:"+str1.lastIndexOf(str2));
        System.out.println("Last occurrence of str2 in str1 before 15:"+str1.lastIndexOf(str2, 15));
        System.out.println("Last occurrence of str3 in str1:"+str1.lastIndexOf(str3));
        System.out.println("Last occurrence of str4 in str1"+str1.lastIndexOf(str4));
        System.out.println("Last occurrence of 'is' in str1:"+str1.lastIndexOf("is"));
        System.out.println("Last occurrence of 'is' in str1 before 4:"+str1.lastIndexOf("is", 4));
    }
}
