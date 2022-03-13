package com.mocadev.cleancode.service;

import com.mocadev.cleancode.exception.ErrorCode;
import com.mocadev.cleancode.exception.HouseUtilsException;
import com.mocadev.cleancode.repository.ApartmentRepository;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-03-14
 **/
@Service
@RequiredArgsConstructor
public class ApartmentService {

	private final ApartmentRepository apartmentRepository;

	@Transactional
	public Long getPriceOrThrow(Long apartmentId) {
		return apartmentRepository.findById(apartmentId)
			.orElseThrow(() -> new HouseUtilsException(ErrorCode.ENTITY_NOT_FOUND))
			.getPrice();
	}
}
