package com.example.spring.properties.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaPropertyFile {

	@Value("${first.value}")
	private String firstValue;

	@Value("${second.value}")
	private String secondValue;

	public String getFirstValue() {
		return firstValue;
	}

	public String getSecondValue() {
		return secondValue;
	}

	@PostConstruct
	private void validate() {
		if (firstValue == null) {
			throw new RuntimeException("[firstValue] property is not set");
		}
		if (secondValue == null) {
			throw new RuntimeException("[secondValue] property is not set");
		}
	}
}
