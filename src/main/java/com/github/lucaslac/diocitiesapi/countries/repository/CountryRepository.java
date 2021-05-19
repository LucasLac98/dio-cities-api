package com.github.lucaslac.diocitiesapi.countries.repository;

import com.github.lucaslac.diocitiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
