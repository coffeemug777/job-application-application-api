package com.jobapplicationapp.applicationapi.service;

import com.jobapplicationapp.applicationapi.dto.ApplicationRequest;
import com.jobapplicationapp.applicationapi.model.Application;
import com.jobapplicationapp.applicationapi.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    public Application addApplication(ApplicationRequest application) {

        return this.applicationRepository.save(Application.builder()
                .userId(application.getUserId())
                .firstName(application.getFirstName())
                .lastName(application.getLastName())
                .email(application.getEmail())
                .phone(application.getPhone())
                .exps(application.getExps())
                .build());
    }

    public List<Application> getAll() {
        return this.applicationRepository.findAll();
    }

    public Application find(String id) {
        return this.applicationRepository.findById(id).get();
    }

    public Application updateApplication(ApplicationRequest request, String id) {
        Optional<Application> existing = this.applicationRepository.findById(id);
        if(existing.isPresent()) {
            return this.applicationRepository.save(Application.builder()
                            .id(existing.get().getId())
                            .email(request.getEmail())
                            .exps(request.getExps())
                            .firstName(request.getFirstName())
                            .lastName(request.getLastName())
                            .phone(request.getPhone())
                            .userId(request.getUserId())
                    .build());
        } else {
            return existing.orElseThrow();
        }
    }
}
