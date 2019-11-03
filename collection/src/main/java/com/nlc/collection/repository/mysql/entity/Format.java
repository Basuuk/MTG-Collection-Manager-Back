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
@Table(name = "format")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Format implements Serializable {

	private static final long serialVersionUID = -8417316519316716272L;

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "description", nullable = false, length = 20)
	private String description;

}
