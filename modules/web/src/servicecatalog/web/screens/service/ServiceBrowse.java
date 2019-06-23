package servicecatalog.web.screens.service;

import com.haulmont.cuba.gui.screen.*;
import servicecatalog.entity.Service;

@UiController("srvcat_Service.browse")
@UiDescriptor("service-browse.xml")
@LookupComponent("servicesTable")
@LoadDataBeforeShow
public class ServiceBrowse extends StandardLookup<Service> {
}