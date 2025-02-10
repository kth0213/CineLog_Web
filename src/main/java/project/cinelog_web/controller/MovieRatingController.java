package project.cinelog_web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import project.cinelog_web.model.Movie;
import project.cinelog_web.model.MovieRating;
import project.cinelog_web.model.User;
import project.cinelog_web.service.MovieRatingService;
import project.cinelog_web.service.MovieService;
import project.cinelog_web.service.UserService;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/ratings")
public class MovieRatingController {

    private final MovieRatingService movieRatingService;
    private final MovieService movieService;
    private final UserService userService;

    @PostMapping
    public ResponseEntity<MovieRating> createRating(@RequestParam Long movieId,
                                                    @RequestParam int rating,
                                                    @RequestParam Long userId,
                                                    @RequestParam(required = false) String comment) {
        Movie movie = movieService.findById(movieId);
        User user = userService.findById(userId);

        MovieRating movieRating = movieRatingService.create(movie, rating, user, comment);
        return ResponseEntity.ok(movieRating);
    }

    @GetMapping("/{movieId}")
    public ResponseEntity<List<MovieRating>> getRatingsByMovie(@PathVariable Long movieId) {
        List<MovieRating> ratings = movieRatingService.getRatingByMovie(movieId);
        return ResponseEntity.ok(ratings);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<MovieRating>> getRatingsByUser(@PathVariable Long userId) {
        List<MovieRating> ratings = movieRatingService.getRatingByUser(userId);
        return ResponseEntity.ok(ratings);
    }

    @PutMapping("/{ratingId}")
    public ResponseEntity<MovieRating> updateRating(@PathVariable Long ratingId,
                                                    @RequestParam int newRating,
                                                    @RequestParam(required = false) String newComment) {

        MovieRating updateRating = movieRatingService.updateRating(ratingId, newRating, newComment);
        return ResponseEntity.ok(updateRating);
    }

    @DeleteMapping("/{ratingId}")
    public ResponseEntity<Void> deleteRating(@PathVariable Long ratingId) {
        movieRatingService.delete(ratingId);
        return ResponseEntity.noContent().build();
    }

}
