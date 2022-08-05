package com.chess.backendchess;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.naming.Name;
import java.util.Collection;
import java.util.List;

public interface OpeningRepository extends JpaRepository<Opening, Long> {

    List<NameView> findBy();

}
