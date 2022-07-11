package repository;

import repository.exception.customer.CustomerNotExists;

public interface CustomerRepository {

    void isCustomerExists(long id) throws CustomerNotExists;
}
