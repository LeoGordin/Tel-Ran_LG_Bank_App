package lg_tel_ran.bank_app.domain.enums;

import lombok.Getter;

@Getter
public enum ClientStatus {
    ACTIVE("Active"),
    INACTIVE("Inactive");

    private final String description;

    ClientStatus(String description) {
        this.description = description;
    }


}
