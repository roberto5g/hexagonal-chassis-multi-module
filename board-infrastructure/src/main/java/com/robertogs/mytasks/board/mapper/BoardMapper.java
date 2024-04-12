package com.robertogs.mytasks.board.mapper;

import com.robertogs.mytasks.board.core.models.Board;
import com.robertogs.mytasks.board.persistence.entity.BoardEntity;

public class BoardMapper {

    public static BoardEntity convert(Board board){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setId(board.getId());
        boardEntity.setTitle(board.getTitle());
        boardEntity.setDescription(board.getDescription());
        boardEntity.setOwnerId(board.getOwner().getId());
        return boardEntity;
    }

    public static Board convert(BoardEntity boardEntity){
        Board board = new Board();
        board.setId(boardEntity.getId());
        return board;
    }
}
