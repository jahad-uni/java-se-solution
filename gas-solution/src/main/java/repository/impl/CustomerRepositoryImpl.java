package repository.impl;

import repository.CustomerRepository;
import repository.exception.customer.CustomerNotExists;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public void isCustomerExists(long id) throws CustomerNotExists {
        if(id == 1L || id == 2L || id ==3L)
            throw new CustomerNotExists("Customer Not Found");
    }
}
