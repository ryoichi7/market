package ryo.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ryo.market.models.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Integer> {

}
