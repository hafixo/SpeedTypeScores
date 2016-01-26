package STS.controller;

import STS.domain.Score;
import STS.repository.ScoreRepository;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("*")
public class ScoreController {

    @Autowired
    private ScoreRepository scoreRepository;

    @RequestMapping(value = "/scores", method = RequestMethod.GET)
    public List<Score> getScores() {
        Pageable pageable = new PageRequest(0, 20, Sort.Direction.DESC, "points");
        Page<Score> scorePage = scoreRepository.findAll(pageable);
        return scorePage.getContent();
    }

    @RequestMapping(value = "/newscore", method = RequestMethod.POST)
    public void postScore(@RequestBody Score score, HttpServletRequest req) {
        scoreRepository.save(score);
    }
}
