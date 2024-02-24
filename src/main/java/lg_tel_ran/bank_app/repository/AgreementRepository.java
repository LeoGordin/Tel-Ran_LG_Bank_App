package lg_tel_ran.bank_app.repository;

import lg_tel_ran.bank_app.domain.entity.Agreement;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface AgreementRepository {

    @Query("SELECT a FROM agreement a WHERE a.id = :id")
    Agreement findAgreementById(UUID id);

    @Query("SELECT a FROM agreement a WHERE a.client.id = :id")
    List<Agreement> findAgreementsByClientId(UUID id);

    @Query("SELECT a FROM agreement a WHERE a.account.id = :id")
    Agreement findAgreementByAccountId(UUID id);

    @Query("SELECT a FROM agreement a WHERE a.account.id = :id")
    List<Agreement> findAgreementsByManagerId(UUID id);
}
