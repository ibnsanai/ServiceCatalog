package servicecatalog.web.screens.serviceteam;

import com.haulmont.cuba.gui.screen.*;
import servicecatalog.entity.ServiceTeam;

@UiController("srvcat_ServiceTeam.edit")
@UiDescriptor("service-team-edit.xml")
@EditedEntityContainer("serviceTeamDc")
@LoadDataBeforeShow
public class ServiceTeamEdit extends StandardEditor<ServiceTeam> {
}