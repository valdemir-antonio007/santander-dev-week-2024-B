package me.dio.domain.service.impl;

import me.dio.domain.model.Bootcamp;
import me.dio.domain.repository.BootcampRepository;
import me.dio.domain.service.BootCampService;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.NoSuchElementException;

@Service
public class BootcampServiceImpl implements BootCampService {
    private final BootcampRepository bootcampRepository;

    public BootcampServiceImpl(BootcampRepository bootcampRepository) {
        this.bootcampRepository = bootcampRepository;
    }


    @Override
    public Bootcamp findById(Long id) {
        return bootcampRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Bootcamp create(Bootcamp bootcamp) {

        return bootcampRepository.save(bootcamp);
    }
}
