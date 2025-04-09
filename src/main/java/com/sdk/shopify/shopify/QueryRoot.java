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
* The schema's entry-point for queries. This acts as the public, top-level API from which all queries
* must start.
*/
public class QueryRoot extends AbstractResponse<QueryRoot> {
    public QueryRoot() {
    }

    public QueryRoot(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "abandonedCheckouts": {
                    responseData.put(key, new AbandonedCheckoutConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "abandonedCheckoutsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "abandonment": {
                    Abandonment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Abandonment(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "abandonmentByAbandonedCheckoutId": {
                    Abandonment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Abandonment(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "app": {
                    App optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new App(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appByHandle": {
                    App optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new App(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appByKey": {
                    App optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new App(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appDiscountType": {
                    AppDiscountType optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppDiscountType(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appDiscountTypes": {
                    List<AppDiscountType> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new AppDiscountType(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "appInstallation": {
                    AppInstallation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppInstallation(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appInstallations": {
                    responseData.put(key, new AppInstallationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "article": {
                    Article optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Article(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "articleTags": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "articles": {
                    responseData.put(key, new ArticleConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "assignedFulfillmentOrders": {
                    responseData.put(key, new FulfillmentOrderConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "automaticDiscountNode": {
                    DiscountAutomaticNode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountAutomaticNode(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "automaticDiscountNodes": {
                    responseData.put(key, new DiscountAutomaticNodeConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "automaticDiscountSavedSearches": {
                    responseData.put(key, new SavedSearchConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "availableCarrierServices": {
                    List<DeliveryCarrierServiceAndLocations> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new DeliveryCarrierServiceAndLocations(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "availableLocales": {
                    List<Locale> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Locale(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "blog": {
                    Blog optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Blog(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "blogs": {
                    responseData.put(key, new BlogConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "blogsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "businessEntities": {
                    List<BusinessEntity> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new BusinessEntity(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "businessEntity": {
                    BusinessEntity optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BusinessEntity(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "carrierService": {
                    DeliveryCarrierService optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryCarrierService(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "carrierServices": {
                    responseData.put(key, new DeliveryCarrierServiceConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "cartTransforms": {
                    responseData.put(key, new CartTransformConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "cashTrackingSession": {
                    CashTrackingSession optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CashTrackingSession(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cashTrackingSessions": {
                    responseData.put(key, new CashTrackingSessionConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "catalog": {
                    Catalog optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownCatalog.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "catalogOperations": {
                    List<ResourceOperation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(UnknownResourceOperation.create(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "catalogs": {
                    responseData.put(key, new CatalogConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "catalogsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "checkoutBranding": {
                    CheckoutBranding optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBranding(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "checkoutProfile": {
                    CheckoutProfile optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutProfile(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "checkoutProfiles": {
                    responseData.put(key, new CheckoutProfileConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "codeDiscountNode": {
                    DiscountCodeNode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeNode(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "codeDiscountNodeByCode": {
                    DiscountCodeNode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeNode(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "codeDiscountNodes": {
                    responseData.put(key, new DiscountCodeNodeConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "codeDiscountSavedSearches": {
                    responseData.put(key, new SavedSearchConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "collection": {
                    Collection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Collection(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "collectionRulesConditions": {
                    List<CollectionRuleConditions> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CollectionRuleConditions(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "collectionSavedSearches": {
                    responseData.put(key, new SavedSearchConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "collections": {
                    responseData.put(key, new CollectionConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "collectionsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "comment": {
                    Comment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Comment(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "comments": {
                    responseData.put(key, new CommentConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "companies": {
                    responseData.put(key, new CompanyConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "companiesCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "company": {
                    Company optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Company(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyContact": {
                    CompanyContact optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyContact(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyContactRole": {
                    CompanyContactRole optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyContactRole(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyLocation": {
                    CompanyLocation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyLocation(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyLocations": {
                    responseData.put(key, new CompanyLocationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "currentAppInstallation": {
                    responseData.put(key, new AppInstallation(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "currentBulkOperation": {
                    BulkOperation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BulkOperation(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "currentStaffMember": {
                    StaffMember optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StaffMember(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "customerAccountPage": {
                    CustomerAccountPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownCustomerAccountPage.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerAccountPages": {
                    CustomerAccountPageConnection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerAccountPageConnection(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerByIdentifier": {
                    Customer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Customer(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerMergeJobStatus": {
                    CustomerMergeRequest optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerMergeRequest(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerMergePreview": {
                    responseData.put(key, new CustomerMergePreview(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "customerPaymentMethod": {
                    CustomerPaymentMethod optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPaymentMethod(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerSavedSearches": {
                    responseData.put(key, new SavedSearchConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "customerSegmentMembers": {
                    responseData.put(key, new CustomerSegmentMemberConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "customerSegmentMembersQuery": {
                    CustomerSegmentMembersQuery optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerSegmentMembersQuery(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerSegmentMembership": {
                    responseData.put(key, new SegmentMembershipResponse(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "customers": {
                    responseData.put(key, new CustomerConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "customersCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryCustomization": {
                    DeliveryCustomization optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryCustomization(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryCustomizations": {
                    responseData.put(key, new DeliveryCustomizationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "deliveryProfile": {
                    DeliveryProfile optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryProfile(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryProfiles": {
                    responseData.put(key, new DeliveryProfileConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "deliveryPromiseParticipants": {
                    DeliveryPromiseParticipantConnection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryPromiseParticipantConnection(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryPromiseProvider": {
                    DeliveryPromiseProvider optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryPromiseProvider(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryPromiseSettings": {
                    responseData.put(key, new DeliveryPromiseSetting(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "deliverySettings": {
                    DeliverySetting optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliverySetting(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodesCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountNode": {
                    DiscountNode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountNode(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountNodes": {
                    responseData.put(key, new DiscountNodeConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discountNodesCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountRedeemCodeBulkCreation": {
                    DiscountRedeemCodeBulkCreation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountRedeemCodeBulkCreation(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountRedeemCodeSavedSearches": {
                    responseData.put(key, new SavedSearchConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "dispute": {
                    ShopifyPaymentsDispute optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsDispute(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "disputeEvidence": {
                    ShopifyPaymentsDisputeEvidence optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsDisputeEvidence(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "disputes": {
                    responseData.put(key, new ShopifyPaymentsDisputeConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "domain": {
                    Domain optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Domain(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrder": {
                    DraftOrder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrder(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrderSavedSearches": {
                    responseData.put(key, new SavedSearchConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "draftOrderTag": {
                    DraftOrderTag optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrderTag(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrders": {
                    responseData.put(key, new DraftOrderConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "event": {
                    Event optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownEvent.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "events": {
                    EventConnection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new EventConnection(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "eventsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fileSavedSearches": {
                    responseData.put(key, new SavedSearchConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "files": {
                    responseData.put(key, new FileConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "fulfillment": {
                    Fulfillment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Fulfillment(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentConstraintRules": {
                    List<FulfillmentConstraintRule> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new FulfillmentConstraintRule(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "fulfillmentOrder": {
                    FulfillmentOrder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrder(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrders": {
                    responseData.put(key, new FulfillmentOrderConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "fulfillmentService": {
                    FulfillmentService optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentService(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftCard": {
                    GiftCard optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftCard(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftCards": {
                    responseData.put(key, new GiftCardConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "giftCardsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inventoryItem": {
                    InventoryItem optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryItem(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inventoryItems": {
                    responseData.put(key, new InventoryItemConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "inventoryLevel": {
                    InventoryLevel optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryLevel(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inventoryProperties": {
                    responseData.put(key, new InventoryProperties(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "job": {
                    Job optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Job(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "location": {
                    Location optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Location(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locations": {
                    responseData.put(key, new LocationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "locationsAvailableForDeliveryProfilesConnection": {
                    responseData.put(key, new LocationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "locationsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "manualHoldsFulfillmentOrders": {
                    responseData.put(key, new FulfillmentOrderConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "market": {
                    Market optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Market(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketByGeography": {
                    Market optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Market(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketLocalizableResource": {
                    MarketLocalizableResource optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketLocalizableResource(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketLocalizableResources": {
                    responseData.put(key, new MarketLocalizableResourceConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "marketLocalizableResourcesByIds": {
                    responseData.put(key, new MarketLocalizableResourceConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "marketingActivities": {
                    responseData.put(key, new MarketingActivityConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "marketingActivity": {
                    MarketingActivity optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketingActivity(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketingEvent": {
                    MarketingEvent optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketingEvent(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketingEvents": {
                    responseData.put(key, new MarketingEventConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "markets": {
                    responseData.put(key, new MarketConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "menu": {
                    Menu optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Menu(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "menus": {
                    responseData.put(key, new MenuConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "metafieldDefinition": {
                    MetafieldDefinition optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetafieldDefinition(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafieldDefinitionTypes": {
                    List<MetafieldDefinitionType> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MetafieldDefinitionType(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "metafieldDefinitions": {
                    responseData.put(key, new MetafieldDefinitionConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "metaobject": {
                    Metaobject optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Metaobject(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metaobjectByHandle": {
                    Metaobject optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Metaobject(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metaobjectDefinition": {
                    MetaobjectDefinition optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectDefinition(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metaobjectDefinitionByType": {
                    MetaobjectDefinition optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectDefinition(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metaobjectDefinitions": {
                    responseData.put(key, new MetaobjectDefinitionConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "metaobjects": {
                    responseData.put(key, new MetaobjectConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "mobilePlatformApplication": {
                    MobilePlatformApplication optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownMobilePlatformApplication.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "mobilePlatformApplications": {
                    responseData.put(key, new MobilePlatformApplicationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "node": {
                    Node optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownNode.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "nodes": {
                    List<Node> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        Node optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = UnknownNode.create(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "onlineStore": {
                    responseData.put(key, new OnlineStore(jsonAsObject(field.getValue(), key)));

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

                case "orderPaymentStatus": {
                    OrderPaymentStatus optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderPaymentStatus(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderSavedSearches": {
                    responseData.put(key, new SavedSearchConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "orders": {
                    responseData.put(key, new OrderConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "ordersCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "page": {
                    Page optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Page(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pages": {
                    responseData.put(key, new PageConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "pagesCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentCustomization": {
                    PaymentCustomization optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PaymentCustomization(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentCustomizations": {
                    responseData.put(key, new PaymentCustomizationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "paymentTermsTemplates": {
                    List<PaymentTermsTemplate> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new PaymentTermsTemplate(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "pendingOrdersCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "priceList": {
                    PriceList optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceList(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "priceLists": {
                    responseData.put(key, new PriceListConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "product": {
                    Product optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Product(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productByIdentifier": {
                    Product optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Product(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productDuplicateJob": {
                    responseData.put(key, new ProductDuplicateJob(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "productFeed": {
                    ProductFeed optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductFeed(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productFeeds": {
                    responseData.put(key, new ProductFeedConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "productOperation": {
                    ProductOperation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownProductOperation.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productResourceFeedback": {
                    ProductResourceFeedback optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductResourceFeedback(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productSavedSearches": {
                    responseData.put(key, new SavedSearchConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "productTags": {
                    StringConnection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StringConnection(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productTypes": {
                    StringConnection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StringConnection(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productVariant": {
                    ProductVariant optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductVariant(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productVariants": {
                    responseData.put(key, new ProductVariantConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "productVariantsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productVendors": {
                    StringConnection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StringConnection(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "products": {
                    responseData.put(key, new ProductConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "productsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "publicApiVersions": {
                    List<ApiVersion> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ApiVersion(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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

                case "publications": {
                    responseData.put(key, new PublicationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "publicationsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "publishedProductsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "refund": {
                    Refund optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Refund(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "return": {
                    Return optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Return(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returnCalculate": {
                    CalculatedReturn optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CalculatedReturn(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returnableFulfillment": {
                    ReturnableFulfillment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReturnableFulfillment(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returnableFulfillments": {
                    responseData.put(key, new ReturnableFulfillmentConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "reverseDelivery": {
                    ReverseDelivery optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReverseDelivery(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reverseFulfillmentOrder": {
                    ReverseFulfillmentOrder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReverseFulfillmentOrder(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "scriptTag": {
                    ScriptTag optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ScriptTag(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "scriptTags": {
                    responseData.put(key, new ScriptTagConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "segment": {
                    Segment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Segment(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "segmentFilterSuggestions": {
                    responseData.put(key, new SegmentFilterConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "segmentFilters": {
                    responseData.put(key, new SegmentFilterConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "segmentMigrations": {
                    responseData.put(key, new SegmentMigrationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "segmentValueSuggestions": {
                    responseData.put(key, new SegmentValueConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "segments": {
                    responseData.put(key, new SegmentConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "segmentsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sellingPlanGroup": {
                    SellingPlanGroup optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SellingPlanGroup(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sellingPlanGroups": {
                    responseData.put(key, new SellingPlanGroupConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "serverPixel": {
                    ServerPixel optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ServerPixel(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shop": {
                    responseData.put(key, new Shop(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "shopBillingPreferences": {
                    responseData.put(key, new ShopBillingPreferences(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "shopLocales": {
                    List<ShopLocale> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ShopLocale(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "shopifyFunction": {
                    ShopifyFunction optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyFunction(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shopifyFunctions": {
                    responseData.put(key, new ShopifyFunctionConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "shopifyPaymentsAccount": {
                    ShopifyPaymentsAccount optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsAccount(jsonAsObject(field.getValue(), key));
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

                case "staffMembers": {
                    StaffMemberConnection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StaffMemberConnection(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "standardMetafieldDefinitionTemplates": {
                    responseData.put(key, new StandardMetafieldDefinitionTemplateConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "storeCreditAccount": {
                    StoreCreditAccount optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StoreCreditAccount(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionBillingAttempt": {
                    SubscriptionBillingAttempt optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingAttempt(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionBillingAttempts": {
                    responseData.put(key, new SubscriptionBillingAttemptConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "subscriptionBillingCycle": {
                    SubscriptionBillingCycle optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingCycle(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionBillingCycleBulkResults": {
                    responseData.put(key, new SubscriptionBillingCycleConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "subscriptionBillingCycles": {
                    responseData.put(key, new SubscriptionBillingCycleConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "subscriptionContract": {
                    SubscriptionContract optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionContract(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionContracts": {
                    responseData.put(key, new SubscriptionContractConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "subscriptionDraft": {
                    SubscriptionDraft optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionDraft(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "taxonomy": {
                    Taxonomy optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Taxonomy(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "tenderTransactions": {
                    responseData.put(key, new TenderTransactionConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "theme": {
                    OnlineStoreTheme optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OnlineStoreTheme(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "themes": {
                    OnlineStoreThemeConnection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OnlineStoreThemeConnection(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "translatableResource": {
                    TranslatableResource optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new TranslatableResource(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "translatableResources": {
                    responseData.put(key, new TranslatableResourceConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "translatableResourcesByIds": {
                    responseData.put(key, new TranslatableResourceConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "urlRedirect": {
                    UrlRedirect optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UrlRedirect(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "urlRedirectImport": {
                    UrlRedirectImport optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UrlRedirectImport(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "urlRedirectSavedSearches": {
                    responseData.put(key, new SavedSearchConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "urlRedirects": {
                    responseData.put(key, new UrlRedirectConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "urlRedirectsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "validation": {
                    Validation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Validation(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "validations": {
                    responseData.put(key, new ValidationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "webPixel": {
                    WebPixel optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new WebPixel(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "webhookSubscription": {
                    WebhookSubscription optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new WebhookSubscription(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "webhookSubscriptions": {
                    responseData.put(key, new WebhookSubscriptionConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "webhookSubscriptionsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
        return "QueryRoot";
    }

    /**
    * List of abandoned checkouts. Includes checkouts that were recovered after being abandoned.
    */

    public AbandonedCheckoutConnection getAbandonedCheckouts() {
        return (AbandonedCheckoutConnection) get("abandonedCheckouts");
    }

    public QueryRoot setAbandonedCheckouts(AbandonedCheckoutConnection arg) {
        optimisticData.put(getKey("abandonedCheckouts"), arg);
        return this;
    }

    /**
    * Returns the count of abandoned checkouts for the given shop. Limited to a maximum of 10000.
    */

    public Count getAbandonedCheckoutsCount() {
        return (Count) get("abandonedCheckoutsCount");
    }

    public QueryRoot setAbandonedCheckoutsCount(Count arg) {
        optimisticData.put(getKey("abandonedCheckoutsCount"), arg);
        return this;
    }

    /**
    * Returns an abandonment by ID.
    */

    public Abandonment getAbandonment() {
        return (Abandonment) get("abandonment");
    }

    public QueryRoot setAbandonment(Abandonment arg) {
        optimisticData.put(getKey("abandonment"), arg);
        return this;
    }

    /**
    * Returns an Abandonment by the Abandoned Checkout ID.
    */

    public Abandonment getAbandonmentByAbandonedCheckoutId() {
        return (Abandonment) get("abandonmentByAbandonedCheckoutId");
    }

    public QueryRoot setAbandonmentByAbandonedCheckoutId(Abandonment arg) {
        optimisticData.put(getKey("abandonmentByAbandonedCheckoutId"), arg);
        return this;
    }

    /**
    * Lookup an App by ID or return the currently authenticated App.
    */

    public App getApp() {
        return (App) get("app");
    }

    public QueryRoot setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * Fetches app by handle.
    * Returns null if the app doesn't exist.
    */

    public App getAppByHandle() {
        return (App) get("appByHandle");
    }

    public QueryRoot setAppByHandle(App arg) {
        optimisticData.put(getKey("appByHandle"), arg);
        return this;
    }

    /**
    * Fetches an app by its client ID.
    * Returns null if the app doesn't exist.
    */

    public App getAppByKey() {
        return (App) get("appByKey");
    }

    public QueryRoot setAppByKey(App arg) {
        optimisticData.put(getKey("appByKey"), arg);
        return this;
    }

    /**
    * An app discount type.
    */

    public AppDiscountType getAppDiscountType() {
        return (AppDiscountType) get("appDiscountType");
    }

    public QueryRoot setAppDiscountType(AppDiscountType arg) {
        optimisticData.put(getKey("appDiscountType"), arg);
        return this;
    }

    /**
    * A list of app discount types installed by apps.
    */

    public List<AppDiscountType> getAppDiscountTypes() {
        return (List<AppDiscountType>) get("appDiscountTypes");
    }

    public QueryRoot setAppDiscountTypes(List<AppDiscountType> arg) {
        optimisticData.put(getKey("appDiscountTypes"), arg);
        return this;
    }

    /**
    * Lookup an AppInstallation by ID or return the AppInstallation for the currently authenticated App.
    */

    public AppInstallation getAppInstallation() {
        return (AppInstallation) get("appInstallation");
    }

    public QueryRoot setAppInstallation(AppInstallation arg) {
        optimisticData.put(getKey("appInstallation"), arg);
        return this;
    }

    /**
    * A list of app installations. To use this query, you need to contact [Shopify
    * Support](https://partners.shopify.com/current/support/) to grant your custom app the `read_apps`
    * access scope. Public apps can't be granted this access scope.
    */

    public AppInstallationConnection getAppInstallations() {
        return (AppInstallationConnection) get("appInstallations");
    }

    public QueryRoot setAppInstallations(AppInstallationConnection arg) {
        optimisticData.put(getKey("appInstallations"), arg);
        return this;
    }

    /**
    * Returns an Article resource by ID.
    */

    public Article getArticle() {
        return (Article) get("article");
    }

    public QueryRoot setArticle(Article arg) {
        optimisticData.put(getKey("article"), arg);
        return this;
    }

    /**
    * List of all article tags.
    */

    public List<String> getArticleTags() {
        return (List<String>) get("articleTags");
    }

    public QueryRoot setArticleTags(List<String> arg) {
        optimisticData.put(getKey("articleTags"), arg);
        return this;
    }

    /**
    * List of the shop's articles.
    */

    public ArticleConnection getArticles() {
        return (ArticleConnection) get("articles");
    }

    public QueryRoot setArticles(ArticleConnection arg) {
        optimisticData.put(getKey("articles"), arg);
        return this;
    }

    /**
    * The paginated list of fulfillment orders assigned to the shop locations owned by the app.
    * Assigned fulfillment orders are fulfillment orders that are set to be fulfilled from locations
    * managed by
    * [fulfillment services](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentService)
    * that are registered by the app.
    * One app (api_client) can host multiple fulfillment services on a shop.
    * Each fulfillment service manages a dedicated location on a shop.
    * Assigned fulfillment orders can have associated
    * [fulfillment
    * requests](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderRequestStatus),
    * or might currently not be requested to be fulfilled.
    * The app must have the `read_assigned_fulfillment_orders`
    * [access scope](https://shopify.dev/docs/api/usage/access-scopes)
    * to be able to retrieve the fulfillment orders assigned to its locations.
    * All assigned fulfillment orders (except those with the `CLOSED` status) will be returned by default.
    * Perform filtering with the `assignmentStatus` argument
    * to receive only fulfillment orders that have been requested to be fulfilled.
    */

    public FulfillmentOrderConnection getAssignedFulfillmentOrders() {
        return (FulfillmentOrderConnection) get("assignedFulfillmentOrders");
    }

    public QueryRoot setAssignedFulfillmentOrders(FulfillmentOrderConnection arg) {
        optimisticData.put(getKey("assignedFulfillmentOrders"), arg);
        return this;
    }

    /**
    * Returns an automatic discount resource by ID.
    */

    public DiscountAutomaticNode getAutomaticDiscountNode() {
        return (DiscountAutomaticNode) get("automaticDiscountNode");
    }

    public QueryRoot setAutomaticDiscountNode(DiscountAutomaticNode arg) {
        optimisticData.put(getKey("automaticDiscountNode"), arg);
        return this;
    }

    /**
    * Returns a list of [automatic
    * discounts](https://help.shopify.com/manual/discounts/discount-types#automatic-discounts).
    */

    public DiscountAutomaticNodeConnection getAutomaticDiscountNodes() {
        return (DiscountAutomaticNodeConnection) get("automaticDiscountNodes");
    }

    public QueryRoot setAutomaticDiscountNodes(DiscountAutomaticNodeConnection arg) {
        optimisticData.put(getKey("automaticDiscountNodes"), arg);
        return this;
    }

    /**
    * List of the shop's automatic discount saved searches.
    */

    public SavedSearchConnection getAutomaticDiscountSavedSearches() {
        return (SavedSearchConnection) get("automaticDiscountSavedSearches");
    }

    public QueryRoot setAutomaticDiscountSavedSearches(SavedSearchConnection arg) {
        optimisticData.put(getKey("automaticDiscountSavedSearches"), arg);
        return this;
    }

    /**
    * Returns a list of activated carrier services and associated shop locations that support them.
    */

    public List<DeliveryCarrierServiceAndLocations> getAvailableCarrierServices() {
        return (List<DeliveryCarrierServiceAndLocations>) get("availableCarrierServices");
    }

    public QueryRoot setAvailableCarrierServices(List<DeliveryCarrierServiceAndLocations> arg) {
        optimisticData.put(getKey("availableCarrierServices"), arg);
        return this;
    }

    /**
    * A list of available locales.
    */

    public List<Locale> getAvailableLocales() {
        return (List<Locale>) get("availableLocales");
    }

    public QueryRoot setAvailableLocales(List<Locale> arg) {
        optimisticData.put(getKey("availableLocales"), arg);
        return this;
    }

    /**
    * Returns a Blog resource by ID.
    */

    public Blog getBlog() {
        return (Blog) get("blog");
    }

    public QueryRoot setBlog(Blog arg) {
        optimisticData.put(getKey("blog"), arg);
        return this;
    }

    /**
    * List of the shop's blogs.
    */

    public BlogConnection getBlogs() {
        return (BlogConnection) get("blogs");
    }

    public QueryRoot setBlogs(BlogConnection arg) {
        optimisticData.put(getKey("blogs"), arg);
        return this;
    }

    /**
    * Count of blogs.
    */

    public Count getBlogsCount() {
        return (Count) get("blogsCount");
    }

    public QueryRoot setBlogsCount(Count arg) {
        optimisticData.put(getKey("blogsCount"), arg);
        return this;
    }

    /**
    * Returns a list of Business Entities associated with the shop.
    */

    public List<BusinessEntity> getBusinessEntities() {
        return (List<BusinessEntity>) get("businessEntities");
    }

    public QueryRoot setBusinessEntities(List<BusinessEntity> arg) {
        optimisticData.put(getKey("businessEntities"), arg);
        return this;
    }

    /**
    * Returns a Business Entity by ID.
    */

    public BusinessEntity getBusinessEntity() {
        return (BusinessEntity) get("businessEntity");
    }

    public QueryRoot setBusinessEntity(BusinessEntity arg) {
        optimisticData.put(getKey("businessEntity"), arg);
        return this;
    }

    /**
    * Returns a `DeliveryCarrierService` object by ID.
    */

    public DeliveryCarrierService getCarrierService() {
        return (DeliveryCarrierService) get("carrierService");
    }

    public QueryRoot setCarrierService(DeliveryCarrierService arg) {
        optimisticData.put(getKey("carrierService"), arg);
        return this;
    }

    /**
    * Retrieve a list of CarrierServices.
    */

    public DeliveryCarrierServiceConnection getCarrierServices() {
        return (DeliveryCarrierServiceConnection) get("carrierServices");
    }

    public QueryRoot setCarrierServices(DeliveryCarrierServiceConnection arg) {
        optimisticData.put(getKey("carrierServices"), arg);
        return this;
    }

    /**
    * List of Cart transform objects owned by the current API client.
    */

    public CartTransformConnection getCartTransforms() {
        return (CartTransformConnection) get("cartTransforms");
    }

    public QueryRoot setCartTransforms(CartTransformConnection arg) {
        optimisticData.put(getKey("cartTransforms"), arg);
        return this;
    }

    /**
    * Lookup a cash tracking session by ID.
    */

    public CashTrackingSession getCashTrackingSession() {
        return (CashTrackingSession) get("cashTrackingSession");
    }

    public QueryRoot setCashTrackingSession(CashTrackingSession arg) {
        optimisticData.put(getKey("cashTrackingSession"), arg);
        return this;
    }

    /**
    * Returns a shop's cash tracking sessions for locations with a POS Pro subscription.
    * Tip: To query for cash tracking sessions in bulk, you can
    * [perform a bulk operation](https://shopify.dev/docs/api/usage/bulk-operations/queries).
    */

    public CashTrackingSessionConnection getCashTrackingSessions() {
        return (CashTrackingSessionConnection) get("cashTrackingSessions");
    }

    public QueryRoot setCashTrackingSessions(CashTrackingSessionConnection arg) {
        optimisticData.put(getKey("cashTrackingSessions"), arg);
        return this;
    }

    /**
    * Returns a Catalog resource by ID.
    */

    public Catalog getCatalog() {
        return (Catalog) get("catalog");
    }

    public QueryRoot setCatalog(Catalog arg) {
        optimisticData.put(getKey("catalog"), arg);
        return this;
    }

    /**
    * Returns the most recent catalog operations for the shop.
    */

    public List<ResourceOperation> getCatalogOperations() {
        return (List<ResourceOperation>) get("catalogOperations");
    }

    public QueryRoot setCatalogOperations(List<ResourceOperation> arg) {
        optimisticData.put(getKey("catalogOperations"), arg);
        return this;
    }

    /**
    * The catalogs belonging to the shop.
    */

    public CatalogConnection getCatalogs() {
        return (CatalogConnection) get("catalogs");
    }

    public QueryRoot setCatalogs(CatalogConnection arg) {
        optimisticData.put(getKey("catalogs"), arg);
        return this;
    }

    /**
    * The count of catalogs belonging to the shop. Limited to a maximum of 10000.
    */

    public Count getCatalogsCount() {
        return (Count) get("catalogsCount");
    }

    public QueryRoot setCatalogsCount(Count arg) {
        optimisticData.put(getKey("catalogsCount"), arg);
        return this;
    }

    /**
    * Returns the visual customizations for checkout for a given checkout profile.
    * To learn more about updating checkout branding settings, refer to the
    * [checkoutBrandingUpsert](https://shopify.dev/api/admin-graphql/unstable/mutations/checkoutBrandingUp
    * sert)
    * mutation and the checkout branding [tutorial](https://shopify.dev/docs/apps/checkout/styling).
    */

    public CheckoutBranding getCheckoutBranding() {
        return (CheckoutBranding) get("checkoutBranding");
    }

    public QueryRoot setCheckoutBranding(CheckoutBranding arg) {
        optimisticData.put(getKey("checkoutBranding"), arg);
        return this;
    }

    /**
    * A checkout profile on a shop.
    */

    public CheckoutProfile getCheckoutProfile() {
        return (CheckoutProfile) get("checkoutProfile");
    }

    public QueryRoot setCheckoutProfile(CheckoutProfile arg) {
        optimisticData.put(getKey("checkoutProfile"), arg);
        return this;
    }

    /**
    * List of checkout profiles on a shop.
    */

    public CheckoutProfileConnection getCheckoutProfiles() {
        return (CheckoutProfileConnection) get("checkoutProfiles");
    }

    public QueryRoot setCheckoutProfiles(CheckoutProfileConnection arg) {
        optimisticData.put(getKey("checkoutProfiles"), arg);
        return this;
    }

    /**
    * Returns a [code discount](https://help.shopify.com/manual/discounts/discount-types#discount-codes)
    * resource by ID.
    */

    public DiscountCodeNode getCodeDiscountNode() {
        return (DiscountCodeNode) get("codeDiscountNode");
    }

    public QueryRoot setCodeDiscountNode(DiscountCodeNode arg) {
        optimisticData.put(getKey("codeDiscountNode"), arg);
        return this;
    }

    /**
    * Returns a code discount identified by its discount code.
    */

    public DiscountCodeNode getCodeDiscountNodeByCode() {
        return (DiscountCodeNode) get("codeDiscountNodeByCode");
    }

    public QueryRoot setCodeDiscountNodeByCode(DiscountCodeNode arg) {
        optimisticData.put(getKey("codeDiscountNodeByCode"), arg);
        return this;
    }

    /**
    * Returns a list of [code-based
    * discounts](https://help.shopify.com/manual/discounts/discount-types#discount-codes).
    */

    public DiscountCodeNodeConnection getCodeDiscountNodes() {
        return (DiscountCodeNodeConnection) get("codeDiscountNodes");
    }

    public QueryRoot setCodeDiscountNodes(DiscountCodeNodeConnection arg) {
        optimisticData.put(getKey("codeDiscountNodes"), arg);
        return this;
    }

    /**
    * List of the shop's code discount saved searches.
    */

    public SavedSearchConnection getCodeDiscountSavedSearches() {
        return (SavedSearchConnection) get("codeDiscountSavedSearches");
    }

    public QueryRoot setCodeDiscountSavedSearches(SavedSearchConnection arg) {
        optimisticData.put(getKey("codeDiscountSavedSearches"), arg);
        return this;
    }

    /**
    * Returns a Collection resource by ID.
    */

    public Collection getCollection() {
        return (Collection) get("collection");
    }

    public QueryRoot setCollection(Collection arg) {
        optimisticData.put(getKey("collection"), arg);
        return this;
    }

    /**
    * Lists all rules that can be used to create smart collections.
    */

    public List<CollectionRuleConditions> getCollectionRulesConditions() {
        return (List<CollectionRuleConditions>) get("collectionRulesConditions");
    }

    public QueryRoot setCollectionRulesConditions(List<CollectionRuleConditions> arg) {
        optimisticData.put(getKey("collectionRulesConditions"), arg);
        return this;
    }

    /**
    * Returns a list of the shop's collection saved searches.
    */

    public SavedSearchConnection getCollectionSavedSearches() {
        return (SavedSearchConnection) get("collectionSavedSearches");
    }

    public QueryRoot setCollectionSavedSearches(SavedSearchConnection arg) {
        optimisticData.put(getKey("collectionSavedSearches"), arg);
        return this;
    }

    /**
    * Returns a list of collections.
    */

    public CollectionConnection getCollections() {
        return (CollectionConnection) get("collections");
    }

    public QueryRoot setCollections(CollectionConnection arg) {
        optimisticData.put(getKey("collections"), arg);
        return this;
    }

    /**
    * Count of collections. Limited to a maximum of 10000.
    */

    public Count getCollectionsCount() {
        return (Count) get("collectionsCount");
    }

    public QueryRoot setCollectionsCount(Count arg) {
        optimisticData.put(getKey("collectionsCount"), arg);
        return this;
    }

    /**
    * Returns a Comment resource by ID.
    */

    public Comment getComment() {
        return (Comment) get("comment");
    }

    public QueryRoot setComment(Comment arg) {
        optimisticData.put(getKey("comment"), arg);
        return this;
    }

    /**
    * List of the shop's comments.
    */

    public CommentConnection getComments() {
        return (CommentConnection) get("comments");
    }

    public QueryRoot setComments(CommentConnection arg) {
        optimisticData.put(getKey("comments"), arg);
        return this;
    }

    /**
    * Returns the list of companies in the shop.
    */

    public CompanyConnection getCompanies() {
        return (CompanyConnection) get("companies");
    }

    public QueryRoot setCompanies(CompanyConnection arg) {
        optimisticData.put(getKey("companies"), arg);
        return this;
    }

    /**
    * The number of companies for a shop.
    */

    public Count getCompaniesCount() {
        return (Count) get("companiesCount");
    }

    public QueryRoot setCompaniesCount(Count arg) {
        optimisticData.put(getKey("companiesCount"), arg);
        return this;
    }

    /**
    * Returns a `Company` object by ID.
    */

    public Company getCompany() {
        return (Company) get("company");
    }

    public QueryRoot setCompany(Company arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    /**
    * Returns a `CompanyContact` object by ID.
    */

    public CompanyContact getCompanyContact() {
        return (CompanyContact) get("companyContact");
    }

    public QueryRoot setCompanyContact(CompanyContact arg) {
        optimisticData.put(getKey("companyContact"), arg);
        return this;
    }

    /**
    * Returns a `CompanyContactRole` object by ID.
    */

    public CompanyContactRole getCompanyContactRole() {
        return (CompanyContactRole) get("companyContactRole");
    }

    public QueryRoot setCompanyContactRole(CompanyContactRole arg) {
        optimisticData.put(getKey("companyContactRole"), arg);
        return this;
    }

    /**
    * Returns a `CompanyLocation` object by ID.
    */

    public CompanyLocation getCompanyLocation() {
        return (CompanyLocation) get("companyLocation");
    }

    public QueryRoot setCompanyLocation(CompanyLocation arg) {
        optimisticData.put(getKey("companyLocation"), arg);
        return this;
    }

    /**
    * Returns the list of company locations in the shop.
    */

    public CompanyLocationConnection getCompanyLocations() {
        return (CompanyLocationConnection) get("companyLocations");
    }

    public QueryRoot setCompanyLocations(CompanyLocationConnection arg) {
        optimisticData.put(getKey("companyLocations"), arg);
        return this;
    }

    /**
    * Return the AppInstallation for the currently authenticated App.
    */

    public AppInstallation getCurrentAppInstallation() {
        return (AppInstallation) get("currentAppInstallation");
    }

    public QueryRoot setCurrentAppInstallation(AppInstallation arg) {
        optimisticData.put(getKey("currentAppInstallation"), arg);
        return this;
    }

    /**
    * Returns the current app's most recent BulkOperation. Apps can run one bulk query and one bulk
    * mutation operation at a time, by shop.
    */

    public BulkOperation getCurrentBulkOperation() {
        return (BulkOperation) get("currentBulkOperation");
    }

    public QueryRoot setCurrentBulkOperation(BulkOperation arg) {
        optimisticData.put(getKey("currentBulkOperation"), arg);
        return this;
    }

    /**
    * The staff member making the API request.
    */

    public StaffMember getCurrentStaffMember() {
        return (StaffMember) get("currentStaffMember");
    }

    public QueryRoot setCurrentStaffMember(StaffMember arg) {
        optimisticData.put(getKey("currentStaffMember"), arg);
        return this;
    }

    /**
    * Returns a Customer resource by ID.
    */

    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public QueryRoot setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
    * Returns a customer account page.
    */

    public CustomerAccountPage getCustomerAccountPage() {
        return (CustomerAccountPage) get("customerAccountPage");
    }

    public QueryRoot setCustomerAccountPage(CustomerAccountPage arg) {
        optimisticData.put(getKey("customerAccountPage"), arg);
        return this;
    }

    /**
    * List of the shop's customer account pages.
    */

    public CustomerAccountPageConnection getCustomerAccountPages() {
        return (CustomerAccountPageConnection) get("customerAccountPages");
    }

    public QueryRoot setCustomerAccountPages(CustomerAccountPageConnection arg) {
        optimisticData.put(getKey("customerAccountPages"), arg);
        return this;
    }

    /**
    * Return a customer by an identifier.
    */

    public Customer getCustomerByIdentifier() {
        return (Customer) get("customerByIdentifier");
    }

    public QueryRoot setCustomerByIdentifier(Customer arg) {
        optimisticData.put(getKey("customerByIdentifier"), arg);
        return this;
    }

    /**
    * Returns the status of a customer merge request job.
    */

    public CustomerMergeRequest getCustomerMergeJobStatus() {
        return (CustomerMergeRequest) get("customerMergeJobStatus");
    }

    public QueryRoot setCustomerMergeJobStatus(CustomerMergeRequest arg) {
        optimisticData.put(getKey("customerMergeJobStatus"), arg);
        return this;
    }

    /**
    * Returns a preview of a customer merge request.
    */

    public CustomerMergePreview getCustomerMergePreview() {
        return (CustomerMergePreview) get("customerMergePreview");
    }

    public QueryRoot setCustomerMergePreview(CustomerMergePreview arg) {
        optimisticData.put(getKey("customerMergePreview"), arg);
        return this;
    }

    /**
    * Returns a CustomerPaymentMethod resource by its ID.
    */

    public CustomerPaymentMethod getCustomerPaymentMethod() {
        return (CustomerPaymentMethod) get("customerPaymentMethod");
    }

    public QueryRoot setCustomerPaymentMethod(CustomerPaymentMethod arg) {
        optimisticData.put(getKey("customerPaymentMethod"), arg);
        return this;
    }

    /**
    * List of the shop's customer saved searches.
    */

    public SavedSearchConnection getCustomerSavedSearches() {
        return (SavedSearchConnection) get("customerSavedSearches");
    }

    public QueryRoot setCustomerSavedSearches(SavedSearchConnection arg) {
        optimisticData.put(getKey("customerSavedSearches"), arg);
        return this;
    }

    /**
    * The list of members, such as customers, that's associated with an individual segment.
    * The maximum page size is 1000.
    */

    public CustomerSegmentMemberConnection getCustomerSegmentMembers() {
        return (CustomerSegmentMemberConnection) get("customerSegmentMembers");
    }

    public QueryRoot setCustomerSegmentMembers(CustomerSegmentMemberConnection arg) {
        optimisticData.put(getKey("customerSegmentMembers"), arg);
        return this;
    }

    /**
    * Returns a segment members query resource by ID.
    */

    public CustomerSegmentMembersQuery getCustomerSegmentMembersQuery() {
        return (CustomerSegmentMembersQuery) get("customerSegmentMembersQuery");
    }

    public QueryRoot setCustomerSegmentMembersQuery(CustomerSegmentMembersQuery arg) {
        optimisticData.put(getKey("customerSegmentMembersQuery"), arg);
        return this;
    }

    /**
    * Whether a member, which is a customer, belongs to a segment.
    */

    public SegmentMembershipResponse getCustomerSegmentMembership() {
        return (SegmentMembershipResponse) get("customerSegmentMembership");
    }

    public QueryRoot setCustomerSegmentMembership(SegmentMembershipResponse arg) {
        optimisticData.put(getKey("customerSegmentMembership"), arg);
        return this;
    }

    /**
    * Returns a list of customers.
    */

    public CustomerConnection getCustomers() {
        return (CustomerConnection) get("customers");
    }

    public QueryRoot setCustomers(CustomerConnection arg) {
        optimisticData.put(getKey("customers"), arg);
        return this;
    }

    /**
    * The number of customers.
    */

    public Count getCustomersCount() {
        return (Count) get("customersCount");
    }

    public QueryRoot setCustomersCount(Count arg) {
        optimisticData.put(getKey("customersCount"), arg);
        return this;
    }

    /**
    * The delivery customization.
    */

    public DeliveryCustomization getDeliveryCustomization() {
        return (DeliveryCustomization) get("deliveryCustomization");
    }

    public QueryRoot setDeliveryCustomization(DeliveryCustomization arg) {
        optimisticData.put(getKey("deliveryCustomization"), arg);
        return this;
    }

    /**
    * The delivery customizations.
    */

    public DeliveryCustomizationConnection getDeliveryCustomizations() {
        return (DeliveryCustomizationConnection) get("deliveryCustomizations");
    }

    public QueryRoot setDeliveryCustomizations(DeliveryCustomizationConnection arg) {
        optimisticData.put(getKey("deliveryCustomizations"), arg);
        return this;
    }

    /**
    * Returns a Delivery Profile resource by ID.
    */

    public DeliveryProfile getDeliveryProfile() {
        return (DeliveryProfile) get("deliveryProfile");
    }

    public QueryRoot setDeliveryProfile(DeliveryProfile arg) {
        optimisticData.put(getKey("deliveryProfile"), arg);
        return this;
    }

    /**
    * Returns a list of saved delivery profiles.
    */

    public DeliveryProfileConnection getDeliveryProfiles() {
        return (DeliveryProfileConnection) get("deliveryProfiles");
    }

    public QueryRoot setDeliveryProfiles(DeliveryProfileConnection arg) {
        optimisticData.put(getKey("deliveryProfiles"), arg);
        return this;
    }

    /**
    * Returns delivery promise participants.
    */

    public DeliveryPromiseParticipantConnection getDeliveryPromiseParticipants() {
        return (DeliveryPromiseParticipantConnection) get("deliveryPromiseParticipants");
    }

    public QueryRoot setDeliveryPromiseParticipants(DeliveryPromiseParticipantConnection arg) {
        optimisticData.put(getKey("deliveryPromiseParticipants"), arg);
        return this;
    }

    /**
    * Lookup a delivery promise provider.
    */

    public DeliveryPromiseProvider getDeliveryPromiseProvider() {
        return (DeliveryPromiseProvider) get("deliveryPromiseProvider");
    }

    public QueryRoot setDeliveryPromiseProvider(DeliveryPromiseProvider arg) {
        optimisticData.put(getKey("deliveryPromiseProvider"), arg);
        return this;
    }

    /**
    * Represents the delivery promise settings for a shop.
    */

    public DeliveryPromiseSetting getDeliveryPromiseSettings() {
        return (DeliveryPromiseSetting) get("deliveryPromiseSettings");
    }

    public QueryRoot setDeliveryPromiseSettings(DeliveryPromiseSetting arg) {
        optimisticData.put(getKey("deliveryPromiseSettings"), arg);
        return this;
    }

    /**
    * Returns the shop-wide shipping settings.
    */

    public DeliverySetting getDeliverySettings() {
        return (DeliverySetting) get("deliverySettings");
    }

    public QueryRoot setDeliverySettings(DeliverySetting arg) {
        optimisticData.put(getKey("deliverySettings"), arg);
        return this;
    }

    /**
    * The total number of discount codes for the shop.
    */

    public Count getDiscountCodesCount() {
        return (Count) get("discountCodesCount");
    }

    public QueryRoot setDiscountCodesCount(Count arg) {
        optimisticData.put(getKey("discountCodesCount"), arg);
        return this;
    }

    /**
    * Returns a discount resource by ID.
    */

    public DiscountNode getDiscountNode() {
        return (DiscountNode) get("discountNode");
    }

    public QueryRoot setDiscountNode(DiscountNode arg) {
        optimisticData.put(getKey("discountNode"), arg);
        return this;
    }

    /**
    * Returns a list of discounts.
    */

    public DiscountNodeConnection getDiscountNodes() {
        return (DiscountNodeConnection) get("discountNodes");
    }

    public QueryRoot setDiscountNodes(DiscountNodeConnection arg) {
        optimisticData.put(getKey("discountNodes"), arg);
        return this;
    }

    /**
    * The total number of discounts for the shop. Limited to a maximum of 10000.
    */

    public Count getDiscountNodesCount() {
        return (Count) get("discountNodesCount");
    }

    public QueryRoot setDiscountNodesCount(Count arg) {
        optimisticData.put(getKey("discountNodesCount"), arg);
        return this;
    }

    /**
    * Returns a bulk code creation resource by ID.
    */

    public DiscountRedeemCodeBulkCreation getDiscountRedeemCodeBulkCreation() {
        return (DiscountRedeemCodeBulkCreation) get("discountRedeemCodeBulkCreation");
    }

    public QueryRoot setDiscountRedeemCodeBulkCreation(DiscountRedeemCodeBulkCreation arg) {
        optimisticData.put(getKey("discountRedeemCodeBulkCreation"), arg);
        return this;
    }

    /**
    * List of the shop's redeemed discount code saved searches.
    */

    public SavedSearchConnection getDiscountRedeemCodeSavedSearches() {
        return (SavedSearchConnection) get("discountRedeemCodeSavedSearches");
    }

    public QueryRoot setDiscountRedeemCodeSavedSearches(SavedSearchConnection arg) {
        optimisticData.put(getKey("discountRedeemCodeSavedSearches"), arg);
        return this;
    }

    /**
    * Returns dispute details based on ID.
    */

    public ShopifyPaymentsDispute getDispute() {
        return (ShopifyPaymentsDispute) get("dispute");
    }

    public QueryRoot setDispute(ShopifyPaymentsDispute arg) {
        optimisticData.put(getKey("dispute"), arg);
        return this;
    }

    /**
    * Returns dispute evidence details based on ID.
    */

    public ShopifyPaymentsDisputeEvidence getDisputeEvidence() {
        return (ShopifyPaymentsDisputeEvidence) get("disputeEvidence");
    }

    public QueryRoot setDisputeEvidence(ShopifyPaymentsDisputeEvidence arg) {
        optimisticData.put(getKey("disputeEvidence"), arg);
        return this;
    }

    /**
    * All disputes related to the Shop.
    */

    public ShopifyPaymentsDisputeConnection getDisputes() {
        return (ShopifyPaymentsDisputeConnection) get("disputes");
    }

    public QueryRoot setDisputes(ShopifyPaymentsDisputeConnection arg) {
        optimisticData.put(getKey("disputes"), arg);
        return this;
    }

    /**
    * Lookup a Domain by ID.
    */

    public Domain getDomain() {
        return (Domain) get("domain");
    }

    public QueryRoot setDomain(Domain arg) {
        optimisticData.put(getKey("domain"), arg);
        return this;
    }

    /**
    * Returns a DraftOrder resource by ID.
    */

    public DraftOrder getDraftOrder() {
        return (DraftOrder) get("draftOrder");
    }

    public QueryRoot setDraftOrder(DraftOrder arg) {
        optimisticData.put(getKey("draftOrder"), arg);
        return this;
    }

    /**
    * List of the shop's draft order saved searches.
    */

    public SavedSearchConnection getDraftOrderSavedSearches() {
        return (SavedSearchConnection) get("draftOrderSavedSearches");
    }

    public QueryRoot setDraftOrderSavedSearches(SavedSearchConnection arg) {
        optimisticData.put(getKey("draftOrderSavedSearches"), arg);
        return this;
    }

    /**
    * Returns a DraftOrderTag resource by ID.
    */

    public DraftOrderTag getDraftOrderTag() {
        return (DraftOrderTag) get("draftOrderTag");
    }

    public QueryRoot setDraftOrderTag(DraftOrderTag arg) {
        optimisticData.put(getKey("draftOrderTag"), arg);
        return this;
    }

    /**
    * List of saved draft orders.
    */

    public DraftOrderConnection getDraftOrders() {
        return (DraftOrderConnection) get("draftOrders");
    }

    public QueryRoot setDraftOrders(DraftOrderConnection arg) {
        optimisticData.put(getKey("draftOrders"), arg);
        return this;
    }

    /**
    * Get a single event by its id.
    */

    public Event getEvent() {
        return (Event) get("event");
    }

    public QueryRoot setEvent(Event arg) {
        optimisticData.put(getKey("event"), arg);
        return this;
    }

    /**
    * The paginated list of events associated with the store.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public QueryRoot setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * Count of events. Limited to a maximum of 10000.
    */

    public Count getEventsCount() {
        return (Count) get("eventsCount");
    }

    public QueryRoot setEventsCount(Count arg) {
        optimisticData.put(getKey("eventsCount"), arg);
        return this;
    }

    /**
    * A list of the shop's file saved searches.
    */

    public SavedSearchConnection getFileSavedSearches() {
        return (SavedSearchConnection) get("fileSavedSearches");
    }

    public QueryRoot setFileSavedSearches(SavedSearchConnection arg) {
        optimisticData.put(getKey("fileSavedSearches"), arg);
        return this;
    }

    /**
    * Returns a paginated list of files that have been uploaded to Shopify.
    */

    public FileConnection getFiles() {
        return (FileConnection) get("files");
    }

    public QueryRoot setFiles(FileConnection arg) {
        optimisticData.put(getKey("files"), arg);
        return this;
    }

    /**
    * Returns a Fulfillment resource by ID.
    */

    public Fulfillment getFulfillment() {
        return (Fulfillment) get("fulfillment");
    }

    public QueryRoot setFulfillment(Fulfillment arg) {
        optimisticData.put(getKey("fulfillment"), arg);
        return this;
    }

    /**
    * The fulfillment constraint rules that belong to a shop.
    */

    public List<FulfillmentConstraintRule> getFulfillmentConstraintRules() {
        return (List<FulfillmentConstraintRule>) get("fulfillmentConstraintRules");
    }

    public QueryRoot setFulfillmentConstraintRules(List<FulfillmentConstraintRule> arg) {
        optimisticData.put(getKey("fulfillmentConstraintRules"), arg);
        return this;
    }

    /**
    * Returns a Fulfillment order resource by ID.
    */

    public FulfillmentOrder getFulfillmentOrder() {
        return (FulfillmentOrder) get("fulfillmentOrder");
    }

    public QueryRoot setFulfillmentOrder(FulfillmentOrder arg) {
        optimisticData.put(getKey("fulfillmentOrder"), arg);
        return this;
    }

    /**
    * The paginated list of all fulfillment orders.
    * The returned fulfillment orders are filtered according to the
    * [fulfillment order access
    * scopes](https://shopify.dev/api/admin-graphql/latest/objects/fulfillmentorder#api-access-scopes)
    * granted to the app.
    * Use this query to retrieve fulfillment orders assigned to merchant-managed locations,
    * third-party fulfillment service locations, or all kinds of locations together.
    * For fetching only the fulfillment orders assigned to the app's locations, use the
    * [assignedFulfillmentOrders](https://shopify.dev/api/admin-graphql/2024-07/objects/queryroot#connecti
    * on-assignedfulfillmentorders)
    * connection.
    */

    public FulfillmentOrderConnection getFulfillmentOrders() {
        return (FulfillmentOrderConnection) get("fulfillmentOrders");
    }

    public QueryRoot setFulfillmentOrders(FulfillmentOrderConnection arg) {
        optimisticData.put(getKey("fulfillmentOrders"), arg);
        return this;
    }

    /**
    * Returns a FulfillmentService resource by ID.
    */

    public FulfillmentService getFulfillmentService() {
        return (FulfillmentService) get("fulfillmentService");
    }

    public QueryRoot setFulfillmentService(FulfillmentService arg) {
        optimisticData.put(getKey("fulfillmentService"), arg);
        return this;
    }

    /**
    * Returns a gift card resource by ID.
    */

    public GiftCard getGiftCard() {
        return (GiftCard) get("giftCard");
    }

    public QueryRoot setGiftCard(GiftCard arg) {
        optimisticData.put(getKey("giftCard"), arg);
        return this;
    }

    /**
    * Returns a list of gift cards.
    */

    public GiftCardConnection getGiftCards() {
        return (GiftCardConnection) get("giftCards");
    }

    public QueryRoot setGiftCards(GiftCardConnection arg) {
        optimisticData.put(getKey("giftCards"), arg);
        return this;
    }

    /**
    * The total number of gift cards issued for the shop. Limited to a maximum of 10000.
    */

    public Count getGiftCardsCount() {
        return (Count) get("giftCardsCount");
    }

    public QueryRoot setGiftCardsCount(Count arg) {
        optimisticData.put(getKey("giftCardsCount"), arg);
        return this;
    }

    /**
    * Returns an
    * [InventoryItem](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryItem)
    * object by ID.
    */

    public InventoryItem getInventoryItem() {
        return (InventoryItem) get("inventoryItem");
    }

    public QueryRoot setInventoryItem(InventoryItem arg) {
        optimisticData.put(getKey("inventoryItem"), arg);
        return this;
    }

    /**
    * Returns a list of inventory items.
    */

    public InventoryItemConnection getInventoryItems() {
        return (InventoryItemConnection) get("inventoryItems");
    }

    public QueryRoot setInventoryItems(InventoryItemConnection arg) {
        optimisticData.put(getKey("inventoryItems"), arg);
        return this;
    }

    /**
    * Returns an
    * [InventoryLevel](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryLevel)
    * object by ID.
    */

    public InventoryLevel getInventoryLevel() {
        return (InventoryLevel) get("inventoryLevel");
    }

    public QueryRoot setInventoryLevel(InventoryLevel arg) {
        optimisticData.put(getKey("inventoryLevel"), arg);
        return this;
    }

    /**
    * General inventory properties for the shop.
    */

    public InventoryProperties getInventoryProperties() {
        return (InventoryProperties) get("inventoryProperties");
    }

    public QueryRoot setInventoryProperties(InventoryProperties arg) {
        optimisticData.put(getKey("inventoryProperties"), arg);
        return this;
    }

    /**
    * Returns a Job resource by ID. Used to check the status of internal jobs and any applicable changes.
    */

    public Job getJob() {
        return (Job) get("job");
    }

    public QueryRoot setJob(Job arg) {
        optimisticData.put(getKey("job"), arg);
        return this;
    }

    /**
    * Returns an inventory Location resource by ID.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public QueryRoot setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * Returns a list of active inventory locations.
    */

    public LocationConnection getLocations() {
        return (LocationConnection) get("locations");
    }

    public QueryRoot setLocations(LocationConnection arg) {
        optimisticData.put(getKey("locations"), arg);
        return this;
    }

    /**
    * Returns a list of all origin locations available for a delivery profile.
    */

    public LocationConnection getLocationsAvailableForDeliveryProfilesConnection() {
        return (LocationConnection) get("locationsAvailableForDeliveryProfilesConnection");
    }

    public QueryRoot setLocationsAvailableForDeliveryProfilesConnection(LocationConnection arg) {
        optimisticData.put(getKey("locationsAvailableForDeliveryProfilesConnection"), arg);
        return this;
    }

    /**
    * Returns the count of locations for the given shop. Limited to a maximum of 10000.
    */

    public Count getLocationsCount() {
        return (Count) get("locationsCount");
    }

    public QueryRoot setLocationsCount(Count arg) {
        optimisticData.put(getKey("locationsCount"), arg);
        return this;
    }

    /**
    * Returns a list of fulfillment orders that are on hold.
    */

    public FulfillmentOrderConnection getManualHoldsFulfillmentOrders() {
        return (FulfillmentOrderConnection) get("manualHoldsFulfillmentOrders");
    }

    public QueryRoot setManualHoldsFulfillmentOrders(FulfillmentOrderConnection arg) {
        optimisticData.put(getKey("manualHoldsFulfillmentOrders"), arg);
        return this;
    }

    /**
    * Returns a market resource by ID.
    */

    public Market getMarket() {
        return (Market) get("market");
    }

    public QueryRoot setMarket(Market arg) {
        optimisticData.put(getKey("market"), arg);
        return this;
    }

    /**
    * Returns the applicable market for a customer based on where they are in the world.
    */

    public Market getMarketByGeography() {
        return (Market) get("marketByGeography");
    }

    public QueryRoot setMarketByGeography(Market arg) {
        optimisticData.put(getKey("marketByGeography"), arg);
        return this;
    }

    /**
    * A resource that can have localized values for different markets.
    */

    public MarketLocalizableResource getMarketLocalizableResource() {
        return (MarketLocalizableResource) get("marketLocalizableResource");
    }

    public QueryRoot setMarketLocalizableResource(MarketLocalizableResource arg) {
        optimisticData.put(getKey("marketLocalizableResource"), arg);
        return this;
    }

    /**
    * Resources that can have localized values for different markets.
    */

    public MarketLocalizableResourceConnection getMarketLocalizableResources() {
        return (MarketLocalizableResourceConnection) get("marketLocalizableResources");
    }

    public QueryRoot setMarketLocalizableResources(MarketLocalizableResourceConnection arg) {
        optimisticData.put(getKey("marketLocalizableResources"), arg);
        return this;
    }

    /**
    * Resources that can have localized values for different markets.
    */

    public MarketLocalizableResourceConnection getMarketLocalizableResourcesByIds() {
        return (MarketLocalizableResourceConnection) get("marketLocalizableResourcesByIds");
    }

    public QueryRoot setMarketLocalizableResourcesByIds(MarketLocalizableResourceConnection arg) {
        optimisticData.put(getKey("marketLocalizableResourcesByIds"), arg);
        return this;
    }

    /**
    * A list of marketing activities associated with the marketing app.
    */

    public MarketingActivityConnection getMarketingActivities() {
        return (MarketingActivityConnection) get("marketingActivities");
    }

    public QueryRoot setMarketingActivities(MarketingActivityConnection arg) {
        optimisticData.put(getKey("marketingActivities"), arg);
        return this;
    }

    /**
    * Returns a MarketingActivity resource by ID.
    */

    public MarketingActivity getMarketingActivity() {
        return (MarketingActivity) get("marketingActivity");
    }

    public QueryRoot setMarketingActivity(MarketingActivity arg) {
        optimisticData.put(getKey("marketingActivity"), arg);
        return this;
    }

    /**
    * Returns a MarketingEvent resource by ID.
    */

    public MarketingEvent getMarketingEvent() {
        return (MarketingEvent) get("marketingEvent");
    }

    public QueryRoot setMarketingEvent(MarketingEvent arg) {
        optimisticData.put(getKey("marketingEvent"), arg);
        return this;
    }

    /**
    * A list of marketing events associated with the marketing app.
    */

    public MarketingEventConnection getMarketingEvents() {
        return (MarketingEventConnection) get("marketingEvents");
    }

    public QueryRoot setMarketingEvents(MarketingEventConnection arg) {
        optimisticData.put(getKey("marketingEvents"), arg);
        return this;
    }

    /**
    * The markets configured for the shop.
    */

    public MarketConnection getMarkets() {
        return (MarketConnection) get("markets");
    }

    public QueryRoot setMarkets(MarketConnection arg) {
        optimisticData.put(getKey("markets"), arg);
        return this;
    }

    /**
    * Returns a Menu resource by ID.
    */

    public Menu getMenu() {
        return (Menu) get("menu");
    }

    public QueryRoot setMenu(Menu arg) {
        optimisticData.put(getKey("menu"), arg);
        return this;
    }

    /**
    * The shop's menus.
    */

    public MenuConnection getMenus() {
        return (MenuConnection) get("menus");
    }

    public QueryRoot setMenus(MenuConnection arg) {
        optimisticData.put(getKey("menus"), arg);
        return this;
    }

    /**
    * Returns a metafield definition by identifier.
    */

    public MetafieldDefinition getMetafieldDefinition() {
        return (MetafieldDefinition) get("metafieldDefinition");
    }

    public QueryRoot setMetafieldDefinition(MetafieldDefinition arg) {
        optimisticData.put(getKey("metafieldDefinition"), arg);
        return this;
    }

    /**
    * Each metafield definition has a type, which defines the type of information that it can store.
    * This type is enforced across every instance of the resource that owns the metafield definition.
    * Refer to the [list of supported metafield types](https://shopify.dev/apps/metafields/types).
    */

    public List<MetafieldDefinitionType> getMetafieldDefinitionTypes() {
        return (List<MetafieldDefinitionType>) get("metafieldDefinitionTypes");
    }

    public QueryRoot setMetafieldDefinitionTypes(List<MetafieldDefinitionType> arg) {
        optimisticData.put(getKey("metafieldDefinitionTypes"), arg);
        return this;
    }

    /**
    * Returns a list of metafield definitions.
    */

    public MetafieldDefinitionConnection getMetafieldDefinitions() {
        return (MetafieldDefinitionConnection) get("metafieldDefinitions");
    }

    public QueryRoot setMetafieldDefinitions(MetafieldDefinitionConnection arg) {
        optimisticData.put(getKey("metafieldDefinitions"), arg);
        return this;
    }

    /**
    * Retrieves a metaobject by ID.
    */

    public Metaobject getMetaobject() {
        return (Metaobject) get("metaobject");
    }

    public QueryRoot setMetaobject(Metaobject arg) {
        optimisticData.put(getKey("metaobject"), arg);
        return this;
    }

    /**
    * Retrieves a metaobject by handle.
    */

    public Metaobject getMetaobjectByHandle() {
        return (Metaobject) get("metaobjectByHandle");
    }

    public QueryRoot setMetaobjectByHandle(Metaobject arg) {
        optimisticData.put(getKey("metaobjectByHandle"), arg);
        return this;
    }

    /**
    * Retrieves a metaobject definition by ID.
    */

    public MetaobjectDefinition getMetaobjectDefinition() {
        return (MetaobjectDefinition) get("metaobjectDefinition");
    }

    public QueryRoot setMetaobjectDefinition(MetaobjectDefinition arg) {
        optimisticData.put(getKey("metaobjectDefinition"), arg);
        return this;
    }

    /**
    * Finds a metaobject definition by type.
    */

    public MetaobjectDefinition getMetaobjectDefinitionByType() {
        return (MetaobjectDefinition) get("metaobjectDefinitionByType");
    }

    public QueryRoot setMetaobjectDefinitionByType(MetaobjectDefinition arg) {
        optimisticData.put(getKey("metaobjectDefinitionByType"), arg);
        return this;
    }

    /**
    * All metaobject definitions.
    */

    public MetaobjectDefinitionConnection getMetaobjectDefinitions() {
        return (MetaobjectDefinitionConnection) get("metaobjectDefinitions");
    }

    public QueryRoot setMetaobjectDefinitions(MetaobjectDefinitionConnection arg) {
        optimisticData.put(getKey("metaobjectDefinitions"), arg);
        return this;
    }

    /**
    * All metaobjects for the shop.
    */

    public MetaobjectConnection getMetaobjects() {
        return (MetaobjectConnection) get("metaobjects");
    }

    public QueryRoot setMetaobjects(MetaobjectConnection arg) {
        optimisticData.put(getKey("metaobjects"), arg);
        return this;
    }

    /**
    * Return a mobile platform application by its ID.
    */

    public MobilePlatformApplication getMobilePlatformApplication() {
        return (MobilePlatformApplication) get("mobilePlatformApplication");
    }

    public QueryRoot setMobilePlatformApplication(MobilePlatformApplication arg) {
        optimisticData.put(getKey("mobilePlatformApplication"), arg);
        return this;
    }

    /**
    * List the mobile platform applications.
    */

    public MobilePlatformApplicationConnection getMobilePlatformApplications() {
        return (MobilePlatformApplicationConnection) get("mobilePlatformApplications");
    }

    public QueryRoot setMobilePlatformApplications(MobilePlatformApplicationConnection arg) {
        optimisticData.put(getKey("mobilePlatformApplications"), arg);
        return this;
    }

    /**
    * Returns a specific node (any object that implements the
    * [Node](https://shopify.dev/api/admin-graphql/latest/interfaces/Node)
    * interface) by ID, in accordance with the
    * [Relay
    * specification](https://relay.dev/docs/guides/graphql-server-specification/#object-identification).
    * This field is commonly used for refetching an object.
    */

    public Node getNode() {
        return (Node) get("node");
    }

    public QueryRoot setNode(Node arg) {
        optimisticData.put(getKey("node"), arg);
        return this;
    }

    /**
    * Returns the list of nodes (any objects that implement the
    * [Node](https://shopify.dev/api/admin-graphql/latest/interfaces/Node)
    * interface) with the given IDs, in accordance with the
    * [Relay
    * specification](https://relay.dev/docs/guides/graphql-server-specification/#object-identification).
    */

    public List<Node> getNodes() {
        return (List<Node>) get("nodes");
    }

    public QueryRoot setNodes(List<Node> arg) {
        optimisticData.put(getKey("nodes"), arg);
        return this;
    }

    /**
    * The shop's online store channel.
    */

    public OnlineStore getOnlineStore() {
        return (OnlineStore) get("onlineStore");
    }

    public QueryRoot setOnlineStore(OnlineStore arg) {
        optimisticData.put(getKey("onlineStore"), arg);
        return this;
    }

    /**
    * Returns an Order resource by ID.
    */

    public Order getOrder() {
        return (Order) get("order");
    }

    public QueryRoot setOrder(Order arg) {
        optimisticData.put(getKey("order"), arg);
        return this;
    }

    /**
    * Returns a payment status by payment reference ID. Used to check the status of a deferred payment.
    */

    public OrderPaymentStatus getOrderPaymentStatus() {
        return (OrderPaymentStatus) get("orderPaymentStatus");
    }

    public QueryRoot setOrderPaymentStatus(OrderPaymentStatus arg) {
        optimisticData.put(getKey("orderPaymentStatus"), arg);
        return this;
    }

    /**
    * List of the shop's order saved searches.
    */

    public SavedSearchConnection getOrderSavedSearches() {
        return (SavedSearchConnection) get("orderSavedSearches");
    }

    public QueryRoot setOrderSavedSearches(SavedSearchConnection arg) {
        optimisticData.put(getKey("orderSavedSearches"), arg);
        return this;
    }

    /**
    * Returns a list of orders placed in the store.
    */

    public OrderConnection getOrders() {
        return (OrderConnection) get("orders");
    }

    public QueryRoot setOrders(OrderConnection arg) {
        optimisticData.put(getKey("orders"), arg);
        return this;
    }

    /**
    * Returns the count of orders for the given shop. Limited to a maximum of 10000.
    */

    public Count getOrdersCount() {
        return (Count) get("ordersCount");
    }

    public QueryRoot setOrdersCount(Count arg) {
        optimisticData.put(getKey("ordersCount"), arg);
        return this;
    }

    /**
    * Returns a Page resource by ID.
    */

    public Page getPage() {
        return (Page) get("page");
    }

    public QueryRoot setPage(Page arg) {
        optimisticData.put(getKey("page"), arg);
        return this;
    }

    /**
    * List of the shop's pages.
    */

    public PageConnection getPages() {
        return (PageConnection) get("pages");
    }

    public QueryRoot setPages(PageConnection arg) {
        optimisticData.put(getKey("pages"), arg);
        return this;
    }

    /**
    * Count of pages.
    */

    public Count getPagesCount() {
        return (Count) get("pagesCount");
    }

    public QueryRoot setPagesCount(Count arg) {
        optimisticData.put(getKey("pagesCount"), arg);
        return this;
    }

    /**
    * The payment customization.
    */

    public PaymentCustomization getPaymentCustomization() {
        return (PaymentCustomization) get("paymentCustomization");
    }

    public QueryRoot setPaymentCustomization(PaymentCustomization arg) {
        optimisticData.put(getKey("paymentCustomization"), arg);
        return this;
    }

    /**
    * The payment customizations.
    */

    public PaymentCustomizationConnection getPaymentCustomizations() {
        return (PaymentCustomizationConnection) get("paymentCustomizations");
    }

    public QueryRoot setPaymentCustomizations(PaymentCustomizationConnection arg) {
        optimisticData.put(getKey("paymentCustomizations"), arg);
        return this;
    }

    /**
    * The list of payment terms templates eligible for all shops and users.
    */

    public List<PaymentTermsTemplate> getPaymentTermsTemplates() {
        return (List<PaymentTermsTemplate>) get("paymentTermsTemplates");
    }

    public QueryRoot setPaymentTermsTemplates(List<PaymentTermsTemplate> arg) {
        optimisticData.put(getKey("paymentTermsTemplates"), arg);
        return this;
    }

    /**
    * The number of pendings orders. Limited to a maximum of 10000.
    */

    public Count getPendingOrdersCount() {
        return (Count) get("pendingOrdersCount");
    }

    public QueryRoot setPendingOrdersCount(Count arg) {
        optimisticData.put(getKey("pendingOrdersCount"), arg);
        return this;
    }

    /**
    * Returns a price list resource by ID.
    */

    public PriceList getPriceList() {
        return (PriceList) get("priceList");
    }

    public QueryRoot setPriceList(PriceList arg) {
        optimisticData.put(getKey("priceList"), arg);
        return this;
    }

    /**
    * All price lists for a shop.
    */

    public PriceListConnection getPriceLists() {
        return (PriceListConnection) get("priceLists");
    }

    public QueryRoot setPriceLists(PriceListConnection arg) {
        optimisticData.put(getKey("priceLists"), arg);
        return this;
    }

    /**
    * Returns a Product resource by ID.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public QueryRoot setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
    * Return a product by an identifier.
    */

    public Product getProductByIdentifier() {
        return (Product) get("productByIdentifier");
    }

    public QueryRoot setProductByIdentifier(Product arg) {
        optimisticData.put(getKey("productByIdentifier"), arg);
        return this;
    }

    /**
    * Returns the product duplicate job.
    */

    public ProductDuplicateJob getProductDuplicateJob() {
        return (ProductDuplicateJob) get("productDuplicateJob");
    }

    public QueryRoot setProductDuplicateJob(ProductDuplicateJob arg) {
        optimisticData.put(getKey("productDuplicateJob"), arg);
        return this;
    }

    /**
    * Returns a ProductFeed resource by ID.
    */

    public ProductFeed getProductFeed() {
        return (ProductFeed) get("productFeed");
    }

    public QueryRoot setProductFeed(ProductFeed arg) {
        optimisticData.put(getKey("productFeed"), arg);
        return this;
    }

    /**
    * The product feeds for the shop.
    */

    public ProductFeedConnection getProductFeeds() {
        return (ProductFeedConnection) get("productFeeds");
    }

    public QueryRoot setProductFeeds(ProductFeedConnection arg) {
        optimisticData.put(getKey("productFeeds"), arg);
        return this;
    }

    /**
    * Returns a ProductOperation resource by ID.
    * This can be used to query the
    * [ProductSetOperation](https://shopify.dev/api/admin-graphql/current/objects/ProductSetOperation),
    * using
    * the ID that was returned
    * [when the product was created or
    * updated](https://shopify.dev/api/admin/migrate/new-product-model/sync-data#create-a-product-with-var
    * iants-and-options-asynchronously)
    * by the
    * [ProductSet](https://shopify.dev/api/admin-graphql/current/mutations/productSet) mutation.
    * The `status` field indicates whether the operation is `CREATED`, `ACTIVE`, or `COMPLETE`.
    * The `product` field provides the details of the created or updated product.
    * For the
    * [ProductSetOperation](https://shopify.dev/api/admin-graphql/current/objects/ProductSetOperation),
    * the
    * `userErrors` field provides mutation errors that occurred during the operation.
    */

    public ProductOperation getProductOperation() {
        return (ProductOperation) get("productOperation");
    }

    public QueryRoot setProductOperation(ProductOperation arg) {
        optimisticData.put(getKey("productOperation"), arg);
        return this;
    }

    /**
    * Returns the product resource feedback for the currently authenticated app.
    */

    public ProductResourceFeedback getProductResourceFeedback() {
        return (ProductResourceFeedback) get("productResourceFeedback");
    }

    public QueryRoot setProductResourceFeedback(ProductResourceFeedback arg) {
        optimisticData.put(getKey("productResourceFeedback"), arg);
        return this;
    }

    /**
    * Returns a list of the shop's product saved searches.
    */

    public SavedSearchConnection getProductSavedSearches() {
        return (SavedSearchConnection) get("productSavedSearches");
    }

    public QueryRoot setProductSavedSearches(SavedSearchConnection arg) {
        optimisticData.put(getKey("productSavedSearches"), arg);
        return this;
    }

    /**
    * A list of tags that have been added to products.
    * The maximum page size is 5000.
    */

    public StringConnection getProductTags() {
        return (StringConnection) get("productTags");
    }

    public QueryRoot setProductTags(StringConnection arg) {
        optimisticData.put(getKey("productTags"), arg);
        return this;
    }

    /**
    * The list of types added to products.
    * The maximum page size is 1000.
    */

    public StringConnection getProductTypes() {
        return (StringConnection) get("productTypes");
    }

    public QueryRoot setProductTypes(StringConnection arg) {
        optimisticData.put(getKey("productTypes"), arg);
        return this;
    }

    /**
    * Returns a ProductVariant resource by ID.
    */

    public ProductVariant getProductVariant() {
        return (ProductVariant) get("productVariant");
    }

    public QueryRoot setProductVariant(ProductVariant arg) {
        optimisticData.put(getKey("productVariant"), arg);
        return this;
    }

    /**
    * Returns a list of product variants.
    */

    public ProductVariantConnection getProductVariants() {
        return (ProductVariantConnection) get("productVariants");
    }

    public QueryRoot setProductVariants(ProductVariantConnection arg) {
        optimisticData.put(getKey("productVariants"), arg);
        return this;
    }

    /**
    * Count of product variants.
    */

    public Count getProductVariantsCount() {
        return (Count) get("productVariantsCount");
    }

    public QueryRoot setProductVariantsCount(Count arg) {
        optimisticData.put(getKey("productVariantsCount"), arg);
        return this;
    }

    /**
    * The list of vendors added to products.
    * The maximum page size is 1000.
    */

    public StringConnection getProductVendors() {
        return (StringConnection) get("productVendors");
    }

    public QueryRoot setProductVendors(StringConnection arg) {
        optimisticData.put(getKey("productVendors"), arg);
        return this;
    }

    /**
    * Returns a list of products.
    */

    public ProductConnection getProducts() {
        return (ProductConnection) get("products");
    }

    public QueryRoot setProducts(ProductConnection arg) {
        optimisticData.put(getKey("products"), arg);
        return this;
    }

    /**
    * Count of products.
    */

    public Count getProductsCount() {
        return (Count) get("productsCount");
    }

    public QueryRoot setProductsCount(Count arg) {
        optimisticData.put(getKey("productsCount"), arg);
        return this;
    }

    /**
    * The list of publicly-accessible Admin API versions, including supported versions, the release
    * candidate, and unstable versions.
    */

    public List<ApiVersion> getPublicApiVersions() {
        return (List<ApiVersion>) get("publicApiVersions");
    }

    public QueryRoot setPublicApiVersions(List<ApiVersion> arg) {
        optimisticData.put(getKey("publicApiVersions"), arg);
        return this;
    }

    /**
    * Lookup a publication by ID.
    */

    public Publication getPublication() {
        return (Publication) get("publication");
    }

    public QueryRoot setPublication(Publication arg) {
        optimisticData.put(getKey("publication"), arg);
        return this;
    }

    /**
    * List of publications.
    */

    public PublicationConnection getPublications() {
        return (PublicationConnection) get("publications");
    }

    public QueryRoot setPublications(PublicationConnection arg) {
        optimisticData.put(getKey("publications"), arg);
        return this;
    }

    /**
    * Count of publications.
    */

    public Count getPublicationsCount() {
        return (Count) get("publicationsCount");
    }

    public QueryRoot setPublicationsCount(Count arg) {
        optimisticData.put(getKey("publicationsCount"), arg);
        return this;
    }

    /**
    * Returns a count of published products by publication ID.
    */

    public Count getPublishedProductsCount() {
        return (Count) get("publishedProductsCount");
    }

    public QueryRoot setPublishedProductsCount(Count arg) {
        optimisticData.put(getKey("publishedProductsCount"), arg);
        return this;
    }

    /**
    * Returns a Refund resource by ID.
    */

    public Refund getRefund() {
        return (Refund) get("refund");
    }

    public QueryRoot setRefund(Refund arg) {
        optimisticData.put(getKey("refund"), arg);
        return this;
    }

    /**
    * Returns a Return resource by ID.
    */

    public Return getReturn() {
        return (Return) get("return");
    }

    public QueryRoot setReturn(Return arg) {
        optimisticData.put(getKey("return"), arg);
        return this;
    }

    /**
    * The calculated monetary value to be exchanged due to the return.
    */

    public CalculatedReturn getReturnCalculate() {
        return (CalculatedReturn) get("returnCalculate");
    }

    public QueryRoot setReturnCalculate(CalculatedReturn arg) {
        optimisticData.put(getKey("returnCalculate"), arg);
        return this;
    }

    /**
    * Lookup a returnable fulfillment by ID.
    */

    public ReturnableFulfillment getReturnableFulfillment() {
        return (ReturnableFulfillment) get("returnableFulfillment");
    }

    public QueryRoot setReturnableFulfillment(ReturnableFulfillment arg) {
        optimisticData.put(getKey("returnableFulfillment"), arg);
        return this;
    }

    /**
    * List of returnable fulfillments.
    */

    public ReturnableFulfillmentConnection getReturnableFulfillments() {
        return (ReturnableFulfillmentConnection) get("returnableFulfillments");
    }

    public QueryRoot setReturnableFulfillments(ReturnableFulfillmentConnection arg) {
        optimisticData.put(getKey("returnableFulfillments"), arg);
        return this;
    }

    /**
    * Lookup a reverse delivery by ID.
    */

    public ReverseDelivery getReverseDelivery() {
        return (ReverseDelivery) get("reverseDelivery");
    }

    public QueryRoot setReverseDelivery(ReverseDelivery arg) {
        optimisticData.put(getKey("reverseDelivery"), arg);
        return this;
    }

    /**
    * Lookup a reverse fulfillment order by ID.
    */

    public ReverseFulfillmentOrder getReverseFulfillmentOrder() {
        return (ReverseFulfillmentOrder) get("reverseFulfillmentOrder");
    }

    public QueryRoot setReverseFulfillmentOrder(ReverseFulfillmentOrder arg) {
        optimisticData.put(getKey("reverseFulfillmentOrder"), arg);
        return this;
    }

    /**
    * <div class="note"><h4>Theme app extensions</h4>
    * <p>Your app might not pass App Store review if it uses script tags instead of theme app extensions.
    * All new apps, and apps that integrate with Online Store 2.0 themes, should use theme app extensions,
    * such as app blocks or app embed blocks. Script tags are an alternative you can use with only vintage
    * themes. <a href="/apps/online-store#what-integration-method-should-i-use" target="_blank">Learn
    * more</a>.</p></div>
    * <div class="note"><h4>Script tag deprecation</h4>
    * <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a
    * href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade to Checkout
    * Extensibility</a> before this date. <a href="/docs/api/liquid/objects#script">Shopify Scripts</a>
    * will continue to work alongside Checkout Extensibility until August 28, 2025.</p></div>
    * Lookup a script tag resource by ID.
    */

    public ScriptTag getScriptTag() {
        return (ScriptTag) get("scriptTag");
    }

    public QueryRoot setScriptTag(ScriptTag arg) {
        optimisticData.put(getKey("scriptTag"), arg);
        return this;
    }

    /**
    * <div class="note"><h4>Theme app extensions</h4>
    * <p>Your app might not pass App Store review if it uses script tags instead of theme app extensions.
    * All new apps, and apps that integrate with Online Store 2.0 themes, should use theme app extensions,
    * such as app blocks or app embed blocks. Script tags are an alternative you can use with only vintage
    * themes. <a href="/apps/online-store#what-integration-method-should-i-use" target="_blank">Learn
    * more</a>.</p></div>
    * <div class="note"><h4>Script tag deprecation</h4>
    * <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a
    * href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade to Checkout
    * Extensibility</a> before this date. <a href="/docs/api/liquid/objects#script">Shopify Scripts</a>
    * will continue to work alongside Checkout Extensibility until August 28, 2025.</p></div>
    * A list of script tags.
    */

    public ScriptTagConnection getScriptTags() {
        return (ScriptTagConnection) get("scriptTags");
    }

    public QueryRoot setScriptTags(ScriptTagConnection arg) {
        optimisticData.put(getKey("scriptTags"), arg);
        return this;
    }

    /**
    * The Customer Segment.
    */

    public Segment getSegment() {
        return (Segment) get("segment");
    }

    public QueryRoot setSegment(Segment arg) {
        optimisticData.put(getKey("segment"), arg);
        return this;
    }

    /**
    * A list of filter suggestions associated with a segment. A segment is a group of members (commonly
    * customers) that meet specific criteria.
    */

    public SegmentFilterConnection getSegmentFilterSuggestions() {
        return (SegmentFilterConnection) get("segmentFilterSuggestions");
    }

    public QueryRoot setSegmentFilterSuggestions(SegmentFilterConnection arg) {
        optimisticData.put(getKey("segmentFilterSuggestions"), arg);
        return this;
    }

    /**
    * A list of filters.
    */

    public SegmentFilterConnection getSegmentFilters() {
        return (SegmentFilterConnection) get("segmentFilters");
    }

    public QueryRoot setSegmentFilters(SegmentFilterConnection arg) {
        optimisticData.put(getKey("segmentFilters"), arg);
        return this;
    }

    /**
    * A list of a shop's segment migrations.
    */

    public SegmentMigrationConnection getSegmentMigrations() {
        return (SegmentMigrationConnection) get("segmentMigrations");
    }

    public QueryRoot setSegmentMigrations(SegmentMigrationConnection arg) {
        optimisticData.put(getKey("segmentMigrations"), arg);
        return this;
    }

    /**
    * The list of suggested values corresponding to a particular filter for a segment. A segment is a
    * group of members, such as customers, that meet specific criteria.
    */

    public SegmentValueConnection getSegmentValueSuggestions() {
        return (SegmentValueConnection) get("segmentValueSuggestions");
    }

    public QueryRoot setSegmentValueSuggestions(SegmentValueConnection arg) {
        optimisticData.put(getKey("segmentValueSuggestions"), arg);
        return this;
    }

    /**
    * A list of a shop's segments.
    */

    public SegmentConnection getSegments() {
        return (SegmentConnection) get("segments");
    }

    public QueryRoot setSegments(SegmentConnection arg) {
        optimisticData.put(getKey("segments"), arg);
        return this;
    }

    /**
    * The number of segments for a shop.
    */

    public Count getSegmentsCount() {
        return (Count) get("segmentsCount");
    }

    public QueryRoot setSegmentsCount(Count arg) {
        optimisticData.put(getKey("segmentsCount"), arg);
        return this;
    }

    /**
    * Returns a Selling Plan Group resource by ID.
    */

    public SellingPlanGroup getSellingPlanGroup() {
        return (SellingPlanGroup) get("sellingPlanGroup");
    }

    public QueryRoot setSellingPlanGroup(SellingPlanGroup arg) {
        optimisticData.put(getKey("sellingPlanGroup"), arg);
        return this;
    }

    /**
    * List Selling Plan Groups.
    */

    public SellingPlanGroupConnection getSellingPlanGroups() {
        return (SellingPlanGroupConnection) get("sellingPlanGroups");
    }

    public QueryRoot setSellingPlanGroups(SellingPlanGroupConnection arg) {
        optimisticData.put(getKey("sellingPlanGroups"), arg);
        return this;
    }

    /**
    * The server pixel configured by the app.
    */

    public ServerPixel getServerPixel() {
        return (ServerPixel) get("serverPixel");
    }

    public QueryRoot setServerPixel(ServerPixel arg) {
        optimisticData.put(getKey("serverPixel"), arg);
        return this;
    }

    /**
    * Returns the Shop resource corresponding to the access token used in the request. The Shop resource
    * contains
    * business and store management settings for the shop.
    */

    public Shop getShop() {
        return (Shop) get("shop");
    }

    public QueryRoot setShop(Shop arg) {
        optimisticData.put(getKey("shop"), arg);
        return this;
    }

    /**
    * The shop's billing preferences.
    */

    public ShopBillingPreferences getShopBillingPreferences() {
        return (ShopBillingPreferences) get("shopBillingPreferences");
    }

    public QueryRoot setShopBillingPreferences(ShopBillingPreferences arg) {
        optimisticData.put(getKey("shopBillingPreferences"), arg);
        return this;
    }

    /**
    * A list of locales available on a shop.
    */

    public List<ShopLocale> getShopLocales() {
        return (List<ShopLocale>) get("shopLocales");
    }

    public QueryRoot setShopLocales(List<ShopLocale> arg) {
        optimisticData.put(getKey("shopLocales"), arg);
        return this;
    }

    /**
    * Returns a Shopify Function by its ID.
    * [Functions](https://shopify.dev/apps/build/functions)
    * enable you to customize Shopify's backend logic at defined parts of the commerce loop.
    */

    public ShopifyFunction getShopifyFunction() {
        return (ShopifyFunction) get("shopifyFunction");
    }

    public QueryRoot setShopifyFunction(ShopifyFunction arg) {
        optimisticData.put(getKey("shopifyFunction"), arg);
        return this;
    }

    /**
    * Returns the Shopify Functions owned by the querying API client installed on the shop.
    */

    public ShopifyFunctionConnection getShopifyFunctions() {
        return (ShopifyFunctionConnection) get("shopifyFunctions");
    }

    public QueryRoot setShopifyFunctions(ShopifyFunctionConnection arg) {
        optimisticData.put(getKey("shopifyFunctions"), arg);
        return this;
    }

    /**
    * Shopify Payments account information, including balances and payouts.
    */

    public ShopifyPaymentsAccount getShopifyPaymentsAccount() {
        return (ShopifyPaymentsAccount) get("shopifyPaymentsAccount");
    }

    public QueryRoot setShopifyPaymentsAccount(ShopifyPaymentsAccount arg) {
        optimisticData.put(getKey("shopifyPaymentsAccount"), arg);
        return this;
    }

    /**
    * The StaffMember resource, by ID.
    */

    public StaffMember getStaffMember() {
        return (StaffMember) get("staffMember");
    }

    public QueryRoot setStaffMember(StaffMember arg) {
        optimisticData.put(getKey("staffMember"), arg);
        return this;
    }

    /**
    * The shop staff members.
    */

    public StaffMemberConnection getStaffMembers() {
        return (StaffMemberConnection) get("staffMembers");
    }

    public QueryRoot setStaffMembers(StaffMemberConnection arg) {
        optimisticData.put(getKey("staffMembers"), arg);
        return this;
    }

    /**
    * Standard metafield definitions are intended for specific, common use cases. Their namespace and keys
    * reflect these use cases and are reserved.
    * Refer to all available [`Standard Metafield Definition
    * Templates`](https://shopify.dev/api/admin-graphql/latest/objects/StandardMetafieldDefinitionTemplate
    * ).
    */

    public StandardMetafieldDefinitionTemplateConnection getStandardMetafieldDefinitionTemplates() {
        return (StandardMetafieldDefinitionTemplateConnection) get("standardMetafieldDefinitionTemplates");
    }

    public QueryRoot setStandardMetafieldDefinitionTemplates(StandardMetafieldDefinitionTemplateConnection arg) {
        optimisticData.put(getKey("standardMetafieldDefinitionTemplates"), arg);
        return this;
    }

    /**
    * Returns a store credit account resource by ID.
    */

    public StoreCreditAccount getStoreCreditAccount() {
        return (StoreCreditAccount) get("storeCreditAccount");
    }

    public QueryRoot setStoreCreditAccount(StoreCreditAccount arg) {
        optimisticData.put(getKey("storeCreditAccount"), arg);
        return this;
    }

    /**
    * Returns a SubscriptionBillingAttempt by ID.
    */

    public SubscriptionBillingAttempt getSubscriptionBillingAttempt() {
        return (SubscriptionBillingAttempt) get("subscriptionBillingAttempt");
    }

    public QueryRoot setSubscriptionBillingAttempt(SubscriptionBillingAttempt arg) {
        optimisticData.put(getKey("subscriptionBillingAttempt"), arg);
        return this;
    }

    /**
    * Returns subscription billing attempts on a store.
    */

    public SubscriptionBillingAttemptConnection getSubscriptionBillingAttempts() {
        return (SubscriptionBillingAttemptConnection) get("subscriptionBillingAttempts");
    }

    public QueryRoot setSubscriptionBillingAttempts(SubscriptionBillingAttemptConnection arg) {
        optimisticData.put(getKey("subscriptionBillingAttempts"), arg);
        return this;
    }

    /**
    * Returns a subscription billing cycle found either by cycle index or date.
    */

    public SubscriptionBillingCycle getSubscriptionBillingCycle() {
        return (SubscriptionBillingCycle) get("subscriptionBillingCycle");
    }

    public QueryRoot setSubscriptionBillingCycle(SubscriptionBillingCycle arg) {
        optimisticData.put(getKey("subscriptionBillingCycle"), arg);
        return this;
    }

    /**
    * Retrieves the results of the asynchronous job for the subscription billing cycle bulk action based
    * on the specified job ID.
    * This query can be used to obtain the billing cycles that match the criteria defined in the
    * subscriptionBillingCycleBulkSearch and subscriptionBillingCycleBulkCharge mutations.
    */

    public SubscriptionBillingCycleConnection getSubscriptionBillingCycleBulkResults() {
        return (SubscriptionBillingCycleConnection) get("subscriptionBillingCycleBulkResults");
    }

    public QueryRoot setSubscriptionBillingCycleBulkResults(SubscriptionBillingCycleConnection arg) {
        optimisticData.put(getKey("subscriptionBillingCycleBulkResults"), arg);
        return this;
    }

    /**
    * Returns subscription billing cycles for a contract ID.
    */

    public SubscriptionBillingCycleConnection getSubscriptionBillingCycles() {
        return (SubscriptionBillingCycleConnection) get("subscriptionBillingCycles");
    }

    public QueryRoot setSubscriptionBillingCycles(SubscriptionBillingCycleConnection arg) {
        optimisticData.put(getKey("subscriptionBillingCycles"), arg);
        return this;
    }

    /**
    * Returns a Subscription Contract resource by ID.
    */

    public SubscriptionContract getSubscriptionContract() {
        return (SubscriptionContract) get("subscriptionContract");
    }

    public QueryRoot setSubscriptionContract(SubscriptionContract arg) {
        optimisticData.put(getKey("subscriptionContract"), arg);
        return this;
    }

    /**
    * List Subscription Contracts.
    */

    public SubscriptionContractConnection getSubscriptionContracts() {
        return (SubscriptionContractConnection) get("subscriptionContracts");
    }

    public QueryRoot setSubscriptionContracts(SubscriptionContractConnection arg) {
        optimisticData.put(getKey("subscriptionContracts"), arg);
        return this;
    }

    /**
    * Returns a Subscription Draft resource by ID.
    */

    public SubscriptionDraft getSubscriptionDraft() {
        return (SubscriptionDraft) get("subscriptionDraft");
    }

    public QueryRoot setSubscriptionDraft(SubscriptionDraft arg) {
        optimisticData.put(getKey("subscriptionDraft"), arg);
        return this;
    }

    /**
    * The Taxonomy resource lets you access the categories, attributes and values of the loaded taxonomy
    * tree.
    */

    public Taxonomy getTaxonomy() {
        return (Taxonomy) get("taxonomy");
    }

    public QueryRoot setTaxonomy(Taxonomy arg) {
        optimisticData.put(getKey("taxonomy"), arg);
        return this;
    }

    /**
    * Returns a list of TenderTransactions associated with the shop.
    */

    public TenderTransactionConnection getTenderTransactions() {
        return (TenderTransactionConnection) get("tenderTransactions");
    }

    public QueryRoot setTenderTransactions(TenderTransactionConnection arg) {
        optimisticData.put(getKey("tenderTransactions"), arg);
        return this;
    }

    /**
    * Returns a particular theme for the shop.
    */

    public OnlineStoreTheme getTheme() {
        return (OnlineStoreTheme) get("theme");
    }

    public QueryRoot setTheme(OnlineStoreTheme arg) {
        optimisticData.put(getKey("theme"), arg);
        return this;
    }

    /**
    * Returns a paginated list of themes for the shop.
    */

    public OnlineStoreThemeConnection getThemes() {
        return (OnlineStoreThemeConnection) get("themes");
    }

    public QueryRoot setThemes(OnlineStoreThemeConnection arg) {
        optimisticData.put(getKey("themes"), arg);
        return this;
    }

    /**
    * A resource that can have localized values for different languages.
    */

    public TranslatableResource getTranslatableResource() {
        return (TranslatableResource) get("translatableResource");
    }

    public QueryRoot setTranslatableResource(TranslatableResource arg) {
        optimisticData.put(getKey("translatableResource"), arg);
        return this;
    }

    /**
    * Resources that can have localized values for different languages.
    */

    public TranslatableResourceConnection getTranslatableResources() {
        return (TranslatableResourceConnection) get("translatableResources");
    }

    public QueryRoot setTranslatableResources(TranslatableResourceConnection arg) {
        optimisticData.put(getKey("translatableResources"), arg);
        return this;
    }

    /**
    * Resources that can have localized values for different languages.
    */

    public TranslatableResourceConnection getTranslatableResourcesByIds() {
        return (TranslatableResourceConnection) get("translatableResourcesByIds");
    }

    public QueryRoot setTranslatableResourcesByIds(TranslatableResourceConnection arg) {
        optimisticData.put(getKey("translatableResourcesByIds"), arg);
        return this;
    }

    /**
    * Returns a redirect resource by ID.
    */

    public UrlRedirect getUrlRedirect() {
        return (UrlRedirect) get("urlRedirect");
    }

    public QueryRoot setUrlRedirect(UrlRedirect arg) {
        optimisticData.put(getKey("urlRedirect"), arg);
        return this;
    }

    /**
    * Returns a redirect import resource by ID.
    */

    public UrlRedirectImport getUrlRedirectImport() {
        return (UrlRedirectImport) get("urlRedirectImport");
    }

    public QueryRoot setUrlRedirectImport(UrlRedirectImport arg) {
        optimisticData.put(getKey("urlRedirectImport"), arg);
        return this;
    }

    /**
    * A list of the shop's URL redirect saved searches.
    */

    public SavedSearchConnection getUrlRedirectSavedSearches() {
        return (SavedSearchConnection) get("urlRedirectSavedSearches");
    }

    public QueryRoot setUrlRedirectSavedSearches(SavedSearchConnection arg) {
        optimisticData.put(getKey("urlRedirectSavedSearches"), arg);
        return this;
    }

    /**
    * A list of redirects for a shop.
    */

    public UrlRedirectConnection getUrlRedirects() {
        return (UrlRedirectConnection) get("urlRedirects");
    }

    public QueryRoot setUrlRedirects(UrlRedirectConnection arg) {
        optimisticData.put(getKey("urlRedirects"), arg);
        return this;
    }

    /**
    * Count of redirects. Limited to a maximum of 10000.
    */

    public Count getUrlRedirectsCount() {
        return (Count) get("urlRedirectsCount");
    }

    public QueryRoot setUrlRedirectsCount(Count arg) {
        optimisticData.put(getKey("urlRedirectsCount"), arg);
        return this;
    }

    /**
    * Validation available on the shop.
    */

    public Validation getValidation() {
        return (Validation) get("validation");
    }

    public QueryRoot setValidation(Validation arg) {
        optimisticData.put(getKey("validation"), arg);
        return this;
    }

    /**
    * Validations available on the shop.
    */

    public ValidationConnection getValidations() {
        return (ValidationConnection) get("validations");
    }

    public QueryRoot setValidations(ValidationConnection arg) {
        optimisticData.put(getKey("validations"), arg);
        return this;
    }

    /**
    * Returns a
    * [web pixel](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels)
    * by ID.
    */

    public WebPixel getWebPixel() {
        return (WebPixel) get("webPixel");
    }

    public QueryRoot setWebPixel(WebPixel arg) {
        optimisticData.put(getKey("webPixel"), arg);
        return this;
    }

    /**
    * Returns a webhook subscription by ID.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
    */

    public WebhookSubscription getWebhookSubscription() {
        return (WebhookSubscription) get("webhookSubscription");
    }

    public QueryRoot setWebhookSubscription(WebhookSubscription arg) {
        optimisticData.put(getKey("webhookSubscription"), arg);
        return this;
    }

    /**
    * Returns a list of webhook subscriptions.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
    */

    public WebhookSubscriptionConnection getWebhookSubscriptions() {
        return (WebhookSubscriptionConnection) get("webhookSubscriptions");
    }

    public QueryRoot setWebhookSubscriptions(WebhookSubscriptionConnection arg) {
        optimisticData.put(getKey("webhookSubscriptions"), arg);
        return this;
    }

    /**
    * The count of webhook subscriptions.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe). Limited to a maximum of
    * 10000.
    */

    public Count getWebhookSubscriptionsCount() {
        return (Count) get("webhookSubscriptionsCount");
    }

    public QueryRoot setWebhookSubscriptionsCount(Count arg) {
        optimisticData.put(getKey("webhookSubscriptionsCount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "abandonedCheckouts": return true;

            case "abandonedCheckoutsCount": return true;

            case "abandonment": return true;

            case "abandonmentByAbandonedCheckoutId": return true;

            case "app": return true;

            case "appByHandle": return true;

            case "appByKey": return true;

            case "appDiscountType": return true;

            case "appDiscountTypes": return true;

            case "appInstallation": return true;

            case "appInstallations": return true;

            case "article": return true;

            case "articleTags": return false;

            case "articles": return true;

            case "assignedFulfillmentOrders": return true;

            case "automaticDiscountNode": return true;

            case "automaticDiscountNodes": return true;

            case "automaticDiscountSavedSearches": return true;

            case "availableCarrierServices": return true;

            case "availableLocales": return true;

            case "blog": return true;

            case "blogs": return true;

            case "blogsCount": return true;

            case "businessEntities": return true;

            case "businessEntity": return true;

            case "carrierService": return true;

            case "carrierServices": return true;

            case "cartTransforms": return true;

            case "cashTrackingSession": return true;

            case "cashTrackingSessions": return true;

            case "catalog": return false;

            case "catalogOperations": return false;

            case "catalogs": return true;

            case "catalogsCount": return true;

            case "checkoutBranding": return true;

            case "checkoutProfile": return true;

            case "checkoutProfiles": return true;

            case "codeDiscountNode": return true;

            case "codeDiscountNodeByCode": return true;

            case "codeDiscountNodes": return true;

            case "codeDiscountSavedSearches": return true;

            case "collection": return true;

            case "collectionRulesConditions": return true;

            case "collectionSavedSearches": return true;

            case "collections": return true;

            case "collectionsCount": return true;

            case "comment": return true;

            case "comments": return true;

            case "companies": return true;

            case "companiesCount": return true;

            case "company": return true;

            case "companyContact": return true;

            case "companyContactRole": return true;

            case "companyLocation": return true;

            case "companyLocations": return true;

            case "currentAppInstallation": return true;

            case "currentBulkOperation": return true;

            case "currentStaffMember": return true;

            case "customer": return true;

            case "customerAccountPage": return false;

            case "customerAccountPages": return true;

            case "customerByIdentifier": return true;

            case "customerMergeJobStatus": return true;

            case "customerMergePreview": return true;

            case "customerPaymentMethod": return true;

            case "customerSavedSearches": return true;

            case "customerSegmentMembers": return true;

            case "customerSegmentMembersQuery": return true;

            case "customerSegmentMembership": return true;

            case "customers": return true;

            case "customersCount": return true;

            case "deliveryCustomization": return true;

            case "deliveryCustomizations": return true;

            case "deliveryProfile": return true;

            case "deliveryProfiles": return true;

            case "deliveryPromiseParticipants": return true;

            case "deliveryPromiseProvider": return true;

            case "deliveryPromiseSettings": return true;

            case "deliverySettings": return true;

            case "discountCodesCount": return true;

            case "discountNode": return true;

            case "discountNodes": return true;

            case "discountNodesCount": return true;

            case "discountRedeemCodeBulkCreation": return true;

            case "discountRedeemCodeSavedSearches": return true;

            case "dispute": return true;

            case "disputeEvidence": return true;

            case "disputes": return true;

            case "domain": return true;

            case "draftOrder": return true;

            case "draftOrderSavedSearches": return true;

            case "draftOrderTag": return true;

            case "draftOrders": return true;

            case "event": return false;

            case "events": return true;

            case "eventsCount": return true;

            case "fileSavedSearches": return true;

            case "files": return true;

            case "fulfillment": return true;

            case "fulfillmentConstraintRules": return true;

            case "fulfillmentOrder": return true;

            case "fulfillmentOrders": return true;

            case "fulfillmentService": return true;

            case "giftCard": return true;

            case "giftCards": return true;

            case "giftCardsCount": return true;

            case "inventoryItem": return true;

            case "inventoryItems": return true;

            case "inventoryLevel": return true;

            case "inventoryProperties": return true;

            case "job": return true;

            case "location": return true;

            case "locations": return true;

            case "locationsAvailableForDeliveryProfilesConnection": return true;

            case "locationsCount": return true;

            case "manualHoldsFulfillmentOrders": return true;

            case "market": return true;

            case "marketByGeography": return true;

            case "marketLocalizableResource": return true;

            case "marketLocalizableResources": return true;

            case "marketLocalizableResourcesByIds": return true;

            case "marketingActivities": return true;

            case "marketingActivity": return true;

            case "marketingEvent": return true;

            case "marketingEvents": return true;

            case "markets": return true;

            case "menu": return true;

            case "menus": return true;

            case "metafieldDefinition": return true;

            case "metafieldDefinitionTypes": return true;

            case "metafieldDefinitions": return true;

            case "metaobject": return true;

            case "metaobjectByHandle": return true;

            case "metaobjectDefinition": return true;

            case "metaobjectDefinitionByType": return true;

            case "metaobjectDefinitions": return true;

            case "metaobjects": return true;

            case "mobilePlatformApplication": return false;

            case "mobilePlatformApplications": return true;

            case "node": return false;

            case "nodes": return false;

            case "onlineStore": return true;

            case "order": return true;

            case "orderPaymentStatus": return true;

            case "orderSavedSearches": return true;

            case "orders": return true;

            case "ordersCount": return true;

            case "page": return true;

            case "pages": return true;

            case "pagesCount": return true;

            case "paymentCustomization": return true;

            case "paymentCustomizations": return true;

            case "paymentTermsTemplates": return true;

            case "pendingOrdersCount": return true;

            case "priceList": return true;

            case "priceLists": return true;

            case "product": return true;

            case "productByIdentifier": return true;

            case "productDuplicateJob": return true;

            case "productFeed": return true;

            case "productFeeds": return true;

            case "productOperation": return false;

            case "productResourceFeedback": return true;

            case "productSavedSearches": return true;

            case "productTags": return true;

            case "productTypes": return true;

            case "productVariant": return true;

            case "productVariants": return true;

            case "productVariantsCount": return true;

            case "productVendors": return true;

            case "products": return true;

            case "productsCount": return true;

            case "publicApiVersions": return true;

            case "publication": return true;

            case "publications": return true;

            case "publicationsCount": return true;

            case "publishedProductsCount": return true;

            case "refund": return true;

            case "return": return true;

            case "returnCalculate": return true;

            case "returnableFulfillment": return true;

            case "returnableFulfillments": return true;

            case "reverseDelivery": return true;

            case "reverseFulfillmentOrder": return true;

            case "scriptTag": return true;

            case "scriptTags": return true;

            case "segment": return true;

            case "segmentFilterSuggestions": return true;

            case "segmentFilters": return true;

            case "segmentMigrations": return true;

            case "segmentValueSuggestions": return true;

            case "segments": return true;

            case "segmentsCount": return true;

            case "sellingPlanGroup": return true;

            case "sellingPlanGroups": return true;

            case "serverPixel": return true;

            case "shop": return true;

            case "shopBillingPreferences": return true;

            case "shopLocales": return true;

            case "shopifyFunction": return true;

            case "shopifyFunctions": return true;

            case "shopifyPaymentsAccount": return true;

            case "staffMember": return true;

            case "staffMembers": return true;

            case "standardMetafieldDefinitionTemplates": return true;

            case "storeCreditAccount": return true;

            case "subscriptionBillingAttempt": return true;

            case "subscriptionBillingAttempts": return true;

            case "subscriptionBillingCycle": return true;

            case "subscriptionBillingCycleBulkResults": return true;

            case "subscriptionBillingCycles": return true;

            case "subscriptionContract": return true;

            case "subscriptionContracts": return true;

            case "subscriptionDraft": return true;

            case "taxonomy": return true;

            case "tenderTransactions": return true;

            case "theme": return true;

            case "themes": return true;

            case "translatableResource": return true;

            case "translatableResources": return true;

            case "translatableResourcesByIds": return true;

            case "urlRedirect": return true;

            case "urlRedirectImport": return true;

            case "urlRedirectSavedSearches": return true;

            case "urlRedirects": return true;

            case "urlRedirectsCount": return true;

            case "validation": return true;

            case "validations": return true;

            case "webPixel": return true;

            case "webhookSubscription": return true;

            case "webhookSubscriptions": return true;

            case "webhookSubscriptionsCount": return true;

            default: return false;
        }
    }
}

