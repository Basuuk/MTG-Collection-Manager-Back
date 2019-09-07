package com.nlc.collection.repository.mysql.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tournament_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TournamentType implements Serializable {

	private static final long serialVersionUID = 8071228941232622181L;

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "type", nullable = false, length = 25)
	private String type;
}
