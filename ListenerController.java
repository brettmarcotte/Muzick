package com.example.muzick.controllers;

import com.example.muzick.models.Listener;
import com.example.muzick.repositories.ListenerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/listeners") //default format: "/api/{plural entity name}"
public class ListenerController {

    @Autowired
    private ListenerRepository listenerRepository;

    @GetMapping("/test")
    public ResponseEntity<?> testRoute() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

    //Create, Read, Update, Delete
    //Create = POST
    //Read = GET
    //Update = PUT* POST
    //Delete = DELETE

    @PostMapping("/")
    public ResponseEntity<Listener> createListener(@RequestBody Listener newListener) {
        Listener listener = listenerRepository.save(newListener);

        return new ResponseEntity<>(listener, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllListeners() {
        List<Listener> listeners = listenerRepository.findAll();
        return new ResponseEntity<>(listeners, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOneListener(@PathVariable Long id) {
        //listenerRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        Optional<Listener> maybeListener = listenerRepository.findById(id);

        if (maybeListener.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(maybeListener.get(), HttpStatus.OK);
    }
}
