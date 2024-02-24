package lg_tel_ran.bank_app.domain.enums;

import lombok.Getter;

@Getter
public enum TransactionType {
    DEPOSIT("Deposit"),
    WITHDRAWAL("Withdrawal"),
    TRANSFER("Transfer");

    private final String type;

    TransactionType(String type) {
        this.type = type;
    }
}
