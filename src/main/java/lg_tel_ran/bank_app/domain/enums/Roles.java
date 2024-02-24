package lg_tel_ran.bank_app.domain.enums;

import lombok.Getter;

@Getter
public enum Roles {
    ADMIN("Admin"),
    MANAGER("Manager"),
    CLIENT("Client");

    private final String description;

    Roles(String description) {
        this.description = description;
    }
}
