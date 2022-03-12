package com.mocadev.cleancode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-03-11
 *
 * 서비스 헬스 체크를 위한 컨트롤러
 **/
@RestController
public class HealthCheckController {

	@GetMapping("/api/ping")
	public String ping() {
		return "ok";
	}

}
