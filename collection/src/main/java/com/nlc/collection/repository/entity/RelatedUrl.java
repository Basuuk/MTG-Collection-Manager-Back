package com.nlc.collection.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RelatedUrl {

	private String gatherer;
	private String tcgplayerDecks;
	private String edhrec;
	private String mtgtop8;
}
