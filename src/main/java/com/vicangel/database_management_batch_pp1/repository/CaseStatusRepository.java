package com.vicangel.database_management_batch_pp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vicangel.database_management_batch_pp1.repository.entity.AreaEntity;
import com.vicangel.database_management_batch_pp1.repository.entity.CaseStatusEntity;

@Repository
public interface CaseStatusRepository extends JpaRepository<CaseStatusEntity, String> {
}
