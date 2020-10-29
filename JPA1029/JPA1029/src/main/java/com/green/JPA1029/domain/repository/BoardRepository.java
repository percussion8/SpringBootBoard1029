package com.green.JPA1029.domain.repository;

import com.green.JPA1029.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
