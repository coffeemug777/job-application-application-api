package com.jobapplicationapp.applicationapi.dto;

import lombok.Data;

@Data
public class ApplicationRequest {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
