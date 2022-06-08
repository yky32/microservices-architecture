package com.quinsic.userservice.repository;

import com.quinsic.userservice.entity.po.Emma;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface EmmaRepository extends JpaRepositoryImplementation<Emma, Long> {
}