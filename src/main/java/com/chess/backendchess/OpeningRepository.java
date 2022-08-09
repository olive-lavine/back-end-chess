package com.chess.backendchess;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.naming.Name;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface OpeningRepository extends JpaRepository<Opening, Long> {

    List<NameView> findBy();

    List<Opening> findOpeningsByParentId(Long parentId);
}
