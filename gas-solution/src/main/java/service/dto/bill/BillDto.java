package service.dto.bill;

import lombok.Data;

import java.util.Date;

@Data
public class BillDto {

    private long id;
    private long customerId;
    private Date from;
    private Date to;
    private long kwh;
    private double amount;
    private String consumeType;

}
