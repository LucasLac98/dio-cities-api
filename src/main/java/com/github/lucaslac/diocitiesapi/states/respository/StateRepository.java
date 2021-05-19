package com.github.lucaslac.diocitiesapi.states.respository;

import com.github.lucaslac.diocitiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
