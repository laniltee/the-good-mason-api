package lk.sliit.web;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import lk.sliit.domain.ServiceProvider;
import lk.sliit.repository.ServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Lanil Marasinghe on 15-Oct-17.
 */
@RestController
@RequestMapping("/api")
public class ServiceProviderController {
    @Autowired
    ServiceProviderRepository serviceProviderRepository;

    @GetMapping("/service_providers")
    public List<ServiceProvider> getAllServiceProviders(){
        return serviceProviderRepository.findAll();
    }

    @PostMapping("/service_providers")
    public ServiceProvider addNewServiceProvider(@Valid @RequestBody ServiceProvider serviceProvider){
        return serviceProviderRepository.save(serviceProvider);
    }
}
