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

@Entity(name = "PDT")
@Table(name = "player_deck_tournament")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDeckTournament implements Serializable {

	private static final long serialVersionUID = 8071228941232622181L;

	@EmbeddedId
	private PlayerDeckTournamentPK id;

	@ManyToOne
	@JoinColumn(name = "id_player", insertable = false, updatable = false)
	private Player player;

	@ManyToOne
	@JoinColumn(name = "id_tournament", insertable = false, updatable = false)
	private Tournament tournament;

	@ManyToOne
	@JoinColumn(name = "id_deck", insertable = false, updatable = false)
	private Deck deck;

	@Column(name = "won_prize")
	private Boolean wonPrize;

	@Column(name = "final_result", nullable = true, length = 6)
	private String finalResult;

}
