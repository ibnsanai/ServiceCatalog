package servicecatalog.web.screens.agreementparams;

import com.haulmont.cuba.gui.screen.*;
import servicecatalog.entity.AgreementParams;

@UiController("srvcat_AgreementParams.edit")
@UiDescriptor("agreement-params-edit.xml")
@EditedEntityContainer("agreementParamsDc")
@LoadDataBeforeShow
public class AgreementParamsEdit extends StandardEditor<AgreementParams> {
}