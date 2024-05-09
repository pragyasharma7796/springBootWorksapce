package com.app.eshop.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name ="exercis_Table")
public class Exercises implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private Long grantId;
	private Double vestedOption;
	private Double soldOption;
}
