package servicecatalog.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "SRVCAT_AGREEMENT_REQUEST")
@Entity(name = "srvcat_AgreementRequest")
public class AgreementRequest extends StandardEntity {
    private static final long serialVersionUID = -5291612196798185561L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TYPE_AGREEMENT_ID")
    protected TypeAgreement typeAgreement;

    @Column(name = "USER")
    protected String user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SERVICE_ID")
    protected Service service;

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public TypeAgreement getTypeAgreement() {
        return typeAgreement;
    }

    public void setTypeAgreement(TypeAgreement typeAgreement) {
        this.typeAgreement = typeAgreement;
    }

}