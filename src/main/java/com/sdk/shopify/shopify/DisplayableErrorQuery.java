// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents an error in the input of a mutation.
*/
public class DisplayableErrorQuery extends Query<DisplayableErrorQuery> {
    DisplayableErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The path to the input field that caused the error.
    */
    public DisplayableErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public DisplayableErrorQuery message() {
        startField("message");

        return this;
    }

    public DisplayableErrorQuery onAbandonmentEmailStateUpdateUserError(AbandonmentEmailStateUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("AbandonmentEmailStateUpdateUserError");
        queryDef.define(new AbandonmentEmailStateUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onAbandonmentUpdateActivitiesDeliveryStatusesUserError(AbandonmentUpdateActivitiesDeliveryStatusesUserErrorQueryDefinition queryDef) {
        startInlineFragment("AbandonmentUpdateActivitiesDeliveryStatusesUserError");
        queryDef.define(new AbandonmentUpdateActivitiesDeliveryStatusesUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onAppRevokeAccessScopesAppRevokeScopeError(AppRevokeAccessScopesAppRevokeScopeErrorQueryDefinition queryDef) {
        startInlineFragment("AppRevokeAccessScopesAppRevokeScopeError");
        queryDef.define(new AppRevokeAccessScopesAppRevokeScopeErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onAppSubscriptionTrialExtendUserError(AppSubscriptionTrialExtendUserErrorQueryDefinition queryDef) {
        startInlineFragment("AppSubscriptionTrialExtendUserError");
        queryDef.define(new AppSubscriptionTrialExtendUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onArticleCreateUserError(ArticleCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("ArticleCreateUserError");
        queryDef.define(new ArticleCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onArticleDeleteUserError(ArticleDeleteUserErrorQueryDefinition queryDef) {
        startInlineFragment("ArticleDeleteUserError");
        queryDef.define(new ArticleDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onArticleUpdateUserError(ArticleUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("ArticleUpdateUserError");
        queryDef.define(new ArticleUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onBillingAttemptUserError(BillingAttemptUserErrorQueryDefinition queryDef) {
        startInlineFragment("BillingAttemptUserError");
        queryDef.define(new BillingAttemptUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onBlogCreateUserError(BlogCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("BlogCreateUserError");
        queryDef.define(new BlogCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onBlogDeleteUserError(BlogDeleteUserErrorQueryDefinition queryDef) {
        startInlineFragment("BlogDeleteUserError");
        queryDef.define(new BlogDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onBlogUpdateUserError(BlogUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("BlogUpdateUserError");
        queryDef.define(new BlogUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onBulkMutationUserError(BulkMutationUserErrorQueryDefinition queryDef) {
        startInlineFragment("BulkMutationUserError");
        queryDef.define(new BulkMutationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onBulkOperationUserError(BulkOperationUserErrorQueryDefinition queryDef) {
        startInlineFragment("BulkOperationUserError");
        queryDef.define(new BulkOperationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onBulkProductResourceFeedbackCreateUserError(BulkProductResourceFeedbackCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("BulkProductResourceFeedbackCreateUserError");
        queryDef.define(new BulkProductResourceFeedbackCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onBusinessCustomerUserError(BusinessCustomerUserErrorQueryDefinition queryDef) {
        startInlineFragment("BusinessCustomerUserError");
        queryDef.define(new BusinessCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCarrierServiceCreateUserError(CarrierServiceCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("CarrierServiceCreateUserError");
        queryDef.define(new CarrierServiceCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCarrierServiceDeleteUserError(CarrierServiceDeleteUserErrorQueryDefinition queryDef) {
        startInlineFragment("CarrierServiceDeleteUserError");
        queryDef.define(new CarrierServiceDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCarrierServiceUpdateUserError(CarrierServiceUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("CarrierServiceUpdateUserError");
        queryDef.define(new CarrierServiceUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCartTransformCreateUserError(CartTransformCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("CartTransformCreateUserError");
        queryDef.define(new CartTransformCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCartTransformDeleteUserError(CartTransformDeleteUserErrorQueryDefinition queryDef) {
        startInlineFragment("CartTransformDeleteUserError");
        queryDef.define(new CartTransformDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCatalogUserError(CatalogUserErrorQueryDefinition queryDef) {
        startInlineFragment("CatalogUserError");
        queryDef.define(new CatalogUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCheckoutBrandingUpsertUserError(CheckoutBrandingUpsertUserErrorQueryDefinition queryDef) {
        startInlineFragment("CheckoutBrandingUpsertUserError");
        queryDef.define(new CheckoutBrandingUpsertUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCollectionAddProductsV2UserError(CollectionAddProductsV2UserErrorQueryDefinition queryDef) {
        startInlineFragment("CollectionAddProductsV2UserError");
        queryDef.define(new CollectionAddProductsV2UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCombinedListingUpdateUserError(CombinedListingUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("CombinedListingUpdateUserError");
        queryDef.define(new CombinedListingUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCommentApproveUserError(CommentApproveUserErrorQueryDefinition queryDef) {
        startInlineFragment("CommentApproveUserError");
        queryDef.define(new CommentApproveUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCommentDeleteUserError(CommentDeleteUserErrorQueryDefinition queryDef) {
        startInlineFragment("CommentDeleteUserError");
        queryDef.define(new CommentDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCommentNotSpamUserError(CommentNotSpamUserErrorQueryDefinition queryDef) {
        startInlineFragment("CommentNotSpamUserError");
        queryDef.define(new CommentNotSpamUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCommentSpamUserError(CommentSpamUserErrorQueryDefinition queryDef) {
        startInlineFragment("CommentSpamUserError");
        queryDef.define(new CommentSpamUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCustomerCancelDataErasureUserError(CustomerCancelDataErasureUserErrorQueryDefinition queryDef) {
        startInlineFragment("CustomerCancelDataErasureUserError");
        queryDef.define(new CustomerCancelDataErasureUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCustomerEmailMarketingConsentUpdateUserError(CustomerEmailMarketingConsentUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("CustomerEmailMarketingConsentUpdateUserError");
        queryDef.define(new CustomerEmailMarketingConsentUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCustomerMergeUserError(CustomerMergeUserErrorQueryDefinition queryDef) {
        startInlineFragment("CustomerMergeUserError");
        queryDef.define(new CustomerMergeUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCustomerPaymentMethodCreateFromDuplicationDataUserError(CustomerPaymentMethodCreateFromDuplicationDataUserErrorQueryDefinition queryDef) {
        startInlineFragment("CustomerPaymentMethodCreateFromDuplicationDataUserError");
        queryDef.define(new CustomerPaymentMethodCreateFromDuplicationDataUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCustomerPaymentMethodGetDuplicationDataUserError(CustomerPaymentMethodGetDuplicationDataUserErrorQueryDefinition queryDef) {
        startInlineFragment("CustomerPaymentMethodGetDuplicationDataUserError");
        queryDef.define(new CustomerPaymentMethodGetDuplicationDataUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCustomerPaymentMethodGetUpdateUrlUserError(CustomerPaymentMethodGetUpdateUrlUserErrorQueryDefinition queryDef) {
        startInlineFragment("CustomerPaymentMethodGetUpdateUrlUserError");
        queryDef.define(new CustomerPaymentMethodGetUpdateUrlUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCustomerPaymentMethodRemoteUserError(CustomerPaymentMethodRemoteUserErrorQueryDefinition queryDef) {
        startInlineFragment("CustomerPaymentMethodRemoteUserError");
        queryDef.define(new CustomerPaymentMethodRemoteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCustomerPaymentMethodUserError(CustomerPaymentMethodUserErrorQueryDefinition queryDef) {
        startInlineFragment("CustomerPaymentMethodUserError");
        queryDef.define(new CustomerPaymentMethodUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCustomerRequestDataErasureUserError(CustomerRequestDataErasureUserErrorQueryDefinition queryDef) {
        startInlineFragment("CustomerRequestDataErasureUserError");
        queryDef.define(new CustomerRequestDataErasureUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCustomerSegmentMembersQueryUserError(CustomerSegmentMembersQueryUserErrorQueryDefinition queryDef) {
        startInlineFragment("CustomerSegmentMembersQueryUserError");
        queryDef.define(new CustomerSegmentMembersQueryUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCustomerSendAccountInviteEmailUserError(CustomerSendAccountInviteEmailUserErrorQueryDefinition queryDef) {
        startInlineFragment("CustomerSendAccountInviteEmailUserError");
        queryDef.define(new CustomerSendAccountInviteEmailUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onCustomerSmsMarketingConsentError(CustomerSmsMarketingConsentErrorQueryDefinition queryDef) {
        startInlineFragment("CustomerSmsMarketingConsentError");
        queryDef.define(new CustomerSmsMarketingConsentErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onDataSaleOptOutUserError(DataSaleOptOutUserErrorQueryDefinition queryDef) {
        startInlineFragment("DataSaleOptOutUserError");
        queryDef.define(new DataSaleOptOutUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onDelegateAccessTokenCreateUserError(DelegateAccessTokenCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("DelegateAccessTokenCreateUserError");
        queryDef.define(new DelegateAccessTokenCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onDelegateAccessTokenDestroyUserError(DelegateAccessTokenDestroyUserErrorQueryDefinition queryDef) {
        startInlineFragment("DelegateAccessTokenDestroyUserError");
        queryDef.define(new DelegateAccessTokenDestroyUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onDeliveryCustomizationError(DeliveryCustomizationErrorQueryDefinition queryDef) {
        startInlineFragment("DeliveryCustomizationError");
        queryDef.define(new DeliveryCustomizationErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onDeliveryLocationLocalPickupSettingsError(DeliveryLocationLocalPickupSettingsErrorQueryDefinition queryDef) {
        startInlineFragment("DeliveryLocationLocalPickupSettingsError");
        queryDef.define(new DeliveryLocationLocalPickupSettingsErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onDeliveryPromiseProviderUpsertUserError(DeliveryPromiseProviderUpsertUserErrorQueryDefinition queryDef) {
        startInlineFragment("DeliveryPromiseProviderUpsertUserError");
        queryDef.define(new DeliveryPromiseProviderUpsertUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onDiscountUserError(DiscountUserErrorQueryDefinition queryDef) {
        startInlineFragment("DiscountUserError");
        queryDef.define(new DiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onDisputeEvidenceUpdateUserError(DisputeEvidenceUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("DisputeEvidenceUpdateUserError");
        queryDef.define(new DisputeEvidenceUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onErrorsServerPixelUserError(ErrorsServerPixelUserErrorQueryDefinition queryDef) {
        startInlineFragment("ErrorsServerPixelUserError");
        queryDef.define(new ErrorsServerPixelUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onErrorsWebPixelUserError(ErrorsWebPixelUserErrorQueryDefinition queryDef) {
        startInlineFragment("ErrorsWebPixelUserError");
        queryDef.define(new ErrorsWebPixelUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onFilesUserError(FilesUserErrorQueryDefinition queryDef) {
        startInlineFragment("FilesUserError");
        queryDef.define(new FilesUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onFulfillmentConstraintRuleCreateUserError(FulfillmentConstraintRuleCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("FulfillmentConstraintRuleCreateUserError");
        queryDef.define(new FulfillmentConstraintRuleCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onFulfillmentConstraintRuleDeleteUserError(FulfillmentConstraintRuleDeleteUserErrorQueryDefinition queryDef) {
        startInlineFragment("FulfillmentConstraintRuleDeleteUserError");
        queryDef.define(new FulfillmentConstraintRuleDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onFulfillmentConstraintRuleUpdateUserError(FulfillmentConstraintRuleUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("FulfillmentConstraintRuleUpdateUserError");
        queryDef.define(new FulfillmentConstraintRuleUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onFulfillmentOrderHoldUserError(FulfillmentOrderHoldUserErrorQueryDefinition queryDef) {
        startInlineFragment("FulfillmentOrderHoldUserError");
        queryDef.define(new FulfillmentOrderHoldUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onFulfillmentOrderLineItemsPreparedForPickupUserError(FulfillmentOrderLineItemsPreparedForPickupUserErrorQueryDefinition queryDef) {
        startInlineFragment("FulfillmentOrderLineItemsPreparedForPickupUserError");
        queryDef.define(new FulfillmentOrderLineItemsPreparedForPickupUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onFulfillmentOrderMergeUserError(FulfillmentOrderMergeUserErrorQueryDefinition queryDef) {
        startInlineFragment("FulfillmentOrderMergeUserError");
        queryDef.define(new FulfillmentOrderMergeUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onFulfillmentOrderReleaseHoldUserError(FulfillmentOrderReleaseHoldUserErrorQueryDefinition queryDef) {
        startInlineFragment("FulfillmentOrderReleaseHoldUserError");
        queryDef.define(new FulfillmentOrderReleaseHoldUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onFulfillmentOrderRescheduleUserError(FulfillmentOrderRescheduleUserErrorQueryDefinition queryDef) {
        startInlineFragment("FulfillmentOrderRescheduleUserError");
        queryDef.define(new FulfillmentOrderRescheduleUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onFulfillmentOrderSplitUserError(FulfillmentOrderSplitUserErrorQueryDefinition queryDef) {
        startInlineFragment("FulfillmentOrderSplitUserError");
        queryDef.define(new FulfillmentOrderSplitUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onFulfillmentOrdersSetFulfillmentDeadlineUserError(FulfillmentOrdersSetFulfillmentDeadlineUserErrorQueryDefinition queryDef) {
        startInlineFragment("FulfillmentOrdersSetFulfillmentDeadlineUserError");
        queryDef.define(new FulfillmentOrdersSetFulfillmentDeadlineUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onGiftCardDeactivateUserError(GiftCardDeactivateUserErrorQueryDefinition queryDef) {
        startInlineFragment("GiftCardDeactivateUserError");
        queryDef.define(new GiftCardDeactivateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onGiftCardSendNotificationToCustomerUserError(GiftCardSendNotificationToCustomerUserErrorQueryDefinition queryDef) {
        startInlineFragment("GiftCardSendNotificationToCustomerUserError");
        queryDef.define(new GiftCardSendNotificationToCustomerUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onGiftCardSendNotificationToRecipientUserError(GiftCardSendNotificationToRecipientUserErrorQueryDefinition queryDef) {
        startInlineFragment("GiftCardSendNotificationToRecipientUserError");
        queryDef.define(new GiftCardSendNotificationToRecipientUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onGiftCardTransactionUserError(GiftCardTransactionUserErrorQueryDefinition queryDef) {
        startInlineFragment("GiftCardTransactionUserError");
        queryDef.define(new GiftCardTransactionUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onGiftCardUserError(GiftCardUserErrorQueryDefinition queryDef) {
        startInlineFragment("GiftCardUserError");
        queryDef.define(new GiftCardUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onInventoryAdjustQuantitiesUserError(InventoryAdjustQuantitiesUserErrorQueryDefinition queryDef) {
        startInlineFragment("InventoryAdjustQuantitiesUserError");
        queryDef.define(new InventoryAdjustQuantitiesUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onInventoryBulkToggleActivationUserError(InventoryBulkToggleActivationUserErrorQueryDefinition queryDef) {
        startInlineFragment("InventoryBulkToggleActivationUserError");
        queryDef.define(new InventoryBulkToggleActivationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onInventoryMoveQuantitiesUserError(InventoryMoveQuantitiesUserErrorQueryDefinition queryDef) {
        startInlineFragment("InventoryMoveQuantitiesUserError");
        queryDef.define(new InventoryMoveQuantitiesUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onInventorySetOnHandQuantitiesUserError(InventorySetOnHandQuantitiesUserErrorQueryDefinition queryDef) {
        startInlineFragment("InventorySetOnHandQuantitiesUserError");
        queryDef.define(new InventorySetOnHandQuantitiesUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onInventorySetQuantitiesUserError(InventorySetQuantitiesUserErrorQueryDefinition queryDef) {
        startInlineFragment("InventorySetQuantitiesUserError");
        queryDef.define(new InventorySetQuantitiesUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onInventorySetScheduledChangesUserError(InventorySetScheduledChangesUserErrorQueryDefinition queryDef) {
        startInlineFragment("InventorySetScheduledChangesUserError");
        queryDef.define(new InventorySetScheduledChangesUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onLocationActivateUserError(LocationActivateUserErrorQueryDefinition queryDef) {
        startInlineFragment("LocationActivateUserError");
        queryDef.define(new LocationActivateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onLocationAddUserError(LocationAddUserErrorQueryDefinition queryDef) {
        startInlineFragment("LocationAddUserError");
        queryDef.define(new LocationAddUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onLocationDeactivateUserError(LocationDeactivateUserErrorQueryDefinition queryDef) {
        startInlineFragment("LocationDeactivateUserError");
        queryDef.define(new LocationDeactivateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onLocationDeleteUserError(LocationDeleteUserErrorQueryDefinition queryDef) {
        startInlineFragment("LocationDeleteUserError");
        queryDef.define(new LocationDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onLocationEditUserError(LocationEditUserErrorQueryDefinition queryDef) {
        startInlineFragment("LocationEditUserError");
        queryDef.define(new LocationEditUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onMarketCurrencySettingsUserError(MarketCurrencySettingsUserErrorQueryDefinition queryDef) {
        startInlineFragment("MarketCurrencySettingsUserError");
        queryDef.define(new MarketCurrencySettingsUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onMarketUserError(MarketUserErrorQueryDefinition queryDef) {
        startInlineFragment("MarketUserError");
        queryDef.define(new MarketUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onMarketingActivityUserError(MarketingActivityUserErrorQueryDefinition queryDef) {
        startInlineFragment("MarketingActivityUserError");
        queryDef.define(new MarketingActivityUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onMediaUserError(MediaUserErrorQueryDefinition queryDef) {
        startInlineFragment("MediaUserError");
        queryDef.define(new MediaUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onMenuCreateUserError(MenuCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("MenuCreateUserError");
        queryDef.define(new MenuCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onMenuDeleteUserError(MenuDeleteUserErrorQueryDefinition queryDef) {
        startInlineFragment("MenuDeleteUserError");
        queryDef.define(new MenuDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onMenuUpdateUserError(MenuUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("MenuUpdateUserError");
        queryDef.define(new MenuUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onMetafieldDefinitionCreateUserError(MetafieldDefinitionCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("MetafieldDefinitionCreateUserError");
        queryDef.define(new MetafieldDefinitionCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onMetafieldDefinitionDeleteUserError(MetafieldDefinitionDeleteUserErrorQueryDefinition queryDef) {
        startInlineFragment("MetafieldDefinitionDeleteUserError");
        queryDef.define(new MetafieldDefinitionDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onMetafieldDefinitionPinUserError(MetafieldDefinitionPinUserErrorQueryDefinition queryDef) {
        startInlineFragment("MetafieldDefinitionPinUserError");
        queryDef.define(new MetafieldDefinitionPinUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onMetafieldDefinitionUnpinUserError(MetafieldDefinitionUnpinUserErrorQueryDefinition queryDef) {
        startInlineFragment("MetafieldDefinitionUnpinUserError");
        queryDef.define(new MetafieldDefinitionUnpinUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onMetafieldDefinitionUpdateUserError(MetafieldDefinitionUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("MetafieldDefinitionUpdateUserError");
        queryDef.define(new MetafieldDefinitionUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onMetafieldsSetUserError(MetafieldsSetUserErrorQueryDefinition queryDef) {
        startInlineFragment("MetafieldsSetUserError");
        queryDef.define(new MetafieldsSetUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onMetaobjectUserError(MetaobjectUserErrorQueryDefinition queryDef) {
        startInlineFragment("MetaobjectUserError");
        queryDef.define(new MetaobjectUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onMobilePlatformApplicationUserError(MobilePlatformApplicationUserErrorQueryDefinition queryDef) {
        startInlineFragment("MobilePlatformApplicationUserError");
        queryDef.define(new MobilePlatformApplicationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onOnlineStoreThemeFilesUserErrors(OnlineStoreThemeFilesUserErrorsQueryDefinition queryDef) {
        startInlineFragment("OnlineStoreThemeFilesUserErrors");
        queryDef.define(new OnlineStoreThemeFilesUserErrorsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onOrderCancelUserError(OrderCancelUserErrorQueryDefinition queryDef) {
        startInlineFragment("OrderCancelUserError");
        queryDef.define(new OrderCancelUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onOrderCreateMandatePaymentUserError(OrderCreateMandatePaymentUserErrorQueryDefinition queryDef) {
        startInlineFragment("OrderCreateMandatePaymentUserError");
        queryDef.define(new OrderCreateMandatePaymentUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onOrderCreateUserError(OrderCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("OrderCreateUserError");
        queryDef.define(new OrderCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onOrderDeleteUserError(OrderDeleteUserErrorQueryDefinition queryDef) {
        startInlineFragment("OrderDeleteUserError");
        queryDef.define(new OrderDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onOrderEditAddShippingLineUserError(OrderEditAddShippingLineUserErrorQueryDefinition queryDef) {
        startInlineFragment("OrderEditAddShippingLineUserError");
        queryDef.define(new OrderEditAddShippingLineUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onOrderEditRemoveDiscountUserError(OrderEditRemoveDiscountUserErrorQueryDefinition queryDef) {
        startInlineFragment("OrderEditRemoveDiscountUserError");
        queryDef.define(new OrderEditRemoveDiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onOrderEditRemoveShippingLineUserError(OrderEditRemoveShippingLineUserErrorQueryDefinition queryDef) {
        startInlineFragment("OrderEditRemoveShippingLineUserError");
        queryDef.define(new OrderEditRemoveShippingLineUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onOrderEditUpdateDiscountUserError(OrderEditUpdateDiscountUserErrorQueryDefinition queryDef) {
        startInlineFragment("OrderEditUpdateDiscountUserError");
        queryDef.define(new OrderEditUpdateDiscountUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onOrderEditUpdateShippingLineUserError(OrderEditUpdateShippingLineUserErrorQueryDefinition queryDef) {
        startInlineFragment("OrderEditUpdateShippingLineUserError");
        queryDef.define(new OrderEditUpdateShippingLineUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onOrderInvoiceSendUserError(OrderInvoiceSendUserErrorQueryDefinition queryDef) {
        startInlineFragment("OrderInvoiceSendUserError");
        queryDef.define(new OrderInvoiceSendUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onOrderRiskAssessmentCreateUserError(OrderRiskAssessmentCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("OrderRiskAssessmentCreateUserError");
        queryDef.define(new OrderRiskAssessmentCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onPageCreateUserError(PageCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("PageCreateUserError");
        queryDef.define(new PageCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onPageDeleteUserError(PageDeleteUserErrorQueryDefinition queryDef) {
        startInlineFragment("PageDeleteUserError");
        queryDef.define(new PageDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onPageUpdateUserError(PageUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("PageUpdateUserError");
        queryDef.define(new PageUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onPaymentCustomizationError(PaymentCustomizationErrorQueryDefinition queryDef) {
        startInlineFragment("PaymentCustomizationError");
        queryDef.define(new PaymentCustomizationErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onPaymentReminderSendUserError(PaymentReminderSendUserErrorQueryDefinition queryDef) {
        startInlineFragment("PaymentReminderSendUserError");
        queryDef.define(new PaymentReminderSendUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onPaymentTermsCreateUserError(PaymentTermsCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("PaymentTermsCreateUserError");
        queryDef.define(new PaymentTermsCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onPaymentTermsDeleteUserError(PaymentTermsDeleteUserErrorQueryDefinition queryDef) {
        startInlineFragment("PaymentTermsDeleteUserError");
        queryDef.define(new PaymentTermsDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onPaymentTermsUpdateUserError(PaymentTermsUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("PaymentTermsUpdateUserError");
        queryDef.define(new PaymentTermsUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onPriceListFixedPricesByProductBulkUpdateUserError(PriceListFixedPricesByProductBulkUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("PriceListFixedPricesByProductBulkUpdateUserError");
        queryDef.define(new PriceListFixedPricesByProductBulkUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onPriceListPriceUserError(PriceListPriceUserErrorQueryDefinition queryDef) {
        startInlineFragment("PriceListPriceUserError");
        queryDef.define(new PriceListPriceUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onPriceListUserError(PriceListUserErrorQueryDefinition queryDef) {
        startInlineFragment("PriceListUserError");
        queryDef.define(new PriceListUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onProductBundleMutationUserError(ProductBundleMutationUserErrorQueryDefinition queryDef) {
        startInlineFragment("ProductBundleMutationUserError");
        queryDef.define(new ProductBundleMutationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onProductChangeStatusUserError(ProductChangeStatusUserErrorQueryDefinition queryDef) {
        startInlineFragment("ProductChangeStatusUserError");
        queryDef.define(new ProductChangeStatusUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onProductFeedCreateUserError(ProductFeedCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("ProductFeedCreateUserError");
        queryDef.define(new ProductFeedCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onProductFeedDeleteUserError(ProductFeedDeleteUserErrorQueryDefinition queryDef) {
        startInlineFragment("ProductFeedDeleteUserError");
        queryDef.define(new ProductFeedDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onProductFullSyncUserError(ProductFullSyncUserErrorQueryDefinition queryDef) {
        startInlineFragment("ProductFullSyncUserError");
        queryDef.define(new ProductFullSyncUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onProductOptionUpdateUserError(ProductOptionUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("ProductOptionUpdateUserError");
        queryDef.define(new ProductOptionUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onProductOptionsCreateUserError(ProductOptionsCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("ProductOptionsCreateUserError");
        queryDef.define(new ProductOptionsCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onProductOptionsDeleteUserError(ProductOptionsDeleteUserErrorQueryDefinition queryDef) {
        startInlineFragment("ProductOptionsDeleteUserError");
        queryDef.define(new ProductOptionsDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onProductOptionsReorderUserError(ProductOptionsReorderUserErrorQueryDefinition queryDef) {
        startInlineFragment("ProductOptionsReorderUserError");
        queryDef.define(new ProductOptionsReorderUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onProductSetUserError(ProductSetUserErrorQueryDefinition queryDef) {
        startInlineFragment("ProductSetUserError");
        queryDef.define(new ProductSetUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onProductVariantRelationshipBulkUpdateUserError(ProductVariantRelationshipBulkUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("ProductVariantRelationshipBulkUpdateUserError");
        queryDef.define(new ProductVariantRelationshipBulkUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onProductVariantsBulkCreateUserError(ProductVariantsBulkCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("ProductVariantsBulkCreateUserError");
        queryDef.define(new ProductVariantsBulkCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onProductVariantsBulkDeleteUserError(ProductVariantsBulkDeleteUserErrorQueryDefinition queryDef) {
        startInlineFragment("ProductVariantsBulkDeleteUserError");
        queryDef.define(new ProductVariantsBulkDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onProductVariantsBulkReorderUserError(ProductVariantsBulkReorderUserErrorQueryDefinition queryDef) {
        startInlineFragment("ProductVariantsBulkReorderUserError");
        queryDef.define(new ProductVariantsBulkReorderUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onProductVariantsBulkUpdateUserError(ProductVariantsBulkUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("ProductVariantsBulkUpdateUserError");
        queryDef.define(new ProductVariantsBulkUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onPubSubWebhookSubscriptionCreateUserError(PubSubWebhookSubscriptionCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("PubSubWebhookSubscriptionCreateUserError");
        queryDef.define(new PubSubWebhookSubscriptionCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onPubSubWebhookSubscriptionUpdateUserError(PubSubWebhookSubscriptionUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("PubSubWebhookSubscriptionUpdateUserError");
        queryDef.define(new PubSubWebhookSubscriptionUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onPublicationUserError(PublicationUserErrorQueryDefinition queryDef) {
        startInlineFragment("PublicationUserError");
        queryDef.define(new PublicationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onQuantityPricingByVariantUserError(QuantityPricingByVariantUserErrorQueryDefinition queryDef) {
        startInlineFragment("QuantityPricingByVariantUserError");
        queryDef.define(new QuantityPricingByVariantUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onQuantityRuleUserError(QuantityRuleUserErrorQueryDefinition queryDef) {
        startInlineFragment("QuantityRuleUserError");
        queryDef.define(new QuantityRuleUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onReturnUserError(ReturnUserErrorQueryDefinition queryDef) {
        startInlineFragment("ReturnUserError");
        queryDef.define(new ReturnUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onSellingPlanGroupUserError(SellingPlanGroupUserErrorQueryDefinition queryDef) {
        startInlineFragment("SellingPlanGroupUserError");
        queryDef.define(new SellingPlanGroupUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onShopPolicyUserError(ShopPolicyUserErrorQueryDefinition queryDef) {
        startInlineFragment("ShopPolicyUserError");
        queryDef.define(new ShopPolicyUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onShopResourceFeedbackCreateUserError(ShopResourceFeedbackCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("ShopResourceFeedbackCreateUserError");
        queryDef.define(new ShopResourceFeedbackCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onShopifyPaymentsPayoutAlternateCurrencyCreateUserError(ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("ShopifyPaymentsPayoutAlternateCurrencyCreateUserError");
        queryDef.define(new ShopifyPaymentsPayoutAlternateCurrencyCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onStandardMetafieldDefinitionEnableUserError(StandardMetafieldDefinitionEnableUserErrorQueryDefinition queryDef) {
        startInlineFragment("StandardMetafieldDefinitionEnableUserError");
        queryDef.define(new StandardMetafieldDefinitionEnableUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onStoreCreditAccountCreditUserError(StoreCreditAccountCreditUserErrorQueryDefinition queryDef) {
        startInlineFragment("StoreCreditAccountCreditUserError");
        queryDef.define(new StoreCreditAccountCreditUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onStoreCreditAccountDebitUserError(StoreCreditAccountDebitUserErrorQueryDefinition queryDef) {
        startInlineFragment("StoreCreditAccountDebitUserError");
        queryDef.define(new StoreCreditAccountDebitUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onSubscriptionBillingCycleBulkUserError(SubscriptionBillingCycleBulkUserErrorQueryDefinition queryDef) {
        startInlineFragment("SubscriptionBillingCycleBulkUserError");
        queryDef.define(new SubscriptionBillingCycleBulkUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onSubscriptionBillingCycleSkipUserError(SubscriptionBillingCycleSkipUserErrorQueryDefinition queryDef) {
        startInlineFragment("SubscriptionBillingCycleSkipUserError");
        queryDef.define(new SubscriptionBillingCycleSkipUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onSubscriptionBillingCycleUnskipUserError(SubscriptionBillingCycleUnskipUserErrorQueryDefinition queryDef) {
        startInlineFragment("SubscriptionBillingCycleUnskipUserError");
        queryDef.define(new SubscriptionBillingCycleUnskipUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onSubscriptionBillingCycleUserError(SubscriptionBillingCycleUserErrorQueryDefinition queryDef) {
        startInlineFragment("SubscriptionBillingCycleUserError");
        queryDef.define(new SubscriptionBillingCycleUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onSubscriptionContractStatusUpdateUserError(SubscriptionContractStatusUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("SubscriptionContractStatusUpdateUserError");
        queryDef.define(new SubscriptionContractStatusUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onSubscriptionContractUserError(SubscriptionContractUserErrorQueryDefinition queryDef) {
        startInlineFragment("SubscriptionContractUserError");
        queryDef.define(new SubscriptionContractUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onSubscriptionDraftUserError(SubscriptionDraftUserErrorQueryDefinition queryDef) {
        startInlineFragment("SubscriptionDraftUserError");
        queryDef.define(new SubscriptionDraftUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onTaxAppConfigureUserError(TaxAppConfigureUserErrorQueryDefinition queryDef) {
        startInlineFragment("TaxAppConfigureUserError");
        queryDef.define(new TaxAppConfigureUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onThemeCreateUserError(ThemeCreateUserErrorQueryDefinition queryDef) {
        startInlineFragment("ThemeCreateUserError");
        queryDef.define(new ThemeCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onThemeDeleteUserError(ThemeDeleteUserErrorQueryDefinition queryDef) {
        startInlineFragment("ThemeDeleteUserError");
        queryDef.define(new ThemeDeleteUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onThemePublishUserError(ThemePublishUserErrorQueryDefinition queryDef) {
        startInlineFragment("ThemePublishUserError");
        queryDef.define(new ThemePublishUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onThemeUpdateUserError(ThemeUpdateUserErrorQueryDefinition queryDef) {
        startInlineFragment("ThemeUpdateUserError");
        queryDef.define(new ThemeUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onTransactionVoidUserError(TransactionVoidUserErrorQueryDefinition queryDef) {
        startInlineFragment("TransactionVoidUserError");
        queryDef.define(new TransactionVoidUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onTranslationUserError(TranslationUserErrorQueryDefinition queryDef) {
        startInlineFragment("TranslationUserError");
        queryDef.define(new TranslationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onUrlRedirectBulkDeleteByIdsUserError(UrlRedirectBulkDeleteByIdsUserErrorQueryDefinition queryDef) {
        startInlineFragment("UrlRedirectBulkDeleteByIdsUserError");
        queryDef.define(new UrlRedirectBulkDeleteByIdsUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onUrlRedirectBulkDeleteBySavedSearchUserError(UrlRedirectBulkDeleteBySavedSearchUserErrorQueryDefinition queryDef) {
        startInlineFragment("UrlRedirectBulkDeleteBySavedSearchUserError");
        queryDef.define(new UrlRedirectBulkDeleteBySavedSearchUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onUrlRedirectBulkDeleteBySearchUserError(UrlRedirectBulkDeleteBySearchUserErrorQueryDefinition queryDef) {
        startInlineFragment("UrlRedirectBulkDeleteBySearchUserError");
        queryDef.define(new UrlRedirectBulkDeleteBySearchUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onUrlRedirectImportUserError(UrlRedirectImportUserErrorQueryDefinition queryDef) {
        startInlineFragment("UrlRedirectImportUserError");
        queryDef.define(new UrlRedirectImportUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onUrlRedirectUserError(UrlRedirectUserErrorQueryDefinition queryDef) {
        startInlineFragment("UrlRedirectUserError");
        queryDef.define(new UrlRedirectUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onUserError(UserErrorQueryDefinition queryDef) {
        startInlineFragment("UserError");
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public DisplayableErrorQuery onValidationUserError(ValidationUserErrorQueryDefinition queryDef) {
        startInlineFragment("ValidationUserError");
        queryDef.define(new ValidationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
