package com.example.challengeTopic2.dao;

import com.example.challengeTopic2.domain.Printer;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Printer, Long> {
}
