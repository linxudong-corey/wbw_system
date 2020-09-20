package com.wbw.service;

import com.wbw.entity.ApPaymentTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApPaymentTemplateService extends JpaRepository<ApPaymentTemplate, String> {
}
