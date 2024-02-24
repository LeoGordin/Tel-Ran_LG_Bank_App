package lg_tel_ran.bank_app.domain.enums;

import lombok.Getter;

@Getter
public enum CurrencyCode {
    USD("USD"),
    EUR("EUR"),
    ILS("ILS"),
    JPY("JPY"),
    GBP("GBP"),
    CHF("CHF"),
    CAD("CAD"),
    AUD("AUD"),
    CNY("CNY");

    private final String code;

    CurrencyCode(String code) {
        this.code = code;
    }
}
