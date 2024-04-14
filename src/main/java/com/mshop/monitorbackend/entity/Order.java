package com.mshop.monitorbackend.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double amount;
	private String address;
	private String phone;
	private Date orderDate;
	private int status;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
}
