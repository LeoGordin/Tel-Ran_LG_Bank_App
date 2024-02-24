package lg_tel_ran.bank_app.repository;

import lg_tel_ran.bank_app.domain.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {

    @Query("SELECT t FROM transaction t WHERE t.id = :id")
    Transaction findTransactionById(UUID id);

    @Query("SELECT t FROM transaction t WHERE t.debit_account.id = :id")
    List<Transaction> findTransactionByDebitAccountId(UUID id);

    @Query("SELECT t FROM transaction t WHERE t.credit_account.id = :id")
    List<Transaction> findTransactionByCreditAccountId(UUID id);

    @Query("SELECT t FROM transaction t WHERE t.amount BETWEEN :from AND :to")
    List<Transaction> findTransactionByAmountBetween(BigDecimal from, BigDecimal to);

    @Query("SELECT t FROM transaction t WHERE t.created_at BETWEEN :from AND :to")
    List<Transaction> findTransactionByCreatedAtBetween(Timestamp from, Timestamp to);

    @Query("DELETE FROM transaction t WHERE t.id = :id")
    void deleteTransactionById(UUID id);
}
