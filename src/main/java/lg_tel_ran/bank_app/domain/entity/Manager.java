package lg_tel_ran.bank_app.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lg_tel_ran.bank_app.domain.enums.ManagerDescription;
import lg_tel_ran.bank_app.domain.enums.ManagerStatus;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "manager")
public class Manager {

    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "status")
    private ManagerStatus status;

    @Column(name = "description")
    private ManagerDescription description;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @JsonIgnore
    @OneToMany(mappedBy = "manager")
    private List<Client> clients;

    @JsonIgnore
    @OneToMany(mappedBy = "manager")
    private List<Product> products;
}
