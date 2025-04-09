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
* An order that a merchant creates on behalf of a customer. Draft orders are useful for merchants that
* need to do the following tasks:
* - Create new orders for sales made by phone, in person, by chat, or elsewhere. When a merchant
* accepts payment for a draft order, an order is created.
* - Send invoices to customers to pay with a secure checkout link.
* - Use custom items to represent additional costs or products that aren't displayed in a shop's
* inventory.
* - Re-create orders manually from active sales channels.
* - Sell products at discount or wholesale rates.
* - Take pre-orders.
* - Save an order as a draft and resume working on it later.
* For draft orders in multiple currencies `presentment_money` is the source of truth for what a
* customer is going to be charged and `shop_money` is an estimate of what the merchant might receive
* in their shop currency.
* **Caution:** Only use this data if it's required for your app's functionality. Shopify will restrict
* [access to scopes](https://shopify.dev/api/usage/access-scopes) for apps that don't have a
* legitimate use for the associated data.
*/
public class DraftOrder extends AbstractResponse<DraftOrder> implements CommentEventEmbed, CommentEventSubject, HasEvents, HasLocalizationExtensions, HasLocalizedFields, HasMetafields, LegacyInteroperability, MetafieldReferencer, Navigable, Node {
    public DraftOrder() {
    }

    public DraftOrder(JsonObject fields) throws SchemaViolationError {
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

                case "allVariantPricesOverridden": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "allowDiscountCodesInCheckout": {
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

                case "billingAddress": {
                    MailingAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MailingAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "billingAddressMatchesShippingAddress": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

                case "currencyCode": {
                    responseData.put(key, CurrencyCode.fromGraphQl(jsonAsString(field.getValue(), key)));

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

                case "email": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "events": {
                    responseData.put(key, new EventConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "hasTimelineComment": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "invoiceEmailTemplateSubject": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "invoiceSentAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "invoiceUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "lineItems": {
                    responseData.put(key, new DraftOrderLineItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "lineItemsSubtotalPrice": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "localizedFields": {
                    responseData.put(key, new LocalizedFieldConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "metafield": {
                    Metafield optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Metafield(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafields": {
                    responseData.put(key, new MetafieldConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "note2": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "order": {
                    Order optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Order(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentTerms": {
                    PaymentTerms optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PaymentTerms(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "poNumber": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "ready": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "reserveInventoryUntil": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "shippingLine": {
                    ShippingLine optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShippingLine(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    responseData.put(key, DraftOrderStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "subtotalPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "tags": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "taxExempt": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

                case "totalWeight": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "visibleToCustomer": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

    public DraftOrder(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DraftOrder";
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

    public DraftOrder setAcceptAutomaticDiscounts(Boolean arg) {
        optimisticData.put(getKey("acceptAutomaticDiscounts"), arg);
        return this;
    }

    /**
    * Whether all variant prices have been overridden.
    */

    public Boolean getAllVariantPricesOverridden() {
        return (Boolean) get("allVariantPricesOverridden");
    }

    public DraftOrder setAllVariantPricesOverridden(Boolean arg) {
        optimisticData.put(getKey("allVariantPricesOverridden"), arg);
        return this;
    }

    /**
    * Whether discount codes are allowed during checkout of this draft order.
    */

    public Boolean getAllowDiscountCodesInCheckout() {
        return (Boolean) get("allowDiscountCodesInCheckout");
    }

    public DraftOrder setAllowDiscountCodesInCheckout(Boolean arg) {
        optimisticData.put(getKey("allowDiscountCodesInCheckout"), arg);
        return this;
    }

    /**
    * Whether any variant prices have been overridden.
    */

    public Boolean getAnyVariantPricesOverridden() {
        return (Boolean) get("anyVariantPricesOverridden");
    }

    public DraftOrder setAnyVariantPricesOverridden(Boolean arg) {
        optimisticData.put(getKey("anyVariantPricesOverridden"), arg);
        return this;
    }

    /**
    * The custom order-level discount applied.
    */

    public DraftOrderAppliedDiscount getAppliedDiscount() {
        return (DraftOrderAppliedDiscount) get("appliedDiscount");
    }

    public DraftOrder setAppliedDiscount(DraftOrderAppliedDiscount arg) {
        optimisticData.put(getKey("appliedDiscount"), arg);
        return this;
    }

    /**
    * The billing address of the customer.
    */

    public MailingAddress getBillingAddress() {
        return (MailingAddress) get("billingAddress");
    }

    public DraftOrder setBillingAddress(MailingAddress arg) {
        optimisticData.put(getKey("billingAddress"), arg);
        return this;
    }

    /**
    * Whether the billing address matches the shipping address.
    */

    public Boolean getBillingAddressMatchesShippingAddress() {
        return (Boolean) get("billingAddressMatchesShippingAddress");
    }

    public DraftOrder setBillingAddressMatchesShippingAddress(Boolean arg) {
        optimisticData.put(getKey("billingAddressMatchesShippingAddress"), arg);
        return this;
    }

    /**
    * The date and time when the draft order was converted to a new order,
    * and had it's status changed to **Completed**.
    */

    public String getCompletedAt() {
        return (String) get("completedAt");
    }

    public DraftOrder setCompletedAt(String arg) {
        optimisticData.put(getKey("completedAt"), arg);
        return this;
    }

    /**
    * The date and time when the draft order was created in Shopify.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public DraftOrder setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The shop currency used for calculation.
    */

    public CurrencyCode getCurrencyCode() {
        return (CurrencyCode) get("currencyCode");
    }

    public DraftOrder setCurrencyCode(CurrencyCode arg) {
        optimisticData.put(getKey("currencyCode"), arg);
        return this;
    }

    /**
    * The custom information added to the draft order on behalf of the customer.
    */

    public List<Attribute> getCustomAttributes() {
        return (List<Attribute>) get("customAttributes");
    }

    public DraftOrder setCustomAttributes(List<Attribute> arg) {
        optimisticData.put(getKey("customAttributes"), arg);
        return this;
    }

    /**
    * The customer who will be sent an invoice.
    */

    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public DraftOrder setCustomer(Customer arg) {
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

    public DraftOrder setDefaultCursor(String arg) {
        optimisticData.put(getKey("defaultCursor"), arg);
        return this;
    }

    /**
    * All discount codes applied.
    */

    public List<String> getDiscountCodes() {
        return (List<String>) get("discountCodes");
    }

    public DraftOrder setDiscountCodes(List<String> arg) {
        optimisticData.put(getKey("discountCodes"), arg);
        return this;
    }

    /**
    * The email address of the customer, which is used to send notifications.
    */

    public String getEmail() {
        return (String) get("email");
    }

    public DraftOrder setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
    * The list of events associated with the draft order.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public DraftOrder setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * Whether the merchant has added timeline comments to the draft order.
    */

    public Boolean getHasTimelineComment() {
        return (Boolean) get("hasTimelineComment");
    }

    public DraftOrder setHasTimelineComment(Boolean arg) {
        optimisticData.put(getKey("hasTimelineComment"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The subject defined for the draft invoice email template.
    */

    public String getInvoiceEmailTemplateSubject() {
        return (String) get("invoiceEmailTemplateSubject");
    }

    public DraftOrder setInvoiceEmailTemplateSubject(String arg) {
        optimisticData.put(getKey("invoiceEmailTemplateSubject"), arg);
        return this;
    }

    /**
    * The date and time when the invoice was last emailed to the customer.
    */

    public String getInvoiceSentAt() {
        return (String) get("invoiceSentAt");
    }

    public DraftOrder setInvoiceSentAt(String arg) {
        optimisticData.put(getKey("invoiceSentAt"), arg);
        return this;
    }

    /**
    * The link to the checkout, which is sent to the customer in the invoice email.
    */

    public String getInvoiceUrl() {
        return (String) get("invoiceUrl");
    }

    public DraftOrder setInvoiceUrl(String arg) {
        optimisticData.put(getKey("invoiceUrl"), arg);
        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public DraftOrder setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * The list of the line items in the draft order.
    */

    public DraftOrderLineItemConnection getLineItems() {
        return (DraftOrderLineItemConnection) get("lineItems");
    }

    public DraftOrder setLineItems(DraftOrderLineItemConnection arg) {
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

    public DraftOrder setLineItemsSubtotalPrice(MoneyBag arg) {
        optimisticData.put(getKey("lineItemsSubtotalPrice"), arg);
        return this;
    }

    /**
    * List of localized fields for the resource.
    */

    public LocalizedFieldConnection getLocalizedFields() {
        return (LocalizedFieldConnection) get("localizedFields");
    }

    public DraftOrder setLocalizedFields(LocalizedFieldConnection arg) {
        optimisticData.put(getKey("localizedFields"), arg);
        return this;
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */

    public Metafield getMetafield() {
        return (Metafield) get("metafield");
    }

    public DraftOrder setMetafield(Metafield arg) {
        optimisticData.put(getKey("metafield"), arg);
        return this;
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */

    public MetafieldConnection getMetafields() {
        return (MetafieldConnection) get("metafields");
    }

    public DraftOrder setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The identifier for the draft order, which is unique within the store. For example, _#D1223_.
    */

    public String getName() {
        return (String) get("name");
    }

    public DraftOrder setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The text from an optional note attached to the draft order.
    */

    public String getNote2() {
        return (String) get("note2");
    }

    public DraftOrder setNote2(String arg) {
        optimisticData.put(getKey("note2"), arg);
        return this;
    }

    /**
    * The order that was created from the draft order.
    */

    public Order getOrder() {
        return (Order) get("order");
    }

    public DraftOrder setOrder(Order arg) {
        optimisticData.put(getKey("order"), arg);
        return this;
    }

    /**
    * The associated payment terms for this draft order.
    */

    public PaymentTerms getPaymentTerms() {
        return (PaymentTerms) get("paymentTerms");
    }

    public DraftOrder setPaymentTerms(PaymentTerms arg) {
        optimisticData.put(getKey("paymentTerms"), arg);
        return this;
    }

    /**
    * The assigned phone number.
    */

    public String getPhone() {
        return (String) get("phone");
    }

    public DraftOrder setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    /**
    * The list of platform discounts applied.
    */

    public List<DraftOrderPlatformDiscount> getPlatformDiscounts() {
        return (List<DraftOrderPlatformDiscount>) get("platformDiscounts");
    }

    public DraftOrder setPlatformDiscounts(List<DraftOrderPlatformDiscount> arg) {
        optimisticData.put(getKey("platformDiscounts"), arg);
        return this;
    }

    /**
    * The purchase order number.
    */

    public String getPoNumber() {
        return (String) get("poNumber");
    }

    public DraftOrder setPoNumber(String arg) {
        optimisticData.put(getKey("poNumber"), arg);
        return this;
    }

    /**
    * The payment currency used for calculation.
    */

    public CurrencyCode getPresentmentCurrencyCode() {
        return (CurrencyCode) get("presentmentCurrencyCode");
    }

    public DraftOrder setPresentmentCurrencyCode(CurrencyCode arg) {
        optimisticData.put(getKey("presentmentCurrencyCode"), arg);
        return this;
    }

    /**
    * The purchasing entity.
    */

    public PurchasingEntity getPurchasingEntity() {
        return (PurchasingEntity) get("purchasingEntity");
    }

    public DraftOrder setPurchasingEntity(PurchasingEntity arg) {
        optimisticData.put(getKey("purchasingEntity"), arg);
        return this;
    }

    /**
    * Whether the draft order is ready and can be completed.
    * Draft orders might have asynchronous operations that can take time to finish.
    */

    public Boolean getReady() {
        return (Boolean) get("ready");
    }

    public DraftOrder setReady(Boolean arg) {
        optimisticData.put(getKey("ready"), arg);
        return this;
    }

    /**
    * The time after which inventory will automatically be restocked.
    */

    public String getReserveInventoryUntil() {
        return (String) get("reserveInventoryUntil");
    }

    public DraftOrder setReserveInventoryUntil(String arg) {
        optimisticData.put(getKey("reserveInventoryUntil"), arg);
        return this;
    }

    /**
    * The shipping address of the customer.
    */

    public MailingAddress getShippingAddress() {
        return (MailingAddress) get("shippingAddress");
    }

    public DraftOrder setShippingAddress(MailingAddress arg) {
        optimisticData.put(getKey("shippingAddress"), arg);
        return this;
    }

    /**
    * The line item containing the shipping information and costs.
    */

    public ShippingLine getShippingLine() {
        return (ShippingLine) get("shippingLine");
    }

    public DraftOrder setShippingLine(ShippingLine arg) {
        optimisticData.put(getKey("shippingLine"), arg);
        return this;
    }

    /**
    * The status of the draft order.
    */

    public DraftOrderStatus getStatus() {
        return (DraftOrderStatus) get("status");
    }

    public DraftOrder setStatus(DraftOrderStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The subtotal, of the line items and their discounts, excluding shipping charges, shipping discounts,
    * and taxes.
    */

    public MoneyBag getSubtotalPriceSet() {
        return (MoneyBag) get("subtotalPriceSet");
    }

    public DraftOrder setSubtotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("subtotalPriceSet"), arg);
        return this;
    }

    /**
    * The comma separated list of tags associated with the draft order.
    * Updating `tags` overwrites any existing tags that were previously added to the draft order.
    * To add new tags without overwriting existing tags, use the
    * [tagsAdd](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd) mutation.
    */

    public List<String> getTags() {
        return (List<String>) get("tags");
    }

    public DraftOrder setTags(List<String> arg) {
        optimisticData.put(getKey("tags"), arg);
        return this;
    }

    /**
    * Whether the draft order is tax exempt.
    */

    public Boolean getTaxExempt() {
        return (Boolean) get("taxExempt");
    }

    public DraftOrder setTaxExempt(Boolean arg) {
        optimisticData.put(getKey("taxExempt"), arg);
        return this;
    }

    /**
    * The list of of taxes lines charged for each line item and shipping line.
    */

    public List<TaxLine> getTaxLines() {
        return (List<TaxLine>) get("taxLines");
    }

    public DraftOrder setTaxLines(List<TaxLine> arg) {
        optimisticData.put(getKey("taxLines"), arg);
        return this;
    }

    /**
    * Whether the line item prices include taxes.
    */

    public Boolean getTaxesIncluded() {
        return (Boolean) get("taxesIncluded");
    }

    public DraftOrder setTaxesIncluded(Boolean arg) {
        optimisticData.put(getKey("taxesIncluded"), arg);
        return this;
    }

    /**
    * Total discounts.
    */

    public MoneyBag getTotalDiscountsSet() {
        return (MoneyBag) get("totalDiscountsSet");
    }

    public DraftOrder setTotalDiscountsSet(MoneyBag arg) {
        optimisticData.put(getKey("totalDiscountsSet"), arg);
        return this;
    }

    /**
    * Total price of line items.
    */

    public MoneyBag getTotalLineItemsPriceSet() {
        return (MoneyBag) get("totalLineItemsPriceSet");
    }

    public DraftOrder setTotalLineItemsPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("totalLineItemsPriceSet"), arg);
        return this;
    }

    /**
    * The total price, includes taxes, shipping charges, and discounts.
    */

    public MoneyBag getTotalPriceSet() {
        return (MoneyBag) get("totalPriceSet");
    }

    public DraftOrder setTotalPriceSet(MoneyBag arg) {
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

    public DraftOrder setTotalQuantityOfLineItems(Integer arg) {
        optimisticData.put(getKey("totalQuantityOfLineItems"), arg);
        return this;
    }

    /**
    * The total shipping price.
    */

    public MoneyBag getTotalShippingPriceSet() {
        return (MoneyBag) get("totalShippingPriceSet");
    }

    public DraftOrder setTotalShippingPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("totalShippingPriceSet"), arg);
        return this;
    }

    /**
    * The total tax.
    */

    public MoneyBag getTotalTaxSet() {
        return (MoneyBag) get("totalTaxSet");
    }

    public DraftOrder setTotalTaxSet(MoneyBag arg) {
        optimisticData.put(getKey("totalTaxSet"), arg);
        return this;
    }

    /**
    * The total weight in grams of the draft order.
    */

    public String getTotalWeight() {
        return (String) get("totalWeight");
    }

    public DraftOrder setTotalWeight(String arg) {
        optimisticData.put(getKey("totalWeight"), arg);
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

    public DraftOrder setTransformerFingerprint(String arg) {
        optimisticData.put(getKey("transformerFingerprint"), arg);
        return this;
    }

    /**
    * The date and time when the draft order was last changed.
    * The format is YYYY-MM-DD HH:mm:ss. For example, 2016-02-05 17:04:01.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public DraftOrder setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    /**
    * Whether the draft order will be visible to the customer on the self-serve portal.
    */

    public Boolean getVisibleToCustomer() {
        return (Boolean) get("visibleToCustomer");
    }

    public DraftOrder setVisibleToCustomer(Boolean arg) {
        optimisticData.put(getKey("visibleToCustomer"), arg);
        return this;
    }

    /**
    * The list of warnings raised while calculating.
    */

    public List<DraftOrderWarning> getWarnings() {
        return (List<DraftOrderWarning>) get("warnings");
    }

    public DraftOrder setWarnings(List<DraftOrderWarning> arg) {
        optimisticData.put(getKey("warnings"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "acceptAutomaticDiscounts": return false;

            case "allVariantPricesOverridden": return false;

            case "allowDiscountCodesInCheckout": return false;

            case "anyVariantPricesOverridden": return false;

            case "appliedDiscount": return true;

            case "billingAddress": return true;

            case "billingAddressMatchesShippingAddress": return false;

            case "completedAt": return false;

            case "createdAt": return false;

            case "currencyCode": return false;

            case "customAttributes": return true;

            case "customer": return true;

            case "defaultCursor": return false;

            case "discountCodes": return false;

            case "email": return false;

            case "events": return true;

            case "hasTimelineComment": return false;

            case "id": return false;

            case "invoiceEmailTemplateSubject": return false;

            case "invoiceSentAt": return false;

            case "invoiceUrl": return false;

            case "legacyResourceId": return false;

            case "lineItems": return true;

            case "lineItemsSubtotalPrice": return true;

            case "localizedFields": return true;

            case "metafield": return true;

            case "metafields": return true;

            case "name": return false;

            case "note2": return false;

            case "order": return true;

            case "paymentTerms": return true;

            case "phone": return false;

            case "platformDiscounts": return true;

            case "poNumber": return false;

            case "presentmentCurrencyCode": return false;

            case "purchasingEntity": return false;

            case "ready": return false;

            case "reserveInventoryUntil": return false;

            case "shippingAddress": return true;

            case "shippingLine": return true;

            case "status": return false;

            case "subtotalPriceSet": return true;

            case "tags": return false;

            case "taxExempt": return false;

            case "taxLines": return true;

            case "taxesIncluded": return false;

            case "totalDiscountsSet": return true;

            case "totalLineItemsPriceSet": return true;

            case "totalPriceSet": return true;

            case "totalQuantityOfLineItems": return false;

            case "totalShippingPriceSet": return true;

            case "totalTaxSet": return true;

            case "totalWeight": return false;

            case "transformerFingerprint": return false;

            case "updatedAt": return false;

            case "visibleToCustomer": return false;

            case "warnings": return false;

            default: return false;
        }
    }
}

