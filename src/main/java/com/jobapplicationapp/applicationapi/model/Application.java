package com.jobapplicationapp.applicationapi.model;

import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Data
@Builder
@Document
public class Application {
    @Id
    @Generated
    private BigInteger id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
