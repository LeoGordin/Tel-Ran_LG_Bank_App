package lg_tel_ran.bank_app.repository;

import lg_tel_ran.bank_app.domain.entity.Account;
import lg_tel_ran.bank_app.domain.enums.AccountStatus;
import lg_tel_ran.bank_app.domain.enums.CurrencyCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {

    @Query("SELECT a FROM account a WHERE a.id = :id")
    Account findAccountById(UUID id);

    @Query("SELECT a FROM account a WHERE a.id = :id")
    Account findAccountByClientId(UUID id);

    @Query("SELECT a FROM account a WHERE a.name = :name")
    Account findAccountByName(String name);

    @Query("SELECT a FROM account a WHERE a.status = :status")
    List<Account> findAccountsByStatus(AccountStatus status);

    @Query("SELECT a FROM account a WHERE a.balance BETWEEN :from AND :to")
    List<Account> findAccountsByBalance(BigDecimal from, BigDecimal to);

    @Query("SELECT a FROM account a WHERE a.currency = :code")
    List<Account> findAccountByCurrencyCode(CurrencyCode code);

    @Query("SELECT a FROM account a WHERE a.created_at BETWEEN :from AND :to")
    List<Account> findAccountsCreatedAtBetween(Timestamp from, Timestamp to);

    @Query("SELECT a FROM account a WHERE a.updated_at BETWEEN :from AND :to")
    List<Account> findAccountsUpdatedAtBetween(Timestamp from, Timestamp to);

    @Query("DELETE FROM account a WHERE a.id = :id")
    void deleteAccountById(UUID id);

}