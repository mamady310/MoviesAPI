package com.moviesAPI.moviesAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> postBody) {
        return new ResponseEntity<Review>(reviewService.createReview(postBody.get("reviewBody"), postBody.get("imdbId")),
        HttpStatus.CREATED);
    }
}
