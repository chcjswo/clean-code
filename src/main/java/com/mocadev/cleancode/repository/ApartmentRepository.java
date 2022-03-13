package com.mocadev.cleancode.repository;

import com.mocadev.cleancode.entity.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-03-14
 **/
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {

}
