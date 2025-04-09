// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An object with an ID field to support global identification, in accordance with the
* [Relay specification](https://relay.dev/graphql/objectidentification.htm#sec-Node-Interface).
* This interface is used by the [node](https://shopify.dev/api/admin-graphql/unstable/queries/node)
* and [nodes](https://shopify.dev/api/admin-graphql/unstable/queries/nodes) queries.
*/
public class NodeQuery extends Query<NodeQuery> {
    NodeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * A globally-unique ID.
    */
    public NodeQuery id() {
        startField("id");

        return this;
    }

    public NodeQuery onAbandonedCheckout(AbandonedCheckoutQueryDefinition queryDef) {
        startInlineFragment("AbandonedCheckout");
        queryDef.define(new AbandonedCheckoutQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onAbandonedCheckoutLineItem(AbandonedCheckoutLineItemQueryDefinition queryDef) {
        startInlineFragment("AbandonedCheckoutLineItem");
        queryDef.define(new AbandonedCheckoutLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onAbandonment(AbandonmentQueryDefinition queryDef) {
        startInlineFragment("Abandonment");
        queryDef.define(new AbandonmentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onAddAllProductsOperation(AddAllProductsOperationQueryDefinition queryDef) {
        startInlineFragment("AddAllProductsOperation");
        queryDef.define(new AddAllProductsOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onAdditionalFee(AdditionalFeeQueryDefinition queryDef) {
        startInlineFragment("AdditionalFee");
        queryDef.define(new AdditionalFeeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onApp(AppQueryDefinition queryDef) {
        startInlineFragment("App");
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onAppCatalog(AppCatalogQueryDefinition queryDef) {
        startInlineFragment("AppCatalog");
        queryDef.define(new AppCatalogQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onAppCredit(AppCreditQueryDefinition queryDef) {
        startInlineFragment("AppCredit");
        queryDef.define(new AppCreditQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onAppInstallation(AppInstallationQueryDefinition queryDef) {
        startInlineFragment("AppInstallation");
        queryDef.define(new AppInstallationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onAppPurchaseOneTime(AppPurchaseOneTimeQueryDefinition queryDef) {
        startInlineFragment("AppPurchaseOneTime");
        queryDef.define(new AppPurchaseOneTimeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onAppRevenueAttributionRecord(AppRevenueAttributionRecordQueryDefinition queryDef) {
        startInlineFragment("AppRevenueAttributionRecord");
        queryDef.define(new AppRevenueAttributionRecordQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onAppSubscription(AppSubscriptionQueryDefinition queryDef) {
        startInlineFragment("AppSubscription");
        queryDef.define(new AppSubscriptionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onAppUsageRecord(AppUsageRecordQueryDefinition queryDef) {
        startInlineFragment("AppUsageRecord");
        queryDef.define(new AppUsageRecordQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onArticle(ArticleQueryDefinition queryDef) {
        startInlineFragment("Article");
        queryDef.define(new ArticleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onBasicEvent(BasicEventQueryDefinition queryDef) {
        startInlineFragment("BasicEvent");
        queryDef.define(new BasicEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onBlog(BlogQueryDefinition queryDef) {
        startInlineFragment("Blog");
        queryDef.define(new BlogQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onBulkOperation(BulkOperationQueryDefinition queryDef) {
        startInlineFragment("BulkOperation");
        queryDef.define(new BulkOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onBusinessEntity(BusinessEntityQueryDefinition queryDef) {
        startInlineFragment("BusinessEntity");
        queryDef.define(new BusinessEntityQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCalculatedOrder(CalculatedOrderQueryDefinition queryDef) {
        startInlineFragment("CalculatedOrder");
        queryDef.define(new CalculatedOrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCartTransform(CartTransformQueryDefinition queryDef) {
        startInlineFragment("CartTransform");
        queryDef.define(new CartTransformQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCashTrackingAdjustment(CashTrackingAdjustmentQueryDefinition queryDef) {
        startInlineFragment("CashTrackingAdjustment");
        queryDef.define(new CashTrackingAdjustmentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCashTrackingSession(CashTrackingSessionQueryDefinition queryDef) {
        startInlineFragment("CashTrackingSession");
        queryDef.define(new CashTrackingSessionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCatalogCsvOperation(CatalogCsvOperationQueryDefinition queryDef) {
        startInlineFragment("CatalogCsvOperation");
        queryDef.define(new CatalogCsvOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onChannel(ChannelQueryDefinition queryDef) {
        startInlineFragment("Channel");
        queryDef.define(new ChannelQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onChannelDefinition(ChannelDefinitionQueryDefinition queryDef) {
        startInlineFragment("ChannelDefinition");
        queryDef.define(new ChannelDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onChannelInformation(ChannelInformationQueryDefinition queryDef) {
        startInlineFragment("ChannelInformation");
        queryDef.define(new ChannelInformationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCheckoutProfile(CheckoutProfileQueryDefinition queryDef) {
        startInlineFragment("CheckoutProfile");
        queryDef.define(new CheckoutProfileQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCollection(CollectionQueryDefinition queryDef) {
        startInlineFragment("Collection");
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onComment(CommentQueryDefinition queryDef) {
        startInlineFragment("Comment");
        queryDef.define(new CommentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCommentEvent(CommentEventQueryDefinition queryDef) {
        startInlineFragment("CommentEvent");
        queryDef.define(new CommentEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCompany(CompanyQueryDefinition queryDef) {
        startInlineFragment("Company");
        queryDef.define(new CompanyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCompanyAddress(CompanyAddressQueryDefinition queryDef) {
        startInlineFragment("CompanyAddress");
        queryDef.define(new CompanyAddressQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCompanyContact(CompanyContactQueryDefinition queryDef) {
        startInlineFragment("CompanyContact");
        queryDef.define(new CompanyContactQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCompanyContactRole(CompanyContactRoleQueryDefinition queryDef) {
        startInlineFragment("CompanyContactRole");
        queryDef.define(new CompanyContactRoleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCompanyContactRoleAssignment(CompanyContactRoleAssignmentQueryDefinition queryDef) {
        startInlineFragment("CompanyContactRoleAssignment");
        queryDef.define(new CompanyContactRoleAssignmentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCompanyLocation(CompanyLocationQueryDefinition queryDef) {
        startInlineFragment("CompanyLocation");
        queryDef.define(new CompanyLocationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCompanyLocationCatalog(CompanyLocationCatalogQueryDefinition queryDef) {
        startInlineFragment("CompanyLocationCatalog");
        queryDef.define(new CompanyLocationCatalogQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCompanyLocationStaffMemberAssignment(CompanyLocationStaffMemberAssignmentQueryDefinition queryDef) {
        startInlineFragment("CompanyLocationStaffMemberAssignment");
        queryDef.define(new CompanyLocationStaffMemberAssignmentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCustomer(CustomerQueryDefinition queryDef) {
        startInlineFragment("Customer");
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCustomerAccountAppExtensionPage(CustomerAccountAppExtensionPageQueryDefinition queryDef) {
        startInlineFragment("CustomerAccountAppExtensionPage");
        queryDef.define(new CustomerAccountAppExtensionPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCustomerPaymentMethod(CustomerPaymentMethodQueryDefinition queryDef) {
        startInlineFragment("CustomerPaymentMethod");
        queryDef.define(new CustomerPaymentMethodQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCustomerSegmentMembersQuery(CustomerSegmentMembersQueryQueryDefinition queryDef) {
        startInlineFragment("CustomerSegmentMembersQuery");
        queryDef.define(new CustomerSegmentMembersQueryQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCustomerVisit(CustomerVisitQueryDefinition queryDef) {
        startInlineFragment("CustomerVisit");
        queryDef.define(new CustomerVisitQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDeliveryCarrierService(DeliveryCarrierServiceQueryDefinition queryDef) {
        startInlineFragment("DeliveryCarrierService");
        queryDef.define(new DeliveryCarrierServiceQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDeliveryCondition(DeliveryConditionQueryDefinition queryDef) {
        startInlineFragment("DeliveryCondition");
        queryDef.define(new DeliveryConditionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDeliveryCountry(DeliveryCountryQueryDefinition queryDef) {
        startInlineFragment("DeliveryCountry");
        queryDef.define(new DeliveryCountryQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDeliveryCustomization(DeliveryCustomizationQueryDefinition queryDef) {
        startInlineFragment("DeliveryCustomization");
        queryDef.define(new DeliveryCustomizationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDeliveryLocationGroup(DeliveryLocationGroupQueryDefinition queryDef) {
        startInlineFragment("DeliveryLocationGroup");
        queryDef.define(new DeliveryLocationGroupQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDeliveryMethod(DeliveryMethodQueryDefinition queryDef) {
        startInlineFragment("DeliveryMethod");
        queryDef.define(new DeliveryMethodQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDeliveryMethodDefinition(DeliveryMethodDefinitionQueryDefinition queryDef) {
        startInlineFragment("DeliveryMethodDefinition");
        queryDef.define(new DeliveryMethodDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDeliveryParticipant(DeliveryParticipantQueryDefinition queryDef) {
        startInlineFragment("DeliveryParticipant");
        queryDef.define(new DeliveryParticipantQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDeliveryProfile(DeliveryProfileQueryDefinition queryDef) {
        startInlineFragment("DeliveryProfile");
        queryDef.define(new DeliveryProfileQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDeliveryProfileItem(DeliveryProfileItemQueryDefinition queryDef) {
        startInlineFragment("DeliveryProfileItem");
        queryDef.define(new DeliveryProfileItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDeliveryPromiseParticipant(DeliveryPromiseParticipantQueryDefinition queryDef) {
        startInlineFragment("DeliveryPromiseParticipant");
        queryDef.define(new DeliveryPromiseParticipantQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDeliveryPromiseProvider(DeliveryPromiseProviderQueryDefinition queryDef) {
        startInlineFragment("DeliveryPromiseProvider");
        queryDef.define(new DeliveryPromiseProviderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDeliveryProvince(DeliveryProvinceQueryDefinition queryDef) {
        startInlineFragment("DeliveryProvince");
        queryDef.define(new DeliveryProvinceQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDeliveryRateDefinition(DeliveryRateDefinitionQueryDefinition queryDef) {
        startInlineFragment("DeliveryRateDefinition");
        queryDef.define(new DeliveryRateDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDeliveryZone(DeliveryZoneQueryDefinition queryDef) {
        startInlineFragment("DeliveryZone");
        queryDef.define(new DeliveryZoneQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDiscountAutomaticBxgy(DiscountAutomaticBxgyQueryDefinition queryDef) {
        startInlineFragment("DiscountAutomaticBxgy");
        queryDef.define(new DiscountAutomaticBxgyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDiscountAutomaticNode(DiscountAutomaticNodeQueryDefinition queryDef) {
        startInlineFragment("DiscountAutomaticNode");
        queryDef.define(new DiscountAutomaticNodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDiscountCodeNode(DiscountCodeNodeQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeNode");
        queryDef.define(new DiscountCodeNodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDiscountNode(DiscountNodeQueryDefinition queryDef) {
        startInlineFragment("DiscountNode");
        queryDef.define(new DiscountNodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDiscountRedeemCodeBulkCreation(DiscountRedeemCodeBulkCreationQueryDefinition queryDef) {
        startInlineFragment("DiscountRedeemCodeBulkCreation");
        queryDef.define(new DiscountRedeemCodeBulkCreationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDomain(DomainQueryDefinition queryDef) {
        startInlineFragment("Domain");
        queryDef.define(new DomainQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDraftOrder(DraftOrderQueryDefinition queryDef) {
        startInlineFragment("DraftOrder");
        queryDef.define(new DraftOrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDraftOrderLineItem(DraftOrderLineItemQueryDefinition queryDef) {
        startInlineFragment("DraftOrderLineItem");
        queryDef.define(new DraftOrderLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDraftOrderTag(DraftOrderTagQueryDefinition queryDef) {
        startInlineFragment("DraftOrderTag");
        queryDef.define(new DraftOrderTagQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDuty(DutyQueryDefinition queryDef) {
        startInlineFragment("Duty");
        queryDef.define(new DutyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onExchangeLineItem(ExchangeLineItemQueryDefinition queryDef) {
        startInlineFragment("ExchangeLineItem");
        queryDef.define(new ExchangeLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onExchangeV2(ExchangeV2QueryDefinition queryDef) {
        startInlineFragment("ExchangeV2");
        queryDef.define(new ExchangeV2Query(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onExternalVideo(ExternalVideoQueryDefinition queryDef) {
        startInlineFragment("ExternalVideo");
        queryDef.define(new ExternalVideoQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onFulfillment(FulfillmentQueryDefinition queryDef) {
        startInlineFragment("Fulfillment");
        queryDef.define(new FulfillmentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onFulfillmentConstraintRule(FulfillmentConstraintRuleQueryDefinition queryDef) {
        startInlineFragment("FulfillmentConstraintRule");
        queryDef.define(new FulfillmentConstraintRuleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onFulfillmentEvent(FulfillmentEventQueryDefinition queryDef) {
        startInlineFragment("FulfillmentEvent");
        queryDef.define(new FulfillmentEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onFulfillmentHold(FulfillmentHoldQueryDefinition queryDef) {
        startInlineFragment("FulfillmentHold");
        queryDef.define(new FulfillmentHoldQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onFulfillmentLineItem(FulfillmentLineItemQueryDefinition queryDef) {
        startInlineFragment("FulfillmentLineItem");
        queryDef.define(new FulfillmentLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onFulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startInlineFragment("FulfillmentOrder");
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onFulfillmentOrderDestination(FulfillmentOrderDestinationQueryDefinition queryDef) {
        startInlineFragment("FulfillmentOrderDestination");
        queryDef.define(new FulfillmentOrderDestinationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onFulfillmentOrderLineItem(FulfillmentOrderLineItemQueryDefinition queryDef) {
        startInlineFragment("FulfillmentOrderLineItem");
        queryDef.define(new FulfillmentOrderLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onFulfillmentOrderMerchantRequest(FulfillmentOrderMerchantRequestQueryDefinition queryDef) {
        startInlineFragment("FulfillmentOrderMerchantRequest");
        queryDef.define(new FulfillmentOrderMerchantRequestQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onGenericFile(GenericFileQueryDefinition queryDef) {
        startInlineFragment("GenericFile");
        queryDef.define(new GenericFileQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onGiftCard(GiftCardQueryDefinition queryDef) {
        startInlineFragment("GiftCard");
        queryDef.define(new GiftCardQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onGiftCardCreditTransaction(GiftCardCreditTransactionQueryDefinition queryDef) {
        startInlineFragment("GiftCardCreditTransaction");
        queryDef.define(new GiftCardCreditTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onGiftCardDebitTransaction(GiftCardDebitTransactionQueryDefinition queryDef) {
        startInlineFragment("GiftCardDebitTransaction");
        queryDef.define(new GiftCardDebitTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onInventoryAdjustmentGroup(InventoryAdjustmentGroupQueryDefinition queryDef) {
        startInlineFragment("InventoryAdjustmentGroup");
        queryDef.define(new InventoryAdjustmentGroupQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onInventoryItem(InventoryItemQueryDefinition queryDef) {
        startInlineFragment("InventoryItem");
        queryDef.define(new InventoryItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onInventoryItemMeasurement(InventoryItemMeasurementQueryDefinition queryDef) {
        startInlineFragment("InventoryItemMeasurement");
        queryDef.define(new InventoryItemMeasurementQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onInventoryLevel(InventoryLevelQueryDefinition queryDef) {
        startInlineFragment("InventoryLevel");
        queryDef.define(new InventoryLevelQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onInventoryQuantity(InventoryQuantityQueryDefinition queryDef) {
        startInlineFragment("InventoryQuantity");
        queryDef.define(new InventoryQuantityQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onLineItem(LineItemQueryDefinition queryDef) {
        startInlineFragment("LineItem");
        queryDef.define(new LineItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onLineItemGroup(LineItemGroupQueryDefinition queryDef) {
        startInlineFragment("LineItemGroup");
        queryDef.define(new LineItemGroupQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onLocation(LocationQueryDefinition queryDef) {
        startInlineFragment("Location");
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onMailingAddress(MailingAddressQueryDefinition queryDef) {
        startInlineFragment("MailingAddress");
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onMarket(MarketQueryDefinition queryDef) {
        startInlineFragment("Market");
        queryDef.define(new MarketQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onMarketCatalog(MarketCatalogQueryDefinition queryDef) {
        startInlineFragment("MarketCatalog");
        queryDef.define(new MarketCatalogQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onMarketRegionCountry(MarketRegionCountryQueryDefinition queryDef) {
        startInlineFragment("MarketRegionCountry");
        queryDef.define(new MarketRegionCountryQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onMarketWebPresence(MarketWebPresenceQueryDefinition queryDef) {
        startInlineFragment("MarketWebPresence");
        queryDef.define(new MarketWebPresenceQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onMarketingActivity(MarketingActivityQueryDefinition queryDef) {
        startInlineFragment("MarketingActivity");
        queryDef.define(new MarketingActivityQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onMarketingEvent(MarketingEventQueryDefinition queryDef) {
        startInlineFragment("MarketingEvent");
        queryDef.define(new MarketingEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onMediaImage(MediaImageQueryDefinition queryDef) {
        startInlineFragment("MediaImage");
        queryDef.define(new MediaImageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onMenu(MenuQueryDefinition queryDef) {
        startInlineFragment("Menu");
        queryDef.define(new MenuQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onMetafield(MetafieldQueryDefinition queryDef) {
        startInlineFragment("Metafield");
        queryDef.define(new MetafieldQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onMetafieldDefinition(MetafieldDefinitionQueryDefinition queryDef) {
        startInlineFragment("MetafieldDefinition");
        queryDef.define(new MetafieldDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onMetaobject(MetaobjectQueryDefinition queryDef) {
        startInlineFragment("Metaobject");
        queryDef.define(new MetaobjectQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onMetaobjectDefinition(MetaobjectDefinitionQueryDefinition queryDef) {
        startInlineFragment("MetaobjectDefinition");
        queryDef.define(new MetaobjectDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onModel3d(Model3dQueryDefinition queryDef) {
        startInlineFragment("Model3d");
        queryDef.define(new Model3dQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onOnlineStoreTheme(OnlineStoreThemeQueryDefinition queryDef) {
        startInlineFragment("OnlineStoreTheme");
        queryDef.define(new OnlineStoreThemeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onOrder(OrderQueryDefinition queryDef) {
        startInlineFragment("Order");
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onOrderAdjustment(OrderAdjustmentQueryDefinition queryDef) {
        startInlineFragment("OrderAdjustment");
        queryDef.define(new OrderAdjustmentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onOrderDisputeSummary(OrderDisputeSummaryQueryDefinition queryDef) {
        startInlineFragment("OrderDisputeSummary");
        queryDef.define(new OrderDisputeSummaryQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onOrderTransaction(OrderTransactionQueryDefinition queryDef) {
        startInlineFragment("OrderTransaction");
        queryDef.define(new OrderTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPage(PageQueryDefinition queryDef) {
        startInlineFragment("Page");
        queryDef.define(new PageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPaymentCustomization(PaymentCustomizationQueryDefinition queryDef) {
        startInlineFragment("PaymentCustomization");
        queryDef.define(new PaymentCustomizationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPaymentMandate(PaymentMandateQueryDefinition queryDef) {
        startInlineFragment("PaymentMandate");
        queryDef.define(new PaymentMandateQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPaymentSchedule(PaymentScheduleQueryDefinition queryDef) {
        startInlineFragment("PaymentSchedule");
        queryDef.define(new PaymentScheduleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPaymentTerms(PaymentTermsQueryDefinition queryDef) {
        startInlineFragment("PaymentTerms");
        queryDef.define(new PaymentTermsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPaymentTermsTemplate(PaymentTermsTemplateQueryDefinition queryDef) {
        startInlineFragment("PaymentTermsTemplate");
        queryDef.define(new PaymentTermsTemplateQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPriceList(PriceListQueryDefinition queryDef) {
        startInlineFragment("PriceList");
        queryDef.define(new PriceListQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPriceRule(PriceRuleQueryDefinition queryDef) {
        startInlineFragment("PriceRule");
        queryDef.define(new PriceRuleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPriceRuleDiscountCode(PriceRuleDiscountCodeQueryDefinition queryDef) {
        startInlineFragment("PriceRuleDiscountCode");
        queryDef.define(new PriceRuleDiscountCodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onProduct(ProductQueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onProductBundleOperation(ProductBundleOperationQueryDefinition queryDef) {
        startInlineFragment("ProductBundleOperation");
        queryDef.define(new ProductBundleOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onProductDeleteOperation(ProductDeleteOperationQueryDefinition queryDef) {
        startInlineFragment("ProductDeleteOperation");
        queryDef.define(new ProductDeleteOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onProductDuplicateOperation(ProductDuplicateOperationQueryDefinition queryDef) {
        startInlineFragment("ProductDuplicateOperation");
        queryDef.define(new ProductDuplicateOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onProductFeed(ProductFeedQueryDefinition queryDef) {
        startInlineFragment("ProductFeed");
        queryDef.define(new ProductFeedQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onProductOption(ProductOptionQueryDefinition queryDef) {
        startInlineFragment("ProductOption");
        queryDef.define(new ProductOptionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onProductOptionValue(ProductOptionValueQueryDefinition queryDef) {
        startInlineFragment("ProductOptionValue");
        queryDef.define(new ProductOptionValueQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onProductSetOperation(ProductSetOperationQueryDefinition queryDef) {
        startInlineFragment("ProductSetOperation");
        queryDef.define(new ProductSetOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onProductTaxonomyNode(ProductTaxonomyNodeQueryDefinition queryDef) {
        startInlineFragment("ProductTaxonomyNode");
        queryDef.define(new ProductTaxonomyNodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onProductVariant(ProductVariantQueryDefinition queryDef) {
        startInlineFragment("ProductVariant");
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onProductVariantComponent(ProductVariantComponentQueryDefinition queryDef) {
        startInlineFragment("ProductVariantComponent");
        queryDef.define(new ProductVariantComponentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPublication(PublicationQueryDefinition queryDef) {
        startInlineFragment("Publication");
        queryDef.define(new PublicationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPublicationResourceOperation(PublicationResourceOperationQueryDefinition queryDef) {
        startInlineFragment("PublicationResourceOperation");
        queryDef.define(new PublicationResourceOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onQuantityPriceBreak(QuantityPriceBreakQueryDefinition queryDef) {
        startInlineFragment("QuantityPriceBreak");
        queryDef.define(new QuantityPriceBreakQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onRefund(RefundQueryDefinition queryDef) {
        startInlineFragment("Refund");
        queryDef.define(new RefundQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onRefundShippingLine(RefundShippingLineQueryDefinition queryDef) {
        startInlineFragment("RefundShippingLine");
        queryDef.define(new RefundShippingLineQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onReturn(ReturnQueryDefinition queryDef) {
        startInlineFragment("Return");
        queryDef.define(new ReturnQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onReturnLineItem(ReturnLineItemQueryDefinition queryDef) {
        startInlineFragment("ReturnLineItem");
        queryDef.define(new ReturnLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onReturnableFulfillment(ReturnableFulfillmentQueryDefinition queryDef) {
        startInlineFragment("ReturnableFulfillment");
        queryDef.define(new ReturnableFulfillmentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onReverseDelivery(ReverseDeliveryQueryDefinition queryDef) {
        startInlineFragment("ReverseDelivery");
        queryDef.define(new ReverseDeliveryQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onReverseDeliveryLineItem(ReverseDeliveryLineItemQueryDefinition queryDef) {
        startInlineFragment("ReverseDeliveryLineItem");
        queryDef.define(new ReverseDeliveryLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onReverseFulfillmentOrder(ReverseFulfillmentOrderQueryDefinition queryDef) {
        startInlineFragment("ReverseFulfillmentOrder");
        queryDef.define(new ReverseFulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onReverseFulfillmentOrderDisposition(ReverseFulfillmentOrderDispositionQueryDefinition queryDef) {
        startInlineFragment("ReverseFulfillmentOrderDisposition");
        queryDef.define(new ReverseFulfillmentOrderDispositionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onReverseFulfillmentOrderLineItem(ReverseFulfillmentOrderLineItemQueryDefinition queryDef) {
        startInlineFragment("ReverseFulfillmentOrderLineItem");
        queryDef.define(new ReverseFulfillmentOrderLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onSaleAdditionalFee(SaleAdditionalFeeQueryDefinition queryDef) {
        startInlineFragment("SaleAdditionalFee");
        queryDef.define(new SaleAdditionalFeeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onSavedSearch(SavedSearchQueryDefinition queryDef) {
        startInlineFragment("SavedSearch");
        queryDef.define(new SavedSearchQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onScriptTag(ScriptTagQueryDefinition queryDef) {
        startInlineFragment("ScriptTag");
        queryDef.define(new ScriptTagQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onSegment(SegmentQueryDefinition queryDef) {
        startInlineFragment("Segment");
        queryDef.define(new SegmentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onSellingPlan(SellingPlanQueryDefinition queryDef) {
        startInlineFragment("SellingPlan");
        queryDef.define(new SellingPlanQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onSellingPlanGroup(SellingPlanGroupQueryDefinition queryDef) {
        startInlineFragment("SellingPlanGroup");
        queryDef.define(new SellingPlanGroupQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onServerPixel(ServerPixelQueryDefinition queryDef) {
        startInlineFragment("ServerPixel");
        queryDef.define(new ServerPixelQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onShop(ShopQueryDefinition queryDef) {
        startInlineFragment("Shop");
        queryDef.define(new ShopQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onShopAddress(ShopAddressQueryDefinition queryDef) {
        startInlineFragment("ShopAddress");
        queryDef.define(new ShopAddressQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onShopPolicy(ShopPolicyQueryDefinition queryDef) {
        startInlineFragment("ShopPolicy");
        queryDef.define(new ShopPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onShopifyPaymentsAccount(ShopifyPaymentsAccountQueryDefinition queryDef) {
        startInlineFragment("ShopifyPaymentsAccount");
        queryDef.define(new ShopifyPaymentsAccountQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onShopifyPaymentsBalanceTransaction(ShopifyPaymentsBalanceTransactionQueryDefinition queryDef) {
        startInlineFragment("ShopifyPaymentsBalanceTransaction");
        queryDef.define(new ShopifyPaymentsBalanceTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onShopifyPaymentsBankAccount(ShopifyPaymentsBankAccountQueryDefinition queryDef) {
        startInlineFragment("ShopifyPaymentsBankAccount");
        queryDef.define(new ShopifyPaymentsBankAccountQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onShopifyPaymentsDispute(ShopifyPaymentsDisputeQueryDefinition queryDef) {
        startInlineFragment("ShopifyPaymentsDispute");
        queryDef.define(new ShopifyPaymentsDisputeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onShopifyPaymentsDisputeEvidence(ShopifyPaymentsDisputeEvidenceQueryDefinition queryDef) {
        startInlineFragment("ShopifyPaymentsDisputeEvidence");
        queryDef.define(new ShopifyPaymentsDisputeEvidenceQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onShopifyPaymentsDisputeFileUpload(ShopifyPaymentsDisputeFileUploadQueryDefinition queryDef) {
        startInlineFragment("ShopifyPaymentsDisputeFileUpload");
        queryDef.define(new ShopifyPaymentsDisputeFileUploadQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onShopifyPaymentsDisputeFulfillment(ShopifyPaymentsDisputeFulfillmentQueryDefinition queryDef) {
        startInlineFragment("ShopifyPaymentsDisputeFulfillment");
        queryDef.define(new ShopifyPaymentsDisputeFulfillmentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onShopifyPaymentsPayout(ShopifyPaymentsPayoutQueryDefinition queryDef) {
        startInlineFragment("ShopifyPaymentsPayout");
        queryDef.define(new ShopifyPaymentsPayoutQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onShopifyPaymentsVerification(ShopifyPaymentsVerificationQueryDefinition queryDef) {
        startInlineFragment("ShopifyPaymentsVerification");
        queryDef.define(new ShopifyPaymentsVerificationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onStaffMember(StaffMemberQueryDefinition queryDef) {
        startInlineFragment("StaffMember");
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onStandardMetafieldDefinitionTemplate(StandardMetafieldDefinitionTemplateQueryDefinition queryDef) {
        startInlineFragment("StandardMetafieldDefinitionTemplate");
        queryDef.define(new StandardMetafieldDefinitionTemplateQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onStoreCreditAccount(StoreCreditAccountQueryDefinition queryDef) {
        startInlineFragment("StoreCreditAccount");
        queryDef.define(new StoreCreditAccountQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onStoreCreditAccountCreditTransaction(StoreCreditAccountCreditTransactionQueryDefinition queryDef) {
        startInlineFragment("StoreCreditAccountCreditTransaction");
        queryDef.define(new StoreCreditAccountCreditTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onStoreCreditAccountDebitRevertTransaction(StoreCreditAccountDebitRevertTransactionQueryDefinition queryDef) {
        startInlineFragment("StoreCreditAccountDebitRevertTransaction");
        queryDef.define(new StoreCreditAccountDebitRevertTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onStoreCreditAccountDebitTransaction(StoreCreditAccountDebitTransactionQueryDefinition queryDef) {
        startInlineFragment("StoreCreditAccountDebitTransaction");
        queryDef.define(new StoreCreditAccountDebitTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onStorefrontAccessToken(StorefrontAccessTokenQueryDefinition queryDef) {
        startInlineFragment("StorefrontAccessToken");
        queryDef.define(new StorefrontAccessTokenQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onSubscriptionBillingAttempt(SubscriptionBillingAttemptQueryDefinition queryDef) {
        startInlineFragment("SubscriptionBillingAttempt");
        queryDef.define(new SubscriptionBillingAttemptQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onSubscriptionContract(SubscriptionContractQueryDefinition queryDef) {
        startInlineFragment("SubscriptionContract");
        queryDef.define(new SubscriptionContractQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onSubscriptionDraft(SubscriptionDraftQueryDefinition queryDef) {
        startInlineFragment("SubscriptionDraft");
        queryDef.define(new SubscriptionDraftQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onTaxonomyAttribute(TaxonomyAttributeQueryDefinition queryDef) {
        startInlineFragment("TaxonomyAttribute");
        queryDef.define(new TaxonomyAttributeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onTaxonomyCategory(TaxonomyCategoryQueryDefinition queryDef) {
        startInlineFragment("TaxonomyCategory");
        queryDef.define(new TaxonomyCategoryQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onTaxonomyChoiceListAttribute(TaxonomyChoiceListAttributeQueryDefinition queryDef) {
        startInlineFragment("TaxonomyChoiceListAttribute");
        queryDef.define(new TaxonomyChoiceListAttributeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onTaxonomyMeasurementAttribute(TaxonomyMeasurementAttributeQueryDefinition queryDef) {
        startInlineFragment("TaxonomyMeasurementAttribute");
        queryDef.define(new TaxonomyMeasurementAttributeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onTaxonomyValue(TaxonomyValueQueryDefinition queryDef) {
        startInlineFragment("TaxonomyValue");
        queryDef.define(new TaxonomyValueQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onTenderTransaction(TenderTransactionQueryDefinition queryDef) {
        startInlineFragment("TenderTransaction");
        queryDef.define(new TenderTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onTransactionFee(TransactionFeeQueryDefinition queryDef) {
        startInlineFragment("TransactionFee");
        queryDef.define(new TransactionFeeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onUnverifiedReturnLineItem(UnverifiedReturnLineItemQueryDefinition queryDef) {
        startInlineFragment("UnverifiedReturnLineItem");
        queryDef.define(new UnverifiedReturnLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onUrlRedirect(UrlRedirectQueryDefinition queryDef) {
        startInlineFragment("UrlRedirect");
        queryDef.define(new UrlRedirectQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onUrlRedirectImport(UrlRedirectImportQueryDefinition queryDef) {
        startInlineFragment("UrlRedirectImport");
        queryDef.define(new UrlRedirectImportQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onValidation(ValidationQueryDefinition queryDef) {
        startInlineFragment("Validation");
        queryDef.define(new ValidationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onVideo(VideoQueryDefinition queryDef) {
        startInlineFragment("Video");
        queryDef.define(new VideoQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onWebPixel(WebPixelQueryDefinition queryDef) {
        startInlineFragment("WebPixel");
        queryDef.define(new WebPixelQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onWebhookSubscription(WebhookSubscriptionQueryDefinition queryDef) {
        startInlineFragment("WebhookSubscription");
        queryDef.define(new WebhookSubscriptionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
