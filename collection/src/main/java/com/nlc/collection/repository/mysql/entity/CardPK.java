package com.nlc.collection.repository.mysql.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardPK implements Serializable {

	private static final long serialVersionUID = 3611704245663543317L;

	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "id_mongo")
	private String idMongo;
}
