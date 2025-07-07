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
* The `Order` object represents a customer's request to purchase one or more products from a store.
* Use the `Order` object to handle the complete purchase lifecycle from checkout to fulfillment.
* Use the `Order` object when you need to:
* - Display order details on customer account pages or admin dashboards.
* - Create orders for phone sales, wholesale customers, or subscription services.
* - Update order information like shipping addresses, notes, or fulfillment status.
* - Process returns, exchanges, and partial refunds.
* - Generate invoices, receipts, and shipping labels.
* The `Order` object serves as the central hub connecting customer information, product details,
* payment processing, and fulfillment data within the GraphQL Admin API schema.
* > Note:
* > Only the last 60 days' worth of orders from a store are accessible from the `Order` object by
* default. If you want to access older records,
* > then you need to [request access to all
* orders](https://shopify.dev/docs/api/usage/access-scopes#orders-permissions). If your app is granted
* > access, then you can add the `read_all_orders`, `read_orders`, and `write_orders` scopes.
* > Caution:
* > Only use orders data if it's required for your app's functionality. Shopify will restrict [access
* to scopes](https://shopify.dev/docs/api/usage/access-scopes#requesting-specific-permissions) for
* apps that don't have a legitimate use for the associated data.
* Learn more about [building apps for orders and
* fulfillment](https://shopify.dev/docs/apps/build/orders-fulfillment).
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

                case "number": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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
    * A list of additional fees applied to an order, such as duties, import fees, or [tax
    * lines](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.additional
    * Fees.taxLines).
    */

    public List<AdditionalFee> getAdditionalFees() {
        return (List<AdditionalFee>) get("additionalFees");
    }

    public Order setAdditionalFees(List<AdditionalFee> arg) {
        optimisticData.put(getKey("additionalFees"), arg);
        return this;
    }

    /**
    * A list of sales agreements associated with the order, such as contracts defining payment terms, or
    * delivery schedules between merchants and customers.
    */

    public SalesAgreementConnection getAgreements() {
        return (SalesAgreementConnection) get("agreements");
    }

    public Order setAgreements(SalesAgreementConnection arg) {
        optimisticData.put(getKey("agreements"), arg);
        return this;
    }

    /**
    * A list of messages that appear on the **Orders** page in the Shopify admin. These alerts provide
    * merchants with important information about an order's status or required actions.
    */

    public List<ResourceAlert> getAlerts() {
        return (List<ResourceAlert>) get("alerts");
    }

    public Order setAlerts(List<ResourceAlert> arg) {
        optimisticData.put(getKey("alerts"), arg);
        return this;
    }

    /**
    * The application that created the order. For example, "Online Store", "Point of Sale", or a custom
    * app name.
    * Use this to identify the order source for attribution and fulfillment workflows.
    * Learn more about [building apps for orders and
    * fulfillment](https://shopify.dev/docs/apps/build/orders-fulfillment).
    */

    public OrderApp getApp() {
        return (OrderApp) get("app");
    }

    public Order setApp(OrderApp arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * The billing address associated with the payment method selected by the customer for an order.
    * Returns `null` if no billing address was provided during checkout.
    */

    public MailingAddress getBillingAddress() {
        return (MailingAddress) get("billingAddress");
    }

    public Order setBillingAddress(MailingAddress arg) {
        optimisticData.put(getKey("billingAddress"), arg);
        return this;
    }

    /**
    * Whether the billing address matches the [shipping
    * address](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.shipping
    * Address). Returns `true` if both addresses are the same, and `false` if they're different or if an
    * address is missing.
    */

    public Boolean getBillingAddressMatchesShippingAddress() {
        return (Boolean) get("billingAddressMatchesShippingAddress");
    }

    public Order setBillingAddressMatchesShippingAddress(Boolean arg) {
        optimisticData.put(getKey("billingAddressMatchesShippingAddress"), arg);
        return this;
    }

    /**
    * Whether an order can be manually marked as paid. Returns `false` if the order is already paid, is
    * canceled, has pending [Shopify
    * Payments](https://help.shopify.com/en/manual/payments/shopify-payments/payouts) transactions, or has
    * a negative payment amount.
    */

    public Boolean getCanMarkAsPaid() {
        return (Boolean) get("canMarkAsPaid");
    }

    public Order setCanMarkAsPaid(Boolean arg) {
        optimisticData.put(getKey("canMarkAsPaid"), arg);
        return this;
    }

    /**
    * Whether order notifications can be sent to the customer.
    * Returns `true` if the customer has a valid [email
    * address](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Order.fields.email).
    */

    public Boolean getCanNotifyCustomer() {
        return (Boolean) get("canNotifyCustomer");
    }

    public Order setCanNotifyCustomer(Boolean arg) {
        optimisticData.put(getKey("canNotifyCustomer"), arg);
        return this;
    }

    /**
    * The reason provided for an order cancellation. For example, a merchant might cancel an order if
    * there's insufficient inventory. Returns `null` if the order hasn't been canceled.
    */

    public OrderCancelReason getCancelReason() {
        return (OrderCancelReason) get("cancelReason");
    }

    public Order setCancelReason(OrderCancelReason arg) {
        optimisticData.put(getKey("cancelReason"), arg);
        return this;
    }

    /**
    * Details of an order's cancellation, if it has been canceled. This includes the reason, date, and any
    * [staff
    * notes](https://shopify.dev/api/admin-graphql/latest/objects/OrderCancellation#field-OrderCancellatio
    * n.fields.staffNote).
    */

    public OrderCancellation getCancellation() {
        return (OrderCancellation) get("cancellation");
    }

    public Order setCancellation(OrderCancellation arg) {
        optimisticData.put(getKey("cancellation"), arg);
        return this;
    }

    /**
    * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when an order was
    * canceled.
    * Returns `null` if the order hasn't been canceled.
    */

    public String getCancelledAt() {
        return (String) get("cancelledAt");
    }

    public Order setCancelledAt(String arg) {
        optimisticData.put(getKey("cancelledAt"), arg);
        return this;
    }

    /**
    * Whether an authorized payment for an order can be captured.
    * Returns `true` if an authorized payment exists that hasn't been fully captured yet. Learn more about
    * [capturing
    * payments](https://help.shopify.com/en/manual/fulfillment/managing-orders/payments/capturing-payments
    * ).
    */

    public Boolean getCapturable() {
        return (Boolean) get("capturable");
    }

    public Order setCapturable(Boolean arg) {
        optimisticData.put(getKey("capturable"), arg);
        return this;
    }

    /**
    * The total discount amount applied at the time the order was created, displayed in both shop and
    * presentment currencies, before returns, refunds, order edits, and cancellations. This field only
    * includes discounts applied to the entire order.
    */

    public MoneyBag getCartDiscountAmountSet() {
        return (MoneyBag) get("cartDiscountAmountSet");
    }

    public Order setCartDiscountAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("cartDiscountAmountSet"), arg);
        return this;
    }

    /**
    * Details about the sales channel that created the order, such as the [channel app
    * type](https://shopify.dev/docs/api/admin-graphql/latest/objects/channel#field-Channel.fields.channel
    * Type)
    * and [channel
    * name](https://shopify.dev/docs/api/admin-graphql/latest/objects/ChannelDefinition#field-ChannelDefin
    * ition.fields.channelName), which helps to track order sources.
    */

    public ChannelInformation getChannelInformation() {
        return (ChannelInformation) get("channelInformation");
    }

    public Order setChannelInformation(ChannelInformation arg) {
        optimisticData.put(getKey("channelInformation"), arg);
        return this;
    }

    /**
    * The IP address of the customer who placed the order. Useful for fraud detection and geographic
    * analysis.
    */

    public String getClientIp() {
        return (String) get("clientIp");
    }

    public Order setClientIp(String arg) {
        optimisticData.put(getKey("clientIp"), arg);
        return this;
    }

    /**
    * Whether an order is closed. An order is considered closed if all its line items have been fulfilled
    * or canceled, and all financial transactions are complete.
    */

    public Boolean getClosed() {
        return (Boolean) get("closed");
    }

    public Order setClosed(Boolean arg) {
        optimisticData.put(getKey("closed"), arg);
        return this;
    }

    /**
    * The date and time [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when an order was
    * closed. Shopify automatically records this timestamp when all items have been fulfilled or canceled,
    * and all financial transactions are complete. Returns `null` if the order isn't closed.
    */

    public String getClosedAt() {
        return (String) get("closedAt");
    }

    public Order setClosedAt(String arg) {
        optimisticData.put(getKey("closedAt"), arg);
        return this;
    }

    /**
    * A customer-facing order identifier, often shown instead of the sequential order name.
    * It uses a random alphanumeric format (for example, `XPAV284CT`) and isn't guaranteed to be unique
    * across orders.
    */

    public String getConfirmationNumber() {
        return (String) get("confirmationNumber");
    }

    public Order setConfirmationNumber(String arg) {
        optimisticData.put(getKey("confirmationNumber"), arg);
        return this;
    }

    /**
    * Whether inventory has been reserved for an order. Returns `true` if inventory quantities for an
    * order's [line items](https://shopify.dev/docs/api/admin-graphql/latest/objects/LineItem) have been
    * reserved.
    * Learn more about [managing inventory quantities and
    * states](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-quan
    * tities-states).
    */

    public Boolean getConfirmed() {
        return (Boolean) get("confirmed");
    }

    public Order setConfirmed(Boolean arg) {
        optimisticData.put(getKey("confirmed"), arg);
        return this;
    }

    /**
    * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when an order was
    * created. This timestamp is set when the customer completes checkout and remains unchanged throughout
    * an order's lifecycle.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Order setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The shop currency when the order was placed. For example, "USD" or "CAD".
    */

    public CurrencyCode getCurrencyCode() {
        return (CurrencyCode) get("currencyCode");
    }

    public Order setCurrencyCode(CurrencyCode arg) {
        optimisticData.put(getKey("currencyCode"), arg);
        return this;
    }

    /**
    * The current total of all discounts applied to the entire order, after returns, refunds, order edits,
    * and cancellations. This includes discount codes, automatic discounts, and other promotions that
    * affect the whole order rather than individual line items. To get the original discount amount at the
    * time of order creation, use the
    * [`cartDiscountAmountSet`](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Orde
    * r.fields.cartDiscountAmountSet) field.
    */

    public MoneyBag getCurrentCartDiscountAmountSet() {
        return (MoneyBag) get("currentCartDiscountAmountSet");
    }

    public Order setCurrentCartDiscountAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("currentCartDiscountAmountSet"), arg);
        return this;
    }

    /**
    * The current shipping price after applying refunds and discounts.
    * If the parent `order.taxesIncluded` field is true, then this price includes taxes. Otherwise, this
    * field is the pre-tax price.
    */

    public MoneyBag getCurrentShippingPriceSet() {
        return (MoneyBag) get("currentShippingPriceSet");
    }

    public Order setCurrentShippingPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("currentShippingPriceSet"), arg);
        return this;
    }

    /**
    * The current sum of the quantities for all line items that contribute to the order's subtotal price,
    * after returns, refunds, order edits, and cancellations.
    */

    public Integer getCurrentSubtotalLineItemsQuantity() {
        return (Integer) get("currentSubtotalLineItemsQuantity");
    }

    public Order setCurrentSubtotalLineItemsQuantity(Integer arg) {
        optimisticData.put(getKey("currentSubtotalLineItemsQuantity"), arg);
        return this;
    }

    /**
    * The total price of the order, after returns and refunds, in shop and presentment currencies.
    * This includes taxes and discounts.
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
    * The current total of all additional fees for an order, after any returns or modifications.
    * Modifications include returns, refunds, order edits, and cancellations. Additional fees can include
    * charges such as duties, import fees, and special handling.
    */

    public MoneyBag getCurrentTotalAdditionalFeesSet() {
        return (MoneyBag) get("currentTotalAdditionalFeesSet");
    }

    public Order setCurrentTotalAdditionalFeesSet(MoneyBag arg) {
        optimisticData.put(getKey("currentTotalAdditionalFeesSet"), arg);
        return this;
    }

    /**
    * The total amount discounted on the order after returns and refunds, in shop and presentment
    * currencies.
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
    * The current total duties amount for an order, after any returns or modifications. Modifications
    * include returns, refunds, order edits, and cancellations.
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
    * The sum of the prices of all tax lines applied to line items on the order, after returns and
    * refunds, in shop and presentment currencies.
    */

    public MoneyBag getCurrentTotalTaxSet() {
        return (MoneyBag) get("currentTotalTaxSet");
    }

    public Order setCurrentTotalTaxSet(MoneyBag arg) {
        optimisticData.put(getKey("currentTotalTaxSet"), arg);
        return this;
    }

    /**
    * The total weight of the order after returns and refunds, in grams.
    */

    public String getCurrentTotalWeight() {
        return (String) get("currentTotalWeight");
    }

    public Order setCurrentTotalWeight(String arg) {
        optimisticData.put(getKey("currentTotalWeight"), arg);
        return this;
    }

    /**
    * A list of additional information that has been attached to the order. For example, gift message,
    * delivery instructions, or internal notes.
    */

    public List<Attribute> getCustomAttributes() {
        return (List<Attribute>) get("customAttributes");
    }

    public Order setCustomAttributes(List<Attribute> arg) {
        optimisticData.put(getKey("customAttributes"), arg);
        return this;
    }

    /**
    * The customer who placed an order. Returns `null` if an order was created through a checkout without
    * customer authentication, such as a guest checkout.
    * Learn more about [customer accounts](https://help.shopify.com/manual/customers/customer-accounts).
    */

    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public Order setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
    * Whether the customer agreed to receive marketing emails at the time of purchase.
    * Use this to ensure compliance with marketing consent laws and to segment customers for email
    * campaigns.
    * Learn more about [building customer
    * segments](https://shopify.dev/docs/apps/build/marketing-analytics/customer-segments).
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
    * Use this to understand customer behavior, attribution sources, and marketing effectiveness to
    * optimize your sales funnel.
    */

    public CustomerJourneySummary getCustomerJourneySummary() {
        return (CustomerJourneySummary) get("customerJourneySummary");
    }

    public Order setCustomerJourneySummary(CustomerJourneySummary arg) {
        optimisticData.put(getKey("customerJourneySummary"), arg);
        return this;
    }

    /**
    * The customer's language and region preference at the time of purchase. For example, "en" for
    * English, "fr-CA" for French (Canada), or "es-MX" for Spanish (Mexico).
    * Use this to provide localized customer service and targeted marketing in the customer's preferred
    * language.
    */

    public String getCustomerLocale() {
        return (String) get("customerLocale");
    }

    public Order setCustomerLocale(String arg) {
        optimisticData.put(getKey("customerLocale"), arg);
        return this;
    }

    /**
    * A list of discounts that are applied to the order, excluding order edits and refunds.
    * Includes discount codes, automatic discounts, and other promotions that reduce the order total.
    */

    public DiscountApplicationConnection getDiscountApplications() {
        return (DiscountApplicationConnection) get("discountApplications");
    }

    public Order setDiscountApplications(DiscountApplicationConnection arg) {
        optimisticData.put(getKey("discountApplications"), arg);
        return this;
    }

    /**
    * The discount code used for an order. Returns `null` if no discount code was applied.
    */

    public String getDiscountCode() {
        return (String) get("discountCode");
    }

    public Order setDiscountCode(String arg) {
        optimisticData.put(getKey("discountCode"), arg);
        return this;
    }

    /**
    * The discount codes used for the order. Multiple codes can be applied to a single order.
    */

    public List<String> getDiscountCodes() {
        return (List<String>) get("discountCodes");
    }

    public Order setDiscountCodes(List<String> arg) {
        optimisticData.put(getKey("discountCodes"), arg);
        return this;
    }

    /**
    * The primary address of the customer, prioritizing shipping address over billing address when both
    * are available.
    * Returns `null` if neither shipping address nor billing address was provided.
    */

    public MailingAddress getDisplayAddress() {
        return (MailingAddress) get("displayAddress");
    }

    public Order setDisplayAddress(MailingAddress arg) {
        optimisticData.put(getKey("displayAddress"), arg);
        return this;
    }

    /**
    * An order's financial status for display in the Shopify admin.
    */

    public OrderDisplayFinancialStatus getDisplayFinancialStatus() {
        return (OrderDisplayFinancialStatus) get("displayFinancialStatus");
    }

    public Order setDisplayFinancialStatus(OrderDisplayFinancialStatus arg) {
        optimisticData.put(getKey("displayFinancialStatus"), arg);
        return this;
    }

    /**
    * The order's fulfillment status that displays in the Shopify admin to merchants. For example, an
    * order might be unfulfilled or scheduled.
    * For detailed processing, use the
    * [`FulfillmentOrder`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder)
    * object.
    */

    public OrderDisplayFulfillmentStatus getDisplayFulfillmentStatus() {
        return (OrderDisplayFulfillmentStatus) get("displayFulfillmentStatus");
    }

    public Order setDisplayFulfillmentStatus(OrderDisplayFulfillmentStatus arg) {
        optimisticData.put(getKey("displayFulfillmentStatus"), arg);
        return this;
    }

    /**
    * A list of payment disputes associated with the order, such as chargebacks or payment inquiries.
    * Disputes occur when customers challenge transactions with their bank or payment provider.
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
    * Duties are import taxes charged by customs authorities when goods cross international borders.
    */

    public Boolean getDutiesIncluded() {
        return (Boolean) get("dutiesIncluded");
    }

    public Order setDutiesIncluded(Boolean arg) {
        optimisticData.put(getKey("dutiesIncluded"), arg);
        return this;
    }

    /**
    * Whether the order has had any edits applied. For example, adding or removing line items, updating
    * quantities, or changing prices.
    */

    public Boolean getEdited() {
        return (Boolean) get("edited");
    }

    public Order setEdited(Boolean arg) {
        optimisticData.put(getKey("edited"), arg);
        return this;
    }

    /**
    * The email address associated with the customer for this order.
    * Used for sending order confirmations, shipping notifications, and other order-related
    * communications.
    * Returns `null` if no email address was provided during checkout.
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
    * A list of events associated with the order. Events track significant changes and activities related
    * to the order, such as creation, payment, fulfillment, and cancellation.
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
    * A list of [fulfillment
    * orders](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/fulfillment-order) for an
    * order. Each fulfillment order groups [line
    * items](https://shopify.dev/api/admin-graphql/latest/objects/OrderLineItem) that are fulfilled
    * together,
    * allowing an order to be processed in parts if needed.
    */

    public FulfillmentOrderConnection getFulfillmentOrders() {
        return (FulfillmentOrderConnection) get("fulfillmentOrders");
    }

    public Order setFulfillmentOrders(FulfillmentOrderConnection arg) {
        optimisticData.put(getKey("fulfillmentOrders"), arg);
        return this;
    }

    /**
    * A list of shipments for the order. Fulfillments represent the physical shipment of products to
    * customers.
    */

    public List<Fulfillment> getFulfillments() {
        return (List<Fulfillment>) get("fulfillments");
    }

    public Order setFulfillments(List<Fulfillment> arg) {
        optimisticData.put(getKey("fulfillments"), arg);
        return this;
    }

    /**
    * The total number of fulfillments for the order, including canceled ones.
    */

    public Count getFulfillmentsCount() {
        return (Count) get("fulfillmentsCount");
    }

    public Order setFulfillmentsCount(Count arg) {
        optimisticData.put(getKey("fulfillmentsCount"), arg);
        return this;
    }

    /**
    * Whether the order has been paid in full. This field returns `true` when the total amount received
    * equals or exceeds the order total.
    */

    public Boolean getFullyPaid() {
        return (Boolean) get("fullyPaid");
    }

    public Order setFullyPaid(Boolean arg) {
        optimisticData.put(getKey("fullyPaid"), arg);
        return this;
    }

    /**
    * Whether the merchant has added a timeline comment to the order.
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
    * A list of the order's line items. Line items represent the individual products and quantities that
    * make up the order.
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
    * The legal business structure that the merchant operates under for this order, such as an LLC,
    * corporation, or partnership.
    * Used for tax reporting, legal compliance, and determining which business entity is responsible for
    * the order.
    */

    public BusinessEntity getMerchantBusinessEntity() {
        return (BusinessEntity) get("merchantBusinessEntity");
    }

    public Order setMerchantBusinessEntity(BusinessEntity arg) {
        optimisticData.put(getKey("merchantBusinessEntity"), arg);
        return this;
    }

    /**
    * Whether the order can be edited by the merchant. Returns `false` for orders that can't be modified,
    * such as canceled orders or orders with specific payment statuses.
    */

    public Boolean getMerchantEditable() {
        return (Boolean) get("merchantEditable");
    }

    public Order setMerchantEditable(Boolean arg) {
        optimisticData.put(getKey("merchantEditable"), arg);
        return this;
    }

    /**
    * A list of reasons why the order can't be edited. For example, canceled orders can't be edited.
    */

    public List<String> getMerchantEditableErrors() {
        return (List<String>) get("merchantEditableErrors");
    }

    public Order setMerchantEditableErrors(List<String> arg) {
        optimisticData.put(getKey("merchantEditableErrors"), arg);
        return this;
    }

    /**
    * The application acting as the Merchant of Record for the order. The Merchant of Record is
    * responsible for tax collection and remittance.
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
    * **Order status** page.
    * For example, "#1001", "EN1001", or "1001-A".
    * This value isn't unique across multiple stores. Use this field to identify orders in the Shopify
    * admin and for order tracking.
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
    * The note associated with the order.
    * Contains additional information or instructions added by merchants or customers during the order
    * process.
    * Commonly used for special delivery instructions, gift messages, or internal processing notes.
    */

    public String getNote() {
        return (String) get("note");
    }

    public Order setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    /**
    * The order number used to generate the name using the store's configured order number prefix/suffix.
    * This number isn't guaranteed to follow a consecutive integer sequence (e.g. 1, 2, 3..), nor is it
    * guaranteed to be unique across multiple stores, or even for a single store.
    */

    public Integer getNumber() {
        return (Integer) get("number");
    }

    public Order setNumber(Integer arg) {
        optimisticData.put(getKey("number"), arg);
        return this;
    }

    /**
    * The total amount of all additional fees, such as import fees or taxes, that were applied when an
    * order was created.
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
    * The total amount of duties calculated when an order was created, before any modifications.
    * Modifications include returns, refunds, order edits, and cancellations. Use
    * [`currentTotalDutiesSet`](https://shopify.dev/docs/api/admin-graphql/latest/objects/order#field-Orde
    * r.fields.currentTotalDutiesSet) to retrieve the current duties amount after adjustments.
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
    * Use this to compare the original order value against the current total after edits, returns, or
    * refunds.
    */

    public MoneyBag getOriginalTotalPriceSet() {
        return (MoneyBag) get("originalTotalPriceSet");
    }

    public Order setOriginalTotalPriceSet(MoneyBag arg) {
        optimisticData.put(getKey("originalTotalPriceSet"), arg);
        return this;
    }

    /**
    * The payment collection details for the order, including payment status, outstanding amounts, and
    * collection information.
    * Use this to understand when and how payments should be collected, especially for orders with
    * deferred or installment payment terms.
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
    * The payment terms associated with the order, such as net payment due dates or early payment
    * discounts. Payment terms define when and how an order should be paid. Returns `null` if no specific
    * payment terms were set for the order.
    */

    public PaymentTerms getPaymentTerms() {
        return (PaymentTerms) get("paymentTerms");
    }

    public Order setPaymentTerms(PaymentTerms arg) {
        optimisticData.put(getKey("paymentTerms"), arg);
        return this;
    }

    /**
    * The phone number associated with the customer for this order.
    * Useful for contacting customers about shipping updates, delivery notifications, or order issues.
    * Returns `null` if no phone number was provided during checkout.
    */

    public String getPhone() {
        return (String) get("phone");
    }

    public Order setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    /**
    * The purchase order (PO) number that's associated with an order.
    * This is typically provided by business customers who require a PO number for their procurement.
    */

    public String getPoNumber() {
        return (String) get("poNumber");
    }

    public Order setPoNumber(String arg) {
        optimisticData.put(getKey("poNumber"), arg);
        return this;
    }

    /**
    * The currency used by the customer when placing the order. For example, "USD", "EUR", or "CAD".
    * This may differ from the shop's base currency when serving international customers or using
    * multi-currency pricing.
    */

    public CurrencyCode getPresentmentCurrencyCode() {
        return (CurrencyCode) get("presentmentCurrencyCode");
    }

    public Order setPresentmentCurrencyCode(CurrencyCode arg) {
        optimisticData.put(getKey("presentmentCurrencyCode"), arg);
        return this;
    }

    /**
    * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when the order was
    * processed.
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
    * The sales channel that the order was created from, such as the [Online
    * Store](https://shopify.dev/docs/apps/build/app-surfaces#online-store) or [Shopify
    * POS](https://shopify.dev/docs/apps/build/app-surfaces#point-of-sale).
    */

    public Publication getPublication() {
        return (Publication) get("publication");
    }

    public Order setPublication(Publication arg) {
        optimisticData.put(getKey("publication"), arg);
        return this;
    }

    /**
    * The business entity that placed the order, including company details and purchasing relationships.
    * Used for B2B transactions to track which company or organization is responsible for the purchase and
    * payment terms.
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
    * to the order.
    * A positive value indicates a difference in the merchant's favor, and a negative value indicates a
    * difference in the customer's favor.
    */

    public MoneyBag getRefundDiscrepancySet() {
        return (MoneyBag) get("refundDiscrepancySet");
    }

    public Order setRefundDiscrepancySet(MoneyBag arg) {
        optimisticData.put(getKey("refundDiscrepancySet"), arg);
        return this;
    }

    /**
    * Whether the order can be refunded based on its payment transactions.
    * Returns `false` for orders with no eligible payment transactions, such as fully refunded orders or
    * orders with non-refundable payment methods.
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
    * Refunds represent money returned to customers for returned items, cancellations, or adjustments.
    */

    public List<Refund> getRefunds() {
        return (List<Refund>) get("refunds");
    }

    public Order setRefunds(List<Refund> arg) {
        optimisticData.put(getKey("refunds"), arg);
        return this;
    }

    /**
    * The URL of the source that the order originated from, if found in the domain registry. Returns
    * `null` if the source URL isn't in the domain registry.
    */

    public String getRegisteredSourceUrl() {
        return (String) get("registeredSourceUrl");
    }

    public Order setRegisteredSourceUrl(String arg) {
        optimisticData.put(getKey("registeredSourceUrl"), arg);
        return this;
    }

    /**
    * Whether the order requires physical shipping to the customer.
    * Returns `false` for digital-only orders (such as gift cards or downloadable products) and `true` for
    * orders with physical products that need delivery.
    * Use this to determine shipping workflows and logistics requirements.
    */

    public Boolean getRequiresShipping() {
        return (Boolean) get("requiresShipping");
    }

    public Order setRequiresShipping(Boolean arg) {
        optimisticData.put(getKey("requiresShipping"), arg);
        return this;
    }

    /**
    * Whether any line items on the order can be restocked into inventory.
    * Returns `false` for digital products, custom items, or items that can't be resold.
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
    * completed using the "mark as paid" flow in the Shopify admin, which return `null`. Transactions
    * associated with the order might have been processed at a different location.
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
    * Indicates the overall state of returns for the order, helping merchants track and manage the return
    * process.
    */

    public OrderReturnStatus getReturnStatus() {
        return (OrderReturnStatus) get("returnStatus");
    }

    public Order setReturnStatus(OrderReturnStatus arg) {
        optimisticData.put(getKey("returnStatus"), arg);
        return this;
    }

    /**
    * The returns associated with the order.
    * Contains information about items that customers have requested to return, including return reasons,
    * status, and refund details.
    * Use this to track and manage the return process for order items.
    */

    public ReturnConnection getReturns() {
        return (ReturnConnection) get("returns");
    }

    public Order setReturns(ReturnConnection arg) {
        optimisticData.put(getKey("returns"), arg);
        return this;
    }

    /**
    * The risk assessment summary for the order.
    * Provides fraud analysis and risk scoring to help you identify potentially fraudulent orders.
    * Use this to make informed decisions about order fulfillment and payment processing.
    */

    public OrderRiskSummary getRisk() {
        return (OrderRiskSummary) get("risk");
    }

    public Order setRisk(OrderRiskSummary arg) {
        optimisticData.put(getKey("risk"), arg);
        return this;
    }

    /**
    * The shipping address where the order will be delivered.
    * Contains the customer's delivery location for fulfillment and shipping label generation.
    * Returns `null` for digital orders or orders that don't require shipping.
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
    * Aggregates shipping charges, discounts, and taxes to provide a single view of delivery costs.
    */

    public ShippingLine getShippingLine() {
        return (ShippingLine) get("shippingLine");
    }

    public Order setShippingLine(ShippingLine arg) {
        optimisticData.put(getKey("shippingLine"), arg);
        return this;
    }

    /**
    * The shipping methods applied to the order.
    * Each shipping line represents a shipping option chosen during checkout, including the carrier,
    * service level, and cost.
    * Use this to understand shipping charges and delivery options for the order.
    */

    public ShippingLineConnection getShippingLines() {
        return (ShippingLineConnection) get("shippingLines");
    }

    public Order setShippingLines(ShippingLineConnection arg) {
        optimisticData.put(getKey("shippingLines"), arg);
        return this;
    }

    /**
    * The Shopify Protect details for the order, including fraud protection status and coverage
    * information.
    * Shopify Protect helps protect eligible orders against fraudulent chargebacks.
    * Returns `null` if Shopify Protect is disabled for the shop or the order isn't eligible for
    * protection.
    * Learn more about [Shopify Protect](https://www.shopify.com/protect).
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
    * For example, "1234-12-1000" or "111-98567-54". The
    * [`receiptNumber`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-receiptNumbe
    * r) field is derived from this value for POS orders.
    */

    public String getSourceIdentifier() {
        return (String) get("sourceIdentifier");
    }

    public Order setSourceIdentifier(String arg) {
        optimisticData.put(getKey("sourceIdentifier"), arg);
        return this;
    }

    /**
    * The name of the source associated with the order, such as "web", "mobile_app", or "pos". Use this
    * field to identify the platform where the order was placed.
    */

    public String getSourceName() {
        return (String) get("sourceName");
    }

    public Order setSourceName(String arg) {
        optimisticData.put(getKey("sourceName"), arg);
        return this;
    }

    /**
    * The staff member who created or is responsible for the order.
    * Useful for tracking which team member handled phone orders, manual orders, or order modifications.
    * Returns `null` for orders created directly by customers through the online store.
    */

    public StaffMember getStaffMember() {
        return (StaffMember) get("staffMember");
    }

    public Order setStaffMember(StaffMember arg) {
        optimisticData.put(getKey("staffMember"), arg);
        return this;
    }

    /**
    * The URL where customers can check their order's current status, including tracking information and
    * delivery updates.
    * Provides order tracking links in emails, apps, or customer communications.
    */

    public String getStatusPageUrl() {
        return (String) get("statusPageUrl");
    }

    public Order setStatusPageUrl(String arg) {
        optimisticData.put(getKey("statusPageUrl"), arg);
        return this;
    }

    /**
    * The sum of quantities for all line items that contribute to the order's subtotal price.
    * This excludes quantities for items like tips, shipping costs, or gift cards that don't affect the
    * subtotal.
    * Use this to quickly understand the total item count for pricing calculations.
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
    * A calculated refund suggestion for the order based on specified line items, shipping, and duties.
    * Use this to preview refund amounts, taxes, and processing fees before creating an actual refund.
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
    * Returns `true` for orders where the customer or business has a valid tax exemption, such as
    * non-profit organizations or tax-free purchases.
    * Use this to understand if tax calculations were skipped during checkout.
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
    * When `true`, the subtotal and line item prices include tax amounts. When `false`, taxes are
    * calculated and displayed separately.
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
    * The total rounding adjustment applied to payments or refunds for an order involving cash payments.
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
    * The total shipping costs returned to the customer, in shop and presentment currencies. This includes
    * fees and any related discounts that were refunded.
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
    * The date and time in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601) when the order was
    * last modified.
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

            case "number": return false;

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

