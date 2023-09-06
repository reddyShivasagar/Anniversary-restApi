package com.dakr.Anniversary_Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dakr.Anniversary_Api.entity.AnniversaryCollection;

@Repository
public interface AnniCollectionRepository extends JpaRepository<AnniversaryCollection,Integer> {

}
