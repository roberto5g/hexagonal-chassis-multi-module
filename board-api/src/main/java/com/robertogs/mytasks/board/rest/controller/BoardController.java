package com.robertogs.mytasks.board.rest.controller;

import com.robertogs.mytasks.board.core.models.Board;
import com.robertogs.mytasks.board.ports.in.InsertBoardInputPort;
import com.robertogs.mytasks.board.rest.dto.response.BoardResponse;
import com.robertogs.mytasks.board.rest.mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/boards")
public class BoardController {

    private final InsertBoardInputPort insertBoardInputPort;

    public BoardController(InsertBoardInputPort insertBoardInputPort) {
        this.insertBoardInputPort = insertBoardInputPort;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BoardResponse> findById(@PathVariable("id") final Long id){
        var board = insertBoardInputPort.insert(new Board(1L,"TESTE","TESTE"));
        return ResponseEntity.status(HttpStatus.OK).body(BoardMapper.convert(board));
    }
}
