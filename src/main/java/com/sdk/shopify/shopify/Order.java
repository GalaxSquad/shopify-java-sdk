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
* An order is a customer's request to purchase one or more products from a shop. You can retrieve and
* update orders using the `Order` object.
* Learn more about
* [editing an existing order with the GraphQL Admin
* API](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
* Only the last 60 days' worth of orders from a store are accessible from the `Order` object by
* default. If you want to access older orders,
* then you need to [request access to all
* orders](https://shopify.dev/api/usage/access-scopes#orders-permissions). If your app is granted
* access, then you can add the `read_all_orders` scope to your app along with `read_orders` or
* `write_orders`.
* [Private apps](https://shopify.dev/apps/auth/basic-http) are not affected by this change and are
* automatically granted the scope.
* **Caution:** Only use this data if it's required for your app's functionality. Shopify will restrict
* [access to scopes](https://shopify.dev/api/usage/access-scopes) for apps that don't have a
* legitimate use for the associated data.
*/
public class Order extends AbstractResponse<Order> implements CommentEventEmbed, CommentEventSubject, HasEvents, HasLocalizationExtensions, HasLocalizedFields, HasMetafieldDefinitions, HasMetafields, LegacyInteroperability, MetafieldReference, MetafieldReferencer, Node {
    public Order() {
    }

    public Order(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "additionalFees": {
                    List<AdditionalFee> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new AdditionalFee(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "agreements": {
                    responseData.put(key, new SalesAgreementConnection(jsonAsObject(field.getValue(), key)));

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

                case "app": {
                    OrderApp optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderApp(jsonAsObject(field.getValue(), key));
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

                case "canMarkAsPaid": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "canNotifyCustomer": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "cancelReason": {
                    OrderCancelReason optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = OrderCancelReason.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cancellation": {
                    OrderCancellation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderCancellation(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cancelledAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "capturable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "cartDiscountAmountSet": {
                    MoneyBag optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyBag(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "channelInformation": {
                    ChannelInformation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ChannelInformation(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "clientIp": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "closed": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "closedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "confirmationNumber": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "confirmed": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

                case "currentCartDiscountAmountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "currentShippingPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "currentSubtotalLineItemsQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "currentSubtotalPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "currentTaxLines": {
                    List<TaxLine> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new TaxLine(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "currentTotalAdditionalFeesSet": {
                    MoneyBag optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyBag(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "currentTotalDiscountsSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "currentTotalDutiesSet": {
                    MoneyBag optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyBag(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "currentTotalPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "currentTotalTaxSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "currentTotalWeight": {
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

                case "customerAcceptsMarketing": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "customerJourneySummary": {
                    CustomerJourneySummary optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerJourneySummary(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerLocale": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountApplications": {
                    responseData.put(key, new DiscountApplicationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountCode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

                case "displayAddress": {
                    MailingAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MailingAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "displayFinancialStatus": {
                    OrderDisplayFinancialStatus optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = OrderDisplayFinancialStatus.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "displayFulfillmentStatus": {
                    responseData.put(key, OrderDisplayFulfillmentStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "disputes": {
                    List<OrderDisputeSummary> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new OrderDisputeSummary(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "dutiesIncluded": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "edited": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

                case "estimatedTaxes": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "events": {
                    responseData.put(key, new EventConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "fulfillable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "fulfillmentOrders": {
                    responseData.put(key, new FulfillmentOrderConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "fulfillments": {
                    List<Fulfillment> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Fulfillment(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "fulfillmentsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fullyPaid": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

                case "legacyResourceId": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "lineItems": {
                    responseData.put(key, new LineItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "localizedFields": {
                    responseData.put(key, new LocalizedFieldConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "merchantBusinessEntity": {
                    responseData.put(key, new BusinessEntity(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "merchantEditable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "merchantEditableErrors": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "merchantOfRecordApp": {
                    OrderApp optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderApp(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "netPaymentSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "nonFulfillableLineItems": {
                    responseData.put(key, new LineItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "note": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "originalTotalAdditionalFeesSet": {
                    MoneyBag optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyBag(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "originalTotalDutiesSet": {
                    MoneyBag optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyBag(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "originalTotalPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "paymentCollectionDetails": {
                    responseData.put(key, new OrderPaymentCollectionDetails(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "paymentGatewayNames": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

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

                case "processedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "publication": {
                    Publication optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Publication(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "refundDiscrepancySet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "refundable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "refunds": {
                    List<Refund> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Refund(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "registeredSourceUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "requiresShipping": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "restockable": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "retailLocation": {
                    Location optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Location(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returnStatus": {
                    responseData.put(key, OrderReturnStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "returns": {
                    responseData.put(key, new ReturnConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "risk": {
                    responseData.put(key, new OrderRiskSummary(jsonAsObject(field.getValue(), key)));

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

                case "shippingLines": {
                    responseData.put(key, new ShippingLineConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "shopifyProtect": {
                    ShopifyProtectOrderSummary optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyProtectOrderSummary(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sourceIdentifier": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sourceName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "staffMember": {
                    StaffMember optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StaffMember(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "statusPageUrl": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "subtotalLineItemsQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "subtotalPriceSet": {
                    MoneyBag optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyBag(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "suggestedRefund": {
                    SuggestedRefund optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SuggestedRefund(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "test": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "totalCapturableSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalCashRoundingAdjustment": {
                    responseData.put(key, new CashRoundingAdjustment(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalDiscountsSet": {
                    MoneyBag optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyBag(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "totalOutstandingSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalPriceSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalReceivedSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalRefundedSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalRefundedShippingSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalShippingPriceSet": {
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

                case "totalTipReceivedSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalWeight": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "transactions": {
                    List<OrderTransaction> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new OrderTransaction(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "transactionsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "unpaid": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

    public Order(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Order";
    }

    /**
    * A list of additional fees applied to the order.
    */

    public List<AdditionalFee> getAdditionalFees() {
        return (List<AdditionalFee>) get("additionalFees");
    }

    public Order setAdditionalFees(List<AdditionalFee> arg) {
        optimisticData.put(getKey("additionalFees"), arg);
        return this;
    }

    /**
    * A list of sales agreements associated with the order.
    */

    public SalesAgreementConnection getAgreements() {
        return (SalesAgreementConnection) get("agreements");
    }

    public Order setAgreements(SalesAgreementConnection arg) {
        optimisticData.put(getKey("agreements"), arg);
        return this;
    }

    /**
    * A list of messages that appear on the order page in the Shopify admin.
    */

    public List<ResourceAlert> getAlerts() {
        return (List<ResourceAlert>) get("alerts");
    }

    public Order setAlerts(List<ResourceAlert> arg) {
        optimisticData.put(getKey("alerts"), arg);
        return this;
    }

    /**
    * The application that created the order.
    */

    public OrderApp getApp() {
        return (OrderApp) get("app");
    }

    public Order setApp(OrderApp arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * The billing address of the customer.
    */

    public MailingAddress getBillingAddress() {
        return (MailingAddress) get("billingAddress");
    }

    public Order setBillingAddress(MailingAddress arg) {
        optimisticData.put(getKey("billingAddress"), arg);
        return this;
    }

    /**
    * Whether the billing address matches the shipping address.
    */

    public Boolean getBillingAddressMatchesShippingAddress() {
        return (Boolean) get("billingAddressMatchesShippingAddress");
    }

    public Order setBillingAddressMatchesShippingAddress(Boolean arg) {
        optimisticData.put(getKey("billingAddressMatchesShippingAddress"), arg);
        return this;
    }

    /**
    * Whether the order can be manually marked as paid.
    */

    public Boolean getCanMarkAsPaid() {
        return (Boolean) get("canMarkAsPaid");
    }

    public Order setCanMarkAsPaid(Boolean arg) {
        optimisticData.put(getKey("canMarkAsPaid"), arg);
        return this;
    }

    /**
    * Whether a customer email exists for the order.
    */

    public Boolean getCanNotifyCustomer() {
        return (Boolean) get("canNotifyCustomer");
    }

    public Order setCanNotifyCustomer(Boolean arg) {
        optimisticData.put(getKey("canNotifyCustomer"), arg);
        return this;
    }

    /**
    * The reason provided when the order was canceled.
    * Returns `null` if the order wasn't canceled.
    */

    public OrderCancelReason getCancelReason() {
        return (OrderCancelReason) get("cancelReason");
    }

    public Order setCancelReason(OrderCancelReason arg) {
        optimisticData.put(getKey("cancelReason"), arg);
        return this;
    }

    /**
    * Cancellation details for the order.
    */

    public OrderCancellation getCancellation() {
        return (OrderCancellation) get("cancellation");
    }

    public Order setCancellation(OrderCancellation arg) {
        optimisticData.put(getKey("cancellation"), arg);
        return this;
    }

    /**
    * The date and time when the order was canceled.
    * Returns `null` if the order wasn't canceled.
    */

    public String getCancelledAt() {
        return (String) get("cancelledAt");
    }

    public Order setCancelledAt(String arg) {
        optimisticData.put(getKey("cancelledAt"), arg);
        return this;
    }

    /**
    * Whether payment for the order can be captured.
    */

    public Boolean getCapturable() {
        return (Boolean) get("capturable");
    }

    public Order setCapturable(Boolean arg) {
        optimisticData.put(getKey("capturable"), arg);
        return this;
    }

    /**
    * The total order-level discount amount, before returns, in shop and presentment currencies.
    */

    public MoneyBag getCartDiscountAmountSet() {
        return (MoneyBag) get("cartDiscountAmountSet");
    }

    public Order setCartDiscountAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("cartDiscountAmountSet"), arg);
        return this;
    }

    /**
    * Details about the channel that created the order.
    */

    public ChannelInformation getChannelInformation() {
        return (ChannelInformation) get("channelInformation");
    }

    public Order setChannelInformation(ChannelInformation arg) {
        optimisticData.put(getKey("channelInformation"), arg);
        return this;
    }

    /**
    * The IP address of the API client that created the order.
    */

    public String getClientIp() {
        return (String) get("clientIp");
    }

    public Order setClientIp(String arg) {
        optimisticData.put(getKey("clientIp"), arg);
        return this;
    }

    /**
    * Whether the order is closed.
    */

    public Boolean getClosed() {
        return (Boolean) get("closed");
    }

    public Order setClosed(Boolean arg) {
        optimisticData.put(getKey("closed"), arg);
        return this;
    }

    /**
    * The date and time when the order was closed.
    * Returns `null` if the order isn't closed.
    */

    public String getClosedAt() {
        return (String) get("closedAt");
    }

    public Order setClosedAt(String arg) {
        optimisticData.put(getKey("closedAt"), arg);
        return this;
    }

    /**
    * A randomly generated alpha-numeric identifier for the order that may be shown to the customer
    * instead of the sequential order name. For example, "XPAV284CT", "R50KELTJP" or "35PKUN0UJ".
    * This value isn't guaranteed to be unique.
    */

    public String getConfirmationNumber() {
        return (String) get("confirmationNumber");
    }

    public Order setConfirmationNumber(String arg) {
        optimisticData.put(getKey("confirmationNumber"), arg);
        return this;
    }

    /**
    * Whether inventory has been reserved for the order.
    */

    public Boolean getConfirmed() {
        return (Boolean) get("confirmed");
    }

    public Order setConfirmed(Boolean arg) {
        optimisticData.put(getKey("confirmed"), arg);
        return this;
    }

    /**
    * Date and time when the order was created in Shopify.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Order setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The shop currency when the order was placed.
    */

    public CurrencyCode getCurrencyCode() {
        return (CurrencyCode) get("currencyCode");
    }

    public Order setCurrencyCode(CurrencyCode arg) {
        optimisticData.put(getKey("currencyCode"), arg);
        return this;
    }

    /**
    * The current order-level discount amount after all order updates, in shop and presentment currencies.
    */

    public MoneyBag getCurrentCartDiscountAmountSet() {
        return (MoneyBag) get("currentCartDiscountAmountSet");
    }

    public Order setCurrentCartDiscountAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("currentCartDiscountAmountSet"), arg);
        return this;
    }

    /**
    * The current shipping price after applying refunds and discounts. If the parent `order.taxesIncluded`
    * field is true, then this price includes taxes. Otherwise, this field is the pre-tax price.
    */

    public MoneyBag getCurrentShippingPriceSet() {
        return (MoneyBag) get("currentShippingPriceSet");
    }

    public Order setCurrentShippingPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("currentShippingPriceSet"), arg);
        return this;
    }

    /**
    * The sum of the quantities for all line items that contribute to the order's current subtotal price.
    */

    public Integer getCurrentSubtotalLineItemsQuantity() {
        return (Integer) get("currentSubtotalLineItemsQuantity");
    }

    public Order setCurrentSubtotalLineItemsQuantity(Integer arg) {
        optimisticData.put(getKey("currentSubtotalLineItemsQuantity"), arg);
        return this;
    }

    /**
    * The sum of the prices for all line items after discounts and returns, in shop and presentment
    * currencies.
    * If `taxesIncluded` is `true`, then the subtotal also includes tax.
    */

    public MoneyBag getCurrentSubtotalPriceSet() {
        return (MoneyBag) get("currentSubtotalPriceSet");
    }

    public Order setCurrentSubtotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("currentSubtotalPriceSet"), arg);
        return this;
    }

    /**
    * A list of all tax lines applied to line items on the order, after returns.
    * Tax line prices represent the total price for all tax lines with the same `rate` and `title`.
    */

    public List<TaxLine> getCurrentTaxLines() {
        return (List<TaxLine>) get("currentTaxLines");
    }

    public Order setCurrentTaxLines(List<TaxLine> arg) {
        optimisticData.put(getKey("currentTaxLines"), arg);
        return this;
    }

    /**
    * The total amount of additional fees after returns, in shop and presentment currencies.
    * Returns `null` if there are no additional fees for the order.
    */

    public MoneyBag getCurrentTotalAdditionalFeesSet() {
        return (MoneyBag) get("currentTotalAdditionalFeesSet");
    }

    public Order setCurrentTotalAdditionalFeesSet(MoneyBag arg) {
        optimisticData.put(getKey("currentTotalAdditionalFeesSet"), arg);
        return this;
    }

    /**
    * The total amount discounted on the order after returns, in shop and presentment currencies.
    * This includes both order and line level discounts.
    */

    public MoneyBag getCurrentTotalDiscountsSet() {
        return (MoneyBag) get("currentTotalDiscountsSet");
    }

    public Order setCurrentTotalDiscountsSet(MoneyBag arg) {
        optimisticData.put(getKey("currentTotalDiscountsSet"), arg);
        return this;
    }

    /**
    * The total amount of duties after returns, in shop and presentment currencies.
    * Returns `null` if duties aren't applicable.
    */

    public MoneyBag getCurrentTotalDutiesSet() {
        return (MoneyBag) get("currentTotalDutiesSet");
    }

    public Order setCurrentTotalDutiesSet(MoneyBag arg) {
        optimisticData.put(getKey("currentTotalDutiesSet"), arg);
        return this;
    }

    /**
    * The total price of the order, after returns, in shop and presentment currencies.
    * This includes taxes and discounts.
    */

    public MoneyBag getCurrentTotalPriceSet() {
        return (MoneyBag) get("currentTotalPriceSet");
    }

    public Order setCurrentTotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("currentTotalPriceSet"), arg);
        return this;
    }

    /**
    * The sum of the prices of all tax lines applied to line items on the order, after returns, in shop
    * and presentment currencies.
    */

    public MoneyBag getCurrentTotalTaxSet() {
        return (MoneyBag) get("currentTotalTaxSet");
    }

    public Order setCurrentTotalTaxSet(MoneyBag arg) {
        optimisticData.put(getKey("currentTotalTaxSet"), arg);
        return this;
    }

    /**
    * The total weight of the order after returns, in grams.
    */

    public String getCurrentTotalWeight() {
        return (String) get("currentTotalWeight");
    }

    public Order setCurrentTotalWeight(String arg) {
        optimisticData.put(getKey("currentTotalWeight"), arg);
        return this;
    }

    /**
    * A list of additional merchant-facing details that have been added to the order. For example, whether
    * an order is a customer's first.
    */

    public List<Attribute> getCustomAttributes() {
        return (List<Attribute>) get("customAttributes");
    }

    public Order setCustomAttributes(List<Attribute> arg) {
        optimisticData.put(getKey("customAttributes"), arg);
        return this;
    }

    /**
    * The customer that placed the order.
    */

    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public Order setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
    * Whether the customer agreed to receive marketing materials.
    */

    public Boolean getCustomerAcceptsMarketing() {
        return (Boolean) get("customerAcceptsMarketing");
    }

    public Order setCustomerAcceptsMarketing(Boolean arg) {
        optimisticData.put(getKey("customerAcceptsMarketing"), arg);
        return this;
    }

    /**
    * The customer's visits and interactions with the online store before placing the order.
    */

    public CustomerJourneySummary getCustomerJourneySummary() {
        return (CustomerJourneySummary) get("customerJourneySummary");
    }

    public Order setCustomerJourneySummary(CustomerJourneySummary arg) {
        optimisticData.put(getKey("customerJourneySummary"), arg);
        return this;
    }

    /**
    * A two-letter or three-letter language code, optionally followed by a region modifier.
    */

    public String getCustomerLocale() {
        return (String) get("customerLocale");
    }

    public Order setCustomerLocale(String arg) {
        optimisticData.put(getKey("customerLocale"), arg);
        return this;
    }

    /**
    * A list of discounts that are applied to the order, not including order edits and refunds.
    */

    public DiscountApplicationConnection getDiscountApplications() {
        return (DiscountApplicationConnection) get("discountApplications");
    }

    public Order setDiscountApplications(DiscountApplicationConnection arg) {
        optimisticData.put(getKey("discountApplications"), arg);
        return this;
    }

    /**
    * The discount code used for the order.
    */

    public String getDiscountCode() {
        return (String) get("discountCode");
    }

    public Order setDiscountCode(String arg) {
        optimisticData.put(getKey("discountCode"), arg);
        return this;
    }

    /**
    * The discount codes used for the order.
    */

    public List<String> getDiscountCodes() {
        return (List<String>) get("discountCodes");
    }

    public Order setDiscountCodes(List<String> arg) {
        optimisticData.put(getKey("discountCodes"), arg);
        return this;
    }

    /**
    * The primary address of the customer.
    * Returns `null` if neither the shipping address nor the billing address was provided.
    */

    public MailingAddress getDisplayAddress() {
        return (MailingAddress) get("displayAddress");
    }

    public Order setDisplayAddress(MailingAddress arg) {
        optimisticData.put(getKey("displayAddress"), arg);
        return this;
    }

    /**
    * The financial status of the order that can be shown to the merchant.
    * This field doesn't capture all the details of an order's financial state. It should only be used for
    * display summary purposes.
    */

    public OrderDisplayFinancialStatus getDisplayFinancialStatus() {
        return (OrderDisplayFinancialStatus) get("displayFinancialStatus");
    }

    public Order setDisplayFinancialStatus(OrderDisplayFinancialStatus arg) {
        optimisticData.put(getKey("displayFinancialStatus"), arg);
        return this;
    }

    /**
    * The fulfillment status for the order that can be shown to the merchant.
    * This field does not capture all the details of an order's fulfillment state. It should only be used
    * for display summary purposes.
    * For a more granular view of the fulfillment status, refer to the
    * [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
    */

    public OrderDisplayFulfillmentStatus getDisplayFulfillmentStatus() {
        return (OrderDisplayFulfillmentStatus) get("displayFulfillmentStatus");
    }

    public Order setDisplayFulfillmentStatus(OrderDisplayFulfillmentStatus arg) {
        optimisticData.put(getKey("displayFulfillmentStatus"), arg);
        return this;
    }

    /**
    * A list of the disputes associated with the order.
    */

    public List<OrderDisputeSummary> getDisputes() {
        return (List<OrderDisputeSummary>) get("disputes");
    }

    public Order setDisputes(List<OrderDisputeSummary> arg) {
        optimisticData.put(getKey("disputes"), arg);
        return this;
    }

    /**
    * Whether duties are included in the subtotal price of the order.
    */

    public Boolean getDutiesIncluded() {
        return (Boolean) get("dutiesIncluded");
    }

    public Order setDutiesIncluded(Boolean arg) {
        optimisticData.put(getKey("dutiesIncluded"), arg);
        return this;
    }

    /**
    * Whether the order has had any edits applied.
    */

    public Boolean getEdited() {
        return (Boolean) get("edited");
    }

    public Order setEdited(Boolean arg) {
        optimisticData.put(getKey("edited"), arg);
        return this;
    }

    /**
    * The email address associated with the customer.
    */

    public String getEmail() {
        return (String) get("email");
    }

    public Order setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
    * Whether taxes on the order are estimated.
    * This field returns `false` when taxes on the order are finalized and aren't subject to any changes.
    */

    public Boolean getEstimatedTaxes() {
        return (Boolean) get("estimatedTaxes");
    }

    public Order setEstimatedTaxes(Boolean arg) {
        optimisticData.put(getKey("estimatedTaxes"), arg);
        return this;
    }

    /**
    * A list of events associated with the order.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public Order setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * Whether there are line items that can be fulfilled.
    * This field returns `false` when the order has no fulfillable line items.
    * For a more granular view of the fulfillment status, refer to the
    * [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
    */

    public Boolean getFulfillable() {
        return (Boolean) get("fulfillable");
    }

    public Order setFulfillable(Boolean arg) {
        optimisticData.put(getKey("fulfillable"), arg);
        return this;
    }

    /**
    * A list of fulfillment orders for a specific order.
    * [FulfillmentOrder API access
    * scopes](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder#api-access-scopes)
    * govern which fulfillments orders are returned.
    * An API client will only receive a subset of the fulfillment orders which belong to an order
    * if they don't have the necessary access scopes to view all of the fulfillment orders.
    * In the case that an API client does not have the access scopes necessary to view
    * any of the fulfillment orders that belong to an order, an empty array will be returned.
    */

    public FulfillmentOrderConnection getFulfillmentOrders() {
        return (FulfillmentOrderConnection) get("fulfillmentOrders");
    }

    public Order setFulfillmentOrders(FulfillmentOrderConnection arg) {
        optimisticData.put(getKey("fulfillmentOrders"), arg);
        return this;
    }

    /**
    * List of shipments for the order.
    */

    public List<Fulfillment> getFulfillments() {
        return (List<Fulfillment>) get("fulfillments");
    }

    public Order setFulfillments(List<Fulfillment> arg) {
        optimisticData.put(getKey("fulfillments"), arg);
        return this;
    }

    /**
    * The count of fulfillments including the cancelled fulfillments.
    */

    public Count getFulfillmentsCount() {
        return (Count) get("fulfillmentsCount");
    }

    public Order setFulfillmentsCount(Count arg) {
        optimisticData.put(getKey("fulfillmentsCount"), arg);
        return this;
    }

    /**
    * Whether the order has been paid in full.
    */

    public Boolean getFullyPaid() {
        return (Boolean) get("fullyPaid");
    }

    public Order setFullyPaid(Boolean arg) {
        optimisticData.put(getKey("fullyPaid"), arg);
        return this;
    }

    /**
    * Whether the merchant added a timeline comment to the order.
    */

    public Boolean getHasTimelineComment() {
        return (Boolean) get("hasTimelineComment");
    }

    public Order setHasTimelineComment(Boolean arg) {
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
    * The ID of the corresponding resource in the REST Admin API.
    */

    public String getLegacyResourceId() {
        return (String) get("legacyResourceId");
    }

    public Order setLegacyResourceId(String arg) {
        optimisticData.put(getKey("legacyResourceId"), arg);
        return this;
    }

    /**
    * A list of the order's line items.
    */

    public LineItemConnection getLineItems() {
        return (LineItemConnection) get("lineItems");
    }

    public Order setLineItems(LineItemConnection arg) {
        optimisticData.put(getKey("lineItems"), arg);
        return this;
    }

    /**
    * List of localized fields for the resource.
    */

    public LocalizedFieldConnection getLocalizedFields() {
        return (LocalizedFieldConnection) get("localizedFields");
    }

    public Order setLocalizedFields(LocalizedFieldConnection arg) {
        optimisticData.put(getKey("localizedFields"), arg);
        return this;
    }

    /**
    * The merchant's business entity associated with the order.
    */

    public BusinessEntity getMerchantBusinessEntity() {
        return (BusinessEntity) get("merchantBusinessEntity");
    }

    public Order setMerchantBusinessEntity(BusinessEntity arg) {
        optimisticData.put(getKey("merchantBusinessEntity"), arg);
        return this;
    }

    /**
    * Whether the order can be edited by the merchant. For example, canceled orders can’t be edited.
    */

    public Boolean getMerchantEditable() {
        return (Boolean) get("merchantEditable");
    }

    public Order setMerchantEditable(Boolean arg) {
        optimisticData.put(getKey("merchantEditable"), arg);
        return this;
    }

    /**
    * A list of reasons why the order can't be edited. For example, "Canceled orders can't be edited".
    */

    public List<String> getMerchantEditableErrors() {
        return (List<String>) get("merchantEditableErrors");
    }

    public Order setMerchantEditableErrors(List<String> arg) {
        optimisticData.put(getKey("merchantEditableErrors"), arg);
        return this;
    }

    /**
    * The application acting as the Merchant of Record for the order.
    */

    public OrderApp getMerchantOfRecordApp() {
        return (OrderApp) get("merchantOfRecordApp");
    }

    public Order setMerchantOfRecordApp(OrderApp arg) {
        optimisticData.put(getKey("merchantOfRecordApp"), arg);
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

    public Order setMetafield(Metafield arg) {
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

    public Order setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The unique identifier for the order that appears on the order page in the Shopify admin and the
    * <b>Order status</b> page.
    * For example, "#1001", "EN1001", or "1001-A".
    * This value isn't unique across multiple stores.
    */

    public String getName() {
        return (String) get("name");
    }

    public Order setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The net payment for the order, based on the total amount received minus the total amount refunded,
    * in shop and presentment currencies.
    */

    public MoneyBag getNetPaymentSet() {
        return (MoneyBag) get("netPaymentSet");
    }

    public Order setNetPaymentSet(MoneyBag arg) {
        optimisticData.put(getKey("netPaymentSet"), arg);
        return this;
    }

    /**
    * A list of line items that can't be fulfilled.
    * For example, tips and fully refunded line items can't be fulfilled.
    * For a more granular view of the fulfillment status, refer to the
    * [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder) object.
    */

    public LineItemConnection getNonFulfillableLineItems() {
        return (LineItemConnection) get("nonFulfillableLineItems");
    }

    public Order setNonFulfillableLineItems(LineItemConnection arg) {
        optimisticData.put(getKey("nonFulfillableLineItems"), arg);
        return this;
    }

    /**
    * The contents of the note associated with the order.
    */

    public String getNote() {
        return (String) get("note");
    }

    public Order setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * The total amount of additional fees at the time of order creation, in shop and presentment
    * currencies.
    * Returns `null` if additional fees aren't applicable.
    */

    public MoneyBag getOriginalTotalAdditionalFeesSet() {
        return (MoneyBag) get("originalTotalAdditionalFeesSet");
    }

    public Order setOriginalTotalAdditionalFeesSet(MoneyBag arg) {
        optimisticData.put(getKey("originalTotalAdditionalFeesSet"), arg);
        return this;
    }

    /**
    * The total amount of duties at the time of order creation, in shop and presentment currencies.
    * Returns `null` if duties aren't applicable.
    */

    public MoneyBag getOriginalTotalDutiesSet() {
        return (MoneyBag) get("originalTotalDutiesSet");
    }

    public Order setOriginalTotalDutiesSet(MoneyBag arg) {
        optimisticData.put(getKey("originalTotalDutiesSet"), arg);
        return this;
    }

    /**
    * The total price of the order at the time of order creation, in shop and presentment currencies.
    */

    public MoneyBag getOriginalTotalPriceSet() {
        return (MoneyBag) get("originalTotalPriceSet");
    }

    public Order setOriginalTotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("originalTotalPriceSet"), arg);
        return this;
    }

    /**
    * The payment collection details for the order.
    */

    public OrderPaymentCollectionDetails getPaymentCollectionDetails() {
        return (OrderPaymentCollectionDetails) get("paymentCollectionDetails");
    }

    public Order setPaymentCollectionDetails(OrderPaymentCollectionDetails arg) {
        optimisticData.put(getKey("paymentCollectionDetails"), arg);
        return this;
    }

    /**
    * A list of the names of all payment gateways used for the order.
    * For example, "Shopify Payments" and "Cash on Delivery (COD)".
    */

    public List<String> getPaymentGatewayNames() {
        return (List<String>) get("paymentGatewayNames");
    }

    public Order setPaymentGatewayNames(List<String> arg) {
        optimisticData.put(getKey("paymentGatewayNames"), arg);
        return this;
    }

    /**
    * The payment terms associated with the order.
    */

    public PaymentTerms getPaymentTerms() {
        return (PaymentTerms) get("paymentTerms");
    }

    public Order setPaymentTerms(PaymentTerms arg) {
        optimisticData.put(getKey("paymentTerms"), arg);
        return this;
    }

    /**
    * The phone number associated with the customer.
    */

    public String getPhone() {
        return (String) get("phone");
    }

    public Order setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    /**
    * The PO number associated with the order.
    */

    public String getPoNumber() {
        return (String) get("poNumber");
    }

    public Order setPoNumber(String arg) {
        optimisticData.put(getKey("poNumber"), arg);
        return this;
    }

    /**
    * The payment `CurrencyCode` of the customer for the order.
    */

    public CurrencyCode getPresentmentCurrencyCode() {
        return (CurrencyCode) get("presentmentCurrencyCode");
    }

    public Order setPresentmentCurrencyCode(CurrencyCode arg) {
        optimisticData.put(getKey("presentmentCurrencyCode"), arg);
        return this;
    }

    /**
    * The date and time when the order was processed.
    * This date and time might not match the date and time when the order was created.
    */

    public String getProcessedAt() {
        return (String) get("processedAt");
    }

    public Order setProcessedAt(String arg) {
        optimisticData.put(getKey("processedAt"), arg);
        return this;
    }

    /**
    * The publication that the order was created from.
    */

    public Publication getPublication() {
        return (Publication) get("publication");
    }

    public Order setPublication(Publication arg) {
        optimisticData.put(getKey("publication"), arg);
        return this;
    }

    /**
    * The purchasing entity for the order.
    */

    public PurchasingEntity getPurchasingEntity() {
        return (PurchasingEntity) get("purchasingEntity");
    }

    public Order setPurchasingEntity(PurchasingEntity arg) {
        optimisticData.put(getKey("purchasingEntity"), arg);
        return this;
    }

    /**
    * The difference between the suggested and actual refund amount of all refunds that have been applied
    * to the order. A positive value indicates a difference in the merchant's favor, and a negative value
    * indicates a difference in the customer's favor.
    */

    public MoneyBag getRefundDiscrepancySet() {
        return (MoneyBag) get("refundDiscrepancySet");
    }

    public Order setRefundDiscrepancySet(MoneyBag arg) {
        optimisticData.put(getKey("refundDiscrepancySet"), arg);
        return this;
    }

    /**
    * Whether the order can be refunded.
    */

    public Boolean getRefundable() {
        return (Boolean) get("refundable");
    }

    public Order setRefundable(Boolean arg) {
        optimisticData.put(getKey("refundable"), arg);
        return this;
    }

    /**
    * A list of refunds that have been applied to the order.
    */

    public List<Refund> getRefunds() {
        return (List<Refund>) get("refunds");
    }

    public Order setRefunds(List<Refund> arg) {
        optimisticData.put(getKey("refunds"), arg);
        return this;
    }

    /**
    * The URL of the source that the order originated from, if found in the domain registry.
    */

    public String getRegisteredSourceUrl() {
        return (String) get("registeredSourceUrl");
    }

    public Order setRegisteredSourceUrl(String arg) {
        optimisticData.put(getKey("registeredSourceUrl"), arg);
        return this;
    }

    /**
    * Whether the order has shipping lines or at least one line item on the order that requires shipping.
    */

    public Boolean getRequiresShipping() {
        return (Boolean) get("requiresShipping");
    }

    public Order setRequiresShipping(Boolean arg) {
        optimisticData.put(getKey("requiresShipping"), arg);
        return this;
    }

    /**
    * Whether any line item on the order can be restocked.
    */

    public Boolean getRestockable() {
        return (Boolean) get("restockable");
    }

    public Order setRestockable(Boolean arg) {
        optimisticData.put(getKey("restockable"), arg);
        return this;
    }

    /**
    * The physical location where a retail order is created or completed, except for draft POS orders
    * completed via the “mark as paid” flow in Admin, which return null.
    */

    public Location getRetailLocation() {
        return (Location) get("retailLocation");
    }

    public Order setRetailLocation(Location arg) {
        optimisticData.put(getKey("retailLocation"), arg);
        return this;
    }

    /**
    * The order's aggregated return status for display purposes.
    */

    public OrderReturnStatus getReturnStatus() {
        return (OrderReturnStatus) get("returnStatus");
    }

    public Order setReturnStatus(OrderReturnStatus arg) {
        optimisticData.put(getKey("returnStatus"), arg);
        return this;
    }

    /**
    * A list of returns for the order.
    */

    public ReturnConnection getReturns() {
        return (ReturnConnection) get("returns");
    }

    public Order setReturns(ReturnConnection arg) {
        optimisticData.put(getKey("returns"), arg);
        return this;
    }

    /**
    * The risk characteristics for the order.
    */

    public OrderRiskSummary getRisk() {
        return (OrderRiskSummary) get("risk");
    }

    public Order setRisk(OrderRiskSummary arg) {
        optimisticData.put(getKey("risk"), arg);
        return this;
    }

    /**
    * The mailing address of the customer.
    */

    public MailingAddress getShippingAddress() {
        return (MailingAddress) get("shippingAddress");
    }

    public Order setShippingAddress(MailingAddress arg) {
        optimisticData.put(getKey("shippingAddress"), arg);
        return this;
    }

    /**
    * A summary of all shipping costs on the order.
    */

    public ShippingLine getShippingLine() {
        return (ShippingLine) get("shippingLine");
    }

    public Order setShippingLine(ShippingLine arg) {
        optimisticData.put(getKey("shippingLine"), arg);
        return this;
    }

    /**
    * A list of the order's shipping lines.
    */

    public ShippingLineConnection getShippingLines() {
        return (ShippingLineConnection) get("shippingLines");
    }

    public Order setShippingLines(ShippingLineConnection arg) {
        optimisticData.put(getKey("shippingLines"), arg);
        return this;
    }

    /**
    * The Shopify Protect details for the order. If Shopify Protect is disabled for the shop, then this
    * will be null.
    */

    public ShopifyProtectOrderSummary getShopifyProtect() {
        return (ShopifyProtectOrderSummary) get("shopifyProtect");
    }

    public Order setShopifyProtect(ShopifyProtectOrderSummary arg) {
        optimisticData.put(getKey("shopifyProtect"), arg);
        return this;
    }

    /**
    * A unique POS or third party order identifier.
    * For example, "1234-12-1000" or "111-98567-54". The `receipt_number` field is derived from this value
    * for POS orders.
    */

    public String getSourceIdentifier() {
        return (String) get("sourceIdentifier");
    }

    public Order setSourceIdentifier(String arg) {
        optimisticData.put(getKey("sourceIdentifier"), arg);
        return this;
    }

    /**
    * The name of the source associated with the order.
    */

    public String getSourceName() {
        return (String) get("sourceName");
    }

    public Order setSourceName(String arg) {
        optimisticData.put(getKey("sourceName"), arg);
        return this;
    }

    /**
    * The staff member associated with the order.
    */

    public StaffMember getStaffMember() {
        return (StaffMember) get("staffMember");
    }

    public Order setStaffMember(StaffMember arg) {
        optimisticData.put(getKey("staffMember"), arg);
        return this;
    }

    /**
    * The URL where the customer can check the order's current status.
    */

    public String getStatusPageUrl() {
        return (String) get("statusPageUrl");
    }

    public Order setStatusPageUrl(String arg) {
        optimisticData.put(getKey("statusPageUrl"), arg);
        return this;
    }

    /**
    * The sum of the quantities for all line items that contribute to the order's subtotal price.
    */

    public Integer getSubtotalLineItemsQuantity() {
        return (Integer) get("subtotalLineItemsQuantity");
    }

    public Order setSubtotalLineItemsQuantity(Integer arg) {
        optimisticData.put(getKey("subtotalLineItemsQuantity"), arg);
        return this;
    }

    /**
    * The sum of the prices for all line items after discounts and before returns, in shop and presentment
    * currencies.
    * If `taxesIncluded` is `true`, then the subtotal also includes tax.
    */

    public MoneyBag getSubtotalPriceSet() {
        return (MoneyBag) get("subtotalPriceSet");
    }

    public Order setSubtotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("subtotalPriceSet"), arg);
        return this;
    }

    /**
    * A suggested refund for the order.
    */

    public SuggestedRefund getSuggestedRefund() {
        return (SuggestedRefund) get("suggestedRefund");
    }

    public Order setSuggestedRefund(SuggestedRefund arg) {
        optimisticData.put(getKey("suggestedRefund"), arg);
        return this;
    }

    /**
    * A comma separated list of tags associated with the order. Updating `tags` overwrites
    * any existing tags that were previously added to the order. To add new tags without overwriting
    * existing tags, use the [tagsAdd](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
    * mutation.
    */

    public List<String> getTags() {
        return (List<String>) get("tags");
    }

    public Order setTags(List<String> arg) {
        optimisticData.put(getKey("tags"), arg);
        return this;
    }

    /**
    * Whether taxes are exempt on the order.
    */

    public Boolean getTaxExempt() {
        return (Boolean) get("taxExempt");
    }

    public Order setTaxExempt(Boolean arg) {
        optimisticData.put(getKey("taxExempt"), arg);
        return this;
    }

    /**
    * A list of all tax lines applied to line items on the order, before returns.
    * Tax line prices represent the total price for all tax lines with the same `rate` and `title`.
    */

    public List<TaxLine> getTaxLines() {
        return (List<TaxLine>) get("taxLines");
    }

    public Order setTaxLines(List<TaxLine> arg) {
        optimisticData.put(getKey("taxLines"), arg);
        return this;
    }

    /**
    * Whether taxes are included in the subtotal price of the order.
    */

    public Boolean getTaxesIncluded() {
        return (Boolean) get("taxesIncluded");
    }

    public Order setTaxesIncluded(Boolean arg) {
        optimisticData.put(getKey("taxesIncluded"), arg);
        return this;
    }

    /**
    * Whether the order is a test.
    * Test orders are made using the Shopify Bogus Gateway or a payment provider with test mode enabled.
    * A test order can't be converted into a real order and vice versa.
    */

    public Boolean getTest() {
        return (Boolean) get("test");
    }

    public Order setTest(Boolean arg) {
        optimisticData.put(getKey("test"), arg);
        return this;
    }

    /**
    * The authorized amount that's uncaptured or undercaptured, in shop and presentment currencies.
    * This amount isn't adjusted for returns.
    */

    public MoneyBag getTotalCapturableSet() {
        return (MoneyBag) get("totalCapturableSet");
    }

    public Order setTotalCapturableSet(MoneyBag arg) {
        optimisticData.put(getKey("totalCapturableSet"), arg);
        return this;
    }

    /**
    * The total rounding adjustment applied to payments or refunds for an Order involving cash payments.
    * Applies to some countries where cash transactions are rounded to the nearest currency denomination.
    */

    public CashRoundingAdjustment getTotalCashRoundingAdjustment() {
        return (CashRoundingAdjustment) get("totalCashRoundingAdjustment");
    }

    public Order setTotalCashRoundingAdjustment(CashRoundingAdjustment arg) {
        optimisticData.put(getKey("totalCashRoundingAdjustment"), arg);
        return this;
    }

    /**
    * The total amount discounted on the order before returns, in shop and presentment currencies.
    * This includes both order and line level discounts.
    */

    public MoneyBag getTotalDiscountsSet() {
        return (MoneyBag) get("totalDiscountsSet");
    }

    public Order setTotalDiscountsSet(MoneyBag arg) {
        optimisticData.put(getKey("totalDiscountsSet"), arg);
        return this;
    }

    /**
    * The total amount not yet transacted for the order, in shop and presentment currencies.
    * A positive value indicates a difference in the merchant's favor (payment from customer to merchant)
    * and a negative value indicates a difference in the customer's favor (refund from merchant to
    * customer).
    */

    public MoneyBag getTotalOutstandingSet() {
        return (MoneyBag) get("totalOutstandingSet");
    }

    public Order setTotalOutstandingSet(MoneyBag arg) {
        optimisticData.put(getKey("totalOutstandingSet"), arg);
        return this;
    }

    /**
    * The total price of the order, before returns, in shop and presentment currencies.
    * This includes taxes and discounts.
    */

    public MoneyBag getTotalPriceSet() {
        return (MoneyBag) get("totalPriceSet");
    }

    public Order setTotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("totalPriceSet"), arg);
        return this;
    }

    /**
    * The total amount received from the customer before returns, in shop and presentment currencies.
    */

    public MoneyBag getTotalReceivedSet() {
        return (MoneyBag) get("totalReceivedSet");
    }

    public Order setTotalReceivedSet(MoneyBag arg) {
        optimisticData.put(getKey("totalReceivedSet"), arg);
        return this;
    }

    /**
    * The total amount that was refunded, in shop and presentment currencies.
    */

    public MoneyBag getTotalRefundedSet() {
        return (MoneyBag) get("totalRefundedSet");
    }

    public Order setTotalRefundedSet(MoneyBag arg) {
        optimisticData.put(getKey("totalRefundedSet"), arg);
        return this;
    }

    /**
    * The total amount of shipping that was refunded, in shop and presentment currencies.
    */

    public MoneyBag getTotalRefundedShippingSet() {
        return (MoneyBag) get("totalRefundedShippingSet");
    }

    public Order setTotalRefundedShippingSet(MoneyBag arg) {
        optimisticData.put(getKey("totalRefundedShippingSet"), arg);
        return this;
    }

    /**
    * The total shipping amount before discounts and returns, in shop and presentment currencies.
    */

    public MoneyBag getTotalShippingPriceSet() {
        return (MoneyBag) get("totalShippingPriceSet");
    }

    public Order setTotalShippingPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("totalShippingPriceSet"), arg);
        return this;
    }

    /**
    * The total tax amount before returns, in shop and presentment currencies.
    */

    public MoneyBag getTotalTaxSet() {
        return (MoneyBag) get("totalTaxSet");
    }

    public Order setTotalTaxSet(MoneyBag arg) {
        optimisticData.put(getKey("totalTaxSet"), arg);
        return this;
    }

    /**
    * The sum of all tip amounts for the order, in shop and presentment currencies.
    */

    public MoneyBag getTotalTipReceivedSet() {
        return (MoneyBag) get("totalTipReceivedSet");
    }

    public Order setTotalTipReceivedSet(MoneyBag arg) {
        optimisticData.put(getKey("totalTipReceivedSet"), arg);
        return this;
    }

    /**
    * The total weight of the order before returns, in grams.
    */

    public String getTotalWeight() {
        return (String) get("totalWeight");
    }

    public Order setTotalWeight(String arg) {
        optimisticData.put(getKey("totalWeight"), arg);
        return this;
    }

    /**
    * A list of transactions associated with the order.
    */

    public List<OrderTransaction> getTransactions() {
        return (List<OrderTransaction>) get("transactions");
    }

    public Order setTransactions(List<OrderTransaction> arg) {
        optimisticData.put(getKey("transactions"), arg);
        return this;
    }

    /**
    * The number of transactions associated with the order.
    */

    public Count getTransactionsCount() {
        return (Count) get("transactionsCount");
    }

    public Order setTransactionsCount(Count arg) {
        optimisticData.put(getKey("transactionsCount"), arg);
        return this;
    }

    /**
    * Whether no payments have been made for the order.
    */

    public Boolean getUnpaid() {
        return (Boolean) get("unpaid");
    }

    public Order setUnpaid(Boolean arg) {
        optimisticData.put(getKey("unpaid"), arg);
        return this;
    }

    /**
    * The date and time when the order was modified last.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Order setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "additionalFees": return true;

            case "agreements": return true;

            case "alerts": return true;

            case "app": return true;

            case "billingAddress": return true;

            case "billingAddressMatchesShippingAddress": return false;

            case "canMarkAsPaid": return false;

            case "canNotifyCustomer": return false;

            case "cancelReason": return false;

            case "cancellation": return true;

            case "cancelledAt": return false;

            case "capturable": return false;

            case "cartDiscountAmountSet": return true;

            case "channelInformation": return true;

            case "clientIp": return false;

            case "closed": return false;

            case "closedAt": return false;

            case "confirmationNumber": return false;

            case "confirmed": return false;

            case "createdAt": return false;

            case "currencyCode": return false;

            case "currentCartDiscountAmountSet": return true;

            case "currentShippingPriceSet": return true;

            case "currentSubtotalLineItemsQuantity": return false;

            case "currentSubtotalPriceSet": return true;

            case "currentTaxLines": return true;

            case "currentTotalAdditionalFeesSet": return true;

            case "currentTotalDiscountsSet": return true;

            case "currentTotalDutiesSet": return true;

            case "currentTotalPriceSet": return true;

            case "currentTotalTaxSet": return true;

            case "currentTotalWeight": return false;

            case "customAttributes": return true;

            case "customer": return true;

            case "customerAcceptsMarketing": return false;

            case "customerJourneySummary": return true;

            case "customerLocale": return false;

            case "discountApplications": return true;

            case "discountCode": return false;

            case "discountCodes": return false;

            case "displayAddress": return true;

            case "displayFinancialStatus": return false;

            case "displayFulfillmentStatus": return false;

            case "disputes": return true;

            case "dutiesIncluded": return false;

            case "edited": return false;

            case "email": return false;

            case "estimatedTaxes": return false;

            case "events": return true;

            case "fulfillable": return false;

            case "fulfillmentOrders": return true;

            case "fulfillments": return true;

            case "fulfillmentsCount": return true;

            case "fullyPaid": return false;

            case "hasTimelineComment": return false;

            case "id": return false;

            case "legacyResourceId": return false;

            case "lineItems": return true;

            case "localizedFields": return true;

            case "merchantBusinessEntity": return true;

            case "merchantEditable": return false;

            case "merchantEditableErrors": return false;

            case "merchantOfRecordApp": return true;

            case "metafield": return true;

            case "metafields": return true;

            case "name": return false;

            case "netPaymentSet": return true;

            case "nonFulfillableLineItems": return true;

            case "note": return false;

            case "originalTotalAdditionalFeesSet": return true;

            case "originalTotalDutiesSet": return true;

            case "originalTotalPriceSet": return true;

            case "paymentCollectionDetails": return true;

            case "paymentGatewayNames": return false;

            case "paymentTerms": return true;

            case "phone": return false;

            case "poNumber": return false;

            case "presentmentCurrencyCode": return false;

            case "processedAt": return false;

            case "publication": return true;

            case "purchasingEntity": return false;

            case "refundDiscrepancySet": return true;

            case "refundable": return false;

            case "refunds": return true;

            case "registeredSourceUrl": return false;

            case "requiresShipping": return false;

            case "restockable": return false;

            case "retailLocation": return true;

            case "returnStatus": return false;

            case "returns": return true;

            case "risk": return true;

            case "shippingAddress": return true;

            case "shippingLine": return true;

            case "shippingLines": return true;

            case "shopifyProtect": return true;

            case "sourceIdentifier": return false;

            case "sourceName": return false;

            case "staffMember": return true;

            case "statusPageUrl": return false;

            case "subtotalLineItemsQuantity": return false;

            case "subtotalPriceSet": return true;

            case "suggestedRefund": return true;

            case "tags": return false;

            case "taxExempt": return false;

            case "taxLines": return true;

            case "taxesIncluded": return false;

            case "test": return false;

            case "totalCapturableSet": return true;

            case "totalCashRoundingAdjustment": return true;

            case "totalDiscountsSet": return true;

            case "totalOutstandingSet": return true;

            case "totalPriceSet": return true;

            case "totalReceivedSet": return true;

            case "totalRefundedSet": return true;

            case "totalRefundedShippingSet": return true;

            case "totalShippingPriceSet": return true;

            case "totalTaxSet": return true;

            case "totalTipReceivedSet": return true;

            case "totalWeight": return false;

            case "transactions": return true;

            case "transactionsCount": return true;

            case "unpaid": return false;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

