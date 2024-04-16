package com.robertogs.mytasks.board.rest.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardResponse {
    private Long id;
    private String title;
    private String description;
}
