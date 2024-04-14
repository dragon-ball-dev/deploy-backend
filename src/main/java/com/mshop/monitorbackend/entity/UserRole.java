package com.mshop.monitorbackend.entity;

import java.io.Serializable;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_roles")
public class UserRole implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne()
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne()
	@JoinColumn(name = "role_id")
	private AppRole roles;
}
