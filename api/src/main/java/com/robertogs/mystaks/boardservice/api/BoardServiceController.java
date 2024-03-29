package com.robertogs.mystaks.boardservice.api;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/boards")
public class BoardServiceController {

    @GetMapping
    @Operation(summary = "Get boards")
    public ResponseEntity<String> getBoards(){
        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }
}
