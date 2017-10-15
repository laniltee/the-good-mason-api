package lk.sliit.web;

import lk.sliit.domain.Credential;
import lk.sliit.domain.Feedback;
import lk.sliit.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Lanil Marasinghe on 15-Oct-17.
 */
@RestController
@RequestMapping("/api")
public class FeedbackController {

    @Autowired
    FeedbackRepository feedbackRepository;

    @GetMapping("/feedback")
    public List<Feedback> getAllCredentials(){
        return feedbackRepository.findAll();
    }

    @PostMapping("/feedback")
    public Feedback addNewCredential(@Valid @RequestBody Feedback newFeedback){
        return feedbackRepository.save(newFeedback);
    }
}
