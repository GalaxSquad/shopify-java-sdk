// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.io.Serializable;
import java.util.List;

public class OrderCreateOrderInput implements Serializable {
    private Input<MailingAddressInput> billingAddress = Input.undefined();

    private Input<Boolean> buyerAcceptsMarketing = Input.undefined();

    private Input<String> closedAt = Input.undefined();

    private Input<ID> companyLocationId = Input.undefined();

    private Input<CurrencyCode> currency = Input.undefined();

    private Input<List<OrderCreateCustomAttributeInput>> customAttributes = Input.undefined();

    private Input<OrderCreateCustomerInput> customer = Input.undefined();

    private Input<OrderCreateDiscountCodeInput> discountCode = Input.undefined();

    private Input<String> email = Input.undefined();

    private Input<OrderCreateFinancialStatus> financialStatus = Input.undefined();

    private Input<OrderCreateFulfillmentInput> fulfillment = Input.undefined();

    private Input<OrderCreateFulfillmentStatus> fulfillmentStatus = Input.undefined();

    private Input<List<OrderCreateLineItemInput>> lineItems = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<String> phone = Input.undefined();

    private Input<String> poNumber = Input.undefined();

    private Input<CurrencyCode> presentmentCurrency = Input.undefined();

    private Input<String> processedAt = Input.undefined();

    private Input<String> referringSite = Input.undefined();

    private Input<MailingAddressInput> shippingAddress = Input.undefined();

    private Input<List<OrderCreateShippingLineInput>> shippingLines = Input.undefined();

    private Input<String> sourceIdentifier = Input.undefined();

    private Input<String> sourceName = Input.undefined();

    private Input<String> sourceUrl = Input.undefined();

    private Input<List<String>> tags = Input.undefined();

    private Input<Boolean> taxesIncluded = Input.undefined();

    private Input<List<OrderCreateTaxLineInput>> taxLines = Input.undefined();

    private Input<Boolean> test = Input.undefined();

    private Input<List<OrderCreateOrderTransactionInput>> transactions = Input.undefined();

    private Input<ID> userId = Input.undefined();

    public MailingAddressInput getBillingAddress() {
        return billingAddress.getValue();
    }

    public Input<MailingAddressInput> getBillingAddressInput() {
        return billingAddress;
    }

    public OrderCreateOrderInput setBillingAddress(MailingAddressInput billingAddress) {
        this.billingAddress = Input.optional(billingAddress);
        return this;
    }

    public OrderCreateOrderInput setBillingAddressInput(Input<MailingAddressInput> billingAddress) {
        if (billingAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.billingAddress = billingAddress;
        return this;
    }

    public Boolean getBuyerAcceptsMarketing() {
        return buyerAcceptsMarketing.getValue();
    }

    public Input<Boolean> getBuyerAcceptsMarketingInput() {
        return buyerAcceptsMarketing;
    }

    public OrderCreateOrderInput setBuyerAcceptsMarketing(Boolean buyerAcceptsMarketing) {
        this.buyerAcceptsMarketing = Input.optional(buyerAcceptsMarketing);
        return this;
    }

    public OrderCreateOrderInput setBuyerAcceptsMarketingInput(Input<Boolean> buyerAcceptsMarketing) {
        if (buyerAcceptsMarketing == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.buyerAcceptsMarketing = buyerAcceptsMarketing;
        return this;
    }

    public String getClosedAt() {
        return closedAt.getValue();
    }

    public Input<String> getClosedAtInput() {
        return closedAt;
    }

    public OrderCreateOrderInput setClosedAt(String closedAt) {
        this.closedAt = Input.optional(closedAt);
        return this;
    }

    public OrderCreateOrderInput setClosedAtInput(Input<String> closedAt) {
        if (closedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.closedAt = closedAt;
        return this;
    }

    public ID getCompanyLocationId() {
        return companyLocationId.getValue();
    }

    public Input<ID> getCompanyLocationIdInput() {
        return companyLocationId;
    }

    public OrderCreateOrderInput setCompanyLocationId(ID companyLocationId) {
        this.companyLocationId = Input.optional(companyLocationId);
        return this;
    }

    public OrderCreateOrderInput setCompanyLocationIdInput(Input<ID> companyLocationId) {
        if (companyLocationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.companyLocationId = companyLocationId;
        return this;
    }

    public CurrencyCode getCurrency() {
        return currency.getValue();
    }

    public Input<CurrencyCode> getCurrencyInput() {
        return currency;
    }

    public OrderCreateOrderInput setCurrency(CurrencyCode currency) {
        this.currency = Input.optional(currency);
        return this;
    }

    public OrderCreateOrderInput setCurrencyInput(Input<CurrencyCode> currency) {
        if (currency == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.currency = currency;
        return this;
    }

    public List<OrderCreateCustomAttributeInput> getCustomAttributes() {
        return customAttributes.getValue();
    }

    public Input<List<OrderCreateCustomAttributeInput>> getCustomAttributesInput() {
        return customAttributes;
    }

    public OrderCreateOrderInput setCustomAttributes(List<OrderCreateCustomAttributeInput> customAttributes) {
        this.customAttributes = Input.optional(customAttributes);
        return this;
    }

    public OrderCreateOrderInput setCustomAttributesInput(Input<List<OrderCreateCustomAttributeInput>> customAttributes) {
        if (customAttributes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customAttributes = customAttributes;
        return this;
    }

    public OrderCreateCustomerInput getCustomer() {
        return customer.getValue();
    }

    public Input<OrderCreateCustomerInput> getCustomerInput() {
        return customer;
    }

    public OrderCreateOrderInput setCustomer(OrderCreateCustomerInput customer) {
        this.customer = Input.optional(customer);
        return this;
    }

    public OrderCreateOrderInput setCustomerInput(Input<OrderCreateCustomerInput> customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customer = customer;
        return this;
    }

    public OrderCreateDiscountCodeInput getDiscountCode() {
        return discountCode.getValue();
    }

    public Input<OrderCreateDiscountCodeInput> getDiscountCodeInput() {
        return discountCode;
    }

    public OrderCreateOrderInput setDiscountCode(OrderCreateDiscountCodeInput discountCode) {
        this.discountCode = Input.optional(discountCode);
        return this;
    }

    public OrderCreateOrderInput setDiscountCodeInput(Input<OrderCreateDiscountCodeInput> discountCode) {
        if (discountCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.discountCode = discountCode;
        return this;
    }

    public String getEmail() {
        return email.getValue();
    }

    public Input<String> getEmailInput() {
        return email;
    }

    public OrderCreateOrderInput setEmail(String email) {
        this.email = Input.optional(email);
        return this;
    }

    public OrderCreateOrderInput setEmailInput(Input<String> email) {
        if (email == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.email = email;
        return this;
    }

    public OrderCreateFinancialStatus getFinancialStatus() {
        return financialStatus.getValue();
    }

    public Input<OrderCreateFinancialStatus> getFinancialStatusInput() {
        return financialStatus;
    }

    public OrderCreateOrderInput setFinancialStatus(OrderCreateFinancialStatus financialStatus) {
        this.financialStatus = Input.optional(financialStatus);
        return this;
    }

    public OrderCreateOrderInput setFinancialStatusInput(Input<OrderCreateFinancialStatus> financialStatus) {
        if (financialStatus == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.financialStatus = financialStatus;
        return this;
    }

    public OrderCreateFulfillmentInput getFulfillment() {
        return fulfillment.getValue();
    }

    public Input<OrderCreateFulfillmentInput> getFulfillmentInput() {
        return fulfillment;
    }

    public OrderCreateOrderInput setFulfillment(OrderCreateFulfillmentInput fulfillment) {
        this.fulfillment = Input.optional(fulfillment);
        return this;
    }

    public OrderCreateOrderInput setFulfillmentInput(Input<OrderCreateFulfillmentInput> fulfillment) {
        if (fulfillment == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fulfillment = fulfillment;
        return this;
    }

    public OrderCreateFulfillmentStatus getFulfillmentStatus() {
        return fulfillmentStatus.getValue();
    }

    public Input<OrderCreateFulfillmentStatus> getFulfillmentStatusInput() {
        return fulfillmentStatus;
    }

    public OrderCreateOrderInput setFulfillmentStatus(OrderCreateFulfillmentStatus fulfillmentStatus) {
        this.fulfillmentStatus = Input.optional(fulfillmentStatus);
        return this;
    }

    public OrderCreateOrderInput setFulfillmentStatusInput(Input<OrderCreateFulfillmentStatus> fulfillmentStatus) {
        if (fulfillmentStatus == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fulfillmentStatus = fulfillmentStatus;
        return this;
    }

    public List<OrderCreateLineItemInput> getLineItems() {
        return lineItems.getValue();
    }

    public Input<List<OrderCreateLineItemInput>> getLineItemsInput() {
        return lineItems;
    }

    public OrderCreateOrderInput setLineItems(List<OrderCreateLineItemInput> lineItems) {
        this.lineItems = Input.optional(lineItems);
        return this;
    }

    public OrderCreateOrderInput setLineItemsInput(Input<List<OrderCreateLineItemInput>> lineItems) {
        if (lineItems == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lineItems = lineItems;
        return this;
    }

    public List<MetafieldInput> getMetafields() {
        return metafields.getValue();
    }

    public Input<List<MetafieldInput>> getMetafieldsInput() {
        return metafields;
    }

    public OrderCreateOrderInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public OrderCreateOrderInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public OrderCreateOrderInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public OrderCreateOrderInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public OrderCreateOrderInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public OrderCreateOrderInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public String getPhone() {
        return phone.getValue();
    }

    public Input<String> getPhoneInput() {
        return phone;
    }

    public OrderCreateOrderInput setPhone(String phone) {
        this.phone = Input.optional(phone);
        return this;
    }

    public OrderCreateOrderInput setPhoneInput(Input<String> phone) {
        if (phone == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.phone = phone;
        return this;
    }

    public String getPoNumber() {
        return poNumber.getValue();
    }

    public Input<String> getPoNumberInput() {
        return poNumber;
    }

    public OrderCreateOrderInput setPoNumber(String poNumber) {
        this.poNumber = Input.optional(poNumber);
        return this;
    }

    public OrderCreateOrderInput setPoNumberInput(Input<String> poNumber) {
        if (poNumber == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.poNumber = poNumber;
        return this;
    }

    public CurrencyCode getPresentmentCurrency() {
        return presentmentCurrency.getValue();
    }

    public Input<CurrencyCode> getPresentmentCurrencyInput() {
        return presentmentCurrency;
    }

    public OrderCreateOrderInput setPresentmentCurrency(CurrencyCode presentmentCurrency) {
        this.presentmentCurrency = Input.optional(presentmentCurrency);
        return this;
    }

    public OrderCreateOrderInput setPresentmentCurrencyInput(Input<CurrencyCode> presentmentCurrency) {
        if (presentmentCurrency == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.presentmentCurrency = presentmentCurrency;
        return this;
    }

    public String getProcessedAt() {
        return processedAt.getValue();
    }

    public Input<String> getProcessedAtInput() {
        return processedAt;
    }

    public OrderCreateOrderInput setProcessedAt(String processedAt) {
        this.processedAt = Input.optional(processedAt);
        return this;
    }

    public OrderCreateOrderInput setProcessedAtInput(Input<String> processedAt) {
        if (processedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.processedAt = processedAt;
        return this;
    }

    public String getReferringSite() {
        return referringSite.getValue();
    }

    public Input<String> getReferringSiteInput() {
        return referringSite;
    }

    public OrderCreateOrderInput setReferringSite(String referringSite) {
        this.referringSite = Input.optional(referringSite);
        return this;
    }

    public OrderCreateOrderInput setReferringSiteInput(Input<String> referringSite) {
        if (referringSite == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.referringSite = referringSite;
        return this;
    }

    public MailingAddressInput getShippingAddress() {
        return shippingAddress.getValue();
    }

    public Input<MailingAddressInput> getShippingAddressInput() {
        return shippingAddress;
    }

    public OrderCreateOrderInput setShippingAddress(MailingAddressInput shippingAddress) {
        this.shippingAddress = Input.optional(shippingAddress);
        return this;
    }

    public OrderCreateOrderInput setShippingAddressInput(Input<MailingAddressInput> shippingAddress) {
        if (shippingAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shippingAddress = shippingAddress;
        return this;
    }

    public List<OrderCreateShippingLineInput> getShippingLines() {
        return shippingLines.getValue();
    }

    public Input<List<OrderCreateShippingLineInput>> getShippingLinesInput() {
        return shippingLines;
    }

    public OrderCreateOrderInput setShippingLines(List<OrderCreateShippingLineInput> shippingLines) {
        this.shippingLines = Input.optional(shippingLines);
        return this;
    }

    public OrderCreateOrderInput setShippingLinesInput(Input<List<OrderCreateShippingLineInput>> shippingLines) {
        if (shippingLines == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shippingLines = shippingLines;
        return this;
    }

    public String getSourceIdentifier() {
        return sourceIdentifier.getValue();
    }

    public Input<String> getSourceIdentifierInput() {
        return sourceIdentifier;
    }

    public OrderCreateOrderInput setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = Input.optional(sourceIdentifier);
        return this;
    }

    public OrderCreateOrderInput setSourceIdentifierInput(Input<String> sourceIdentifier) {
        if (sourceIdentifier == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    public String getSourceName() {
        return sourceName.getValue();
    }

    public Input<String> getSourceNameInput() {
        return sourceName;
    }

    public OrderCreateOrderInput setSourceName(String sourceName) {
        this.sourceName = Input.optional(sourceName);
        return this;
    }

    public OrderCreateOrderInput setSourceNameInput(Input<String> sourceName) {
        if (sourceName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sourceName = sourceName;
        return this;
    }

    public String getSourceUrl() {
        return sourceUrl.getValue();
    }

    public Input<String> getSourceUrlInput() {
        return sourceUrl;
    }

    public OrderCreateOrderInput setSourceUrl(String sourceUrl) {
        this.sourceUrl = Input.optional(sourceUrl);
        return this;
    }

    public OrderCreateOrderInput setSourceUrlInput(Input<String> sourceUrl) {
        if (sourceUrl == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sourceUrl = sourceUrl;
        return this;
    }

    public List<String> getTags() {
        return tags.getValue();
    }

    public Input<List<String>> getTagsInput() {
        return tags;
    }

    public OrderCreateOrderInput setTags(List<String> tags) {
        this.tags = Input.optional(tags);
        return this;
    }

    public OrderCreateOrderInput setTagsInput(Input<List<String>> tags) {
        if (tags == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tags = tags;
        return this;
    }

    public Boolean getTaxesIncluded() {
        return taxesIncluded.getValue();
    }

    public Input<Boolean> getTaxesIncludedInput() {
        return taxesIncluded;
    }

    public OrderCreateOrderInput setTaxesIncluded(Boolean taxesIncluded) {
        this.taxesIncluded = Input.optional(taxesIncluded);
        return this;
    }

    public OrderCreateOrderInput setTaxesIncludedInput(Input<Boolean> taxesIncluded) {
        if (taxesIncluded == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxesIncluded = taxesIncluded;
        return this;
    }

    public List<OrderCreateTaxLineInput> getTaxLines() {
        return taxLines.getValue();
    }

    public Input<List<OrderCreateTaxLineInput>> getTaxLinesInput() {
        return taxLines;
    }

    public OrderCreateOrderInput setTaxLines(List<OrderCreateTaxLineInput> taxLines) {
        this.taxLines = Input.optional(taxLines);
        return this;
    }

    public OrderCreateOrderInput setTaxLinesInput(Input<List<OrderCreateTaxLineInput>> taxLines) {
        if (taxLines == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxLines = taxLines;
        return this;
    }

    public Boolean getTest() {
        return test.getValue();
    }

    public Input<Boolean> getTestInput() {
        return test;
    }

    public OrderCreateOrderInput setTest(Boolean test) {
        this.test = Input.optional(test);
        return this;
    }

    public OrderCreateOrderInput setTestInput(Input<Boolean> test) {
        if (test == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.test = test;
        return this;
    }

    public List<OrderCreateOrderTransactionInput> getTransactions() {
        return transactions.getValue();
    }

    public Input<List<OrderCreateOrderTransactionInput>> getTransactionsInput() {
        return transactions;
    }

    public OrderCreateOrderInput setTransactions(List<OrderCreateOrderTransactionInput> transactions) {
        this.transactions = Input.optional(transactions);
        return this;
    }

    public OrderCreateOrderInput setTransactionsInput(Input<List<OrderCreateOrderTransactionInput>> transactions) {
        if (transactions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.transactions = transactions;
        return this;
    }

    public ID getUserId() {
        return userId.getValue();
    }

    public Input<ID> getUserIdInput() {
        return userId;
    }

    public OrderCreateOrderInput setUserId(ID userId) {
        this.userId = Input.optional(userId);
        return this;
    }

    public OrderCreateOrderInput setUserIdInput(Input<ID> userId) {
        if (userId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.userId = userId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.billingAddress.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("billingAddress:");
            if (billingAddress.getValue() != null) {
                billingAddress.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.buyerAcceptsMarketing.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("buyerAcceptsMarketing:");
            if (buyerAcceptsMarketing.getValue() != null) {
                _queryBuilder.append(buyerAcceptsMarketing.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.closedAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("closedAt:");
            if (closedAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, closedAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.companyLocationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("companyLocationId:");
            if (companyLocationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, companyLocationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.currency.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("currency:");
            if (currency.getValue() != null) {
                _queryBuilder.append(currency.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customAttributes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customAttributes:");
            if (customAttributes.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OrderCreateCustomAttributeInput item1 : customAttributes.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customer.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customer:");
            if (customer.getValue() != null) {
                customer.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.discountCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("discountCode:");
            if (discountCode.getValue() != null) {
                discountCode.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.email.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("email:");
            if (email.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, email.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.financialStatus.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("financialStatus:");
            if (financialStatus.getValue() != null) {
                _queryBuilder.append(financialStatus.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.fulfillment.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fulfillment:");
            if (fulfillment.getValue() != null) {
                fulfillment.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.fulfillmentStatus.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fulfillmentStatus:");
            if (fulfillmentStatus.getValue() != null) {
                _queryBuilder.append(fulfillmentStatus.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.lineItems.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("lineItems:");
            if (lineItems.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OrderCreateLineItemInput item1 : lineItems.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metafields.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("metafields:");
            if (metafields.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MetafieldInput item1 : metafields.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.note.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("note:");
            if (note.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, note.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.phone.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("phone:");
            if (phone.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, phone.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.poNumber.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("poNumber:");
            if (poNumber.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, poNumber.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.presentmentCurrency.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("presentmentCurrency:");
            if (presentmentCurrency.getValue() != null) {
                _queryBuilder.append(presentmentCurrency.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.processedAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("processedAt:");
            if (processedAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, processedAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.referringSite.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("referringSite:");
            if (referringSite.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, referringSite.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.shippingAddress.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shippingAddress:");
            if (shippingAddress.getValue() != null) {
                shippingAddress.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.shippingLines.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shippingLines:");
            if (shippingLines.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OrderCreateShippingLineInput item1 : shippingLines.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sourceIdentifier.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sourceIdentifier:");
            if (sourceIdentifier.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, sourceIdentifier.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sourceName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sourceName:");
            if (sourceName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, sourceName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sourceUrl.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sourceUrl:");
            if (sourceUrl.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, sourceUrl.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.tags.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("tags:");
            if (tags.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : tags.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.taxesIncluded.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("taxesIncluded:");
            if (taxesIncluded.getValue() != null) {
                _queryBuilder.append(taxesIncluded.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.taxLines.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("taxLines:");
            if (taxLines.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OrderCreateTaxLineInput item1 : taxLines.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.test.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("test:");
            if (test.getValue() != null) {
                _queryBuilder.append(test.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.transactions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("transactions:");
            if (transactions.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OrderCreateOrderTransactionInput item1 : transactions.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.userId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("userId:");
            if (userId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, userId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
