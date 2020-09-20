package com.wbw;

import com.wbw.entity.ApPaymentTemplate;
import com.wbw.service.ApPaymentTemplateService;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(value = SpringRunner.class)
@SpringBootTest
class ApplicationTests {

	@Autowired
	ApPaymentTemplateService apPaymentTemplateService;

	@Test
	void contextLoads() {
		ApPaymentTemplate apPaymentTemplate = new ApPaymentTemplate();
		apPaymentTemplate.setId("12345");
		apPaymentTemplate.setItemName("lxd");
		apPaymentTemplateService.save(apPaymentTemplate);
	}
}
