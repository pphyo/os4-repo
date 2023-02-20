package com.jdc.app.model.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.OneToMany;

@Entity
@Table(name = "category")
@Data
public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	@Basic(optional = false)
	@Column(length = 20, unique = true, nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "category")
	private List<Product> products;

}
