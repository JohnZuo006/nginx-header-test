package top.zuoxinlei.controller;

import java.net.http.HttpHeaders;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	@RequestMapping("/test")
	public Object test(@RequestHeader Map<String,String> headers)
	{
		logger.info("headers==>{}", headers);
		logger.info("headersÊýÁ¿==>{}", headers.size());
		return headers;
	}

}
