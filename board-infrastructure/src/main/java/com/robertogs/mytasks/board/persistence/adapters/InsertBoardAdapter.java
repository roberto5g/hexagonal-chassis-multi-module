package com.robertogs.mytasks.board.persistence.adapters;

import com.robertogs.mytasks.board.core.models.Board;
import com.robertogs.mytasks.board.ports.out.InsertBoardOutputPort;
import com.robertogs.mytasks.board.mapper.BoardMapper;
import com.robertogs.mytasks.board.persistence.entity.BoardEntity;
import com.robertogs.mytasks.board.persistence.repositories.BoardJpaRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class InsertBoardAdapter implements InsertBoardOutputPort {
    private final BoardJpaRepository boardRepository;
    public InsertBoardAdapter(BoardJpaRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public Board insert(Board board) {
        BoardEntity boardEntity = BoardMapper.convert(board);
        return BoardMapper.convert(boardRepository.save(boardEntity));
    }

}
