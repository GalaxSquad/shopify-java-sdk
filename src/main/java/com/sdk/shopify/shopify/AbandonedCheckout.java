// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A checkout that was abandoned by the customer.
*/
public class AbandonedCheckout extends AbstractResponse<AbandonedCheckout> implements Navigable, Node {
    public AbandonedCheckout() {
    }

    public AbandonedCheckout(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "abandonedCheckoutUrl": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "billingAddress": {
                    MailingAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MailingAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "completedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "customAttributes": {
                    List<Attribute> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Attribute(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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

                case "defaultCursor": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "lineItems": {
                    responseData.put(key, new AbandonedCheckoutLineItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "note": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "shippingAddress": {
                    MailingAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MailingAddress(jsonAsObject(field.getValue(), key));
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

                case "totalDiscountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalDutiesSet": {
                    MoneyBag optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyBag(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "totalTaxSet": {
                    MoneyBag optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyBag(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public AbandonedCheckout(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "AbandonedCheckout";
    }

    /**
    * The URL for the buyer to recover their checkout.
    */

    public String getAbandonedCheckoutUrl() {
        return (String) get("abandonedCheckoutUrl");
    }

    public AbandonedCheckout setAbandonedCheckoutUrl(String arg) {
        optimisticData.put(getKey("abandonedCheckoutUrl"), arg);
        return this;
    }

    /**
    * The billing address provided by the buyer.
    * Null if the user did not provide a billing address.
    */

    public MailingAddress getBillingAddress() {
        return (MailingAddress) get("billingAddress");
    }

    public AbandonedCheckout setBillingAddress(MailingAddress arg) {
        optimisticData.put(getKey("billingAddress"), arg);
        return this;
    }

    /**
    * The date and time when the buyer completed the checkout.
    * Null if the checkout has not been completed.
    */

    public String getCompletedAt() {
        return (String) get("completedAt");
    }

    public AbandonedCheckout setCompletedAt(String arg) {
        optimisticData.put(getKey("completedAt"), arg);
        return this;
    }

    /**
    * The date and time when the checkout was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public AbandonedCheckout setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * A list of extra information that has been added to the checkout.
    */

    public List<Attribute> getCustomAttributes() {
        return (List<Attribute>) get("customAttributes");
    }

    public AbandonedCheckout setCustomAttributes(List<Attribute> arg) {
        optimisticData.put(getKey("customAttributes"), arg);
        return this;
    }

    /**
    * The customer who created this checkout.
    * May be null if the checkout was created from a draft order or via an app.
    */

    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public AbandonedCheckout setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */

    public String getDefaultCursor() {
        return (String) get("defaultCursor");
    }

    public AbandonedCheckout setDefaultCursor(String arg) {
        optimisticData.put(getKey("defaultCursor"), arg);
        return this;
    }

    /**
    * The discount codes entered by the buyer at checkout.
    */

    public List<String> getDiscountCodes() {
        return (List<String>) get("discountCodes");
    }

    public AbandonedCheckout setDiscountCodes(List<String> arg) {
        optimisticData.put(getKey("discountCodes"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * A list of the line items in this checkout.
    */

    public AbandonedCheckoutLineItemConnection getLineItems() {
        return (AbandonedCheckoutLineItemConnection) get("lineItems");
    }

    public AbandonedCheckout setLineItems(AbandonedCheckoutLineItemConnection arg) {
        optimisticData.put(getKey("lineItems"), arg);
        return this;
    }

    /**
    * Unique merchant-facing identifier for the checkout.
    */

    public String getName() {
        return (String) get("name");
    }

    public AbandonedCheckout setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * A merchant-facing note added to the checkout. Not visible to the buyer.
    */

    public String getNote() {
        return (String) get("note");
    }

    public AbandonedCheckout setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * The shipping address to where the line items will be shipped.
    * Null if the user did not provide a shipping address.
    */

    public MailingAddress getShippingAddress() {
        return (MailingAddress) get("shippingAddress");
    }

    public AbandonedCheckout setShippingAddress(MailingAddress arg) {
        optimisticData.put(getKey("shippingAddress"), arg);
        return this;
    }

    /**
    * The sum of all items in the checkout, including discounts but excluding shipping, taxes and tips.
    */

    public MoneyBag getSubtotalPriceSet() {
        return (MoneyBag) get("subtotalPriceSet");
    }

    public AbandonedCheckout setSubtotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("subtotalPriceSet"), arg);
        return this;
    }

    /**
    * Individual taxes charged on the checkout.
    */

    public List<TaxLine> getTaxLines() {
        return (List<TaxLine>) get("taxLines");
    }

    public AbandonedCheckout setTaxLines(List<TaxLine> arg) {
        optimisticData.put(getKey("taxLines"), arg);
        return this;
    }

    /**
    * Whether taxes are included in line item and shipping line prices.
    */

    public Boolean getTaxesIncluded() {
        return (Boolean) get("taxesIncluded");
    }

    public AbandonedCheckout setTaxesIncluded(Boolean arg) {
        optimisticData.put(getKey("taxesIncluded"), arg);
        return this;
    }

    /**
    * The total amount of discounts to be applied.
    */

    public MoneyBag getTotalDiscountSet() {
        return (MoneyBag) get("totalDiscountSet");
    }

    public AbandonedCheckout setTotalDiscountSet(MoneyBag arg) {
        optimisticData.put(getKey("totalDiscountSet"), arg);
        return this;
    }

    /**
    * The total duties applied to the checkout.
    */

    public MoneyBag getTotalDutiesSet() {
        return (MoneyBag) get("totalDutiesSet");
    }

    public AbandonedCheckout setTotalDutiesSet(MoneyBag arg) {
        optimisticData.put(getKey("totalDutiesSet"), arg);
        return this;
    }

    /**
    * The sum of the prices of all line items in the checkout.
    */

    public MoneyBag getTotalLineItemsPriceSet() {
        return (MoneyBag) get("totalLineItemsPriceSet");
    }

    public AbandonedCheckout setTotalLineItemsPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("totalLineItemsPriceSet"), arg);
        return this;
    }

    /**
    * The sum of all items in the checkout, including discounts, shipping, taxes, and tips.
    */

    public MoneyBag getTotalPriceSet() {
        return (MoneyBag) get("totalPriceSet");
    }

    public AbandonedCheckout setTotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("totalPriceSet"), arg);
        return this;
    }

    /**
    * The total tax applied to the checkout.
    */

    public MoneyBag getTotalTaxSet() {
        return (MoneyBag) get("totalTaxSet");
    }

    public AbandonedCheckout setTotalTaxSet(MoneyBag arg) {
        optimisticData.put(getKey("totalTaxSet"), arg);
        return this;
    }

    /**
    * The date and time when the checkout was most recently updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public AbandonedCheckout setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "abandonedCheckoutUrl": return false;

            case "billingAddress": return true;

            case "completedAt": return false;

            case "createdAt": return false;

            case "customAttributes": return true;

            case "customer": return true;

            case "defaultCursor": return false;

            case "discountCodes": return false;

            case "id": return false;

            case "lineItems": return true;

            case "name": return false;

            case "note": return false;

            case "shippingAddress": return true;

            case "subtotalPriceSet": return true;

            case "taxLines": return true;

            case "taxesIncluded": return false;

            case "totalDiscountSet": return true;

            case "totalDutiesSet": return true;

            case "totalLineItemsPriceSet": return true;

            case "totalPriceSet": return true;

            case "totalTaxSet": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

