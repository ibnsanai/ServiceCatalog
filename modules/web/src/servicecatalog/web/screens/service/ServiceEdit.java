package servicecatalog.web.screens.service;

import com.haulmont.cuba.gui.screen.*;
import servicecatalog.entity.Service;

@UiController("srvcat_Service.edit")
@UiDescriptor("service-edit.xml")
@EditedEntityContainer("serviceDc")
@LoadDataBeforeShow
public class ServiceEdit extends StandardEditor<Service> {
}