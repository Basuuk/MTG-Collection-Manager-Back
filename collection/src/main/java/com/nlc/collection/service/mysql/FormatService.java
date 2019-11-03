package com.nlc.collection.service.mysql;

import org.springframework.data.domain.Page;

import com.nlc.collection.repository.mysql.entity.Format;

public interface FormatService {

	Page<Format> findAll(Integer page, Integer size);

}
