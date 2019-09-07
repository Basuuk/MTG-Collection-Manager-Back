package com.nlc.collection.repository.mysql.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrizePK implements Serializable {

	private static final long serialVersionUID = 3611704245663543317L;

	@Column(name = "id_player")
	private Integer idPlayer;

	@Column(name = "id_tournament")
	private Integer idTournament;
}
