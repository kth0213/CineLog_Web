package project.cinelog_web.service;

import org.springframework.stereotype.Service;
import project.cinelog_web.model.Movie;
import project.cinelog_web.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    /** 1. 특정 영화 ID로 조회 */
    public Movie findById(Long id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 ID의 영화가 존재하지 않습니다."));
    }

    /** 2. 모든 영화 조회 */
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    /** 3. 제목으로 영화 검색 */
    public List<Movie> findByTitleContaining(String keyword) {
        return movieRepository.findByTitleContainingIgnoreCase(keyword);
    }

    /** 4. 새로운 영화 추가 */
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    /** 5. 영화 삭제 */
    public void deleteById(Long id) {
        if (!movieRepository.existsById(id)) {
            throw new IllegalArgumentException("해당 ID의 영화가 존재하지 않습니다.");
        }
        movieRepository.deleteById(id);
    }
}
