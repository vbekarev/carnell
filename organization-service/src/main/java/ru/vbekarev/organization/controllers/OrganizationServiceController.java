package ru.vbekarev.organization.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.vbekarev.organization.model.Organization;
import ru.vbekarev.organization.services.OrganizationService;

@RestController
@RequestMapping(value = "v1/organizations")
public class OrganizationServiceController {

    @Autowired
    private OrganizationService organizationService;

    @RequestMapping(value = "/{organizationId}", method = RequestMethod.GET)
    public Organization getOrganization(@PathVariable("organizationId") String organizationId) {
        return organizationService.getOrganization(organizationId);
    }

    @RequestMapping(value = "/{organizationId}", method = RequestMethod.PUT)
    public void updateOrganization(@PathVariable("organizationId") String organizationId,
                                   @RequestBody Organization organization) {
        organizationService.updateOrganization(organization);
    }

    @RequestMapping(value = "/{organizationId}", method = RequestMethod.POST)
    public void saveOrganization(@RequestBody Organization organization) {
        organizationService.saveOrganization(organization);
    }


    @RequestMapping(value = "/{organizationId}", method = RequestMethod.DELETE)
    public void deleteOrganization(@PathVariable("organizationId") String organizationId,
                                   @RequestBody Organization organization) {
        organizationService.deleteOrganization(organization);
    }

}
