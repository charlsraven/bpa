package com.example.demo.repository;

import com.example.demo.model.Billie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillieRepository extends JpaRepository<Billie, Long> {
}
