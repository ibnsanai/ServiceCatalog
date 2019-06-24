package servicecatalog.web.screens.servicerequest;

import com.haulmont.cuba.gui.screen.*;
import servicecatalog.entity.ServiceRequest;

@UiController("srvcat_ServiceRequest.edit")
@UiDescriptor("service-request-edit.xml")
@EditedEntityContainer("serviceRequestDc")
@LoadDataBeforeShow
public class ServiceRequestEdit extends StandardEditor<ServiceRequest> {
}