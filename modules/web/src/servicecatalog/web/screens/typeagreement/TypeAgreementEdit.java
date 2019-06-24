package servicecatalog.web.screens.typeagreement;

import com.haulmont.cuba.gui.screen.*;
import servicecatalog.entity.TypeAgreement;

@UiController("srvcat_TypeAgreement.edit")
@UiDescriptor("type-agreement-edit.xml")
@EditedEntityContainer("typeAgreementDc")
@LoadDataBeforeShow
public class TypeAgreementEdit extends StandardEditor<TypeAgreement> {
}