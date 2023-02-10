package com.jdc.app.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.SecondaryTables;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_tbl")
@SecondaryTables({
	@SecondaryTable(name = "auth_tbl"),
	@SecondaryTable(name = "user_info")
})
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", initialValue = 50)
	private int id;
	
	@Enumerated(EnumType.STRING)
	@Column(table = "user_info")
	private Gender gender;
	
//	@Temporal(TemporalType.TIMESTAMP)
	@Column(table = "user_info")
	private LocalDateTime dob;
	
	@Column(table = "auth_tbl")
	private Authority auth;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public Authority getAuth() {
		return auth;
	}

	public void setAuth(Authority auth) {
		this.auth = auth;
	}

	public enum Gender {
		Male, Female, Other
	}

}
