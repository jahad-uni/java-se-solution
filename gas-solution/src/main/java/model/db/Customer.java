package model.db;

import lombok.Data;

@Data
 public class Customer {

    private Long id;
    private String name;
    private String family;
    private short age;
}
