package lg_tel_ran.bank_app.domain.enums;

import lombok.Getter;

@Getter
public enum AgreementStatus {
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    BLOCKED("Blocked"),
    CLOSED("Closed");

    private final String status;

    AgreementStatus(String status) {
        this.status = status;
    }

}
