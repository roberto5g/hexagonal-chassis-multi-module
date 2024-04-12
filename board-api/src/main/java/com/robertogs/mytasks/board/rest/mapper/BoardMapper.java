package com.robertogs.mytasks.board.rest.mapper;

import com.robertogs.mytasks.board.core.models.User;
import com.robertogs.mytasks.board.rest.dto.request.BoardRequest;
import com.robertogs.mytasks.board.rest.dto.response.BoardResponse;
import com.robertogs.mytasks.board.core.models.Board;

public class BoardMapper {

    public static Board convert(BoardRequest boardRequest){
        Board board = new Board();
        board.setOwner(new User(1L,"teste","teste"));
        board.setTitle(boardRequest.getTitle());
        board.setDescription(boardRequest.getDescription());
        return board;
    }
    public static BoardResponse convert(Board board){
        return BoardResponse.builder().id(board.getId())
                .name(board.getTitle())
                .description(board.getDescription())
                .build();
    }
}
