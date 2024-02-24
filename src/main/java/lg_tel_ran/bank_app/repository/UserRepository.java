package lg_tel_ran.bank_app.repository;

import lg_tel_ran.bank_app.domain.entity.User;
import lg_tel_ran.bank_app.domain.enums.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM user u WHERE u.id = :id")
    User findUserById(int id);

    @Query("SELECT u FROM user u WHERE u.username = :username")
    User findUserByUsername(String username);

    @Query("SELECT u FROM user u WHERE u.role = :role")
    User findUserByRole(Roles role);

    @Query("SELECT u FROM user u WHERE u.created_at BETWEEN :from AND :to")
    User findUserByCreatedAtBetween(Timestamp from, Timestamp to);

    @Query("SELECT u FROM user u WHERE u.updated_at BETWEEN :from AND :to")
    User findUserByUpdatedAtBetween(Timestamp from, Timestamp to);

    @Query("DELETE FROM user u WHERE u.id = :id")
    void deleteUserById(int id);

    @Query("DELETE FROM user u WHERE u.username = :username")
    void deleteUserByUsername(String username);
}
