package lg_tel_ran.bank_app.domain.enums;

import lombok.Getter;

@Getter
public enum ManagerDescription {
    REGULAR("Regular manager"),
    VIP("VIP manager"),
    INTERN("Intern manager");

    private final String description;

    ManagerDescription(String description) {
        this.description = description;
    }
}
