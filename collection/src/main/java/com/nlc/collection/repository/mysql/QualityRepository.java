package com.nlc.collection.repository.mysql;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nlc.collection.repository.mysql.entity.Quality;

public interface QualityRepository extends PagingAndSortingRepository<Quality, Integer> {

	@Override
	List<Quality> findAll();

}
