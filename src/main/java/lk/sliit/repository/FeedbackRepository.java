package lk.sliit.repository;

import lk.sliit.domain.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Lanil Marasinghe on 15-Oct-17.
 */
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
