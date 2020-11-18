package com.rgayer.pipeline;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Pipeline {

    @GetMapping("/pipeline")
    public ResponseEntity<String> getPipeline() {
        return ResponseEntity.ok("Meu pipeline");
    }

}
