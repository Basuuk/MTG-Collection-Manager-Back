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
@Table(name = "player")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player implements Serializable {

	private static final long serialVersionUID = 8071228941232622181L;

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

}
