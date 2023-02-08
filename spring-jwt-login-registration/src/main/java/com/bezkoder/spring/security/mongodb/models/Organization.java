package com.bezkoder.spring.security.mongodb.models;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "org")
public class Organization {
    @Id
    private String id;

    @NotBlank
    @Size(max = 60)
    private String orgname;

    public Organization() {
    }

    public Organization(String orgname) {
        this.orgname = orgname;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }



}

