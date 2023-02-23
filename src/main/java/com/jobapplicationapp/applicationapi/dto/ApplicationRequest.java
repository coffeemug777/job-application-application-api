package com.jobapplicationapp.applicationapi.dto;

import com.jobapplicationapp.applicationapi.model.Experience;
import lombok.Data;

import java.util.List;

@Data
public class ApplicationRequest {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private List<Experience> exps;
}
