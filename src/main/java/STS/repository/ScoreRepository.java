package STS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import STS.domain.Score;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ScoreRepository extends JpaRepository<Score, Long> {

    Page<Score> findAll(Pageable pageable);
}
