package com.wbw.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 付款计算表项的模板 实体类
 * @author linxudong
 * @date 2020-04-10
 * @since 1.0
 */
@Entity
@Table(name = "ap_payment_template")
public class ApPaymentTemplate implements Serializable {

    private static final long serialVersionUID = 1L;
	@Id
	private String id;
	/**
     * attribute_context
     */
	private String attributeContext;
    /**
     * attribute_value
     */
	private String attributeValue;
    /**
     * 粮单结算类型
     */
	private String paymentTicketType;
    /**
     * 付款计算表项目类别编码
     */
	private String itemCategoryCode;
    /**
     * 付款计算表项目类别名称
     */
	private String itemCategoryName;
    /**
     * 序号
     */
	private Integer lineNum;
    /**
     * 付款计算表项编码
     */
	private String itemCode;
    /**
     * 付款计算表项名称
     */
	private String itemName;
    /**
     * 结算事务类型列表
     */
	private String paymentTransactionType;
    /**
     * 是否启用
     */
	private String enabled;
    /**
     * 启用日期
     */
	private Date startDate;
    /**
     * 失效日期
     */
	private Date endDate;
    /**
     * 是否编辑
     */
	private String editFlag;
    /**
     * 备注
     */
	private String remark;
	/**
	 * 计算表达式
	 */
	private String expression;
	/**
	 * 租户
	 */
	private String tenantCode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAttributeContext() {
		return attributeContext;
	}

	public void setAttributeContext(String attributeContext) {
		this.attributeContext = attributeContext;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	public String getPaymentTicketType() {
		return paymentTicketType;
	}

	public void setPaymentTicketType(String paymentTicketType) {
		this.paymentTicketType = paymentTicketType;
	}

	public String getItemCategoryCode() {
		return itemCategoryCode;
	}

	public void setItemCategoryCode(String itemCategoryCode) {
		this.itemCategoryCode = itemCategoryCode;
	}

	public String getItemCategoryName() {
		return itemCategoryName;
	}

	public void setItemCategoryName(String itemCategoryName) {
		this.itemCategoryName = itemCategoryName;
	}

	public Integer getLineNum() {
		return lineNum;
	}

	public void setLineNum(Integer lineNum) {
		this.lineNum = lineNum;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPaymentTransactionType() {
		return paymentTransactionType;
	}

	public void setPaymentTransactionType(String paymentTransactionType) {
		this.paymentTransactionType = paymentTransactionType;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getEditFlag() {
		return editFlag;
	}

	public void setEditFlag(String editFlag) {
		this.editFlag = editFlag;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getTenantCode() {
		return tenantCode;
	}

	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}
}
