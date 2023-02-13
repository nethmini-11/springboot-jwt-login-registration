package com.bezkoder.spring.security.mongodb.payload.request;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
  @NotBlank
  private String username;

  @NotBlank
  private String password;

private String orgname;



  private String roles;



  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getOrgname() {
    return orgname;
  }

  public void setOrgname(String orgname) {
    this.orgname = orgname;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }




  public String getRoles () {return roles;}

  public void setRoles(String roles ){this.roles=roles;}
}
