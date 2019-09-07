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
@Table(name = "prizes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prize implements Serializable {

	private static final long serialVersionUID = 8071228941232622181L;

	@EmbeddedId
	private PrizePK id;

	@ManyToOne
	@JoinColumn(name = "id_player", insertable = false, updatable = false)
	private Player player;

	@ManyToOne
	@JoinColumn(name = "id_tournament", insertable = false, updatable = false)
	private Tournament tournament;

	@Column(name = "money")
	private Double money;

	@Column(name = "other", nullable = true, length = 255)
	private String other;

}
