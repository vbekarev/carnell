package ru.vbekarev.organization.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.vbekarev.organization.model.Organization;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, String> {
    public Organization findById(String organizationId);
}
