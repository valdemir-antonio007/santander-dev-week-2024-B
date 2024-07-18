package me.dio.domain.service;

import me.dio.domain.model.Bootcamp;

public interface BootCampService {

    Bootcamp findById(Long id);

    Bootcamp create(Bootcamp bootcamp);
}
