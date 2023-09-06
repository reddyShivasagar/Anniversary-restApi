package com.dakr.Anniversary_Api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ReletionTable")
public class AnniversaryRelation {

	@Id
	@Column(name="RelationId")
	private int relation_id;
	private String wife;
	private String husband;
	private String parents;
	private String bhaiya_bhabhi;
	private String didi_jiju;
	private String grand_parents;
}
