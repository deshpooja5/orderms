package com.group7.order.repository;

//import java.util.List;

//import javax.persistence.EntityManager;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group7.order.entity.OrderDetails;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetails, Integer>{
	
//	public List<ProductsOrdered> findAllProducts();

	
}

