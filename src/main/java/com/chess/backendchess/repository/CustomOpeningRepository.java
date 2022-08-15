package com.chess.backendchess.repository;

import com.chess.backendchess.models.CustomOpening;
import com.chess.backendchess.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface CustomOpeningRepository extends JpaRepository<CustomOpening, Long> {
    Set<CustomOpening> findCustomOpeningsByPlayer(Optional<Player> player);
}
