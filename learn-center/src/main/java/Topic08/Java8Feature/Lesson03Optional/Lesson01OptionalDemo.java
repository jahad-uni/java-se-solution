package Topic08.Java8Feature.Lesson03Optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Lesson01OptionalDemo {
    public static void main(String[] args) {
        //of, empty, ofNullable

        // create empty object
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //using of when sure your value not null otherwise get NullPointerException
        String email = "f.noori.niaraki@gmail.com";
        Optional<String> emailOptional = Optional.of(email);
        System.out.println(emailOptional);

        //using to create object and if object is null not throw exception and create empty optional
        Optional<String> stringOptional = Optional.ofNullable(null);
        System.out.println(stringOptional);

         //get element from optional
        System.out.println(emailOptional.get());
        // if optional is empty then get throw NoSuchElementException
        try {
            System.out.println(stringOptional.get());
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }

        //check optional class contains value or not
        if(emailOptional.isPresent())
            System.out.println(emailOptional.get());
        else
            System.out.println("No value Present");

       // check if is empty or null return orElse value
       String defaultOptional1 = stringOptional.orElse("default orElse value");
       System.out.println(defaultOptional1);

       //check if empty or null run lambda
       String defaultOptional2 = stringOptional.orElseGet(()-> "default orElseGet value");
        System.out.println(defaultOptional2);

        //check if empty or null throw exception
        try {
            stringOptional.orElseThrow(() -> new IllegalArgumentException("string is not exist"));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyOpt = Optional.empty();
        // ifPresent
        gender.ifPresent((s)->System.out.println("value is present"));
        emptyOpt.ifPresent((s)->System.out.println("no value present"));

        //filter and map
        String result = " abc ";
        if(result!=null && result.contains("abc"))
            System.out.println(result);

        Optional<String> resultOptional = Optional.of(result);
        resultOptional.filter(res -> res.contains("abc"))
                .map(String::trim)
                .ifPresent((res)->System.out.println(res));


    }
}
