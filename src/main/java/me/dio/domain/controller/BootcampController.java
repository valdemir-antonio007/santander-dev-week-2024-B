package me.dio.domain.controller;

import me.dio.domain.model.Bootcamp;
import me.dio.domain.service.BootCampService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/bootcamps")
public class BootcampController {

    private final BootCampService bootCampService;

    public BootcampController(BootCampService bootCampService) {
        this.bootCampService = bootCampService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bootcamp> findById(@PathVariable Long id){
        var bootcamp = bootCampService.findById(id);
        return ResponseEntity.ok(bootcamp);
    }

    @PostMapping
    public ResponseEntity<Bootcamp> create(@RequestBody Bootcamp bootcampToCreate){
        var bootcamp = bootCampService.create(bootcampToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(bootcamp.getId())
                .toUri();
        return ResponseEntity.created(location).body(bootcamp);
    }
}
