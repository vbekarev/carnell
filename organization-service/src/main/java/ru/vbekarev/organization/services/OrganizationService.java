package ru.vbekarev.organization.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vbekarev.organization.model.Organization;
import ru.vbekarev.organization.repository.OrganizationRepository;

import java.util.UUID;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationRepository organizationRepository;

    public Organization getOrganization(String organizationId) {
        return organizationRepository.findById(organizationId);
    }

    public void saveOrganization(Organization organization) {
        organization.setId(UUID.randomUUID().toString());
        organizationRepository.save(organization);
    }

    public void updateOrganization(Organization organization) {
        organizationRepository.save(organization);
    }

    public void deleteOrganization(Organization organization) {
        organizationRepository.delete(organization);
    }
}
