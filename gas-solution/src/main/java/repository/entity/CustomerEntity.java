package repository.entity;

import lombok.Data;

@Data
 public class CustomerEntity extends Entity {


    private String name;
    private String family;
    private short age;

}
