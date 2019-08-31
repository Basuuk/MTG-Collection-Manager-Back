package com.nlc.collection.repository.entity;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "cards")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card implements Serializable {

	private static final long serialVersionUID = 6925668994322399359L;

	@Id
	private String id;
	private String object;
	private String oracleId;
	private List<Long> multiverseIds;   
	private Long mtgoId;
	private Long mtgoFoilId;
	private Long tcgplayerId;
	private String name;
	private Image imageUris;
	private String manaCost;
	private Integer cmc;
	private String typeLine;
	private String oracle_text;
	private String loyalty;
	private List<String> colors;
	private List<String> color_identity;
	private Legality legalities;
	private List<String> games;
	private boolean reserved;
	private boolean foil;
	private boolean nonfoil;
	private boolean oversized;
	private boolean promo;
	private boolean reprint;
	private boolean variation;
	private String set;
	private String setName;
	private String setType;
	private String setUri;
	private String setSearch_uri;
	private String scryfallSetUri;
	private String rulingsUri;
	private String printsSearchUri;
	private String collectorNumber;
	private String flavorText;
	private String watermark;
	private String frameEffect;
	private String power;
	private String toughness;
	private boolean digital;
	private String rarity;
	private String illustrationId;
	private String cardBackId;
	private String artist;
	private String borderColor;
	private String frame;
	private boolean fullArt;
	private boolean textless;
	private boolean booster;
	private boolean storySpotlight;
	private List<String> promoTypes;
	private Long edhrecRank;
	private RelatedUrl relatedUris;  
	
}
