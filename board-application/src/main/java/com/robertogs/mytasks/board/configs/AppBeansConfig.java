package com.robertogs.mytasks.board.configs;

import com.robertogs.mytasks.board.BoardServiceApplication;
import com.robertogs.mytasks.board.core.usecase.InsertBoardUseCase;
import com.robertogs.mytasks.board.persistence.adapters.InsertBoardAdapter;
import com.robertogs.mytasks.board.persistence.repositories.BoardJpaRepository;
import com.robertogs.mytasks.board.ports.in.InsertBoardInputPort;
import com.robertogs.mytasks.board.ports.out.InsertBoardOutputPort;
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

}
