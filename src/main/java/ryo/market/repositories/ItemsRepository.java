package ryo.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ryo.market.models.Items;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
