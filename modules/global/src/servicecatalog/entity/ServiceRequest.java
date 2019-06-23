package servicecatalog.entity;

import servicecatalog.enums.RequestStatus;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "srvcat_ServiceRequest")
public class ServiceRequest extends Service {
    private static final long serialVersionUID = -170580971025878563L;

    @Column(name = "REQUEST_STATUS")
    protected String requestStatus;

    public RequestStatus getRequestStatus() {
        return requestStatus == null ? null : RequestStatus.fromId(requestStatus);
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus == null ? null : requestStatus.getId();
    }
}