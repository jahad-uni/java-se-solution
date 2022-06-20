package model.db;

import lombok.Data;
import java.time.LocalDate;

@Data
public class Bill {

    private long id;
    private long customerId;
    private LocalDate from;
    private LocalDate to;
    private long kwh;
    private double amount;
    private String consumeType;  // low , normal, high
}
