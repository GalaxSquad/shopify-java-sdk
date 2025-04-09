// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The schema's entry point for all mutation operations.
*/
public class Mutation extends AbstractResponse<Mutation> {
    public Mutation() {
    }

    public Mutation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "abandonmentUpdateActivitiesDeliveryStatuses": {
                    AbandonmentUpdateActivitiesDeliveryStatusesPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AbandonmentUpdateActivitiesDeliveryStatusesPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appPurchaseOneTimeCreate": {
                    AppPurchaseOneTimeCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppPurchaseOneTimeCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appRevokeAccessScopes": {
                    AppRevokeAccessScopesPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppRevokeAccessScopesPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appSubscriptionCancel": {
                    AppSubscriptionCancelPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppSubscriptionCancelPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appSubscriptionCreate": {
                    AppSubscriptionCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppSubscriptionCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appSubscriptionLineItemUpdate": {
                    AppSubscriptionLineItemUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppSubscriptionLineItemUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appSubscriptionTrialExtend": {
                    AppSubscriptionTrialExtendPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppSubscriptionTrialExtendPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "appUsageRecordCreate": {
                    AppUsageRecordCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppUsageRecordCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "articleCreate": {
                    ArticleCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ArticleCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "articleDelete": {
                    ArticleDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ArticleDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "articleUpdate": {
                    ArticleUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ArticleUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "blogCreate": {
                    BlogCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BlogCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "blogDelete": {
                    BlogDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BlogDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "blogUpdate": {
                    BlogUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BlogUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "bulkOperationCancel": {
                    BulkOperationCancelPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BulkOperationCancelPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "bulkOperationRunMutation": {
                    BulkOperationRunMutationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BulkOperationRunMutationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "bulkOperationRunQuery": {
                    BulkOperationRunQueryPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BulkOperationRunQueryPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "bulkProductResourceFeedbackCreate": {
                    BulkProductResourceFeedbackCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BulkProductResourceFeedbackCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "carrierServiceCreate": {
                    CarrierServiceCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CarrierServiceCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "carrierServiceDelete": {
                    CarrierServiceDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CarrierServiceDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "carrierServiceUpdate": {
                    CarrierServiceUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CarrierServiceUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cartTransformCreate": {
                    CartTransformCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CartTransformCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cartTransformDelete": {
                    CartTransformDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CartTransformDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "catalogContextUpdate": {
                    CatalogContextUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CatalogContextUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "catalogCreate": {
                    CatalogCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CatalogCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "catalogDelete": {
                    CatalogDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CatalogDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "catalogUpdate": {
                    CatalogUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CatalogUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "checkoutBrandingUpsert": {
                    CheckoutBrandingUpsertPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingUpsertPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "collectionAddProducts": {
                    CollectionAddProductsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CollectionAddProductsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "collectionAddProductsV2": {
                    CollectionAddProductsV2Payload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CollectionAddProductsV2Payload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "collectionCreate": {
                    CollectionCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CollectionCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "collectionDelete": {
                    CollectionDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CollectionDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "collectionRemoveProducts": {
                    CollectionRemoveProductsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CollectionRemoveProductsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "collectionReorderProducts": {
                    CollectionReorderProductsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CollectionReorderProductsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "collectionUpdate": {
                    CollectionUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CollectionUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "combinedListingUpdate": {
                    CombinedListingUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CombinedListingUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "commentApprove": {
                    CommentApprovePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CommentApprovePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "commentDelete": {
                    CommentDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CommentDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "commentNotSpam": {
                    CommentNotSpamPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CommentNotSpamPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "commentSpam": {
                    CommentSpamPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CommentSpamPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companiesDelete": {
                    CompaniesDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompaniesDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyAddressDelete": {
                    CompanyAddressDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyAddressDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyAssignCustomerAsContact": {
                    CompanyAssignCustomerAsContactPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyAssignCustomerAsContactPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyAssignMainContact": {
                    CompanyAssignMainContactPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyAssignMainContactPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyContactAssignRole": {
                    CompanyContactAssignRolePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyContactAssignRolePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyContactAssignRoles": {
                    CompanyContactAssignRolesPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyContactAssignRolesPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyContactCreate": {
                    CompanyContactCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyContactCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyContactDelete": {
                    CompanyContactDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyContactDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyContactRemoveFromCompany": {
                    CompanyContactRemoveFromCompanyPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyContactRemoveFromCompanyPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyContactRevokeRole": {
                    CompanyContactRevokeRolePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyContactRevokeRolePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyContactRevokeRoles": {
                    CompanyContactRevokeRolesPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyContactRevokeRolesPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyContactSendWelcomeEmail": {
                    CompanyContactSendWelcomeEmailPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyContactSendWelcomeEmailPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyContactUpdate": {
                    CompanyContactUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyContactUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyContactsDelete": {
                    CompanyContactsDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyContactsDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyCreate": {
                    CompanyCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyDelete": {
                    CompanyDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyLocationAssignAddress": {
                    CompanyLocationAssignAddressPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyLocationAssignAddressPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyLocationAssignRoles": {
                    CompanyLocationAssignRolesPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyLocationAssignRolesPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyLocationAssignStaffMembers": {
                    CompanyLocationAssignStaffMembersPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyLocationAssignStaffMembersPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyLocationCreate": {
                    CompanyLocationCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyLocationCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyLocationDelete": {
                    CompanyLocationDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyLocationDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyLocationRemoveStaffMembers": {
                    CompanyLocationRemoveStaffMembersPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyLocationRemoveStaffMembersPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyLocationRevokeRoles": {
                    CompanyLocationRevokeRolesPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyLocationRevokeRolesPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyLocationTaxSettingsUpdate": {
                    CompanyLocationTaxSettingsUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyLocationTaxSettingsUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyLocationUpdate": {
                    CompanyLocationUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyLocationUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyLocationsDelete": {
                    CompanyLocationsDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyLocationsDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyRevokeMainContact": {
                    CompanyRevokeMainContactPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyRevokeMainContactPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "companyUpdate": {
                    CompanyUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerAddTaxExemptions": {
                    CustomerAddTaxExemptionsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerAddTaxExemptionsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerCancelDataErasure": {
                    CustomerCancelDataErasurePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerCancelDataErasurePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerCreate": {
                    CustomerCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerDelete": {
                    CustomerDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerEmailMarketingConsentUpdate": {
                    CustomerEmailMarketingConsentUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerEmailMarketingConsentUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerGenerateAccountActivationUrl": {
                    CustomerGenerateAccountActivationUrlPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerGenerateAccountActivationUrlPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerMerge": {
                    CustomerMergePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerMergePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerPaymentMethodCreateFromDuplicationData": {
                    CustomerPaymentMethodCreateFromDuplicationDataPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPaymentMethodCreateFromDuplicationDataPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerPaymentMethodCreditCardCreate": {
                    CustomerPaymentMethodCreditCardCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPaymentMethodCreditCardCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerPaymentMethodCreditCardUpdate": {
                    CustomerPaymentMethodCreditCardUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPaymentMethodCreditCardUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerPaymentMethodGetDuplicationData": {
                    CustomerPaymentMethodGetDuplicationDataPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPaymentMethodGetDuplicationDataPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerPaymentMethodGetUpdateUrl": {
                    CustomerPaymentMethodGetUpdateUrlPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPaymentMethodGetUpdateUrlPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerPaymentMethodPaypalBillingAgreementCreate": {
                    CustomerPaymentMethodPaypalBillingAgreementCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPaymentMethodPaypalBillingAgreementCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerPaymentMethodPaypalBillingAgreementUpdate": {
                    CustomerPaymentMethodPaypalBillingAgreementUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPaymentMethodPaypalBillingAgreementUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerPaymentMethodRemoteCreate": {
                    CustomerPaymentMethodRemoteCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPaymentMethodRemoteCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerPaymentMethodRevoke": {
                    CustomerPaymentMethodRevokePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPaymentMethodRevokePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerPaymentMethodSendUpdateEmail": {
                    CustomerPaymentMethodSendUpdateEmailPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPaymentMethodSendUpdateEmailPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerRemoveTaxExemptions": {
                    CustomerRemoveTaxExemptionsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerRemoveTaxExemptionsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerReplaceTaxExemptions": {
                    CustomerReplaceTaxExemptionsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerReplaceTaxExemptionsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerRequestDataErasure": {
                    CustomerRequestDataErasurePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerRequestDataErasurePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerSegmentMembersQueryCreate": {
                    CustomerSegmentMembersQueryCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerSegmentMembersQueryCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerSendAccountInviteEmail": {
                    CustomerSendAccountInviteEmailPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerSendAccountInviteEmailPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerSmsMarketingConsentUpdate": {
                    CustomerSmsMarketingConsentUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerSmsMarketingConsentUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerUpdate": {
                    CustomerUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerUpdateDefaultAddress": {
                    CustomerUpdateDefaultAddressPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerUpdateDefaultAddressPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dataSaleOptOut": {
                    DataSaleOptOutPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DataSaleOptOutPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "delegateAccessTokenCreate": {
                    DelegateAccessTokenCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DelegateAccessTokenCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "delegateAccessTokenDestroy": {
                    DelegateAccessTokenDestroyPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DelegateAccessTokenDestroyPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryCustomizationActivation": {
                    DeliveryCustomizationActivationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryCustomizationActivationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryCustomizationCreate": {
                    DeliveryCustomizationCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryCustomizationCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryCustomizationDelete": {
                    DeliveryCustomizationDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryCustomizationDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryCustomizationUpdate": {
                    DeliveryCustomizationUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryCustomizationUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryProfileCreate": {
                    DeliveryProfileCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryProfileCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryProfileRemove": {
                    DeliveryProfileRemovePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryProfileRemovePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryProfileUpdate": {
                    DeliveryProfileUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryProfileUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryPromiseParticipantsUpdate": {
                    DeliveryPromiseParticipantsUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryPromiseParticipantsUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryPromiseProviderUpsert": {
                    DeliveryPromiseProviderUpsertPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryPromiseProviderUpsertPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliverySettingUpdate": {
                    DeliverySettingUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliverySettingUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deliveryShippingOriginAssign": {
                    DeliveryShippingOriginAssignPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeliveryShippingOriginAssignPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountAutomaticActivate": {
                    DiscountAutomaticActivatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountAutomaticActivatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountAutomaticAppCreate": {
                    DiscountAutomaticAppCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountAutomaticAppCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountAutomaticAppUpdate": {
                    DiscountAutomaticAppUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountAutomaticAppUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountAutomaticBasicCreate": {
                    DiscountAutomaticBasicCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountAutomaticBasicCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountAutomaticBasicUpdate": {
                    DiscountAutomaticBasicUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountAutomaticBasicUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountAutomaticBulkDelete": {
                    DiscountAutomaticBulkDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountAutomaticBulkDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountAutomaticBxgyCreate": {
                    DiscountAutomaticBxgyCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountAutomaticBxgyCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountAutomaticBxgyUpdate": {
                    DiscountAutomaticBxgyUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountAutomaticBxgyUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountAutomaticDeactivate": {
                    DiscountAutomaticDeactivatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountAutomaticDeactivatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountAutomaticDelete": {
                    DiscountAutomaticDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountAutomaticDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountAutomaticFreeShippingCreate": {
                    DiscountAutomaticFreeShippingCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountAutomaticFreeShippingCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountAutomaticFreeShippingUpdate": {
                    DiscountAutomaticFreeShippingUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountAutomaticFreeShippingUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodeActivate": {
                    DiscountCodeActivatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeActivatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodeAppCreate": {
                    DiscountCodeAppCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeAppCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodeAppUpdate": {
                    DiscountCodeAppUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeAppUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodeBasicCreate": {
                    DiscountCodeBasicCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeBasicCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodeBasicUpdate": {
                    DiscountCodeBasicUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeBasicUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodeBulkActivate": {
                    DiscountCodeBulkActivatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeBulkActivatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodeBulkDeactivate": {
                    DiscountCodeBulkDeactivatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeBulkDeactivatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodeBulkDelete": {
                    DiscountCodeBulkDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeBulkDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodeBxgyCreate": {
                    DiscountCodeBxgyCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeBxgyCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodeBxgyUpdate": {
                    DiscountCodeBxgyUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeBxgyUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodeDeactivate": {
                    DiscountCodeDeactivatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeDeactivatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodeDelete": {
                    DiscountCodeDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodeFreeShippingCreate": {
                    DiscountCodeFreeShippingCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeFreeShippingCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodeFreeShippingUpdate": {
                    DiscountCodeFreeShippingUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeFreeShippingUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountCodeRedeemCodeBulkDelete": {
                    DiscountCodeRedeemCodeBulkDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountCodeRedeemCodeBulkDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountRedeemCodeBulkAdd": {
                    DiscountRedeemCodeBulkAddPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DiscountRedeemCodeBulkAddPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "disputeEvidenceUpdate": {
                    DisputeEvidenceUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DisputeEvidenceUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrderBulkAddTags": {
                    DraftOrderBulkAddTagsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrderBulkAddTagsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrderBulkDelete": {
                    DraftOrderBulkDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrderBulkDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrderBulkRemoveTags": {
                    DraftOrderBulkRemoveTagsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrderBulkRemoveTagsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrderCalculate": {
                    DraftOrderCalculatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrderCalculatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrderComplete": {
                    DraftOrderCompletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrderCompletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrderCreate": {
                    DraftOrderCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrderCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrderCreateFromOrder": {
                    DraftOrderCreateFromOrderPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrderCreateFromOrderPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrderCreateMerchantCheckout": {
                    DraftOrderCreateMerchantCheckoutPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrderCreateMerchantCheckoutPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrderDelete": {
                    DraftOrderDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrderDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrderDuplicate": {
                    DraftOrderDuplicatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrderDuplicatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrderInvoicePreview": {
                    DraftOrderInvoicePreviewPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrderInvoicePreviewPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrderInvoiceSend": {
                    DraftOrderInvoiceSendPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrderInvoiceSendPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "draftOrderUpdate": {
                    DraftOrderUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DraftOrderUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "eventBridgeServerPixelUpdate": {
                    EventBridgeServerPixelUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new EventBridgeServerPixelUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "eventBridgeWebhookSubscriptionCreate": {
                    EventBridgeWebhookSubscriptionCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new EventBridgeWebhookSubscriptionCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "eventBridgeWebhookSubscriptionUpdate": {
                    EventBridgeWebhookSubscriptionUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new EventBridgeWebhookSubscriptionUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fileAcknowledgeUpdateFailed": {
                    FileAcknowledgeUpdateFailedPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FileAcknowledgeUpdateFailedPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fileCreate": {
                    FileCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FileCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fileDelete": {
                    FileDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FileDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fileUpdate": {
                    FileUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FileUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "flowGenerateSignature": {
                    FlowGenerateSignaturePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FlowGenerateSignaturePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "flowTriggerReceive": {
                    FlowTriggerReceivePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FlowTriggerReceivePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentCancel": {
                    FulfillmentCancelPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentCancelPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentConstraintRuleCreate": {
                    FulfillmentConstraintRuleCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentConstraintRuleCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentConstraintRuleDelete": {
                    FulfillmentConstraintRuleDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentConstraintRuleDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentConstraintRuleUpdate": {
                    FulfillmentConstraintRuleUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentConstraintRuleUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentCreate": {
                    FulfillmentCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentEventCreate": {
                    FulfillmentEventCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentEventCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrderAcceptCancellationRequest": {
                    FulfillmentOrderAcceptCancellationRequestPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderAcceptCancellationRequestPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrderAcceptFulfillmentRequest": {
                    FulfillmentOrderAcceptFulfillmentRequestPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderAcceptFulfillmentRequestPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrderCancel": {
                    FulfillmentOrderCancelPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderCancelPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrderClose": {
                    FulfillmentOrderClosePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderClosePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrderHold": {
                    FulfillmentOrderHoldPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderHoldPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrderLineItemsPreparedForPickup": {
                    FulfillmentOrderLineItemsPreparedForPickupPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderLineItemsPreparedForPickupPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrderMerge": {
                    FulfillmentOrderMergePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderMergePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrderMove": {
                    FulfillmentOrderMovePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderMovePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrderOpen": {
                    FulfillmentOrderOpenPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderOpenPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrderRejectCancellationRequest": {
                    FulfillmentOrderRejectCancellationRequestPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderRejectCancellationRequestPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrderRejectFulfillmentRequest": {
                    FulfillmentOrderRejectFulfillmentRequestPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderRejectFulfillmentRequestPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrderReleaseHold": {
                    FulfillmentOrderReleaseHoldPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderReleaseHoldPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrderReschedule": {
                    FulfillmentOrderReschedulePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderReschedulePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrderSplit": {
                    FulfillmentOrderSplitPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderSplitPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrderSubmitCancellationRequest": {
                    FulfillmentOrderSubmitCancellationRequestPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderSubmitCancellationRequestPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrderSubmitFulfillmentRequest": {
                    FulfillmentOrderSubmitFulfillmentRequestPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrderSubmitFulfillmentRequestPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentOrdersSetFulfillmentDeadline": {
                    FulfillmentOrdersSetFulfillmentDeadlinePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentOrdersSetFulfillmentDeadlinePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentServiceCreate": {
                    FulfillmentServiceCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentServiceCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentServiceDelete": {
                    FulfillmentServiceDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentServiceDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentServiceUpdate": {
                    FulfillmentServiceUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentServiceUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fulfillmentTrackingInfoUpdate": {
                    FulfillmentTrackingInfoUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentTrackingInfoUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftCardCreate": {
                    GiftCardCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftCardCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftCardCredit": {
                    GiftCardCreditPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftCardCreditPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftCardDeactivate": {
                    GiftCardDeactivatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftCardDeactivatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftCardDebit": {
                    GiftCardDebitPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftCardDebitPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftCardSendNotificationToCustomer": {
                    GiftCardSendNotificationToCustomerPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftCardSendNotificationToCustomerPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftCardSendNotificationToRecipient": {
                    GiftCardSendNotificationToRecipientPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftCardSendNotificationToRecipientPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftCardUpdate": {
                    GiftCardUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftCardUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inventoryActivate": {
                    InventoryActivatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryActivatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inventoryAdjustQuantities": {
                    InventoryAdjustQuantitiesPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryAdjustQuantitiesPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inventoryBulkToggleActivation": {
                    InventoryBulkToggleActivationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryBulkToggleActivationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inventoryDeactivate": {
                    InventoryDeactivatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryDeactivatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inventoryItemUpdate": {
                    InventoryItemUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryItemUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inventoryMoveQuantities": {
                    InventoryMoveQuantitiesPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventoryMoveQuantitiesPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inventorySetQuantities": {
                    InventorySetQuantitiesPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventorySetQuantitiesPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inventorySetScheduledChanges": {
                    InventorySetScheduledChangesPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new InventorySetScheduledChangesPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locationActivate": {
                    LocationActivatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LocationActivatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locationAdd": {
                    LocationAddPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LocationAddPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locationDeactivate": {
                    LocationDeactivatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LocationDeactivatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locationDelete": {
                    LocationDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LocationDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locationEdit": {
                    LocationEditPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LocationEditPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locationLocalPickupDisable": {
                    LocationLocalPickupDisablePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LocationLocalPickupDisablePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locationLocalPickupEnable": {
                    LocationLocalPickupEnablePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LocationLocalPickupEnablePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketCreate": {
                    MarketCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketCurrencySettingsUpdate": {
                    MarketCurrencySettingsUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketCurrencySettingsUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketDelete": {
                    MarketDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketLocalizationsRegister": {
                    MarketLocalizationsRegisterPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketLocalizationsRegisterPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketLocalizationsRemove": {
                    MarketLocalizationsRemovePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketLocalizationsRemovePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketUpdate": {
                    MarketUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketingActivitiesDeleteAllExternal": {
                    MarketingActivitiesDeleteAllExternalPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketingActivitiesDeleteAllExternalPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketingActivityCreate": {
                    MarketingActivityCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketingActivityCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketingActivityCreateExternal": {
                    MarketingActivityCreateExternalPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketingActivityCreateExternalPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketingActivityDeleteExternal": {
                    MarketingActivityDeleteExternalPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketingActivityDeleteExternalPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketingActivityUpdate": {
                    MarketingActivityUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketingActivityUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketingActivityUpdateExternal": {
                    MarketingActivityUpdateExternalPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketingActivityUpdateExternalPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketingActivityUpsertExternal": {
                    MarketingActivityUpsertExternalPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketingActivityUpsertExternalPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketingEngagementCreate": {
                    MarketingEngagementCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketingEngagementCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "marketingEngagementsDelete": {
                    MarketingEngagementsDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketingEngagementsDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "menuCreate": {
                    MenuCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MenuCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "menuDelete": {
                    MenuDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MenuDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "menuUpdate": {
                    MenuUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MenuUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafieldDefinitionCreate": {
                    MetafieldDefinitionCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetafieldDefinitionCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafieldDefinitionDelete": {
                    MetafieldDefinitionDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetafieldDefinitionDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafieldDefinitionPin": {
                    MetafieldDefinitionPinPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetafieldDefinitionPinPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafieldDefinitionUnpin": {
                    MetafieldDefinitionUnpinPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetafieldDefinitionUnpinPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafieldDefinitionUpdate": {
                    MetafieldDefinitionUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetafieldDefinitionUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafieldsDelete": {
                    MetafieldsDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetafieldsDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafieldsSet": {
                    MetafieldsSetPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetafieldsSetPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metaobjectBulkDelete": {
                    MetaobjectBulkDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectBulkDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metaobjectCreate": {
                    MetaobjectCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metaobjectDefinitionCreate": {
                    MetaobjectDefinitionCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectDefinitionCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metaobjectDefinitionDelete": {
                    MetaobjectDefinitionDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectDefinitionDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metaobjectDefinitionUpdate": {
                    MetaobjectDefinitionUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectDefinitionUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metaobjectDelete": {
                    MetaobjectDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metaobjectUpdate": {
                    MetaobjectUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metaobjectUpsert": {
                    MetaobjectUpsertPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectUpsertPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "mobilePlatformApplicationCreate": {
                    MobilePlatformApplicationCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MobilePlatformApplicationCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "mobilePlatformApplicationDelete": {
                    MobilePlatformApplicationDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MobilePlatformApplicationDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "mobilePlatformApplicationUpdate": {
                    MobilePlatformApplicationUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MobilePlatformApplicationUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderCancel": {
                    OrderCancelPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderCancelPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderCapture": {
                    OrderCapturePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderCapturePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderClose": {
                    OrderClosePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderClosePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderCreate": {
                    OrderCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderCreateMandatePayment": {
                    OrderCreateMandatePaymentPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderCreateMandatePaymentPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderDelete": {
                    OrderDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderEditAddCustomItem": {
                    OrderEditAddCustomItemPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderEditAddCustomItemPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderEditAddLineItemDiscount": {
                    OrderEditAddLineItemDiscountPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderEditAddLineItemDiscountPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderEditAddShippingLine": {
                    OrderEditAddShippingLinePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderEditAddShippingLinePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderEditAddVariant": {
                    OrderEditAddVariantPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderEditAddVariantPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderEditBegin": {
                    OrderEditBeginPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderEditBeginPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderEditCommit": {
                    OrderEditCommitPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderEditCommitPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderEditRemoveDiscount": {
                    OrderEditRemoveDiscountPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderEditRemoveDiscountPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderEditRemoveShippingLine": {
                    OrderEditRemoveShippingLinePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderEditRemoveShippingLinePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderEditSetQuantity": {
                    OrderEditSetQuantityPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderEditSetQuantityPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderEditUpdateDiscount": {
                    OrderEditUpdateDiscountPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderEditUpdateDiscountPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderEditUpdateShippingLine": {
                    OrderEditUpdateShippingLinePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderEditUpdateShippingLinePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderInvoiceSend": {
                    OrderInvoiceSendPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderInvoiceSendPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderMarkAsPaid": {
                    OrderMarkAsPaidPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderMarkAsPaidPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderOpen": {
                    OrderOpenPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderOpenPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderRiskAssessmentCreate": {
                    OrderRiskAssessmentCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderRiskAssessmentCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orderUpdate": {
                    OrderUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pageCreate": {
                    PageCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PageCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pageDelete": {
                    PageDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PageDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pageUpdate": {
                    PageUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PageUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentCustomizationActivation": {
                    PaymentCustomizationActivationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PaymentCustomizationActivationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentCustomizationCreate": {
                    PaymentCustomizationCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PaymentCustomizationCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentCustomizationDelete": {
                    PaymentCustomizationDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PaymentCustomizationDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentCustomizationUpdate": {
                    PaymentCustomizationUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PaymentCustomizationUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentReminderSend": {
                    PaymentReminderSendPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PaymentReminderSendPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentTermsCreate": {
                    PaymentTermsCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PaymentTermsCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentTermsDelete": {
                    PaymentTermsDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PaymentTermsDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "paymentTermsUpdate": {
                    PaymentTermsUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PaymentTermsUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "priceListCreate": {
                    PriceListCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceListCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "priceListDelete": {
                    PriceListDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceListDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "priceListFixedPricesAdd": {
                    PriceListFixedPricesAddPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceListFixedPricesAddPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "priceListFixedPricesByProductUpdate": {
                    PriceListFixedPricesByProductUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceListFixedPricesByProductUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "priceListFixedPricesDelete": {
                    PriceListFixedPricesDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceListFixedPricesDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "priceListFixedPricesUpdate": {
                    PriceListFixedPricesUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceListFixedPricesUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "priceListUpdate": {
                    PriceListUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PriceListUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productBundleCreate": {
                    ProductBundleCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductBundleCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productBundleUpdate": {
                    ProductBundleUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductBundleUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productCreate": {
                    ProductCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productDelete": {
                    ProductDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productDuplicate": {
                    ProductDuplicatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductDuplicatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productFeedCreate": {
                    ProductFeedCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductFeedCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productFeedDelete": {
                    ProductFeedDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductFeedDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productFullSync": {
                    ProductFullSyncPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductFullSyncPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productJoinSellingPlanGroups": {
                    ProductJoinSellingPlanGroupsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductJoinSellingPlanGroupsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productLeaveSellingPlanGroups": {
                    ProductLeaveSellingPlanGroupsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductLeaveSellingPlanGroupsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productOptionUpdate": {
                    ProductOptionUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductOptionUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productOptionsCreate": {
                    ProductOptionsCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductOptionsCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productOptionsDelete": {
                    ProductOptionsDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductOptionsDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productOptionsReorder": {
                    ProductOptionsReorderPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductOptionsReorderPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productReorderMedia": {
                    ProductReorderMediaPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductReorderMediaPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productSet": {
                    ProductSetPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductSetPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productUpdate": {
                    ProductUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productVariantAppendMedia": {
                    ProductVariantAppendMediaPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductVariantAppendMediaPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productVariantDetachMedia": {
                    ProductVariantDetachMediaPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductVariantDetachMediaPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productVariantJoinSellingPlanGroups": {
                    ProductVariantJoinSellingPlanGroupsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductVariantJoinSellingPlanGroupsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productVariantLeaveSellingPlanGroups": {
                    ProductVariantLeaveSellingPlanGroupsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductVariantLeaveSellingPlanGroupsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productVariantRelationshipBulkUpdate": {
                    ProductVariantRelationshipBulkUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductVariantRelationshipBulkUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productVariantsBulkCreate": {
                    ProductVariantsBulkCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductVariantsBulkCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productVariantsBulkDelete": {
                    ProductVariantsBulkDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductVariantsBulkDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productVariantsBulkReorder": {
                    ProductVariantsBulkReorderPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductVariantsBulkReorderPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productVariantsBulkUpdate": {
                    ProductVariantsBulkUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductVariantsBulkUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pubSubServerPixelUpdate": {
                    PubSubServerPixelUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PubSubServerPixelUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pubSubWebhookSubscriptionCreate": {
                    PubSubWebhookSubscriptionCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PubSubWebhookSubscriptionCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pubSubWebhookSubscriptionUpdate": {
                    PubSubWebhookSubscriptionUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PubSubWebhookSubscriptionUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "publicationCreate": {
                    PublicationCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PublicationCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "publicationDelete": {
                    PublicationDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PublicationDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "publicationUpdate": {
                    PublicationUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PublicationUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "publishablePublish": {
                    PublishablePublishPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PublishablePublishPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "publishablePublishToCurrentChannel": {
                    PublishablePublishToCurrentChannelPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PublishablePublishToCurrentChannelPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "publishableUnpublish": {
                    PublishableUnpublishPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PublishableUnpublishPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "publishableUnpublishToCurrentChannel": {
                    PublishableUnpublishToCurrentChannelPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PublishableUnpublishToCurrentChannelPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantityPricingByVariantUpdate": {
                    QuantityPricingByVariantUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new QuantityPricingByVariantUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantityRulesAdd": {
                    QuantityRulesAddPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new QuantityRulesAddPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantityRulesDelete": {
                    QuantityRulesDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new QuantityRulesDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "refundCreate": {
                    RefundCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RefundCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returnApproveRequest": {
                    ReturnApproveRequestPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReturnApproveRequestPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returnCancel": {
                    ReturnCancelPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReturnCancelPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returnClose": {
                    ReturnClosePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReturnClosePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returnCreate": {
                    ReturnCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReturnCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returnDeclineRequest": {
                    ReturnDeclineRequestPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReturnDeclineRequestPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returnLineItemRemoveFromReturn": {
                    ReturnLineItemRemoveFromReturnPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReturnLineItemRemoveFromReturnPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returnRefund": {
                    ReturnRefundPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReturnRefundPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returnReopen": {
                    ReturnReopenPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReturnReopenPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returnRequest": {
                    ReturnRequestPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReturnRequestPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reverseDeliveryCreateWithShipping": {
                    ReverseDeliveryCreateWithShippingPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReverseDeliveryCreateWithShippingPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reverseDeliveryShippingUpdate": {
                    ReverseDeliveryShippingUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReverseDeliveryShippingUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reverseFulfillmentOrderDispose": {
                    ReverseFulfillmentOrderDisposePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReverseFulfillmentOrderDisposePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "savedSearchCreate": {
                    SavedSearchCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SavedSearchCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "savedSearchDelete": {
                    SavedSearchDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SavedSearchDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "savedSearchUpdate": {
                    SavedSearchUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SavedSearchUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "scriptTagCreate": {
                    ScriptTagCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ScriptTagCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "scriptTagDelete": {
                    ScriptTagDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ScriptTagDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "scriptTagUpdate": {
                    ScriptTagUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ScriptTagUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "segmentCreate": {
                    SegmentCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SegmentCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "segmentDelete": {
                    SegmentDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SegmentDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "segmentUpdate": {
                    SegmentUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SegmentUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sellingPlanGroupAddProductVariants": {
                    SellingPlanGroupAddProductVariantsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SellingPlanGroupAddProductVariantsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sellingPlanGroupAddProducts": {
                    SellingPlanGroupAddProductsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SellingPlanGroupAddProductsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sellingPlanGroupCreate": {
                    SellingPlanGroupCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SellingPlanGroupCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sellingPlanGroupDelete": {
                    SellingPlanGroupDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SellingPlanGroupDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sellingPlanGroupRemoveProductVariants": {
                    SellingPlanGroupRemoveProductVariantsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SellingPlanGroupRemoveProductVariantsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sellingPlanGroupRemoveProducts": {
                    SellingPlanGroupRemoveProductsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SellingPlanGroupRemoveProductsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sellingPlanGroupUpdate": {
                    SellingPlanGroupUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SellingPlanGroupUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "serverPixelCreate": {
                    ServerPixelCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ServerPixelCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "serverPixelDelete": {
                    ServerPixelDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ServerPixelDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shippingPackageDelete": {
                    ShippingPackageDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShippingPackageDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shippingPackageMakeDefault": {
                    ShippingPackageMakeDefaultPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShippingPackageMakeDefaultPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shippingPackageUpdate": {
                    ShippingPackageUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShippingPackageUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shopLocaleDisable": {
                    ShopLocaleDisablePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopLocaleDisablePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shopLocaleEnable": {
                    ShopLocaleEnablePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopLocaleEnablePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shopLocaleUpdate": {
                    ShopLocaleUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopLocaleUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shopPolicyUpdate": {
                    ShopPolicyUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopPolicyUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shopResourceFeedbackCreate": {
                    ShopResourceFeedbackCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopResourceFeedbackCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shopifyPaymentsPayoutAlternateCurrencyCreate": {
                    ShopifyPaymentsPayoutAlternateCurrencyCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShopifyPaymentsPayoutAlternateCurrencyCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "stagedUploadsCreate": {
                    StagedUploadsCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StagedUploadsCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "standardMetafieldDefinitionEnable": {
                    StandardMetafieldDefinitionEnablePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StandardMetafieldDefinitionEnablePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "standardMetaobjectDefinitionEnable": {
                    StandardMetaobjectDefinitionEnablePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StandardMetaobjectDefinitionEnablePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "storeCreditAccountCredit": {
                    StoreCreditAccountCreditPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StoreCreditAccountCreditPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "storeCreditAccountDebit": {
                    StoreCreditAccountDebitPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StoreCreditAccountDebitPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "storefrontAccessTokenCreate": {
                    StorefrontAccessTokenCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StorefrontAccessTokenCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "storefrontAccessTokenDelete": {
                    StorefrontAccessTokenDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StorefrontAccessTokenDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionBillingAttemptCreate": {
                    SubscriptionBillingAttemptCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingAttemptCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionBillingCycleBulkCharge": {
                    SubscriptionBillingCycleBulkChargePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingCycleBulkChargePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionBillingCycleBulkSearch": {
                    SubscriptionBillingCycleBulkSearchPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingCycleBulkSearchPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionBillingCycleCharge": {
                    SubscriptionBillingCycleChargePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingCycleChargePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionBillingCycleContractDraftCommit": {
                    SubscriptionBillingCycleContractDraftCommitPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingCycleContractDraftCommitPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionBillingCycleContractDraftConcatenate": {
                    SubscriptionBillingCycleContractDraftConcatenatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingCycleContractDraftConcatenatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionBillingCycleContractEdit": {
                    SubscriptionBillingCycleContractEditPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingCycleContractEditPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionBillingCycleEditDelete": {
                    SubscriptionBillingCycleEditDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingCycleEditDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionBillingCycleEditsDelete": {
                    SubscriptionBillingCycleEditsDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingCycleEditsDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionBillingCycleScheduleEdit": {
                    SubscriptionBillingCycleScheduleEditPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingCycleScheduleEditPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionBillingCycleSkip": {
                    SubscriptionBillingCycleSkipPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingCycleSkipPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionBillingCycleUnskip": {
                    SubscriptionBillingCycleUnskipPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionBillingCycleUnskipPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionContractActivate": {
                    SubscriptionContractActivatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionContractActivatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionContractAtomicCreate": {
                    SubscriptionContractAtomicCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionContractAtomicCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionContractCancel": {
                    SubscriptionContractCancelPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionContractCancelPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionContractCreate": {
                    SubscriptionContractCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionContractCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionContractExpire": {
                    SubscriptionContractExpirePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionContractExpirePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionContractFail": {
                    SubscriptionContractFailPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionContractFailPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionContractPause": {
                    SubscriptionContractPausePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionContractPausePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionContractProductChange": {
                    SubscriptionContractProductChangePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionContractProductChangePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionContractSetNextBillingDate": {
                    SubscriptionContractSetNextBillingDatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionContractSetNextBillingDatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionContractUpdate": {
                    SubscriptionContractUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionContractUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionDraftCommit": {
                    SubscriptionDraftCommitPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionDraftCommitPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionDraftDiscountAdd": {
                    SubscriptionDraftDiscountAddPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionDraftDiscountAddPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionDraftDiscountCodeApply": {
                    SubscriptionDraftDiscountCodeApplyPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionDraftDiscountCodeApplyPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionDraftDiscountRemove": {
                    SubscriptionDraftDiscountRemovePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionDraftDiscountRemovePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionDraftDiscountUpdate": {
                    SubscriptionDraftDiscountUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionDraftDiscountUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionDraftFreeShippingDiscountAdd": {
                    SubscriptionDraftFreeShippingDiscountAddPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionDraftFreeShippingDiscountAddPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionDraftFreeShippingDiscountUpdate": {
                    SubscriptionDraftFreeShippingDiscountUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionDraftFreeShippingDiscountUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionDraftLineAdd": {
                    SubscriptionDraftLineAddPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionDraftLineAddPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionDraftLineRemove": {
                    SubscriptionDraftLineRemovePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionDraftLineRemovePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionDraftLineUpdate": {
                    SubscriptionDraftLineUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionDraftLineUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionDraftUpdate": {
                    SubscriptionDraftUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscriptionDraftUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "tagsAdd": {
                    TagsAddPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new TagsAddPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "tagsRemove": {
                    TagsRemovePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new TagsRemovePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "taxAppConfigure": {
                    TaxAppConfigurePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new TaxAppConfigurePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "themeCreate": {
                    ThemeCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ThemeCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "themeDelete": {
                    ThemeDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ThemeDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "themeFilesCopy": {
                    ThemeFilesCopyPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ThemeFilesCopyPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "themeFilesDelete": {
                    ThemeFilesDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ThemeFilesDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "themeFilesUpsert": {
                    ThemeFilesUpsertPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ThemeFilesUpsertPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "themePublish": {
                    ThemePublishPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ThemePublishPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "themeUpdate": {
                    ThemeUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ThemeUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "transactionVoid": {
                    TransactionVoidPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new TransactionVoidPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "translationsRegister": {
                    TranslationsRegisterPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new TranslationsRegisterPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "translationsRemove": {
                    TranslationsRemovePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new TranslationsRemovePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "urlRedirectBulkDeleteAll": {
                    UrlRedirectBulkDeleteAllPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UrlRedirectBulkDeleteAllPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "urlRedirectBulkDeleteByIds": {
                    UrlRedirectBulkDeleteByIdsPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UrlRedirectBulkDeleteByIdsPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "urlRedirectBulkDeleteBySavedSearch": {
                    UrlRedirectBulkDeleteBySavedSearchPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UrlRedirectBulkDeleteBySavedSearchPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "urlRedirectBulkDeleteBySearch": {
                    UrlRedirectBulkDeleteBySearchPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UrlRedirectBulkDeleteBySearchPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "urlRedirectCreate": {
                    UrlRedirectCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UrlRedirectCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "urlRedirectDelete": {
                    UrlRedirectDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UrlRedirectDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "urlRedirectImportCreate": {
                    UrlRedirectImportCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UrlRedirectImportCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "urlRedirectImportSubmit": {
                    UrlRedirectImportSubmitPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UrlRedirectImportSubmitPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "urlRedirectUpdate": {
                    UrlRedirectUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UrlRedirectUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "validationCreate": {
                    ValidationCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ValidationCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "validationDelete": {
                    ValidationDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ValidationDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "validationUpdate": {
                    ValidationUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ValidationUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "webPixelCreate": {
                    WebPixelCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new WebPixelCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "webPixelDelete": {
                    WebPixelDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new WebPixelDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "webPixelUpdate": {
                    WebPixelUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new WebPixelUpdatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "webhookSubscriptionCreate": {
                    WebhookSubscriptionCreatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new WebhookSubscriptionCreatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "webhookSubscriptionDelete": {
                    WebhookSubscriptionDeletePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new WebhookSubscriptionDeletePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "webhookSubscriptionUpdate": {
                    WebhookSubscriptionUpdatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new WebhookSubscriptionUpdatePayload(jsonAsObject(field.getValue(), key));
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
        return "Mutation";
    }

    /**
    * Updates the marketing activities delivery statuses for an abandonment.
    */

    public AbandonmentUpdateActivitiesDeliveryStatusesPayload getAbandonmentUpdateActivitiesDeliveryStatuses() {
        return (AbandonmentUpdateActivitiesDeliveryStatusesPayload) get("abandonmentUpdateActivitiesDeliveryStatuses");
    }

    public Mutation setAbandonmentUpdateActivitiesDeliveryStatuses(AbandonmentUpdateActivitiesDeliveryStatusesPayload arg) {
        optimisticData.put(getKey("abandonmentUpdateActivitiesDeliveryStatuses"), arg);
        return this;
    }

    /**
    * Charges a shop for features or services one time.
    * This type of charge is recommended for apps that aren't billed on a recurring basis.
    * Test and demo shops aren't charged.
    */

    public AppPurchaseOneTimeCreatePayload getAppPurchaseOneTimeCreate() {
        return (AppPurchaseOneTimeCreatePayload) get("appPurchaseOneTimeCreate");
    }

    public Mutation setAppPurchaseOneTimeCreate(AppPurchaseOneTimeCreatePayload arg) {
        optimisticData.put(getKey("appPurchaseOneTimeCreate"), arg);
        return this;
    }

    /**
    * Revokes access scopes previously granted for an app installation.
    */

    public AppRevokeAccessScopesPayload getAppRevokeAccessScopes() {
        return (AppRevokeAccessScopesPayload) get("appRevokeAccessScopes");
    }

    public Mutation setAppRevokeAccessScopes(AppRevokeAccessScopesPayload arg) {
        optimisticData.put(getKey("appRevokeAccessScopes"), arg);
        return this;
    }

    /**
    * Cancels an app subscription on a store.
    */

    public AppSubscriptionCancelPayload getAppSubscriptionCancel() {
        return (AppSubscriptionCancelPayload) get("appSubscriptionCancel");
    }

    public Mutation setAppSubscriptionCancel(AppSubscriptionCancelPayload arg) {
        optimisticData.put(getKey("appSubscriptionCancel"), arg);
        return this;
    }

    /**
    * Allows an app to charge a store for features or services on a recurring basis.
    */

    public AppSubscriptionCreatePayload getAppSubscriptionCreate() {
        return (AppSubscriptionCreatePayload) get("appSubscriptionCreate");
    }

    public Mutation setAppSubscriptionCreate(AppSubscriptionCreatePayload arg) {
        optimisticData.put(getKey("appSubscriptionCreate"), arg);
        return this;
    }

    /**
    * Updates the capped amount on the usage pricing plan of an app subscription line item.
    */

    public AppSubscriptionLineItemUpdatePayload getAppSubscriptionLineItemUpdate() {
        return (AppSubscriptionLineItemUpdatePayload) get("appSubscriptionLineItemUpdate");
    }

    public Mutation setAppSubscriptionLineItemUpdate(AppSubscriptionLineItemUpdatePayload arg) {
        optimisticData.put(getKey("appSubscriptionLineItemUpdate"), arg);
        return this;
    }

    /**
    * Extends the trial of an app subscription.
    */

    public AppSubscriptionTrialExtendPayload getAppSubscriptionTrialExtend() {
        return (AppSubscriptionTrialExtendPayload) get("appSubscriptionTrialExtend");
    }

    public Mutation setAppSubscriptionTrialExtend(AppSubscriptionTrialExtendPayload arg) {
        optimisticData.put(getKey("appSubscriptionTrialExtend"), arg);
        return this;
    }

    /**
    * Enables an app to charge a store for features or services on a per-use basis.
    * The usage charge value is counted towards the `cappedAmount` limit that was specified in the
    * `appUsagePricingDetails` field when the app subscription was created.
    * If you create an app usage charge that causes the total usage charges in a billing interval to
    * exceed the capped amount, then a `Total price exceeds balance remaining` error is returned.
    */

    public AppUsageRecordCreatePayload getAppUsageRecordCreate() {
        return (AppUsageRecordCreatePayload) get("appUsageRecordCreate");
    }

    public Mutation setAppUsageRecordCreate(AppUsageRecordCreatePayload arg) {
        optimisticData.put(getKey("appUsageRecordCreate"), arg);
        return this;
    }

    /**
    * Creates an article.
    */

    public ArticleCreatePayload getArticleCreate() {
        return (ArticleCreatePayload) get("articleCreate");
    }

    public Mutation setArticleCreate(ArticleCreatePayload arg) {
        optimisticData.put(getKey("articleCreate"), arg);
        return this;
    }

    /**
    * Deletes an article.
    */

    public ArticleDeletePayload getArticleDelete() {
        return (ArticleDeletePayload) get("articleDelete");
    }

    public Mutation setArticleDelete(ArticleDeletePayload arg) {
        optimisticData.put(getKey("articleDelete"), arg);
        return this;
    }

    /**
    * Updates an article.
    */

    public ArticleUpdatePayload getArticleUpdate() {
        return (ArticleUpdatePayload) get("articleUpdate");
    }

    public Mutation setArticleUpdate(ArticleUpdatePayload arg) {
        optimisticData.put(getKey("articleUpdate"), arg);
        return this;
    }

    /**
    * Creates a blog.
    */

    public BlogCreatePayload getBlogCreate() {
        return (BlogCreatePayload) get("blogCreate");
    }

    public Mutation setBlogCreate(BlogCreatePayload arg) {
        optimisticData.put(getKey("blogCreate"), arg);
        return this;
    }

    /**
    * Deletes a blog.
    */

    public BlogDeletePayload getBlogDelete() {
        return (BlogDeletePayload) get("blogDelete");
    }

    public Mutation setBlogDelete(BlogDeletePayload arg) {
        optimisticData.put(getKey("blogDelete"), arg);
        return this;
    }

    /**
    * Updates a blog.
    */

    public BlogUpdatePayload getBlogUpdate() {
        return (BlogUpdatePayload) get("blogUpdate");
    }

    public Mutation setBlogUpdate(BlogUpdatePayload arg) {
        optimisticData.put(getKey("blogUpdate"), arg);
        return this;
    }

    /**
    * Starts the cancelation process of a running bulk operation.
    * There may be a short delay from when a cancelation starts until the operation is actually canceled.
    */

    public BulkOperationCancelPayload getBulkOperationCancel() {
        return (BulkOperationCancelPayload) get("bulkOperationCancel");
    }

    public Mutation setBulkOperationCancel(BulkOperationCancelPayload arg) {
        optimisticData.put(getKey("bulkOperationCancel"), arg);
        return this;
    }

    /**
    * Creates and runs a bulk operation mutation.
    * To learn how to bulk import large volumes of data asynchronously, refer to the
    * [bulk import data guide](https://shopify.dev/api/usage/bulk-operations/imports).
    */

    public BulkOperationRunMutationPayload getBulkOperationRunMutation() {
        return (BulkOperationRunMutationPayload) get("bulkOperationRunMutation");
    }

    public Mutation setBulkOperationRunMutation(BulkOperationRunMutationPayload arg) {
        optimisticData.put(getKey("bulkOperationRunMutation"), arg);
        return this;
    }

    /**
    * Creates and runs a bulk operation query.
    * See the [bulk operations guide](https://shopify.dev/api/usage/bulk-operations/queries) for more
    * details.
    */

    public BulkOperationRunQueryPayload getBulkOperationRunQuery() {
        return (BulkOperationRunQueryPayload) get("bulkOperationRunQuery");
    }

    public Mutation setBulkOperationRunQuery(BulkOperationRunQueryPayload arg) {
        optimisticData.put(getKey("bulkOperationRunQuery"), arg);
        return this;
    }

    /**
    * Creates product feedback for multiple products.
    */

    public BulkProductResourceFeedbackCreatePayload getBulkProductResourceFeedbackCreate() {
        return (BulkProductResourceFeedbackCreatePayload) get("bulkProductResourceFeedbackCreate");
    }

    public Mutation setBulkProductResourceFeedbackCreate(BulkProductResourceFeedbackCreatePayload arg) {
        optimisticData.put(getKey("bulkProductResourceFeedbackCreate"), arg);
        return this;
    }

    /**
    * Creates a new carrier service.
    */

    public CarrierServiceCreatePayload getCarrierServiceCreate() {
        return (CarrierServiceCreatePayload) get("carrierServiceCreate");
    }

    public Mutation setCarrierServiceCreate(CarrierServiceCreatePayload arg) {
        optimisticData.put(getKey("carrierServiceCreate"), arg);
        return this;
    }

    /**
    * Removes an existing carrier service.
    */

    public CarrierServiceDeletePayload getCarrierServiceDelete() {
        return (CarrierServiceDeletePayload) get("carrierServiceDelete");
    }

    public Mutation setCarrierServiceDelete(CarrierServiceDeletePayload arg) {
        optimisticData.put(getKey("carrierServiceDelete"), arg);
        return this;
    }

    /**
    * Updates a carrier service. Only the app that creates a carrier service can update it.
    */

    public CarrierServiceUpdatePayload getCarrierServiceUpdate() {
        return (CarrierServiceUpdatePayload) get("carrierServiceUpdate");
    }

    public Mutation setCarrierServiceUpdate(CarrierServiceUpdatePayload arg) {
        optimisticData.put(getKey("carrierServiceUpdate"), arg);
        return this;
    }

    /**
    * Create a CartTransform function to the Shop.
    */

    public CartTransformCreatePayload getCartTransformCreate() {
        return (CartTransformCreatePayload) get("cartTransformCreate");
    }

    public Mutation setCartTransformCreate(CartTransformCreatePayload arg) {
        optimisticData.put(getKey("cartTransformCreate"), arg);
        return this;
    }

    /**
    * Destroy a cart transform function from the Shop.
    */

    public CartTransformDeletePayload getCartTransformDelete() {
        return (CartTransformDeletePayload) get("cartTransformDelete");
    }

    public Mutation setCartTransformDelete(CartTransformDeletePayload arg) {
        optimisticData.put(getKey("cartTransformDelete"), arg);
        return this;
    }

    /**
    * Updates the context of a catalog.
    */

    public CatalogContextUpdatePayload getCatalogContextUpdate() {
        return (CatalogContextUpdatePayload) get("catalogContextUpdate");
    }

    public Mutation setCatalogContextUpdate(CatalogContextUpdatePayload arg) {
        optimisticData.put(getKey("catalogContextUpdate"), arg);
        return this;
    }

    /**
    * Creates a new catalog.
    */

    public CatalogCreatePayload getCatalogCreate() {
        return (CatalogCreatePayload) get("catalogCreate");
    }

    public Mutation setCatalogCreate(CatalogCreatePayload arg) {
        optimisticData.put(getKey("catalogCreate"), arg);
        return this;
    }

    /**
    * Delete a catalog.
    */

    public CatalogDeletePayload getCatalogDelete() {
        return (CatalogDeletePayload) get("catalogDelete");
    }

    public Mutation setCatalogDelete(CatalogDeletePayload arg) {
        optimisticData.put(getKey("catalogDelete"), arg);
        return this;
    }

    /**
    * Updates an existing catalog.
    */

    public CatalogUpdatePayload getCatalogUpdate() {
        return (CatalogUpdatePayload) get("catalogUpdate");
    }

    public Mutation setCatalogUpdate(CatalogUpdatePayload arg) {
        optimisticData.put(getKey("catalogUpdate"), arg);
        return this;
    }

    /**
    * Updates the checkout branding settings for a
    * [checkout profile](https://shopify.dev/api/admin-graphql/unstable/queries/checkoutProfile).
    * If the settings don't exist, then new settings are created. The checkout branding settings applied
    * to a
    * published checkout profile will be immediately visible within the store's checkout. The checkout
    * branding
    * settings applied to a draft checkout profile could be previewed within the admin checkout editor.
    * To learn more about updating checkout branding settings, refer to the checkout branding
    * [tutorial](https://shopify.dev/docs/apps/checkout/styling).
    */

    public CheckoutBrandingUpsertPayload getCheckoutBrandingUpsert() {
        return (CheckoutBrandingUpsertPayload) get("checkoutBrandingUpsert");
    }

    public Mutation setCheckoutBrandingUpsert(CheckoutBrandingUpsertPayload arg) {
        optimisticData.put(getKey("checkoutBrandingUpsert"), arg);
        return this;
    }

    /**
    * Adds products to a collection.
    */

    public CollectionAddProductsPayload getCollectionAddProducts() {
        return (CollectionAddProductsPayload) get("collectionAddProducts");
    }

    public Mutation setCollectionAddProducts(CollectionAddProductsPayload arg) {
        optimisticData.put(getKey("collectionAddProducts"), arg);
        return this;
    }

    /**
    * Asynchronously adds a set of products to a given collection. It can take a long time to run. Instead
    * of returning a collection, it returns a job which should be polled.
    */

    public CollectionAddProductsV2Payload getCollectionAddProductsV2() {
        return (CollectionAddProductsV2Payload) get("collectionAddProductsV2");
    }

    public Mutation setCollectionAddProductsV2(CollectionAddProductsV2Payload arg) {
        optimisticData.put(getKey("collectionAddProductsV2"), arg);
        return this;
    }

    /**
    * Creates a collection.
    */

    public CollectionCreatePayload getCollectionCreate() {
        return (CollectionCreatePayload) get("collectionCreate");
    }

    public Mutation setCollectionCreate(CollectionCreatePayload arg) {
        optimisticData.put(getKey("collectionCreate"), arg);
        return this;
    }

    /**
    * Deletes a collection.
    */

    public CollectionDeletePayload getCollectionDelete() {
        return (CollectionDeletePayload) get("collectionDelete");
    }

    public Mutation setCollectionDelete(CollectionDeletePayload arg) {
        optimisticData.put(getKey("collectionDelete"), arg);
        return this;
    }

    /**
    * Removes a set of products from a given collection. The mutation can take a long time to run. Instead
    * of returning an updated collection the mutation returns a job, which should be
    * [polled](https://shopify.dev/api/admin-graphql/latest/queries/job). For use with manual collections
    * only.
    */

    public CollectionRemoveProductsPayload getCollectionRemoveProducts() {
        return (CollectionRemoveProductsPayload) get("collectionRemoveProducts");
    }

    public Mutation setCollectionRemoveProducts(CollectionRemoveProductsPayload arg) {
        optimisticData.put(getKey("collectionRemoveProducts"), arg);
        return this;
    }

    /**
    * Asynchronously reorders a set of products within a specified collection. Instead of returning an
    * updated collection, this mutation returns a job, which should be
    * [polled](https://shopify.dev/api/admin-graphql/latest/queries/job). The
    * [`Collection.sortOrder`](https://shopify.dev/api/admin-graphql/latest/objects/Collection#field-colle
    * ction-sortorder) must be `MANUAL`. Displaced products will have their position altered in a
    * consistent manner, with no gaps.
    */

    public CollectionReorderProductsPayload getCollectionReorderProducts() {
        return (CollectionReorderProductsPayload) get("collectionReorderProducts");
    }

    public Mutation setCollectionReorderProducts(CollectionReorderProductsPayload arg) {
        optimisticData.put(getKey("collectionReorderProducts"), arg);
        return this;
    }

    /**
    * Updates a collection.
    */

    public CollectionUpdatePayload getCollectionUpdate() {
        return (CollectionUpdatePayload) get("collectionUpdate");
    }

    public Mutation setCollectionUpdate(CollectionUpdatePayload arg) {
        optimisticData.put(getKey("collectionUpdate"), arg);
        return this;
    }

    /**
    * Add, remove and update `CombinedListing`s of a given Product.
    * `CombinedListing`s are comprised of multiple products to create a single listing. There are two
    * kinds of products used in a `CombinedListing`:
    * 1. Parent products
    * 2. Child products
    * The parent product is created with a `productCreate` with a `CombinedListingRole` of `PARENT`. Once
    * created, you can associate child products with the parent product using this mutation. Parent
    * products represent the idea of a product (e.g. Shoe).
    * Child products represent a particular option value (or combination of option values) of a parent
    * product. For instance, with your Shoe parent product, you may have several child products
    * representing specific colors of the shoe (e.g. Shoe - Blue). You could also have child products
    * representing more than a single option (e.g. Shoe - Blue/Canvas, Shoe - Blue/Leather, etc...).
    * The combined listing is the association of parent product to one or more child products.
    * Learn more about [Combined Listings](https://shopify.dev/apps/selling-strategies/combined-listings).
    */

    public CombinedListingUpdatePayload getCombinedListingUpdate() {
        return (CombinedListingUpdatePayload) get("combinedListingUpdate");
    }

    public Mutation setCombinedListingUpdate(CombinedListingUpdatePayload arg) {
        optimisticData.put(getKey("combinedListingUpdate"), arg);
        return this;
    }

    /**
    * Approves a comment.
    */

    public CommentApprovePayload getCommentApprove() {
        return (CommentApprovePayload) get("commentApprove");
    }

    public Mutation setCommentApprove(CommentApprovePayload arg) {
        optimisticData.put(getKey("commentApprove"), arg);
        return this;
    }

    /**
    * Deletes a comment.
    */

    public CommentDeletePayload getCommentDelete() {
        return (CommentDeletePayload) get("commentDelete");
    }

    public Mutation setCommentDelete(CommentDeletePayload arg) {
        optimisticData.put(getKey("commentDelete"), arg);
        return this;
    }

    /**
    * Marks a comment as not spam.
    */

    public CommentNotSpamPayload getCommentNotSpam() {
        return (CommentNotSpamPayload) get("commentNotSpam");
    }

    public Mutation setCommentNotSpam(CommentNotSpamPayload arg) {
        optimisticData.put(getKey("commentNotSpam"), arg);
        return this;
    }

    /**
    * Marks a comment as spam.
    */

    public CommentSpamPayload getCommentSpam() {
        return (CommentSpamPayload) get("commentSpam");
    }

    public Mutation setCommentSpam(CommentSpamPayload arg) {
        optimisticData.put(getKey("commentSpam"), arg);
        return this;
    }

    /**
    * Deletes a list of companies.
    */

    public CompaniesDeletePayload getCompaniesDelete() {
        return (CompaniesDeletePayload) get("companiesDelete");
    }

    public Mutation setCompaniesDelete(CompaniesDeletePayload arg) {
        optimisticData.put(getKey("companiesDelete"), arg);
        return this;
    }

    /**
    * Deletes a company address.
    */

    public CompanyAddressDeletePayload getCompanyAddressDelete() {
        return (CompanyAddressDeletePayload) get("companyAddressDelete");
    }

    public Mutation setCompanyAddressDelete(CompanyAddressDeletePayload arg) {
        optimisticData.put(getKey("companyAddressDelete"), arg);
        return this;
    }

    /**
    * Assigns the customer as a company contact.
    */

    public CompanyAssignCustomerAsContactPayload getCompanyAssignCustomerAsContact() {
        return (CompanyAssignCustomerAsContactPayload) get("companyAssignCustomerAsContact");
    }

    public Mutation setCompanyAssignCustomerAsContact(CompanyAssignCustomerAsContactPayload arg) {
        optimisticData.put(getKey("companyAssignCustomerAsContact"), arg);
        return this;
    }

    /**
    * Assigns the main contact for the company.
    */

    public CompanyAssignMainContactPayload getCompanyAssignMainContact() {
        return (CompanyAssignMainContactPayload) get("companyAssignMainContact");
    }

    public Mutation setCompanyAssignMainContact(CompanyAssignMainContactPayload arg) {
        optimisticData.put(getKey("companyAssignMainContact"), arg);
        return this;
    }

    /**
    * Assigns a role to a contact for a location.
    */

    public CompanyContactAssignRolePayload getCompanyContactAssignRole() {
        return (CompanyContactAssignRolePayload) get("companyContactAssignRole");
    }

    public Mutation setCompanyContactAssignRole(CompanyContactAssignRolePayload arg) {
        optimisticData.put(getKey("companyContactAssignRole"), arg);
        return this;
    }

    /**
    * Assigns roles on a company contact.
    */

    public CompanyContactAssignRolesPayload getCompanyContactAssignRoles() {
        return (CompanyContactAssignRolesPayload) get("companyContactAssignRoles");
    }

    public Mutation setCompanyContactAssignRoles(CompanyContactAssignRolesPayload arg) {
        optimisticData.put(getKey("companyContactAssignRoles"), arg);
        return this;
    }

    /**
    * Creates a company contact and the associated customer.
    */

    public CompanyContactCreatePayload getCompanyContactCreate() {
        return (CompanyContactCreatePayload) get("companyContactCreate");
    }

    public Mutation setCompanyContactCreate(CompanyContactCreatePayload arg) {
        optimisticData.put(getKey("companyContactCreate"), arg);
        return this;
    }

    /**
    * Deletes a company contact.
    */

    public CompanyContactDeletePayload getCompanyContactDelete() {
        return (CompanyContactDeletePayload) get("companyContactDelete");
    }

    public Mutation setCompanyContactDelete(CompanyContactDeletePayload arg) {
        optimisticData.put(getKey("companyContactDelete"), arg);
        return this;
    }

    /**
    * Removes a company contact from a Company.
    */

    public CompanyContactRemoveFromCompanyPayload getCompanyContactRemoveFromCompany() {
        return (CompanyContactRemoveFromCompanyPayload) get("companyContactRemoveFromCompany");
    }

    public Mutation setCompanyContactRemoveFromCompany(CompanyContactRemoveFromCompanyPayload arg) {
        optimisticData.put(getKey("companyContactRemoveFromCompany"), arg);
        return this;
    }

    /**
    * Revokes a role on a company contact.
    */

    public CompanyContactRevokeRolePayload getCompanyContactRevokeRole() {
        return (CompanyContactRevokeRolePayload) get("companyContactRevokeRole");
    }

    public Mutation setCompanyContactRevokeRole(CompanyContactRevokeRolePayload arg) {
        optimisticData.put(getKey("companyContactRevokeRole"), arg);
        return this;
    }

    /**
    * Revokes roles on a company contact.
    */

    public CompanyContactRevokeRolesPayload getCompanyContactRevokeRoles() {
        return (CompanyContactRevokeRolesPayload) get("companyContactRevokeRoles");
    }

    public Mutation setCompanyContactRevokeRoles(CompanyContactRevokeRolesPayload arg) {
        optimisticData.put(getKey("companyContactRevokeRoles"), arg);
        return this;
    }

    /**
    * Sends the company contact a welcome email.
    */

    public CompanyContactSendWelcomeEmailPayload getCompanyContactSendWelcomeEmail() {
        return (CompanyContactSendWelcomeEmailPayload) get("companyContactSendWelcomeEmail");
    }

    public Mutation setCompanyContactSendWelcomeEmail(CompanyContactSendWelcomeEmailPayload arg) {
        optimisticData.put(getKey("companyContactSendWelcomeEmail"), arg);
        return this;
    }

    /**
    * Updates a company contact.
    */

    public CompanyContactUpdatePayload getCompanyContactUpdate() {
        return (CompanyContactUpdatePayload) get("companyContactUpdate");
    }

    public Mutation setCompanyContactUpdate(CompanyContactUpdatePayload arg) {
        optimisticData.put(getKey("companyContactUpdate"), arg);
        return this;
    }

    /**
    * Deletes one or more company contacts.
    */

    public CompanyContactsDeletePayload getCompanyContactsDelete() {
        return (CompanyContactsDeletePayload) get("companyContactsDelete");
    }

    public Mutation setCompanyContactsDelete(CompanyContactsDeletePayload arg) {
        optimisticData.put(getKey("companyContactsDelete"), arg);
        return this;
    }

    /**
    * Creates a company.
    */

    public CompanyCreatePayload getCompanyCreate() {
        return (CompanyCreatePayload) get("companyCreate");
    }

    public Mutation setCompanyCreate(CompanyCreatePayload arg) {
        optimisticData.put(getKey("companyCreate"), arg);
        return this;
    }

    /**
    * Deletes a company.
    */

    public CompanyDeletePayload getCompanyDelete() {
        return (CompanyDeletePayload) get("companyDelete");
    }

    public Mutation setCompanyDelete(CompanyDeletePayload arg) {
        optimisticData.put(getKey("companyDelete"), arg);
        return this;
    }

    /**
    * Updates an address on a company location.
    */

    public CompanyLocationAssignAddressPayload getCompanyLocationAssignAddress() {
        return (CompanyLocationAssignAddressPayload) get("companyLocationAssignAddress");
    }

    public Mutation setCompanyLocationAssignAddress(CompanyLocationAssignAddressPayload arg) {
        optimisticData.put(getKey("companyLocationAssignAddress"), arg);
        return this;
    }

    /**
    * Assigns roles on a company location.
    */

    public CompanyLocationAssignRolesPayload getCompanyLocationAssignRoles() {
        return (CompanyLocationAssignRolesPayload) get("companyLocationAssignRoles");
    }

    public Mutation setCompanyLocationAssignRoles(CompanyLocationAssignRolesPayload arg) {
        optimisticData.put(getKey("companyLocationAssignRoles"), arg);
        return this;
    }

    /**
    * Creates one or more mappings between a staff member at a shop and a company location.
    */

    public CompanyLocationAssignStaffMembersPayload getCompanyLocationAssignStaffMembers() {
        return (CompanyLocationAssignStaffMembersPayload) get("companyLocationAssignStaffMembers");
    }

    public Mutation setCompanyLocationAssignStaffMembers(CompanyLocationAssignStaffMembersPayload arg) {
        optimisticData.put(getKey("companyLocationAssignStaffMembers"), arg);
        return this;
    }

    /**
    * Creates a company location.
    */

    public CompanyLocationCreatePayload getCompanyLocationCreate() {
        return (CompanyLocationCreatePayload) get("companyLocationCreate");
    }

    public Mutation setCompanyLocationCreate(CompanyLocationCreatePayload arg) {
        optimisticData.put(getKey("companyLocationCreate"), arg);
        return this;
    }

    /**
    * Deletes a company location.
    */

    public CompanyLocationDeletePayload getCompanyLocationDelete() {
        return (CompanyLocationDeletePayload) get("companyLocationDelete");
    }

    public Mutation setCompanyLocationDelete(CompanyLocationDeletePayload arg) {
        optimisticData.put(getKey("companyLocationDelete"), arg);
        return this;
    }

    /**
    * Deletes one or more existing mappings between a staff member at a shop and a company location.
    */

    public CompanyLocationRemoveStaffMembersPayload getCompanyLocationRemoveStaffMembers() {
        return (CompanyLocationRemoveStaffMembersPayload) get("companyLocationRemoveStaffMembers");
    }

    public Mutation setCompanyLocationRemoveStaffMembers(CompanyLocationRemoveStaffMembersPayload arg) {
        optimisticData.put(getKey("companyLocationRemoveStaffMembers"), arg);
        return this;
    }

    /**
    * Revokes roles on a company location.
    */

    public CompanyLocationRevokeRolesPayload getCompanyLocationRevokeRoles() {
        return (CompanyLocationRevokeRolesPayload) get("companyLocationRevokeRoles");
    }

    public Mutation setCompanyLocationRevokeRoles(CompanyLocationRevokeRolesPayload arg) {
        optimisticData.put(getKey("companyLocationRevokeRoles"), arg);
        return this;
    }

    /**
    * Sets the tax settings for a company location.
    */

    public CompanyLocationTaxSettingsUpdatePayload getCompanyLocationTaxSettingsUpdate() {
        return (CompanyLocationTaxSettingsUpdatePayload) get("companyLocationTaxSettingsUpdate");
    }

    public Mutation setCompanyLocationTaxSettingsUpdate(CompanyLocationTaxSettingsUpdatePayload arg) {
        optimisticData.put(getKey("companyLocationTaxSettingsUpdate"), arg);
        return this;
    }

    /**
    * Updates a company location.
    */

    public CompanyLocationUpdatePayload getCompanyLocationUpdate() {
        return (CompanyLocationUpdatePayload) get("companyLocationUpdate");
    }

    public Mutation setCompanyLocationUpdate(CompanyLocationUpdatePayload arg) {
        optimisticData.put(getKey("companyLocationUpdate"), arg);
        return this;
    }

    /**
    * Deletes a list of company locations.
    */

    public CompanyLocationsDeletePayload getCompanyLocationsDelete() {
        return (CompanyLocationsDeletePayload) get("companyLocationsDelete");
    }

    public Mutation setCompanyLocationsDelete(CompanyLocationsDeletePayload arg) {
        optimisticData.put(getKey("companyLocationsDelete"), arg);
        return this;
    }

    /**
    * Revokes the main contact from the company.
    */

    public CompanyRevokeMainContactPayload getCompanyRevokeMainContact() {
        return (CompanyRevokeMainContactPayload) get("companyRevokeMainContact");
    }

    public Mutation setCompanyRevokeMainContact(CompanyRevokeMainContactPayload arg) {
        optimisticData.put(getKey("companyRevokeMainContact"), arg);
        return this;
    }

    /**
    * Updates a company.
    */

    public CompanyUpdatePayload getCompanyUpdate() {
        return (CompanyUpdatePayload) get("companyUpdate");
    }

    public Mutation setCompanyUpdate(CompanyUpdatePayload arg) {
        optimisticData.put(getKey("companyUpdate"), arg);
        return this;
    }

    /**
    * Add tax exemptions for the customer.
    */

    public CustomerAddTaxExemptionsPayload getCustomerAddTaxExemptions() {
        return (CustomerAddTaxExemptionsPayload) get("customerAddTaxExemptions");
    }

    public Mutation setCustomerAddTaxExemptions(CustomerAddTaxExemptionsPayload arg) {
        optimisticData.put(getKey("customerAddTaxExemptions"), arg);
        return this;
    }

    /**
    * Cancels a pending erasure of a customer's data.
    * To request an erasure of a customer's data use the [customerRequestDataErasure
    * mutation](https://shopify.dev/api/admin-graphql/unstable/mutations/customerRequestDataErasure).
    */

    public CustomerCancelDataErasurePayload getCustomerCancelDataErasure() {
        return (CustomerCancelDataErasurePayload) get("customerCancelDataErasure");
    }

    public Mutation setCustomerCancelDataErasure(CustomerCancelDataErasurePayload arg) {
        optimisticData.put(getKey("customerCancelDataErasure"), arg);
        return this;
    }

    /**
    * Create a new customer. As of API version 2022-10, apps using protected customer data must meet the
    * protected customer data
    * [requirements](https://shopify.dev/apps/store/data-protection/protected-customer-data).
    */

    public CustomerCreatePayload getCustomerCreate() {
        return (CustomerCreatePayload) get("customerCreate");
    }

    public Mutation setCustomerCreate(CustomerCreatePayload arg) {
        optimisticData.put(getKey("customerCreate"), arg);
        return this;
    }

    /**
    * Delete a customer. As of API version 2022-10, apps using protected customer data must meet the
    * protected customer data
    * [requirements](https://shopify.dev/apps/store/data-protection/protected-customer-data).
    */

    public CustomerDeletePayload getCustomerDelete() {
        return (CustomerDeletePayload) get("customerDelete");
    }

    public Mutation setCustomerDelete(CustomerDeletePayload arg) {
        optimisticData.put(getKey("customerDelete"), arg);
        return this;
    }

    /**
    * Update a customer's email marketing information information.
    */

    public CustomerEmailMarketingConsentUpdatePayload getCustomerEmailMarketingConsentUpdate() {
        return (CustomerEmailMarketingConsentUpdatePayload) get("customerEmailMarketingConsentUpdate");
    }

    public Mutation setCustomerEmailMarketingConsentUpdate(CustomerEmailMarketingConsentUpdatePayload arg) {
        optimisticData.put(getKey("customerEmailMarketingConsentUpdate"), arg);
        return this;
    }

    /**
    * Generate an account activation URL for a customer.
    */

    public CustomerGenerateAccountActivationUrlPayload getCustomerGenerateAccountActivationUrl() {
        return (CustomerGenerateAccountActivationUrlPayload) get("customerGenerateAccountActivationUrl");
    }

    public Mutation setCustomerGenerateAccountActivationUrl(CustomerGenerateAccountActivationUrlPayload arg) {
        optimisticData.put(getKey("customerGenerateAccountActivationUrl"), arg);
        return this;
    }

    /**
    * Merges two customers.
    */

    public CustomerMergePayload getCustomerMerge() {
        return (CustomerMergePayload) get("customerMerge");
    }

    public Mutation setCustomerMerge(CustomerMergePayload arg) {
        optimisticData.put(getKey("customerMerge"), arg);
        return this;
    }

    /**
    * Creates a vaulted payment method for a customer from duplication data.
    * This data must be obtained from another shop within the same organization.
    * Currently, this only supports Shop Pay payment methods. This is only available for selected partner
    * apps.
    */

    public CustomerPaymentMethodCreateFromDuplicationDataPayload getCustomerPaymentMethodCreateFromDuplicationData() {
        return (CustomerPaymentMethodCreateFromDuplicationDataPayload) get("customerPaymentMethodCreateFromDuplicationData");
    }

    public Mutation setCustomerPaymentMethodCreateFromDuplicationData(CustomerPaymentMethodCreateFromDuplicationDataPayload arg) {
        optimisticData.put(getKey("customerPaymentMethodCreateFromDuplicationData"), arg);
        return this;
    }

    /**
    * Creates a credit card payment method for a customer using a session id.
    * These values are only obtained through card imports happening from a PCI compliant environment.
    * Please use customerPaymentMethodRemoteCreate if you are not managing credit cards directly.
    */

    public CustomerPaymentMethodCreditCardCreatePayload getCustomerPaymentMethodCreditCardCreate() {
        return (CustomerPaymentMethodCreditCardCreatePayload) get("customerPaymentMethodCreditCardCreate");
    }

    public Mutation setCustomerPaymentMethodCreditCardCreate(CustomerPaymentMethodCreditCardCreatePayload arg) {
        optimisticData.put(getKey("customerPaymentMethodCreditCardCreate"), arg);
        return this;
    }

    /**
    * Updates the credit card payment method for a customer.
    */

    public CustomerPaymentMethodCreditCardUpdatePayload getCustomerPaymentMethodCreditCardUpdate() {
        return (CustomerPaymentMethodCreditCardUpdatePayload) get("customerPaymentMethodCreditCardUpdate");
    }

    public Mutation setCustomerPaymentMethodCreditCardUpdate(CustomerPaymentMethodCreditCardUpdatePayload arg) {
        optimisticData.put(getKey("customerPaymentMethodCreditCardUpdate"), arg);
        return this;
    }

    /**
    * Returns encrypted data that can be used to duplicate the payment method in another shop within the
    * same organization.
    * Currently, this only supports Shop Pay payment methods. This is only available for selected partner
    * apps.
    */

    public CustomerPaymentMethodGetDuplicationDataPayload getCustomerPaymentMethodGetDuplicationData() {
        return (CustomerPaymentMethodGetDuplicationDataPayload) get("customerPaymentMethodGetDuplicationData");
    }

    public Mutation setCustomerPaymentMethodGetDuplicationData(CustomerPaymentMethodGetDuplicationDataPayload arg) {
        optimisticData.put(getKey("customerPaymentMethodGetDuplicationData"), arg);
        return this;
    }

    /**
    * Returns a URL that allows the customer to update a specific payment method.
    * Currently, `customerPaymentMethodGetUpdateUrl` only supports Shop Pay.
    */

    public CustomerPaymentMethodGetUpdateUrlPayload getCustomerPaymentMethodGetUpdateUrl() {
        return (CustomerPaymentMethodGetUpdateUrlPayload) get("customerPaymentMethodGetUpdateUrl");
    }

    public Mutation setCustomerPaymentMethodGetUpdateUrl(CustomerPaymentMethodGetUpdateUrlPayload arg) {
        optimisticData.put(getKey("customerPaymentMethodGetUpdateUrl"), arg);
        return this;
    }

    /**
    * Creates a PayPal billing agreement for a customer.
    */

    public CustomerPaymentMethodPaypalBillingAgreementCreatePayload getCustomerPaymentMethodPaypalBillingAgreementCreate() {
        return (CustomerPaymentMethodPaypalBillingAgreementCreatePayload) get("customerPaymentMethodPaypalBillingAgreementCreate");
    }

    public Mutation setCustomerPaymentMethodPaypalBillingAgreementCreate(CustomerPaymentMethodPaypalBillingAgreementCreatePayload arg) {
        optimisticData.put(getKey("customerPaymentMethodPaypalBillingAgreementCreate"), arg);
        return this;
    }

    /**
    * Updates a PayPal billing agreement for a customer.
    */

    public CustomerPaymentMethodPaypalBillingAgreementUpdatePayload getCustomerPaymentMethodPaypalBillingAgreementUpdate() {
        return (CustomerPaymentMethodPaypalBillingAgreementUpdatePayload) get("customerPaymentMethodPaypalBillingAgreementUpdate");
    }

    public Mutation setCustomerPaymentMethodPaypalBillingAgreementUpdate(CustomerPaymentMethodPaypalBillingAgreementUpdatePayload arg) {
        optimisticData.put(getKey("customerPaymentMethodPaypalBillingAgreementUpdate"), arg);
        return this;
    }

    /**
    * Create a payment method from remote gateway identifiers.
    */

    public CustomerPaymentMethodRemoteCreatePayload getCustomerPaymentMethodRemoteCreate() {
        return (CustomerPaymentMethodRemoteCreatePayload) get("customerPaymentMethodRemoteCreate");
    }

    public Mutation setCustomerPaymentMethodRemoteCreate(CustomerPaymentMethodRemoteCreatePayload arg) {
        optimisticData.put(getKey("customerPaymentMethodRemoteCreate"), arg);
        return this;
    }

    /**
    * Revokes a customer's payment method.
    */

    public CustomerPaymentMethodRevokePayload getCustomerPaymentMethodRevoke() {
        return (CustomerPaymentMethodRevokePayload) get("customerPaymentMethodRevoke");
    }

    public Mutation setCustomerPaymentMethodRevoke(CustomerPaymentMethodRevokePayload arg) {
        optimisticData.put(getKey("customerPaymentMethodRevoke"), arg);
        return this;
    }

    /**
    * Sends a link to the customer so they can update a specific payment method.
    */

    public CustomerPaymentMethodSendUpdateEmailPayload getCustomerPaymentMethodSendUpdateEmail() {
        return (CustomerPaymentMethodSendUpdateEmailPayload) get("customerPaymentMethodSendUpdateEmail");
    }

    public Mutation setCustomerPaymentMethodSendUpdateEmail(CustomerPaymentMethodSendUpdateEmailPayload arg) {
        optimisticData.put(getKey("customerPaymentMethodSendUpdateEmail"), arg);
        return this;
    }

    /**
    * Remove tax exemptions from a customer.
    */

    public CustomerRemoveTaxExemptionsPayload getCustomerRemoveTaxExemptions() {
        return (CustomerRemoveTaxExemptionsPayload) get("customerRemoveTaxExemptions");
    }

    public Mutation setCustomerRemoveTaxExemptions(CustomerRemoveTaxExemptionsPayload arg) {
        optimisticData.put(getKey("customerRemoveTaxExemptions"), arg);
        return this;
    }

    /**
    * Replace tax exemptions for a customer.
    */

    public CustomerReplaceTaxExemptionsPayload getCustomerReplaceTaxExemptions() {
        return (CustomerReplaceTaxExemptionsPayload) get("customerReplaceTaxExemptions");
    }

    public Mutation setCustomerReplaceTaxExemptions(CustomerReplaceTaxExemptionsPayload arg) {
        optimisticData.put(getKey("customerReplaceTaxExemptions"), arg);
        return this;
    }

    /**
    * Enqueues a request to erase customer's data. Read more
    * [here](https://help.shopify.com/manual/privacy-and-security/privacy/processing-customer-data-request
    * s#erase-customer-personal-data).
    * To cancel the data erasure request use the [customerCancelDataErasure
    * mutation](https://shopify.dev/api/admin-graphql/unstable/mutations/customerCancelDataErasure).
    */

    public CustomerRequestDataErasurePayload getCustomerRequestDataErasure() {
        return (CustomerRequestDataErasurePayload) get("customerRequestDataErasure");
    }

    public Mutation setCustomerRequestDataErasure(CustomerRequestDataErasurePayload arg) {
        optimisticData.put(getKey("customerRequestDataErasure"), arg);
        return this;
    }

    /**
    * Creates a customer segment members query.
    */

    public CustomerSegmentMembersQueryCreatePayload getCustomerSegmentMembersQueryCreate() {
        return (CustomerSegmentMembersQueryCreatePayload) get("customerSegmentMembersQueryCreate");
    }

    public Mutation setCustomerSegmentMembersQueryCreate(CustomerSegmentMembersQueryCreatePayload arg) {
        optimisticData.put(getKey("customerSegmentMembersQueryCreate"), arg);
        return this;
    }

    /**
    * Sends the customer an account invite email.
    */

    public CustomerSendAccountInviteEmailPayload getCustomerSendAccountInviteEmail() {
        return (CustomerSendAccountInviteEmailPayload) get("customerSendAccountInviteEmail");
    }

    public Mutation setCustomerSendAccountInviteEmail(CustomerSendAccountInviteEmailPayload arg) {
        optimisticData.put(getKey("customerSendAccountInviteEmail"), arg);
        return this;
    }

    /**
    * Update a customer's SMS marketing consent information.
    */

    public CustomerSmsMarketingConsentUpdatePayload getCustomerSmsMarketingConsentUpdate() {
        return (CustomerSmsMarketingConsentUpdatePayload) get("customerSmsMarketingConsentUpdate");
    }

    public Mutation setCustomerSmsMarketingConsentUpdate(CustomerSmsMarketingConsentUpdatePayload arg) {
        optimisticData.put(getKey("customerSmsMarketingConsentUpdate"), arg);
        return this;
    }

    /**
    * Update a customer's attributes. As of API version 2022-10, apps using protected customer data must
    * meet the protected customer data
    * [requirements](https://shopify.dev/apps/store/data-protection/protected-customer-data).
    */

    public CustomerUpdatePayload getCustomerUpdate() {
        return (CustomerUpdatePayload) get("customerUpdate");
    }

    public Mutation setCustomerUpdate(CustomerUpdatePayload arg) {
        optimisticData.put(getKey("customerUpdate"), arg);
        return this;
    }

    /**
    * Updates a customer's default address.
    */

    public CustomerUpdateDefaultAddressPayload getCustomerUpdateDefaultAddress() {
        return (CustomerUpdateDefaultAddressPayload) get("customerUpdateDefaultAddress");
    }

    public Mutation setCustomerUpdateDefaultAddress(CustomerUpdateDefaultAddressPayload arg) {
        optimisticData.put(getKey("customerUpdateDefaultAddress"), arg);
        return this;
    }

    /**
    * Opt out a customer from data sale.
    */

    public DataSaleOptOutPayload getDataSaleOptOut() {
        return (DataSaleOptOutPayload) get("dataSaleOptOut");
    }

    public Mutation setDataSaleOptOut(DataSaleOptOutPayload arg) {
        optimisticData.put(getKey("dataSaleOptOut"), arg);
        return this;
    }

    /**
    * Creates a delegate access token.
    * To learn more about creating delegate access tokens, refer to
    * [Delegate OAuth access tokens to
    * subsystems](https://shopify.dev/docs/apps/build/authentication-authorization/access-tokens/use-deleg
    * ate-tokens).
    */

    public DelegateAccessTokenCreatePayload getDelegateAccessTokenCreate() {
        return (DelegateAccessTokenCreatePayload) get("delegateAccessTokenCreate");
    }

    public Mutation setDelegateAccessTokenCreate(DelegateAccessTokenCreatePayload arg) {
        optimisticData.put(getKey("delegateAccessTokenCreate"), arg);
        return this;
    }

    /**
    * Destroys a delegate access token.
    */

    public DelegateAccessTokenDestroyPayload getDelegateAccessTokenDestroy() {
        return (DelegateAccessTokenDestroyPayload) get("delegateAccessTokenDestroy");
    }

    public Mutation setDelegateAccessTokenDestroy(DelegateAccessTokenDestroyPayload arg) {
        optimisticData.put(getKey("delegateAccessTokenDestroy"), arg);
        return this;
    }

    /**
    * Activates and deactivates delivery customizations.
    */

    public DeliveryCustomizationActivationPayload getDeliveryCustomizationActivation() {
        return (DeliveryCustomizationActivationPayload) get("deliveryCustomizationActivation");
    }

    public Mutation setDeliveryCustomizationActivation(DeliveryCustomizationActivationPayload arg) {
        optimisticData.put(getKey("deliveryCustomizationActivation"), arg);
        return this;
    }

    /**
    * Creates a delivery customization.
    */

    public DeliveryCustomizationCreatePayload getDeliveryCustomizationCreate() {
        return (DeliveryCustomizationCreatePayload) get("deliveryCustomizationCreate");
    }

    public Mutation setDeliveryCustomizationCreate(DeliveryCustomizationCreatePayload arg) {
        optimisticData.put(getKey("deliveryCustomizationCreate"), arg);
        return this;
    }

    /**
    * Creates a delivery customization.
    */

    public DeliveryCustomizationDeletePayload getDeliveryCustomizationDelete() {
        return (DeliveryCustomizationDeletePayload) get("deliveryCustomizationDelete");
    }

    public Mutation setDeliveryCustomizationDelete(DeliveryCustomizationDeletePayload arg) {
        optimisticData.put(getKey("deliveryCustomizationDelete"), arg);
        return this;
    }

    /**
    * Updates a delivery customization.
    */

    public DeliveryCustomizationUpdatePayload getDeliveryCustomizationUpdate() {
        return (DeliveryCustomizationUpdatePayload) get("deliveryCustomizationUpdate");
    }

    public Mutation setDeliveryCustomizationUpdate(DeliveryCustomizationUpdatePayload arg) {
        optimisticData.put(getKey("deliveryCustomizationUpdate"), arg);
        return this;
    }

    /**
    * Create a delivery profile.
    */

    public DeliveryProfileCreatePayload getDeliveryProfileCreate() {
        return (DeliveryProfileCreatePayload) get("deliveryProfileCreate");
    }

    public Mutation setDeliveryProfileCreate(DeliveryProfileCreatePayload arg) {
        optimisticData.put(getKey("deliveryProfileCreate"), arg);
        return this;
    }

    /**
    * Enqueue the removal of a delivery profile.
    */

    public DeliveryProfileRemovePayload getDeliveryProfileRemove() {
        return (DeliveryProfileRemovePayload) get("deliveryProfileRemove");
    }

    public Mutation setDeliveryProfileRemove(DeliveryProfileRemovePayload arg) {
        optimisticData.put(getKey("deliveryProfileRemove"), arg);
        return this;
    }

    /**
    * Update a delivery profile.
    */

    public DeliveryProfileUpdatePayload getDeliveryProfileUpdate() {
        return (DeliveryProfileUpdatePayload) get("deliveryProfileUpdate");
    }

    public Mutation setDeliveryProfileUpdate(DeliveryProfileUpdatePayload arg) {
        optimisticData.put(getKey("deliveryProfileUpdate"), arg);
        return this;
    }

    /**
    * Updates the delivery promise participants by adding or removing owners based on a branded promise
    * handle.
    */

    public DeliveryPromiseParticipantsUpdatePayload getDeliveryPromiseParticipantsUpdate() {
        return (DeliveryPromiseParticipantsUpdatePayload) get("deliveryPromiseParticipantsUpdate");
    }

    public Mutation setDeliveryPromiseParticipantsUpdate(DeliveryPromiseParticipantsUpdatePayload arg) {
        optimisticData.put(getKey("deliveryPromiseParticipantsUpdate"), arg);
        return this;
    }

    /**
    * Creates or updates a delivery promise provider. Currently restricted to select approved delivery
    * promise partners.
    */

    public DeliveryPromiseProviderUpsertPayload getDeliveryPromiseProviderUpsert() {
        return (DeliveryPromiseProviderUpsertPayload) get("deliveryPromiseProviderUpsert");
    }

    public Mutation setDeliveryPromiseProviderUpsert(DeliveryPromiseProviderUpsertPayload arg) {
        optimisticData.put(getKey("deliveryPromiseProviderUpsert"), arg);
        return this;
    }

    /**
    * Set the delivery settings for a shop.
    */

    public DeliverySettingUpdatePayload getDeliverySettingUpdate() {
        return (DeliverySettingUpdatePayload) get("deliverySettingUpdate");
    }

    public Mutation setDeliverySettingUpdate(DeliverySettingUpdatePayload arg) {
        optimisticData.put(getKey("deliverySettingUpdate"), arg);
        return this;
    }

    /**
    * Assigns a location as the shipping origin while using legacy compatibility mode for multi-location
    * delivery profiles.
    */

    public DeliveryShippingOriginAssignPayload getDeliveryShippingOriginAssign() {
        return (DeliveryShippingOriginAssignPayload) get("deliveryShippingOriginAssign");
    }

    public Mutation setDeliveryShippingOriginAssign(DeliveryShippingOriginAssignPayload arg) {
        optimisticData.put(getKey("deliveryShippingOriginAssign"), arg);
        return this;
    }

    /**
    * Activates an automatic discount.
    */

    public DiscountAutomaticActivatePayload getDiscountAutomaticActivate() {
        return (DiscountAutomaticActivatePayload) get("discountAutomaticActivate");
    }

    public Mutation setDiscountAutomaticActivate(DiscountAutomaticActivatePayload arg) {
        optimisticData.put(getKey("discountAutomaticActivate"), arg);
        return this;
    }

    /**
    * Creates an automatic discount that's managed by an app.
    * Use this mutation with [Shopify Functions](https://shopify.dev/docs/apps/build/functions)
    * when you need advanced, custom, or dynamic discount capabilities that aren't supported by
    * [Shopify's native discount types](https://help.shopify.com/manual/discounts/discount-types).
    * For example, use this mutation to create an automatic discount using an app's
    * "Volume" discount type that applies a percentage
    * off when customers purchase more than the minimum quantity of a product. For an example
    * implementation,
    * refer to [our tutorial](https://shopify.dev/docs/apps/build/discounts/build-discount-function).
    * > Note:
    * > To create code discounts with custom logic, use the
    * [`discountCodeAppCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountCodeAp
    * pCreate)
    * mutation.
    */

    public DiscountAutomaticAppCreatePayload getDiscountAutomaticAppCreate() {
        return (DiscountAutomaticAppCreatePayload) get("discountAutomaticAppCreate");
    }

    public Mutation setDiscountAutomaticAppCreate(DiscountAutomaticAppCreatePayload arg) {
        optimisticData.put(getKey("discountAutomaticAppCreate"), arg);
        return this;
    }

    /**
    * Updates an existing automatic discount that's managed by an app using
    * [Shopify Functions](https://shopify.dev/docs/apps/build/functions).
    * Use this mutation when you need advanced, custom, or
    * dynamic discount capabilities that aren't supported by
    * [Shopify's native discount types](https://help.shopify.com/manual/discounts/discount-types).
    * For example, use this mutation to update a new "Volume" discount type that applies a percentage
    * off when customers purchase more than the minimum quantity of a product. For an example
    * implementation,
    * refer to [our tutorial](https://shopify.dev/docs/apps/build/discounts/build-discount-function).
    * > Note:
    * > To update code discounts with custom logic, use the
    * [`discountCodeAppUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountCodeAp
    * pUpdate)
    * mutation instead.
    */

    public DiscountAutomaticAppUpdatePayload getDiscountAutomaticAppUpdate() {
        return (DiscountAutomaticAppUpdatePayload) get("discountAutomaticAppUpdate");
    }

    public Mutation setDiscountAutomaticAppUpdate(DiscountAutomaticAppUpdatePayload arg) {
        optimisticData.put(getKey("discountAutomaticAppUpdate"), arg);
        return this;
    }

    /**
    * Creates an
    * [amount off
    * discount](https://help.shopify.com/manual/discounts/discount-types/percentage-fixed-amount)
    * that's automatically applied on a cart and at checkout.
    * > Note:
    * > To create code discounts, use the
    * [`discountCodeBasicCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountCode
    * BasicCreate)
    * mutation.
    */

    public DiscountAutomaticBasicCreatePayload getDiscountAutomaticBasicCreate() {
        return (DiscountAutomaticBasicCreatePayload) get("discountAutomaticBasicCreate");
    }

    public Mutation setDiscountAutomaticBasicCreate(DiscountAutomaticBasicCreatePayload arg) {
        optimisticData.put(getKey("discountAutomaticBasicCreate"), arg);
        return this;
    }

    /**
    * Updates an existing
    * [amount off
    * discount](https://help.shopify.com/manual/discounts/discount-types/percentage-fixed-amount)
    * that's automatically applied on a cart and at checkout.
    * > Note:
    * > To update code discounts, use the
    * [`discountCodeBasicUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountCode
    * BasicUpdate)
    * mutation instead.
    */

    public DiscountAutomaticBasicUpdatePayload getDiscountAutomaticBasicUpdate() {
        return (DiscountAutomaticBasicUpdatePayload) get("discountAutomaticBasicUpdate");
    }

    public Mutation setDiscountAutomaticBasicUpdate(DiscountAutomaticBasicUpdatePayload arg) {
        optimisticData.put(getKey("discountAutomaticBasicUpdate"), arg);
        return this;
    }

    /**
    * Asynchronously delete automatic discounts in bulk if a `search` or `saved_search_id` argument is
    * provided or if a
    * maximum discount threshold is reached (1,000). Otherwise, deletions will occur inline.
    * **Warning:** All automatic discounts will be deleted if a blank `search` argument is provided.
    */

    public DiscountAutomaticBulkDeletePayload getDiscountAutomaticBulkDelete() {
        return (DiscountAutomaticBulkDeletePayload) get("discountAutomaticBulkDelete");
    }

    public Mutation setDiscountAutomaticBulkDelete(DiscountAutomaticBulkDeletePayload arg) {
        optimisticData.put(getKey("discountAutomaticBulkDelete"), arg);
        return this;
    }

    /**
    * Creates a
    * [buy X get Y discount (BXGY)](https://help.shopify.com/manual/discounts/discount-types/buy-x-get-y)
    * that's automatically applied on a cart and at checkout.
    * > Note:
    * > To create code discounts, use the
    * [`discountCodeBxgyCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountCodeB
    * xgyCreate)
    * mutation.
    */

    public DiscountAutomaticBxgyCreatePayload getDiscountAutomaticBxgyCreate() {
        return (DiscountAutomaticBxgyCreatePayload) get("discountAutomaticBxgyCreate");
    }

    public Mutation setDiscountAutomaticBxgyCreate(DiscountAutomaticBxgyCreatePayload arg) {
        optimisticData.put(getKey("discountAutomaticBxgyCreate"), arg);
        return this;
    }

    /**
    * Updates an existing
    * [buy X get Y discount (BXGY)](https://help.shopify.com/manual/discounts/discount-types/buy-x-get-y)
    * that's automatically applied on a cart and at checkout.
    * > Note:
    * > To update code discounts, use the
    * [`discountCodeBxgyUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountCodeB
    * xgyUpdate)
    * mutation instead.
    */

    public DiscountAutomaticBxgyUpdatePayload getDiscountAutomaticBxgyUpdate() {
        return (DiscountAutomaticBxgyUpdatePayload) get("discountAutomaticBxgyUpdate");
    }

    public Mutation setDiscountAutomaticBxgyUpdate(DiscountAutomaticBxgyUpdatePayload arg) {
        optimisticData.put(getKey("discountAutomaticBxgyUpdate"), arg);
        return this;
    }

    /**
    * Deactivates an automatic discount.
    */

    public DiscountAutomaticDeactivatePayload getDiscountAutomaticDeactivate() {
        return (DiscountAutomaticDeactivatePayload) get("discountAutomaticDeactivate");
    }

    public Mutation setDiscountAutomaticDeactivate(DiscountAutomaticDeactivatePayload arg) {
        optimisticData.put(getKey("discountAutomaticDeactivate"), arg);
        return this;
    }

    /**
    * Deletes an
    * [automatic discount](https://help.shopify.com/manual/discounts/discount-types#automatic-discounts).
    */

    public DiscountAutomaticDeletePayload getDiscountAutomaticDelete() {
        return (DiscountAutomaticDeletePayload) get("discountAutomaticDelete");
    }

    public Mutation setDiscountAutomaticDelete(DiscountAutomaticDeletePayload arg) {
        optimisticData.put(getKey("discountAutomaticDelete"), arg);
        return this;
    }

    /**
    * Creates a
    * [free shipping discount](https://help.shopify.com/manual/discounts/discount-types/free-shipping)
    * that's automatically applied on a cart and at checkout.
    * > Note:
    * > To create code discounts, use the
    * [`discountCodeFreeShippingCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/disco
    * untCodeFreeShippingCreate)
    * mutation.
    */

    public DiscountAutomaticFreeShippingCreatePayload getDiscountAutomaticFreeShippingCreate() {
        return (DiscountAutomaticFreeShippingCreatePayload) get("discountAutomaticFreeShippingCreate");
    }

    public Mutation setDiscountAutomaticFreeShippingCreate(DiscountAutomaticFreeShippingCreatePayload arg) {
        optimisticData.put(getKey("discountAutomaticFreeShippingCreate"), arg);
        return this;
    }

    /**
    * Updates an existing
    * [free shipping discount](https://help.shopify.com/manual/discounts/discount-types/free-shipping)
    * that's automatically applied on a cart and at checkout.
    * > Note:
    * > To update code discounts, use the
    * [`discountCodeFreeShippingUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/disco
    * untCodeFreeShippingUpdate)
    * mutation instead.
    */

    public DiscountAutomaticFreeShippingUpdatePayload getDiscountAutomaticFreeShippingUpdate() {
        return (DiscountAutomaticFreeShippingUpdatePayload) get("discountAutomaticFreeShippingUpdate");
    }

    public Mutation setDiscountAutomaticFreeShippingUpdate(DiscountAutomaticFreeShippingUpdatePayload arg) {
        optimisticData.put(getKey("discountAutomaticFreeShippingUpdate"), arg);
        return this;
    }

    /**
    * Activates a code discount.
    */

    public DiscountCodeActivatePayload getDiscountCodeActivate() {
        return (DiscountCodeActivatePayload) get("discountCodeActivate");
    }

    public Mutation setDiscountCodeActivate(DiscountCodeActivatePayload arg) {
        optimisticData.put(getKey("discountCodeActivate"), arg);
        return this;
    }

    /**
    * Creates a code discount. The discount type must be provided by an app extension that uses [Shopify
    * Functions](https://shopify.dev/docs/apps/build/functions). Functions can implement
    * [order](https://shopify.dev/docs/api/functions/reference/order-discounts),
    * [product](https://shopify.dev/docs/api/functions/reference/product-discounts), or
    * [shipping](https://shopify.dev/docs/api/functions/reference/shipping-discounts) discount functions.
    * Use this mutation with Shopify Functions when you need custom logic beyond [Shopify's native
    * discount types](https://help.shopify.com/manual/discounts/discount-types).
    * For example, use this mutation to create a code discount using an app's "Volume" discount type that
    * applies a percentage off when customers purchase more than the minimum quantity
    * of a product. For an example implementation, refer to [our
    * tutorial](https://shopify.dev/docs/apps/build/discounts/build-discount-function).
    * > Note:
    * > To create automatic discounts with custom logic, use
    * [`discountAutomaticAppCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountA
    * utomaticAppCreate).
    */

    public DiscountCodeAppCreatePayload getDiscountCodeAppCreate() {
        return (DiscountCodeAppCreatePayload) get("discountCodeAppCreate");
    }

    public Mutation setDiscountCodeAppCreate(DiscountCodeAppCreatePayload arg) {
        optimisticData.put(getKey("discountCodeAppCreate"), arg);
        return this;
    }

    /**
    * Updates a code discount, where the discount type is provided by an app extension that uses [Shopify
    * Functions](https://shopify.dev/docs/apps/build/functions). Use this mutation when you need advanced,
    * custom, or dynamic discount capabilities that aren't supported by [Shopify's native discount
    * types](https://help.shopify.com/manual/discounts/discount-types).
    * > Note:
    * > To update automatic discounts, use
    * [`discountAutomaticAppUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountA
    * utomaticAppUpdate).
    */

    public DiscountCodeAppUpdatePayload getDiscountCodeAppUpdate() {
        return (DiscountCodeAppUpdatePayload) get("discountCodeAppUpdate");
    }

    public Mutation setDiscountCodeAppUpdate(DiscountCodeAppUpdatePayload arg) {
        optimisticData.put(getKey("discountCodeAppUpdate"), arg);
        return this;
    }

    /**
    * Creates an [amount off
    * discount](https://help.shopify.com/manual/discounts/discount-types/percentage-fixed-amount) that's
    * applied on a cart and at checkout when a customer enters a code. Amount off discounts can be a
    * percentage off or a fixed amount off.
    * > Note:
    * > To create discounts that are automatically applied on a cart and at checkout, use the
    * [`discountAutomaticBasicCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discoun
    * tAutomaticBasicCreate) mutation.
    */

    public DiscountCodeBasicCreatePayload getDiscountCodeBasicCreate() {
        return (DiscountCodeBasicCreatePayload) get("discountCodeBasicCreate");
    }

    public Mutation setDiscountCodeBasicCreate(DiscountCodeBasicCreatePayload arg) {
        optimisticData.put(getKey("discountCodeBasicCreate"), arg);
        return this;
    }

    /**
    * Updates an [amount off
    * discount](https://help.shopify.com/manual/discounts/discount-types/percentage-fixed-amount) that's
    * applied on a cart and at checkout when a customer enters a code. Amount off discounts can be a
    * percentage off or a fixed amount off.
    * > Note:
    * > To update discounts that are automatically applied on a cart and at checkout, use the
    * [`discountAutomaticBasicUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discoun
    * tAutomaticBasicUpdate) mutation.
    */

    public DiscountCodeBasicUpdatePayload getDiscountCodeBasicUpdate() {
        return (DiscountCodeBasicUpdatePayload) get("discountCodeBasicUpdate");
    }

    public Mutation setDiscountCodeBasicUpdate(DiscountCodeBasicUpdatePayload arg) {
        optimisticData.put(getKey("discountCodeBasicUpdate"), arg);
        return this;
    }

    /**
    * Activates multiple [code
    * discounts](https://help.shopify.com/manual/discounts/discount-types#discount-codes) asynchronously
    * using one of the following:
    * - A search query
    * - A saved search ID
    * - A list of discount code IDs
    * For example, you can activate discounts for all codes that match a search criteria, or activate a
    * predefined set of discount codes.
    */

    public DiscountCodeBulkActivatePayload getDiscountCodeBulkActivate() {
        return (DiscountCodeBulkActivatePayload) get("discountCodeBulkActivate");
    }

    public Mutation setDiscountCodeBulkActivate(DiscountCodeBulkActivatePayload arg) {
        optimisticData.put(getKey("discountCodeBulkActivate"), arg);
        return this;
    }

    /**
    * Deactivates multiple [code-based
    * discounts](https://help.shopify.com/manual/discounts/discount-types#discount-codes) asynchronously
    * using one of the following:
    * - A search query
    * - A saved search ID
    * - A list of discount code IDs
    * For example, you can deactivate discounts for all codes that match a search criteria, or deactivate
    * a predefined set of discount codes.
    */

    public DiscountCodeBulkDeactivatePayload getDiscountCodeBulkDeactivate() {
        return (DiscountCodeBulkDeactivatePayload) get("discountCodeBulkDeactivate");
    }

    public Mutation setDiscountCodeBulkDeactivate(DiscountCodeBulkDeactivatePayload arg) {
        optimisticData.put(getKey("discountCodeBulkDeactivate"), arg);
        return this;
    }

    /**
    * Deletes multiple [code-based
    * discounts](https://help.shopify.com/manual/discounts/discount-types#discount-codes) asynchronously
    * using one of the following:
    * - A search query
    * - A saved search ID
    * - A list of discount code IDs
    * For example, you can delete discounts for all codes that match a search criteria, or delete a
    * predefined set of discount codes.
    */

    public DiscountCodeBulkDeletePayload getDiscountCodeBulkDelete() {
        return (DiscountCodeBulkDeletePayload) get("discountCodeBulkDelete");
    }

    public Mutation setDiscountCodeBulkDelete(DiscountCodeBulkDeletePayload arg) {
        optimisticData.put(getKey("discountCodeBulkDelete"), arg);
        return this;
    }

    /**
    * Creates a
    * [buy X get Y discount (BXGY)](https://help.shopify.com/manual/discounts/discount-types/buy-x-get-y)
    * that's applied on a cart and at checkout when a customer enters a code.
    * > Note:
    * > To create discounts that are automatically applied on a cart and at checkout, use the
    * [`discountAutomaticBxgyCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discount
    * AutomaticBxgyCreate)
    * mutation.
    */

    public DiscountCodeBxgyCreatePayload getDiscountCodeBxgyCreate() {
        return (DiscountCodeBxgyCreatePayload) get("discountCodeBxgyCreate");
    }

    public Mutation setDiscountCodeBxgyCreate(DiscountCodeBxgyCreatePayload arg) {
        optimisticData.put(getKey("discountCodeBxgyCreate"), arg);
        return this;
    }

    /**
    * Updates a
    * [buy X get Y discount (BXGY)](https://help.shopify.com/manual/discounts/discount-types/buy-x-get-y)
    * that's applied on a cart and at checkout when a customer enters a code.
    * > Note:
    * > To update discounts that are automatically applied on a cart and at checkout, use the
    * [`discountAutomaticBxgyUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discount
    * AutomaticBxgyUpdate)
    * mutation.
    */

    public DiscountCodeBxgyUpdatePayload getDiscountCodeBxgyUpdate() {
        return (DiscountCodeBxgyUpdatePayload) get("discountCodeBxgyUpdate");
    }

    public Mutation setDiscountCodeBxgyUpdate(DiscountCodeBxgyUpdatePayload arg) {
        optimisticData.put(getKey("discountCodeBxgyUpdate"), arg);
        return this;
    }

    /**
    * Deactivates a code discount.
    */

    public DiscountCodeDeactivatePayload getDiscountCodeDeactivate() {
        return (DiscountCodeDeactivatePayload) get("discountCodeDeactivate");
    }

    public Mutation setDiscountCodeDeactivate(DiscountCodeDeactivatePayload arg) {
        optimisticData.put(getKey("discountCodeDeactivate"), arg);
        return this;
    }

    /**
    * Deletes a
    * [code discount](https://help.shopify.com/manual/discounts/discount-types#discount-codes).
    */

    public DiscountCodeDeletePayload getDiscountCodeDelete() {
        return (DiscountCodeDeletePayload) get("discountCodeDelete");
    }

    public Mutation setDiscountCodeDelete(DiscountCodeDeletePayload arg) {
        optimisticData.put(getKey("discountCodeDelete"), arg);
        return this;
    }

    /**
    * Creates an [free shipping
    * discount](https://help.shopify.com/manual/discounts/discount-types/free-shipping) that's applied on
    * a cart and at checkout when a customer enters a code.
    * > Note:
    * > To create discounts that are automatically applied on a cart and at checkout, use the
    * [`discountAutomaticFreeShippingCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/
    * discountAutomaticFreeShippingCreate) mutation.
    */

    public DiscountCodeFreeShippingCreatePayload getDiscountCodeFreeShippingCreate() {
        return (DiscountCodeFreeShippingCreatePayload) get("discountCodeFreeShippingCreate");
    }

    public Mutation setDiscountCodeFreeShippingCreate(DiscountCodeFreeShippingCreatePayload arg) {
        optimisticData.put(getKey("discountCodeFreeShippingCreate"), arg);
        return this;
    }

    /**
    * Updates a [free shipping
    * discount](https://help.shopify.com/manual/discounts/discount-types/free-shipping) that's applied on
    * a cart and at checkout when a customer enters a code.
    * > Note:
    * > To update a free shipping discount that's automatically applied on a cart and at checkout, use the
    * [`discountAutomaticFreeShippingUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/
    * discountAutomaticFreeShippingUpdate) mutation.
    */

    public DiscountCodeFreeShippingUpdatePayload getDiscountCodeFreeShippingUpdate() {
        return (DiscountCodeFreeShippingUpdatePayload) get("discountCodeFreeShippingUpdate");
    }

    public Mutation setDiscountCodeFreeShippingUpdate(DiscountCodeFreeShippingUpdatePayload arg) {
        optimisticData.put(getKey("discountCodeFreeShippingUpdate"), arg);
        return this;
    }

    /**
    * Asynchronously delete
    * [discount codes](https://help.shopify.com/manual/discounts/discount-types#discount-codes)
    * in bulk that customers can use to redeem a discount.
    */

    public DiscountCodeRedeemCodeBulkDeletePayload getDiscountCodeRedeemCodeBulkDelete() {
        return (DiscountCodeRedeemCodeBulkDeletePayload) get("discountCodeRedeemCodeBulkDelete");
    }

    public Mutation setDiscountCodeRedeemCodeBulkDelete(DiscountCodeRedeemCodeBulkDeletePayload arg) {
        optimisticData.put(getKey("discountCodeRedeemCodeBulkDelete"), arg);
        return this;
    }

    /**
    * Asynchronously add
    * [discount codes](https://help.shopify.com/manual/discounts/discount-types#discount-codes)
    * in bulk that customers can use to redeem a discount. You can use the `discountRedeemCodeBulkAdd`
    * mutation
    * to automate the distribution of discount codes through emails or other
    * marketing channels.
    */

    public DiscountRedeemCodeBulkAddPayload getDiscountRedeemCodeBulkAdd() {
        return (DiscountRedeemCodeBulkAddPayload) get("discountRedeemCodeBulkAdd");
    }

    public Mutation setDiscountRedeemCodeBulkAdd(DiscountRedeemCodeBulkAddPayload arg) {
        optimisticData.put(getKey("discountRedeemCodeBulkAdd"), arg);
        return this;
    }

    /**
    * Updates a dispute evidence.
    */

    public DisputeEvidenceUpdatePayload getDisputeEvidenceUpdate() {
        return (DisputeEvidenceUpdatePayload) get("disputeEvidenceUpdate");
    }

    public Mutation setDisputeEvidenceUpdate(DisputeEvidenceUpdatePayload arg) {
        optimisticData.put(getKey("disputeEvidenceUpdate"), arg);
        return this;
    }

    /**
    * Adds tags to multiple draft orders.
    */

    public DraftOrderBulkAddTagsPayload getDraftOrderBulkAddTags() {
        return (DraftOrderBulkAddTagsPayload) get("draftOrderBulkAddTags");
    }

    public Mutation setDraftOrderBulkAddTags(DraftOrderBulkAddTagsPayload arg) {
        optimisticData.put(getKey("draftOrderBulkAddTags"), arg);
        return this;
    }

    /**
    * Deletes multiple draft orders.
    */

    public DraftOrderBulkDeletePayload getDraftOrderBulkDelete() {
        return (DraftOrderBulkDeletePayload) get("draftOrderBulkDelete");
    }

    public Mutation setDraftOrderBulkDelete(DraftOrderBulkDeletePayload arg) {
        optimisticData.put(getKey("draftOrderBulkDelete"), arg);
        return this;
    }

    /**
    * Removes tags from multiple draft orders.
    */

    public DraftOrderBulkRemoveTagsPayload getDraftOrderBulkRemoveTags() {
        return (DraftOrderBulkRemoveTagsPayload) get("draftOrderBulkRemoveTags");
    }

    public Mutation setDraftOrderBulkRemoveTags(DraftOrderBulkRemoveTagsPayload arg) {
        optimisticData.put(getKey("draftOrderBulkRemoveTags"), arg);
        return this;
    }

    /**
    * Calculates the properties of a draft order. Useful for determining information
    * such as total taxes or price without actually creating a draft order.
    */

    public DraftOrderCalculatePayload getDraftOrderCalculate() {
        return (DraftOrderCalculatePayload) get("draftOrderCalculate");
    }

    public Mutation setDraftOrderCalculate(DraftOrderCalculatePayload arg) {
        optimisticData.put(getKey("draftOrderCalculate"), arg);
        return this;
    }

    /**
    * Completes a draft order and creates an order.
    */

    public DraftOrderCompletePayload getDraftOrderComplete() {
        return (DraftOrderCompletePayload) get("draftOrderComplete");
    }

    public Mutation setDraftOrderComplete(DraftOrderCompletePayload arg) {
        optimisticData.put(getKey("draftOrderComplete"), arg);
        return this;
    }

    /**
    * Creates a draft order.
    */

    public DraftOrderCreatePayload getDraftOrderCreate() {
        return (DraftOrderCreatePayload) get("draftOrderCreate");
    }

    public Mutation setDraftOrderCreate(DraftOrderCreatePayload arg) {
        optimisticData.put(getKey("draftOrderCreate"), arg);
        return this;
    }

    /**
    * Creates a draft order from order.
    */

    public DraftOrderCreateFromOrderPayload getDraftOrderCreateFromOrder() {
        return (DraftOrderCreateFromOrderPayload) get("draftOrderCreateFromOrder");
    }

    public Mutation setDraftOrderCreateFromOrder(DraftOrderCreateFromOrderPayload arg) {
        optimisticData.put(getKey("draftOrderCreateFromOrder"), arg);
        return this;
    }

    /**
    * Creates a merchant checkout for the given draft order.
    */

    public DraftOrderCreateMerchantCheckoutPayload getDraftOrderCreateMerchantCheckout() {
        return (DraftOrderCreateMerchantCheckoutPayload) get("draftOrderCreateMerchantCheckout");
    }

    public Mutation setDraftOrderCreateMerchantCheckout(DraftOrderCreateMerchantCheckoutPayload arg) {
        optimisticData.put(getKey("draftOrderCreateMerchantCheckout"), arg);
        return this;
    }

    /**
    * Deletes a draft order.
    */

    public DraftOrderDeletePayload getDraftOrderDelete() {
        return (DraftOrderDeletePayload) get("draftOrderDelete");
    }

    public Mutation setDraftOrderDelete(DraftOrderDeletePayload arg) {
        optimisticData.put(getKey("draftOrderDelete"), arg);
        return this;
    }

    /**
    * Duplicates a draft order.
    */

    public DraftOrderDuplicatePayload getDraftOrderDuplicate() {
        return (DraftOrderDuplicatePayload) get("draftOrderDuplicate");
    }

    public Mutation setDraftOrderDuplicate(DraftOrderDuplicatePayload arg) {
        optimisticData.put(getKey("draftOrderDuplicate"), arg);
        return this;
    }

    /**
    * Previews a draft order invoice email.
    */

    public DraftOrderInvoicePreviewPayload getDraftOrderInvoicePreview() {
        return (DraftOrderInvoicePreviewPayload) get("draftOrderInvoicePreview");
    }

    public Mutation setDraftOrderInvoicePreview(DraftOrderInvoicePreviewPayload arg) {
        optimisticData.put(getKey("draftOrderInvoicePreview"), arg);
        return this;
    }

    /**
    * Sends an email invoice for a draft order.
    */

    public DraftOrderInvoiceSendPayload getDraftOrderInvoiceSend() {
        return (DraftOrderInvoiceSendPayload) get("draftOrderInvoiceSend");
    }

    public Mutation setDraftOrderInvoiceSend(DraftOrderInvoiceSendPayload arg) {
        optimisticData.put(getKey("draftOrderInvoiceSend"), arg);
        return this;
    }

    /**
    * Updates a draft order.
    * If a checkout has been started for a draft order, any update to the draft will unlink the checkout.
    * Checkouts
    * are created but not immediately completed when opening the merchant credit card modal in the admin,
    * and when a
    * buyer opens the invoice URL. This is usually fine, but there is an edge case where a checkout is in
    * progress
    * and the draft is updated before the checkout completes. This will not interfere with the checkout
    * and order
    * creation, but if the link from draft to checkout is broken the draft will remain open even after the
    * order is
    * created.
    */

    public DraftOrderUpdatePayload getDraftOrderUpdate() {
        return (DraftOrderUpdatePayload) get("draftOrderUpdate");
    }

    public Mutation setDraftOrderUpdate(DraftOrderUpdatePayload arg) {
        optimisticData.put(getKey("draftOrderUpdate"), arg);
        return this;
    }

    /**
    * Updates the server pixel to connect to an EventBridge endpoint.
    * Running this mutation deletes any previous subscriptions for the server pixel.
    */

    public EventBridgeServerPixelUpdatePayload getEventBridgeServerPixelUpdate() {
        return (EventBridgeServerPixelUpdatePayload) get("eventBridgeServerPixelUpdate");
    }

    public Mutation setEventBridgeServerPixelUpdate(EventBridgeServerPixelUpdatePayload arg) {
        optimisticData.put(getKey("eventBridgeServerPixelUpdate"), arg);
        return this;
    }

    /**
    * Creates a new Amazon EventBridge webhook subscription.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
    */

    public EventBridgeWebhookSubscriptionCreatePayload getEventBridgeWebhookSubscriptionCreate() {
        return (EventBridgeWebhookSubscriptionCreatePayload) get("eventBridgeWebhookSubscriptionCreate");
    }

    public Mutation setEventBridgeWebhookSubscriptionCreate(EventBridgeWebhookSubscriptionCreatePayload arg) {
        optimisticData.put(getKey("eventBridgeWebhookSubscriptionCreate"), arg);
        return this;
    }

    /**
    * Updates an Amazon EventBridge webhook subscription.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
    */

    public EventBridgeWebhookSubscriptionUpdatePayload getEventBridgeWebhookSubscriptionUpdate() {
        return (EventBridgeWebhookSubscriptionUpdatePayload) get("eventBridgeWebhookSubscriptionUpdate");
    }

    public Mutation setEventBridgeWebhookSubscriptionUpdate(EventBridgeWebhookSubscriptionUpdatePayload arg) {
        optimisticData.put(getKey("eventBridgeWebhookSubscriptionUpdate"), arg);
        return this;
    }

    /**
    * Acknowledges file update failure by resetting FAILED status to READY and clearing any media errors.
    */

    public FileAcknowledgeUpdateFailedPayload getFileAcknowledgeUpdateFailed() {
        return (FileAcknowledgeUpdateFailedPayload) get("fileAcknowledgeUpdateFailed");
    }

    public Mutation setFileAcknowledgeUpdateFailed(FileAcknowledgeUpdateFailedPayload arg) {
        optimisticData.put(getKey("fileAcknowledgeUpdateFailed"), arg);
        return this;
    }

    /**
    * Creates file assets using an external URL or for files that were previously uploaded using the
    * [stagedUploadsCreate
    * mutation](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
    * These files are added to the [Files page](https://shopify.com/admin/settings/files) in Shopify
    * admin.
    * Files are processed asynchronously. Some data is not available until processing is completed.
    * Check
    * [fileStatus](https://shopify.dev/api/admin-graphql/latest/interfaces/File#field-file-filestatus)
    * to know when the files are READY or FAILED. See the
    * [FileStatus](https://shopify.dev/api/admin-graphql/latest/enums/filestatus)
    * for the complete set of possible fileStatus values.
    * To get a list of all files, use the [files
    * query](https://shopify.dev/api/admin-graphql/latest/queries/files).
    */

    public FileCreatePayload getFileCreate() {
        return (FileCreatePayload) get("fileCreate");
    }

    public Mutation setFileCreate(FileCreatePayload arg) {
        optimisticData.put(getKey("fileCreate"), arg);
        return this;
    }

    /**
    * Deletes existing file assets that were uploaded to Shopify.
    */

    public FileDeletePayload getFileDelete() {
        return (FileDeletePayload) get("fileDelete");
    }

    public Mutation setFileDelete(FileDeletePayload arg) {
        optimisticData.put(getKey("fileDelete"), arg);
        return this;
    }

    /**
    * Updates an existing file asset that was uploaded to Shopify.
    */

    public FileUpdatePayload getFileUpdate() {
        return (FileUpdatePayload) get("fileUpdate");
    }

    public Mutation setFileUpdate(FileUpdatePayload arg) {
        optimisticData.put(getKey("fileUpdate"), arg);
        return this;
    }

    /**
    * Generates a signature for a Flow action payload.
    */

    public FlowGenerateSignaturePayload getFlowGenerateSignature() {
        return (FlowGenerateSignaturePayload) get("flowGenerateSignature");
    }

    public Mutation setFlowGenerateSignature(FlowGenerateSignaturePayload arg) {
        optimisticData.put(getKey("flowGenerateSignature"), arg);
        return this;
    }

    /**
    * Triggers any workflows that begin with the trigger specified in the request body. To learn more,
    * refer to [_Create Shopify Flow triggers_](https://shopify.dev/apps/flow/triggers).
    */

    public FlowTriggerReceivePayload getFlowTriggerReceive() {
        return (FlowTriggerReceivePayload) get("flowTriggerReceive");
    }

    public Mutation setFlowTriggerReceive(FlowTriggerReceivePayload arg) {
        optimisticData.put(getKey("flowTriggerReceive"), arg);
        return this;
    }

    /**
    * Cancels a fulfillment.
    */

    public FulfillmentCancelPayload getFulfillmentCancel() {
        return (FulfillmentCancelPayload) get("fulfillmentCancel");
    }

    public Mutation setFulfillmentCancel(FulfillmentCancelPayload arg) {
        optimisticData.put(getKey("fulfillmentCancel"), arg);
        return this;
    }

    /**
    * Creates a fulfillment constraint rule and its metafield.
    */

    public FulfillmentConstraintRuleCreatePayload getFulfillmentConstraintRuleCreate() {
        return (FulfillmentConstraintRuleCreatePayload) get("fulfillmentConstraintRuleCreate");
    }

    public Mutation setFulfillmentConstraintRuleCreate(FulfillmentConstraintRuleCreatePayload arg) {
        optimisticData.put(getKey("fulfillmentConstraintRuleCreate"), arg);
        return this;
    }

    /**
    * Deletes a fulfillment constraint rule and its metafields.
    */

    public FulfillmentConstraintRuleDeletePayload getFulfillmentConstraintRuleDelete() {
        return (FulfillmentConstraintRuleDeletePayload) get("fulfillmentConstraintRuleDelete");
    }

    public Mutation setFulfillmentConstraintRuleDelete(FulfillmentConstraintRuleDeletePayload arg) {
        optimisticData.put(getKey("fulfillmentConstraintRuleDelete"), arg);
        return this;
    }

    /**
    * Update a fulfillment constraint rule.
    */

    public FulfillmentConstraintRuleUpdatePayload getFulfillmentConstraintRuleUpdate() {
        return (FulfillmentConstraintRuleUpdatePayload) get("fulfillmentConstraintRuleUpdate");
    }

    public Mutation setFulfillmentConstraintRuleUpdate(FulfillmentConstraintRuleUpdatePayload arg) {
        optimisticData.put(getKey("fulfillmentConstraintRuleUpdate"), arg);
        return this;
    }

    /**
    * Creates a fulfillment for one or many fulfillment orders.
    * The fulfillment orders are associated with the same order and are assigned to the same location.
    */

    public FulfillmentCreatePayload getFulfillmentCreate() {
        return (FulfillmentCreatePayload) get("fulfillmentCreate");
    }

    public Mutation setFulfillmentCreate(FulfillmentCreatePayload arg) {
        optimisticData.put(getKey("fulfillmentCreate"), arg);
        return this;
    }

    /**
    * Creates a fulfillment event for a specified fulfillment.
    */

    public FulfillmentEventCreatePayload getFulfillmentEventCreate() {
        return (FulfillmentEventCreatePayload) get("fulfillmentEventCreate");
    }

    public Mutation setFulfillmentEventCreate(FulfillmentEventCreatePayload arg) {
        optimisticData.put(getKey("fulfillmentEventCreate"), arg);
        return this;
    }

    /**
    * Accept a cancellation request sent to a fulfillment service for a fulfillment order.
    */

    public FulfillmentOrderAcceptCancellationRequestPayload getFulfillmentOrderAcceptCancellationRequest() {
        return (FulfillmentOrderAcceptCancellationRequestPayload) get("fulfillmentOrderAcceptCancellationRequest");
    }

    public Mutation setFulfillmentOrderAcceptCancellationRequest(FulfillmentOrderAcceptCancellationRequestPayload arg) {
        optimisticData.put(getKey("fulfillmentOrderAcceptCancellationRequest"), arg);
        return this;
    }

    /**
    * Accepts a fulfillment request sent to a fulfillment service for a fulfillment order.
    */

    public FulfillmentOrderAcceptFulfillmentRequestPayload getFulfillmentOrderAcceptFulfillmentRequest() {
        return (FulfillmentOrderAcceptFulfillmentRequestPayload) get("fulfillmentOrderAcceptFulfillmentRequest");
    }

    public Mutation setFulfillmentOrderAcceptFulfillmentRequest(FulfillmentOrderAcceptFulfillmentRequestPayload arg) {
        optimisticData.put(getKey("fulfillmentOrderAcceptFulfillmentRequest"), arg);
        return this;
    }

    /**
    * Marks a fulfillment order as canceled.
    */

    public FulfillmentOrderCancelPayload getFulfillmentOrderCancel() {
        return (FulfillmentOrderCancelPayload) get("fulfillmentOrderCancel");
    }

    public Mutation setFulfillmentOrderCancel(FulfillmentOrderCancelPayload arg) {
        optimisticData.put(getKey("fulfillmentOrderCancel"), arg);
        return this;
    }

    /**
    * Marks an in-progress fulfillment order as incomplete,
    * indicating the fulfillment service is unable to ship any remaining items,
    * and closes the fulfillment request.
    * This mutation can only be called for fulfillment orders that meet the following criteria:
    * - Assigned to a fulfillment service location,
    * - The fulfillment request has been accepted,
    * - The fulfillment order status is `IN_PROGRESS`.
    * This mutation can only be called by the fulfillment service app that accepted the fulfillment
    * request.
    * Calling this mutation returns the control of the fulfillment order to the merchant, allowing them to
    * move the fulfillment order line items to another location and fulfill from there,
    * remove and refund the line items, or to request fulfillment from the same fulfillment service again.
    * Closing a fulfillment order is explained in
    * [the fulfillment service
    * guide](https://shopify.dev/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfillm
    * ent-services#step-7-optional-close-a-fulfillment-order).
    */

    public FulfillmentOrderClosePayload getFulfillmentOrderClose() {
        return (FulfillmentOrderClosePayload) get("fulfillmentOrderClose");
    }

    public Mutation setFulfillmentOrderClose(FulfillmentOrderClosePayload arg) {
        optimisticData.put(getKey("fulfillmentOrderClose"), arg);
        return this;
    }

    /**
    * Applies a fulfillment hold on a fulfillment order.
    * As of the
    * [2025-01 API
    * version](https://shopify.dev/changelog/apply-multiple-holds-to-a-single-fulfillment-order),
    * the mutation can be successfully executed on fulfillment orders that are already on hold.
    * To place multiple holds on a fulfillment order, apps need to supply the
    * [handle](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentHold#field-handle)
    * field. Each app can place up to
    * 10 active holds
    * per fulfillment order. If an app attempts to place more than this, the mutation will return
    * [a user error indicating that the limit has been
    * reached](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderHoldUserErrorCode#value-
    * fulfillmentorderholdlimitreached).
    * The app would need to release one of its existing holds before being able to apply a new one.
    */

    public FulfillmentOrderHoldPayload getFulfillmentOrderHold() {
        return (FulfillmentOrderHoldPayload) get("fulfillmentOrderHold");
    }

    public Mutation setFulfillmentOrderHold(FulfillmentOrderHoldPayload arg) {
        optimisticData.put(getKey("fulfillmentOrderHold"), arg);
        return this;
    }

    /**
    * Mark line items associated with a fulfillment order as being ready for pickup by a customer.
    * Sends a Ready For Pickup notification to the customer to let them know that their order is ready
    * to be picked up.
    */

    public FulfillmentOrderLineItemsPreparedForPickupPayload getFulfillmentOrderLineItemsPreparedForPickup() {
        return (FulfillmentOrderLineItemsPreparedForPickupPayload) get("fulfillmentOrderLineItemsPreparedForPickup");
    }

    public Mutation setFulfillmentOrderLineItemsPreparedForPickup(FulfillmentOrderLineItemsPreparedForPickupPayload arg) {
        optimisticData.put(getKey("fulfillmentOrderLineItemsPreparedForPickup"), arg);
        return this;
    }

    /**
    * Merges a set or multiple sets of fulfillment orders together into one based on
    * line item inputs and quantities.
    */

    public FulfillmentOrderMergePayload getFulfillmentOrderMerge() {
        return (FulfillmentOrderMergePayload) get("fulfillmentOrderMerge");
    }

    public Mutation setFulfillmentOrderMerge(FulfillmentOrderMergePayload arg) {
        optimisticData.put(getKey("fulfillmentOrderMerge"), arg);
        return this;
    }

    /**
    * Changes the location which is assigned to fulfill a number of unfulfilled fulfillment order line
    * items.
    * Moving a fulfillment order will fail in the following circumstances:
    * * The fulfillment order is closed.
    * * The destination location has never stocked the requested inventory item.
    * * The API client doesn't have the correct permissions.
    * Line items which have already been fulfilled can't be re-assigned
    * and will always remain assigned to the original location.
    * You can't change the assigned location while a fulfillment order has a
    * [request
    * status](https://shopify.dev/docs/api/admin-graphql/latest/enums/FulfillmentOrderRequestStatus)
    * of `SUBMITTED`, `ACCEPTED`, `CANCELLATION_REQUESTED`, or `CANCELLATION_REJECTED`.
    * These request statuses mean that a fulfillment order is awaiting action by a fulfillment service
    * and can't be re-assigned without first having the fulfillment service accept a cancellation request.
    * This behavior is intended to prevent items from being fulfilled by multiple locations or fulfillment
    * services.
    * ### How re-assigning line items affects fulfillment orders
    * **First scenario:** Re-assign all line items belonging to a fulfillment order to a new location.
    * In this case, the
    * [assignedLocation](https://shopify.dev/docs/api/admin-graphql/latest/objects/fulfillmentorder#field-
    * fulfillmentorder-assignedlocation)
    * of the original fulfillment order will be updated to the new location.
    * **Second scenario:** Re-assign a subset of the line items belonging to a fulfillment order to a new
    * location.
    * You can specify a subset of line items using the `fulfillmentOrderLineItems` parameter
    * (available as of the `2023-04` API version),
    * or specify that the original fulfillment order contains line items which have already been
    * fulfilled.
    * If the new location is already assigned to another active fulfillment order, on the same order, then
    * a new fulfillment order is created. The existing fulfillment order is closed and line items are
    * recreated
    * in a new fulfillment order.
    */

    public FulfillmentOrderMovePayload getFulfillmentOrderMove() {
        return (FulfillmentOrderMovePayload) get("fulfillmentOrderMove");
    }

    public Mutation setFulfillmentOrderMove(FulfillmentOrderMovePayload arg) {
        optimisticData.put(getKey("fulfillmentOrderMove"), arg);
        return this;
    }

    /**
    * Marks a scheduled fulfillment order as open.
    */

    public FulfillmentOrderOpenPayload getFulfillmentOrderOpen() {
        return (FulfillmentOrderOpenPayload) get("fulfillmentOrderOpen");
    }

    public Mutation setFulfillmentOrderOpen(FulfillmentOrderOpenPayload arg) {
        optimisticData.put(getKey("fulfillmentOrderOpen"), arg);
        return this;
    }

    /**
    * Rejects a cancellation request sent to a fulfillment service for a fulfillment order.
    */

    public FulfillmentOrderRejectCancellationRequestPayload getFulfillmentOrderRejectCancellationRequest() {
        return (FulfillmentOrderRejectCancellationRequestPayload) get("fulfillmentOrderRejectCancellationRequest");
    }

    public Mutation setFulfillmentOrderRejectCancellationRequest(FulfillmentOrderRejectCancellationRequestPayload arg) {
        optimisticData.put(getKey("fulfillmentOrderRejectCancellationRequest"), arg);
        return this;
    }

    /**
    * Rejects a fulfillment request sent to a fulfillment service for a fulfillment order.
    */

    public FulfillmentOrderRejectFulfillmentRequestPayload getFulfillmentOrderRejectFulfillmentRequest() {
        return (FulfillmentOrderRejectFulfillmentRequestPayload) get("fulfillmentOrderRejectFulfillmentRequest");
    }

    public Mutation setFulfillmentOrderRejectFulfillmentRequest(FulfillmentOrderRejectFulfillmentRequestPayload arg) {
        optimisticData.put(getKey("fulfillmentOrderRejectFulfillmentRequest"), arg);
        return this;
    }

    /**
    * Releases the fulfillment hold on a fulfillment order.
    */

    public FulfillmentOrderReleaseHoldPayload getFulfillmentOrderReleaseHold() {
        return (FulfillmentOrderReleaseHoldPayload) get("fulfillmentOrderReleaseHold");
    }

    public Mutation setFulfillmentOrderReleaseHold(FulfillmentOrderReleaseHoldPayload arg) {
        optimisticData.put(getKey("fulfillmentOrderReleaseHold"), arg);
        return this;
    }

    /**
    * Reschedules a scheduled fulfillment order.
    * Updates the value of the `fulfillAt` field on a scheduled fulfillment order.
    * The fulfillment order will be marked as ready for fulfillment at this date and time.
    */

    public FulfillmentOrderReschedulePayload getFulfillmentOrderReschedule() {
        return (FulfillmentOrderReschedulePayload) get("fulfillmentOrderReschedule");
    }

    public Mutation setFulfillmentOrderReschedule(FulfillmentOrderReschedulePayload arg) {
        optimisticData.put(getKey("fulfillmentOrderReschedule"), arg);
        return this;
    }

    /**
    * Splits a fulfillment order or orders based on line item inputs and quantities.
    */

    public FulfillmentOrderSplitPayload getFulfillmentOrderSplit() {
        return (FulfillmentOrderSplitPayload) get("fulfillmentOrderSplit");
    }

    public Mutation setFulfillmentOrderSplit(FulfillmentOrderSplitPayload arg) {
        optimisticData.put(getKey("fulfillmentOrderSplit"), arg);
        return this;
    }

    /**
    * Sends a cancellation request to the fulfillment service of a fulfillment order.
    */

    public FulfillmentOrderSubmitCancellationRequestPayload getFulfillmentOrderSubmitCancellationRequest() {
        return (FulfillmentOrderSubmitCancellationRequestPayload) get("fulfillmentOrderSubmitCancellationRequest");
    }

    public Mutation setFulfillmentOrderSubmitCancellationRequest(FulfillmentOrderSubmitCancellationRequestPayload arg) {
        optimisticData.put(getKey("fulfillmentOrderSubmitCancellationRequest"), arg);
        return this;
    }

    /**
    * Sends a fulfillment request to the fulfillment service of a fulfillment order.
    */

    public FulfillmentOrderSubmitFulfillmentRequestPayload getFulfillmentOrderSubmitFulfillmentRequest() {
        return (FulfillmentOrderSubmitFulfillmentRequestPayload) get("fulfillmentOrderSubmitFulfillmentRequest");
    }

    public Mutation setFulfillmentOrderSubmitFulfillmentRequest(FulfillmentOrderSubmitFulfillmentRequestPayload arg) {
        optimisticData.put(getKey("fulfillmentOrderSubmitFulfillmentRequest"), arg);
        return this;
    }

    /**
    * Sets the latest date and time by which the fulfillment orders need to be fulfilled.
    */

    public FulfillmentOrdersSetFulfillmentDeadlinePayload getFulfillmentOrdersSetFulfillmentDeadline() {
        return (FulfillmentOrdersSetFulfillmentDeadlinePayload) get("fulfillmentOrdersSetFulfillmentDeadline");
    }

    public Mutation setFulfillmentOrdersSetFulfillmentDeadline(FulfillmentOrdersSetFulfillmentDeadlinePayload arg) {
        optimisticData.put(getKey("fulfillmentOrdersSetFulfillmentDeadline"), arg);
        return this;
    }

    /**
    * Creates a fulfillment service.
    * ## Fulfillment service location
    * When creating a fulfillment service, a new location will be automatically created on the shop
    * and will be associated with this fulfillment service.
    * This location will be named after the fulfillment service and inherit the shop's address.
    * If you are using API version `2023-10` or later, and you need to specify custom attributes for the
    * fulfillment service location
    * (for example, to change its address to a country different from the shop's country),
    * use the
    * [LocationEdit](https://shopify.dev/api/admin-graphql/latest/mutations/locationEdit)
    * mutation after creating the fulfillment service.
    */

    public FulfillmentServiceCreatePayload getFulfillmentServiceCreate() {
        return (FulfillmentServiceCreatePayload) get("fulfillmentServiceCreate");
    }

    public Mutation setFulfillmentServiceCreate(FulfillmentServiceCreatePayload arg) {
        optimisticData.put(getKey("fulfillmentServiceCreate"), arg);
        return this;
    }

    /**
    * Deletes a fulfillment service.
    */

    public FulfillmentServiceDeletePayload getFulfillmentServiceDelete() {
        return (FulfillmentServiceDeletePayload) get("fulfillmentServiceDelete");
    }

    public Mutation setFulfillmentServiceDelete(FulfillmentServiceDeletePayload arg) {
        optimisticData.put(getKey("fulfillmentServiceDelete"), arg);
        return this;
    }

    /**
    * Updates a fulfillment service.
    * If you are using API version `2023-10` or later,
    * and you need to update the location managed by the fulfillment service
    * (for example, to change the address of a fulfillment service),
    * use the
    * [LocationEdit](https://shopify.dev/api/admin-graphql/latest/mutations/locationEdit)
    * mutation.
    */

    public FulfillmentServiceUpdatePayload getFulfillmentServiceUpdate() {
        return (FulfillmentServiceUpdatePayload) get("fulfillmentServiceUpdate");
    }

    public Mutation setFulfillmentServiceUpdate(FulfillmentServiceUpdatePayload arg) {
        optimisticData.put(getKey("fulfillmentServiceUpdate"), arg);
        return this;
    }

    /**
    * Updates tracking information for a fulfillment.
    */

    public FulfillmentTrackingInfoUpdatePayload getFulfillmentTrackingInfoUpdate() {
        return (FulfillmentTrackingInfoUpdatePayload) get("fulfillmentTrackingInfoUpdate");
    }

    public Mutation setFulfillmentTrackingInfoUpdate(FulfillmentTrackingInfoUpdatePayload arg) {
        optimisticData.put(getKey("fulfillmentTrackingInfoUpdate"), arg);
        return this;
    }

    /**
    * Create a gift card.
    */

    public GiftCardCreatePayload getGiftCardCreate() {
        return (GiftCardCreatePayload) get("giftCardCreate");
    }

    public Mutation setGiftCardCreate(GiftCardCreatePayload arg) {
        optimisticData.put(getKey("giftCardCreate"), arg);
        return this;
    }

    /**
    * Credit a gift card.
    */

    public GiftCardCreditPayload getGiftCardCredit() {
        return (GiftCardCreditPayload) get("giftCardCredit");
    }

    public Mutation setGiftCardCredit(GiftCardCreditPayload arg) {
        optimisticData.put(getKey("giftCardCredit"), arg);
        return this;
    }

    /**
    * Deactivate a gift card. A deactivated gift card cannot be used by a customer.
    * A deactivated gift card cannot be re-enabled.
    */

    public GiftCardDeactivatePayload getGiftCardDeactivate() {
        return (GiftCardDeactivatePayload) get("giftCardDeactivate");
    }

    public Mutation setGiftCardDeactivate(GiftCardDeactivatePayload arg) {
        optimisticData.put(getKey("giftCardDeactivate"), arg);
        return this;
    }

    /**
    * Debit a gift card.
    */

    public GiftCardDebitPayload getGiftCardDebit() {
        return (GiftCardDebitPayload) get("giftCardDebit");
    }

    public Mutation setGiftCardDebit(GiftCardDebitPayload arg) {
        optimisticData.put(getKey("giftCardDebit"), arg);
        return this;
    }

    /**
    * Send notification to the customer of a gift card.
    */

    public GiftCardSendNotificationToCustomerPayload getGiftCardSendNotificationToCustomer() {
        return (GiftCardSendNotificationToCustomerPayload) get("giftCardSendNotificationToCustomer");
    }

    public Mutation setGiftCardSendNotificationToCustomer(GiftCardSendNotificationToCustomerPayload arg) {
        optimisticData.put(getKey("giftCardSendNotificationToCustomer"), arg);
        return this;
    }

    /**
    * Send notification to the recipient of a gift card.
    */

    public GiftCardSendNotificationToRecipientPayload getGiftCardSendNotificationToRecipient() {
        return (GiftCardSendNotificationToRecipientPayload) get("giftCardSendNotificationToRecipient");
    }

    public Mutation setGiftCardSendNotificationToRecipient(GiftCardSendNotificationToRecipientPayload arg) {
        optimisticData.put(getKey("giftCardSendNotificationToRecipient"), arg);
        return this;
    }

    /**
    * Update a gift card.
    */

    public GiftCardUpdatePayload getGiftCardUpdate() {
        return (GiftCardUpdatePayload) get("giftCardUpdate");
    }

    public Mutation setGiftCardUpdate(GiftCardUpdatePayload arg) {
        optimisticData.put(getKey("giftCardUpdate"), arg);
        return this;
    }

    /**
    * Activate an inventory item at a location.
    */

    public InventoryActivatePayload getInventoryActivate() {
        return (InventoryActivatePayload) get("inventoryActivate");
    }

    public Mutation setInventoryActivate(InventoryActivatePayload arg) {
        optimisticData.put(getKey("inventoryActivate"), arg);
        return this;
    }

    /**
    * Apply changes to inventory quantities.
    */

    public InventoryAdjustQuantitiesPayload getInventoryAdjustQuantities() {
        return (InventoryAdjustQuantitiesPayload) get("inventoryAdjustQuantities");
    }

    public Mutation setInventoryAdjustQuantities(InventoryAdjustQuantitiesPayload arg) {
        optimisticData.put(getKey("inventoryAdjustQuantities"), arg);
        return this;
    }

    /**
    * Modify the activation status of an inventory item at locations. Activating an inventory item at a
    * particular location allows that location to stock that inventory item. Deactivating an inventory
    * item at a location removes the inventory item's quantities and turns off the inventory item from
    * that location.
    */

    public InventoryBulkToggleActivationPayload getInventoryBulkToggleActivation() {
        return (InventoryBulkToggleActivationPayload) get("inventoryBulkToggleActivation");
    }

    public Mutation setInventoryBulkToggleActivation(InventoryBulkToggleActivationPayload arg) {
        optimisticData.put(getKey("inventoryBulkToggleActivation"), arg);
        return this;
    }

    /**
    * Removes an inventory item's quantities from a location, and turns off inventory at the location.
    */

    public InventoryDeactivatePayload getInventoryDeactivate() {
        return (InventoryDeactivatePayload) get("inventoryDeactivate");
    }

    public Mutation setInventoryDeactivate(InventoryDeactivatePayload arg) {
        optimisticData.put(getKey("inventoryDeactivate"), arg);
        return this;
    }

    /**
    * Updates an inventory item.
    */

    public InventoryItemUpdatePayload getInventoryItemUpdate() {
        return (InventoryItemUpdatePayload) get("inventoryItemUpdate");
    }

    public Mutation setInventoryItemUpdate(InventoryItemUpdatePayload arg) {
        optimisticData.put(getKey("inventoryItemUpdate"), arg);
        return this;
    }

    /**
    * Moves inventory between inventory quantity names at a single location.
    */

    public InventoryMoveQuantitiesPayload getInventoryMoveQuantities() {
        return (InventoryMoveQuantitiesPayload) get("inventoryMoveQuantities");
    }

    public Mutation setInventoryMoveQuantities(InventoryMoveQuantitiesPayload arg) {
        optimisticData.put(getKey("inventoryMoveQuantities"), arg);
        return this;
    }

    /**
    * Set quantities of specified name using absolute values. This mutation supports compare-and-set
    * functionality to handle
    * concurrent requests properly. If `ignoreCompareQuantity` is not set to true,
    * the mutation will only update the quantity if the persisted quantity matches the `compareQuantity`
    * value.
    * If the `compareQuantity` value does not match the persisted value, the mutation will return an
    * error. In order to opt out
    * of the `compareQuantity` check, the `ignoreCompareQuantity` argument can be set to true.
    * > Note:
    * > Only use this mutation if calling on behalf of a system that acts as the source of truth for
    * inventory quantities,
    * > otherwise please consider using the
    * [inventoryAdjustQuantities](https://shopify.dev/api/admin-graphql/latest/mutations/inventoryAdjustQu
    * antities) mutation.
    * >
    * >
    * > Opting out of the `compareQuantity` check can lead to inaccurate inventory quantities if multiple
    * requests are made concurrently.
    * > It is recommended to always include the `compareQuantity` value to ensure the accuracy of the
    * inventory quantities and to opt out
    * > of the check using `ignoreCompareQuantity` only when necessary.
    */

    public InventorySetQuantitiesPayload getInventorySetQuantities() {
        return (InventorySetQuantitiesPayload) get("inventorySetQuantities");
    }

    public Mutation setInventorySetQuantities(InventorySetQuantitiesPayload arg) {
        optimisticData.put(getKey("inventorySetQuantities"), arg);
        return this;
    }

    /**
    * Set up scheduled changes of inventory items.
    */

    public InventorySetScheduledChangesPayload getInventorySetScheduledChanges() {
        return (InventorySetScheduledChangesPayload) get("inventorySetScheduledChanges");
    }

    public Mutation setInventorySetScheduledChanges(InventorySetScheduledChangesPayload arg) {
        optimisticData.put(getKey("inventorySetScheduledChanges"), arg);
        return this;
    }

    /**
    * Activates a location so that you can stock inventory at the location. Refer to the
    * [`isActive`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location#field-isactive) and
    * [`activatable`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location#field-activatable
    * )
    * fields on the `Location` object.
    */

    public LocationActivatePayload getLocationActivate() {
        return (LocationActivatePayload) get("locationActivate");
    }

    public Mutation setLocationActivate(LocationActivatePayload arg) {
        optimisticData.put(getKey("locationActivate"), arg);
        return this;
    }

    /**
    * Adds a new location.
    */

    public LocationAddPayload getLocationAdd() {
        return (LocationAddPayload) get("locationAdd");
    }

    public Mutation setLocationAdd(LocationAddPayload arg) {
        optimisticData.put(getKey("locationAdd"), arg);
        return this;
    }

    /**
    * Deactivates a location and moves inventory, pending orders, and moving transfers to a destination
    * location.
    */

    public LocationDeactivatePayload getLocationDeactivate() {
        return (LocationDeactivatePayload) get("locationDeactivate");
    }

    public Mutation setLocationDeactivate(LocationDeactivatePayload arg) {
        optimisticData.put(getKey("locationDeactivate"), arg);
        return this;
    }

    /**
    * Deletes a location.
    */

    public LocationDeletePayload getLocationDelete() {
        return (LocationDeletePayload) get("locationDelete");
    }

    public Mutation setLocationDelete(LocationDeletePayload arg) {
        optimisticData.put(getKey("locationDelete"), arg);
        return this;
    }

    /**
    * Edits an existing location.
    * [As of the 2023-10 API
    * version](https://shopify.dev/changelog/apps-can-now-change-the-name-and-address-of-their-fulfillment
    * -service-locations), apps can change the name and address of their fulfillment service locations.
    */

    public LocationEditPayload getLocationEdit() {
        return (LocationEditPayload) get("locationEdit");
    }

    public Mutation setLocationEdit(LocationEditPayload arg) {
        optimisticData.put(getKey("locationEdit"), arg);
        return this;
    }

    /**
    * Disables local pickup for a location.
    */

    public LocationLocalPickupDisablePayload getLocationLocalPickupDisable() {
        return (LocationLocalPickupDisablePayload) get("locationLocalPickupDisable");
    }

    public Mutation setLocationLocalPickupDisable(LocationLocalPickupDisablePayload arg) {
        optimisticData.put(getKey("locationLocalPickupDisable"), arg);
        return this;
    }

    /**
    * Enables local pickup for a location.
    */

    public LocationLocalPickupEnablePayload getLocationLocalPickupEnable() {
        return (LocationLocalPickupEnablePayload) get("locationLocalPickupEnable");
    }

    public Mutation setLocationLocalPickupEnable(LocationLocalPickupEnablePayload arg) {
        optimisticData.put(getKey("locationLocalPickupEnable"), arg);
        return this;
    }

    /**
    * Creates a new market.
    */

    public MarketCreatePayload getMarketCreate() {
        return (MarketCreatePayload) get("marketCreate");
    }

    public Mutation setMarketCreate(MarketCreatePayload arg) {
        optimisticData.put(getKey("marketCreate"), arg);
        return this;
    }

    /**
    * Updates currency settings of a market.
    */

    public MarketCurrencySettingsUpdatePayload getMarketCurrencySettingsUpdate() {
        return (MarketCurrencySettingsUpdatePayload) get("marketCurrencySettingsUpdate");
    }

    public Mutation setMarketCurrencySettingsUpdate(MarketCurrencySettingsUpdatePayload arg) {
        optimisticData.put(getKey("marketCurrencySettingsUpdate"), arg);
        return this;
    }

    /**
    * Deletes a market definition.
    */

    public MarketDeletePayload getMarketDelete() {
        return (MarketDeletePayload) get("marketDelete");
    }

    public Mutation setMarketDelete(MarketDeletePayload arg) {
        optimisticData.put(getKey("marketDelete"), arg);
        return this;
    }

    /**
    * Creates or updates market localizations.
    */

    public MarketLocalizationsRegisterPayload getMarketLocalizationsRegister() {
        return (MarketLocalizationsRegisterPayload) get("marketLocalizationsRegister");
    }

    public Mutation setMarketLocalizationsRegister(MarketLocalizationsRegisterPayload arg) {
        optimisticData.put(getKey("marketLocalizationsRegister"), arg);
        return this;
    }

    /**
    * Deletes market localizations.
    */

    public MarketLocalizationsRemovePayload getMarketLocalizationsRemove() {
        return (MarketLocalizationsRemovePayload) get("marketLocalizationsRemove");
    }

    public Mutation setMarketLocalizationsRemove(MarketLocalizationsRemovePayload arg) {
        optimisticData.put(getKey("marketLocalizationsRemove"), arg);
        return this;
    }

    /**
    * Updates the properties of a market.
    */

    public MarketUpdatePayload getMarketUpdate() {
        return (MarketUpdatePayload) get("marketUpdate");
    }

    public Mutation setMarketUpdate(MarketUpdatePayload arg) {
        optimisticData.put(getKey("marketUpdate"), arg);
        return this;
    }

    /**
    * Deletes all external marketing activities. Deletion is performed by a background job, as it may take
    * a bit of time to complete if a large number of activities are to be deleted. Attempting to create or
    * modify external activities before the job has completed will result in the create/update/upsert
    * mutation returning an error.
    */

    public MarketingActivitiesDeleteAllExternalPayload getMarketingActivitiesDeleteAllExternal() {
        return (MarketingActivitiesDeleteAllExternalPayload) get("marketingActivitiesDeleteAllExternal");
    }

    public Mutation setMarketingActivitiesDeleteAllExternal(MarketingActivitiesDeleteAllExternalPayload arg) {
        optimisticData.put(getKey("marketingActivitiesDeleteAllExternal"), arg);
        return this;
    }

    /**
    * Create new marketing activity.
    */

    public MarketingActivityCreatePayload getMarketingActivityCreate() {
        return (MarketingActivityCreatePayload) get("marketingActivityCreate");
    }

    public Mutation setMarketingActivityCreate(MarketingActivityCreatePayload arg) {
        optimisticData.put(getKey("marketingActivityCreate"), arg);
        return this;
    }

    /**
    * Creates a new external marketing activity.
    */

    public MarketingActivityCreateExternalPayload getMarketingActivityCreateExternal() {
        return (MarketingActivityCreateExternalPayload) get("marketingActivityCreateExternal");
    }

    public Mutation setMarketingActivityCreateExternal(MarketingActivityCreateExternalPayload arg) {
        optimisticData.put(getKey("marketingActivityCreateExternal"), arg);
        return this;
    }

    /**
    * Deletes an external marketing activity.
    */

    public MarketingActivityDeleteExternalPayload getMarketingActivityDeleteExternal() {
        return (MarketingActivityDeleteExternalPayload) get("marketingActivityDeleteExternal");
    }

    public Mutation setMarketingActivityDeleteExternal(MarketingActivityDeleteExternalPayload arg) {
        optimisticData.put(getKey("marketingActivityDeleteExternal"), arg);
        return this;
    }

    /**
    * Updates a marketing activity with the latest information.
    */

    public MarketingActivityUpdatePayload getMarketingActivityUpdate() {
        return (MarketingActivityUpdatePayload) get("marketingActivityUpdate");
    }

    public Mutation setMarketingActivityUpdate(MarketingActivityUpdatePayload arg) {
        optimisticData.put(getKey("marketingActivityUpdate"), arg);
        return this;
    }

    /**
    * Update an external marketing activity.
    */

    public MarketingActivityUpdateExternalPayload getMarketingActivityUpdateExternal() {
        return (MarketingActivityUpdateExternalPayload) get("marketingActivityUpdateExternal");
    }

    public Mutation setMarketingActivityUpdateExternal(MarketingActivityUpdateExternalPayload arg) {
        optimisticData.put(getKey("marketingActivityUpdateExternal"), arg);
        return this;
    }

    /**
    * Creates a new external marketing activity or updates an existing one. When optional fields are
    * absent or null, associated information will be removed from an existing marketing activity.
    */

    public MarketingActivityUpsertExternalPayload getMarketingActivityUpsertExternal() {
        return (MarketingActivityUpsertExternalPayload) get("marketingActivityUpsertExternal");
    }

    public Mutation setMarketingActivityUpsertExternal(MarketingActivityUpsertExternalPayload arg) {
        optimisticData.put(getKey("marketingActivityUpsertExternal"), arg);
        return this;
    }

    /**
    * Creates a new marketing engagement for a marketing activity or a marketing channel.
    */

    public MarketingEngagementCreatePayload getMarketingEngagementCreate() {
        return (MarketingEngagementCreatePayload) get("marketingEngagementCreate");
    }

    public Mutation setMarketingEngagementCreate(MarketingEngagementCreatePayload arg) {
        optimisticData.put(getKey("marketingEngagementCreate"), arg);
        return this;
    }

    /**
    * Marks channel-level engagement data such that it no longer appears in reports.
    * Activity-level data cannot be deleted directly, instead the MarketingActivity itself should be
    * deleted to
    * hide it from reports.
    */

    public MarketingEngagementsDeletePayload getMarketingEngagementsDelete() {
        return (MarketingEngagementsDeletePayload) get("marketingEngagementsDelete");
    }

    public Mutation setMarketingEngagementsDelete(MarketingEngagementsDeletePayload arg) {
        optimisticData.put(getKey("marketingEngagementsDelete"), arg);
        return this;
    }

    /**
    * Creates a menu.
    */

    public MenuCreatePayload getMenuCreate() {
        return (MenuCreatePayload) get("menuCreate");
    }

    public Mutation setMenuCreate(MenuCreatePayload arg) {
        optimisticData.put(getKey("menuCreate"), arg);
        return this;
    }

    /**
    * Deletes a menu.
    */

    public MenuDeletePayload getMenuDelete() {
        return (MenuDeletePayload) get("menuDelete");
    }

    public Mutation setMenuDelete(MenuDeletePayload arg) {
        optimisticData.put(getKey("menuDelete"), arg);
        return this;
    }

    /**
    * Updates a menu.
    */

    public MenuUpdatePayload getMenuUpdate() {
        return (MenuUpdatePayload) get("menuUpdate");
    }

    public Mutation setMenuUpdate(MenuUpdatePayload arg) {
        optimisticData.put(getKey("menuUpdate"), arg);
        return this;
    }

    /**
    * Creates a metafield definition. Any metafields existing under the same owner type, namespace, and
    * key will be
    * checked against this definition and will have their type updated accordingly. For metafields that
    * are not
    * valid, they will remain unchanged but any attempts to update them must align with this definition.
    */

    public MetafieldDefinitionCreatePayload getMetafieldDefinitionCreate() {
        return (MetafieldDefinitionCreatePayload) get("metafieldDefinitionCreate");
    }

    public Mutation setMetafieldDefinitionCreate(MetafieldDefinitionCreatePayload arg) {
        optimisticData.put(getKey("metafieldDefinitionCreate"), arg);
        return this;
    }

    /**
    * Delete a metafield definition.
    * Optionally deletes all associated metafields asynchronously when specified.
    */

    public MetafieldDefinitionDeletePayload getMetafieldDefinitionDelete() {
        return (MetafieldDefinitionDeletePayload) get("metafieldDefinitionDelete");
    }

    public Mutation setMetafieldDefinitionDelete(MetafieldDefinitionDeletePayload arg) {
        optimisticData.put(getKey("metafieldDefinitionDelete"), arg);
        return this;
    }

    /**
    * You can organize your metafields in your Shopify admin by pinning/unpinning metafield definitions.
    * The order of your pinned metafield definitions determines the order in which your metafields are
    * displayed
    * on the corresponding pages in your Shopify admin. By default, only pinned metafields are
    * automatically displayed.
    */

    public MetafieldDefinitionPinPayload getMetafieldDefinitionPin() {
        return (MetafieldDefinitionPinPayload) get("metafieldDefinitionPin");
    }

    public Mutation setMetafieldDefinitionPin(MetafieldDefinitionPinPayload arg) {
        optimisticData.put(getKey("metafieldDefinitionPin"), arg);
        return this;
    }

    /**
    * You can organize your metafields in your Shopify admin by pinning/unpinning metafield definitions.
    * The order of your pinned metafield definitions determines the order in which your metafields are
    * displayed
    * on the corresponding pages in your Shopify admin. By default, only pinned metafields are
    * automatically displayed.
    */

    public MetafieldDefinitionUnpinPayload getMetafieldDefinitionUnpin() {
        return (MetafieldDefinitionUnpinPayload) get("metafieldDefinitionUnpin");
    }

    public Mutation setMetafieldDefinitionUnpin(MetafieldDefinitionUnpinPayload arg) {
        optimisticData.put(getKey("metafieldDefinitionUnpin"), arg);
        return this;
    }

    /**
    * Updates a metafield definition.
    */

    public MetafieldDefinitionUpdatePayload getMetafieldDefinitionUpdate() {
        return (MetafieldDefinitionUpdatePayload) get("metafieldDefinitionUpdate");
    }

    public Mutation setMetafieldDefinitionUpdate(MetafieldDefinitionUpdatePayload arg) {
        optimisticData.put(getKey("metafieldDefinitionUpdate"), arg);
        return this;
    }

    /**
    * Deletes multiple metafields in bulk.
    */

    public MetafieldsDeletePayload getMetafieldsDelete() {
        return (MetafieldsDeletePayload) get("metafieldsDelete");
    }

    public Mutation setMetafieldsDelete(MetafieldsDeletePayload arg) {
        optimisticData.put(getKey("metafieldsDelete"), arg);
        return this;
    }

    /**
    * Sets metafield values. Metafield values will be set regardless if they were previously created or
    * not.
    * Allows a maximum of 25 metafields to be set at a time.
    * This operation is atomic, meaning no changes are persisted if an error is encountered.
    * As of `2024-07`, this operation supports compare-and-set functionality to better handle concurrent
    * requests.
    * If `compareDigest` is set for any metafield, the mutation will only set that metafield if the
    * persisted metafield value matches the digest used on `compareDigest`.
    * If the metafield doesn't exist yet, but you want to guarantee that the operation will run in a safe
    * manner, set `compareDigest` to `null`.
    * The `compareDigest` value can be acquired by querying the metafield object and selecting
    * `compareDigest` as a field.
    * If the `compareDigest` value does not match the digest for the persisted value, the mutation will
    * return an error.
    * You can opt out of write guarantees by not sending `compareDigest` in the request.
    */

    public MetafieldsSetPayload getMetafieldsSet() {
        return (MetafieldsSetPayload) get("metafieldsSet");
    }

    public Mutation setMetafieldsSet(MetafieldsSetPayload arg) {
        optimisticData.put(getKey("metafieldsSet"), arg);
        return this;
    }

    /**
    * Asynchronously delete metaobjects and their associated metafields in bulk.
    */

    public MetaobjectBulkDeletePayload getMetaobjectBulkDelete() {
        return (MetaobjectBulkDeletePayload) get("metaobjectBulkDelete");
    }

    public Mutation setMetaobjectBulkDelete(MetaobjectBulkDeletePayload arg) {
        optimisticData.put(getKey("metaobjectBulkDelete"), arg);
        return this;
    }

    /**
    * Creates a new metaobject.
    */

    public MetaobjectCreatePayload getMetaobjectCreate() {
        return (MetaobjectCreatePayload) get("metaobjectCreate");
    }

    public Mutation setMetaobjectCreate(MetaobjectCreatePayload arg) {
        optimisticData.put(getKey("metaobjectCreate"), arg);
        return this;
    }

    /**
    * Creates a new metaobject definition.
    */

    public MetaobjectDefinitionCreatePayload getMetaobjectDefinitionCreate() {
        return (MetaobjectDefinitionCreatePayload) get("metaobjectDefinitionCreate");
    }

    public Mutation setMetaobjectDefinitionCreate(MetaobjectDefinitionCreatePayload arg) {
        optimisticData.put(getKey("metaobjectDefinitionCreate"), arg);
        return this;
    }

    /**
    * Deletes the specified metaobject definition.
    * Also deletes all related metafield definitions, metaobjects, and metafields asynchronously.
    */

    public MetaobjectDefinitionDeletePayload getMetaobjectDefinitionDelete() {
        return (MetaobjectDefinitionDeletePayload) get("metaobjectDefinitionDelete");
    }

    public Mutation setMetaobjectDefinitionDelete(MetaobjectDefinitionDeletePayload arg) {
        optimisticData.put(getKey("metaobjectDefinitionDelete"), arg);
        return this;
    }

    /**
    * Updates a metaobject definition with new settings and metafield definitions.
    */

    public MetaobjectDefinitionUpdatePayload getMetaobjectDefinitionUpdate() {
        return (MetaobjectDefinitionUpdatePayload) get("metaobjectDefinitionUpdate");
    }

    public Mutation setMetaobjectDefinitionUpdate(MetaobjectDefinitionUpdatePayload arg) {
        optimisticData.put(getKey("metaobjectDefinitionUpdate"), arg);
        return this;
    }

    /**
    * Deletes the specified metaobject and its associated metafields.
    */

    public MetaobjectDeletePayload getMetaobjectDelete() {
        return (MetaobjectDeletePayload) get("metaobjectDelete");
    }

    public Mutation setMetaobjectDelete(MetaobjectDeletePayload arg) {
        optimisticData.put(getKey("metaobjectDelete"), arg);
        return this;
    }

    /**
    * Updates an existing metaobject.
    */

    public MetaobjectUpdatePayload getMetaobjectUpdate() {
        return (MetaobjectUpdatePayload) get("metaobjectUpdate");
    }

    public Mutation setMetaobjectUpdate(MetaobjectUpdatePayload arg) {
        optimisticData.put(getKey("metaobjectUpdate"), arg);
        return this;
    }

    /**
    * Retrieves a metaobject by handle, then updates it with the provided input values.
    * If no matching metaobject is found, a new metaobject is created with the provided input values.
    */

    public MetaobjectUpsertPayload getMetaobjectUpsert() {
        return (MetaobjectUpsertPayload) get("metaobjectUpsert");
    }

    public Mutation setMetaobjectUpsert(MetaobjectUpsertPayload arg) {
        optimisticData.put(getKey("metaobjectUpsert"), arg);
        return this;
    }

    /**
    * Create a mobile platform application.
    */

    public MobilePlatformApplicationCreatePayload getMobilePlatformApplicationCreate() {
        return (MobilePlatformApplicationCreatePayload) get("mobilePlatformApplicationCreate");
    }

    public Mutation setMobilePlatformApplicationCreate(MobilePlatformApplicationCreatePayload arg) {
        optimisticData.put(getKey("mobilePlatformApplicationCreate"), arg);
        return this;
    }

    /**
    * Delete a mobile platform application.
    */

    public MobilePlatformApplicationDeletePayload getMobilePlatformApplicationDelete() {
        return (MobilePlatformApplicationDeletePayload) get("mobilePlatformApplicationDelete");
    }

    public Mutation setMobilePlatformApplicationDelete(MobilePlatformApplicationDeletePayload arg) {
        optimisticData.put(getKey("mobilePlatformApplicationDelete"), arg);
        return this;
    }

    /**
    * Update a mobile platform application.
    */

    public MobilePlatformApplicationUpdatePayload getMobilePlatformApplicationUpdate() {
        return (MobilePlatformApplicationUpdatePayload) get("mobilePlatformApplicationUpdate");
    }

    public Mutation setMobilePlatformApplicationUpdate(MobilePlatformApplicationUpdatePayload arg) {
        optimisticData.put(getKey("mobilePlatformApplicationUpdate"), arg);
        return this;
    }

    /**
    * Cancels an order.
    */

    public OrderCancelPayload getOrderCancel() {
        return (OrderCancelPayload) get("orderCancel");
    }

    public Mutation setOrderCancel(OrderCancelPayload arg) {
        optimisticData.put(getKey("orderCancel"), arg);
        return this;
    }

    /**
    * Captures payment for an authorized transaction on an order. An order can only be captured if it has
    * a successful authorization transaction. Capturing an order will claim the money reserved by the
    * authorization. orderCapture can be used to capture multiple times as long as the OrderTransaction is
    * multi-capturable. To capture a partial payment, the included `amount` value should be less than the
    * total order amount. Multi-capture is available only to stores on a Shopify Plus plan.
    */

    public OrderCapturePayload getOrderCapture() {
        return (OrderCapturePayload) get("orderCapture");
    }

    public Mutation setOrderCapture(OrderCapturePayload arg) {
        optimisticData.put(getKey("orderCapture"), arg);
        return this;
    }

    /**
    * Closes an open order.
    */

    public OrderClosePayload getOrderClose() {
        return (OrderClosePayload) get("orderClose");
    }

    public Mutation setOrderClose(OrderClosePayload arg) {
        optimisticData.put(getKey("orderClose"), arg);
        return this;
    }

    /**
    * Creates an order.
    */

    public OrderCreatePayload getOrderCreate() {
        return (OrderCreatePayload) get("orderCreate");
    }

    public Mutation setOrderCreate(OrderCreatePayload arg) {
        optimisticData.put(getKey("orderCreate"), arg);
        return this;
    }

    /**
    * Creates a payment for an order by mandate.
    */

    public OrderCreateMandatePaymentPayload getOrderCreateMandatePayment() {
        return (OrderCreateMandatePaymentPayload) get("orderCreateMandatePayment");
    }

    public Mutation setOrderCreateMandatePayment(OrderCreateMandatePaymentPayload arg) {
        optimisticData.put(getKey("orderCreateMandatePayment"), arg);
        return this;
    }

    /**
    * Deletes an order. For more information on which orders can be deleted, refer to [Delete an
    * order](https://help.shopify.com/manual/orders/cancel-delete-order#delete-an-order).
    */

    public OrderDeletePayload getOrderDelete() {
        return (OrderDeletePayload) get("orderDelete");
    }

    public Mutation setOrderDelete(OrderDeletePayload arg) {
        optimisticData.put(getKey("orderDelete"), arg);
        return this;
    }

    /**
    * Adds a custom line item to an existing order. For example, you could add a gift wrapping service as
    * a [custom line
    * item](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing#add-a-custom-line-ite
    * m). To learn how to edit existing orders, refer to [Edit an existing order with Admin
    * API](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */

    public OrderEditAddCustomItemPayload getOrderEditAddCustomItem() {
        return (OrderEditAddCustomItemPayload) get("orderEditAddCustomItem");
    }

    public Mutation setOrderEditAddCustomItem(OrderEditAddCustomItemPayload arg) {
        optimisticData.put(getKey("orderEditAddCustomItem"), arg);
        return this;
    }

    /**
    * Adds a discount to a line item on the current order edit. For more information on how to use the
    * GraphQL Admin API to edit an existing order, refer to [Edit existing
    * orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */

    public OrderEditAddLineItemDiscountPayload getOrderEditAddLineItemDiscount() {
        return (OrderEditAddLineItemDiscountPayload) get("orderEditAddLineItemDiscount");
    }

    public Mutation setOrderEditAddLineItemDiscount(OrderEditAddLineItemDiscountPayload arg) {
        optimisticData.put(getKey("orderEditAddLineItemDiscount"), arg);
        return this;
    }

    /**
    * Adds a shipping line to an existing order. For more information on how to use the GraphQL Admin API
    * to edit an existing order, refer to [Edit existing
    * orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */

    public OrderEditAddShippingLinePayload getOrderEditAddShippingLine() {
        return (OrderEditAddShippingLinePayload) get("orderEditAddShippingLine");
    }

    public Mutation setOrderEditAddShippingLine(OrderEditAddShippingLinePayload arg) {
        optimisticData.put(getKey("orderEditAddShippingLine"), arg);
        return this;
    }

    /**
    * Adds a line item from an existing product variant. As of API version 2025-04, the
    * [orderEditAddVariant](https://shopify.dev/api/admin-graphql/latest/mutations/ordereditaddvariant)
    * API will respect the contextual pricing of the variant.
    */

    public OrderEditAddVariantPayload getOrderEditAddVariant() {
        return (OrderEditAddVariantPayload) get("orderEditAddVariant");
    }

    public Mutation setOrderEditAddVariant(OrderEditAddVariantPayload arg) {
        optimisticData.put(getKey("orderEditAddVariant"), arg);
        return this;
    }

    /**
    * Starts editing an order. Mutations are operating on `OrderEdit`.
    * All order edits start with `orderEditBegin`, have any number of `orderEdit`* mutations made, and end
    * with `orderEditCommit`.
    */

    public OrderEditBeginPayload getOrderEditBegin() {
        return (OrderEditBeginPayload) get("orderEditBegin");
    }

    public Mutation setOrderEditBegin(OrderEditBeginPayload arg) {
        optimisticData.put(getKey("orderEditBegin"), arg);
        return this;
    }

    /**
    * Applies and saves staged changes to an order. Mutations are operating on `OrderEdit`.
    * All order edits start with `orderEditBegin`, have any number of `orderEdit`* mutations made, and end
    * with `orderEditCommit`.
    */

    public OrderEditCommitPayload getOrderEditCommit() {
        return (OrderEditCommitPayload) get("orderEditCommit");
    }

    public Mutation setOrderEditCommit(OrderEditCommitPayload arg) {
        optimisticData.put(getKey("orderEditCommit"), arg);
        return this;
    }

    /**
    * Removes a discount on the current order edit. For more information on how to use the GraphQL Admin
    * API to edit an existing order, refer to [Edit existing
    * orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */

    public OrderEditRemoveDiscountPayload getOrderEditRemoveDiscount() {
        return (OrderEditRemoveDiscountPayload) get("orderEditRemoveDiscount");
    }

    public Mutation setOrderEditRemoveDiscount(OrderEditRemoveDiscountPayload arg) {
        optimisticData.put(getKey("orderEditRemoveDiscount"), arg);
        return this;
    }

    /**
    * Removes a shipping line from an existing order. For more information on how to use the GraphQL Admin
    * API to edit an existing order, refer to [Edit existing
    * orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */

    public OrderEditRemoveShippingLinePayload getOrderEditRemoveShippingLine() {
        return (OrderEditRemoveShippingLinePayload) get("orderEditRemoveShippingLine");
    }

    public Mutation setOrderEditRemoveShippingLine(OrderEditRemoveShippingLinePayload arg) {
        optimisticData.put(getKey("orderEditRemoveShippingLine"), arg);
        return this;
    }

    /**
    * Sets the quantity of a line item on an order that is being edited. For more information on how to
    * use the GraphQL Admin API to edit an existing order, refer to [Edit existing
    * orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */

    public OrderEditSetQuantityPayload getOrderEditSetQuantity() {
        return (OrderEditSetQuantityPayload) get("orderEditSetQuantity");
    }

    public Mutation setOrderEditSetQuantity(OrderEditSetQuantityPayload arg) {
        optimisticData.put(getKey("orderEditSetQuantity"), arg);
        return this;
    }

    /**
    * Updates a manual line level discount on the current order edit. For more information on how to use
    * the GraphQL Admin API to edit an existing order, refer to [Edit existing
    * orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */

    public OrderEditUpdateDiscountPayload getOrderEditUpdateDiscount() {
        return (OrderEditUpdateDiscountPayload) get("orderEditUpdateDiscount");
    }

    public Mutation setOrderEditUpdateDiscount(OrderEditUpdateDiscountPayload arg) {
        optimisticData.put(getKey("orderEditUpdateDiscount"), arg);
        return this;
    }

    /**
    * Updates a shipping line on the current order edit. For more information on how to use the GraphQL
    * Admin API to edit an existing order, refer to [Edit existing
    * orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */

    public OrderEditUpdateShippingLinePayload getOrderEditUpdateShippingLine() {
        return (OrderEditUpdateShippingLinePayload) get("orderEditUpdateShippingLine");
    }

    public Mutation setOrderEditUpdateShippingLine(OrderEditUpdateShippingLinePayload arg) {
        optimisticData.put(getKey("orderEditUpdateShippingLine"), arg);
        return this;
    }

    /**
    * Sends an email invoice for an order.
    */

    public OrderInvoiceSendPayload getOrderInvoiceSend() {
        return (OrderInvoiceSendPayload) get("orderInvoiceSend");
    }

    public Mutation setOrderInvoiceSend(OrderInvoiceSendPayload arg) {
        optimisticData.put(getKey("orderInvoiceSend"), arg);
        return this;
    }

    /**
    * Marks an order as paid. You can only mark an order as paid if it isn't already fully paid.
    */

    public OrderMarkAsPaidPayload getOrderMarkAsPaid() {
        return (OrderMarkAsPaidPayload) get("orderMarkAsPaid");
    }

    public Mutation setOrderMarkAsPaid(OrderMarkAsPaidPayload arg) {
        optimisticData.put(getKey("orderMarkAsPaid"), arg);
        return this;
    }

    /**
    * Opens a closed order.
    */

    public OrderOpenPayload getOrderOpen() {
        return (OrderOpenPayload) get("orderOpen");
    }

    public Mutation setOrderOpen(OrderOpenPayload arg) {
        optimisticData.put(getKey("orderOpen"), arg);
        return this;
    }

    /**
    * Create a risk assessment for an order.
    */

    public OrderRiskAssessmentCreatePayload getOrderRiskAssessmentCreate() {
        return (OrderRiskAssessmentCreatePayload) get("orderRiskAssessmentCreate");
    }

    public Mutation setOrderRiskAssessmentCreate(OrderRiskAssessmentCreatePayload arg) {
        optimisticData.put(getKey("orderRiskAssessmentCreate"), arg);
        return this;
    }

    /**
    * Updates the fields of an order.
    */

    public OrderUpdatePayload getOrderUpdate() {
        return (OrderUpdatePayload) get("orderUpdate");
    }

    public Mutation setOrderUpdate(OrderUpdatePayload arg) {
        optimisticData.put(getKey("orderUpdate"), arg);
        return this;
    }

    /**
    * Creates a page.
    */

    public PageCreatePayload getPageCreate() {
        return (PageCreatePayload) get("pageCreate");
    }

    public Mutation setPageCreate(PageCreatePayload arg) {
        optimisticData.put(getKey("pageCreate"), arg);
        return this;
    }

    /**
    * Deletes a page.
    */

    public PageDeletePayload getPageDelete() {
        return (PageDeletePayload) get("pageDelete");
    }

    public Mutation setPageDelete(PageDeletePayload arg) {
        optimisticData.put(getKey("pageDelete"), arg);
        return this;
    }

    /**
    * Updates a page.
    */

    public PageUpdatePayload getPageUpdate() {
        return (PageUpdatePayload) get("pageUpdate");
    }

    public Mutation setPageUpdate(PageUpdatePayload arg) {
        optimisticData.put(getKey("pageUpdate"), arg);
        return this;
    }

    /**
    * Activates and deactivates payment customizations.
    */

    public PaymentCustomizationActivationPayload getPaymentCustomizationActivation() {
        return (PaymentCustomizationActivationPayload) get("paymentCustomizationActivation");
    }

    public Mutation setPaymentCustomizationActivation(PaymentCustomizationActivationPayload arg) {
        optimisticData.put(getKey("paymentCustomizationActivation"), arg);
        return this;
    }

    /**
    * Creates a payment customization.
    */

    public PaymentCustomizationCreatePayload getPaymentCustomizationCreate() {
        return (PaymentCustomizationCreatePayload) get("paymentCustomizationCreate");
    }

    public Mutation setPaymentCustomizationCreate(PaymentCustomizationCreatePayload arg) {
        optimisticData.put(getKey("paymentCustomizationCreate"), arg);
        return this;
    }

    /**
    * Deletes a payment customization.
    */

    public PaymentCustomizationDeletePayload getPaymentCustomizationDelete() {
        return (PaymentCustomizationDeletePayload) get("paymentCustomizationDelete");
    }

    public Mutation setPaymentCustomizationDelete(PaymentCustomizationDeletePayload arg) {
        optimisticData.put(getKey("paymentCustomizationDelete"), arg);
        return this;
    }

    /**
    * Updates a payment customization.
    */

    public PaymentCustomizationUpdatePayload getPaymentCustomizationUpdate() {
        return (PaymentCustomizationUpdatePayload) get("paymentCustomizationUpdate");
    }

    public Mutation setPaymentCustomizationUpdate(PaymentCustomizationUpdatePayload arg) {
        optimisticData.put(getKey("paymentCustomizationUpdate"), arg);
        return this;
    }

    /**
    * Sends an email payment reminder for a payment schedule.
    */

    public PaymentReminderSendPayload getPaymentReminderSend() {
        return (PaymentReminderSendPayload) get("paymentReminderSend");
    }

    public Mutation setPaymentReminderSend(PaymentReminderSendPayload arg) {
        optimisticData.put(getKey("paymentReminderSend"), arg);
        return this;
    }

    /**
    * Create payment terms on an order. To create payment terms on a draft order, use a draft order
    * mutation and include the request with the `DraftOrderInput`.
    */

    public PaymentTermsCreatePayload getPaymentTermsCreate() {
        return (PaymentTermsCreatePayload) get("paymentTermsCreate");
    }

    public Mutation setPaymentTermsCreate(PaymentTermsCreatePayload arg) {
        optimisticData.put(getKey("paymentTermsCreate"), arg);
        return this;
    }

    /**
    * Delete payment terms for an order. To delete payment terms on a draft order, use a draft order
    * mutation and include the request with the `DraftOrderInput`.
    */

    public PaymentTermsDeletePayload getPaymentTermsDelete() {
        return (PaymentTermsDeletePayload) get("paymentTermsDelete");
    }

    public Mutation setPaymentTermsDelete(PaymentTermsDeletePayload arg) {
        optimisticData.put(getKey("paymentTermsDelete"), arg);
        return this;
    }

    /**
    * Update payment terms on an order. To update payment terms on a draft order, use a draft order
    * mutation and include the request with the `DraftOrderInput`.
    */

    public PaymentTermsUpdatePayload getPaymentTermsUpdate() {
        return (PaymentTermsUpdatePayload) get("paymentTermsUpdate");
    }

    public Mutation setPaymentTermsUpdate(PaymentTermsUpdatePayload arg) {
        optimisticData.put(getKey("paymentTermsUpdate"), arg);
        return this;
    }

    /**
    * Creates a price list. You can use the `priceListCreate` mutation to create a new price list and
    * associate it with a catalog. This enables you to sell your products with contextual pricing.
    */

    public PriceListCreatePayload getPriceListCreate() {
        return (PriceListCreatePayload) get("priceListCreate");
    }

    public Mutation setPriceListCreate(PriceListCreatePayload arg) {
        optimisticData.put(getKey("priceListCreate"), arg);
        return this;
    }

    /**
    * Deletes a price list. For example, you can delete a price list so that it no longer applies for
    * products in the associated market.
    */

    public PriceListDeletePayload getPriceListDelete() {
        return (PriceListDeletePayload) get("priceListDelete");
    }

    public Mutation setPriceListDelete(PriceListDeletePayload arg) {
        optimisticData.put(getKey("priceListDelete"), arg);
        return this;
    }

    /**
    * Creates or updates fixed prices on a price list. You can use the `priceListFixedPricesAdd` mutation
    * to set a fixed price for specific product variants. This lets you change product variant pricing on
    * a per country basis. Any existing fixed price list prices for these variants will be overwritten.
    */

    public PriceListFixedPricesAddPayload getPriceListFixedPricesAdd() {
        return (PriceListFixedPricesAddPayload) get("priceListFixedPricesAdd");
    }

    public Mutation setPriceListFixedPricesAdd(PriceListFixedPricesAddPayload arg) {
        optimisticData.put(getKey("priceListFixedPricesAdd"), arg);
        return this;
    }

    /**
    * Updates the fixed prices for all variants for a product on a price list. You can use the
    * `priceListFixedPricesByProductUpdate` mutation to set or remove a fixed price for all variants of a
    * product associated with the price list.
    */

    public PriceListFixedPricesByProductUpdatePayload getPriceListFixedPricesByProductUpdate() {
        return (PriceListFixedPricesByProductUpdatePayload) get("priceListFixedPricesByProductUpdate");
    }

    public Mutation setPriceListFixedPricesByProductUpdate(PriceListFixedPricesByProductUpdatePayload arg) {
        optimisticData.put(getKey("priceListFixedPricesByProductUpdate"), arg);
        return this;
    }

    /**
    * Deletes specific fixed prices from a price list using a product variant ID. You can use the
    * `priceListFixedPricesDelete` mutation to delete a set of fixed prices from a price list. After
    * deleting the set of fixed prices from the price list, the price of each product variant reverts to
    * the original price that was determined by the price list adjustment.
    */

    public PriceListFixedPricesDeletePayload getPriceListFixedPricesDelete() {
        return (PriceListFixedPricesDeletePayload) get("priceListFixedPricesDelete");
    }

    public Mutation setPriceListFixedPricesDelete(PriceListFixedPricesDeletePayload arg) {
        optimisticData.put(getKey("priceListFixedPricesDelete"), arg);
        return this;
    }

    /**
    * Updates fixed prices on a price list. You can use the `priceListFixedPricesUpdate` mutation to set a
    * fixed price for specific product variants or to delete prices for variants associated with the price
    * list.
    */

    public PriceListFixedPricesUpdatePayload getPriceListFixedPricesUpdate() {
        return (PriceListFixedPricesUpdatePayload) get("priceListFixedPricesUpdate");
    }

    public Mutation setPriceListFixedPricesUpdate(PriceListFixedPricesUpdatePayload arg) {
        optimisticData.put(getKey("priceListFixedPricesUpdate"), arg);
        return this;
    }

    /**
    * Updates a price list.
    * If you modify the currency, then any fixed prices set on the price list will be deleted.
    */

    public PriceListUpdatePayload getPriceListUpdate() {
        return (PriceListUpdatePayload) get("priceListUpdate");
    }

    public Mutation setPriceListUpdate(PriceListUpdatePayload arg) {
        optimisticData.put(getKey("priceListUpdate"), arg);
        return this;
    }

    /**
    * Creates a new componentized product.
    */

    public ProductBundleCreatePayload getProductBundleCreate() {
        return (ProductBundleCreatePayload) get("productBundleCreate");
    }

    public Mutation setProductBundleCreate(ProductBundleCreatePayload arg) {
        optimisticData.put(getKey("productBundleCreate"), arg);
        return this;
    }

    /**
    * Updates a componentized product.
    */

    public ProductBundleUpdatePayload getProductBundleUpdate() {
        return (ProductBundleUpdatePayload) get("productBundleUpdate");
    }

    public Mutation setProductBundleUpdate(ProductBundleUpdatePayload arg) {
        optimisticData.put(getKey("productBundleUpdate"), arg);
        return this;
    }

    /**
    * Creates a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
    * with attributes such as title, description, and vendor.
    * You can use the `productCreate` mutation to define
    * [options](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption) and
    * [values](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOptionValue)
    * for products with
    * [product variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant),
    * such as different sizes or colors.
    * To create multiple product variants for a single product and manage prices, use the
    * [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkCreate)
    * mutation.
    * To create or update a product in a single request, use the
    * [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet) mutation.
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
    * and [adding product
    * data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
    */

    public ProductCreatePayload getProductCreate() {
        return (ProductCreatePayload) get("productCreate");
    }

    public Mutation setProductCreate(ProductCreatePayload arg) {
        optimisticData.put(getKey("productCreate"), arg);
        return this;
    }

    /**
    * Deletes a product, including all associated variants and media.
    * As of API version `2023-01`, if you need to delete a large product, such as one that has many
    * [variants](https://shopify.dev/api/admin-graphql/latest/input-objects/ProductVariantInput)
    * that are active at several
    * [locations](https://shopify.dev/api/admin-graphql/latest/input-objects/InventoryLevelInput),
    * you may encounter timeout errors. To avoid these timeout errors, you can instead use the
    * asynchronous
    * [ProductDeleteAsync](https://shopify.dev/api/admin-graphql/latest/mutations/productDeleteAsync)
    * mutation.
    */

    public ProductDeletePayload getProductDelete() {
        return (ProductDeletePayload) get("productDelete");
    }

    public Mutation setProductDelete(ProductDeletePayload arg) {
        optimisticData.put(getKey("productDelete"), arg);
        return this;
    }

    /**
    * Duplicates a product.
    * If you need to duplicate a large product, such as one that has many
    * [variants](https://shopify.dev/api/admin-graphql/latest/input-objects/ProductVariantInput)
    * that are active at several
    * [locations](https://shopify.dev/api/admin-graphql/latest/input-objects/InventoryLevelInput),
    * you might encounter timeout errors.
    * To avoid these timeout errors, you can instead duplicate the product asynchronously.
    * In API version 2024-10 and higher, include `synchronous: false` argument in this mutation to perform
    * the duplication asynchronously.
    * In API version 2024-07 and lower, use the asynchronous
    * [`ProductDuplicateAsyncV2`](https://shopify.dev/api/admin-graphql/2024-07/mutations/productDuplicate
    * AsyncV2).
    * Metafield values are not duplicated if the unique values capability is enabled.
    */

    public ProductDuplicatePayload getProductDuplicate() {
        return (ProductDuplicatePayload) get("productDuplicate");
    }

    public Mutation setProductDuplicate(ProductDuplicatePayload arg) {
        optimisticData.put(getKey("productDuplicate"), arg);
        return this;
    }

    /**
    * Creates a product feed for a specific publication.
    */

    public ProductFeedCreatePayload getProductFeedCreate() {
        return (ProductFeedCreatePayload) get("productFeedCreate");
    }

    public Mutation setProductFeedCreate(ProductFeedCreatePayload arg) {
        optimisticData.put(getKey("productFeedCreate"), arg);
        return this;
    }

    /**
    * Deletes a product feed for a specific publication.
    */

    public ProductFeedDeletePayload getProductFeedDelete() {
        return (ProductFeedDeletePayload) get("productFeedDelete");
    }

    public Mutation setProductFeedDelete(ProductFeedDeletePayload arg) {
        optimisticData.put(getKey("productFeedDelete"), arg);
        return this;
    }

    /**
    * Runs the full product sync for a given shop.
    */

    public ProductFullSyncPayload getProductFullSync() {
        return (ProductFullSyncPayload) get("productFullSync");
    }

    public Mutation setProductFullSync(ProductFullSyncPayload arg) {
        optimisticData.put(getKey("productFullSync"), arg);
        return this;
    }

    /**
    * Adds multiple selling plan groups to a product.
    */

    public ProductJoinSellingPlanGroupsPayload getProductJoinSellingPlanGroups() {
        return (ProductJoinSellingPlanGroupsPayload) get("productJoinSellingPlanGroups");
    }

    public Mutation setProductJoinSellingPlanGroups(ProductJoinSellingPlanGroupsPayload arg) {
        optimisticData.put(getKey("productJoinSellingPlanGroups"), arg);
        return this;
    }

    /**
    * Removes multiple groups from a product.
    */

    public ProductLeaveSellingPlanGroupsPayload getProductLeaveSellingPlanGroups() {
        return (ProductLeaveSellingPlanGroupsPayload) get("productLeaveSellingPlanGroups");
    }

    public Mutation setProductLeaveSellingPlanGroups(ProductLeaveSellingPlanGroupsPayload arg) {
        optimisticData.put(getKey("productLeaveSellingPlanGroups"), arg);
        return this;
    }

    /**
    * Updates a product option.
    */

    public ProductOptionUpdatePayload getProductOptionUpdate() {
        return (ProductOptionUpdatePayload) get("productOptionUpdate");
    }

    public Mutation setProductOptionUpdate(ProductOptionUpdatePayload arg) {
        optimisticData.put(getKey("productOptionUpdate"), arg);
        return this;
    }

    /**
    * Creates options on a product.
    */

    public ProductOptionsCreatePayload getProductOptionsCreate() {
        return (ProductOptionsCreatePayload) get("productOptionsCreate");
    }

    public Mutation setProductOptionsCreate(ProductOptionsCreatePayload arg) {
        optimisticData.put(getKey("productOptionsCreate"), arg);
        return this;
    }

    /**
    * Deletes the specified options.
    */

    public ProductOptionsDeletePayload getProductOptionsDelete() {
        return (ProductOptionsDeletePayload) get("productOptionsDelete");
    }

    public Mutation setProductOptionsDelete(ProductOptionsDeletePayload arg) {
        optimisticData.put(getKey("productOptionsDelete"), arg);
        return this;
    }

    /**
    * Reorders options and option values on a product, causing product variants to alter their position.
    * Options order take precedence over option values order. Depending on the existing product variants,
    * some input orders might not be achieved.
    * Example:
    * Existing product variants:
    * ["Red / Small", "Green / Medium", "Blue / Small"].
    * New order:
    * [
    * {
        * name: "Size", values: [{ name: "Small" }, { name: "Medium" }],
        * name: "Color", values: [{ name: "Green" }, { name: "Red" }, { name: "Blue" }]
        * }
        * ].
        * Description:
        * Variants with "Green" value are expected to appear before variants with "Red" and "Blue" values.
        * However, "Size" option appears before "Color".
        * Therefore, output will be:
        * ["Small / "Red", "Small / Blue", "Medium / Green"].
        */

        public ProductOptionsReorderPayload getProductOptionsReorder() {
            return (ProductOptionsReorderPayload) get("productOptionsReorder");
        }

        public Mutation setProductOptionsReorder(ProductOptionsReorderPayload arg) {
            optimisticData.put(getKey("productOptionsReorder"), arg);
            return this;
        }

        /**
        * Asynchronously reorders the media attached to a product.
        */

        public ProductReorderMediaPayload getProductReorderMedia() {
            return (ProductReorderMediaPayload) get("productReorderMedia");
        }

        public Mutation setProductReorderMedia(ProductReorderMediaPayload arg) {
            optimisticData.put(getKey("productReorderMedia"), arg);
            return this;
        }

        /**
        * Creates or updates a product in a single request.
        * Use this mutation when syncing information from an external data source into Shopify.
        * When using this mutation to update a product, specify that product's `id` in the input.
        * Any list field (e.g.
        * [collections](https://shopify.dev/api/admin-graphql/current/input-objects/ProductSetInput#field-prod
        * uctsetinput-collections),
        * [metafields](https://shopify.dev/api/admin-graphql/current/input-objects/ProductSetInput#field-produ
        * ctsetinput-metafields),
        * [variants](https://shopify.dev/api/admin-graphql/current/input-objects/ProductSetInput#field-product
        * setinput-variants))
        * will be updated so that all included entries are either created or updated, and all existing entries
        * not
        * included will be deleted.
        * All other fields will be updated to the value passed. Omitted fields will not be updated.
        * When run in synchronous mode, you will get the product back in the response.
        * For versions `2024-04` and earlier, the synchronous mode has an input limit of 100 variants.
        * This limit has been removed for versions `2024-07` and later.
        * In asynchronous mode, you will instead get a
        * [ProductSetOperation](https://shopify.dev/api/admin-graphql/current/objects/ProductSetOperation)
        * object back. You can then use the
        * [productOperation](https://shopify.dev/api/admin-graphql/current/queries/productOperation) query to
        * retrieve the updated product data. This query uses the `ProductSetOperation` object to
        * check the status of the operation and to retrieve the details of the updated product and its
        * variants.
        * If you need to update a subset of variants, use one of the bulk variant mutations:
        * -
        * [productVariantsBulkCreate](https://shopify.dev/api/admin-graphql/current/mutations/productVariantsB
        * ulkCreate)
        * -
        * [productVariantsBulkUpdate](https://shopify.dev/api/admin-graphql/current/mutations/productVariantsB
        * ulkUpdate)
        * -
        * [productVariantsBulkDelete](https://shopify.dev/api/admin-graphql/current/mutations/productVariantsB
        * ulkDelete)
        * If you need to update options, use one of the product option mutations:
        * -
        * [productOptionsCreate](https://shopify.dev/api/admin-graphql/current/mutations/productOptionsCreate)
        * - [productOptionUpdate](https://shopify.dev/api/admin-graphql/current/mutations/productOptionUpdate)
        * -
        * [productOptionsDelete](https://shopify.dev/api/admin-graphql/current/mutations/productOptionsDelete)
        * -
        * [productOptionsReorder](https://shopify.dev/api/admin-graphql/current/mutations/productOptionsReorde
        * r)
        * See our guide to
        * [sync product data from an external
        * source](https://shopify.dev/api/admin/migrate/new-product-model/sync-data)
        * for more.
        */

        public ProductSetPayload getProductSet() {
            return (ProductSetPayload) get("productSet");
        }

        public Mutation setProductSet(ProductSetPayload arg) {
            optimisticData.put(getKey("productSet"), arg);
            return this;
        }

        /**
        * Updates a product.
        * For versions `2024-01` and older:
        * If you update a product and only include some variants in the update,
        * then any variants not included will be deleted.
        * To safely manage variants without the risk of
        * deleting excluded variants, use
        * [productVariantsBulkUpdate](https://shopify.dev/api/admin-graphql/latest/mutations/productvariantsbu
        * lkupdate).
        * If you want to update a single variant, then use
        * [productVariantUpdate](https://shopify.dev/api/admin-graphql/latest/mutations/productvariantupdate).
        */

        public ProductUpdatePayload getProductUpdate() {
            return (ProductUpdatePayload) get("productUpdate");
        }

        public Mutation setProductUpdate(ProductUpdatePayload arg) {
            optimisticData.put(getKey("productUpdate"), arg);
            return this;
        }

        /**
        * Appends media from a product to variants of the product.
        */

        public ProductVariantAppendMediaPayload getProductVariantAppendMedia() {
            return (ProductVariantAppendMediaPayload) get("productVariantAppendMedia");
        }

        public Mutation setProductVariantAppendMedia(ProductVariantAppendMediaPayload arg) {
            optimisticData.put(getKey("productVariantAppendMedia"), arg);
            return this;
        }

        /**
        * Detaches media from product variants.
        */

        public ProductVariantDetachMediaPayload getProductVariantDetachMedia() {
            return (ProductVariantDetachMediaPayload) get("productVariantDetachMedia");
        }

        public Mutation setProductVariantDetachMedia(ProductVariantDetachMediaPayload arg) {
            optimisticData.put(getKey("productVariantDetachMedia"), arg);
            return this;
        }

        /**
        * Adds multiple selling plan groups to a product variant.
        */

        public ProductVariantJoinSellingPlanGroupsPayload getProductVariantJoinSellingPlanGroups() {
            return (ProductVariantJoinSellingPlanGroupsPayload) get("productVariantJoinSellingPlanGroups");
        }

        public Mutation setProductVariantJoinSellingPlanGroups(ProductVariantJoinSellingPlanGroupsPayload arg) {
            optimisticData.put(getKey("productVariantJoinSellingPlanGroups"), arg);
            return this;
        }

        /**
        * Remove multiple groups from a product variant.
        */

        public ProductVariantLeaveSellingPlanGroupsPayload getProductVariantLeaveSellingPlanGroups() {
            return (ProductVariantLeaveSellingPlanGroupsPayload) get("productVariantLeaveSellingPlanGroups");
        }

        public Mutation setProductVariantLeaveSellingPlanGroups(ProductVariantLeaveSellingPlanGroupsPayload arg) {
            optimisticData.put(getKey("productVariantLeaveSellingPlanGroups"), arg);
            return this;
        }

        /**
        * Creates new bundles, updates existing bundles, and removes bundle components for one or multiple
        * bundles.
        */

        public ProductVariantRelationshipBulkUpdatePayload getProductVariantRelationshipBulkUpdate() {
            return (ProductVariantRelationshipBulkUpdatePayload) get("productVariantRelationshipBulkUpdate");
        }

        public Mutation setProductVariantRelationshipBulkUpdate(ProductVariantRelationshipBulkUpdatePayload arg) {
            optimisticData.put(getKey("productVariantRelationshipBulkUpdate"), arg);
            return this;
        }

        /**
        * Creates multiple variants in a single product. This mutation can be called directly or via the
        * bulkOperation.
        */

        public ProductVariantsBulkCreatePayload getProductVariantsBulkCreate() {
            return (ProductVariantsBulkCreatePayload) get("productVariantsBulkCreate");
        }

        public Mutation setProductVariantsBulkCreate(ProductVariantsBulkCreatePayload arg) {
            optimisticData.put(getKey("productVariantsBulkCreate"), arg);
            return this;
        }

        /**
        * Deletes multiple variants in a single product. This mutation can be called directly or via the
        * bulkOperation.
        */

        public ProductVariantsBulkDeletePayload getProductVariantsBulkDelete() {
            return (ProductVariantsBulkDeletePayload) get("productVariantsBulkDelete");
        }

        public Mutation setProductVariantsBulkDelete(ProductVariantsBulkDeletePayload arg) {
            optimisticData.put(getKey("productVariantsBulkDelete"), arg);
            return this;
        }

        /**
        * Reorders multiple variants in a single product. This mutation can be called directly or via the
        * bulkOperation.
        */

        public ProductVariantsBulkReorderPayload getProductVariantsBulkReorder() {
            return (ProductVariantsBulkReorderPayload) get("productVariantsBulkReorder");
        }

        public Mutation setProductVariantsBulkReorder(ProductVariantsBulkReorderPayload arg) {
            optimisticData.put(getKey("productVariantsBulkReorder"), arg);
            return this;
        }

        /**
        * Updates multiple variants in a single product. This mutation can be called directly or via the
        * bulkOperation.
        */

        public ProductVariantsBulkUpdatePayload getProductVariantsBulkUpdate() {
            return (ProductVariantsBulkUpdatePayload) get("productVariantsBulkUpdate");
        }

        public Mutation setProductVariantsBulkUpdate(ProductVariantsBulkUpdatePayload arg) {
            optimisticData.put(getKey("productVariantsBulkUpdate"), arg);
            return this;
        }

        /**
        * Updates the server pixel to connect to a Google PubSub endpoint.
        * Running this mutation deletes any previous subscriptions for the server pixel.
        */

        public PubSubServerPixelUpdatePayload getPubSubServerPixelUpdate() {
            return (PubSubServerPixelUpdatePayload) get("pubSubServerPixelUpdate");
        }

        public Mutation setPubSubServerPixelUpdate(PubSubServerPixelUpdatePayload arg) {
            optimisticData.put(getKey("pubSubServerPixelUpdate"), arg);
            return this;
        }

        /**
        * Creates a new Google Cloud Pub/Sub webhook subscription.
        * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
        * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
        * date by Shopify & require less maintenance. Please read [About managing webhook
        * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
        */

        public PubSubWebhookSubscriptionCreatePayload getPubSubWebhookSubscriptionCreate() {
            return (PubSubWebhookSubscriptionCreatePayload) get("pubSubWebhookSubscriptionCreate");
        }

        public Mutation setPubSubWebhookSubscriptionCreate(PubSubWebhookSubscriptionCreatePayload arg) {
            optimisticData.put(getKey("pubSubWebhookSubscriptionCreate"), arg);
            return this;
        }

        /**
        * Updates a Google Cloud Pub/Sub webhook subscription.
        * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
        * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
        * date by Shopify & require less maintenance. Please read [About managing webhook
        * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
        */

        public PubSubWebhookSubscriptionUpdatePayload getPubSubWebhookSubscriptionUpdate() {
            return (PubSubWebhookSubscriptionUpdatePayload) get("pubSubWebhookSubscriptionUpdate");
        }

        public Mutation setPubSubWebhookSubscriptionUpdate(PubSubWebhookSubscriptionUpdatePayload arg) {
            optimisticData.put(getKey("pubSubWebhookSubscriptionUpdate"), arg);
            return this;
        }

        /**
        * Creates a publication.
        */

        public PublicationCreatePayload getPublicationCreate() {
            return (PublicationCreatePayload) get("publicationCreate");
        }

        public Mutation setPublicationCreate(PublicationCreatePayload arg) {
            optimisticData.put(getKey("publicationCreate"), arg);
            return this;
        }

        /**
        * Deletes a publication.
        */

        public PublicationDeletePayload getPublicationDelete() {
            return (PublicationDeletePayload) get("publicationDelete");
        }

        public Mutation setPublicationDelete(PublicationDeletePayload arg) {
            optimisticData.put(getKey("publicationDelete"), arg);
            return this;
        }

        /**
        * Updates a publication.
        */

        public PublicationUpdatePayload getPublicationUpdate() {
            return (PublicationUpdatePayload) get("publicationUpdate");
        }

        public Mutation setPublicationUpdate(PublicationUpdatePayload arg) {
            optimisticData.put(getKey("publicationUpdate"), arg);
            return this;
        }

        /**
        * Publishes a resource to a channel. If the resource is a product, then it's visible in the channel
        * only if the product status is `active`. Products that are sold exclusively on subscription
        * (`requiresSellingPlan: true`) can be published only on online stores.
        */

        public PublishablePublishPayload getPublishablePublish() {
            return (PublishablePublishPayload) get("publishablePublish");
        }

        public Mutation setPublishablePublish(PublishablePublishPayload arg) {
            optimisticData.put(getKey("publishablePublish"), arg);
            return this;
        }

        /**
        * Publishes a resource to current channel. If the resource is a product, then it's visible in the
        * channel only if the product status is `active`. Products that are sold exclusively on subscription
        * (`requiresSellingPlan: true`) can be published only on online stores.
        */

        public PublishablePublishToCurrentChannelPayload getPublishablePublishToCurrentChannel() {
            return (PublishablePublishToCurrentChannelPayload) get("publishablePublishToCurrentChannel");
        }

        public Mutation setPublishablePublishToCurrentChannel(PublishablePublishToCurrentChannelPayload arg) {
            optimisticData.put(getKey("publishablePublishToCurrentChannel"), arg);
            return this;
        }

        /**
        * Unpublishes a resource from a channel. If the resource is a product, then it's visible in the
        * channel only if the product status is `active`.
        */

        public PublishableUnpublishPayload getPublishableUnpublish() {
            return (PublishableUnpublishPayload) get("publishableUnpublish");
        }

        public Mutation setPublishableUnpublish(PublishableUnpublishPayload arg) {
            optimisticData.put(getKey("publishableUnpublish"), arg);
            return this;
        }

        /**
        * Unpublishes a resource from the current channel. If the resource is a product, then it's visible in
        * the channel only if the product status is `active`.
        */

        public PublishableUnpublishToCurrentChannelPayload getPublishableUnpublishToCurrentChannel() {
            return (PublishableUnpublishToCurrentChannelPayload) get("publishableUnpublishToCurrentChannel");
        }

        public Mutation setPublishableUnpublishToCurrentChannel(PublishableUnpublishToCurrentChannelPayload arg) {
            optimisticData.put(getKey("publishableUnpublishToCurrentChannel"), arg);
            return this;
        }

        /**
        * Updates quantity pricing on a price list. You can use the `quantityPricingByVariantUpdate` mutation
        * to set fixed prices, quantity rules, and quantity price breaks. This mutation does not allow partial
        * successes. If any of the requested resources fail to update, none of the requested resources will be
        * updated. Delete operations are executed before create operations.
        */

        public QuantityPricingByVariantUpdatePayload getQuantityPricingByVariantUpdate() {
            return (QuantityPricingByVariantUpdatePayload) get("quantityPricingByVariantUpdate");
        }

        public Mutation setQuantityPricingByVariantUpdate(QuantityPricingByVariantUpdatePayload arg) {
            optimisticData.put(getKey("quantityPricingByVariantUpdate"), arg);
            return this;
        }

        /**
        * Creates or updates existing quantity rules on a price list.
        * You can use the `quantityRulesAdd` mutation to set order level minimums, maximumums and increments
        * for specific product variants.
        */

        public QuantityRulesAddPayload getQuantityRulesAdd() {
            return (QuantityRulesAddPayload) get("quantityRulesAdd");
        }

        public Mutation setQuantityRulesAdd(QuantityRulesAddPayload arg) {
            optimisticData.put(getKey("quantityRulesAdd"), arg);
            return this;
        }

        /**
        * Deletes specific quantity rules from a price list using a product variant ID.
        * You can use the `quantityRulesDelete` mutation to delete a set of quantity rules from a price list.
        */

        public QuantityRulesDeletePayload getQuantityRulesDelete() {
            return (QuantityRulesDeletePayload) get("quantityRulesDelete");
        }

        public Mutation setQuantityRulesDelete(QuantityRulesDeletePayload arg) {
            optimisticData.put(getKey("quantityRulesDelete"), arg);
            return this;
        }

        /**
        * Creates a refund.
        */

        public RefundCreatePayload getRefundCreate() {
            return (RefundCreatePayload) get("refundCreate");
        }

        public Mutation setRefundCreate(RefundCreatePayload arg) {
            optimisticData.put(getKey("refundCreate"), arg);
            return this;
        }

        /**
        * Approves a customer's return request.
        * If this mutation is successful, then the `Return.status` field of the
        * approved return is set to `OPEN`.
        */

        public ReturnApproveRequestPayload getReturnApproveRequest() {
            return (ReturnApproveRequestPayload) get("returnApproveRequest");
        }

        public Mutation setReturnApproveRequest(ReturnApproveRequestPayload arg) {
            optimisticData.put(getKey("returnApproveRequest"), arg);
            return this;
        }

        /**
        * Cancels a return and restores the items back to being fulfilled.
        * Canceling a return is only available before any work has been done
        * on the return (such as an inspection or refund).
        */

        public ReturnCancelPayload getReturnCancel() {
            return (ReturnCancelPayload) get("returnCancel");
        }

        public Mutation setReturnCancel(ReturnCancelPayload arg) {
            optimisticData.put(getKey("returnCancel"), arg);
            return this;
        }

        /**
        * Indicates a return is complete, either when a refund has been made and items restocked,
        * or simply when it has been marked as returned in the system.
        */

        public ReturnClosePayload getReturnClose() {
            return (ReturnClosePayload) get("returnClose");
        }

        public Mutation setReturnClose(ReturnClosePayload arg) {
            optimisticData.put(getKey("returnClose"), arg);
            return this;
        }

        /**
        * Creates a return.
        */

        public ReturnCreatePayload getReturnCreate() {
            return (ReturnCreatePayload) get("returnCreate");
        }

        public Mutation setReturnCreate(ReturnCreatePayload arg) {
            optimisticData.put(getKey("returnCreate"), arg);
            return this;
        }

        /**
        * Declines a return on an order.
        * When a return is declined, each `ReturnLineItem.fulfillmentLineItem` can be associated to a new
        * return.
        * Use the `ReturnCreate` or `ReturnRequest` mutation to initiate a new return.
        */

        public ReturnDeclineRequestPayload getReturnDeclineRequest() {
            return (ReturnDeclineRequestPayload) get("returnDeclineRequest");
        }

        public Mutation setReturnDeclineRequest(ReturnDeclineRequestPayload arg) {
            optimisticData.put(getKey("returnDeclineRequest"), arg);
            return this;
        }

        /**
        * Removes return lines from a return.
        */

        public ReturnLineItemRemoveFromReturnPayload getReturnLineItemRemoveFromReturn() {
            return (ReturnLineItemRemoveFromReturnPayload) get("returnLineItemRemoveFromReturn");
        }

        public Mutation setReturnLineItemRemoveFromReturn(ReturnLineItemRemoveFromReturnPayload arg) {
            optimisticData.put(getKey("returnLineItemRemoveFromReturn"), arg);
            return this;
        }

        /**
        * Refunds a return when its status is `OPEN` or `CLOSED` and associates it with the related return
        * request.
        */

        public ReturnRefundPayload getReturnRefund() {
            return (ReturnRefundPayload) get("returnRefund");
        }

        public Mutation setReturnRefund(ReturnRefundPayload arg) {
            optimisticData.put(getKey("returnRefund"), arg);
            return this;
        }

        /**
        * Reopens a closed return.
        */

        public ReturnReopenPayload getReturnReopen() {
            return (ReturnReopenPayload) get("returnReopen");
        }

        public Mutation setReturnReopen(ReturnReopenPayload arg) {
            optimisticData.put(getKey("returnReopen"), arg);
            return this;
        }

        /**
        * A customer's return request that hasn't been approved or declined.
        * This mutation sets the value of the `Return.status` field to `REQUESTED`.
        * To create a return that has the `Return.status` field set to `OPEN`, use the `returnCreate`
        * mutation.
        */

        public ReturnRequestPayload getReturnRequest() {
            return (ReturnRequestPayload) get("returnRequest");
        }

        public Mutation setReturnRequest(ReturnRequestPayload arg) {
            optimisticData.put(getKey("returnRequest"), arg);
            return this;
        }

        /**
        * Creates a new reverse delivery with associated external shipping information.
        */

        public ReverseDeliveryCreateWithShippingPayload getReverseDeliveryCreateWithShipping() {
            return (ReverseDeliveryCreateWithShippingPayload) get("reverseDeliveryCreateWithShipping");
        }

        public Mutation setReverseDeliveryCreateWithShipping(ReverseDeliveryCreateWithShippingPayload arg) {
            optimisticData.put(getKey("reverseDeliveryCreateWithShipping"), arg);
            return this;
        }

        /**
        * Updates a reverse delivery with associated external shipping information.
        */

        public ReverseDeliveryShippingUpdatePayload getReverseDeliveryShippingUpdate() {
            return (ReverseDeliveryShippingUpdatePayload) get("reverseDeliveryShippingUpdate");
        }

        public Mutation setReverseDeliveryShippingUpdate(ReverseDeliveryShippingUpdatePayload arg) {
            optimisticData.put(getKey("reverseDeliveryShippingUpdate"), arg);
            return this;
        }

        /**
        * Disposes reverse fulfillment order line items.
        */

        public ReverseFulfillmentOrderDisposePayload getReverseFulfillmentOrderDispose() {
            return (ReverseFulfillmentOrderDisposePayload) get("reverseFulfillmentOrderDispose");
        }

        public Mutation setReverseFulfillmentOrderDispose(ReverseFulfillmentOrderDisposePayload arg) {
            optimisticData.put(getKey("reverseFulfillmentOrderDispose"), arg);
            return this;
        }

        /**
        * Creates a saved search.
        */

        public SavedSearchCreatePayload getSavedSearchCreate() {
            return (SavedSearchCreatePayload) get("savedSearchCreate");
        }

        public Mutation setSavedSearchCreate(SavedSearchCreatePayload arg) {
            optimisticData.put(getKey("savedSearchCreate"), arg);
            return this;
        }

        /**
        * Delete a saved search.
        */

        public SavedSearchDeletePayload getSavedSearchDelete() {
            return (SavedSearchDeletePayload) get("savedSearchDelete");
        }

        public Mutation setSavedSearchDelete(SavedSearchDeletePayload arg) {
            optimisticData.put(getKey("savedSearchDelete"), arg);
            return this;
        }

        /**
        * Updates a saved search.
        */

        public SavedSearchUpdatePayload getSavedSearchUpdate() {
            return (SavedSearchUpdatePayload) get("savedSearchUpdate");
        }

        public Mutation setSavedSearchUpdate(SavedSearchUpdatePayload arg) {
            optimisticData.put(getKey("savedSearchUpdate"), arg);
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
        * Creates a new script tag.
        */

        public ScriptTagCreatePayload getScriptTagCreate() {
            return (ScriptTagCreatePayload) get("scriptTagCreate");
        }

        public Mutation setScriptTagCreate(ScriptTagCreatePayload arg) {
            optimisticData.put(getKey("scriptTagCreate"), arg);
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
        * Deletes a script tag.
        */

        public ScriptTagDeletePayload getScriptTagDelete() {
            return (ScriptTagDeletePayload) get("scriptTagDelete");
        }

        public Mutation setScriptTagDelete(ScriptTagDeletePayload arg) {
            optimisticData.put(getKey("scriptTagDelete"), arg);
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
        * Updates a script tag.
        */

        public ScriptTagUpdatePayload getScriptTagUpdate() {
            return (ScriptTagUpdatePayload) get("scriptTagUpdate");
        }

        public Mutation setScriptTagUpdate(ScriptTagUpdatePayload arg) {
            optimisticData.put(getKey("scriptTagUpdate"), arg);
            return this;
        }

        /**
        * Creates a segment.
        */

        public SegmentCreatePayload getSegmentCreate() {
            return (SegmentCreatePayload) get("segmentCreate");
        }

        public Mutation setSegmentCreate(SegmentCreatePayload arg) {
            optimisticData.put(getKey("segmentCreate"), arg);
            return this;
        }

        /**
        * Deletes a segment.
        */

        public SegmentDeletePayload getSegmentDelete() {
            return (SegmentDeletePayload) get("segmentDelete");
        }

        public Mutation setSegmentDelete(SegmentDeletePayload arg) {
            optimisticData.put(getKey("segmentDelete"), arg);
            return this;
        }

        /**
        * Updates a segment.
        */

        public SegmentUpdatePayload getSegmentUpdate() {
            return (SegmentUpdatePayload) get("segmentUpdate");
        }

        public Mutation setSegmentUpdate(SegmentUpdatePayload arg) {
            optimisticData.put(getKey("segmentUpdate"), arg);
            return this;
        }

        /**
        * Adds multiple product variants to a selling plan group.
        */

        public SellingPlanGroupAddProductVariantsPayload getSellingPlanGroupAddProductVariants() {
            return (SellingPlanGroupAddProductVariantsPayload) get("sellingPlanGroupAddProductVariants");
        }

        public Mutation setSellingPlanGroupAddProductVariants(SellingPlanGroupAddProductVariantsPayload arg) {
            optimisticData.put(getKey("sellingPlanGroupAddProductVariants"), arg);
            return this;
        }

        /**
        * Adds multiple products to a selling plan group.
        */

        public SellingPlanGroupAddProductsPayload getSellingPlanGroupAddProducts() {
            return (SellingPlanGroupAddProductsPayload) get("sellingPlanGroupAddProducts");
        }

        public Mutation setSellingPlanGroupAddProducts(SellingPlanGroupAddProductsPayload arg) {
            optimisticData.put(getKey("sellingPlanGroupAddProducts"), arg);
            return this;
        }

        /**
        * Creates a Selling Plan Group.
        */

        public SellingPlanGroupCreatePayload getSellingPlanGroupCreate() {
            return (SellingPlanGroupCreatePayload) get("sellingPlanGroupCreate");
        }

        public Mutation setSellingPlanGroupCreate(SellingPlanGroupCreatePayload arg) {
            optimisticData.put(getKey("sellingPlanGroupCreate"), arg);
            return this;
        }

        /**
        * Delete a Selling Plan Group. This does not affect subscription contracts.
        */

        public SellingPlanGroupDeletePayload getSellingPlanGroupDelete() {
            return (SellingPlanGroupDeletePayload) get("sellingPlanGroupDelete");
        }

        public Mutation setSellingPlanGroupDelete(SellingPlanGroupDeletePayload arg) {
            optimisticData.put(getKey("sellingPlanGroupDelete"), arg);
            return this;
        }

        /**
        * Removes multiple product variants from a selling plan group.
        */

        public SellingPlanGroupRemoveProductVariantsPayload getSellingPlanGroupRemoveProductVariants() {
            return (SellingPlanGroupRemoveProductVariantsPayload) get("sellingPlanGroupRemoveProductVariants");
        }

        public Mutation setSellingPlanGroupRemoveProductVariants(SellingPlanGroupRemoveProductVariantsPayload arg) {
            optimisticData.put(getKey("sellingPlanGroupRemoveProductVariants"), arg);
            return this;
        }

        /**
        * Removes multiple products from a selling plan group.
        */

        public SellingPlanGroupRemoveProductsPayload getSellingPlanGroupRemoveProducts() {
            return (SellingPlanGroupRemoveProductsPayload) get("sellingPlanGroupRemoveProducts");
        }

        public Mutation setSellingPlanGroupRemoveProducts(SellingPlanGroupRemoveProductsPayload arg) {
            optimisticData.put(getKey("sellingPlanGroupRemoveProducts"), arg);
            return this;
        }

        /**
        * Update a Selling Plan Group.
        */

        public SellingPlanGroupUpdatePayload getSellingPlanGroupUpdate() {
            return (SellingPlanGroupUpdatePayload) get("sellingPlanGroupUpdate");
        }

        public Mutation setSellingPlanGroupUpdate(SellingPlanGroupUpdatePayload arg) {
            optimisticData.put(getKey("sellingPlanGroupUpdate"), arg);
            return this;
        }

        /**
        * Creates a new unconfigured server pixel. A single server pixel can exist for an app and shop
        * combination. If you call this mutation when a server pixel already exists, then an error will
        * return.
        */

        public ServerPixelCreatePayload getServerPixelCreate() {
            return (ServerPixelCreatePayload) get("serverPixelCreate");
        }

        public Mutation setServerPixelCreate(ServerPixelCreatePayload arg) {
            optimisticData.put(getKey("serverPixelCreate"), arg);
            return this;
        }

        /**
        * Deletes the Server Pixel associated with the current app & shop.
        */

        public ServerPixelDeletePayload getServerPixelDelete() {
            return (ServerPixelDeletePayload) get("serverPixelDelete");
        }

        public Mutation setServerPixelDelete(ServerPixelDeletePayload arg) {
            optimisticData.put(getKey("serverPixelDelete"), arg);
            return this;
        }

        /**
        * Deletes a shipping package.
        */

        public ShippingPackageDeletePayload getShippingPackageDelete() {
            return (ShippingPackageDeletePayload) get("shippingPackageDelete");
        }

        public Mutation setShippingPackageDelete(ShippingPackageDeletePayload arg) {
            optimisticData.put(getKey("shippingPackageDelete"), arg);
            return this;
        }

        /**
        * Set a shipping package as the default.
        * The default shipping package is the one used to calculate shipping costs on checkout.
        */

        public ShippingPackageMakeDefaultPayload getShippingPackageMakeDefault() {
            return (ShippingPackageMakeDefaultPayload) get("shippingPackageMakeDefault");
        }

        public Mutation setShippingPackageMakeDefault(ShippingPackageMakeDefaultPayload arg) {
            optimisticData.put(getKey("shippingPackageMakeDefault"), arg);
            return this;
        }

        /**
        * Updates a shipping package.
        */

        public ShippingPackageUpdatePayload getShippingPackageUpdate() {
            return (ShippingPackageUpdatePayload) get("shippingPackageUpdate");
        }

        public Mutation setShippingPackageUpdate(ShippingPackageUpdatePayload arg) {
            optimisticData.put(getKey("shippingPackageUpdate"), arg);
            return this;
        }

        /**
        * Deletes a locale for a shop. This also deletes all translations of this locale.
        */

        public ShopLocaleDisablePayload getShopLocaleDisable() {
            return (ShopLocaleDisablePayload) get("shopLocaleDisable");
        }

        public Mutation setShopLocaleDisable(ShopLocaleDisablePayload arg) {
            optimisticData.put(getKey("shopLocaleDisable"), arg);
            return this;
        }

        /**
        * Adds a locale for a shop. The newly added locale is in the unpublished state.
        */

        public ShopLocaleEnablePayload getShopLocaleEnable() {
            return (ShopLocaleEnablePayload) get("shopLocaleEnable");
        }

        public Mutation setShopLocaleEnable(ShopLocaleEnablePayload arg) {
            optimisticData.put(getKey("shopLocaleEnable"), arg);
            return this;
        }

        /**
        * Updates a locale for a shop.
        */

        public ShopLocaleUpdatePayload getShopLocaleUpdate() {
            return (ShopLocaleUpdatePayload) get("shopLocaleUpdate");
        }

        public Mutation setShopLocaleUpdate(ShopLocaleUpdatePayload arg) {
            optimisticData.put(getKey("shopLocaleUpdate"), arg);
            return this;
        }

        /**
        * Updates a shop policy.
        */

        public ShopPolicyUpdatePayload getShopPolicyUpdate() {
            return (ShopPolicyUpdatePayload) get("shopPolicyUpdate");
        }

        public Mutation setShopPolicyUpdate(ShopPolicyUpdatePayload arg) {
            optimisticData.put(getKey("shopPolicyUpdate"), arg);
            return this;
        }

        /**
        * The `ResourceFeedback` object lets your app report the status of shops and their resources. For
        * example, if
        * your app is a marketplace channel, then you can use resource feedback to alert merchants that they
        * need to connect their marketplace account by signing in.
        * Resource feedback notifications are displayed to the merchant on the home screen of their Shopify
        * admin, and in the product details view for any products that are published to your app.
        * This resource should be used only in cases where you're describing steps that a merchant is required
        * to complete. If your app offers optional or promotional set-up steps, or if it makes
        * recommendations, then don't use resource feedback to let merchants know about them.
        * ## Sending feedback on a shop
        * You can send resource feedback on a shop to let the merchant know what steps they need to take to
        * make sure that your app is set up correctly. Feedback can have one of two states: `requires_action`
        * or `success`. You need to send a `requires_action` feedback request for each step that the merchant
        * is required to complete.
        * If there are multiple set-up steps that require merchant action, then send feedback with a state of
        * `requires_action` as merchants complete prior steps. And to remove the feedback message from the
        * Shopify admin, send a `success` feedback request.
        * #### Important
        * Sending feedback replaces previously sent feedback for the shop. Send a new
        * `shopResourceFeedbackCreate` mutation to push the latest state of a shop or its resources to
        * Shopify.
        */

        public ShopResourceFeedbackCreatePayload getShopResourceFeedbackCreate() {
            return (ShopResourceFeedbackCreatePayload) get("shopResourceFeedbackCreate");
        }

        public Mutation setShopResourceFeedbackCreate(ShopResourceFeedbackCreatePayload arg) {
            optimisticData.put(getKey("shopResourceFeedbackCreate"), arg);
            return this;
        }

        /**
        * Creates an alternate currency payout for a Shopify Payments account.
        */

        public ShopifyPaymentsPayoutAlternateCurrencyCreatePayload getShopifyPaymentsPayoutAlternateCurrencyCreate() {
            return (ShopifyPaymentsPayoutAlternateCurrencyCreatePayload) get("shopifyPaymentsPayoutAlternateCurrencyCreate");
        }

        public Mutation setShopifyPaymentsPayoutAlternateCurrencyCreate(ShopifyPaymentsPayoutAlternateCurrencyCreatePayload arg) {
            optimisticData.put(getKey("shopifyPaymentsPayoutAlternateCurrencyCreate"), arg);
            return this;
        }

        /**
        * Creates staged upload targets for each input. This is the first step in the upload process.
        * The returned staged upload targets' URL and parameter fields can be used to send a request
        * to upload the file described in the corresponding input.
        * For more information on the upload process, refer to
        * [Upload media to
        * Shopify](https://shopify.dev/apps/online-store/media/products#step-1-upload-media-to-shopify).
        */

        public StagedUploadsCreatePayload getStagedUploadsCreate() {
            return (StagedUploadsCreatePayload) get("stagedUploadsCreate");
        }

        public Mutation setStagedUploadsCreate(StagedUploadsCreatePayload arg) {
            optimisticData.put(getKey("stagedUploadsCreate"), arg);
            return this;
        }

        /**
        * Activates the specified standard metafield definition from its template.
        * Refer to the [list of standard metafield definition
        * templates](https://shopify.dev/apps/metafields/definitions/standard-definitions).
        */

        public StandardMetafieldDefinitionEnablePayload getStandardMetafieldDefinitionEnable() {
            return (StandardMetafieldDefinitionEnablePayload) get("standardMetafieldDefinitionEnable");
        }

        public Mutation setStandardMetafieldDefinitionEnable(StandardMetafieldDefinitionEnablePayload arg) {
            optimisticData.put(getKey("standardMetafieldDefinitionEnable"), arg);
            return this;
        }

        /**
        * Enables the specified standard metaobject definition from its template.
        */

        public StandardMetaobjectDefinitionEnablePayload getStandardMetaobjectDefinitionEnable() {
            return (StandardMetaobjectDefinitionEnablePayload) get("standardMetaobjectDefinitionEnable");
        }

        public Mutation setStandardMetaobjectDefinitionEnable(StandardMetaobjectDefinitionEnablePayload arg) {
            optimisticData.put(getKey("standardMetaobjectDefinitionEnable"), arg);
            return this;
        }

        /**
        * Creates a credit transaction that increases the store credit account balance by the given amount.
        * This operation will create an account if one does not already exist.
        * A store credit account owner can hold multiple accounts each with a different currency.
        * Use the most appropriate currency for the given store credit account owner.
        */

        public StoreCreditAccountCreditPayload getStoreCreditAccountCredit() {
            return (StoreCreditAccountCreditPayload) get("storeCreditAccountCredit");
        }

        public Mutation setStoreCreditAccountCredit(StoreCreditAccountCreditPayload arg) {
            optimisticData.put(getKey("storeCreditAccountCredit"), arg);
            return this;
        }

        /**
        * Creates a debit transaction that decreases the store credit account balance by the given amount.
        */

        public StoreCreditAccountDebitPayload getStoreCreditAccountDebit() {
            return (StoreCreditAccountDebitPayload) get("storeCreditAccountDebit");
        }

        public Mutation setStoreCreditAccountDebit(StoreCreditAccountDebitPayload arg) {
            optimisticData.put(getKey("storeCreditAccountDebit"), arg);
            return this;
        }

        /**
        * Creates a storefront access token for use with the [Storefront
        * API](https://shopify.dev/docs/api/storefront).
        * An app can have a maximum of 100 active storefront access tokens for each shop.
        * [Get started with the Storefront
        * API](https://shopify.dev/docs/storefronts/headless/building-with-the-storefront-api/getting-started)
        * .
        */

        public StorefrontAccessTokenCreatePayload getStorefrontAccessTokenCreate() {
            return (StorefrontAccessTokenCreatePayload) get("storefrontAccessTokenCreate");
        }

        public Mutation setStorefrontAccessTokenCreate(StorefrontAccessTokenCreatePayload arg) {
            optimisticData.put(getKey("storefrontAccessTokenCreate"), arg);
            return this;
        }

        /**
        * Deletes a storefront access token.
        */

        public StorefrontAccessTokenDeletePayload getStorefrontAccessTokenDelete() {
            return (StorefrontAccessTokenDeletePayload) get("storefrontAccessTokenDelete");
        }

        public Mutation setStorefrontAccessTokenDelete(StorefrontAccessTokenDeletePayload arg) {
            optimisticData.put(getKey("storefrontAccessTokenDelete"), arg);
            return this;
        }

        /**
        * Creates a new subscription billing attempt. For more information, refer to [Create a subscription
        * contract](https://shopify.dev/docs/apps/selling-strategies/subscriptions/contracts/create#step-4-cre
        * ate-a-billing-attempt).
        */

        public SubscriptionBillingAttemptCreatePayload getSubscriptionBillingAttemptCreate() {
            return (SubscriptionBillingAttemptCreatePayload) get("subscriptionBillingAttemptCreate");
        }

        public Mutation setSubscriptionBillingAttemptCreate(SubscriptionBillingAttemptCreatePayload arg) {
            optimisticData.put(getKey("subscriptionBillingAttemptCreate"), arg);
            return this;
        }

        /**
        * Asynchronously queries and charges all subscription billing cycles whose
        * [billingAttemptExpectedDate](https://shopify.dev/api/admin-graphql/latest/objects/SubscriptionBillin
        * gCycle#field-billingattemptexpecteddate) values fall within a specified date range and meet
        * additional filtering criteria. The results of this action can be retrieved using the
        * [subscriptionBillingCycleBulkResults](https://shopify.dev/api/admin-graphql/latest/queries/subscript
        * ionBillingCycleBulkResults) query.
        */

        public SubscriptionBillingCycleBulkChargePayload getSubscriptionBillingCycleBulkCharge() {
            return (SubscriptionBillingCycleBulkChargePayload) get("subscriptionBillingCycleBulkCharge");
        }

        public Mutation setSubscriptionBillingCycleBulkCharge(SubscriptionBillingCycleBulkChargePayload arg) {
            optimisticData.put(getKey("subscriptionBillingCycleBulkCharge"), arg);
            return this;
        }

        /**
        * Asynchronously queries all subscription billing cycles whose
        * [billingAttemptExpectedDate](https://shopify.dev/api/admin-graphql/latest/objects/SubscriptionBillin
        * gCycle#field-billingattemptexpecteddate) values fall within a specified date range and meet
        * additional filtering criteria. The results of this action can be retrieved using the
        * [subscriptionBillingCycleBulkResults](https://shopify.dev/api/admin-graphql/latest/queries/subscript
        * ionBillingCycleBulkResults) query.
        */

        public SubscriptionBillingCycleBulkSearchPayload getSubscriptionBillingCycleBulkSearch() {
            return (SubscriptionBillingCycleBulkSearchPayload) get("subscriptionBillingCycleBulkSearch");
        }

        public Mutation setSubscriptionBillingCycleBulkSearch(SubscriptionBillingCycleBulkSearchPayload arg) {
            optimisticData.put(getKey("subscriptionBillingCycleBulkSearch"), arg);
            return this;
        }

        /**
        * Creates a new subscription billing attempt for a specified billing cycle. This is the alternative
        * mutation for
        * [subscriptionBillingAttemptCreate](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subsc
        * riptionBillingAttemptCreate). For more information, refer to [Create a subscription
        * contract](https://shopify.dev/docs/apps/selling-strategies/subscriptions/contracts/create#step-4-cre
        * ate-a-billing-attempt).
        */

        public SubscriptionBillingCycleChargePayload getSubscriptionBillingCycleCharge() {
            return (SubscriptionBillingCycleChargePayload) get("subscriptionBillingCycleCharge");
        }

        public Mutation setSubscriptionBillingCycleCharge(SubscriptionBillingCycleChargePayload arg) {
            optimisticData.put(getKey("subscriptionBillingCycleCharge"), arg);
            return this;
        }

        /**
        * Commits the updates of a Subscription Billing Cycle Contract draft.
        */

        public SubscriptionBillingCycleContractDraftCommitPayload getSubscriptionBillingCycleContractDraftCommit() {
            return (SubscriptionBillingCycleContractDraftCommitPayload) get("subscriptionBillingCycleContractDraftCommit");
        }

        public Mutation setSubscriptionBillingCycleContractDraftCommit(SubscriptionBillingCycleContractDraftCommitPayload arg) {
            optimisticData.put(getKey("subscriptionBillingCycleContractDraftCommit"), arg);
            return this;
        }

        /**
        * Concatenates a contract to a Subscription Draft.
        */

        public SubscriptionBillingCycleContractDraftConcatenatePayload getSubscriptionBillingCycleContractDraftConcatenate() {
            return (SubscriptionBillingCycleContractDraftConcatenatePayload) get("subscriptionBillingCycleContractDraftConcatenate");
        }

        public Mutation setSubscriptionBillingCycleContractDraftConcatenate(SubscriptionBillingCycleContractDraftConcatenatePayload arg) {
            optimisticData.put(getKey("subscriptionBillingCycleContractDraftConcatenate"), arg);
            return this;
        }

        /**
        * Edit the contents of a subscription contract for the specified billing cycle.
        */

        public SubscriptionBillingCycleContractEditPayload getSubscriptionBillingCycleContractEdit() {
            return (SubscriptionBillingCycleContractEditPayload) get("subscriptionBillingCycleContractEdit");
        }

        public Mutation setSubscriptionBillingCycleContractEdit(SubscriptionBillingCycleContractEditPayload arg) {
            optimisticData.put(getKey("subscriptionBillingCycleContractEdit"), arg);
            return this;
        }

        /**
        * Delete the schedule and contract edits of the selected subscription billing cycle.
        */

        public SubscriptionBillingCycleEditDeletePayload getSubscriptionBillingCycleEditDelete() {
            return (SubscriptionBillingCycleEditDeletePayload) get("subscriptionBillingCycleEditDelete");
        }

        public Mutation setSubscriptionBillingCycleEditDelete(SubscriptionBillingCycleEditDeletePayload arg) {
            optimisticData.put(getKey("subscriptionBillingCycleEditDelete"), arg);
            return this;
        }

        /**
        * Delete the current and future schedule and contract edits of a list of subscription billing cycles.
        */

        public SubscriptionBillingCycleEditsDeletePayload getSubscriptionBillingCycleEditsDelete() {
            return (SubscriptionBillingCycleEditsDeletePayload) get("subscriptionBillingCycleEditsDelete");
        }

        public Mutation setSubscriptionBillingCycleEditsDelete(SubscriptionBillingCycleEditsDeletePayload arg) {
            optimisticData.put(getKey("subscriptionBillingCycleEditsDelete"), arg);
            return this;
        }

        /**
        * Modify the schedule of a specific billing cycle.
        */

        public SubscriptionBillingCycleScheduleEditPayload getSubscriptionBillingCycleScheduleEdit() {
            return (SubscriptionBillingCycleScheduleEditPayload) get("subscriptionBillingCycleScheduleEdit");
        }

        public Mutation setSubscriptionBillingCycleScheduleEdit(SubscriptionBillingCycleScheduleEditPayload arg) {
            optimisticData.put(getKey("subscriptionBillingCycleScheduleEdit"), arg);
            return this;
        }

        /**
        * Skips a Subscription Billing Cycle.
        */

        public SubscriptionBillingCycleSkipPayload getSubscriptionBillingCycleSkip() {
            return (SubscriptionBillingCycleSkipPayload) get("subscriptionBillingCycleSkip");
        }

        public Mutation setSubscriptionBillingCycleSkip(SubscriptionBillingCycleSkipPayload arg) {
            optimisticData.put(getKey("subscriptionBillingCycleSkip"), arg);
            return this;
        }

        /**
        * Unskips a Subscription Billing Cycle.
        */

        public SubscriptionBillingCycleUnskipPayload getSubscriptionBillingCycleUnskip() {
            return (SubscriptionBillingCycleUnskipPayload) get("subscriptionBillingCycleUnskip");
        }

        public Mutation setSubscriptionBillingCycleUnskip(SubscriptionBillingCycleUnskipPayload arg) {
            optimisticData.put(getKey("subscriptionBillingCycleUnskip"), arg);
            return this;
        }

        /**
        * Activates a Subscription Contract. Contract status must be either active, paused, or failed.
        */

        public SubscriptionContractActivatePayload getSubscriptionContractActivate() {
            return (SubscriptionContractActivatePayload) get("subscriptionContractActivate");
        }

        public Mutation setSubscriptionContractActivate(SubscriptionContractActivatePayload arg) {
            optimisticData.put(getKey("subscriptionContractActivate"), arg);
            return this;
        }

        /**
        * Creates a Subscription Contract.
        */

        public SubscriptionContractAtomicCreatePayload getSubscriptionContractAtomicCreate() {
            return (SubscriptionContractAtomicCreatePayload) get("subscriptionContractAtomicCreate");
        }

        public Mutation setSubscriptionContractAtomicCreate(SubscriptionContractAtomicCreatePayload arg) {
            optimisticData.put(getKey("subscriptionContractAtomicCreate"), arg);
            return this;
        }

        /**
        * Cancels a Subscription Contract.
        */

        public SubscriptionContractCancelPayload getSubscriptionContractCancel() {
            return (SubscriptionContractCancelPayload) get("subscriptionContractCancel");
        }

        public Mutation setSubscriptionContractCancel(SubscriptionContractCancelPayload arg) {
            optimisticData.put(getKey("subscriptionContractCancel"), arg);
            return this;
        }

        /**
        * Creates a Subscription Contract Draft.
        * You can submit all the desired information for the draft using [Subscription Draft Input
        * object](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/SubscriptionDraftInput).
        * You can also update the draft using the [Subscription Contract
        * Update](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subscriptionContractUpdate)
        * mutation.
        * The draft is not saved until you call the [Subscription Draft
        * Commit](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subscriptionDraftCommit)
        * mutation.
        */

        public SubscriptionContractCreatePayload getSubscriptionContractCreate() {
            return (SubscriptionContractCreatePayload) get("subscriptionContractCreate");
        }

        public Mutation setSubscriptionContractCreate(SubscriptionContractCreatePayload arg) {
            optimisticData.put(getKey("subscriptionContractCreate"), arg);
            return this;
        }

        /**
        * Expires a Subscription Contract.
        */

        public SubscriptionContractExpirePayload getSubscriptionContractExpire() {
            return (SubscriptionContractExpirePayload) get("subscriptionContractExpire");
        }

        public Mutation setSubscriptionContractExpire(SubscriptionContractExpirePayload arg) {
            optimisticData.put(getKey("subscriptionContractExpire"), arg);
            return this;
        }

        /**
        * Fails a Subscription Contract.
        */

        public SubscriptionContractFailPayload getSubscriptionContractFail() {
            return (SubscriptionContractFailPayload) get("subscriptionContractFail");
        }

        public Mutation setSubscriptionContractFail(SubscriptionContractFailPayload arg) {
            optimisticData.put(getKey("subscriptionContractFail"), arg);
            return this;
        }

        /**
        * Pauses a Subscription Contract.
        */

        public SubscriptionContractPausePayload getSubscriptionContractPause() {
            return (SubscriptionContractPausePayload) get("subscriptionContractPause");
        }

        public Mutation setSubscriptionContractPause(SubscriptionContractPausePayload arg) {
            optimisticData.put(getKey("subscriptionContractPause"), arg);
            return this;
        }

        /**
        * Allows for the easy change of a Product in a Contract or a Product price change.
        */

        public SubscriptionContractProductChangePayload getSubscriptionContractProductChange() {
            return (SubscriptionContractProductChangePayload) get("subscriptionContractProductChange");
        }

        public Mutation setSubscriptionContractProductChange(SubscriptionContractProductChangePayload arg) {
            optimisticData.put(getKey("subscriptionContractProductChange"), arg);
            return this;
        }

        /**
        * Sets the next billing date of a Subscription Contract. This field is managed by the apps.
        * Alternatively you can utilize our
        * [Billing Cycles
        * APIs](https://shopify.dev/docs/apps/selling-strategies/subscriptions/billing-cycles),
        * which provide auto-computed billing dates and additional functionalities.
        */

        public SubscriptionContractSetNextBillingDatePayload getSubscriptionContractSetNextBillingDate() {
            return (SubscriptionContractSetNextBillingDatePayload) get("subscriptionContractSetNextBillingDate");
        }

        public Mutation setSubscriptionContractSetNextBillingDate(SubscriptionContractSetNextBillingDatePayload arg) {
            optimisticData.put(getKey("subscriptionContractSetNextBillingDate"), arg);
            return this;
        }

        /**
        * The subscriptionContractUpdate mutation allows you to create a draft of an existing subscription
        * contract. This [draft](https://shopify.dev/api/admin-graphql/latest/objects/SubscriptionDraft) can
        * be reviewed and modified as needed. Once the draft is committed with
        * [subscriptionDraftCommit](https://shopify.dev/api/admin-graphql/latest/mutations/subscriptionDraftCo
        * mmit), the changes are applied to the original subscription contract.
        */

        public SubscriptionContractUpdatePayload getSubscriptionContractUpdate() {
            return (SubscriptionContractUpdatePayload) get("subscriptionContractUpdate");
        }

        public Mutation setSubscriptionContractUpdate(SubscriptionContractUpdatePayload arg) {
            optimisticData.put(getKey("subscriptionContractUpdate"), arg);
            return this;
        }

        /**
        * Commits the updates of a Subscription Contract draft.
        */

        public SubscriptionDraftCommitPayload getSubscriptionDraftCommit() {
            return (SubscriptionDraftCommitPayload) get("subscriptionDraftCommit");
        }

        public Mutation setSubscriptionDraftCommit(SubscriptionDraftCommitPayload arg) {
            optimisticData.put(getKey("subscriptionDraftCommit"), arg);
            return this;
        }

        /**
        * Adds a subscription discount to a subscription draft.
        */

        public SubscriptionDraftDiscountAddPayload getSubscriptionDraftDiscountAdd() {
            return (SubscriptionDraftDiscountAddPayload) get("subscriptionDraftDiscountAdd");
        }

        public Mutation setSubscriptionDraftDiscountAdd(SubscriptionDraftDiscountAddPayload arg) {
            optimisticData.put(getKey("subscriptionDraftDiscountAdd"), arg);
            return this;
        }

        /**
        * Applies a code discount on the subscription draft.
        */

        public SubscriptionDraftDiscountCodeApplyPayload getSubscriptionDraftDiscountCodeApply() {
            return (SubscriptionDraftDiscountCodeApplyPayload) get("subscriptionDraftDiscountCodeApply");
        }

        public Mutation setSubscriptionDraftDiscountCodeApply(SubscriptionDraftDiscountCodeApplyPayload arg) {
            optimisticData.put(getKey("subscriptionDraftDiscountCodeApply"), arg);
            return this;
        }

        /**
        * Removes a subscription discount from a subscription draft.
        */

        public SubscriptionDraftDiscountRemovePayload getSubscriptionDraftDiscountRemove() {
            return (SubscriptionDraftDiscountRemovePayload) get("subscriptionDraftDiscountRemove");
        }

        public Mutation setSubscriptionDraftDiscountRemove(SubscriptionDraftDiscountRemovePayload arg) {
            optimisticData.put(getKey("subscriptionDraftDiscountRemove"), arg);
            return this;
        }

        /**
        * Updates a subscription discount on a subscription draft.
        */

        public SubscriptionDraftDiscountUpdatePayload getSubscriptionDraftDiscountUpdate() {
            return (SubscriptionDraftDiscountUpdatePayload) get("subscriptionDraftDiscountUpdate");
        }

        public Mutation setSubscriptionDraftDiscountUpdate(SubscriptionDraftDiscountUpdatePayload arg) {
            optimisticData.put(getKey("subscriptionDraftDiscountUpdate"), arg);
            return this;
        }

        /**
        * Adds a subscription free shipping discount to a subscription draft.
        */

        public SubscriptionDraftFreeShippingDiscountAddPayload getSubscriptionDraftFreeShippingDiscountAdd() {
            return (SubscriptionDraftFreeShippingDiscountAddPayload) get("subscriptionDraftFreeShippingDiscountAdd");
        }

        public Mutation setSubscriptionDraftFreeShippingDiscountAdd(SubscriptionDraftFreeShippingDiscountAddPayload arg) {
            optimisticData.put(getKey("subscriptionDraftFreeShippingDiscountAdd"), arg);
            return this;
        }

        /**
        * Updates a subscription free shipping discount on a subscription draft.
        */

        public SubscriptionDraftFreeShippingDiscountUpdatePayload getSubscriptionDraftFreeShippingDiscountUpdate() {
            return (SubscriptionDraftFreeShippingDiscountUpdatePayload) get("subscriptionDraftFreeShippingDiscountUpdate");
        }

        public Mutation setSubscriptionDraftFreeShippingDiscountUpdate(SubscriptionDraftFreeShippingDiscountUpdatePayload arg) {
            optimisticData.put(getKey("subscriptionDraftFreeShippingDiscountUpdate"), arg);
            return this;
        }

        /**
        * Adds a subscription line to a subscription draft.
        */

        public SubscriptionDraftLineAddPayload getSubscriptionDraftLineAdd() {
            return (SubscriptionDraftLineAddPayload) get("subscriptionDraftLineAdd");
        }

        public Mutation setSubscriptionDraftLineAdd(SubscriptionDraftLineAddPayload arg) {
            optimisticData.put(getKey("subscriptionDraftLineAdd"), arg);
            return this;
        }

        /**
        * Removes a subscription line from a subscription draft.
        */

        public SubscriptionDraftLineRemovePayload getSubscriptionDraftLineRemove() {
            return (SubscriptionDraftLineRemovePayload) get("subscriptionDraftLineRemove");
        }

        public Mutation setSubscriptionDraftLineRemove(SubscriptionDraftLineRemovePayload arg) {
            optimisticData.put(getKey("subscriptionDraftLineRemove"), arg);
            return this;
        }

        /**
        * Updates a subscription line on a subscription draft.
        */

        public SubscriptionDraftLineUpdatePayload getSubscriptionDraftLineUpdate() {
            return (SubscriptionDraftLineUpdatePayload) get("subscriptionDraftLineUpdate");
        }

        public Mutation setSubscriptionDraftLineUpdate(SubscriptionDraftLineUpdatePayload arg) {
            optimisticData.put(getKey("subscriptionDraftLineUpdate"), arg);
            return this;
        }

        /**
        * Updates a Subscription Draft.
        */

        public SubscriptionDraftUpdatePayload getSubscriptionDraftUpdate() {
            return (SubscriptionDraftUpdatePayload) get("subscriptionDraftUpdate");
        }

        public Mutation setSubscriptionDraftUpdate(SubscriptionDraftUpdatePayload arg) {
            optimisticData.put(getKey("subscriptionDraftUpdate"), arg);
            return this;
        }

        /**
        * Add tags to an order, a draft order, a customer, a product, or an online store article.
        */

        public TagsAddPayload getTagsAdd() {
            return (TagsAddPayload) get("tagsAdd");
        }

        public Mutation setTagsAdd(TagsAddPayload arg) {
            optimisticData.put(getKey("tagsAdd"), arg);
            return this;
        }

        /**
        * Remove tags from an order, a draft order, a customer, a product, or an online store article.
        */

        public TagsRemovePayload getTagsRemove() {
            return (TagsRemovePayload) get("tagsRemove");
        }

        public Mutation setTagsRemove(TagsRemovePayload arg) {
            optimisticData.put(getKey("tagsRemove"), arg);
            return this;
        }

        /**
        * Allows tax app configurations for tax partners.
        */

        public TaxAppConfigurePayload getTaxAppConfigure() {
            return (TaxAppConfigurePayload) get("taxAppConfigure");
        }

        public Mutation setTaxAppConfigure(TaxAppConfigurePayload arg) {
            optimisticData.put(getKey("taxAppConfigure"), arg);
            return this;
        }

        /**
        * Creates a theme using an external URL or for files that were previously uploaded using the
        * [stagedUploadsCreate
        * mutation](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
        * These themes are added to the [Themes page](https://admin.shopify.com/themes) in Shopify admin.
        */

        public ThemeCreatePayload getThemeCreate() {
            return (ThemeCreatePayload) get("themeCreate");
        }

        public Mutation setThemeCreate(ThemeCreatePayload arg) {
            optimisticData.put(getKey("themeCreate"), arg);
            return this;
        }

        /**
        * Deletes a theme.
        */

        public ThemeDeletePayload getThemeDelete() {
            return (ThemeDeletePayload) get("themeDelete");
        }

        public Mutation setThemeDelete(ThemeDeletePayload arg) {
            optimisticData.put(getKey("themeDelete"), arg);
            return this;
        }

        /**
        * Copy theme files. Copying to existing theme files will overwrite them.
        */

        public ThemeFilesCopyPayload getThemeFilesCopy() {
            return (ThemeFilesCopyPayload) get("themeFilesCopy");
        }

        public Mutation setThemeFilesCopy(ThemeFilesCopyPayload arg) {
            optimisticData.put(getKey("themeFilesCopy"), arg);
            return this;
        }

        /**
        * Deletes a theme's files.
        */

        public ThemeFilesDeletePayload getThemeFilesDelete() {
            return (ThemeFilesDeletePayload) get("themeFilesDelete");
        }

        public Mutation setThemeFilesDelete(ThemeFilesDeletePayload arg) {
            optimisticData.put(getKey("themeFilesDelete"), arg);
            return this;
        }

        /**
        * Create or update theme files.
        */

        public ThemeFilesUpsertPayload getThemeFilesUpsert() {
            return (ThemeFilesUpsertPayload) get("themeFilesUpsert");
        }

        public Mutation setThemeFilesUpsert(ThemeFilesUpsertPayload arg) {
            optimisticData.put(getKey("themeFilesUpsert"), arg);
            return this;
        }

        /**
        * Publishes a theme.
        */

        public ThemePublishPayload getThemePublish() {
            return (ThemePublishPayload) get("themePublish");
        }

        public Mutation setThemePublish(ThemePublishPayload arg) {
            optimisticData.put(getKey("themePublish"), arg);
            return this;
        }

        /**
        * Updates a theme.
        */

        public ThemeUpdatePayload getThemeUpdate() {
            return (ThemeUpdatePayload) get("themeUpdate");
        }

        public Mutation setThemeUpdate(ThemeUpdatePayload arg) {
            optimisticData.put(getKey("themeUpdate"), arg);
            return this;
        }

        /**
        * Trigger the voiding of an uncaptured authorization transaction.
        */

        public TransactionVoidPayload getTransactionVoid() {
            return (TransactionVoidPayload) get("transactionVoid");
        }

        public Mutation setTransactionVoid(TransactionVoidPayload arg) {
            optimisticData.put(getKey("transactionVoid"), arg);
            return this;
        }

        /**
        * Creates or updates translations.
        */

        public TranslationsRegisterPayload getTranslationsRegister() {
            return (TranslationsRegisterPayload) get("translationsRegister");
        }

        public Mutation setTranslationsRegister(TranslationsRegisterPayload arg) {
            optimisticData.put(getKey("translationsRegister"), arg);
            return this;
        }

        /**
        * Deletes translations.
        */

        public TranslationsRemovePayload getTranslationsRemove() {
            return (TranslationsRemovePayload) get("translationsRemove");
        }

        public Mutation setTranslationsRemove(TranslationsRemovePayload arg) {
            optimisticData.put(getKey("translationsRemove"), arg);
            return this;
        }

        /**
        * Asynchronously delete [URL
        * redirects](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirect) in bulk.
        */

        public UrlRedirectBulkDeleteAllPayload getUrlRedirectBulkDeleteAll() {
            return (UrlRedirectBulkDeleteAllPayload) get("urlRedirectBulkDeleteAll");
        }

        public Mutation setUrlRedirectBulkDeleteAll(UrlRedirectBulkDeleteAllPayload arg) {
            optimisticData.put(getKey("urlRedirectBulkDeleteAll"), arg);
            return this;
        }

        /**
        * Asynchronously delete
        * [URLRedirect](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirect) 
        * objects in bulk by IDs.
        * Learn more about
        * [URLRedirect](https://help.shopify.com/en/manual/online-store/menus-and-links/url-redirect) 
        * objects.
        */

        public UrlRedirectBulkDeleteByIdsPayload getUrlRedirectBulkDeleteByIds() {
            return (UrlRedirectBulkDeleteByIdsPayload) get("urlRedirectBulkDeleteByIds");
        }

        public Mutation setUrlRedirectBulkDeleteByIds(UrlRedirectBulkDeleteByIdsPayload arg) {
            optimisticData.put(getKey("urlRedirectBulkDeleteByIds"), arg);
            return this;
        }

        /**
        * Asynchronously delete redirects in bulk.
        */

        public UrlRedirectBulkDeleteBySavedSearchPayload getUrlRedirectBulkDeleteBySavedSearch() {
            return (UrlRedirectBulkDeleteBySavedSearchPayload) get("urlRedirectBulkDeleteBySavedSearch");
        }

        public Mutation setUrlRedirectBulkDeleteBySavedSearch(UrlRedirectBulkDeleteBySavedSearchPayload arg) {
            optimisticData.put(getKey("urlRedirectBulkDeleteBySavedSearch"), arg);
            return this;
        }

        /**
        * Asynchronously delete redirects in bulk.
        */

        public UrlRedirectBulkDeleteBySearchPayload getUrlRedirectBulkDeleteBySearch() {
            return (UrlRedirectBulkDeleteBySearchPayload) get("urlRedirectBulkDeleteBySearch");
        }

        public Mutation setUrlRedirectBulkDeleteBySearch(UrlRedirectBulkDeleteBySearchPayload arg) {
            optimisticData.put(getKey("urlRedirectBulkDeleteBySearch"), arg);
            return this;
        }

        /**
        * Creates a [`UrlRedirect`](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirect) object.
        */

        public UrlRedirectCreatePayload getUrlRedirectCreate() {
            return (UrlRedirectCreatePayload) get("urlRedirectCreate");
        }

        public Mutation setUrlRedirectCreate(UrlRedirectCreatePayload arg) {
            optimisticData.put(getKey("urlRedirectCreate"), arg);
            return this;
        }

        /**
        * Deletes a [`UrlRedirect`](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirect) object.
        */

        public UrlRedirectDeletePayload getUrlRedirectDelete() {
            return (UrlRedirectDeletePayload) get("urlRedirectDelete");
        }

        public Mutation setUrlRedirectDelete(UrlRedirectDeletePayload arg) {
            optimisticData.put(getKey("urlRedirectDelete"), arg);
            return this;
        }

        /**
        * Creates a
        * [`UrlRedirectImport`](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirectImport)
        * object.
        * After creating the `UrlRedirectImport` object, the `UrlRedirectImport` request can be performed
        * using the
        * [`urlRedirectImportSubmit`](https://shopify.dev/api/admin-graphql/latest/mutations/urlRedirectImport
        * Submit) mutation.
        */

        public UrlRedirectImportCreatePayload getUrlRedirectImportCreate() {
            return (UrlRedirectImportCreatePayload) get("urlRedirectImportCreate");
        }

        public Mutation setUrlRedirectImportCreate(UrlRedirectImportCreatePayload arg) {
            optimisticData.put(getKey("urlRedirectImportCreate"), arg);
            return this;
        }

        /**
        * Submits a `UrlRedirectImport` request to be processed.
        * The `UrlRedirectImport` request is first created with the
        * [`urlRedirectImportCreate`](https://shopify.dev/api/admin-graphql/latest/mutations/urlRedirectImport
        * Create) mutation.
        */

        public UrlRedirectImportSubmitPayload getUrlRedirectImportSubmit() {
            return (UrlRedirectImportSubmitPayload) get("urlRedirectImportSubmit");
        }

        public Mutation setUrlRedirectImportSubmit(UrlRedirectImportSubmitPayload arg) {
            optimisticData.put(getKey("urlRedirectImportSubmit"), arg);
            return this;
        }

        /**
        * Updates a URL redirect.
        */

        public UrlRedirectUpdatePayload getUrlRedirectUpdate() {
            return (UrlRedirectUpdatePayload) get("urlRedirectUpdate");
        }

        public Mutation setUrlRedirectUpdate(UrlRedirectUpdatePayload arg) {
            optimisticData.put(getKey("urlRedirectUpdate"), arg);
            return this;
        }

        /**
        * Creates a validation.
        */

        public ValidationCreatePayload getValidationCreate() {
            return (ValidationCreatePayload) get("validationCreate");
        }

        public Mutation setValidationCreate(ValidationCreatePayload arg) {
            optimisticData.put(getKey("validationCreate"), arg);
            return this;
        }

        /**
        * Deletes a validation.
        */

        public ValidationDeletePayload getValidationDelete() {
            return (ValidationDeletePayload) get("validationDelete");
        }

        public Mutation setValidationDelete(ValidationDeletePayload arg) {
            optimisticData.put(getKey("validationDelete"), arg);
            return this;
        }

        /**
        * Update a validation.
        */

        public ValidationUpdatePayload getValidationUpdate() {
            return (ValidationUpdatePayload) get("validationUpdate");
        }

        public Mutation setValidationUpdate(ValidationUpdatePayload arg) {
            optimisticData.put(getKey("validationUpdate"), arg);
            return this;
        }

        /**
        * Activate a [web pixel
        * extension](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels)
        * by creating a web pixel record on the store where you installed your app.
        * When you run the `webPixelCreate` mutation, Shopify validates it
        * against the settings definition in `shopify.extension.toml`. If the `settings` input field doesn't
        * match
        * the schema that you defined, then the mutation fails. Learn how to
        * define [web pixel
        * settings](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels#step-2-define-you
        * r-web-pixel-settings).
        */

        public WebPixelCreatePayload getWebPixelCreate() {
            return (WebPixelCreatePayload) get("webPixelCreate");
        }

        public Mutation setWebPixelCreate(WebPixelCreatePayload arg) {
            optimisticData.put(getKey("webPixelCreate"), arg);
            return this;
        }

        /**
        * Deletes the web pixel shop settings.
        */

        public WebPixelDeletePayload getWebPixelDelete() {
            return (WebPixelDeletePayload) get("webPixelDelete");
        }

        public Mutation setWebPixelDelete(WebPixelDeletePayload arg) {
            optimisticData.put(getKey("webPixelDelete"), arg);
            return this;
        }

        /**
        * Activate a [web pixel
        * extension](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels)
        * by updating a web pixel record on the store where you installed your app.
        * When you run the `webPixelUpdate` mutation, Shopify validates it
        * against the settings definition in `shopify.extension.toml`. If the `settings` input field doesn't
        * match
        * the schema that you defined, then the mutation fails. Learn how to
        * define [web pixel
        * settings](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels#step-2-define-you
        * r-web-pixel-settings).
        */

        public WebPixelUpdatePayload getWebPixelUpdate() {
            return (WebPixelUpdatePayload) get("webPixelUpdate");
        }

        public Mutation setWebPixelUpdate(WebPixelUpdatePayload arg) {
            optimisticData.put(getKey("webPixelUpdate"), arg);
            return this;
        }

        /**
        * Creates a new webhook subscription.
        * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
        * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
        * date by Shopify & require less maintenance. Please read [About managing webhook
        * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
        */

        public WebhookSubscriptionCreatePayload getWebhookSubscriptionCreate() {
            return (WebhookSubscriptionCreatePayload) get("webhookSubscriptionCreate");
        }

        public Mutation setWebhookSubscriptionCreate(WebhookSubscriptionCreatePayload arg) {
            optimisticData.put(getKey("webhookSubscriptionCreate"), arg);
            return this;
        }

        /**
        * Deletes a webhook subscription.
        * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
        * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
        * date by Shopify & require less maintenance. Please read [About managing webhook
        * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
        */

        public WebhookSubscriptionDeletePayload getWebhookSubscriptionDelete() {
            return (WebhookSubscriptionDeletePayload) get("webhookSubscriptionDelete");
        }

        public Mutation setWebhookSubscriptionDelete(WebhookSubscriptionDeletePayload arg) {
            optimisticData.put(getKey("webhookSubscriptionDelete"), arg);
            return this;
        }

        /**
        * Updates a webhook subscription.
        * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
        * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
        * date by Shopify & require less maintenance. Please read [About managing webhook
        * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
        */

        public WebhookSubscriptionUpdatePayload getWebhookSubscriptionUpdate() {
            return (WebhookSubscriptionUpdatePayload) get("webhookSubscriptionUpdate");
        }

        public Mutation setWebhookSubscriptionUpdate(WebhookSubscriptionUpdatePayload arg) {
            optimisticData.put(getKey("webhookSubscriptionUpdate"), arg);
            return this;
        }

        public boolean unwrapsToObject(String key) {
            switch (getFieldName(key)) {
                case "abandonmentUpdateActivitiesDeliveryStatuses": return true;

                case "appPurchaseOneTimeCreate": return true;

                case "appRevokeAccessScopes": return true;

                case "appSubscriptionCancel": return true;

                case "appSubscriptionCreate": return true;

                case "appSubscriptionLineItemUpdate": return true;

                case "appSubscriptionTrialExtend": return true;

                case "appUsageRecordCreate": return true;

                case "articleCreate": return true;

                case "articleDelete": return true;

                case "articleUpdate": return true;

                case "blogCreate": return true;

                case "blogDelete": return true;

                case "blogUpdate": return true;

                case "bulkOperationCancel": return true;

                case "bulkOperationRunMutation": return true;

                case "bulkOperationRunQuery": return true;

                case "bulkProductResourceFeedbackCreate": return true;

                case "carrierServiceCreate": return true;

                case "carrierServiceDelete": return true;

                case "carrierServiceUpdate": return true;

                case "cartTransformCreate": return true;

                case "cartTransformDelete": return true;

                case "catalogContextUpdate": return true;

                case "catalogCreate": return true;

                case "catalogDelete": return true;

                case "catalogUpdate": return true;

                case "checkoutBrandingUpsert": return true;

                case "collectionAddProducts": return true;

                case "collectionAddProductsV2": return true;

                case "collectionCreate": return true;

                case "collectionDelete": return true;

                case "collectionRemoveProducts": return true;

                case "collectionReorderProducts": return true;

                case "collectionUpdate": return true;

                case "combinedListingUpdate": return true;

                case "commentApprove": return true;

                case "commentDelete": return true;

                case "commentNotSpam": return true;

                case "commentSpam": return true;

                case "companiesDelete": return true;

                case "companyAddressDelete": return true;

                case "companyAssignCustomerAsContact": return true;

                case "companyAssignMainContact": return true;

                case "companyContactAssignRole": return true;

                case "companyContactAssignRoles": return true;

                case "companyContactCreate": return true;

                case "companyContactDelete": return true;

                case "companyContactRemoveFromCompany": return true;

                case "companyContactRevokeRole": return true;

                case "companyContactRevokeRoles": return true;

                case "companyContactSendWelcomeEmail": return true;

                case "companyContactUpdate": return true;

                case "companyContactsDelete": return true;

                case "companyCreate": return true;

                case "companyDelete": return true;

                case "companyLocationAssignAddress": return true;

                case "companyLocationAssignRoles": return true;

                case "companyLocationAssignStaffMembers": return true;

                case "companyLocationCreate": return true;

                case "companyLocationDelete": return true;

                case "companyLocationRemoveStaffMembers": return true;

                case "companyLocationRevokeRoles": return true;

                case "companyLocationTaxSettingsUpdate": return true;

                case "companyLocationUpdate": return true;

                case "companyLocationsDelete": return true;

                case "companyRevokeMainContact": return true;

                case "companyUpdate": return true;

                case "customerAddTaxExemptions": return true;

                case "customerCancelDataErasure": return true;

                case "customerCreate": return true;

                case "customerDelete": return true;

                case "customerEmailMarketingConsentUpdate": return true;

                case "customerGenerateAccountActivationUrl": return true;

                case "customerMerge": return true;

                case "customerPaymentMethodCreateFromDuplicationData": return true;

                case "customerPaymentMethodCreditCardCreate": return true;

                case "customerPaymentMethodCreditCardUpdate": return true;

                case "customerPaymentMethodGetDuplicationData": return true;

                case "customerPaymentMethodGetUpdateUrl": return true;

                case "customerPaymentMethodPaypalBillingAgreementCreate": return true;

                case "customerPaymentMethodPaypalBillingAgreementUpdate": return true;

                case "customerPaymentMethodRemoteCreate": return true;

                case "customerPaymentMethodRevoke": return true;

                case "customerPaymentMethodSendUpdateEmail": return true;

                case "customerRemoveTaxExemptions": return true;

                case "customerReplaceTaxExemptions": return true;

                case "customerRequestDataErasure": return true;

                case "customerSegmentMembersQueryCreate": return true;

                case "customerSendAccountInviteEmail": return true;

                case "customerSmsMarketingConsentUpdate": return true;

                case "customerUpdate": return true;

                case "customerUpdateDefaultAddress": return true;

                case "dataSaleOptOut": return true;

                case "delegateAccessTokenCreate": return true;

                case "delegateAccessTokenDestroy": return true;

                case "deliveryCustomizationActivation": return true;

                case "deliveryCustomizationCreate": return true;

                case "deliveryCustomizationDelete": return true;

                case "deliveryCustomizationUpdate": return true;

                case "deliveryProfileCreate": return true;

                case "deliveryProfileRemove": return true;

                case "deliveryProfileUpdate": return true;

                case "deliveryPromiseParticipantsUpdate": return true;

                case "deliveryPromiseProviderUpsert": return true;

                case "deliverySettingUpdate": return true;

                case "deliveryShippingOriginAssign": return true;

                case "discountAutomaticActivate": return true;

                case "discountAutomaticAppCreate": return true;

                case "discountAutomaticAppUpdate": return true;

                case "discountAutomaticBasicCreate": return true;

                case "discountAutomaticBasicUpdate": return true;

                case "discountAutomaticBulkDelete": return true;

                case "discountAutomaticBxgyCreate": return true;

                case "discountAutomaticBxgyUpdate": return true;

                case "discountAutomaticDeactivate": return true;

                case "discountAutomaticDelete": return true;

                case "discountAutomaticFreeShippingCreate": return true;

                case "discountAutomaticFreeShippingUpdate": return true;

                case "discountCodeActivate": return true;

                case "discountCodeAppCreate": return true;

                case "discountCodeAppUpdate": return true;

                case "discountCodeBasicCreate": return true;

                case "discountCodeBasicUpdate": return true;

                case "discountCodeBulkActivate": return true;

                case "discountCodeBulkDeactivate": return true;

                case "discountCodeBulkDelete": return true;

                case "discountCodeBxgyCreate": return true;

                case "discountCodeBxgyUpdate": return true;

                case "discountCodeDeactivate": return true;

                case "discountCodeDelete": return true;

                case "discountCodeFreeShippingCreate": return true;

                case "discountCodeFreeShippingUpdate": return true;

                case "discountCodeRedeemCodeBulkDelete": return true;

                case "discountRedeemCodeBulkAdd": return true;

                case "disputeEvidenceUpdate": return true;

                case "draftOrderBulkAddTags": return true;

                case "draftOrderBulkDelete": return true;

                case "draftOrderBulkRemoveTags": return true;

                case "draftOrderCalculate": return true;

                case "draftOrderComplete": return true;

                case "draftOrderCreate": return true;

                case "draftOrderCreateFromOrder": return true;

                case "draftOrderCreateMerchantCheckout": return true;

                case "draftOrderDelete": return true;

                case "draftOrderDuplicate": return true;

                case "draftOrderInvoicePreview": return true;

                case "draftOrderInvoiceSend": return true;

                case "draftOrderUpdate": return true;

                case "eventBridgeServerPixelUpdate": return true;

                case "eventBridgeWebhookSubscriptionCreate": return true;

                case "eventBridgeWebhookSubscriptionUpdate": return true;

                case "fileAcknowledgeUpdateFailed": return true;

                case "fileCreate": return true;

                case "fileDelete": return true;

                case "fileUpdate": return true;

                case "flowGenerateSignature": return true;

                case "flowTriggerReceive": return true;

                case "fulfillmentCancel": return true;

                case "fulfillmentConstraintRuleCreate": return true;

                case "fulfillmentConstraintRuleDelete": return true;

                case "fulfillmentConstraintRuleUpdate": return true;

                case "fulfillmentCreate": return true;

                case "fulfillmentEventCreate": return true;

                case "fulfillmentOrderAcceptCancellationRequest": return true;

                case "fulfillmentOrderAcceptFulfillmentRequest": return true;

                case "fulfillmentOrderCancel": return true;

                case "fulfillmentOrderClose": return true;

                case "fulfillmentOrderHold": return true;

                case "fulfillmentOrderLineItemsPreparedForPickup": return true;

                case "fulfillmentOrderMerge": return true;

                case "fulfillmentOrderMove": return true;

                case "fulfillmentOrderOpen": return true;

                case "fulfillmentOrderRejectCancellationRequest": return true;

                case "fulfillmentOrderRejectFulfillmentRequest": return true;

                case "fulfillmentOrderReleaseHold": return true;

                case "fulfillmentOrderReschedule": return true;

                case "fulfillmentOrderSplit": return true;

                case "fulfillmentOrderSubmitCancellationRequest": return true;

                case "fulfillmentOrderSubmitFulfillmentRequest": return true;

                case "fulfillmentOrdersSetFulfillmentDeadline": return true;

                case "fulfillmentServiceCreate": return true;

                case "fulfillmentServiceDelete": return true;

                case "fulfillmentServiceUpdate": return true;

                case "fulfillmentTrackingInfoUpdate": return true;

                case "giftCardCreate": return true;

                case "giftCardCredit": return true;

                case "giftCardDeactivate": return true;

                case "giftCardDebit": return true;

                case "giftCardSendNotificationToCustomer": return true;

                case "giftCardSendNotificationToRecipient": return true;

                case "giftCardUpdate": return true;

                case "inventoryActivate": return true;

                case "inventoryAdjustQuantities": return true;

                case "inventoryBulkToggleActivation": return true;

                case "inventoryDeactivate": return true;

                case "inventoryItemUpdate": return true;

                case "inventoryMoveQuantities": return true;

                case "inventorySetQuantities": return true;

                case "inventorySetScheduledChanges": return true;

                case "locationActivate": return true;

                case "locationAdd": return true;

                case "locationDeactivate": return true;

                case "locationDelete": return true;

                case "locationEdit": return true;

                case "locationLocalPickupDisable": return true;

                case "locationLocalPickupEnable": return true;

                case "marketCreate": return true;

                case "marketCurrencySettingsUpdate": return true;

                case "marketDelete": return true;

                case "marketLocalizationsRegister": return true;

                case "marketLocalizationsRemove": return true;

                case "marketUpdate": return true;

                case "marketingActivitiesDeleteAllExternal": return true;

                case "marketingActivityCreate": return true;

                case "marketingActivityCreateExternal": return true;

                case "marketingActivityDeleteExternal": return true;

                case "marketingActivityUpdate": return true;

                case "marketingActivityUpdateExternal": return true;

                case "marketingActivityUpsertExternal": return true;

                case "marketingEngagementCreate": return true;

                case "marketingEngagementsDelete": return true;

                case "menuCreate": return true;

                case "menuDelete": return true;

                case "menuUpdate": return true;

                case "metafieldDefinitionCreate": return true;

                case "metafieldDefinitionDelete": return true;

                case "metafieldDefinitionPin": return true;

                case "metafieldDefinitionUnpin": return true;

                case "metafieldDefinitionUpdate": return true;

                case "metafieldsDelete": return true;

                case "metafieldsSet": return true;

                case "metaobjectBulkDelete": return true;

                case "metaobjectCreate": return true;

                case "metaobjectDefinitionCreate": return true;

                case "metaobjectDefinitionDelete": return true;

                case "metaobjectDefinitionUpdate": return true;

                case "metaobjectDelete": return true;

                case "metaobjectUpdate": return true;

                case "metaobjectUpsert": return true;

                case "mobilePlatformApplicationCreate": return true;

                case "mobilePlatformApplicationDelete": return true;

                case "mobilePlatformApplicationUpdate": return true;

                case "orderCancel": return true;

                case "orderCapture": return true;

                case "orderClose": return true;

                case "orderCreate": return true;

                case "orderCreateMandatePayment": return true;

                case "orderDelete": return true;

                case "orderEditAddCustomItem": return true;

                case "orderEditAddLineItemDiscount": return true;

                case "orderEditAddShippingLine": return true;

                case "orderEditAddVariant": return true;

                case "orderEditBegin": return true;

                case "orderEditCommit": return true;

                case "orderEditRemoveDiscount": return true;

                case "orderEditRemoveShippingLine": return true;

                case "orderEditSetQuantity": return true;

                case "orderEditUpdateDiscount": return true;

                case "orderEditUpdateShippingLine": return true;

                case "orderInvoiceSend": return true;

                case "orderMarkAsPaid": return true;

                case "orderOpen": return true;

                case "orderRiskAssessmentCreate": return true;

                case "orderUpdate": return true;

                case "pageCreate": return true;

                case "pageDelete": return true;

                case "pageUpdate": return true;

                case "paymentCustomizationActivation": return true;

                case "paymentCustomizationCreate": return true;

                case "paymentCustomizationDelete": return true;

                case "paymentCustomizationUpdate": return true;

                case "paymentReminderSend": return true;

                case "paymentTermsCreate": return true;

                case "paymentTermsDelete": return true;

                case "paymentTermsUpdate": return true;

                case "priceListCreate": return true;

                case "priceListDelete": return true;

                case "priceListFixedPricesAdd": return true;

                case "priceListFixedPricesByProductUpdate": return true;

                case "priceListFixedPricesDelete": return true;

                case "priceListFixedPricesUpdate": return true;

                case "priceListUpdate": return true;

                case "productBundleCreate": return true;

                case "productBundleUpdate": return true;

                case "productCreate": return true;

                case "productDelete": return true;

                case "productDuplicate": return true;

                case "productFeedCreate": return true;

                case "productFeedDelete": return true;

                case "productFullSync": return true;

                case "productJoinSellingPlanGroups": return true;

                case "productLeaveSellingPlanGroups": return true;

                case "productOptionUpdate": return true;

                case "productOptionsCreate": return true;

                case "productOptionsDelete": return true;

                case "productOptionsReorder": return true;

                case "productReorderMedia": return true;

                case "productSet": return true;

                case "productUpdate": return true;

                case "productVariantAppendMedia": return true;

                case "productVariantDetachMedia": return true;

                case "productVariantJoinSellingPlanGroups": return true;

                case "productVariantLeaveSellingPlanGroups": return true;

                case "productVariantRelationshipBulkUpdate": return true;

                case "productVariantsBulkCreate": return true;

                case "productVariantsBulkDelete": return true;

                case "productVariantsBulkReorder": return true;

                case "productVariantsBulkUpdate": return true;

                case "pubSubServerPixelUpdate": return true;

                case "pubSubWebhookSubscriptionCreate": return true;

                case "pubSubWebhookSubscriptionUpdate": return true;

                case "publicationCreate": return true;

                case "publicationDelete": return true;

                case "publicationUpdate": return true;

                case "publishablePublish": return true;

                case "publishablePublishToCurrentChannel": return true;

                case "publishableUnpublish": return true;

                case "publishableUnpublishToCurrentChannel": return true;

                case "quantityPricingByVariantUpdate": return true;

                case "quantityRulesAdd": return true;

                case "quantityRulesDelete": return true;

                case "refundCreate": return true;

                case "returnApproveRequest": return true;

                case "returnCancel": return true;

                case "returnClose": return true;

                case "returnCreate": return true;

                case "returnDeclineRequest": return true;

                case "returnLineItemRemoveFromReturn": return true;

                case "returnRefund": return true;

                case "returnReopen": return true;

                case "returnRequest": return true;

                case "reverseDeliveryCreateWithShipping": return true;

                case "reverseDeliveryShippingUpdate": return true;

                case "reverseFulfillmentOrderDispose": return true;

                case "savedSearchCreate": return true;

                case "savedSearchDelete": return true;

                case "savedSearchUpdate": return true;

                case "scriptTagCreate": return true;

                case "scriptTagDelete": return true;

                case "scriptTagUpdate": return true;

                case "segmentCreate": return true;

                case "segmentDelete": return true;

                case "segmentUpdate": return true;

                case "sellingPlanGroupAddProductVariants": return true;

                case "sellingPlanGroupAddProducts": return true;

                case "sellingPlanGroupCreate": return true;

                case "sellingPlanGroupDelete": return true;

                case "sellingPlanGroupRemoveProductVariants": return true;

                case "sellingPlanGroupRemoveProducts": return true;

                case "sellingPlanGroupUpdate": return true;

                case "serverPixelCreate": return true;

                case "serverPixelDelete": return true;

                case "shippingPackageDelete": return true;

                case "shippingPackageMakeDefault": return true;

                case "shippingPackageUpdate": return true;

                case "shopLocaleDisable": return true;

                case "shopLocaleEnable": return true;

                case "shopLocaleUpdate": return true;

                case "shopPolicyUpdate": return true;

                case "shopResourceFeedbackCreate": return true;

                case "shopifyPaymentsPayoutAlternateCurrencyCreate": return true;

                case "stagedUploadsCreate": return true;

                case "standardMetafieldDefinitionEnable": return true;

                case "standardMetaobjectDefinitionEnable": return true;

                case "storeCreditAccountCredit": return true;

                case "storeCreditAccountDebit": return true;

                case "storefrontAccessTokenCreate": return true;

                case "storefrontAccessTokenDelete": return true;

                case "subscriptionBillingAttemptCreate": return true;

                case "subscriptionBillingCycleBulkCharge": return true;

                case "subscriptionBillingCycleBulkSearch": return true;

                case "subscriptionBillingCycleCharge": return true;

                case "subscriptionBillingCycleContractDraftCommit": return true;

                case "subscriptionBillingCycleContractDraftConcatenate": return true;

                case "subscriptionBillingCycleContractEdit": return true;

                case "subscriptionBillingCycleEditDelete": return true;

                case "subscriptionBillingCycleEditsDelete": return true;

                case "subscriptionBillingCycleScheduleEdit": return true;

                case "subscriptionBillingCycleSkip": return true;

                case "subscriptionBillingCycleUnskip": return true;

                case "subscriptionContractActivate": return true;

                case "subscriptionContractAtomicCreate": return true;

                case "subscriptionContractCancel": return true;

                case "subscriptionContractCreate": return true;

                case "subscriptionContractExpire": return true;

                case "subscriptionContractFail": return true;

                case "subscriptionContractPause": return true;

                case "subscriptionContractProductChange": return true;

                case "subscriptionContractSetNextBillingDate": return true;

                case "subscriptionContractUpdate": return true;

                case "subscriptionDraftCommit": return true;

                case "subscriptionDraftDiscountAdd": return true;

                case "subscriptionDraftDiscountCodeApply": return true;

                case "subscriptionDraftDiscountRemove": return true;

                case "subscriptionDraftDiscountUpdate": return true;

                case "subscriptionDraftFreeShippingDiscountAdd": return true;

                case "subscriptionDraftFreeShippingDiscountUpdate": return true;

                case "subscriptionDraftLineAdd": return true;

                case "subscriptionDraftLineRemove": return true;

                case "subscriptionDraftLineUpdate": return true;

                case "subscriptionDraftUpdate": return true;

                case "tagsAdd": return true;

                case "tagsRemove": return true;

                case "taxAppConfigure": return true;

                case "themeCreate": return true;

                case "themeDelete": return true;

                case "themeFilesCopy": return true;

                case "themeFilesDelete": return true;

                case "themeFilesUpsert": return true;

                case "themePublish": return true;

                case "themeUpdate": return true;

                case "transactionVoid": return true;

                case "translationsRegister": return true;

                case "translationsRemove": return true;

                case "urlRedirectBulkDeleteAll": return true;

                case "urlRedirectBulkDeleteByIds": return true;

                case "urlRedirectBulkDeleteBySavedSearch": return true;

                case "urlRedirectBulkDeleteBySearch": return true;

                case "urlRedirectCreate": return true;

                case "urlRedirectDelete": return true;

                case "urlRedirectImportCreate": return true;

                case "urlRedirectImportSubmit": return true;

                case "urlRedirectUpdate": return true;

                case "validationCreate": return true;

                case "validationDelete": return true;

                case "validationUpdate": return true;

                case "webPixelCreate": return true;

                case "webPixelDelete": return true;

                case "webPixelUpdate": return true;

                case "webhookSubscriptionCreate": return true;

                case "webhookSubscriptionDelete": return true;

                case "webhookSubscriptionUpdate": return true;

                default: return false;
            }
        }
    }

