package lg_tel_ran.bank_app.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lg_tel_ran.bank_app.domain.enums.AccountStatus;
import lg_tel_ran.bank_app.domain.enums.AccountType;
import lg_tel_ran.bank_app.domain.enums.CurrencyCode;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private AccountStatus status;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private AccountType type;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "currency_code")
    private CurrencyCode currency;

    @Column(name = "created_at")
    private java.sql.Timestamp createdAt;

    @Column(name = "updated_at")
    private java.sql.Timestamp updatedAt;

    @Transient
    @OneToMany(mappedBy = "account")
    List<Agreement> agreements;

    @Transient
    @OneToMany(mappedBy = "creditAccount")
    List<Transaction> creditTransactions;

    @Transient
    @OneToMany(mappedBy = "debitAccount")
    List<Transaction> debitTransactions;

    }
