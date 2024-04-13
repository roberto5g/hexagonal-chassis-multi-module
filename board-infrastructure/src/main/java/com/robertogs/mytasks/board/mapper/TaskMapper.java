package com.robertogs.mytasks.board.mapper;

import com.robertogs.mytasks.board.core.models.Task;
import com.robertogs.mytasks.board.integrations.dtos.responses.TaskResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TaskMapper {
    TaskMapper INSTANCE = Mappers.getMapper( TaskMapper.class );
    List<Task> toTasks(List<TaskResponse> tasks);
}
