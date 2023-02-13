package com.bezkoder.spring.security.mongodb.repository;

import com.bezkoder.spring.security.mongodb.models.Organization;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface OrganizationRepository extends MongoRepository<Organization, String> {

    Boolean existsByOrgname (String orgname);

    Optional<Organization> findByOrgname(String orgname);
}
