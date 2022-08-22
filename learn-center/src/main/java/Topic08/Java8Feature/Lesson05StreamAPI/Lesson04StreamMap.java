package Topic08.Java8Feature.Lesson05StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lesson04StreamMap {
    public static void main(String[] args) {

        List<String> alphaList = Arrays.asList("a", "b", "c", "d");

        // before java 8
        List<String> alphaListUpper = new ArrayList<>();
        for (String alpha : alphaList)
            alphaListUpper.add(alpha.toUpperCase());
        System.out.println(alphaList);
        System.out.println(alphaListUpper);

        //after java 8
        List<String> collect = alphaList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);


        // map user list to userDTO list before java 8
        System.out.println("map user list to userDTO list before java 8");
        List<User> users = new ArrayList<>();
        users.add(new User(1, "farhad", "123456", "farhad@gmail.com"));
        users.add(new User(2, "mehrdad", "123456", "mehrdad@gmail.com"));
        users.add(new User(3, "farzad", "123456", "farzad@gmail.com"));

        List<UserDTO> userDTOS = new ArrayList<>();
        for (User user : users)
            userDTOS.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));

        for (UserDTO userDTO : userDTOS)
            System.out.println(userDTO);

        // map user list to userDTO list after java 8
        System.out.println("map user list to userDTO list With Anonymous Class");
        users.stream().map(new Function<User, UserDTO>() {

            @Override
            public UserDTO apply(User user) {
                return new UserDTO(user.getId(), user.getUserName(), user.getEmail());
            }
        }).forEach(System.out::println);


        System.out.println("map user list to userDTO list With Lambda Expression");
        users.stream()
                .map(user -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
                .forEach((userDTOh) -> {
                    System.out.println(userDTOh);
                });
    }
}

class User {
    private int id;
    private String userName;
    private String password;
    private String email;

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class UserDTO {

    private int id;
    private String userName;
    private String email;

    public UserDTO(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
