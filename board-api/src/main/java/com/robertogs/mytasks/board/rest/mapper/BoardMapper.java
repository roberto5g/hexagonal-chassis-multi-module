package com.robertogs.mytasks.board.rest.mapper;

import com.robertogs.mytasks.board.rest.dto.response.BoardResponse;
import com.robertogs.mytasks.board.core.models.Board;

public class BoardMapper {
    public static BoardResponse convert(Board board){
        return BoardResponse.builder().id(board.getId())
                .name(board.getName())
                .description(board.getDescription())
                .build();
    }
}
