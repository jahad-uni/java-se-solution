package repository.impl;

import repository.BillRepository;
import repository.entity.BillEntity;

import java.time.LocalDateTime;
import java.util.List;

public class BillRepositoryImpl implements BillRepository {


    @Override
    public BillEntity createBillEntity(BillEntity billEntity) {
        billEntity.setId(5);
        billEntity.setInsertTime(LocalDateTime.now());
        return billEntity;
    }

    @Override
    public List<BillEntity> createBillEntityList(List<BillEntity> billEntityList) {
        long tempId = 3;
        for(BillEntity billEntity : billEntityList) {
            tempId++;
            billEntity.setId(tempId);
            billEntity.setInsertTime(LocalDateTime.now());
        }
        return billEntityList;
    }
}
