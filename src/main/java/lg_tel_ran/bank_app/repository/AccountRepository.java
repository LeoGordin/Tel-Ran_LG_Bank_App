package lg_tel_ran.bank_app.repository;

import lg_tel_ran.bank_app.domain.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {

    @Query("SELECT a FROM Account a WHERE a.client.id = :id")
    Account findAccountById(UUID id);

    @Query("SELECT a FROM Account a WHERE a.client.id = :id")
    Account findAccountByClientId(UUID id);
}