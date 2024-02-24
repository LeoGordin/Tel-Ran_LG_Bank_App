package lg_tel_ran.bank_app.domain.enums;

import lombok.Getter;

@Getter
public enum ProductStatus {
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    CLOSED("Closed");

    private final String status;

    ProductStatus(String status) {
        this.status = status;
    }
}
