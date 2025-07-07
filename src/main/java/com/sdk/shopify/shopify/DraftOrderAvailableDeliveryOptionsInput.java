// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class DraftOrderAvailableDeliveryOptionsInput implements Serializable {
    private Input<DraftOrderAppliedDiscountInput> appliedDiscount = Input.undefined();

    private Input<List<String>> discountCodes = Input.undefined();

    private Input<Boolean> acceptAutomaticDiscounts = Input.undefined();

    private Input<List<DraftOrderLineItemInput>> lineItems = Input.undefined();

    private Input<MailingAddressInput> shippingAddress = Input.undefined();

    private Input<CountryCode> marketRegionCountryCode = Input.undefined();

    private Input<PurchasingEntityInput> purchasingEntity = Input.undefined();

    public DraftOrderAppliedDiscountInput getAppliedDiscount() {
        return appliedDiscount.getValue();
    }

    public Input<DraftOrderAppliedDiscountInput> getAppliedDiscountInput() {
        return appliedDiscount;
    }

    public DraftOrderAvailableDeliveryOptionsInput setAppliedDiscount(DraftOrderAppliedDiscountInput appliedDiscount) {
        this.appliedDiscount = Input.optional(appliedDiscount);
        return this;
    }

    public DraftOrderAvailableDeliveryOptionsInput setAppliedDiscountInput(Input<DraftOrderAppliedDiscountInput> appliedDiscount) {
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

    public DraftOrderAvailableDeliveryOptionsInput setDiscountCodes(List<String> discountCodes) {
        this.discountCodes = Input.optional(discountCodes);
        return this;
    }

    public DraftOrderAvailableDeliveryOptionsInput setDiscountCodesInput(Input<List<String>> discountCodes) {
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

    public DraftOrderAvailableDeliveryOptionsInput setAcceptAutomaticDiscounts(Boolean acceptAutomaticDiscounts) {
        this.acceptAutomaticDiscounts = Input.optional(acceptAutomaticDiscounts);
        return this;
    }

    public DraftOrderAvailableDeliveryOptionsInput setAcceptAutomaticDiscountsInput(Input<Boolean> acceptAutomaticDiscounts) {
        if (acceptAutomaticDiscounts == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.acceptAutomaticDiscounts = acceptAutomaticDiscounts;
        return this;
    }

    public List<DraftOrderLineItemInput> getLineItems() {
        return lineItems.getValue();
    }

    public Input<List<DraftOrderLineItemInput>> getLineItemsInput() {
        return lineItems;
    }

    public DraftOrderAvailableDeliveryOptionsInput setLineItems(List<DraftOrderLineItemInput> lineItems) {
        this.lineItems = Input.optional(lineItems);
        return this;
    }

    public DraftOrderAvailableDeliveryOptionsInput setLineItemsInput(Input<List<DraftOrderLineItemInput>> lineItems) {
        if (lineItems == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lineItems = lineItems;
        return this;
    }

    public MailingAddressInput getShippingAddress() {
        return shippingAddress.getValue();
    }

    public Input<MailingAddressInput> getShippingAddressInput() {
        return shippingAddress;
    }

    public DraftOrderAvailableDeliveryOptionsInput setShippingAddress(MailingAddressInput shippingAddress) {
        this.shippingAddress = Input.optional(shippingAddress);
        return this;
    }

    public DraftOrderAvailableDeliveryOptionsInput setShippingAddressInput(Input<MailingAddressInput> shippingAddress) {
        if (shippingAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shippingAddress = shippingAddress;
        return this;
    }

    public CountryCode getMarketRegionCountryCode() {
        return marketRegionCountryCode.getValue();
    }

    public Input<CountryCode> getMarketRegionCountryCodeInput() {
        return marketRegionCountryCode;
    }

    public DraftOrderAvailableDeliveryOptionsInput setMarketRegionCountryCode(CountryCode marketRegionCountryCode) {
        this.marketRegionCountryCode = Input.optional(marketRegionCountryCode);
        return this;
    }

    public DraftOrderAvailableDeliveryOptionsInput setMarketRegionCountryCodeInput(Input<CountryCode> marketRegionCountryCode) {
        if (marketRegionCountryCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.marketRegionCountryCode = marketRegionCountryCode;
        return this;
    }

    public PurchasingEntityInput getPurchasingEntity() {
        return purchasingEntity.getValue();
    }

    public Input<PurchasingEntityInput> getPurchasingEntityInput() {
        return purchasingEntity;
    }

    public DraftOrderAvailableDeliveryOptionsInput setPurchasingEntity(PurchasingEntityInput purchasingEntity) {
        this.purchasingEntity = Input.optional(purchasingEntity);
        return this;
    }

    public DraftOrderAvailableDeliveryOptionsInput setPurchasingEntityInput(Input<PurchasingEntityInput> purchasingEntity) {
        if (purchasingEntity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.purchasingEntity = purchasingEntity;
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

        if (this.marketRegionCountryCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("marketRegionCountryCode:");
            if (marketRegionCountryCode.getValue() != null) {
                _queryBuilder.append(marketRegionCountryCode.getValue().toString());
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

        _queryBuilder.append('}');
    }
}
