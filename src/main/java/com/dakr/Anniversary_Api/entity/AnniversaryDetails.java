package com.dakr.Anniversary_Api.entity;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DetailsTable")
public class AnniversaryDetails {

	@Id
	@Column(name = "DetailsId")
	private int details_id;
	private double price;
	private LocalTime local_time;
	private String img;

}
