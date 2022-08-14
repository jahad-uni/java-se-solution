package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson12Contains {

    public static void main(String[] args) {

        // ********** Java String contains() method **********
        String str = "Do you like watching Game of Thrones";
        System.out.println(str.contains("like"));

        System.out.println(str.contains("Like"));
        System.out.println(str.contains("Game"));
        System.out.println(str.contains("Game of"));

        // ********** Using Java String contains() method in the if-else **********
        if(str.contains("Game")){
            System.out.println("The word example is found in given string");
        }
        else{
            System.out.println("The word example is not found in the string");
        }
    }
}
