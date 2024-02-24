package lg_tel_ran.bank_app.repository;

import lg_tel_ran.bank_app.domain.entity.Agreement;
import lg_tel_ran.bank_app.domain.enums.AgreementStatus;
import lg_tel_ran.bank_app.domain.enums.CurrencyCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

public interface AgreementRepository extends JpaRepository<Agreement, UUID>{

    @Query("SELECT a FROM agreement a WHERE a.id = :id")
    Agreement findAgreementById(UUID id);

    @Query("SELECT a FROM agreement a WHERE a.account.id = :id")
    Agreement findAgreementByAccountId(UUID id);

    @Query("SELECT a FROM agreement a WHERE a.product.id = :id")
    Agreement findAgreementByProductId(UUID id);

    @Query("SELECT a FROM agreement a WHERE a.interest_rate BETWEEN :from AND :to")
    List<Agreement> findAgreementsByInterestRateBetween(float from, BigDecimal to);

    @Query("SELECT a FROM agreement a WHERE a.sum BETWEEN :from AND :to")
    List<Agreement> findAgreementsBySumBetween(float from, float to);

    @Query("SELECT a FROM agreement a WHERE a.currency = :code")
    List<Agreement> findAgreementsByCurrency(CurrencyCode code);

    @Query("SELECT a FROM agreement a WHERE a.createdAt BETWEEN :from AND :to")
    List<Agreement> findAgreementsByStatus(AgreementStatus status);

    @Query("SELECT a FROM agreement a WHERE a.updated_at BETWEEN :from AND :to")
    List<Agreement> findAgreementsByCreatedAtBetween(Timestamp from, Timestamp to);

    @Query("SELECT a FROM agreement a WHERE a.updated_at BETWEEN :from AND :to")
    List<Agreement> findAgreementsByUpdatedAtBetween(Timestamp from, Timestamp to);

    @Query("DELETE FROM agreement a WHERE a.id = :id")
    void deleteAgreementById(UUID id);


}
