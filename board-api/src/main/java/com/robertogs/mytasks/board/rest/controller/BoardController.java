package com.robertogs.mytasks.board.rest.controller;

import com.robertogs.mytasks.board.core.models.Board;
import com.robertogs.mytasks.board.ports.in.InsertBoardInputPort;
import com.robertogs.mytasks.board.rest.dto.request.BoardRequest;
import com.robertogs.mytasks.board.rest.dto.response.BoardResponse;
import com.robertogs.mytasks.board.rest.mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/boards")
public class BoardController {

    private final InsertBoardInputPort insertBoardInputPort;

    public BoardController(InsertBoardInputPort insertBoardInputPort) {
        this.insertBoardInputPort = insertBoardInputPort;
    }

    @PostMapping
    public ResponseEntity<BoardResponse> create(@RequestBody BoardRequest boardRequest){
        var board = insertBoardInputPort.insert(BoardMapper.convert(boardRequest));
        return ResponseEntity.status(HttpStatus.CREATED).body(BoardMapper.convert(board));
    }

}
