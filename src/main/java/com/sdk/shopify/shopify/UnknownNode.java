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

import java.util.Map;

/**
* An object with an ID field to support global identification, in accordance with the
* [Relay specification](https://relay.dev/graphql/objectidentification.htm#sec-Node-Interface).
* This interface is used by the [node](https://shopify.dev/api/admin-graphql/unstable/queries/node)
* and [nodes](https://shopify.dev/api/admin-graphql/unstable/queries/nodes) queries.
*/
public class UnknownNode extends AbstractResponse<UnknownNode> implements Node {
    public UnknownNode() {
    }

    public UnknownNode(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

    public static Node create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "AbandonedCheckout": {
                return new AbandonedCheckout(fields);
            }

            case "AbandonedCheckoutLineItem": {
                return new AbandonedCheckoutLineItem(fields);
            }

            case "Abandonment": {
                return new Abandonment(fields);
            }

            case "AddAllProductsOperation": {
                return new AddAllProductsOperation(fields);
            }

            case "AdditionalFee": {
                return new AdditionalFee(fields);
            }

            case "App": {
                return new App(fields);
            }

            case "AppCatalog": {
                return new AppCatalog(fields);
            }

            case "AppCredit": {
                return new AppCredit(fields);
            }

            case "AppInstallation": {
                return new AppInstallation(fields);
            }

            case "AppPurchaseOneTime": {
                return new AppPurchaseOneTime(fields);
            }

            case "AppRevenueAttributionRecord": {
                return new AppRevenueAttributionRecord(fields);
            }

            case "AppSubscription": {
                return new AppSubscription(fields);
            }

            case "AppUsageRecord": {
                return new AppUsageRecord(fields);
            }

            case "Article": {
                return new Article(fields);
            }

            case "BasicEvent": {
                return new BasicEvent(fields);
            }

            case "Blog": {
                return new Blog(fields);
            }

            case "BulkOperation": {
                return new BulkOperation(fields);
            }

            case "BusinessEntity": {
                return new BusinessEntity(fields);
            }

            case "CalculatedOrder": {
                return new CalculatedOrder(fields);
            }

            case "CartTransform": {
                return new CartTransform(fields);
            }

            case "CashTrackingAdjustment": {
                return new CashTrackingAdjustment(fields);
            }

            case "CashTrackingSession": {
                return new CashTrackingSession(fields);
            }

            case "CatalogCsvOperation": {
                return new CatalogCsvOperation(fields);
            }

            case "Channel": {
                return new Channel(fields);
            }

            case "ChannelDefinition": {
                return new ChannelDefinition(fields);
            }

            case "ChannelInformation": {
                return new ChannelInformation(fields);
            }

            case "CheckoutProfile": {
                return new CheckoutProfile(fields);
            }

            case "Collection": {
                return new Collection(fields);
            }

            case "Comment": {
                return new Comment(fields);
            }

            case "CommentEvent": {
                return new CommentEvent(fields);
            }

            case "Company": {
                return new Company(fields);
            }

            case "CompanyAddress": {
                return new CompanyAddress(fields);
            }

            case "CompanyContact": {
                return new CompanyContact(fields);
            }

            case "CompanyContactRole": {
                return new CompanyContactRole(fields);
            }

            case "CompanyContactRoleAssignment": {
                return new CompanyContactRoleAssignment(fields);
            }

            case "CompanyLocation": {
                return new CompanyLocation(fields);
            }

            case "CompanyLocationCatalog": {
                return new CompanyLocationCatalog(fields);
            }

            case "CompanyLocationStaffMemberAssignment": {
                return new CompanyLocationStaffMemberAssignment(fields);
            }

            case "Customer": {
                return new Customer(fields);
            }

            case "CustomerAccountAppExtensionPage": {
                return new CustomerAccountAppExtensionPage(fields);
            }

            case "CustomerAccountNativePage": {
                return new CustomerAccountNativePage(fields);
            }

            case "CustomerPaymentMethod": {
                return new CustomerPaymentMethod(fields);
            }

            case "CustomerSegmentMembersQuery": {
                return new CustomerSegmentMembersQuery(fields);
            }

            case "CustomerVisit": {
                return new CustomerVisit(fields);
            }

            case "DeliveryCarrierService": {
                return new DeliveryCarrierService(fields);
            }

            case "DeliveryCondition": {
                return new DeliveryCondition(fields);
            }

            case "DeliveryCountry": {
                return new DeliveryCountry(fields);
            }

            case "DeliveryCustomization": {
                return new DeliveryCustomization(fields);
            }

            case "DeliveryLocationGroup": {
                return new DeliveryLocationGroup(fields);
            }

            case "DeliveryMethod": {
                return new DeliveryMethod(fields);
            }

            case "DeliveryMethodDefinition": {
                return new DeliveryMethodDefinition(fields);
            }

            case "DeliveryParticipant": {
                return new DeliveryParticipant(fields);
            }

            case "DeliveryProfile": {
                return new DeliveryProfile(fields);
            }

            case "DeliveryProfileItem": {
                return new DeliveryProfileItem(fields);
            }

            case "DeliveryPromiseParticipant": {
                return new DeliveryPromiseParticipant(fields);
            }

            case "DeliveryPromiseProvider": {
                return new DeliveryPromiseProvider(fields);
            }

            case "DeliveryProvince": {
                return new DeliveryProvince(fields);
            }

            case "DeliveryRateDefinition": {
                return new DeliveryRateDefinition(fields);
            }

            case "DeliveryZone": {
                return new DeliveryZone(fields);
            }

            case "DiscountAutomaticBxgy": {
                return new DiscountAutomaticBxgy(fields);
            }

            case "DiscountAutomaticNode": {
                return new DiscountAutomaticNode(fields);
            }

            case "DiscountCodeNode": {
                return new DiscountCodeNode(fields);
            }

            case "DiscountNode": {
                return new DiscountNode(fields);
            }

            case "DiscountRedeemCodeBulkCreation": {
                return new DiscountRedeemCodeBulkCreation(fields);
            }

            case "Domain": {
                return new Domain(fields);
            }

            case "DraftOrder": {
                return new DraftOrder(fields);
            }

            case "DraftOrderLineItem": {
                return new DraftOrderLineItem(fields);
            }

            case "DraftOrderTag": {
                return new DraftOrderTag(fields);
            }

            case "Duty": {
                return new Duty(fields);
            }

            case "ExchangeLineItem": {
                return new ExchangeLineItem(fields);
            }

            case "ExchangeV2": {
                return new ExchangeV2(fields);
            }

            case "ExternalVideo": {
                return new ExternalVideo(fields);
            }

            case "Fulfillment": {
                return new Fulfillment(fields);
            }

            case "FulfillmentConstraintRule": {
                return new FulfillmentConstraintRule(fields);
            }

            case "FulfillmentEvent": {
                return new FulfillmentEvent(fields);
            }

            case "FulfillmentHold": {
                return new FulfillmentHold(fields);
            }

            case "FulfillmentLineItem": {
                return new FulfillmentLineItem(fields);
            }

            case "FulfillmentOrder": {
                return new FulfillmentOrder(fields);
            }

            case "FulfillmentOrderDestination": {
                return new FulfillmentOrderDestination(fields);
            }

            case "FulfillmentOrderLineItem": {
                return new FulfillmentOrderLineItem(fields);
            }

            case "FulfillmentOrderMerchantRequest": {
                return new FulfillmentOrderMerchantRequest(fields);
            }

            case "GenericFile": {
                return new GenericFile(fields);
            }

            case "GiftCard": {
                return new GiftCard(fields);
            }

            case "GiftCardCreditTransaction": {
                return new GiftCardCreditTransaction(fields);
            }

            case "GiftCardDebitTransaction": {
                return new GiftCardDebitTransaction(fields);
            }

            case "InventoryAdjustmentGroup": {
                return new InventoryAdjustmentGroup(fields);
            }

            case "InventoryItem": {
                return new InventoryItem(fields);
            }

            case "InventoryItemMeasurement": {
                return new InventoryItemMeasurement(fields);
            }

            case "InventoryLevel": {
                return new InventoryLevel(fields);
            }

            case "InventoryQuantity": {
                return new InventoryQuantity(fields);
            }

            case "LineItem": {
                return new LineItem(fields);
            }

            case "LineItemGroup": {
                return new LineItemGroup(fields);
            }

            case "Location": {
                return new Location(fields);
            }

            case "MailingAddress": {
                return new MailingAddress(fields);
            }

            case "Market": {
                return new Market(fields);
            }

            case "MarketCatalog": {
                return new MarketCatalog(fields);
            }

            case "MarketRegionCountry": {
                return new MarketRegionCountry(fields);
            }

            case "MarketWebPresence": {
                return new MarketWebPresence(fields);
            }

            case "MarketingActivity": {
                return new MarketingActivity(fields);
            }

            case "MarketingEvent": {
                return new MarketingEvent(fields);
            }

            case "MediaImage": {
                return new MediaImage(fields);
            }

            case "Menu": {
                return new Menu(fields);
            }

            case "Metafield": {
                return new Metafield(fields);
            }

            case "MetafieldDefinition": {
                return new MetafieldDefinition(fields);
            }

            case "Metaobject": {
                return new Metaobject(fields);
            }

            case "MetaobjectDefinition": {
                return new MetaobjectDefinition(fields);
            }

            case "Model3d": {
                return new Model3d(fields);
            }

            case "OnlineStoreTheme": {
                return new OnlineStoreTheme(fields);
            }

            case "Order": {
                return new Order(fields);
            }

            case "OrderAdjustment": {
                return new OrderAdjustment(fields);
            }

            case "OrderDisputeSummary": {
                return new OrderDisputeSummary(fields);
            }

            case "OrderTransaction": {
                return new OrderTransaction(fields);
            }

            case "Page": {
                return new Page(fields);
            }

            case "PaymentCustomization": {
                return new PaymentCustomization(fields);
            }

            case "PaymentMandate": {
                return new PaymentMandate(fields);
            }

            case "PaymentSchedule": {
                return new PaymentSchedule(fields);
            }

            case "PaymentTerms": {
                return new PaymentTerms(fields);
            }

            case "PaymentTermsTemplate": {
                return new PaymentTermsTemplate(fields);
            }

            case "PriceList": {
                return new PriceList(fields);
            }

            case "PriceRule": {
                return new PriceRule(fields);
            }

            case "PriceRuleDiscountCode": {
                return new PriceRuleDiscountCode(fields);
            }

            case "Product": {
                return new Product(fields);
            }

            case "ProductBundleOperation": {
                return new ProductBundleOperation(fields);
            }

            case "ProductDeleteOperation": {
                return new ProductDeleteOperation(fields);
            }

            case "ProductDuplicateOperation": {
                return new ProductDuplicateOperation(fields);
            }

            case "ProductFeed": {
                return new ProductFeed(fields);
            }

            case "ProductOption": {
                return new ProductOption(fields);
            }

            case "ProductOptionValue": {
                return new ProductOptionValue(fields);
            }

            case "ProductSetOperation": {
                return new ProductSetOperation(fields);
            }

            case "ProductTaxonomyNode": {
                return new ProductTaxonomyNode(fields);
            }

            case "ProductVariant": {
                return new ProductVariant(fields);
            }

            case "ProductVariantComponent": {
                return new ProductVariantComponent(fields);
            }

            case "Publication": {
                return new Publication(fields);
            }

            case "PublicationResourceOperation": {
                return new PublicationResourceOperation(fields);
            }

            case "QuantityPriceBreak": {
                return new QuantityPriceBreak(fields);
            }

            case "Refund": {
                return new Refund(fields);
            }

            case "RefundShippingLine": {
                return new RefundShippingLine(fields);
            }

            case "Return": {
                return new Return(fields);
            }

            case "ReturnLineItem": {
                return new ReturnLineItem(fields);
            }

            case "ReturnableFulfillment": {
                return new ReturnableFulfillment(fields);
            }

            case "ReverseDelivery": {
                return new ReverseDelivery(fields);
            }

            case "ReverseDeliveryLineItem": {
                return new ReverseDeliveryLineItem(fields);
            }

            case "ReverseFulfillmentOrder": {
                return new ReverseFulfillmentOrder(fields);
            }

            case "ReverseFulfillmentOrderDisposition": {
                return new ReverseFulfillmentOrderDisposition(fields);
            }

            case "ReverseFulfillmentOrderLineItem": {
                return new ReverseFulfillmentOrderLineItem(fields);
            }

            case "SaleAdditionalFee": {
                return new SaleAdditionalFee(fields);
            }

            case "SavedSearch": {
                return new SavedSearch(fields);
            }

            case "ScriptTag": {
                return new ScriptTag(fields);
            }

            case "Segment": {
                return new Segment(fields);
            }

            case "SellingPlan": {
                return new SellingPlan(fields);
            }

            case "SellingPlanGroup": {
                return new SellingPlanGroup(fields);
            }

            case "ServerPixel": {
                return new ServerPixel(fields);
            }

            case "Shop": {
                return new Shop(fields);
            }

            case "ShopAddress": {
                return new ShopAddress(fields);
            }

            case "ShopPolicy": {
                return new ShopPolicy(fields);
            }

            case "ShopifyPaymentsAccount": {
                return new ShopifyPaymentsAccount(fields);
            }

            case "ShopifyPaymentsBalanceTransaction": {
                return new ShopifyPaymentsBalanceTransaction(fields);
            }

            case "ShopifyPaymentsBankAccount": {
                return new ShopifyPaymentsBankAccount(fields);
            }

            case "ShopifyPaymentsDispute": {
                return new ShopifyPaymentsDispute(fields);
            }

            case "ShopifyPaymentsDisputeEvidence": {
                return new ShopifyPaymentsDisputeEvidence(fields);
            }

            case "ShopifyPaymentsDisputeFileUpload": {
                return new ShopifyPaymentsDisputeFileUpload(fields);
            }

            case "ShopifyPaymentsDisputeFulfillment": {
                return new ShopifyPaymentsDisputeFulfillment(fields);
            }

            case "ShopifyPaymentsPayout": {
                return new ShopifyPaymentsPayout(fields);
            }

            case "ShopifyPaymentsVerification": {
                return new ShopifyPaymentsVerification(fields);
            }

            case "StaffMember": {
                return new StaffMember(fields);
            }

            case "StandardMetafieldDefinitionTemplate": {
                return new StandardMetafieldDefinitionTemplate(fields);
            }

            case "StoreCreditAccount": {
                return new StoreCreditAccount(fields);
            }

            case "StoreCreditAccountCreditTransaction": {
                return new StoreCreditAccountCreditTransaction(fields);
            }

            case "StoreCreditAccountDebitRevertTransaction": {
                return new StoreCreditAccountDebitRevertTransaction(fields);
            }

            case "StoreCreditAccountDebitTransaction": {
                return new StoreCreditAccountDebitTransaction(fields);
            }

            case "StorefrontAccessToken": {
                return new StorefrontAccessToken(fields);
            }

            case "SubscriptionBillingAttempt": {
                return new SubscriptionBillingAttempt(fields);
            }

            case "SubscriptionContract": {
                return new SubscriptionContract(fields);
            }

            case "SubscriptionDraft": {
                return new SubscriptionDraft(fields);
            }

            case "TaxonomyAttribute": {
                return new TaxonomyAttribute(fields);
            }

            case "TaxonomyCategory": {
                return new TaxonomyCategory(fields);
            }

            case "TaxonomyChoiceListAttribute": {
                return new TaxonomyChoiceListAttribute(fields);
            }

            case "TaxonomyMeasurementAttribute": {
                return new TaxonomyMeasurementAttribute(fields);
            }

            case "TaxonomyValue": {
                return new TaxonomyValue(fields);
            }

            case "TenderTransaction": {
                return new TenderTransaction(fields);
            }

            case "TransactionFee": {
                return new TransactionFee(fields);
            }

            case "UnverifiedReturnLineItem": {
                return new UnverifiedReturnLineItem(fields);
            }

            case "UrlRedirect": {
                return new UrlRedirect(fields);
            }

            case "UrlRedirectImport": {
                return new UrlRedirectImport(fields);
            }

            case "Validation": {
                return new Validation(fields);
            }

            case "Video": {
                return new Video(fields);
            }

            case "WebPixel": {
                return new WebPixel(fields);
            }

            case "WebhookSubscription": {
                return new WebhookSubscription(fields);
            }

            default: {
                return new UnknownNode(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public UnknownNode setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            default: return false;
        }
    }
}

