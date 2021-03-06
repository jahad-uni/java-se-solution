package repository.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BillEntity extends Entity{

    private long customerId;
    private Date from;
    private Date to;
    private long kwh;
    private double amount;
    private String consumeType;  // low , normal, high
}
