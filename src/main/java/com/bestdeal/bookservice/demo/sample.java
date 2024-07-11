package com.bestdeal.bookservice.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loom")
public class sample {

    @GetMapping("/sample")
    public ResponseEntity<String> searchPosts() {
        return ResponseEntity.ok("Ok");
    }


}
