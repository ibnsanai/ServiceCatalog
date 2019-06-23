package servicecatalog.enums;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ServiceFormat implements EnumClass<String> {

    LABORATORY("Laboratory"),
    MASTER_CLASS("Master class"),
    PERSONAL_MEETING("Personal meeting"),
    ONLINE("Online");

    private String id;

    ServiceFormat(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ServiceFormat fromId(String id) {
        for (ServiceFormat at : ServiceFormat.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}