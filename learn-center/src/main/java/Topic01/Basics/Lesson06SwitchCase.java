package Topic01.Basics;

public class Lesson06SwitchCase {
}

class SwitchCase {

    public static void main(String[] args){
        int i=2;
        switch(i)
        {
            case 1:
                System.out.println("Case1 ");
            case 2:
                System.out.println("Case2 ");
            case 3:
                System.out.println("Case3 ");
            case 4:
                System.out.println("Case4 ");
            default:
                System.out.println("Default ");
        }
    }
}


class SwitchCaseWithBreak {

    public static void main(String args[]){
        int i=2;
        switch(i)
        {
            case 1:
                System.out.println("Case1 ");
                break;
            case 2:
                System.out.println("Case2 ");
                break;
            case 3:
                System.out.println("Case3 ");
                break;
            case 4:
                System.out.println("Case4 ");
                break;
            default:
                System.out.println("Default ");
        }
    }
}
