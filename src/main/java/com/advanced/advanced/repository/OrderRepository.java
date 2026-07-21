package com.advanced.advanced.repository;

import com.advanced.advanced.dto.BookDTO;
import com.advanced.advanced.dto.OrderCreatedResponseDto;
import com.advanced.advanced.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

}
