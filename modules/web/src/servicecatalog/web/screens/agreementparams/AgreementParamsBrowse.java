package servicecatalog.web.screens.agreementparams;

import com.haulmont.cuba.gui.screen.*;
import servicecatalog.entity.AgreementParams;

@UiController("srvcat_AgreementParams.browse")
@UiDescriptor("agreement-params-browse.xml")
@LookupComponent("agreementParamsesTable")
@LoadDataBeforeShow
public class AgreementParamsBrowse extends StandardLookup<AgreementParams> {
}