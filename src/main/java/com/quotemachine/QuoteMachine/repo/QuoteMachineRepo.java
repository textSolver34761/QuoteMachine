package com.quotemachine.QuoteMachine.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quotemachine.QuoteMachine.model.Quotes;

@Repository
public interface QuoteMachineRepo extends CrudRepository<Quotes, Long> {}
