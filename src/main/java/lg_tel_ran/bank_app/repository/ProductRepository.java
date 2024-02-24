package lg_tel_ran.bank_app.repository;

import lg_tel_ran.bank_app.domain.entity.Product;
import lg_tel_ran.bank_app.domain.enums.CurrencyCode;
import lg_tel_ran.bank_app.domain.enums.ProductStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("SELECT p FROM product p WHERE p.id = :id")
    Product findProductById(Integer id);

    @Query("SELECT p FROM product p WHERE p.name = :name")
    Product findProductByName(String name);

    @Query("SELECT p FROM product p WHERE p.status = :status")
    List<Product> findProductByStatus(ProductStatus status);

    @Query("SELECT p FROM product p WHERE p.currency_code = :code")
    List<Product> findProductByCurrencyCode(CurrencyCode code);

    @Query("SELECT p FROM product p WHERE p.interest_rate BETWEEN :from AND :to")
    List<Product> findProductsByInterestRateBetween(float from, float to);

    @Query("SELECT p FROM product p WHERE p.sum BETWEEN :from AND :to")
    List<Product> findProductsByLimitBetween(BigDecimal from, BigDecimal to);

    @Query("SELECT p FROM product p WHERE p.created_at BETWEEN :from AND :to")
    List<Product> findProductsCreatedAtBetween(Timestamp from, Timestamp to);

    @Query("SELECT p FROM product p WHERE p.updated_at BETWEEN :from AND :to")
    List<Product> findProductsUpdatedAtBetween(Timestamp from, Timestamp to);

    @Query("DELETE FROM product p WHERE p.id = :id")
    void deleteProductById(Integer id);


}
