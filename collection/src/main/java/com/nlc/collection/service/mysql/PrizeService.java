package com.nlc.collection.service.mysql;

import org.springframework.data.domain.Page;

import com.nlc.collection.repository.mysql.entity.Prize;

public interface PrizeService {

	Page<Prize> findAll(Integer page, Integer size);

}
