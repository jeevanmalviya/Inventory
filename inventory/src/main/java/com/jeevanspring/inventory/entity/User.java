package com.jeevanspring.inventory.entity;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name= "user" ,uniqueConstraints = @UniqueConstraint(columnNames ="email"))
public class User {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	@Column(name ="first_name")
	private String firstName;
	@Column(name ="last_name")
	private String lastName;
	private String email;
	private String password;
	private Collection role;
	public User(Long id, String firstName, String lastName, String email, String password, Collection role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	

}
