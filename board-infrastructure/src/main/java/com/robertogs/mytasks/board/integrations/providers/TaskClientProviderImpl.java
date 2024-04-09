package com.robertogs.mytasks.board.integrations.providers;

import com.robertogs.mytasks.board.core.models.Task;
import com.robertogs.mytasks.board.integrations.TaskClientProvider;
import com.robertogs.mytasks.board.integrations.TaskClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class TaskClientProviderImpl implements TaskClientProvider {

    private TaskClient taskClient;

    @Override
    public Task findTasksByBoard(Long boardId) {
        var taskResponse = taskClient.findTasksByBoardId(boardId);
        return null;
    }
}
