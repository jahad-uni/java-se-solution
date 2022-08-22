package Topic06.MiscellaneousJavaCore.Lesson01String;

public class Lesson17Split {

    public static void main(String[] args) {

        // ********** Java String Split() Method **********
        String str = new String("28/12/2013");

        System.out.println("split(String regex):");
        /* Here we are using first variation of java string split method
         which splits the string into substring based on the regular
         expression, there is no limit on the substrings*/

        String[] array1 = str.split("/");
        for (String temp : array1) {
            System.out.println(temp);
        }

         /*Using second variation of split method here. Since the limit is passed
           as 2. This method would only produce two substrings.*/
        System.out.println("split(String regex, int limit) with limit=2:");
        String[] array2 = str.split("/", 2);
        for (String temp : array2) {
            System.out.println(temp);
        }

        System.out.println("split(String regex, int limit) with limit=0:");
        String[] array3 = str.split("/", 0);
        for (String temp : array3) {
            System.out.println(temp);
        }

        /* When we pass limit as negative. The split method works same as the first variation
         because negative limit says that the method returns substrings with no limit.*/
        System.out.println("split(String regex, int limit) with limit=-5:");
        String array4[] = str.split("/", -5);
        for (String temp : array4) {
            System.out.println(temp);
        }


        // ********** Difference between zero and negative limit in java string split method **********
        String s = new String("bbaaccaa");

        //Splitting with limit as 0 excludes trialing empty Strings
        String arr2[] = s.split("a", 0);
        System.out.println("Zero Limit split:");
        for (String str2 : arr2) {
            System.out.println(str2);
        }

        //Splitting with negative limit
        String arr1[] = s.split("a", -1);
        System.out.println("Negative Limit split:");
        for (String strr : arr1) {
            System.out.println(strr);
        }


        // ********** Java String split with multiple delimiters (special characters) **********
        String ss = " ,ab;gh,bc;pq#kk$bb";
        String[] strrr = ss.split("[,;#$]");

        System.out.println("Number of substrings: " + strrr.length);

        for (int i = 0; i < strrr.length; i++) {
            System.out.println("Str[" + i + "]:" + strrr[i]);
        }

    }
}
