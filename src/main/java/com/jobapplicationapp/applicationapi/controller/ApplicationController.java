package com.jobapplicationapp.applicationapi.controller;

import com.jobapplicationapp.applicationapi.dto.ApplicationRequest;
import com.jobapplicationapp.applicationapi.model.Application;
import com.jobapplicationapp.applicationapi.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/api/")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;

    @PostMapping("application")
    public Application add(@RequestBody ApplicationRequest application) {
        return this.applicationService.addApplication(application);
    }

    @PutMapping("application/update/{id}")
    public Application update(@RequestBody ApplicationRequest request, @PathVariable String id) {
        try {
            return this.applicationService.updateApplication(request, id);
        } catch (Exception e) {
            System.out.println("asfds" + e);
            return new Application();
        }
    }

    @GetMapping("application/{id}")
    public Application getById(@PathVariable String id) {
        return this.applicationService.find(id);
    }


    @GetMapping("application/all")
    public List<Application> getAll() {
        return this.applicationService.getAll();
    }
}
