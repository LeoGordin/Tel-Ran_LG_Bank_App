package lg_tel_ran.bank_app.repository;

import lg_tel_ran.bank_app.domain.entity.Client;
import lg_tel_ran.bank_app.domain.enums.ClientStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {

    @Query("SELECT c FROM client c WHERE c.id = :id")
    Client findClientById(UUID id);

    @Query("SELECT c FROM client c WHERE c.firstName = :firstName AND c.lastName = :lastName")
    List<Client> findClientsByFirstNameAndLastname(String firstName, String lastName);

    @Query("SELECT c FROM client c WHERE c.manager.id = :id")
    List<Client> findClientsByManagerId(UUID id);

    @Query("SELECT c FROM client c WHERE c.status = :status")
    List<Client> findClientsByStatus(ClientStatus status);

    @Query("SELECT c FROM client c WHERE c.tax_code = :taxCode")
    List<Client> findClientByTaxCode(String taxCode);

    @Query("SELECT c FROM client c WHERE c.phone = :phone")
    List<Client> findClientByPhoneNumber(String phoneNumber);

    @Query("SELECT c FROM client c WHERE c.email = :email")
    List<Client> findClientByEmail(String email);

    @Query("SELECT c FROM client c WHERE c.address = :address")
    List<Client> findClientsByAddress(String address);

    @Query("SELECT c FROM client c WHERE c.createdAt BETWEEN :from AND :to")
    List<Client> findClientsByCreatedAtBetween(Timestamp from, Timestamp to);

    @Query("SELECT c FROM client c WHERE c.updatedAt BETWEEN :from AND :to")
    List<Client> findClientsByUpdatedAtBetween(Timestamp from, Timestamp to);

    @Query("DELETE FROM client c WHERE c.id = :id")
    void deleteClientById(UUID id);
}
