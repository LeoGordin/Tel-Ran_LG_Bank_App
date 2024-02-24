package lg_tel_ran.bank_app.domain.enums;

import lombok.Getter;

@Getter
public enum ManagerStatus {
    ACTIVE("Active"),
    INACTIVE("Inactive");


    private final String description;

    ManagerStatus(String description) {
        this.description = description;
    }
}

