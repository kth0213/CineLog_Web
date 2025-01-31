package project.cinelog_web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import project.cinelog_web.service.MovieRatingService;

@RequiredArgsConstructor
@Controller
public class MovieRatingController {

    private final MovieRatingService movieRatingService;



}
