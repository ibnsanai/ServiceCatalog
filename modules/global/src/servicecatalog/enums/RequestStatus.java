package servicecatalog.enums;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum RequestStatus implements EnumClass<String> {

    SENT("Sent"),
    CONSIDERATION("Consideration"),
    CANCELLED("Cancelled"),
    APPROVED("Approved");

    private String id;

    RequestStatus(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static RequestStatus fromId(String id) {
        for (RequestStatus at : RequestStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}