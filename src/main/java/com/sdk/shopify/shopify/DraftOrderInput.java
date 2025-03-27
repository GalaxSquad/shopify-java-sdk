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

public class DraftOrderInput implements Serializable {
    private Input<DraftOrderAppliedDiscountInput> appliedDiscount = Input.undefined();

    private Input<List<String>> discountCodes = Input.undefined();

    private Input<Boolean> acceptAutomaticDiscounts = Input.undefined();

    private Input<MailingAddressInput> billingAddress = Input.undefined();

    private Input<List<AttributeInput>> customAttributes = Input.undefined();

    private Input<String> email = Input.undefined();

    private Input<List<DraftOrderLineItemInput>> lineItems = Input.undefined();

    private Input<List<MetafieldInput>> metafields = Input.undefined();

    private Input<List<LocalizedFieldInput>> localizedFields = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<MailingAddressInput> shippingAddress = Input.undefined();

    private Input<ShippingLineInput> shippingLine = Input.undefined();

    private Input<List<String>> tags = Input.undefined();

    private Input<Boolean> taxExempt = Input.undefined();

    private Input<Boolean> useCustomerDefaultAddress = Input.undefined();

    private Input<Boolean> visibleToCustomer = Input.undefined();

    private Input<String> reserveInventoryUntil = Input.undefined();

    private Input<CurrencyCode> presentmentCurrencyCode = Input.undefined();

    private Input<String> phone = Input.undefined();

    private Input<PaymentTermsInput> paymentTerms = Input.undefined();

    private Input<PurchasingEntityInput> purchasingEntity = Input.undefined();

    private Input<String> sourceName = Input.undefined();

    private Input<Boolean> allowDiscountCodesInCheckout = Input.undefined();

    private Input<String> poNumber = Input.undefined();

    private Input<String> sessionToken = Input.undefined();

    private Input<String> transformerFingerprint = Input.undefined();

    public DraftOrderAppliedDiscountInput getAppliedDiscount() {
        return appliedDiscount.getValue();
    }

    public Input<DraftOrderAppliedDiscountInput> getAppliedDiscountInput() {
        return appliedDiscount;
    }

    public DraftOrderInput setAppliedDiscount(DraftOrderAppliedDiscountInput appliedDiscount) {
        this.appliedDiscount = Input.optional(appliedDiscount);
        return this;
    }

    public DraftOrderInput setAppliedDiscountInput(Input<DraftOrderAppliedDiscountInput> appliedDiscount) {
        if (appliedDiscount == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.appliedDiscount = appliedDiscount;
        return this;
    }

    public List<String> getDiscountCodes() {
        return discountCodes.getValue();
    }

    public Input<List<String>> getDiscountCodesInput() {
        return discountCodes;
    }

    public DraftOrderInput setDiscountCodes(List<String> discountCodes) {
        this.discountCodes = Input.optional(discountCodes);
        return this;
    }

    public DraftOrderInput setDiscountCodesInput(Input<List<String>> discountCodes) {
        if (discountCodes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.discountCodes = discountCodes;
        return this;
    }

    public Boolean getAcceptAutomaticDiscounts() {
        return acceptAutomaticDiscounts.getValue();
    }

    public Input<Boolean> getAcceptAutomaticDiscountsInput() {
        return acceptAutomaticDiscounts;
    }

    public DraftOrderInput setAcceptAutomaticDiscounts(Boolean acceptAutomaticDiscounts) {
        this.acceptAutomaticDiscounts = Input.optional(acceptAutomaticDiscounts);
        return this;
    }

    public DraftOrderInput setAcceptAutomaticDiscountsInput(Input<Boolean> acceptAutomaticDiscounts) {
        if (acceptAutomaticDiscounts == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.acceptAutomaticDiscounts = acceptAutomaticDiscounts;
        return this;
    }

    public MailingAddressInput getBillingAddress() {
        return billingAddress.getValue();
    }

    public Input<MailingAddressInput> getBillingAddressInput() {
        return billingAddress;
    }

    public DraftOrderInput setBillingAddress(MailingAddressInput billingAddress) {
        this.billingAddress = Input.optional(billingAddress);
        return this;
    }

    public DraftOrderInput setBillingAddressInput(Input<MailingAddressInput> billingAddress) {
        if (billingAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.billingAddress = billingAddress;
        return this;
    }

    public List<AttributeInput> getCustomAttributes() {
        return customAttributes.getValue();
    }

    public Input<List<AttributeInput>> getCustomAttributesInput() {
        return customAttributes;
    }

    public DraftOrderInput setCustomAttributes(List<AttributeInput> customAttributes) {
        this.customAttributes = Input.optional(customAttributes);
        return this;
    }

    public DraftOrderInput setCustomAttributesInput(Input<List<AttributeInput>> customAttributes) {
        if (customAttributes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customAttributes = customAttributes;
        return this;
    }

    public String getEmail() {
        return email.getValue();
    }

    public Input<String> getEmailInput() {
        return email;
    }

    public DraftOrderInput setEmail(String email) {
        this.email = Input.optional(email);
        return this;
    }

    public DraftOrderInput setEmailInput(Input<String> email) {
        if (email == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.email = email;
        return this;
    }

    public List<DraftOrderLineItemInput> getLineItems() {
        return lineItems.getValue();
    }

    public Input<List<DraftOrderLineItemInput>> getLineItemsInput() {
        return lineItems;
    }

    public DraftOrderInput setLineItems(List<DraftOrderLineItemInput> lineItems) {
        this.lineItems = Input.optional(lineItems);
        return this;
    }

    public DraftOrderInput setLineItemsInput(Input<List<DraftOrderLineItemInput>> lineItems) {
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

    public DraftOrderInput setMetafields(List<MetafieldInput> metafields) {
        this.metafields = Input.optional(metafields);
        return this;
    }

    public DraftOrderInput setMetafieldsInput(Input<List<MetafieldInput>> metafields) {
        if (metafields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metafields = metafields;
        return this;
    }

    public List<LocalizedFieldInput> getLocalizedFields() {
        return localizedFields.getValue();
    }

    public Input<List<LocalizedFieldInput>> getLocalizedFieldsInput() {
        return localizedFields;
    }

    public DraftOrderInput setLocalizedFields(List<LocalizedFieldInput> localizedFields) {
        this.localizedFields = Input.optional(localizedFields);
        return this;
    }

    public DraftOrderInput setLocalizedFieldsInput(Input<List<LocalizedFieldInput>> localizedFields) {
        if (localizedFields == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.localizedFields = localizedFields;
        return this;
    }

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public DraftOrderInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public DraftOrderInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public MailingAddressInput getShippingAddress() {
        return shippingAddress.getValue();
    }

    public Input<MailingAddressInput> getShippingAddressInput() {
        return shippingAddress;
    }

    public DraftOrderInput setShippingAddress(MailingAddressInput shippingAddress) {
        this.shippingAddress = Input.optional(shippingAddress);
        return this;
    }

    public DraftOrderInput setShippingAddressInput(Input<MailingAddressInput> shippingAddress) {
        if (shippingAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shippingAddress = shippingAddress;
        return this;
    }

    public ShippingLineInput getShippingLine() {
        return shippingLine.getValue();
    }

    public Input<ShippingLineInput> getShippingLineInput() {
        return shippingLine;
    }

    public DraftOrderInput setShippingLine(ShippingLineInput shippingLine) {
        this.shippingLine = Input.optional(shippingLine);
        return this;
    }

    public DraftOrderInput setShippingLineInput(Input<ShippingLineInput> shippingLine) {
        if (shippingLine == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shippingLine = shippingLine;
        return this;
    }

    public List<String> getTags() {
        return tags.getValue();
    }

    public Input<List<String>> getTagsInput() {
        return tags;
    }

    public DraftOrderInput setTags(List<String> tags) {
        this.tags = Input.optional(tags);
        return this;
    }

    public DraftOrderInput setTagsInput(Input<List<String>> tags) {
        if (tags == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tags = tags;
        return this;
    }

    public Boolean getTaxExempt() {
        return taxExempt.getValue();
    }

    public Input<Boolean> getTaxExemptInput() {
        return taxExempt;
    }

    public DraftOrderInput setTaxExempt(Boolean taxExempt) {
        this.taxExempt = Input.optional(taxExempt);
        return this;
    }

    public DraftOrderInput setTaxExemptInput(Input<Boolean> taxExempt) {
        if (taxExempt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxExempt = taxExempt;
        return this;
    }

    public Boolean getUseCustomerDefaultAddress() {
        return useCustomerDefaultAddress.getValue();
    }

    public Input<Boolean> getUseCustomerDefaultAddressInput() {
        return useCustomerDefaultAddress;
    }

    public DraftOrderInput setUseCustomerDefaultAddress(Boolean useCustomerDefaultAddress) {
        this.useCustomerDefaultAddress = Input.optional(useCustomerDefaultAddress);
        return this;
    }

    public DraftOrderInput setUseCustomerDefaultAddressInput(Input<Boolean> useCustomerDefaultAddress) {
        if (useCustomerDefaultAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.useCustomerDefaultAddress = useCustomerDefaultAddress;
        return this;
    }

    public Boolean getVisibleToCustomer() {
        return visibleToCustomer.getValue();
    }

    public Input<Boolean> getVisibleToCustomerInput() {
        return visibleToCustomer;
    }

    public DraftOrderInput setVisibleToCustomer(Boolean visibleToCustomer) {
        this.visibleToCustomer = Input.optional(visibleToCustomer);
        return this;
    }

    public DraftOrderInput setVisibleToCustomerInput(Input<Boolean> visibleToCustomer) {
        if (visibleToCustomer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.visibleToCustomer = visibleToCustomer;
        return this;
    }

    public String getReserveInventoryUntil() {
        return reserveInventoryUntil.getValue();
    }

    public Input<String> getReserveInventoryUntilInput() {
        return reserveInventoryUntil;
    }

    public DraftOrderInput setReserveInventoryUntil(String reserveInventoryUntil) {
        this.reserveInventoryUntil = Input.optional(reserveInventoryUntil);
        return this;
    }

    public DraftOrderInput setReserveInventoryUntilInput(Input<String> reserveInventoryUntil) {
        if (reserveInventoryUntil == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.reserveInventoryUntil = reserveInventoryUntil;
        return this;
    }

    public CurrencyCode getPresentmentCurrencyCode() {
        return presentmentCurrencyCode.getValue();
    }

    public Input<CurrencyCode> getPresentmentCurrencyCodeInput() {
        return presentmentCurrencyCode;
    }

    public DraftOrderInput setPresentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
        this.presentmentCurrencyCode = Input.optional(presentmentCurrencyCode);
        return this;
    }

    public DraftOrderInput setPresentmentCurrencyCodeInput(Input<CurrencyCode> presentmentCurrencyCode) {
        if (presentmentCurrencyCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.presentmentCurrencyCode = presentmentCurrencyCode;
        return this;
    }

    public String getPhone() {
        return phone.getValue();
    }

    public Input<String> getPhoneInput() {
        return phone;
    }

    public DraftOrderInput setPhone(String phone) {
        this.phone = Input.optional(phone);
        return this;
    }

    public DraftOrderInput setPhoneInput(Input<String> phone) {
        if (phone == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.phone = phone;
        return this;
    }

    public PaymentTermsInput getPaymentTerms() {
        return paymentTerms.getValue();
    }

    public Input<PaymentTermsInput> getPaymentTermsInput() {
        return paymentTerms;
    }

    public DraftOrderInput setPaymentTerms(PaymentTermsInput paymentTerms) {
        this.paymentTerms = Input.optional(paymentTerms);
        return this;
    }

    public DraftOrderInput setPaymentTermsInput(Input<PaymentTermsInput> paymentTerms) {
        if (paymentTerms == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.paymentTerms = paymentTerms;
        return this;
    }

    public PurchasingEntityInput getPurchasingEntity() {
        return purchasingEntity.getValue();
    }

    public Input<PurchasingEntityInput> getPurchasingEntityInput() {
        return purchasingEntity;
    }

    public DraftOrderInput setPurchasingEntity(PurchasingEntityInput purchasingEntity) {
        this.purchasingEntity = Input.optional(purchasingEntity);
        return this;
    }

    public DraftOrderInput setPurchasingEntityInput(Input<PurchasingEntityInput> purchasingEntity) {
        if (purchasingEntity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.purchasingEntity = purchasingEntity;
        return this;
    }

    public String getSourceName() {
        return sourceName.getValue();
    }

    public Input<String> getSourceNameInput() {
        return sourceName;
    }

    public DraftOrderInput setSourceName(String sourceName) {
        this.sourceName = Input.optional(sourceName);
        return this;
    }

    public DraftOrderInput setSourceNameInput(Input<String> sourceName) {
        if (sourceName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sourceName = sourceName;
        return this;
    }

    public Boolean getAllowDiscountCodesInCheckout() {
        return allowDiscountCodesInCheckout.getValue();
    }

    public Input<Boolean> getAllowDiscountCodesInCheckoutInput() {
        return allowDiscountCodesInCheckout;
    }

    public DraftOrderInput setAllowDiscountCodesInCheckout(Boolean allowDiscountCodesInCheckout) {
        this.allowDiscountCodesInCheckout = Input.optional(allowDiscountCodesInCheckout);
        return this;
    }

    public DraftOrderInput setAllowDiscountCodesInCheckoutInput(Input<Boolean> allowDiscountCodesInCheckout) {
        if (allowDiscountCodesInCheckout == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.allowDiscountCodesInCheckout = allowDiscountCodesInCheckout;
        return this;
    }

    public String getPoNumber() {
        return poNumber.getValue();
    }

    public Input<String> getPoNumberInput() {
        return poNumber;
    }

    public DraftOrderInput setPoNumber(String poNumber) {
        this.poNumber = Input.optional(poNumber);
        return this;
    }

    public DraftOrderInput setPoNumberInput(Input<String> poNumber) {
        if (poNumber == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.poNumber = poNumber;
        return this;
    }

    public String getSessionToken() {
        return sessionToken.getValue();
    }

    public Input<String> getSessionTokenInput() {
        return sessionToken;
    }

    public DraftOrderInput setSessionToken(String sessionToken) {
        this.sessionToken = Input.optional(sessionToken);
        return this;
    }

    public DraftOrderInput setSessionTokenInput(Input<String> sessionToken) {
        if (sessionToken == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sessionToken = sessionToken;
        return this;
    }

    public String getTransformerFingerprint() {
        return transformerFingerprint.getValue();
    }

    public Input<String> getTransformerFingerprintInput() {
        return transformerFingerprint;
    }

    public DraftOrderInput setTransformerFingerprint(String transformerFingerprint) {
        this.transformerFingerprint = Input.optional(transformerFingerprint);
        return this;
    }

    public DraftOrderInput setTransformerFingerprintInput(Input<String> transformerFingerprint) {
        if (transformerFingerprint == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.transformerFingerprint = transformerFingerprint;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.appliedDiscount.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("appliedDiscount:");
            if (appliedDiscount.getValue() != null) {
                appliedDiscount.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.discountCodes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("discountCodes:");
            if (discountCodes.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : discountCodes.getValue()) {
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

        if (this.acceptAutomaticDiscounts.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("acceptAutomaticDiscounts:");
            if (acceptAutomaticDiscounts.getValue() != null) {
                _queryBuilder.append(acceptAutomaticDiscounts.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.customAttributes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customAttributes:");
            if (customAttributes.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (AttributeInput item1 : customAttributes.getValue()) {
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

        if (this.lineItems.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("lineItems:");
            if (lineItems.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DraftOrderLineItemInput item1 : lineItems.getValue()) {
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

        if (this.localizedFields.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("localizedFields:");
            if (localizedFields.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (LocalizedFieldInput item1 : localizedFields.getValue()) {
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

        if (this.shippingLine.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shippingLine:");
            if (shippingLine.getValue() != null) {
                shippingLine.getValue().appendTo(_queryBuilder);
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

        if (this.taxExempt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("taxExempt:");
            if (taxExempt.getValue() != null) {
                _queryBuilder.append(taxExempt.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.useCustomerDefaultAddress.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("useCustomerDefaultAddress:");
            if (useCustomerDefaultAddress.getValue() != null) {
                _queryBuilder.append(useCustomerDefaultAddress.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.visibleToCustomer.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("visibleToCustomer:");
            if (visibleToCustomer.getValue() != null) {
                _queryBuilder.append(visibleToCustomer.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.reserveInventoryUntil.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("reserveInventoryUntil:");
            if (reserveInventoryUntil.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, reserveInventoryUntil.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.presentmentCurrencyCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("presentmentCurrencyCode:");
            if (presentmentCurrencyCode.getValue() != null) {
                _queryBuilder.append(presentmentCurrencyCode.getValue().toString());
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

        if (this.paymentTerms.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("paymentTerms:");
            if (paymentTerms.getValue() != null) {
                paymentTerms.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.purchasingEntity.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("purchasingEntity:");
            if (purchasingEntity.getValue() != null) {
                purchasingEntity.getValue().appendTo(_queryBuilder);
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

        if (this.allowDiscountCodesInCheckout.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("allowDiscountCodesInCheckout:");
            if (allowDiscountCodesInCheckout.getValue() != null) {
                _queryBuilder.append(allowDiscountCodesInCheckout.getValue());
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

        if (this.sessionToken.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sessionToken:");
            if (sessionToken.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, sessionToken.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.transformerFingerprint.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("transformerFingerprint:");
            if (transformerFingerprint.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, transformerFingerprint.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
