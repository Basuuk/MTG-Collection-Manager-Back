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

@Entity(name = "Round")
@Table(name = "tournament_rounds")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TournamentRound implements Serializable {

	private static final long serialVersionUID = 8071228941232622181L;

	@EmbeddedId
	private TournamentRoundPK id;

	@ManyToOne
	@JoinColumn(name = "id_player_1", insertable = false, updatable = false)
	private Player player1;

	@ManyToOne
	@JoinColumn(name = "id_player_2", insertable = false, updatable = false)
	private Player player2;

	@ManyToOne
	@JoinColumn(name = "id_tournament", insertable = false, updatable = false)
	private Tournament tournament;

	@ManyToOne
	@JoinColumn(name = "id_deck_2")
	private Deck deck;

	@Column(name = "result", nullable = false, length = 5)
	private String result;

	@Column(name = "round_number", nullable = false)
	private Integer roundNumber;

	@Column(name = "comments", nullable = true, length = 4000)
	private String comments;

}
