package com.mocadev.cleancode.controller;

import com.mocadev.cleancode.contants.ActionType;
import com.mocadev.cleancode.policy.BrokeragePolicy;
import com.mocadev.cleancode.policy.BrokeragePolicyFactory;
import com.mocadev.cleancode.service.ApartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-03-12
 *
 * 중계수수료가 얼마인지 조회하는 컨트롤러
 **/
@RestController
@RequiredArgsConstructor
public class BrokerageQueryController {

	private final ApartmentService apartmentService;

	@GetMapping("/api/calc/brokerage")
	public Long calcBrokerage(@RequestParam ActionType actionType,
							  @RequestParam Long price) {
		final BrokeragePolicy brokeragePolicy = BrokeragePolicyFactory.of(actionType);
		return brokeragePolicy.calculate(price);
	}

	@GetMapping("/api/calc/apartment/{apartmentId}")
	public Long calcBrokerageByApartmentId(@PathVariable Long apartmentId,
										   @RequestParam ActionType actionType) {
		final BrokeragePolicy brokeragePolicy = BrokeragePolicyFactory.of(actionType);
		return brokeragePolicy.calculate(apartmentService.getPriceOrThrow(apartmentId));
	}
}
