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
@Table(name = "carts")
public class Cart implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double amount;
	private String address;
	private String phone;
	private Boolean status;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
}
