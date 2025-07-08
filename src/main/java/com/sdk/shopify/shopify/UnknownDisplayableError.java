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
* Represents an error in the input of a mutation.
*/
public class UnknownDisplayableError extends AbstractResponse<UnknownDisplayableError> implements DisplayableError {
    public UnknownDisplayableError() {
    }

    public UnknownDisplayableError(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "field": {
                    List<String> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<String> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(jsonAsString(element1, key));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "message": {
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

    public static DisplayableError create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "AbandonmentEmailStateUpdateUserError": {
                return new AbandonmentEmailStateUpdateUserError(fields);
            }

            case "AbandonmentUpdateActivitiesDeliveryStatusesUserError": {
                return new AbandonmentUpdateActivitiesDeliveryStatusesUserError(fields);
            }

            case "AppRevokeAccessScopesAppRevokeScopeError": {
                return new AppRevokeAccessScopesAppRevokeScopeError(fields);
            }

            case "AppSubscriptionTrialExtendUserError": {
                return new AppSubscriptionTrialExtendUserError(fields);
            }

            case "AppUninstallAppUninstallError": {
                return new AppUninstallAppUninstallError(fields);
            }

            case "ArticleCreateUserError": {
                return new ArticleCreateUserError(fields);
            }

            case "ArticleDeleteUserError": {
                return new ArticleDeleteUserError(fields);
            }

            case "ArticleUpdateUserError": {
                return new ArticleUpdateUserError(fields);
            }

            case "BillingAttemptUserError": {
                return new BillingAttemptUserError(fields);
            }

            case "BlogCreateUserError": {
                return new BlogCreateUserError(fields);
            }

            case "BlogDeleteUserError": {
                return new BlogDeleteUserError(fields);
            }

            case "BlogUpdateUserError": {
                return new BlogUpdateUserError(fields);
            }

            case "BulkMutationUserError": {
                return new BulkMutationUserError(fields);
            }

            case "BulkOperationUserError": {
                return new BulkOperationUserError(fields);
            }

            case "BulkProductResourceFeedbackCreateUserError": {
                return new BulkProductResourceFeedbackCreateUserError(fields);
            }

            case "BusinessCustomerUserError": {
                return new BusinessCustomerUserError(fields);
            }

            case "CarrierServiceCreateUserError": {
                return new CarrierServiceCreateUserError(fields);
            }

            case "CarrierServiceDeleteUserError": {
                return new CarrierServiceDeleteUserError(fields);
            }

            case "CarrierServiceUpdateUserError": {
                return new CarrierServiceUpdateUserError(fields);
            }

            case "CartTransformCreateUserError": {
                return new CartTransformCreateUserError(fields);
            }

            case "CartTransformDeleteUserError": {
                return new CartTransformDeleteUserError(fields);
            }

            case "CatalogUserError": {
                return new CatalogUserError(fields);
            }

            case "CheckoutBrandingUpsertUserError": {
                return new CheckoutBrandingUpsertUserError(fields);
            }

            case "CollectionAddProductsV2UserError": {
                return new CollectionAddProductsV2UserError(fields);
            }

            case "CombinedListingUpdateUserError": {
                return new CombinedListingUpdateUserError(fields);
            }

            case "CommentApproveUserError": {
                return new CommentApproveUserError(fields);
            }

            case "CommentDeleteUserError": {
                return new CommentDeleteUserError(fields);
            }

            case "CommentNotSpamUserError": {
                return new CommentNotSpamUserError(fields);
            }

            case "CommentSpamUserError": {
                return new CommentSpamUserError(fields);
            }

            case "ConsentPolicyError": {
                return new ConsentPolicyError(fields);
            }

            case "CustomerCancelDataErasureUserError": {
                return new CustomerCancelDataErasureUserError(fields);
            }

            case "CustomerEmailMarketingConsentUpdateUserError": {
                return new CustomerEmailMarketingConsentUpdateUserError(fields);
            }

            case "CustomerMergeUserError": {
                return new CustomerMergeUserError(fields);
            }

            case "CustomerPaymentMethodCreateFromDuplicationDataUserError": {
                return new CustomerPaymentMethodCreateFromDuplicationDataUserError(fields);
            }

            case "CustomerPaymentMethodGetDuplicationDataUserError": {
                return new CustomerPaymentMethodGetDuplicationDataUserError(fields);
            }

            case "CustomerPaymentMethodGetUpdateUrlUserError": {
                return new CustomerPaymentMethodGetUpdateUrlUserError(fields);
            }

            case "CustomerPaymentMethodRemoteUserError": {
                return new CustomerPaymentMethodRemoteUserError(fields);
            }

            case "CustomerPaymentMethodUserError": {
                return new CustomerPaymentMethodUserError(fields);
            }

            case "CustomerRequestDataErasureUserError": {
                return new CustomerRequestDataErasureUserError(fields);
            }

            case "CustomerSegmentMembersQueryUserError": {
                return new CustomerSegmentMembersQueryUserError(fields);
            }

            case "CustomerSendAccountInviteEmailUserError": {
                return new CustomerSendAccountInviteEmailUserError(fields);
            }

            case "CustomerSetUserError": {
                return new CustomerSetUserError(fields);
            }

            case "CustomerSmsMarketingConsentError": {
                return new CustomerSmsMarketingConsentError(fields);
            }

            case "DataSaleOptOutUserError": {
                return new DataSaleOptOutUserError(fields);
            }

            case "DelegateAccessTokenCreateUserError": {
                return new DelegateAccessTokenCreateUserError(fields);
            }

            case "DelegateAccessTokenDestroyUserError": {
                return new DelegateAccessTokenDestroyUserError(fields);
            }

            case "DeliveryCustomizationError": {
                return new DeliveryCustomizationError(fields);
            }

            case "DeliveryLocationLocalPickupSettingsError": {
                return new DeliveryLocationLocalPickupSettingsError(fields);
            }

            case "DeliveryPromiseProviderUpsertUserError": {
                return new DeliveryPromiseProviderUpsertUserError(fields);
            }

            case "DiscountUserError": {
                return new DiscountUserError(fields);
            }

            case "DisputeEvidenceUpdateUserError": {
                return new DisputeEvidenceUpdateUserError(fields);
            }

            case "ErrorsServerPixelUserError": {
                return new ErrorsServerPixelUserError(fields);
            }

            case "ErrorsWebPixelUserError": {
                return new ErrorsWebPixelUserError(fields);
            }

            case "FilesUserError": {
                return new FilesUserError(fields);
            }

            case "FulfillmentConstraintRuleCreateUserError": {
                return new FulfillmentConstraintRuleCreateUserError(fields);
            }

            case "FulfillmentConstraintRuleDeleteUserError": {
                return new FulfillmentConstraintRuleDeleteUserError(fields);
            }

            case "FulfillmentConstraintRuleUpdateUserError": {
                return new FulfillmentConstraintRuleUpdateUserError(fields);
            }

            case "FulfillmentOrderHoldUserError": {
                return new FulfillmentOrderHoldUserError(fields);
            }

            case "FulfillmentOrderLineItemsPreparedForPickupUserError": {
                return new FulfillmentOrderLineItemsPreparedForPickupUserError(fields);
            }

            case "FulfillmentOrderMergeUserError": {
                return new FulfillmentOrderMergeUserError(fields);
            }

            case "FulfillmentOrderReleaseHoldUserError": {
                return new FulfillmentOrderReleaseHoldUserError(fields);
            }

            case "FulfillmentOrderRescheduleUserError": {
                return new FulfillmentOrderRescheduleUserError(fields);
            }

            case "FulfillmentOrderSplitUserError": {
                return new FulfillmentOrderSplitUserError(fields);
            }

            case "FulfillmentOrdersSetFulfillmentDeadlineUserError": {
                return new FulfillmentOrdersSetFulfillmentDeadlineUserError(fields);
            }

            case "GiftCardDeactivateUserError": {
                return new GiftCardDeactivateUserError(fields);
            }

            case "GiftCardSendNotificationToCustomerUserError": {
                return new GiftCardSendNotificationToCustomerUserError(fields);
            }

            case "GiftCardSendNotificationToRecipientUserError": {
                return new GiftCardSendNotificationToRecipientUserError(fields);
            }

            case "GiftCardTransactionUserError": {
                return new GiftCardTransactionUserError(fields);
            }

            case "GiftCardUserError": {
                return new GiftCardUserError(fields);
            }

            case "InventoryAdjustQuantitiesUserError": {
                return new InventoryAdjustQuantitiesUserError(fields);
            }

            case "InventoryBulkToggleActivationUserError": {
                return new InventoryBulkToggleActivationUserError(fields);
            }

            case "InventoryMoveQuantitiesUserError": {
                return new InventoryMoveQuantitiesUserError(fields);
            }

            case "InventorySetOnHandQuantitiesUserError": {
                return new InventorySetOnHandQuantitiesUserError(fields);
            }

            case "InventorySetQuantitiesUserError": {
                return new InventorySetQuantitiesUserError(fields);
            }

            case "InventorySetScheduledChangesUserError": {
                return new InventorySetScheduledChangesUserError(fields);
            }

            case "InventoryShipmentAddItemsUserError": {
                return new InventoryShipmentAddItemsUserError(fields);
            }

            case "InventoryShipmentCreateInTransitUserError": {
                return new InventoryShipmentCreateInTransitUserError(fields);
            }

            case "InventoryShipmentCreateUserError": {
                return new InventoryShipmentCreateUserError(fields);
            }

            case "InventoryShipmentDeleteUserError": {
                return new InventoryShipmentDeleteUserError(fields);
            }

            case "InventoryShipmentMarkInTransitUserError": {
                return new InventoryShipmentMarkInTransitUserError(fields);
            }

            case "InventoryShipmentReceiveUserError": {
                return new InventoryShipmentReceiveUserError(fields);
            }

            case "InventoryShipmentRemoveItemsUserError": {
                return new InventoryShipmentRemoveItemsUserError(fields);
            }

            case "InventoryShipmentSetTrackingUserError": {
                return new InventoryShipmentSetTrackingUserError(fields);
            }

            case "InventoryShipmentUpdateItemQuantitiesUserError": {
                return new InventoryShipmentUpdateItemQuantitiesUserError(fields);
            }

            case "InventoryTransferCancelUserError": {
                return new InventoryTransferCancelUserError(fields);
            }

            case "InventoryTransferCreateAsReadyToShipUserError": {
                return new InventoryTransferCreateAsReadyToShipUserError(fields);
            }

            case "InventoryTransferCreateUserError": {
                return new InventoryTransferCreateUserError(fields);
            }

            case "InventoryTransferDeleteUserError": {
                return new InventoryTransferDeleteUserError(fields);
            }

            case "InventoryTransferDuplicateUserError": {
                return new InventoryTransferDuplicateUserError(fields);
            }

            case "InventoryTransferEditUserError": {
                return new InventoryTransferEditUserError(fields);
            }

            case "InventoryTransferMarkAsReadyToShipUserError": {
                return new InventoryTransferMarkAsReadyToShipUserError(fields);
            }

            case "InventoryTransferRemoveItemsUserError": {
                return new InventoryTransferRemoveItemsUserError(fields);
            }

            case "InventoryTransferSetItemsUserError": {
                return new InventoryTransferSetItemsUserError(fields);
            }

            case "LocationActivateUserError": {
                return new LocationActivateUserError(fields);
            }

            case "LocationAddUserError": {
                return new LocationAddUserError(fields);
            }

            case "LocationDeactivateUserError": {
                return new LocationDeactivateUserError(fields);
            }

            case "LocationDeleteUserError": {
                return new LocationDeleteUserError(fields);
            }

            case "LocationEditUserError": {
                return new LocationEditUserError(fields);
            }

            case "MarketCurrencySettingsUserError": {
                return new MarketCurrencySettingsUserError(fields);
            }

            case "MarketUserError": {
                return new MarketUserError(fields);
            }

            case "MarketingActivityUserError": {
                return new MarketingActivityUserError(fields);
            }

            case "MediaUserError": {
                return new MediaUserError(fields);
            }

            case "MenuCreateUserError": {
                return new MenuCreateUserError(fields);
            }

            case "MenuDeleteUserError": {
                return new MenuDeleteUserError(fields);
            }

            case "MenuUpdateUserError": {
                return new MenuUpdateUserError(fields);
            }

            case "MetafieldDefinitionCreateUserError": {
                return new MetafieldDefinitionCreateUserError(fields);
            }

            case "MetafieldDefinitionDeleteUserError": {
                return new MetafieldDefinitionDeleteUserError(fields);
            }

            case "MetafieldDefinitionPinUserError": {
                return new MetafieldDefinitionPinUserError(fields);
            }

            case "MetafieldDefinitionUnpinUserError": {
                return new MetafieldDefinitionUnpinUserError(fields);
            }

            case "MetafieldDefinitionUpdateUserError": {
                return new MetafieldDefinitionUpdateUserError(fields);
            }

            case "MetafieldsSetUserError": {
                return new MetafieldsSetUserError(fields);
            }

            case "MetaobjectUserError": {
                return new MetaobjectUserError(fields);
            }

            case "MobilePlatformApplicationUserError": {
                return new MobilePlatformApplicationUserError(fields);
            }

            case "OnlineStoreThemeFilesUserErrors": {
                return new OnlineStoreThemeFilesUserErrors(fields);
            }

            case "OrderCancelUserError": {
                return new OrderCancelUserError(fields);
            }

            case "OrderCreateMandatePaymentUserError": {
                return new OrderCreateMandatePaymentUserError(fields);
            }

            case "OrderCreateManualPaymentOrderCreateManualPaymentError": {
                return new OrderCreateManualPaymentOrderCreateManualPaymentError(fields);
            }

            case "OrderCreateUserError": {
                return new OrderCreateUserError(fields);
            }

            case "OrderCustomerRemoveUserError": {
                return new OrderCustomerRemoveUserError(fields);
            }

            case "OrderCustomerSetUserError": {
                return new OrderCustomerSetUserError(fields);
            }

            case "OrderDeleteUserError": {
                return new OrderDeleteUserError(fields);
            }

            case "OrderEditAddShippingLineUserError": {
                return new OrderEditAddShippingLineUserError(fields);
            }

            case "OrderEditRemoveDiscountUserError": {
                return new OrderEditRemoveDiscountUserError(fields);
            }

            case "OrderEditRemoveShippingLineUserError": {
                return new OrderEditRemoveShippingLineUserError(fields);
            }

            case "OrderEditUpdateDiscountUserError": {
                return new OrderEditUpdateDiscountUserError(fields);
            }

            case "OrderEditUpdateShippingLineUserError": {
                return new OrderEditUpdateShippingLineUserError(fields);
            }

            case "OrderInvoiceSendUserError": {
                return new OrderInvoiceSendUserError(fields);
            }

            case "OrderRiskAssessmentCreateUserError": {
                return new OrderRiskAssessmentCreateUserError(fields);
            }

            case "PageCreateUserError": {
                return new PageCreateUserError(fields);
            }

            case "PageDeleteUserError": {
                return new PageDeleteUserError(fields);
            }

            case "PageUpdateUserError": {
                return new PageUpdateUserError(fields);
            }

            case "PaymentCustomizationError": {
                return new PaymentCustomizationError(fields);
            }

            case "PaymentReminderSendUserError": {
                return new PaymentReminderSendUserError(fields);
            }

            case "PaymentTermsCreateUserError": {
                return new PaymentTermsCreateUserError(fields);
            }

            case "PaymentTermsDeleteUserError": {
                return new PaymentTermsDeleteUserError(fields);
            }

            case "PaymentTermsUpdateUserError": {
                return new PaymentTermsUpdateUserError(fields);
            }

            case "PriceListFixedPricesByProductBulkUpdateUserError": {
                return new PriceListFixedPricesByProductBulkUpdateUserError(fields);
            }

            case "PriceListPriceUserError": {
                return new PriceListPriceUserError(fields);
            }

            case "PriceListUserError": {
                return new PriceListUserError(fields);
            }

            case "PrivacyFeaturesDisableUserError": {
                return new PrivacyFeaturesDisableUserError(fields);
            }

            case "ProductBundleMutationUserError": {
                return new ProductBundleMutationUserError(fields);
            }

            case "ProductChangeStatusUserError": {
                return new ProductChangeStatusUserError(fields);
            }

            case "ProductFeedCreateUserError": {
                return new ProductFeedCreateUserError(fields);
            }

            case "ProductFeedDeleteUserError": {
                return new ProductFeedDeleteUserError(fields);
            }

            case "ProductFullSyncUserError": {
                return new ProductFullSyncUserError(fields);
            }

            case "ProductOptionUpdateUserError": {
                return new ProductOptionUpdateUserError(fields);
            }

            case "ProductOptionsCreateUserError": {
                return new ProductOptionsCreateUserError(fields);
            }

            case "ProductOptionsDeleteUserError": {
                return new ProductOptionsDeleteUserError(fields);
            }

            case "ProductOptionsReorderUserError": {
                return new ProductOptionsReorderUserError(fields);
            }

            case "ProductSetUserError": {
                return new ProductSetUserError(fields);
            }

            case "ProductVariantRelationshipBulkUpdateUserError": {
                return new ProductVariantRelationshipBulkUpdateUserError(fields);
            }

            case "ProductVariantsBulkCreateUserError": {
                return new ProductVariantsBulkCreateUserError(fields);
            }

            case "ProductVariantsBulkDeleteUserError": {
                return new ProductVariantsBulkDeleteUserError(fields);
            }

            case "ProductVariantsBulkReorderUserError": {
                return new ProductVariantsBulkReorderUserError(fields);
            }

            case "ProductVariantsBulkUpdateUserError": {
                return new ProductVariantsBulkUpdateUserError(fields);
            }

            case "PubSubWebhookSubscriptionCreateUserError": {
                return new PubSubWebhookSubscriptionCreateUserError(fields);
            }

            case "PubSubWebhookSubscriptionUpdateUserError": {
                return new PubSubWebhookSubscriptionUpdateUserError(fields);
            }

            case "PublicationUserError": {
                return new PublicationUserError(fields);
            }

            case "QuantityPricingByVariantUserError": {
                return new QuantityPricingByVariantUserError(fields);
            }

            case "QuantityRuleUserError": {
                return new QuantityRuleUserError(fields);
            }

            case "ReturnUserError": {
                return new ReturnUserError(fields);
            }

            case "SellingPlanGroupUserError": {
                return new SellingPlanGroupUserError(fields);
            }

            case "ShopPolicyUserError": {
                return new ShopPolicyUserError(fields);
            }

            case "ShopResourceFeedbackCreateUserError": {
                return new ShopResourceFeedbackCreateUserError(fields);
            }

            case "ShopifyPaymentsPayoutAlternateCurrencyCreateUserError": {
                return new ShopifyPaymentsPayoutAlternateCurrencyCreateUserError(fields);
            }

            case "StandardMetafieldDefinitionEnableUserError": {
                return new StandardMetafieldDefinitionEnableUserError(fields);
            }

            case "StoreCreditAccountCreditUserError": {
                return new StoreCreditAccountCreditUserError(fields);
            }

            case "StoreCreditAccountDebitUserError": {
                return new StoreCreditAccountDebitUserError(fields);
            }

            case "SubscriptionBillingCycleBulkUserError": {
                return new SubscriptionBillingCycleBulkUserError(fields);
            }

            case "SubscriptionBillingCycleSkipUserError": {
                return new SubscriptionBillingCycleSkipUserError(fields);
            }

            case "SubscriptionBillingCycleUnskipUserError": {
                return new SubscriptionBillingCycleUnskipUserError(fields);
            }

            case "SubscriptionBillingCycleUserError": {
                return new SubscriptionBillingCycleUserError(fields);
            }

            case "SubscriptionContractStatusUpdateUserError": {
                return new SubscriptionContractStatusUpdateUserError(fields);
            }

            case "SubscriptionContractUserError": {
                return new SubscriptionContractUserError(fields);
            }

            case "SubscriptionDraftUserError": {
                return new SubscriptionDraftUserError(fields);
            }

            case "TaxAppConfigureUserError": {
                return new TaxAppConfigureUserError(fields);
            }

            case "ThemeCreateUserError": {
                return new ThemeCreateUserError(fields);
            }

            case "ThemeDeleteUserError": {
                return new ThemeDeleteUserError(fields);
            }

            case "ThemePublishUserError": {
                return new ThemePublishUserError(fields);
            }

            case "ThemeUpdateUserError": {
                return new ThemeUpdateUserError(fields);
            }

            case "TransactionVoidUserError": {
                return new TransactionVoidUserError(fields);
            }

            case "TranslationUserError": {
                return new TranslationUserError(fields);
            }

            case "UrlRedirectBulkDeleteByIdsUserError": {
                return new UrlRedirectBulkDeleteByIdsUserError(fields);
            }

            case "UrlRedirectBulkDeleteBySavedSearchUserError": {
                return new UrlRedirectBulkDeleteBySavedSearchUserError(fields);
            }

            case "UrlRedirectBulkDeleteBySearchUserError": {
                return new UrlRedirectBulkDeleteBySearchUserError(fields);
            }

            case "UrlRedirectImportUserError": {
                return new UrlRedirectImportUserError(fields);
            }

            case "UrlRedirectUserError": {
                return new UrlRedirectUserError(fields);
            }

            case "UserError": {
                return new UserError(fields);
            }

            case "ValidationUserError": {
                return new ValidationUserError(fields);
            }

            default: {
                return new UnknownDisplayableError(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The path to the input field that caused the error.
    */

    public List<String> getField() {
        return (List<String>) get("field");
    }

    public UnknownDisplayableError setField(List<String> arg) {
        optimisticData.put(getKey("field"), arg);
        return this;
    }

    /**
    * The error message.
    */

    public String getMessage() {
        return (String) get("message");
    }

    public UnknownDisplayableError setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "field": return false;

            case "message": return false;

            default: return false;
        }
    }
}

