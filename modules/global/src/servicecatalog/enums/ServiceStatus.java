package servicecatalog.enums;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ServiceStatus implements EnumClass<String> {

    IDEA("Idea"),
    MVP1("MVP1"),
    MVPN("MVPn"),
    PRODUCT("Product");

    private String id;

    ServiceStatus(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ServiceStatus fromId(String id) {
        for (ServiceStatus at : ServiceStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}