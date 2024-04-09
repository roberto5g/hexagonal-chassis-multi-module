package com.robertogs.mytasks.board.persistence.repositories.providers;

import com.robertogs.mytasks.board.persistence.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardJpaRepository extends JpaRepository<BoardEntity, Long> {
}
