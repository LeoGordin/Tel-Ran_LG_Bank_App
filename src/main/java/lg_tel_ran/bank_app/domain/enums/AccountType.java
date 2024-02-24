package lg_tel_ran.bank_app.domain.enums;

import lombok.Getter;

@Getter
public enum AccountType {
    SAVINGS("Savings"),
    REGULAR("Regular"),
    INVESTMENT("Investment"),
    DEPOSIT("Deposit");

    private final String description;

    AccountType(String description) {
        this.description = description;
    }
}
