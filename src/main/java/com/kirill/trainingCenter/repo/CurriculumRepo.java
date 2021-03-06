package com.kirill.trainingCenter.repo;

import com.kirill.trainingCenter.domain.Curriculum;

import java.time.LocalDateTime;
import java.util.List;

public interface CurriculumRepo {
    void add(String name, LocalDateTime localDateTime);

    void add(String name);

    List<Curriculum> get();

    Curriculum get(Long id);
}
