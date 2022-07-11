package service;

import repository.entity.BillEntity;
import repository.exception.customer.CustomerNotExists;
import service.dto.bill.BillDto;

import java.util.List;

public interface BillService {

    List<BillDto> createBillList(List<BillDto> billDtoList) throws CustomerNotExists;

}
