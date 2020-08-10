package com.sha.microservicecoursemanagement.repository;

import com.sha.microservicecoursemanagement.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

     List<Transaction> findAllByUserId(Long userId);

     List<Transaction> findAllByCourseId(Long courseId);
}
