package com.robertogs.mytasks.board.rest.controller;

import com.robertogs.mytasks.board.core.models.Board;
import com.robertogs.mytasks.board.rest.dto.response.BoardResponse;
import com.robertogs.mytasks.board.rest.mapper.BoardMapper;
import com.robertogs.mytasks.board.ports.in.InsertBoardInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/boards")
public class BoardController {

    @Autowired
    private InsertBoardInputPort insertBoardInputPort;

    @GetMapping("/{id}")
    public ResponseEntity<BoardResponse> findById(@PathVariable("id") final Long id){
        var board = insertBoardInputPort.insert(new Board(1L,"TESTE","TESTE"));
        return ResponseEntity.status(HttpStatus.OK).body(BoardMapper.convert(new Board(1L,"TESTE","TESTE")));
    }
}
