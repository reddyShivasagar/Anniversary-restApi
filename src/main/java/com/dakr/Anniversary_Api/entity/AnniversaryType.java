package com.dakr.Anniversary_Api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="AnniversaryTypeTable")
public class AnniversaryType {

	@Id
	@Column(name="AnniversaryId")
	private int anniType_id;
	private String best_sellerAnni;
	private String anni_cakes;
	private String anni_flowers;
	private String first_anniCake;
	private String chocol_bouquet;
	private String twentyFifth_anni_cakes;
}
