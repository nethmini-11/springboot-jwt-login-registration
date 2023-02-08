package com.bezkoder.spring.security.mongodb.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;

import javax.validation.Valid;

import com.bezkoder.spring.security.mongodb.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.bezkoder.spring.security.mongodb.models.Organization;
import com.bezkoder.spring.security.mongodb.payload.request.LoginRequest;
import com.bezkoder.spring.security.mongodb.payload.response.UserInfoResponse;
import com.bezkoder.spring.security.mongodb.repository.RoleRepository;
import com.bezkoder.spring.security.mongodb.security.jwt.JwtUtils;
import com.bezkoder.spring.security.mongodb.security.services.UserDetailsImpl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/org/auth")
public class OrgController {
    @Autowired
    AuthenticationManager organizationAuthManager;

    @Autowired
    OrganizationRepository organizationRepository;

    @PostMapping("/create")
    public ResponseEntity<Organization> createResult(@RequestBody Organization organization) {
        try {
            Organization _organization = organizationRepository.save(new Organization(organization.getOrgname()));
            return new ResponseEntity<>(_organization, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/org/{id}")
    public ResponseEntity<Organization> updateOrg(@PathVariable("id") String id, @RequestBody Organization organization) {
        Optional<Organization> orgData = organizationRepository.findById(id);

        if (orgData.isPresent()) {
            Organization _org = orgData.get();
            _org.setOrgname(organization.getOrgname());

            return new ResponseEntity<>(organizationRepository.save(_org), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
