package com.nlc.collection.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Legality {

	private String standard;
	private String future;
	private String frontier;
	private String modern;
	private String legacy;
	private String pauper;
	private String vintage;
	private String penny;
	private String commander;
	private String duel;
	private String oldschool;
}
