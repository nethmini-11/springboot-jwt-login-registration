package com.bezkoder.spring.security.mongodb.repository;

import com.bezkoder.spring.security.mongodb.models.Organization;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrganizationRepository extends MongoRepository<Organization, String> {
}
