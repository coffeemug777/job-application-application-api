package com.jobapplicationapp.applicationapi.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.List;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Application {
    @Id
    @Generated
    private BigInteger id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private List<Experience> exps;
}
