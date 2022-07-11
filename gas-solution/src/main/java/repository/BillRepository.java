package repository;

import repository.entity.BillEntity;

import java.util.List;

public interface BillRepository {

    BillEntity createBillEntity(BillEntity billEntity);
    List<BillEntity> createBillEntityList(List<BillEntity> billEntityList);
}
