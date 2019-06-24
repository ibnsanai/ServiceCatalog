package servicecatalog.web.screens.typeagreement;

import com.haulmont.cuba.gui.screen.*;
import servicecatalog.entity.TypeAgreement;

@UiController("srvcat_TypeAgreement.browse")
@UiDescriptor("type-agreement-browse.xml")
@LookupComponent("typeAgreementsTable")
@LoadDataBeforeShow
public class TypeAgreementBrowse extends StandardLookup<TypeAgreement> {
}