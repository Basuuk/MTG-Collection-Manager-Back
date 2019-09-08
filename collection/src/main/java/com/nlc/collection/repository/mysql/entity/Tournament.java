package com.nlc.collection.repository.mysql.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tournament")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tournament implements Serializable {

	private static final long serialVersionUID = 8071228941232622181L;

	@Id
	@Column(name = "id")
	private Integer id;

	@ManyToOne
    @JoinColumn(name="type")
	private TournamentType type;

	@Column(name = "date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(name = "comments", nullable = true, length = 4000)
	private String comments;

	@Column(name = "location", nullable = false, length = 100)
	private String location;

	@Column(name = "title", nullable = false, length = 100)
	private String title;
}
