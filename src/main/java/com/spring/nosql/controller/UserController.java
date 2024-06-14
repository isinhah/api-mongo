package com.spring.nosql.controller;

import com.spring.nosql.dto.user.UserRequestDTO;
import com.spring.nosql.dto.user.UserResponseDTO;
import com.spring.nosql.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> saveUser(@RequestBody UserRequestDTO dto) {
        return ResponseEntity.ok(userService.saveUserWithAddress(dto));
    }

    @GetMapping
    public ResponseEntity<UserResponseDTO> findUserData(@RequestParam("email") String email) {
        return ResponseEntity.ok(userService.findUserData(email));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteUser(@RequestParam("email") String email) {
        userService.deleteUser(email);
        return ResponseEntity.ok().build();
    }
}
