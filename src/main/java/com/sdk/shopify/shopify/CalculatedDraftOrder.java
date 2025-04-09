// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The calculated fields for a draft order.
*/
public class CalculatedDraftOrder extends AbstractResponse<CalculatedDraftOrder> {
    public CalculatedDraftOrder() {
    }

    public CalculatedDraftOrder(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "acceptAutomaticDiscounts": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "alerts": {
                    List<ResourceAlert> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ResourceAlert(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "allVariantPricesOverridden": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "anyVariantPricesOverridden": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "appliedDiscount": {
                    DraftOrderAppliedDiscount optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrderAppliedDiscount(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "availableShippingRates": {
                    List<ShippingRate> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ShippingRate(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "billingAddressMatchesShippingAddress": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "currencyCode": {
                    responseData.put(key, CurrencyCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "customer": {
                    Customer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Customer(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodes": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "lineItems": {
                    List<CalculatedDraftOrderLineItem> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CalculatedDraftOrderLineItem(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "lineItemsSubtotalPrice": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "phone": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "platformDiscounts": {
                    List<DraftOrderPlatformDiscount> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DraftOrderPlatformDiscount(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "presentmentCurrencyCode": {
                    responseData.put(key, CurrencyCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "purchasingEntity": {
                    PurchasingEntity optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownPurchasingEntity.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shippingLine": {
                    ShippingLine optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShippingLine(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subtotalPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "taxLines": {
                    List<TaxLine> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new TaxLine(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "taxesIncluded": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "totalDiscountsSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalLineItemsPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalQuantityOfLineItems": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "totalShippingPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalTaxSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "transformerFingerprint": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "warnings": {
                    List<DraftOrderWarning> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(UnknownDraftOrderWarning.create(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "CalculatedDraftOrder";
    }

    /**
    * Whether or not to accept automatic discounts on the draft order during calculation.
    * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be
    * applied.
    * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft
    * order discounts.
    */

    public Boolean getAcceptAutomaticDiscounts() {
        return (Boolean) get("acceptAutomaticDiscounts");
    }

    public CalculatedDraftOrder setAcceptAutomaticDiscounts(Boolean arg) {
        optimisticData.put(getKey("acceptAutomaticDiscounts"), arg);
        return this;
    }

    /**
    * The list of alerts raised while calculating.
    */

    public List<ResourceAlert> getAlerts() {
        return (List<ResourceAlert>) get("alerts");
    }

    public CalculatedDraftOrder setAlerts(List<ResourceAlert> arg) {
        optimisticData.put(getKey("alerts"), arg);
        return this;
    }

    /**
    * Whether all variant prices have been overridden.
    */

    public Boolean getAllVariantPricesOverridden() {
        return (Boolean) get("allVariantPricesOverridden");
    }

    public CalculatedDraftOrder setAllVariantPricesOverridden(Boolean arg) {
        optimisticData.put(getKey("allVariantPricesOverridden"), arg);
        return this;
    }

    /**
    * Whether any variant prices have been overridden.
    */

    public Boolean getAnyVariantPricesOverridden() {
        return (Boolean) get("anyVariantPricesOverridden");
    }

    public CalculatedDraftOrder setAnyVariantPricesOverridden(Boolean arg) {
        optimisticData.put(getKey("anyVariantPricesOverridden"), arg);
        return this;
    }

    /**
    * The custom order-level discount applied.
    */

    public DraftOrderAppliedDiscount getAppliedDiscount() {
        return (DraftOrderAppliedDiscount) get("appliedDiscount");
    }

    public CalculatedDraftOrder setAppliedDiscount(DraftOrderAppliedDiscount arg) {
        optimisticData.put(getKey("appliedDiscount"), arg);
        return this;
    }

    /**
    * The available shipping rates.
    * Requires a customer with a valid shipping address and at least one line item.
    */

    public List<ShippingRate> getAvailableShippingRates() {
        return (List<ShippingRate>) get("availableShippingRates");
    }

    public CalculatedDraftOrder setAvailableShippingRates(List<ShippingRate> arg) {
        optimisticData.put(getKey("availableShippingRates"), arg);
        return this;
    }

    /**
    * Whether the billing address matches the shipping address.
    */

    public Boolean getBillingAddressMatchesShippingAddress() {
        return (Boolean) get("billingAddressMatchesShippingAddress");
    }

    public CalculatedDraftOrder setBillingAddressMatchesShippingAddress(Boolean arg) {
        optimisticData.put(getKey("billingAddressMatchesShippingAddress"), arg);
        return this;
    }

    /**
    * The shop currency used for calculation.
    */

    public CurrencyCode getCurrencyCode() {
        return (CurrencyCode) get("currencyCode");
    }

    public CalculatedDraftOrder setCurrencyCode(CurrencyCode arg) {
        optimisticData.put(getKey("currencyCode"), arg);
        return this;
    }

    /**
    * The customer who will be sent an invoice.
    */

    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public CalculatedDraftOrder setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
    * All discount codes applied.
    */

    public List<String> getDiscountCodes() {
        return (List<String>) get("discountCodes");
    }

    public CalculatedDraftOrder setDiscountCodes(List<String> arg) {
        optimisticData.put(getKey("discountCodes"), arg);
        return this;
    }

    /**
    * The list of the line items in the calculated draft order.
    */

    public List<CalculatedDraftOrderLineItem> getLineItems() {
        return (List<CalculatedDraftOrderLineItem>) get("lineItems");
    }

    public CalculatedDraftOrder setLineItems(List<CalculatedDraftOrderLineItem> arg) {
        optimisticData.put(getKey("lineItems"), arg);
        return this;
    }

    /**
    * A subtotal of the line items and corresponding discounts,
    * excluding include shipping charges, shipping discounts, taxes, or order discounts.
    */

    public MoneyBag getLineItemsSubtotalPrice() {
        return (MoneyBag) get("lineItemsSubtotalPrice");
    }

    public CalculatedDraftOrder setLineItemsSubtotalPrice(MoneyBag arg) {
        optimisticData.put(getKey("lineItemsSubtotalPrice"), arg);
        return this;
    }

    /**
    * The assigned phone number.
    */

    public String getPhone() {
        return (String) get("phone");
    }

    public CalculatedDraftOrder setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    /**
    * The list of platform discounts applied.
    */

    public List<DraftOrderPlatformDiscount> getPlatformDiscounts() {
        return (List<DraftOrderPlatformDiscount>) get("platformDiscounts");
    }

    public CalculatedDraftOrder setPlatformDiscounts(List<DraftOrderPlatformDiscount> arg) {
        optimisticData.put(getKey("platformDiscounts"), arg);
        return this;
    }

    /**
    * The payment currency used for calculation.
    */

    public CurrencyCode getPresentmentCurrencyCode() {
        return (CurrencyCode) get("presentmentCurrencyCode");
    }

    public CalculatedDraftOrder setPresentmentCurrencyCode(CurrencyCode arg) {
        optimisticData.put(getKey("presentmentCurrencyCode"), arg);
        return this;
    }

    /**
    * The purchasing entity.
    */

    public PurchasingEntity getPurchasingEntity() {
        return (PurchasingEntity) get("purchasingEntity");
    }

    public CalculatedDraftOrder setPurchasingEntity(PurchasingEntity arg) {
        optimisticData.put(getKey("purchasingEntity"), arg);
        return this;
    }

    /**
    * The line item containing the shipping information and costs.
    */

    public ShippingLine getShippingLine() {
        return (ShippingLine) get("shippingLine");
    }

    public CalculatedDraftOrder setShippingLine(ShippingLine arg) {
        optimisticData.put(getKey("shippingLine"), arg);
        return this;
    }

    /**
    * The subtotal, of the line items and their discounts, excluding shipping charges, shipping discounts,
    * and taxes.
    */

    public MoneyBag getSubtotalPriceSet() {
        return (MoneyBag) get("subtotalPriceSet");
    }

    public CalculatedDraftOrder setSubtotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("subtotalPriceSet"), arg);
        return this;
    }

    /**
    * The list of of taxes lines charged for each line item and shipping line.
    */

    public List<TaxLine> getTaxLines() {
        return (List<TaxLine>) get("taxLines");
    }

    public CalculatedDraftOrder setTaxLines(List<TaxLine> arg) {
        optimisticData.put(getKey("taxLines"), arg);
        return this;
    }

    /**
    * Whether the line item prices include taxes.
    */

    public Boolean getTaxesIncluded() {
        return (Boolean) get("taxesIncluded");
    }

    public CalculatedDraftOrder setTaxesIncluded(Boolean arg) {
        optimisticData.put(getKey("taxesIncluded"), arg);
        return this;
    }

    /**
    * Total discounts.
    */

    public MoneyBag getTotalDiscountsSet() {
        return (MoneyBag) get("totalDiscountsSet");
    }

    public CalculatedDraftOrder setTotalDiscountsSet(MoneyBag arg) {
        optimisticData.put(getKey("totalDiscountsSet"), arg);
        return this;
    }

    /**
    * Total price of line items.
    */

    public MoneyBag getTotalLineItemsPriceSet() {
        return (MoneyBag) get("totalLineItemsPriceSet");
    }

    public CalculatedDraftOrder setTotalLineItemsPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("totalLineItemsPriceSet"), arg);
        return this;
    }

    /**
    * The total price, includes taxes, shipping charges, and discounts.
    */

    public MoneyBag getTotalPriceSet() {
        return (MoneyBag) get("totalPriceSet");
    }

    public CalculatedDraftOrder setTotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("totalPriceSet"), arg);
        return this;
    }

    /**
    * The sum of individual line item quantities.
    * If the draft order has bundle items, this is the sum containing the quantities of individual items
    * in the bundle.
    */

    public Integer getTotalQuantityOfLineItems() {
        return (Integer) get("totalQuantityOfLineItems");
    }

    public CalculatedDraftOrder setTotalQuantityOfLineItems(Integer arg) {
        optimisticData.put(getKey("totalQuantityOfLineItems"), arg);
        return this;
    }

    /**
    * The total shipping price.
    */

    public MoneyBag getTotalShippingPriceSet() {
        return (MoneyBag) get("totalShippingPriceSet");
    }

    public CalculatedDraftOrder setTotalShippingPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("totalShippingPriceSet"), arg);
        return this;
    }

    /**
    * The total tax.
    */

    public MoneyBag getTotalTaxSet() {
        return (MoneyBag) get("totalTaxSet");
    }

    public CalculatedDraftOrder setTotalTaxSet(MoneyBag arg) {
        optimisticData.put(getKey("totalTaxSet"), arg);
        return this;
    }

    /**
    * Fingerprint of the current cart.
    * In order to have bundles work, the fingerprint must be passed to
    * each request as it was previously returned, unmodified.
    */

    public String getTransformerFingerprint() {
        return (String) get("transformerFingerprint");
    }

    public CalculatedDraftOrder setTransformerFingerprint(String arg) {
        optimisticData.put(getKey("transformerFingerprint"), arg);
        return this;
    }

    /**
    * The list of warnings raised while calculating.
    */

    public List<DraftOrderWarning> getWarnings() {
        return (List<DraftOrderWarning>) get("warnings");
    }

    public CalculatedDraftOrder setWarnings(List<DraftOrderWarning> arg) {
        optimisticData.put(getKey("warnings"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "acceptAutomaticDiscounts": return false;

            case "alerts": return true;

            case "allVariantPricesOverridden": return false;

            case "anyVariantPricesOverridden": return false;

            case "appliedDiscount": return true;

            case "availableShippingRates": return true;

            case "billingAddressMatchesShippingAddress": return false;

            case "currencyCode": return false;

            case "customer": return true;

            case "discountCodes": return false;

            case "lineItems": return true;

            case "lineItemsSubtotalPrice": return true;

            case "phone": return false;

            case "platformDiscounts": return true;

            case "presentmentCurrencyCode": return false;

            case "purchasingEntity": return false;

            case "shippingLine": return true;

            case "subtotalPriceSet": return true;

            case "taxLines": return true;

            case "taxesIncluded": return false;

            case "totalDiscountsSet": return true;

            case "totalLineItemsPriceSet": return true;

            case "totalPriceSet": return true;

            case "totalQuantityOfLineItems": return false;

            case "totalShippingPriceSet": return true;

            case "totalTaxSet": return true;

            case "transformerFingerprint": return false;

            case "warnings": return false;

            default: return false;
        }
    }
}

