package service.impl;

import repository.BillRepository;
import repository.CustomerRepository;
import repository.exception.customer.CustomerNotExists;
import service.BillService;
import service.dto.bill.BillDto;

import java.util.ArrayList;
import java.util.List;

public class BillServiceImpl implements BillService {

    private BillRepository billRepository;
    private CustomerRepository customerRepository;

    public BillServiceImpl(BillRepository billRepository,
                           CustomerRepository customerRepository) {
        this.billRepository = billRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public List<BillDto> createBillList(List<BillDto> billDtoList) throws CustomerNotExists {

        List<BillDto> billDtoListResult = new ArrayList<>();
        for (BillDto billDto : billDtoList) {
            // Validation
            this.customerRepository.isCustomerExists(billDto.getCustomerId());
            // Business Rules
            this.fillAmount(billDto);
            this.fillConsumeType(billDto);

            billDtoListResult.add(billDto);
        }



        return billDtoListResult;
    }

    private void fillAmount(BillDto billDto) {
        billDto.setAmount(billDto.getKwh() * 0.2f);
    }

    private void fillConsumeType(BillDto billDto) {

    }
}
