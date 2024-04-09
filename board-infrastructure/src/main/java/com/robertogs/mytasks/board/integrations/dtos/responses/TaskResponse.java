package com.robertogs.mytasks.board.integrations.dtos.responses;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TaskResponse {
    private Long id;
    private String name;
    private String description;
}
