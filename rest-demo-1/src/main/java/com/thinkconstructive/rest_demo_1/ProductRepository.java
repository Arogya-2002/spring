package com.thinkconstructive.rest_demo_1;

import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product,Long> {

}
