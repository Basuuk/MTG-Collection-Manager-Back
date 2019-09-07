package com.nlc.collection.repository.mysql;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nlc.collection.repository.mysql.entity.Prize;
import com.nlc.collection.repository.mysql.entity.PrizePK;

public interface PrizeRepository extends PagingAndSortingRepository<Prize, PrizePK> {

}
