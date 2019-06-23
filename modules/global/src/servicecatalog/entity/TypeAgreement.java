package servicecatalog.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.List;

@Table(name = "SRVCAT_TYPE_AGREEMENT")
@Entity(name = "srvcat_TypeAgreement")
public class TypeAgreement extends StandardEntity {
    private static final long serialVersionUID = -7810868617917827037L;

    @Column(name = "LIABILITY_OWNER")
    protected String liabilityOwner;

    @Column(name = "LIABILITY_ORG")
    protected String liabilityOrg;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "typeAgreement")
    protected List<AgreementParams> param;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SERVICE_ID")
    protected Service service;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public List<AgreementParams> getParam() {
        return param;
    }

    public void setParam(List<AgreementParams> param) {
        this.param = param;
    }

    public String getLiabilityOrg() {
        return liabilityOrg;
    }

    public void setLiabilityOrg(String liabilityOrg) {
        this.liabilityOrg = liabilityOrg;
    }

    public String getLiabilityOwner() {
        return liabilityOwner;
    }

    public void setLiabilityOwner(String liabilityOwner) {
        this.liabilityOwner = liabilityOwner;
    }
}