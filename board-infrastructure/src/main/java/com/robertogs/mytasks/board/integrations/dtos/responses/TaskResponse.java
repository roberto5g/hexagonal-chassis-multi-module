package com.robertogs.mytasks.board.integrations.dtos.responses;

import com.robertogs.mytasks.board.core.enums.StatusTask;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TaskResponse {
    private Long id;
    private String title;
    private String description;
}
