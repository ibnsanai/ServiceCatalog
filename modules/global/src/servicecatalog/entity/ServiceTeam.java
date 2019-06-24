package servicecatalog.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "SRVCAT_SERVICE_TEAM")
@Entity(name = "srvcat_ServiceTeam")
public class ServiceTeam extends StandardEntity {
    private static final long serialVersionUID = -4311329436219299393L;

    @Column(name = "PARTICIPANT")
    protected String participant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SERVICE_ID")
    protected Service service;

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    public String getParticipant() {
        return participant;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

}