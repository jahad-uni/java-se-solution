package Topic04.Collections.Lesson01ArrayList.Lesson03ArrayListAddOrRemove;

import java.util.ArrayList;

public class Lesson03AppendCollectionElementsToArrayList {
    public static void main(String[] args) {

        // words of String type
        ArrayList<String> words = new ArrayList<>();
        words.add("Hi");
        words.add("hello");
        words.add("String");
        words.add("Test");
        System.out.println("words before addAll:" + words);

        // wordList of String Type
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Text1");
        wordList.add("Text2");
        wordList.add("Text3");
        wordList.add("Text4");

        // Adding wordList into words
        words.addAll(wordList);
        System.out.println("words after addAll:" + words);
    }
}
