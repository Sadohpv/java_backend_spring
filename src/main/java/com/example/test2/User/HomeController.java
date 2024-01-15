package com.example.test2.User;

import com.example.test2.User.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = " http://localhost:3000")
public class HomeController {
    // Create, Read, Update, Delete
    // Post , Get , Put , Delete
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {

        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> getUser(@PathVariable Integer id) {
        System.out.println("Check Path Variable" + id);
        return ResponseEntity.ok(userRepository.findById(id));
    }
}
