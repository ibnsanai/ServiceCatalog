package servicecatalog.web.screens.servicerequest;

import com.haulmont.cuba.gui.screen.*;
import servicecatalog.entity.ServiceRequest;

@UiController("srvcat_ServiceRequest.browse")
@UiDescriptor("service-request-browse.xml")
@LookupComponent("serviceRequestsTable")
@LoadDataBeforeShow
public class ServiceRequestBrowse extends StandardLookup<ServiceRequest> {
}