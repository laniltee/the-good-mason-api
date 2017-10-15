package lk.sliit.web;

import lk.sliit.domain.Credential;
import lk.sliit.repository.CredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Lanil Marasinghe on 15-Oct-17.
 */

@RestController
@RequestMapping("/api")
public class CredentialController {

    @Autowired
    CredentialRepository credentialRepository;

    @GetMapping("/credentials")
    public List<Credential> getAllCredentials(){
        return credentialRepository.findAll();
    }

    @PostMapping("/credentials")
    public Credential addNewCredential(@Valid @RequestBody Credential newCredential){
        return credentialRepository.save(newCredential);
    }
}
