package com.robertogs.mytasks.board.integrations;

import com.robertogs.mytasks.board.core.models.Task;

public interface TaskClientProvider {
    Task findTasksByBoard(final Long boardId);
}
