package com.nlc.collection.repository.mongo.entity;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "cards")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Card implements Serializable {

	private static final long serialVersionUID = 6925668994322399359L;

//	@Id
//	private String id;
//	private String object;
//	private String oracleId;
//	private List<Long> multiverseIds;
//	private Long mtgoId;
//	private Long mtgoFoilId;
//	private Long tcgplayerId;
	private String name;
//	private boolean highresImage;
	private Image image_uris;
	private String mana_cost;
	private Integer cmc;
//	private String releasedAt;
	private String type_line;
	private String oracle_text;
	private String loyalty;
	private List<String> colors;
	private List<String> color_identity;
	private Legality legalities;
//	private List<String> games;
//	private boolean reserved;
//	private boolean foil;
//	private boolean nonfoil;
//	private boolean oversized;
	private boolean promo;
	private boolean reprint;
	private boolean variation;
	private String set;
	private String set_name;
	private String set_type;
//	private String setUri;
//	private String setSearchUri;
//	private String scryfallSetUri;
//	private String rulingsUri;
//	private String printsSearchUri;
	private String collector_number;
	private String flavor_text;
//	private String watermark;
//	private String frameEffect;
	private String power;
	private String toughness;
	private boolean digital;
	private String rarity;
//	private String illustrationId;
//	private String cardBackId;
	private String artist;
	private String border_color;
	private String frame;
	private boolean full_art;
	private boolean textless;
	private boolean booster;
//	private boolean storySpotlight;
	private List<String> promo_types;
//	private Long edhrecRank;
//	private RelatedUrl relatedUris;

}
