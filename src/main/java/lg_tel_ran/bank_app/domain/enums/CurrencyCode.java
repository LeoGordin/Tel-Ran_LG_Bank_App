package lg_tel_ran.bank_app.domain.enums;

import lombok.Getter;

@Getter
public enum CurrencyCode {
    USD("US Dollars"),
    EUR("EU Euro"),
    ILS("Israeli Shekel"),
    JPY("Japanese Yen"),
    GBP("British Pound"),
    CHF("Switzerland Franc"),
    CAD("Canadian Dollar"),
    AUD("Australian Dollar"),
    CNY("Chinese Yuan"),;

    private final String code;

    CurrencyCode(String code) {
        this.code = code;
    }
}
