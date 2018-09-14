package com.lakshmanan.TrelloCloneBackend.repository;

import com.lakshmanan.TrelloCloneBackend.model.Board;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BoardRepository extends MongoRepository<Board, Integer> {

    @Override
    <S extends Board> S insert(S entity);

    @Override
    List<Board> findAll(Sort sort);
}
