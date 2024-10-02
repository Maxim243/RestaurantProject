package sia.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sia.tacocloud.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}
