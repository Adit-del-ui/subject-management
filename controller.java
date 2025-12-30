package com.example.crud.controller;

import com.example.crud.model.Subject;
import com.example.crud.service.SubjectService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    private final SubjectService service;

    public SubjectController(SubjectService service) {
        this.service = service;
    }

    @PostMapping
    public Subject create(@RequestBody Subject e) {
        return service.save(e);
    }

    @GetMapping
    public List<Subject> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Subject update(@PathVariable Long id, @RequestBody Subject e) {
        return service.update(id, e);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
