package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User {

	@Id
	@Column(name="user_id")
	private Long id;
	private String username;
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="users_roles",
			joinColumns = @JoinColumn(name="user_id"),
			 inverseJoinColumns = @JoinColumn(name="role_id")
	)
	private List<Role> roles;
}
