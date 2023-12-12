package ryo.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ryo.market.models.Orders;
@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
