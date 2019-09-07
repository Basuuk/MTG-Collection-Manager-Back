package com.nlc.collection.repository.mysql.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cards")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card implements Serializable {

	private static final long serialVersionUID = 8071228941232622181L;

	@EmbeddedId
	private CardPK id;

	@ManyToOne
    @JoinColumn(name="quality")
	private Quality quality;

	@Column(name = "where_is_it", nullable = true, length = 255)
	private String whereIsIt;

}
