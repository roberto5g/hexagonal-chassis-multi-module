package com.robertogs.mytasks.board.configs;

import com.robertogs.mytasks.board.BoardServiceApplication;
import com.robertogs.mytasks.board.core.usecase.FindBoardByIdUseCase;
import com.robertogs.mytasks.board.core.usecase.InsertBoardUseCase;
import com.robertogs.mytasks.board.integrations.TaskClient;
import com.robertogs.mytasks.board.integrations.adapters.TaskClientAdapter;
import com.robertogs.mytasks.board.persistence.adapters.FindBoardByIdAdapter;
import com.robertogs.mytasks.board.persistence.adapters.InsertBoardAdapter;
import com.robertogs.mytasks.board.persistence.repositories.BoardJpaRepository;
import com.robertogs.mytasks.board.ports.in.FindBoardByIdInputPort;
import com.robertogs.mytasks.board.ports.in.InsertBoardInputPort;
import com.robertogs.mytasks.board.ports.out.FindBoardByIdOutputPort;
import com.robertogs.mytasks.board.ports.out.InsertBoardOutputPort;
import com.robertogs.mytasks.board.ports.out.integrations.FindTasksByBoardIdOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = BoardServiceApplication.class)
public class AppBeansConfig {

    @Bean
    public InsertBoardInputPort insertBoardInputPort(InsertBoardOutputPort insertBoardOutputPort){
        return new InsertBoardUseCase(insertBoardOutputPort);
    }

    @Bean
    public InsertBoardOutputPort insertBoardOutputPort(BoardJpaRepository boardJpaRepository){
        return new InsertBoardAdapter(boardJpaRepository);
    }

    @Bean
    public FindBoardByIdInputPort findBoardByIdInputPort(FindBoardByIdOutputPort findBoardByIdOutputPort,
                                                         FindTasksByBoardIdOutputPort findTasksByBoardIdOutputPort){
        return new FindBoardByIdUseCase(findBoardByIdOutputPort, findTasksByBoardIdOutputPort);
    }

    @Bean
    public FindBoardByIdOutputPort findBoardByIdOutputPort(BoardJpaRepository boardJpaRepository){
        return new FindBoardByIdAdapter(boardJpaRepository);
    }

    @Bean
    public FindTasksByBoardIdOutputPort findTasksByBoardId(TaskClient taskClient){
        return new TaskClientAdapter(taskClient);
    }

}
