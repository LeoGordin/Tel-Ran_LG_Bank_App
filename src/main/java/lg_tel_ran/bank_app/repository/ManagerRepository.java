package lg_tel_ran.bank_app.repository;

import lg_tel_ran.bank_app.domain.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ManagerRepository extends JpaRepository<Manager, Integer> {
    @Query("SELECT m FROM manager m WHERE m.id = :id")
    Manager findManagerById(Integer id);

    @Query("SELECT m FROM manager m WHERE m.first_name = :firstName AND m.last_name = :lastName")
    Manager findManagerByFirstNameAndLastName(String firstName, String lastName);

    @Query("SELECT m FROM manager m WHERE m.status = :status")
    List<Manager> findManagersByStatus(String status);

    @Query("SELECT m FROM manager m WHERE m.created_at BETWEEN :from AND :to")
    List<Manager> findManagersByCreatedAtBetween(String from, String to);

    @Query("SELECT m FROM manager m WHERE m.updated_at BETWEEN :from AND :to")
    List<Manager> findManagersByUpdatedAtBetween(String from, String to);

    @Query("DELETE FROM manager m WHERE m.id = :id")
    void deleteManagerById(Integer id);
}
