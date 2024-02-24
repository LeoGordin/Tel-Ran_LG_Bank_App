package lg_tel_ran.bank_app.domain.enums;

import lombok.Getter;

@Getter
public enum AccountStatus {
    ACTIVE("Active"),
    BLOCKED("Blocked"),
    CLOSED("Closed");

    private final String description;

    AccountStatus(String description) {
        this.description = description;
    }

}
