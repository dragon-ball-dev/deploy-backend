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
@Table(name = "users")
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String name;
	private String email;
	private String password;
	private Boolean gender;
	private String address;
	private String phone;
	private String image;
	private Date registerDate;
	private Boolean status;
	private Boolean role;
}
