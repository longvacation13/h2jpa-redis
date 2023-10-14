package com.example.demo.longvacation.repository;

import com.example.demo.longvacation.dto.Usr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsrRepository extends JpaRepository<Usr, Long> {
}
