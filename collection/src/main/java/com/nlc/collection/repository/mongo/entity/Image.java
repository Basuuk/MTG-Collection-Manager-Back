package com.nlc.collection.repository.mongo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {

	private String small;
	private String normal;
	private String border_crop;
}
