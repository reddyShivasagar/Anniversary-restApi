package com.dakr.Anniversary_Api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="AnniversaryCollectionTable")
public class AnniversaryCollection {

	@Id
	@Column(name="CollectionId")
	private int anni_collectionId;
	private String heartShape_gifts;
	private String cakes;
	private String flowers;
	private String personalised_gift;
	private String combos;
	private String chocolates;
	private String plants;
	private String primium_gifts;
	private String express_delivery;
}
