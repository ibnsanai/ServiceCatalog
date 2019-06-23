package servicecatalog.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "SRVCAT_AGREEMENT_PARAMS")
@Entity(name = "srvcat_AgreementParams")
public class AgreementParams extends StandardEntity {
    private static final long serialVersionUID = -4076637560317911395L;

    @Column(name = "PARAM")
    protected String param;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TYPE_AGREEMENT_ID")
    protected TypeAgreement typeAgreement;

    public TypeAgreement getTypeAgreement() {
        return typeAgreement;
    }

    public void setTypeAgreement(TypeAgreement typeAgreement) {
        this.typeAgreement = typeAgreement;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}