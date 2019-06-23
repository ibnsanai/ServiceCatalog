package servicecatalog.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.security.entity.User;
import servicecatalog.enums.ServiceFormat;
import servicecatalog.enums.ServiceStatus;

import javax.persistence.*;
import java.util.List;

@Table(name = "SRVCAT_SERVICE")
@Entity(name = "srvcat_Service")
public class Service extends StandardEntity {
    private static final long serialVersionUID = -8796197046728279119L;

    @Column(name = "TITLE")
    protected String title;

    @Column(name = "BRIEF_DESC")
    protected String briefDesc;

    @Column(name = "FULL_DESC")
    protected String fullDesc;

    @Column(name = "DOCS_URL")
    protected String docsURL;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OWNER_ID")
    protected User owner;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "service")
    protected List<ServiceTeam> team;

    @Column(name = "FORMAT")
    protected String format;

    @Column(name = "STAKE_HOLDER")
    protected String stakeHolder;

    @Column(name = "STATUS")
    protected String status;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "service")
    protected List<TypeAgreement> agreement;

    @Column(name = "COUNT_REQUEST")
    protected Integer countRequest;

    @Column(name = "COUNT_CONFIRM_AGREEMENT")
    protected Integer countConfirmAgreement;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "service")
    protected List<AgreementRequest> agrReq;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "service")
    protected List<AgreementConfirm> agrConfirm;

    public List<AgreementConfirm> getAgrConfirm() {
        return agrConfirm;
    }

    public void setAgrConfirm(List<AgreementConfirm> agrConfirm) {
        this.agrConfirm = agrConfirm;
    }

    public List<AgreementRequest> getAgrReq() {
        return agrReq;
    }

    public void setAgrReq(List<AgreementRequest> agrReq) {
        this.agrReq = agrReq;
    }

    public Integer getCountConfirmAgreement() {
        return countConfirmAgreement;
    }

    public void setCountConfirmAgreement(Integer countConfirmAgreement) {
        this.countConfirmAgreement = countConfirmAgreement;
    }

    public Integer getCountRequest() {
        return countRequest;
    }

    public void setCountRequest(Integer countRequest) {
        this.countRequest = countRequest;
    }

    public List<TypeAgreement> getAgreement() {
        return agreement;
    }

    public void setAgreement(List<TypeAgreement> agreement) {
        this.agreement = agreement;
    }

    public ServiceStatus getStatus() {
        return status == null ? null : ServiceStatus.fromId(status);
    }

    public void setStatus(ServiceStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public String getStakeHolder() {
        return stakeHolder;
    }

    public void setStakeHolder(String stakeHolder) {
        this.stakeHolder = stakeHolder;
    }

    public ServiceFormat getFormat() {
        return format == null ? null : ServiceFormat.fromId(format);
    }

    public void setFormat(ServiceFormat format) {
        this.format = format == null ? null : format.getId();
    }

    public List<ServiceTeam> getTeam() {
        return team;
    }

    public void setTeam(List<ServiceTeam> team) {
        this.team = team;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getDocsURL() {
        return docsURL;
    }

    public void setDocsURL(String docsURL) {
        this.docsURL = docsURL;
    }

    public String getFullDesc() {
        return fullDesc;
    }

    public void setFullDesc(String fullDesc) {
        this.fullDesc = fullDesc;
    }

    public String getBriefDesc() {
        return briefDesc;
    }

    public void setBriefDesc(String briefDesc) {
        this.briefDesc = briefDesc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}