package com.bezkoder.spring.security.mongodb.payload.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class OrgRequest {


    @NotBlank
    @Size(min = 3, max = 20)
    private String orgname;

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getOrgname() {
        return orgname;
    }
}
