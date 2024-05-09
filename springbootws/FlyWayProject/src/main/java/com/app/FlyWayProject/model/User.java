package com.app.FlyWayProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="register_user")
public class User {
		@Id
		@GeneratedValue
		int id;
		String firstname;
		String lastname;
		String address;
}
