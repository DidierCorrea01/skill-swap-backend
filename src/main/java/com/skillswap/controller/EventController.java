package com.skillswap.controller;

import com.skillswap.model.Event;
import com.skillswap.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping("/")
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @PostMapping("/add")
    public Event addEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }
}
