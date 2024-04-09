package com.robertogs.mytasks.board.persistence.repositories;

import com.robertogs.mytasks.board.core.models.Board;
import com.robertogs.mytasks.board.ports.out.InsertBoardOutputPort;
import com.robertogs.mytasks.board.mapper.BoardMapper;
import com.robertogs.mytasks.board.persistence.entity.BoardEntity;
import com.robertogs.mytasks.board.persistence.repositories.providers.BoardJpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
public class BoardRepositoryImpl implements InsertBoardOutputPort {
    private final BoardJpaRepository boardRepository;
    public BoardRepositoryImpl(BoardJpaRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Board insert(Board board) {
        BoardEntity boardEntity = BoardMapper.convert(board);
        return BoardMapper.convert(boardRepository.save(boardEntity));
    }

}
