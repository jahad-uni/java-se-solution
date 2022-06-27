package Topic01.Basics;

public class Lesson10Continue {
}

class ContinueInForLoop {

    public static void main(String[] args){
        for (int j=0; j<=6; j++)
        {
            if (j==4)
            {
                continue;
            }

            System.out.print(j+" ");
        }
    }
}

class ContinueInWhileLoop {

    public static void main(String[] args){
        int counter=10;
        while (counter >=0)
        {
            if (counter==7)
            {
                counter--;
                continue;
            }
            System.out.print(counter+" ");
            counter--;
        }
    }
}

class ContinueInDoWhile {

    public static void main(String[] args){
        int j=0;
        do
        {
            if (j==7)
            {
                j++;
                continue;
            }
            System.out.print(j+ " ");
            j++;
        }while(j<10);

    }
}

