package servicecatalog.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;

@Table(name = "SRVCAT_AGREEMENT_CONFIRM")
@Entity(name = "srvcat_AgreementConfirm")
public class AgreementConfirm extends StandardEntity {
    private static final long serialVersionUID = -8675411188880185975L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TYPE_AGREEMENT_ID")
    protected TypeAgreement typeAgreement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    protected User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SERVICE_ID")
    protected Service service;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}