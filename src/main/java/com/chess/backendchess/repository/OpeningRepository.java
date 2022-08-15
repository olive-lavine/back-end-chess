package com.chess.backendchess.repository;

import com.chess.backendchess.models.Opening;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OpeningRepository extends JpaRepository<Opening, Long> {
    List<Opening> findOpeningsByParentId(Long parentId);
}
