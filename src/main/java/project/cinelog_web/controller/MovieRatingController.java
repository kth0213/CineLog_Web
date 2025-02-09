package project.cinelog_web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import project.cinelog_web.model.Movie;
import project.cinelog_web.model.MovieRating;
import project.cinelog_web.model.User;
import project.cinelog_web.service.MovieRatingService;
import project.cinelog_web.service.MovieService;
import project.cinelog_web.service.UserService;

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

}
