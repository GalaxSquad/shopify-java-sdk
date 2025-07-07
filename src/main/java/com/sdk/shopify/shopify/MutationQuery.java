// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.util.List;

/**
* The schema's entry point for all mutation operations.
*/
public class MutationQuery extends Query<MutationQuery> {
    MutationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class AbandonmentUpdateActivitiesDeliveryStatusesArguments extends Arguments {
        AbandonmentUpdateActivitiesDeliveryStatusesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The delivery timestamp if the activity delivered.
        */
        public AbandonmentUpdateActivitiesDeliveryStatusesArguments deliveredAt(String value) {
            if (value != null) {
                startArgument("deliveredAt");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The reason why the activity was or was not delivered.
        */
        public AbandonmentUpdateActivitiesDeliveryStatusesArguments deliveryStatusChangeReason(String value) {
            if (value != null) {
                startArgument("deliveryStatusChangeReason");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface AbandonmentUpdateActivitiesDeliveryStatusesArgumentsDefinition {
        void define(AbandonmentUpdateActivitiesDeliveryStatusesArguments args);
    }

    /**
    * Updates the marketing activities delivery statuses for an abandonment.
    */
    public MutationQuery abandonmentUpdateActivitiesDeliveryStatuses(ID abandonmentId, ID marketingActivityId, AbandonmentDeliveryState deliveryStatus, AbandonmentUpdateActivitiesDeliveryStatusesPayloadQueryDefinition queryDef) {
        return abandonmentUpdateActivitiesDeliveryStatuses(abandonmentId, marketingActivityId, deliveryStatus, args -> {}, queryDef);
    }

    /**
    * Updates the marketing activities delivery statuses for an abandonment.
    */
    public MutationQuery abandonmentUpdateActivitiesDeliveryStatuses(ID abandonmentId, ID marketingActivityId, AbandonmentDeliveryState deliveryStatus, AbandonmentUpdateActivitiesDeliveryStatusesArgumentsDefinition argsDef, AbandonmentUpdateActivitiesDeliveryStatusesPayloadQueryDefinition queryDef) {
        startField("abandonmentUpdateActivitiesDeliveryStatuses");

        _queryBuilder.append("(abandonmentId:");
        Query.appendQuotedString(_queryBuilder, abandonmentId.toString());

        _queryBuilder.append(",marketingActivityId:");
        Query.appendQuotedString(_queryBuilder, marketingActivityId.toString());

        _queryBuilder.append(",deliveryStatus:");
        _queryBuilder.append(deliveryStatus.toString());

        argsDef.define(new AbandonmentUpdateActivitiesDeliveryStatusesArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AbandonmentUpdateActivitiesDeliveryStatusesPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AppPurchaseOneTimeCreateArguments extends Arguments {
        AppPurchaseOneTimeCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Whether the app one-time purchase is a test transaction.
        */
        public AppPurchaseOneTimeCreateArguments test(Boolean value) {
            if (value != null) {
                startArgument("test");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AppPurchaseOneTimeCreateArgumentsDefinition {
        void define(AppPurchaseOneTimeCreateArguments args);
    }

    /**
    * Charges a shop for features or services one time.
    * This type of charge is recommended for apps that aren't billed on a recurring basis.
    * Test and demo shops aren't charged.
    */
    public MutationQuery appPurchaseOneTimeCreate(String name, MoneyInput price, String returnUrl, AppPurchaseOneTimeCreatePayloadQueryDefinition queryDef) {
        return appPurchaseOneTimeCreate(name, price, returnUrl, args -> {}, queryDef);
    }

    /**
    * Charges a shop for features or services one time.
    * This type of charge is recommended for apps that aren't billed on a recurring basis.
    * Test and demo shops aren't charged.
    */
    public MutationQuery appPurchaseOneTimeCreate(String name, MoneyInput price, String returnUrl, AppPurchaseOneTimeCreateArgumentsDefinition argsDef, AppPurchaseOneTimeCreatePayloadQueryDefinition queryDef) {
        startField("appPurchaseOneTimeCreate");

        _queryBuilder.append("(name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(",price:");
        price.appendTo(_queryBuilder);

        _queryBuilder.append(",returnUrl:");
        Query.appendQuotedString(_queryBuilder, returnUrl.toString());

        argsDef.define(new AppPurchaseOneTimeCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AppPurchaseOneTimeCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Revokes access scopes previously granted for an app installation.
    */
    public MutationQuery appRevokeAccessScopes(List<String> scopes, AppRevokeAccessScopesPayloadQueryDefinition queryDef) {
        startField("appRevokeAccessScopes");

        _queryBuilder.append("(scopes:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : scopes) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AppRevokeAccessScopesPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AppSubscriptionCancelArguments extends Arguments {
        AppSubscriptionCancelArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Whether to issue prorated credits for the unused portion of the app subscription.  There will
        * be a corresponding deduction (based on revenue share) to your Partner account.
        * For example, if a $10.00 app subscription (with 0% revenue share) is cancelled and prorated half way
        * through the billing cycle, then the merchant will be credited $5.00 and that amount will be deducted
        * from your Partner account.
        */
        public AppSubscriptionCancelArguments prorate(Boolean value) {
            if (value != null) {
                startArgument("prorate");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AppSubscriptionCancelArgumentsDefinition {
        void define(AppSubscriptionCancelArguments args);
    }

    /**
    * Cancels an app subscription on a store.
    */
    public MutationQuery appSubscriptionCancel(ID id, AppSubscriptionCancelPayloadQueryDefinition queryDef) {
        return appSubscriptionCancel(id, args -> {}, queryDef);
    }

    /**
    * Cancels an app subscription on a store.
    */
    public MutationQuery appSubscriptionCancel(ID id, AppSubscriptionCancelArgumentsDefinition argsDef, AppSubscriptionCancelPayloadQueryDefinition queryDef) {
        startField("appSubscriptionCancel");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new AppSubscriptionCancelArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AppSubscriptionCancelPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AppSubscriptionCreateArguments extends Arguments {
        AppSubscriptionCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Whether the app subscription is a test transaction.
        */
        public AppSubscriptionCreateArguments test(Boolean value) {
            if (value != null) {
                startArgument("test");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The number of days of the free trial period, beginning on the day that the merchant approves the app
        * charges.
        */
        public AppSubscriptionCreateArguments trialDays(Integer value) {
            if (value != null) {
                startArgument("trialDays");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The replacement behavior when creating an app subscription for a merchant with an already existing
        * app subscription.
        */
        public AppSubscriptionCreateArguments replacementBehavior(AppSubscriptionReplacementBehavior value) {
            if (value != null) {
                startArgument("replacementBehavior");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface AppSubscriptionCreateArgumentsDefinition {
        void define(AppSubscriptionCreateArguments args);
    }

    /**
    * Allows an app to charge a store for features or services on a recurring basis.
    */
    public MutationQuery appSubscriptionCreate(String name, List<AppSubscriptionLineItemInput> lineItems, String returnUrl, AppSubscriptionCreatePayloadQueryDefinition queryDef) {
        return appSubscriptionCreate(name, lineItems, returnUrl, args -> {}, queryDef);
    }

    /**
    * Allows an app to charge a store for features or services on a recurring basis.
    */
    public MutationQuery appSubscriptionCreate(String name, List<AppSubscriptionLineItemInput> lineItems, String returnUrl, AppSubscriptionCreateArgumentsDefinition argsDef, AppSubscriptionCreatePayloadQueryDefinition queryDef) {
        startField("appSubscriptionCreate");

        _queryBuilder.append("(name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(",lineItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AppSubscriptionLineItemInput item1 : lineItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(",returnUrl:");
        Query.appendQuotedString(_queryBuilder, returnUrl.toString());

        argsDef.define(new AppSubscriptionCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AppSubscriptionCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates the capped amount on the usage pricing plan of an app subscription line item.
    */
    public MutationQuery appSubscriptionLineItemUpdate(ID id, MoneyInput cappedAmount, AppSubscriptionLineItemUpdatePayloadQueryDefinition queryDef) {
        startField("appSubscriptionLineItemUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",cappedAmount:");
        cappedAmount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AppSubscriptionLineItemUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Extends the trial of an app subscription.
    */
    public MutationQuery appSubscriptionTrialExtend(ID id, int days, AppSubscriptionTrialExtendPayloadQueryDefinition queryDef) {
        startField("appSubscriptionTrialExtend");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",days:");
        _queryBuilder.append(days);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AppSubscriptionTrialExtendPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Uninstalls an app.
    */
    public MutationQuery appUninstall(AppUninstallPayloadQueryDefinition queryDef) {
        startField("appUninstall");

        _queryBuilder.append('{');
        queryDef.define(new AppUninstallPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AppUsageRecordCreateArguments extends Arguments {
        AppUsageRecordCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * A unique key generated by the client to avoid duplicate charges. Maximum length of 255 characters.
        */
        public AppUsageRecordCreateArguments idempotencyKey(String value) {
            if (value != null) {
                startArgument("idempotencyKey");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface AppUsageRecordCreateArgumentsDefinition {
        void define(AppUsageRecordCreateArguments args);
    }

    /**
    * Enables an app to charge a store for features or services on a per-use basis.
    * The usage charge value is counted towards the `cappedAmount` limit that was specified in the
    * `appUsagePricingDetails` field when the app subscription was created.
    * If you create an app usage charge that causes the total usage charges in a billing interval to
    * exceed the capped amount, then a `Total price exceeds balance remaining` error is returned.
    */
    public MutationQuery appUsageRecordCreate(ID subscriptionLineItemId, MoneyInput price, String description, AppUsageRecordCreatePayloadQueryDefinition queryDef) {
        return appUsageRecordCreate(subscriptionLineItemId, price, description, args -> {}, queryDef);
    }

    /**
    * Enables an app to charge a store for features or services on a per-use basis.
    * The usage charge value is counted towards the `cappedAmount` limit that was specified in the
    * `appUsagePricingDetails` field when the app subscription was created.
    * If you create an app usage charge that causes the total usage charges in a billing interval to
    * exceed the capped amount, then a `Total price exceeds balance remaining` error is returned.
    */
    public MutationQuery appUsageRecordCreate(ID subscriptionLineItemId, MoneyInput price, String description, AppUsageRecordCreateArgumentsDefinition argsDef, AppUsageRecordCreatePayloadQueryDefinition queryDef) {
        startField("appUsageRecordCreate");

        _queryBuilder.append("(subscriptionLineItemId:");
        Query.appendQuotedString(_queryBuilder, subscriptionLineItemId.toString());

        _queryBuilder.append(",price:");
        price.appendTo(_queryBuilder);

        _queryBuilder.append(",description:");
        Query.appendQuotedString(_queryBuilder, description.toString());

        argsDef.define(new AppUsageRecordCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AppUsageRecordCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ArticleCreateArguments extends Arguments {
        ArticleCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The properties of the new blog.
        */
        public ArticleCreateArguments blog(ArticleBlogInput value) {
            if (value != null) {
                startArgument("blog");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ArticleCreateArgumentsDefinition {
        void define(ArticleCreateArguments args);
    }

    /**
    * Creates an article.
    */
    public MutationQuery articleCreate(ArticleCreateInput article, ArticleCreatePayloadQueryDefinition queryDef) {
        return articleCreate(article, args -> {}, queryDef);
    }

    /**
    * Creates an article.
    */
    public MutationQuery articleCreate(ArticleCreateInput article, ArticleCreateArgumentsDefinition argsDef, ArticleCreatePayloadQueryDefinition queryDef) {
        startField("articleCreate");

        _queryBuilder.append("(article:");
        article.appendTo(_queryBuilder);

        argsDef.define(new ArticleCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ArticleCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes an article.
    */
    public MutationQuery articleDelete(ID id, ArticleDeletePayloadQueryDefinition queryDef) {
        startField("articleDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ArticleDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ArticleUpdateArguments extends Arguments {
        ArticleUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The properties of the blog to be created.
        */
        public ArticleUpdateArguments blog(ArticleBlogInput value) {
            if (value != null) {
                startArgument("blog");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ArticleUpdateArgumentsDefinition {
        void define(ArticleUpdateArguments args);
    }

    /**
    * Updates an article.
    */
    public MutationQuery articleUpdate(ID id, ArticleUpdateInput article, ArticleUpdatePayloadQueryDefinition queryDef) {
        return articleUpdate(id, article, args -> {}, queryDef);
    }

    /**
    * Updates an article.
    */
    public MutationQuery articleUpdate(ID id, ArticleUpdateInput article, ArticleUpdateArgumentsDefinition argsDef, ArticleUpdatePayloadQueryDefinition queryDef) {
        startField("articleUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",article:");
        article.appendTo(_queryBuilder);

        argsDef.define(new ArticleUpdateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ArticleUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class BackupRegionUpdateArguments extends Arguments {
        BackupRegionUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Optional input representing the region to be updated. If not provided, the existing regions remain
        * unchanged.
        */
        public BackupRegionUpdateArguments region(BackupRegionUpdateInput value) {
            if (value != null) {
                startArgument("region");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface BackupRegionUpdateArgumentsDefinition {
        void define(BackupRegionUpdateArguments args);
    }

    /**
    * Update the backup region that is used when we have no better signal of what region a buyer is in.
    */
    public MutationQuery backupRegionUpdate(BackupRegionUpdatePayloadQueryDefinition queryDef) {
        return backupRegionUpdate(args -> {}, queryDef);
    }

    /**
    * Update the backup region that is used when we have no better signal of what region a buyer is in.
    */
    public MutationQuery backupRegionUpdate(BackupRegionUpdateArgumentsDefinition argsDef, BackupRegionUpdatePayloadQueryDefinition queryDef) {
        startField("backupRegionUpdate");

        BackupRegionUpdateArguments args = new BackupRegionUpdateArguments(_queryBuilder);
        argsDef.define(args);
        BackupRegionUpdateArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new BackupRegionUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a blog.
    */
    public MutationQuery blogCreate(BlogCreateInput blog, BlogCreatePayloadQueryDefinition queryDef) {
        startField("blogCreate");

        _queryBuilder.append("(blog:");
        blog.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new BlogCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a blog.
    */
    public MutationQuery blogDelete(ID id, BlogDeletePayloadQueryDefinition queryDef) {
        startField("blogDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new BlogDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a blog.
    */
    public MutationQuery blogUpdate(ID id, BlogUpdateInput blog, BlogUpdatePayloadQueryDefinition queryDef) {
        startField("blogUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",blog:");
        blog.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new BlogUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Starts the cancelation process of a running bulk operation.
    * There may be a short delay from when a cancelation starts until the operation is actually canceled.
    */
    public MutationQuery bulkOperationCancel(ID id, BulkOperationCancelPayloadQueryDefinition queryDef) {
        startField("bulkOperationCancel");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new BulkOperationCancelPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class BulkOperationRunMutationArguments extends Arguments {
        BulkOperationRunMutationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * An optional identifier which may be used for querying.
        */
        public BulkOperationRunMutationArguments clientIdentifier(String value) {
            if (value != null) {
                startArgument("clientIdentifier");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface BulkOperationRunMutationArgumentsDefinition {
        void define(BulkOperationRunMutationArguments args);
    }

    /**
    * Creates and runs a bulk operation mutation.
    * To learn how to bulk import large volumes of data asynchronously, refer to the
    * [bulk import data guide](https://shopify.dev/api/usage/bulk-operations/imports).
    */
    public MutationQuery bulkOperationRunMutation(String mutation, String stagedUploadPath, boolean groupObjects, BulkOperationRunMutationPayloadQueryDefinition queryDef) {
        return bulkOperationRunMutation(mutation, stagedUploadPath, groupObjects, args -> {}, queryDef);
    }

    /**
    * Creates and runs a bulk operation mutation.
    * To learn how to bulk import large volumes of data asynchronously, refer to the
    * [bulk import data guide](https://shopify.dev/api/usage/bulk-operations/imports).
    */
    public MutationQuery bulkOperationRunMutation(String mutation, String stagedUploadPath, boolean groupObjects, BulkOperationRunMutationArgumentsDefinition argsDef, BulkOperationRunMutationPayloadQueryDefinition queryDef) {
        startField("bulkOperationRunMutation");

        _queryBuilder.append("(mutation:");
        Query.appendQuotedString(_queryBuilder, mutation.toString());

        _queryBuilder.append(",stagedUploadPath:");
        Query.appendQuotedString(_queryBuilder, stagedUploadPath.toString());

        _queryBuilder.append(",groupObjects:");
        _queryBuilder.append(groupObjects);

        argsDef.define(new BulkOperationRunMutationArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new BulkOperationRunMutationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates and runs a bulk operation query.
    * See the [bulk operations guide](https://shopify.dev/api/usage/bulk-operations/queries) for more
    * details.
    */
    public MutationQuery bulkOperationRunQuery(String query, boolean groupObjects, BulkOperationRunQueryPayloadQueryDefinition queryDef) {
        startField("bulkOperationRunQuery");

        _queryBuilder.append("(query:");
        Query.appendQuotedString(_queryBuilder, query.toString());

        _queryBuilder.append(",groupObjects:");
        _queryBuilder.append(groupObjects);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new BulkOperationRunQueryPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates product feedback for multiple products.
    */
    public MutationQuery bulkProductResourceFeedbackCreate(List<ProductResourceFeedbackInput> feedbackInput, BulkProductResourceFeedbackCreatePayloadQueryDefinition queryDef) {
        startField("bulkProductResourceFeedbackCreate");

        _queryBuilder.append("(feedbackInput:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ProductResourceFeedbackInput item1 : feedbackInput) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new BulkProductResourceFeedbackCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new carrier service.
    */
    public MutationQuery carrierServiceCreate(DeliveryCarrierServiceCreateInput input, CarrierServiceCreatePayloadQueryDefinition queryDef) {
        startField("carrierServiceCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CarrierServiceCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Removes an existing carrier service.
    */
    public MutationQuery carrierServiceDelete(ID id, CarrierServiceDeletePayloadQueryDefinition queryDef) {
        startField("carrierServiceDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CarrierServiceDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a carrier service. Only the app that creates a carrier service can update it.
    */
    public MutationQuery carrierServiceUpdate(DeliveryCarrierServiceUpdateInput input, CarrierServiceUpdatePayloadQueryDefinition queryDef) {
        startField("carrierServiceUpdate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CarrierServiceUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CartTransformCreateArguments extends Arguments {
        CartTransformCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Whether a run failure should block cart and checkout operations.
        */
        public CartTransformCreateArguments blockOnFailure(Boolean value) {
            if (value != null) {
                startArgument("blockOnFailure");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Additional metafields to associate to the cart transform.
        */
        public CartTransformCreateArguments metafields(List<MetafieldInput> value) {
            if (value != null) {
                startArgument("metafields");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MetafieldInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface CartTransformCreateArgumentsDefinition {
        void define(CartTransformCreateArguments args);
    }

    /**
    * Create a CartTransform function to the Shop.
    */
    public MutationQuery cartTransformCreate(String functionId, CartTransformCreatePayloadQueryDefinition queryDef) {
        return cartTransformCreate(functionId, args -> {}, queryDef);
    }

    /**
    * Create a CartTransform function to the Shop.
    */
    public MutationQuery cartTransformCreate(String functionId, CartTransformCreateArgumentsDefinition argsDef, CartTransformCreatePayloadQueryDefinition queryDef) {
        startField("cartTransformCreate");

        _queryBuilder.append("(functionId:");
        Query.appendQuotedString(_queryBuilder, functionId.toString());

        argsDef.define(new CartTransformCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CartTransformCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Destroy a cart transform function from the Shop.
    */
    public MutationQuery cartTransformDelete(ID id, CartTransformDeletePayloadQueryDefinition queryDef) {
        startField("cartTransformDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CartTransformDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CatalogContextUpdateArguments extends Arguments {
        CatalogContextUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The contexts to add to the catalog.
        */
        public CatalogContextUpdateArguments contextsToAdd(CatalogContextInput value) {
            if (value != null) {
                startArgument("contextsToAdd");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * The contexts to remove from the catalog.
        */
        public CatalogContextUpdateArguments contextsToRemove(CatalogContextInput value) {
            if (value != null) {
                startArgument("contextsToRemove");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CatalogContextUpdateArgumentsDefinition {
        void define(CatalogContextUpdateArguments args);
    }

    /**
    * Updates the context of a catalog.
    */
    public MutationQuery catalogContextUpdate(ID catalogId, CatalogContextUpdatePayloadQueryDefinition queryDef) {
        return catalogContextUpdate(catalogId, args -> {}, queryDef);
    }

    /**
    * Updates the context of a catalog.
    */
    public MutationQuery catalogContextUpdate(ID catalogId, CatalogContextUpdateArgumentsDefinition argsDef, CatalogContextUpdatePayloadQueryDefinition queryDef) {
        startField("catalogContextUpdate");

        _queryBuilder.append("(catalogId:");
        Query.appendQuotedString(_queryBuilder, catalogId.toString());

        argsDef.define(new CatalogContextUpdateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CatalogContextUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new catalog.
    */
    public MutationQuery catalogCreate(CatalogCreateInput input, CatalogCreatePayloadQueryDefinition queryDef) {
        startField("catalogCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CatalogCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CatalogDeleteArguments extends Arguments {
        CatalogDeleteArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Whether to also delete the price list and the publication owned by the catalog.
        */
        public CatalogDeleteArguments deleteDependentResources(Boolean value) {
            if (value != null) {
                startArgument("deleteDependentResources");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CatalogDeleteArgumentsDefinition {
        void define(CatalogDeleteArguments args);
    }

    /**
    * Delete a catalog.
    */
    public MutationQuery catalogDelete(ID id, CatalogDeletePayloadQueryDefinition queryDef) {
        return catalogDelete(id, args -> {}, queryDef);
    }

    /**
    * Delete a catalog.
    */
    public MutationQuery catalogDelete(ID id, CatalogDeleteArgumentsDefinition argsDef, CatalogDeletePayloadQueryDefinition queryDef) {
        startField("catalogDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new CatalogDeleteArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CatalogDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates an existing catalog.
    */
    public MutationQuery catalogUpdate(ID id, CatalogUpdateInput input, CatalogUpdatePayloadQueryDefinition queryDef) {
        startField("catalogUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CatalogUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CheckoutBrandingUpsertArguments extends Arguments {
        CheckoutBrandingUpsertArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The input fields to use to upsert the checkout branding settings (pass null to reset them to
        * default).
        */
        public CheckoutBrandingUpsertArguments checkoutBrandingInput(CheckoutBrandingInput value) {
            if (value != null) {
                startArgument("checkoutBrandingInput");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CheckoutBrandingUpsertArgumentsDefinition {
        void define(CheckoutBrandingUpsertArguments args);
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
    public MutationQuery checkoutBrandingUpsert(ID checkoutProfileId, CheckoutBrandingUpsertPayloadQueryDefinition queryDef) {
        return checkoutBrandingUpsert(checkoutProfileId, args -> {}, queryDef);
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
    public MutationQuery checkoutBrandingUpsert(ID checkoutProfileId, CheckoutBrandingUpsertArgumentsDefinition argsDef, CheckoutBrandingUpsertPayloadQueryDefinition queryDef) {
        startField("checkoutBrandingUpsert");

        _queryBuilder.append("(checkoutProfileId:");
        Query.appendQuotedString(_queryBuilder, checkoutProfileId.toString());

        argsDef.define(new CheckoutBrandingUpsertArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingUpsertPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds products to a collection.
    */
    public MutationQuery collectionAddProducts(ID id, List<ID> productIds, CollectionAddProductsPayloadQueryDefinition queryDef) {
        startField("collectionAddProducts");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",productIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : productIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CollectionAddProductsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Asynchronously adds a set of products to a given collection. It can take a long time to run. Instead
    * of returning a collection, it returns a job which should be polled.
    */
    public MutationQuery collectionAddProductsV2(ID id, List<ID> productIds, CollectionAddProductsV2PayloadQueryDefinition queryDef) {
        startField("collectionAddProductsV2");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",productIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : productIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CollectionAddProductsV2PayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection)
    * to group [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) together
    * in the [online store](https://shopify.dev/docs/apps/build/online-store) and
    * other [sales channels](https://shopify.dev/docs/apps/build/sales-channels).
    * For example, an athletics store might create different collections for running attire, shoes, and
    * accessories.
    * There are two types of collections:
    * - **[Custom (manual)
    * collections](https://help.shopify.com/manual/products/collections/manual-shopify-collection)**: You
    * specify the products to include in a collection.
    * - **[Smart (automated)
    * collections](https://help.shopify.com/manual/products/collections/automated-collections)**: You
    * define rules, and products matching those rules are automatically
    * included in the collection.
    * Use the `collectionCreate` mutation when you need to:
    * - Create a new collection for a product launch or campaign
    * - Organize products by category, season, or promotion
    * - Automate product grouping using rules (for example, by tag, type, or price)
    * > Note:
    * > The created collection is unpublished by default. To make it available to customers,
    * use the
    * [`publishablePublish`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/publishablePublis
    * h)
    * mutation after creation.
    * Learn more about [using metafields with smart
    * collections](https://shopify.dev/docs/apps/build/custom-data/metafields/use-metafield-capabilities).
    */
    public MutationQuery collectionCreate(CollectionInput input, CollectionCreatePayloadQueryDefinition queryDef) {
        startField("collectionCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CollectionCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a collection.
    */
    public MutationQuery collectionDelete(CollectionDeleteInput input, CollectionDeletePayloadQueryDefinition queryDef) {
        startField("collectionDelete");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CollectionDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Removes a set of products from a given collection. The mutation can take a long time to run. Instead
    * of returning an updated collection the mutation returns a job, which should be
    * [polled](https://shopify.dev/api/admin-graphql/latest/queries/job). For use with manual collections
    * only.
    */
    public MutationQuery collectionRemoveProducts(ID id, List<ID> productIds, CollectionRemoveProductsPayloadQueryDefinition queryDef) {
        startField("collectionRemoveProducts");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",productIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : productIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CollectionRemoveProductsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery collectionReorderProducts(ID id, List<MoveInput> moves, CollectionReorderProductsPayloadQueryDefinition queryDef) {
        startField("collectionReorderProducts");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",moves:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (MoveInput item1 : moves) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CollectionReorderProductsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection),
    * modifying its properties, products, or publication settings. Collections help organize
    * [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) together
    * in the [online store](https://shopify.dev/docs/apps/build/online-store) and
    * other [sales channels](https://shopify.dev/docs/apps/build/sales-channels).
    * Use the `collectionUpdate` mutation to programmatically modify collections in scenarios such as:
    * - Updating collection details, like title, description, or image
    * - Modifying SEO metadata for better search visibility
    * - Changing which products are included (using rule updates for smart collections)
    * - Publishing or unpublishing collections across different sales channels
    * - Updating custom data using
    * [metafields](https://shopify.dev/docs/apps/build/custom-data/metafields)
    * There are two types of collections with different update capabilities:
    * - **[Custom (manual)
    * collections](https://help.shopify.com/manual/products/collections/manual-shopify-collection)**: You
    * can update collection properties, but rule sets can't be modified since products are manually
    * selected.
    * - **[Smart (automated)
    * collections](https://help.shopify.com/manual/products/collections/automated-collections)**: You can
    * update both collection properties and the rules that automatically determine which products are
    * included.
    * When updating [rule
    * sets](https://shopify.dev/docs/api/admin-graphql/latest/objects/CollectionRuleConditions) for smart
    * collections, the operation might be processed asynchronously. In these cases, the mutation returns a
    * [`job`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Job) object that you can use to
    * track the progress of the update.
    * To publish or unpublish collections to specific sales channels, use the dedicated
    * [`publishablePublish`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/publishablePublis
    * h) and
    * [`publishableUnpublish`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/publishableUnpu
    * blish) mutations.
    * Learn more about [using metafields with smart
    * collections](https://shopify.dev/docs/apps/build/custom-data/metafields/use-metafield-capabilities).
    */
    public MutationQuery collectionUpdate(CollectionInput input, CollectionUpdatePayloadQueryDefinition queryDef) {
        startField("collectionUpdate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CollectionUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CombinedListingUpdateArguments extends Arguments {
        CombinedListingUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The updated title for the combined listing.
        */
        public CombinedListingUpdateArguments title(String value) {
            if (value != null) {
                startArgument("title");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The child products to add and their assigned options and option values.
        */
        public CombinedListingUpdateArguments productsAdded(List<ChildProductRelationInput> value) {
            if (value != null) {
                startArgument("productsAdded");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ChildProductRelationInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The child products to edit and their assigned options and option values.
        */
        public CombinedListingUpdateArguments productsEdited(List<ChildProductRelationInput> value) {
            if (value != null) {
                startArgument("productsEdited");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ChildProductRelationInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The IDs of products to be removed from the combined listing.
        */
        public CombinedListingUpdateArguments productsRemovedIds(List<ID> value) {
            if (value != null) {
                startArgument("productsRemovedIds");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The ordered options and values to be used by the combined listing. Options and values will be
        * reordered to match the order specified here.
        */
        public CombinedListingUpdateArguments optionsAndValues(List<OptionAndValueInput> value) {
            if (value != null) {
                startArgument("optionsAndValues");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OptionAndValueInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface CombinedListingUpdateArgumentsDefinition {
        void define(CombinedListingUpdateArguments args);
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
    public MutationQuery combinedListingUpdate(ID parentProductId, CombinedListingUpdatePayloadQueryDefinition queryDef) {
        return combinedListingUpdate(parentProductId, args -> {}, queryDef);
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
    public MutationQuery combinedListingUpdate(ID parentProductId, CombinedListingUpdateArgumentsDefinition argsDef, CombinedListingUpdatePayloadQueryDefinition queryDef) {
        startField("combinedListingUpdate");

        _queryBuilder.append("(parentProductId:");
        Query.appendQuotedString(_queryBuilder, parentProductId.toString());

        argsDef.define(new CombinedListingUpdateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CombinedListingUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Approves a comment.
    */
    public MutationQuery commentApprove(ID id, CommentApprovePayloadQueryDefinition queryDef) {
        startField("commentApprove");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CommentApprovePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a comment.
    */
    public MutationQuery commentDelete(ID id, CommentDeletePayloadQueryDefinition queryDef) {
        startField("commentDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CommentDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Marks a comment as not spam.
    */
    public MutationQuery commentNotSpam(ID id, CommentNotSpamPayloadQueryDefinition queryDef) {
        startField("commentNotSpam");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CommentNotSpamPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Marks a comment as spam.
    */
    public MutationQuery commentSpam(ID id, CommentSpamPayloadQueryDefinition queryDef) {
        startField("commentSpam");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CommentSpamPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a list of companies.
    */
    public MutationQuery companiesDelete(List<ID> companyIds, CompaniesDeletePayloadQueryDefinition queryDef) {
        startField("companiesDelete");

        _queryBuilder.append("(companyIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : companyIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompaniesDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a company address.
    */
    public MutationQuery companyAddressDelete(ID addressId, CompanyAddressDeletePayloadQueryDefinition queryDef) {
        startField("companyAddressDelete");

        _queryBuilder.append("(addressId:");
        Query.appendQuotedString(_queryBuilder, addressId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyAddressDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Assigns the customer as a company contact.
    */
    public MutationQuery companyAssignCustomerAsContact(ID companyId, ID customerId, CompanyAssignCustomerAsContactPayloadQueryDefinition queryDef) {
        startField("companyAssignCustomerAsContact");

        _queryBuilder.append("(companyId:");
        Query.appendQuotedString(_queryBuilder, companyId.toString());

        _queryBuilder.append(",customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyAssignCustomerAsContactPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Assigns the main contact for the company.
    */
    public MutationQuery companyAssignMainContact(ID companyId, ID companyContactId, CompanyAssignMainContactPayloadQueryDefinition queryDef) {
        startField("companyAssignMainContact");

        _queryBuilder.append("(companyId:");
        Query.appendQuotedString(_queryBuilder, companyId.toString());

        _queryBuilder.append(",companyContactId:");
        Query.appendQuotedString(_queryBuilder, companyContactId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyAssignMainContactPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Assigns a role to a contact for a location.
    */
    public MutationQuery companyContactAssignRole(ID companyContactId, ID companyContactRoleId, ID companyLocationId, CompanyContactAssignRolePayloadQueryDefinition queryDef) {
        startField("companyContactAssignRole");

        _queryBuilder.append("(companyContactId:");
        Query.appendQuotedString(_queryBuilder, companyContactId.toString());

        _queryBuilder.append(",companyContactRoleId:");
        Query.appendQuotedString(_queryBuilder, companyContactRoleId.toString());

        _queryBuilder.append(",companyLocationId:");
        Query.appendQuotedString(_queryBuilder, companyLocationId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactAssignRolePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Assigns roles on a company contact.
    */
    public MutationQuery companyContactAssignRoles(ID companyContactId, List<CompanyContactRoleAssign> rolesToAssign, CompanyContactAssignRolesPayloadQueryDefinition queryDef) {
        startField("companyContactAssignRoles");

        _queryBuilder.append("(companyContactId:");
        Query.appendQuotedString(_queryBuilder, companyContactId.toString());

        _queryBuilder.append(",rolesToAssign:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (CompanyContactRoleAssign item1 : rolesToAssign) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactAssignRolesPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a company contact and the associated customer.
    */
    public MutationQuery companyContactCreate(ID companyId, CompanyContactInput input, CompanyContactCreatePayloadQueryDefinition queryDef) {
        startField("companyContactCreate");

        _queryBuilder.append("(companyId:");
        Query.appendQuotedString(_queryBuilder, companyId.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a company contact.
    */
    public MutationQuery companyContactDelete(ID companyContactId, CompanyContactDeletePayloadQueryDefinition queryDef) {
        startField("companyContactDelete");

        _queryBuilder.append("(companyContactId:");
        Query.appendQuotedString(_queryBuilder, companyContactId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Removes a company contact from a Company.
    */
    public MutationQuery companyContactRemoveFromCompany(ID companyContactId, CompanyContactRemoveFromCompanyPayloadQueryDefinition queryDef) {
        startField("companyContactRemoveFromCompany");

        _queryBuilder.append("(companyContactId:");
        Query.appendQuotedString(_queryBuilder, companyContactId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactRemoveFromCompanyPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Revokes a role on a company contact.
    */
    public MutationQuery companyContactRevokeRole(ID companyContactId, ID companyContactRoleAssignmentId, CompanyContactRevokeRolePayloadQueryDefinition queryDef) {
        startField("companyContactRevokeRole");

        _queryBuilder.append("(companyContactId:");
        Query.appendQuotedString(_queryBuilder, companyContactId.toString());

        _queryBuilder.append(",companyContactRoleAssignmentId:");
        Query.appendQuotedString(_queryBuilder, companyContactRoleAssignmentId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactRevokeRolePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CompanyContactRevokeRolesArguments extends Arguments {
        CompanyContactRevokeRolesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The current role assignment IDs to revoke.
        */
        public CompanyContactRevokeRolesArguments roleAssignmentIds(List<ID> value) {
            if (value != null) {
                startArgument("roleAssignmentIds");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * Flag to revoke all roles on the contact.
        */
        public CompanyContactRevokeRolesArguments revokeAll(Boolean value) {
            if (value != null) {
                startArgument("revokeAll");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CompanyContactRevokeRolesArgumentsDefinition {
        void define(CompanyContactRevokeRolesArguments args);
    }

    /**
    * Revokes roles on a company contact.
    */
    public MutationQuery companyContactRevokeRoles(ID companyContactId, CompanyContactRevokeRolesPayloadQueryDefinition queryDef) {
        return companyContactRevokeRoles(companyContactId, args -> {}, queryDef);
    }

    /**
    * Revokes roles on a company contact.
    */
    public MutationQuery companyContactRevokeRoles(ID companyContactId, CompanyContactRevokeRolesArgumentsDefinition argsDef, CompanyContactRevokeRolesPayloadQueryDefinition queryDef) {
        startField("companyContactRevokeRoles");

        _queryBuilder.append("(companyContactId:");
        Query.appendQuotedString(_queryBuilder, companyContactId.toString());

        argsDef.define(new CompanyContactRevokeRolesArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactRevokeRolesPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CompanyContactSendWelcomeEmailArguments extends Arguments {
        CompanyContactSendWelcomeEmailArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The welcome email fields.
        */
        public CompanyContactSendWelcomeEmailArguments email(EmailInput value) {
            if (value != null) {
                startArgument("email");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CompanyContactSendWelcomeEmailArgumentsDefinition {
        void define(CompanyContactSendWelcomeEmailArguments args);
    }

    /**
    * Sends the company contact a welcome email.
    */
    public MutationQuery companyContactSendWelcomeEmail(ID companyContactId, CompanyContactSendWelcomeEmailPayloadQueryDefinition queryDef) {
        return companyContactSendWelcomeEmail(companyContactId, args -> {}, queryDef);
    }

    /**
    * Sends the company contact a welcome email.
    */
    public MutationQuery companyContactSendWelcomeEmail(ID companyContactId, CompanyContactSendWelcomeEmailArgumentsDefinition argsDef, CompanyContactSendWelcomeEmailPayloadQueryDefinition queryDef) {
        startField("companyContactSendWelcomeEmail");

        _queryBuilder.append("(companyContactId:");
        Query.appendQuotedString(_queryBuilder, companyContactId.toString());

        argsDef.define(new CompanyContactSendWelcomeEmailArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactSendWelcomeEmailPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a company contact.
    */
    public MutationQuery companyContactUpdate(ID companyContactId, CompanyContactInput input, CompanyContactUpdatePayloadQueryDefinition queryDef) {
        startField("companyContactUpdate");

        _queryBuilder.append("(companyContactId:");
        Query.appendQuotedString(_queryBuilder, companyContactId.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes one or more company contacts.
    */
    public MutationQuery companyContactsDelete(List<ID> companyContactIds, CompanyContactsDeletePayloadQueryDefinition queryDef) {
        startField("companyContactsDelete");

        _queryBuilder.append("(companyContactIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : companyContactIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactsDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a company.
    */
    public MutationQuery companyCreate(CompanyCreateInput input, CompanyCreatePayloadQueryDefinition queryDef) {
        startField("companyCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a company.
    */
    public MutationQuery companyDelete(ID id, CompanyDeletePayloadQueryDefinition queryDef) {
        startField("companyDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates an address on a company location.
    */
    public MutationQuery companyLocationAssignAddress(ID locationId, CompanyAddressInput address, List<CompanyAddressType> addressTypes, CompanyLocationAssignAddressPayloadQueryDefinition queryDef) {
        startField("companyLocationAssignAddress");

        _queryBuilder.append("(locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

        _queryBuilder.append(",address:");
        address.appendTo(_queryBuilder);

        _queryBuilder.append(",addressTypes:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (CompanyAddressType item1 : addressTypes) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                _queryBuilder.append(item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationAssignAddressPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Assigns roles on a company location.
    */
    public MutationQuery companyLocationAssignRoles(ID companyLocationId, List<CompanyLocationRoleAssign> rolesToAssign, CompanyLocationAssignRolesPayloadQueryDefinition queryDef) {
        startField("companyLocationAssignRoles");

        _queryBuilder.append("(companyLocationId:");
        Query.appendQuotedString(_queryBuilder, companyLocationId.toString());

        _queryBuilder.append(",rolesToAssign:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (CompanyLocationRoleAssign item1 : rolesToAssign) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationAssignRolesPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates one or more mappings between a staff member at a shop and a company location.
    */
    public MutationQuery companyLocationAssignStaffMembers(ID companyLocationId, List<ID> staffMemberIds, CompanyLocationAssignStaffMembersPayloadQueryDefinition queryDef) {
        startField("companyLocationAssignStaffMembers");

        _queryBuilder.append("(companyLocationId:");
        Query.appendQuotedString(_queryBuilder, companyLocationId.toString());

        _queryBuilder.append(",staffMemberIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : staffMemberIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationAssignStaffMembersPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a company location.
    */
    public MutationQuery companyLocationCreate(ID companyId, CompanyLocationInput input, CompanyLocationCreatePayloadQueryDefinition queryDef) {
        startField("companyLocationCreate");

        _queryBuilder.append("(companyId:");
        Query.appendQuotedString(_queryBuilder, companyId.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a company location.
    */
    public MutationQuery companyLocationDelete(ID companyLocationId, CompanyLocationDeletePayloadQueryDefinition queryDef) {
        startField("companyLocationDelete");

        _queryBuilder.append("(companyLocationId:");
        Query.appendQuotedString(_queryBuilder, companyLocationId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes one or more existing mappings between a staff member at a shop and a company location.
    */
    public MutationQuery companyLocationRemoveStaffMembers(List<ID> companyLocationStaffMemberAssignmentIds, CompanyLocationRemoveStaffMembersPayloadQueryDefinition queryDef) {
        startField("companyLocationRemoveStaffMembers");

        _queryBuilder.append("(companyLocationStaffMemberAssignmentIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : companyLocationStaffMemberAssignmentIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationRemoveStaffMembersPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Revokes roles on a company location.
    */
    public MutationQuery companyLocationRevokeRoles(ID companyLocationId, List<ID> rolesToRevoke, CompanyLocationRevokeRolesPayloadQueryDefinition queryDef) {
        startField("companyLocationRevokeRoles");

        _queryBuilder.append("(companyLocationId:");
        Query.appendQuotedString(_queryBuilder, companyLocationId.toString());

        _queryBuilder.append(",rolesToRevoke:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : rolesToRevoke) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationRevokeRolesPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CompanyLocationTaxSettingsUpdateArguments extends Arguments {
        CompanyLocationTaxSettingsUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The unique tax registration ID for the company location.
        */
        public CompanyLocationTaxSettingsUpdateArguments taxRegistrationId(String value) {
            if (value != null) {
                startArgument("taxRegistrationId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Whether the location is exempt from taxes.
        */
        public CompanyLocationTaxSettingsUpdateArguments taxExempt(Boolean value) {
            if (value != null) {
                startArgument("taxExempt");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The list of tax exemptions to assign to the company location.
        */
        public CompanyLocationTaxSettingsUpdateArguments exemptionsToAssign(List<TaxExemption> value) {
            if (value != null) {
                startArgument("exemptionsToAssign");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (TaxExemption item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The list of tax exemptions to remove from the company location.
        */
        public CompanyLocationTaxSettingsUpdateArguments exemptionsToRemove(List<TaxExemption> value) {
            if (value != null) {
                startArgument("exemptionsToRemove");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (TaxExemption item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface CompanyLocationTaxSettingsUpdateArgumentsDefinition {
        void define(CompanyLocationTaxSettingsUpdateArguments args);
    }

    /**
    * Sets the tax settings for a company location.
    */
    public MutationQuery companyLocationTaxSettingsUpdate(ID companyLocationId, CompanyLocationTaxSettingsUpdatePayloadQueryDefinition queryDef) {
        return companyLocationTaxSettingsUpdate(companyLocationId, args -> {}, queryDef);
    }

    /**
    * Sets the tax settings for a company location.
    */
    public MutationQuery companyLocationTaxSettingsUpdate(ID companyLocationId, CompanyLocationTaxSettingsUpdateArgumentsDefinition argsDef, CompanyLocationTaxSettingsUpdatePayloadQueryDefinition queryDef) {
        startField("companyLocationTaxSettingsUpdate");

        _queryBuilder.append("(companyLocationId:");
        Query.appendQuotedString(_queryBuilder, companyLocationId.toString());

        argsDef.define(new CompanyLocationTaxSettingsUpdateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationTaxSettingsUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a company location.
    */
    public MutationQuery companyLocationUpdate(ID companyLocationId, CompanyLocationUpdateInput input, CompanyLocationUpdatePayloadQueryDefinition queryDef) {
        startField("companyLocationUpdate");

        _queryBuilder.append("(companyLocationId:");
        Query.appendQuotedString(_queryBuilder, companyLocationId.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a list of company locations.
    */
    public MutationQuery companyLocationsDelete(List<ID> companyLocationIds, CompanyLocationsDeletePayloadQueryDefinition queryDef) {
        startField("companyLocationsDelete");

        _queryBuilder.append("(companyLocationIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : companyLocationIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationsDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Revokes the main contact from the company.
    */
    public MutationQuery companyRevokeMainContact(ID companyId, CompanyRevokeMainContactPayloadQueryDefinition queryDef) {
        startField("companyRevokeMainContact");

        _queryBuilder.append("(companyId:");
        Query.appendQuotedString(_queryBuilder, companyId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyRevokeMainContactPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a company.
    */
    public MutationQuery companyUpdate(ID companyId, CompanyInput input, CompanyUpdatePayloadQueryDefinition queryDef) {
        startField("companyUpdate");

        _queryBuilder.append("(companyId:");
        Query.appendQuotedString(_queryBuilder, companyId.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Update or create consent policies in bulk.
    */
    public MutationQuery consentPolicyUpdate(List<ConsentPolicyInput> consentPolicies, ConsentPolicyUpdatePayloadQueryDefinition queryDef) {
        startField("consentPolicyUpdate");

        _queryBuilder.append("(consentPolicies:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ConsentPolicyInput item1 : consentPolicies) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ConsentPolicyUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Add tax exemptions for the customer.
    */
    public MutationQuery customerAddTaxExemptions(ID customerId, List<TaxExemption> taxExemptions, CustomerAddTaxExemptionsPayloadQueryDefinition queryDef) {
        startField("customerAddTaxExemptions");

        _queryBuilder.append("(customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(",taxExemptions:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (TaxExemption item1 : taxExemptions) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                _queryBuilder.append(item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerAddTaxExemptionsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CustomerAddressCreateArguments extends Arguments {
        CustomerAddressCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Whether to set the address as the customer's default address.
        */
        public CustomerAddressCreateArguments setAsDefault(Boolean value) {
            if (value != null) {
                startArgument("setAsDefault");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CustomerAddressCreateArgumentsDefinition {
        void define(CustomerAddressCreateArguments args);
    }

    /**
    * Create a new customer address.
    */
    public MutationQuery customerAddressCreate(ID customerId, MailingAddressInput address, CustomerAddressCreatePayloadQueryDefinition queryDef) {
        return customerAddressCreate(customerId, address, args -> {}, queryDef);
    }

    /**
    * Create a new customer address.
    */
    public MutationQuery customerAddressCreate(ID customerId, MailingAddressInput address, CustomerAddressCreateArgumentsDefinition argsDef, CustomerAddressCreatePayloadQueryDefinition queryDef) {
        startField("customerAddressCreate");

        _queryBuilder.append("(customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(",address:");
        address.appendTo(_queryBuilder);

        argsDef.define(new CustomerAddressCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerAddressCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a customer's address.
    */
    public MutationQuery customerAddressDelete(ID customerId, ID addressId, CustomerAddressDeletePayloadQueryDefinition queryDef) {
        startField("customerAddressDelete");

        _queryBuilder.append("(customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(",addressId:");
        Query.appendQuotedString(_queryBuilder, addressId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerAddressDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CustomerAddressUpdateArguments extends Arguments {
        CustomerAddressUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Whether to set the address as the customer's default address.
        */
        public CustomerAddressUpdateArguments setAsDefault(Boolean value) {
            if (value != null) {
                startArgument("setAsDefault");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CustomerAddressUpdateArgumentsDefinition {
        void define(CustomerAddressUpdateArguments args);
    }

    /**
    * Update a customer's address information.
    */
    public MutationQuery customerAddressUpdate(ID customerId, ID addressId, MailingAddressInput address, CustomerAddressUpdatePayloadQueryDefinition queryDef) {
        return customerAddressUpdate(customerId, addressId, address, args -> {}, queryDef);
    }

    /**
    * Update a customer's address information.
    */
    public MutationQuery customerAddressUpdate(ID customerId, ID addressId, MailingAddressInput address, CustomerAddressUpdateArgumentsDefinition argsDef, CustomerAddressUpdatePayloadQueryDefinition queryDef) {
        startField("customerAddressUpdate");

        _queryBuilder.append("(customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(",addressId:");
        Query.appendQuotedString(_queryBuilder, addressId.toString());

        _queryBuilder.append(",address:");
        address.appendTo(_queryBuilder);

        argsDef.define(new CustomerAddressUpdateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerAddressUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Cancels a pending erasure of a customer's data. Read more
    * [here](https://help.shopify.com/manual/privacy-and-security/privacy/processing-customer-data-request
    * s#cancel-customer-data-erasure).
    * To request an erasure of a customer's data use the [customerRequestDataErasure
    * mutation](https://shopify.dev/api/admin-graphql/unstable/mutations/customerRequestDataErasure).
    */
    public MutationQuery customerCancelDataErasure(ID customerId, CustomerCancelDataErasurePayloadQueryDefinition queryDef) {
        startField("customerCancelDataErasure");

        _queryBuilder.append("(customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerCancelDataErasurePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Create a new customer. As of API version 2022-10, apps using protected customer data must meet the
    * protected customer data
    * [requirements](https://shopify.dev/apps/store/data-protection/protected-customer-data).
    */
    public MutationQuery customerCreate(CustomerInput input, CustomerCreatePayloadQueryDefinition queryDef) {
        startField("customerCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Delete a customer. As of API version 2022-10, apps using protected customer data must meet the
    * protected customer data
    * [requirements](https://shopify.dev/apps/store/data-protection/protected-customer-data).
    */
    public MutationQuery customerDelete(CustomerDeleteInput input, CustomerDeletePayloadQueryDefinition queryDef) {
        startField("customerDelete");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Update a customer's email marketing information information.
    */
    public MutationQuery customerEmailMarketingConsentUpdate(CustomerEmailMarketingConsentUpdateInput input, CustomerEmailMarketingConsentUpdatePayloadQueryDefinition queryDef) {
        startField("customerEmailMarketingConsentUpdate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerEmailMarketingConsentUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Generate an account activation URL for a customer.
    */
    public MutationQuery customerGenerateAccountActivationUrl(ID customerId, CustomerGenerateAccountActivationUrlPayloadQueryDefinition queryDef) {
        startField("customerGenerateAccountActivationUrl");

        _queryBuilder.append("(customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerGenerateAccountActivationUrlPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CustomerMergeArguments extends Arguments {
        CustomerMergeArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The fields to override the default customer merge rules.
        */
        public CustomerMergeArguments overrideFields(CustomerMergeOverrideFields value) {
            if (value != null) {
                startArgument("overrideFields");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CustomerMergeArgumentsDefinition {
        void define(CustomerMergeArguments args);
    }

    /**
    * Merges two customers.
    */
    public MutationQuery customerMerge(ID customerOneId, ID customerTwoId, CustomerMergePayloadQueryDefinition queryDef) {
        return customerMerge(customerOneId, customerTwoId, args -> {}, queryDef);
    }

    /**
    * Merges two customers.
    */
    public MutationQuery customerMerge(ID customerOneId, ID customerTwoId, CustomerMergeArgumentsDefinition argsDef, CustomerMergePayloadQueryDefinition queryDef) {
        startField("customerMerge");

        _queryBuilder.append("(customerOneId:");
        Query.appendQuotedString(_queryBuilder, customerOneId.toString());

        _queryBuilder.append(",customerTwoId:");
        Query.appendQuotedString(_queryBuilder, customerTwoId.toString());

        argsDef.define(new CustomerMergeArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerMergePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a vaulted payment method for a customer from duplication data.
    * This data must be obtained from another shop within the same organization.
    * Currently, this only supports Shop Pay payment methods. This is only available for selected partner
    * apps.
    */
    public MutationQuery customerPaymentMethodCreateFromDuplicationData(ID customerId, MailingAddressInput billingAddress, String encryptedDuplicationData, CustomerPaymentMethodCreateFromDuplicationDataPayloadQueryDefinition queryDef) {
        startField("customerPaymentMethodCreateFromDuplicationData");

        _queryBuilder.append("(customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(",billingAddress:");
        billingAddress.appendTo(_queryBuilder);

        _queryBuilder.append(",encryptedDuplicationData:");
        Query.appendQuotedString(_queryBuilder, encryptedDuplicationData.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodCreateFromDuplicationDataPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a credit card payment method for a customer using a session id.
    * These values are only obtained through card imports happening from a PCI compliant environment.
    * Please use customerPaymentMethodRemoteCreate if you are not managing credit cards directly.
    */
    public MutationQuery customerPaymentMethodCreditCardCreate(ID customerId, MailingAddressInput billingAddress, String sessionId, CustomerPaymentMethodCreditCardCreatePayloadQueryDefinition queryDef) {
        startField("customerPaymentMethodCreditCardCreate");

        _queryBuilder.append("(customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(",billingAddress:");
        billingAddress.appendTo(_queryBuilder);

        _queryBuilder.append(",sessionId:");
        Query.appendQuotedString(_queryBuilder, sessionId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodCreditCardCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates the credit card payment method for a customer.
    */
    public MutationQuery customerPaymentMethodCreditCardUpdate(ID id, MailingAddressInput billingAddress, String sessionId, CustomerPaymentMethodCreditCardUpdatePayloadQueryDefinition queryDef) {
        startField("customerPaymentMethodCreditCardUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",billingAddress:");
        billingAddress.appendTo(_queryBuilder);

        _queryBuilder.append(",sessionId:");
        Query.appendQuotedString(_queryBuilder, sessionId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodCreditCardUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns encrypted data that can be used to duplicate the payment method in another shop within the
    * same organization.
    * Currently, this only supports Shop Pay payment methods. This is only available for selected partner
    * apps.
    */
    public MutationQuery customerPaymentMethodGetDuplicationData(ID customerPaymentMethodId, ID targetShopId, ID targetCustomerId, CustomerPaymentMethodGetDuplicationDataPayloadQueryDefinition queryDef) {
        startField("customerPaymentMethodGetDuplicationData");

        _queryBuilder.append("(customerPaymentMethodId:");
        Query.appendQuotedString(_queryBuilder, customerPaymentMethodId.toString());

        _queryBuilder.append(",targetShopId:");
        Query.appendQuotedString(_queryBuilder, targetShopId.toString());

        _queryBuilder.append(",targetCustomerId:");
        Query.appendQuotedString(_queryBuilder, targetCustomerId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodGetDuplicationDataPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a URL that allows the customer to update a specific payment method.
    * Currently, `customerPaymentMethodGetUpdateUrl` only supports Shop Pay.
    */
    public MutationQuery customerPaymentMethodGetUpdateUrl(ID customerPaymentMethodId, CustomerPaymentMethodGetUpdateUrlPayloadQueryDefinition queryDef) {
        startField("customerPaymentMethodGetUpdateUrl");

        _queryBuilder.append("(customerPaymentMethodId:");
        Query.appendQuotedString(_queryBuilder, customerPaymentMethodId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodGetUpdateUrlPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CustomerPaymentMethodPaypalBillingAgreementCreateArguments extends Arguments {
        CustomerPaymentMethodPaypalBillingAgreementCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The billing address.
        */
        public CustomerPaymentMethodPaypalBillingAgreementCreateArguments billingAddress(MailingAddressInput value) {
            if (value != null) {
                startArgument("billingAddress");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Whether the PayPal billing agreement is inactive.
        */
        public CustomerPaymentMethodPaypalBillingAgreementCreateArguments inactive(Boolean value) {
            if (value != null) {
                startArgument("inactive");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CustomerPaymentMethodPaypalBillingAgreementCreateArgumentsDefinition {
        void define(CustomerPaymentMethodPaypalBillingAgreementCreateArguments args);
    }

    /**
    * Creates a PayPal billing agreement for a customer.
    */
    public MutationQuery customerPaymentMethodPaypalBillingAgreementCreate(ID customerId, String billingAgreementId, CustomerPaymentMethodPaypalBillingAgreementCreatePayloadQueryDefinition queryDef) {
        return customerPaymentMethodPaypalBillingAgreementCreate(customerId, billingAgreementId, args -> {}, queryDef);
    }

    /**
    * Creates a PayPal billing agreement for a customer.
    */
    public MutationQuery customerPaymentMethodPaypalBillingAgreementCreate(ID customerId, String billingAgreementId, CustomerPaymentMethodPaypalBillingAgreementCreateArgumentsDefinition argsDef, CustomerPaymentMethodPaypalBillingAgreementCreatePayloadQueryDefinition queryDef) {
        startField("customerPaymentMethodPaypalBillingAgreementCreate");

        _queryBuilder.append("(customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(",billingAgreementId:");
        Query.appendQuotedString(_queryBuilder, billingAgreementId.toString());

        argsDef.define(new CustomerPaymentMethodPaypalBillingAgreementCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodPaypalBillingAgreementCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a PayPal billing agreement for a customer.
    */
    public MutationQuery customerPaymentMethodPaypalBillingAgreementUpdate(ID id, MailingAddressInput billingAddress, CustomerPaymentMethodPaypalBillingAgreementUpdatePayloadQueryDefinition queryDef) {
        startField("customerPaymentMethodPaypalBillingAgreementUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",billingAddress:");
        billingAddress.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodPaypalBillingAgreementUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Create a payment method from remote gateway identifiers. NOTE: This operation processes payment
    * methods asynchronously. The returned payment method will initially have incomplete details.
    * Developers must poll this payment method using customerPaymentMethod query until all payment method
    * details are available, or the payment method is revoked (usually within seconds).
    */
    public MutationQuery customerPaymentMethodRemoteCreate(ID customerId, CustomerPaymentMethodRemoteInput remoteReference, CustomerPaymentMethodRemoteCreatePayloadQueryDefinition queryDef) {
        startField("customerPaymentMethodRemoteCreate");

        _queryBuilder.append("(customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(",remoteReference:");
        remoteReference.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodRemoteCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Revokes a customer's payment method.
    */
    public MutationQuery customerPaymentMethodRevoke(ID customerPaymentMethodId, CustomerPaymentMethodRevokePayloadQueryDefinition queryDef) {
        startField("customerPaymentMethodRevoke");

        _queryBuilder.append("(customerPaymentMethodId:");
        Query.appendQuotedString(_queryBuilder, customerPaymentMethodId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodRevokePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CustomerPaymentMethodSendUpdateEmailArguments extends Arguments {
        CustomerPaymentMethodSendUpdateEmailArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Specifies the payment method update email fields. Only the 'from' and 'bcc' fields are accepted for
        * input.
        */
        public CustomerPaymentMethodSendUpdateEmailArguments email(EmailInput value) {
            if (value != null) {
                startArgument("email");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CustomerPaymentMethodSendUpdateEmailArgumentsDefinition {
        void define(CustomerPaymentMethodSendUpdateEmailArguments args);
    }

    /**
    * Sends a link to the customer so they can update a specific payment method.
    */
    public MutationQuery customerPaymentMethodSendUpdateEmail(ID customerPaymentMethodId, CustomerPaymentMethodSendUpdateEmailPayloadQueryDefinition queryDef) {
        return customerPaymentMethodSendUpdateEmail(customerPaymentMethodId, args -> {}, queryDef);
    }

    /**
    * Sends a link to the customer so they can update a specific payment method.
    */
    public MutationQuery customerPaymentMethodSendUpdateEmail(ID customerPaymentMethodId, CustomerPaymentMethodSendUpdateEmailArgumentsDefinition argsDef, CustomerPaymentMethodSendUpdateEmailPayloadQueryDefinition queryDef) {
        startField("customerPaymentMethodSendUpdateEmail");

        _queryBuilder.append("(customerPaymentMethodId:");
        Query.appendQuotedString(_queryBuilder, customerPaymentMethodId.toString());

        argsDef.define(new CustomerPaymentMethodSendUpdateEmailArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodSendUpdateEmailPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Remove tax exemptions from a customer.
    */
    public MutationQuery customerRemoveTaxExemptions(ID customerId, List<TaxExemption> taxExemptions, CustomerRemoveTaxExemptionsPayloadQueryDefinition queryDef) {
        startField("customerRemoveTaxExemptions");

        _queryBuilder.append("(customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(",taxExemptions:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (TaxExemption item1 : taxExemptions) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                _queryBuilder.append(item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerRemoveTaxExemptionsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Replace tax exemptions for a customer.
    */
    public MutationQuery customerReplaceTaxExemptions(ID customerId, List<TaxExemption> taxExemptions, CustomerReplaceTaxExemptionsPayloadQueryDefinition queryDef) {
        startField("customerReplaceTaxExemptions");

        _queryBuilder.append("(customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(",taxExemptions:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (TaxExemption item1 : taxExemptions) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                _queryBuilder.append(item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerReplaceTaxExemptionsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Enqueues a request to erase customer's data. Read more
    * [here](https://help.shopify.com/manual/privacy-and-security/privacy/processing-customer-data-request
    * s#erase-customer-personal-data).
    * To cancel the data erasure request use the [customerCancelDataErasure
    * mutation](https://shopify.dev/api/admin-graphql/unstable/mutations/customerCancelDataErasure).
    */
    public MutationQuery customerRequestDataErasure(ID customerId, CustomerRequestDataErasurePayloadQueryDefinition queryDef) {
        startField("customerRequestDataErasure");

        _queryBuilder.append("(customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerRequestDataErasurePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a customer segment members query.
    */
    public MutationQuery customerSegmentMembersQueryCreate(CustomerSegmentMembersQueryInput input, CustomerSegmentMembersQueryCreatePayloadQueryDefinition queryDef) {
        startField("customerSegmentMembersQueryCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerSegmentMembersQueryCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CustomerSendAccountInviteEmailArguments extends Arguments {
        CustomerSendAccountInviteEmailArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Specifies the account invite email fields.
        */
        public CustomerSendAccountInviteEmailArguments email(EmailInput value) {
            if (value != null) {
                startArgument("email");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CustomerSendAccountInviteEmailArgumentsDefinition {
        void define(CustomerSendAccountInviteEmailArguments args);
    }

    /**
    * Sends the customer an account invite email.
    */
    public MutationQuery customerSendAccountInviteEmail(ID customerId, CustomerSendAccountInviteEmailPayloadQueryDefinition queryDef) {
        return customerSendAccountInviteEmail(customerId, args -> {}, queryDef);
    }

    /**
    * Sends the customer an account invite email.
    */
    public MutationQuery customerSendAccountInviteEmail(ID customerId, CustomerSendAccountInviteEmailArgumentsDefinition argsDef, CustomerSendAccountInviteEmailPayloadQueryDefinition queryDef) {
        startField("customerSendAccountInviteEmail");

        _queryBuilder.append("(customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        argsDef.define(new CustomerSendAccountInviteEmailArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerSendAccountInviteEmailPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CustomerSetArguments extends Arguments {
        CustomerSetArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Specifies the identifier that will be used to lookup the resource.
        */
        public CustomerSetArguments identifier(CustomerSetIdentifiers value) {
            if (value != null) {
                startArgument("identifier");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CustomerSetArgumentsDefinition {
        void define(CustomerSetArguments args);
    }

    /**
    * Creates or updates a customer in a single mutation.
    * Use this mutation when syncing information from an external data source into Shopify.
    * This mutation can be used to create a new customer, update an existing customer by id, or
    * upsert a customer by a unique key (email or phone).
    * To create a new customer omit the `identifier` argument.
    * To update an existing customer, include the `identifier` with the id of the customer to update.
    * To perform an 'upsert' by unique key (email or phone)
    * use the `identifier` argument to upsert a customer by a unique key (email or phone). If a customer
    * with the specified unique key exists, it will be updated. If not, a new customer will be created
    * with
    * that unique key.
    * As of API version 2022-10, apps using protected customer data must meet the
    * protected customer data
    * [requirements](https://shopify.dev/apps/store/data-protection/protected-customer-data)
    * Any list field (e.g.
    * [addresses](https://shopify.dev/api/admin-graphql/unstable/input-objects/MailingAddressInput),
    * will be updated so that all included entries are either created or updated, and all existing entries
    * not
    * included will be deleted.
    * All other fields will be updated to the value passed. Omitted fields will not be updated.
    */
    public MutationQuery customerSet(CustomerSetInput input, CustomerSetPayloadQueryDefinition queryDef) {
        return customerSet(input, args -> {}, queryDef);
    }

    /**
    * Creates or updates a customer in a single mutation.
    * Use this mutation when syncing information from an external data source into Shopify.
    * This mutation can be used to create a new customer, update an existing customer by id, or
    * upsert a customer by a unique key (email or phone).
    * To create a new customer omit the `identifier` argument.
    * To update an existing customer, include the `identifier` with the id of the customer to update.
    * To perform an 'upsert' by unique key (email or phone)
    * use the `identifier` argument to upsert a customer by a unique key (email or phone). If a customer
    * with the specified unique key exists, it will be updated. If not, a new customer will be created
    * with
    * that unique key.
    * As of API version 2022-10, apps using protected customer data must meet the
    * protected customer data
    * [requirements](https://shopify.dev/apps/store/data-protection/protected-customer-data)
    * Any list field (e.g.
    * [addresses](https://shopify.dev/api/admin-graphql/unstable/input-objects/MailingAddressInput),
    * will be updated so that all included entries are either created or updated, and all existing entries
    * not
    * included will be deleted.
    * All other fields will be updated to the value passed. Omitted fields will not be updated.
    */
    public MutationQuery customerSet(CustomerSetInput input, CustomerSetArgumentsDefinition argsDef, CustomerSetPayloadQueryDefinition queryDef) {
        startField("customerSet");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        argsDef.define(new CustomerSetArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerSetPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Update a customer's SMS marketing consent information.
    */
    public MutationQuery customerSmsMarketingConsentUpdate(CustomerSmsMarketingConsentUpdateInput input, CustomerSmsMarketingConsentUpdatePayloadQueryDefinition queryDef) {
        startField("customerSmsMarketingConsentUpdate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerSmsMarketingConsentUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Update a customer's attributes. As of API version 2022-10, apps using protected customer data must
    * meet the protected customer data
    * [requirements](https://shopify.dev/apps/store/data-protection/protected-customer-data).
    */
    public MutationQuery customerUpdate(CustomerInput input, CustomerUpdatePayloadQueryDefinition queryDef) {
        startField("customerUpdate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a customer's default address.
    */
    public MutationQuery customerUpdateDefaultAddress(ID customerId, ID addressId, CustomerUpdateDefaultAddressPayloadQueryDefinition queryDef) {
        startField("customerUpdateDefaultAddress");

        _queryBuilder.append("(customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(",addressId:");
        Query.appendQuotedString(_queryBuilder, addressId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerUpdateDefaultAddressPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Opt out a customer from data sale.
    */
    public MutationQuery dataSaleOptOut(String email, DataSaleOptOutPayloadQueryDefinition queryDef) {
        startField("dataSaleOptOut");

        _queryBuilder.append("(email:");
        Query.appendQuotedString(_queryBuilder, email.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DataSaleOptOutPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a delegate access token.
    * To learn more about creating delegate access tokens, refer to
    * [Delegate OAuth access tokens to
    * subsystems](https://shopify.dev/docs/apps/build/authentication-authorization/access-tokens/use-deleg
    * ate-tokens).
    */
    public MutationQuery delegateAccessTokenCreate(DelegateAccessTokenInput input, DelegateAccessTokenCreatePayloadQueryDefinition queryDef) {
        startField("delegateAccessTokenCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DelegateAccessTokenCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Destroys a delegate access token.
    */
    public MutationQuery delegateAccessTokenDestroy(String accessToken, DelegateAccessTokenDestroyPayloadQueryDefinition queryDef) {
        startField("delegateAccessTokenDestroy");

        _queryBuilder.append("(accessToken:");
        Query.appendQuotedString(_queryBuilder, accessToken.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DelegateAccessTokenDestroyPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Activates and deactivates delivery customizations.
    */
    public MutationQuery deliveryCustomizationActivation(List<ID> ids, boolean enabled, DeliveryCustomizationActivationPayloadQueryDefinition queryDef) {
        startField("deliveryCustomizationActivation");

        _queryBuilder.append("(ids:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : ids) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(",enabled:");
        _queryBuilder.append(enabled);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCustomizationActivationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a delivery customization.
    */
    public MutationQuery deliveryCustomizationCreate(DeliveryCustomizationInput deliveryCustomization, DeliveryCustomizationCreatePayloadQueryDefinition queryDef) {
        startField("deliveryCustomizationCreate");

        _queryBuilder.append("(deliveryCustomization:");
        deliveryCustomization.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCustomizationCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a delivery customization.
    */
    public MutationQuery deliveryCustomizationDelete(ID id, DeliveryCustomizationDeletePayloadQueryDefinition queryDef) {
        startField("deliveryCustomizationDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCustomizationDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a delivery customization.
    */
    public MutationQuery deliveryCustomizationUpdate(ID id, DeliveryCustomizationInput deliveryCustomization, DeliveryCustomizationUpdatePayloadQueryDefinition queryDef) {
        startField("deliveryCustomizationUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",deliveryCustomization:");
        deliveryCustomization.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCustomizationUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Create a delivery profile.
    */
    public MutationQuery deliveryProfileCreate(DeliveryProfileInput profile, DeliveryProfileCreatePayloadQueryDefinition queryDef) {
        startField("deliveryProfileCreate");

        _queryBuilder.append("(profile:");
        profile.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeliveryProfileCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Enqueue the removal of a delivery profile.
    */
    public MutationQuery deliveryProfileRemove(ID id, DeliveryProfileRemovePayloadQueryDefinition queryDef) {
        startField("deliveryProfileRemove");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeliveryProfileRemovePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DeliveryProfileUpdateArguments extends Arguments {
        DeliveryProfileUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Whether this delivery profile should leave legacy mode.
        */
        public DeliveryProfileUpdateArguments leaveLegacyModeProfiles(Boolean value) {
            if (value != null) {
                startArgument("leaveLegacyModeProfiles");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DeliveryProfileUpdateArgumentsDefinition {
        void define(DeliveryProfileUpdateArguments args);
    }

    /**
    * Update a delivery profile.
    */
    public MutationQuery deliveryProfileUpdate(ID id, DeliveryProfileInput profile, DeliveryProfileUpdatePayloadQueryDefinition queryDef) {
        return deliveryProfileUpdate(id, profile, args -> {}, queryDef);
    }

    /**
    * Update a delivery profile.
    */
    public MutationQuery deliveryProfileUpdate(ID id, DeliveryProfileInput profile, DeliveryProfileUpdateArgumentsDefinition argsDef, DeliveryProfileUpdatePayloadQueryDefinition queryDef) {
        startField("deliveryProfileUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",profile:");
        profile.appendTo(_queryBuilder);

        argsDef.define(new DeliveryProfileUpdateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeliveryProfileUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DeliveryPromiseParticipantsUpdateArguments extends Arguments {
        DeliveryPromiseParticipantsUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The owners to add to the delivery promise participants.
        */
        public DeliveryPromiseParticipantsUpdateArguments ownersToAdd(List<ID> value) {
            if (value != null) {
                startArgument("ownersToAdd");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The owners to remove from the delivery promise participants.
        */
        public DeliveryPromiseParticipantsUpdateArguments ownersToRemove(List<ID> value) {
            if (value != null) {
                startArgument("ownersToRemove");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface DeliveryPromiseParticipantsUpdateArgumentsDefinition {
        void define(DeliveryPromiseParticipantsUpdateArguments args);
    }

    /**
    * Updates the delivery promise participants by adding or removing owners based on a branded promise
    * handle.
    */
    public MutationQuery deliveryPromiseParticipantsUpdate(String brandedPromiseHandle, DeliveryPromiseParticipantsUpdatePayloadQueryDefinition queryDef) {
        return deliveryPromiseParticipantsUpdate(brandedPromiseHandle, args -> {}, queryDef);
    }

    /**
    * Updates the delivery promise participants by adding or removing owners based on a branded promise
    * handle.
    */
    public MutationQuery deliveryPromiseParticipantsUpdate(String brandedPromiseHandle, DeliveryPromiseParticipantsUpdateArgumentsDefinition argsDef, DeliveryPromiseParticipantsUpdatePayloadQueryDefinition queryDef) {
        startField("deliveryPromiseParticipantsUpdate");

        _queryBuilder.append("(brandedPromiseHandle:");
        Query.appendQuotedString(_queryBuilder, brandedPromiseHandle.toString());

        argsDef.define(new DeliveryPromiseParticipantsUpdateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeliveryPromiseParticipantsUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DeliveryPromiseProviderUpsertArguments extends Arguments {
        DeliveryPromiseProviderUpsertArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Whether the delivery promise provider is active. Defaults to `true` when creating a provider.
        */
        public DeliveryPromiseProviderUpsertArguments active(Boolean value) {
            if (value != null) {
                startArgument("active");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The number of seconds to add to the current time as a buffer when looking up delivery promises.
        * Represents how long the shop requires before releasing an order to the fulfillment provider.
        */
        public DeliveryPromiseProviderUpsertArguments fulfillmentDelay(Integer value) {
            if (value != null) {
                startArgument("fulfillmentDelay");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The time zone to be used for interpreting day of week and cutoff times in delivery schedules when
        * looking up delivery promises. Defaults to `UTC` when creating a provider.
        */
        public DeliveryPromiseProviderUpsertArguments timeZone(String value) {
            if (value != null) {
                startArgument("timeZone");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface DeliveryPromiseProviderUpsertArgumentsDefinition {
        void define(DeliveryPromiseProviderUpsertArguments args);
    }

    /**
    * Creates or updates a delivery promise provider. Currently restricted to select approved delivery
    * promise partners.
    */
    public MutationQuery deliveryPromiseProviderUpsert(ID locationId, DeliveryPromiseProviderUpsertPayloadQueryDefinition queryDef) {
        return deliveryPromiseProviderUpsert(locationId, args -> {}, queryDef);
    }

    /**
    * Creates or updates a delivery promise provider. Currently restricted to select approved delivery
    * promise partners.
    */
    public MutationQuery deliveryPromiseProviderUpsert(ID locationId, DeliveryPromiseProviderUpsertArgumentsDefinition argsDef, DeliveryPromiseProviderUpsertPayloadQueryDefinition queryDef) {
        startField("deliveryPromiseProviderUpsert");

        _queryBuilder.append("(locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

        argsDef.define(new DeliveryPromiseProviderUpsertArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeliveryPromiseProviderUpsertPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Set the delivery settings for a shop.
    */
    public MutationQuery deliverySettingUpdate(DeliverySettingInput setting, DeliverySettingUpdatePayloadQueryDefinition queryDef) {
        startField("deliverySettingUpdate");

        _queryBuilder.append("(setting:");
        setting.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeliverySettingUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Assigns a location as the shipping origin while using legacy compatibility mode for multi-location
    * delivery profiles.
    */
    public MutationQuery deliveryShippingOriginAssign(ID locationId, DeliveryShippingOriginAssignPayloadQueryDefinition queryDef) {
        startField("deliveryShippingOriginAssign");

        _queryBuilder.append("(locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeliveryShippingOriginAssignPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Activates an automatic discount.
    */
    public MutationQuery discountAutomaticActivate(ID id, DiscountAutomaticActivatePayloadQueryDefinition queryDef) {
        startField("discountAutomaticActivate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticActivatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountAutomaticAppCreate(DiscountAutomaticAppInput automaticAppDiscount, DiscountAutomaticAppCreatePayloadQueryDefinition queryDef) {
        startField("discountAutomaticAppCreate");

        _queryBuilder.append("(automaticAppDiscount:");
        automaticAppDiscount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticAppCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountAutomaticAppUpdate(ID id, DiscountAutomaticAppInput automaticAppDiscount, DiscountAutomaticAppUpdatePayloadQueryDefinition queryDef) {
        startField("discountAutomaticAppUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",automaticAppDiscount:");
        automaticAppDiscount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticAppUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountAutomaticBasicCreate(DiscountAutomaticBasicInput automaticBasicDiscount, DiscountAutomaticBasicCreatePayloadQueryDefinition queryDef) {
        startField("discountAutomaticBasicCreate");

        _queryBuilder.append("(automaticBasicDiscount:");
        automaticBasicDiscount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticBasicCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountAutomaticBasicUpdate(ID id, DiscountAutomaticBasicInput automaticBasicDiscount, DiscountAutomaticBasicUpdatePayloadQueryDefinition queryDef) {
        startField("discountAutomaticBasicUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",automaticBasicDiscount:");
        automaticBasicDiscount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticBasicUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DiscountAutomaticBulkDeleteArguments extends Arguments {
        DiscountAutomaticBulkDeleteArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The search query for filtering automatic discounts to delete.
        * For more information on the list of supported fields and search syntax, refer to the
        * [AutomaticDiscountNodes query
        * section](https://shopify.dev/api/admin-graphql/latest/queries/automaticDiscountNodes#argument-automa
        * ticdiscountnodes-query).
        */
        public DiscountAutomaticBulkDeleteArguments search(String value) {
            if (value != null) {
                startArgument("search");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of the saved search to use for filtering automatic discounts to delete.
        */
        public DiscountAutomaticBulkDeleteArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The IDs of the automatic discounts to delete.
        */
        public DiscountAutomaticBulkDeleteArguments ids(List<ID> value) {
            if (value != null) {
                startArgument("ids");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface DiscountAutomaticBulkDeleteArgumentsDefinition {
        void define(DiscountAutomaticBulkDeleteArguments args);
    }

    /**
    * Asynchronously delete automatic discounts in bulk if a `search` or `saved_search_id` argument is
    * provided or if a
    * maximum discount threshold is reached (1,000). Otherwise, deletions will occur inline.
    * **Warning:** All automatic discounts will be deleted if a blank `search` argument is provided.
    */
    public MutationQuery discountAutomaticBulkDelete(DiscountAutomaticBulkDeletePayloadQueryDefinition queryDef) {
        return discountAutomaticBulkDelete(args -> {}, queryDef);
    }

    /**
    * Asynchronously delete automatic discounts in bulk if a `search` or `saved_search_id` argument is
    * provided or if a
    * maximum discount threshold is reached (1,000). Otherwise, deletions will occur inline.
    * **Warning:** All automatic discounts will be deleted if a blank `search` argument is provided.
    */
    public MutationQuery discountAutomaticBulkDelete(DiscountAutomaticBulkDeleteArgumentsDefinition argsDef, DiscountAutomaticBulkDeletePayloadQueryDefinition queryDef) {
        startField("discountAutomaticBulkDelete");

        DiscountAutomaticBulkDeleteArguments args = new DiscountAutomaticBulkDeleteArguments(_queryBuilder);
        argsDef.define(args);
        DiscountAutomaticBulkDeleteArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticBulkDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountAutomaticBxgyCreate(DiscountAutomaticBxgyInput automaticBxgyDiscount, DiscountAutomaticBxgyCreatePayloadQueryDefinition queryDef) {
        startField("discountAutomaticBxgyCreate");

        _queryBuilder.append("(automaticBxgyDiscount:");
        automaticBxgyDiscount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticBxgyCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountAutomaticBxgyUpdate(ID id, DiscountAutomaticBxgyInput automaticBxgyDiscount, DiscountAutomaticBxgyUpdatePayloadQueryDefinition queryDef) {
        startField("discountAutomaticBxgyUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",automaticBxgyDiscount:");
        automaticBxgyDiscount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticBxgyUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deactivates an automatic discount.
    */
    public MutationQuery discountAutomaticDeactivate(ID id, DiscountAutomaticDeactivatePayloadQueryDefinition queryDef) {
        startField("discountAutomaticDeactivate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticDeactivatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes an
    * [automatic discount](https://help.shopify.com/manual/discounts/discount-types#automatic-discounts).
    */
    public MutationQuery discountAutomaticDelete(ID id, DiscountAutomaticDeletePayloadQueryDefinition queryDef) {
        startField("discountAutomaticDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountAutomaticFreeShippingCreate(DiscountAutomaticFreeShippingInput freeShippingAutomaticDiscount, DiscountAutomaticFreeShippingCreatePayloadQueryDefinition queryDef) {
        startField("discountAutomaticFreeShippingCreate");

        _queryBuilder.append("(freeShippingAutomaticDiscount:");
        freeShippingAutomaticDiscount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticFreeShippingCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountAutomaticFreeShippingUpdate(ID id, DiscountAutomaticFreeShippingInput freeShippingAutomaticDiscount, DiscountAutomaticFreeShippingUpdatePayloadQueryDefinition queryDef) {
        startField("discountAutomaticFreeShippingUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",freeShippingAutomaticDiscount:");
        freeShippingAutomaticDiscount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticFreeShippingUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Activates a code discount.
    */
    public MutationQuery discountCodeActivate(ID id, DiscountCodeActivatePayloadQueryDefinition queryDef) {
        startField("discountCodeActivate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeActivatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountCodeAppCreate(DiscountCodeAppInput codeAppDiscount, DiscountCodeAppCreatePayloadQueryDefinition queryDef) {
        startField("discountCodeAppCreate");

        _queryBuilder.append("(codeAppDiscount:");
        codeAppDiscount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeAppCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountCodeAppUpdate(ID id, DiscountCodeAppInput codeAppDiscount, DiscountCodeAppUpdatePayloadQueryDefinition queryDef) {
        startField("discountCodeAppUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",codeAppDiscount:");
        codeAppDiscount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeAppUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountCodeBasicCreate(DiscountCodeBasicInput basicCodeDiscount, DiscountCodeBasicCreatePayloadQueryDefinition queryDef) {
        startField("discountCodeBasicCreate");

        _queryBuilder.append("(basicCodeDiscount:");
        basicCodeDiscount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeBasicCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountCodeBasicUpdate(ID id, DiscountCodeBasicInput basicCodeDiscount, DiscountCodeBasicUpdatePayloadQueryDefinition queryDef) {
        startField("discountCodeBasicUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",basicCodeDiscount:");
        basicCodeDiscount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeBasicUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DiscountCodeBulkActivateArguments extends Arguments {
        DiscountCodeBulkActivateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The search query for filtering discounts.
        * <br><br>
        * For more information on the list of supported fields and search syntax, refer to the
        * [`codeDiscountNodes`](https://shopify.dev/docs/api/admin-graphql/latest/queries/codeDiscountNodes#qu
        * ery-arguments) query.
        */
        public DiscountCodeBulkActivateArguments search(String value) {
            if (value != null) {
                startArgument("search");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of the saved search for filtering discounts to activate. Saved searches represent [customer
        * segments](https://help.shopify.com/manual/customers/customer-segments) that merchants have built in
        * the Shopify admin.
        */
        public DiscountCodeBulkActivateArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The IDs of the discounts to activate.
        */
        public DiscountCodeBulkActivateArguments ids(List<ID> value) {
            if (value != null) {
                startArgument("ids");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface DiscountCodeBulkActivateArgumentsDefinition {
        void define(DiscountCodeBulkActivateArguments args);
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
    public MutationQuery discountCodeBulkActivate(DiscountCodeBulkActivatePayloadQueryDefinition queryDef) {
        return discountCodeBulkActivate(args -> {}, queryDef);
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
    public MutationQuery discountCodeBulkActivate(DiscountCodeBulkActivateArgumentsDefinition argsDef, DiscountCodeBulkActivatePayloadQueryDefinition queryDef) {
        startField("discountCodeBulkActivate");

        DiscountCodeBulkActivateArguments args = new DiscountCodeBulkActivateArguments(_queryBuilder);
        argsDef.define(args);
        DiscountCodeBulkActivateArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeBulkActivatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DiscountCodeBulkDeactivateArguments extends Arguments {
        DiscountCodeBulkDeactivateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The search query for filtering discounts.
        * <br><br>
        * For more information on the list of supported fields and search syntax, refer to the
        * [`codeDiscountNodes`](https://shopify.dev/docs/api/admin-graphql/latest/queries/codeDiscountNodes#qu
        * ery-arguments) query.
        */
        public DiscountCodeBulkDeactivateArguments search(String value) {
            if (value != null) {
                startArgument("search");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of the saved search for filtering discounts to deactivate. Saved searches represent [customer
        * segments](https://help.shopify.com/manual/customers/customer-segments) that merchants have built in
        * the Shopify admin.
        */
        public DiscountCodeBulkDeactivateArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The IDs of the discounts to deactivate.
        */
        public DiscountCodeBulkDeactivateArguments ids(List<ID> value) {
            if (value != null) {
                startArgument("ids");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface DiscountCodeBulkDeactivateArgumentsDefinition {
        void define(DiscountCodeBulkDeactivateArguments args);
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
    public MutationQuery discountCodeBulkDeactivate(DiscountCodeBulkDeactivatePayloadQueryDefinition queryDef) {
        return discountCodeBulkDeactivate(args -> {}, queryDef);
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
    public MutationQuery discountCodeBulkDeactivate(DiscountCodeBulkDeactivateArgumentsDefinition argsDef, DiscountCodeBulkDeactivatePayloadQueryDefinition queryDef) {
        startField("discountCodeBulkDeactivate");

        DiscountCodeBulkDeactivateArguments args = new DiscountCodeBulkDeactivateArguments(_queryBuilder);
        argsDef.define(args);
        DiscountCodeBulkDeactivateArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeBulkDeactivatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DiscountCodeBulkDeleteArguments extends Arguments {
        DiscountCodeBulkDeleteArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The search query for filtering discounts.
        * <br><br>
        * For more information on the list of supported fields and search syntax, refer to the
        * [`codeDiscountNodes`](https://shopify.dev/docs/api/admin-graphql/latest/queries/codeDiscountNodes#qu
        * ery-arguments) query.
        */
        public DiscountCodeBulkDeleteArguments search(String value) {
            if (value != null) {
                startArgument("search");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of the saved search for filtering discounts to delete. Saved searches represent [customer
        * segments](https://help.shopify.com/manual/customers/customer-segments) that merchants have built in
        * the Shopify admin.
        */
        public DiscountCodeBulkDeleteArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The IDs of the discounts to delete.
        */
        public DiscountCodeBulkDeleteArguments ids(List<ID> value) {
            if (value != null) {
                startArgument("ids");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface DiscountCodeBulkDeleteArgumentsDefinition {
        void define(DiscountCodeBulkDeleteArguments args);
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
    public MutationQuery discountCodeBulkDelete(DiscountCodeBulkDeletePayloadQueryDefinition queryDef) {
        return discountCodeBulkDelete(args -> {}, queryDef);
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
    public MutationQuery discountCodeBulkDelete(DiscountCodeBulkDeleteArgumentsDefinition argsDef, DiscountCodeBulkDeletePayloadQueryDefinition queryDef) {
        startField("discountCodeBulkDelete");

        DiscountCodeBulkDeleteArguments args = new DiscountCodeBulkDeleteArguments(_queryBuilder);
        argsDef.define(args);
        DiscountCodeBulkDeleteArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeBulkDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountCodeBxgyCreate(DiscountCodeBxgyInput bxgyCodeDiscount, DiscountCodeBxgyCreatePayloadQueryDefinition queryDef) {
        startField("discountCodeBxgyCreate");

        _queryBuilder.append("(bxgyCodeDiscount:");
        bxgyCodeDiscount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeBxgyCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountCodeBxgyUpdate(ID id, DiscountCodeBxgyInput bxgyCodeDiscount, DiscountCodeBxgyUpdatePayloadQueryDefinition queryDef) {
        startField("discountCodeBxgyUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",bxgyCodeDiscount:");
        bxgyCodeDiscount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeBxgyUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deactivates a code discount.
    */
    public MutationQuery discountCodeDeactivate(ID id, DiscountCodeDeactivatePayloadQueryDefinition queryDef) {
        startField("discountCodeDeactivate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeDeactivatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a
    * [code discount](https://help.shopify.com/manual/discounts/discount-types#discount-codes).
    */
    public MutationQuery discountCodeDelete(ID id, DiscountCodeDeletePayloadQueryDefinition queryDef) {
        startField("discountCodeDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountCodeFreeShippingCreate(DiscountCodeFreeShippingInput freeShippingCodeDiscount, DiscountCodeFreeShippingCreatePayloadQueryDefinition queryDef) {
        startField("discountCodeFreeShippingCreate");

        _queryBuilder.append("(freeShippingCodeDiscount:");
        freeShippingCodeDiscount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeFreeShippingCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountCodeFreeShippingUpdate(ID id, DiscountCodeFreeShippingInput freeShippingCodeDiscount, DiscountCodeFreeShippingUpdatePayloadQueryDefinition queryDef) {
        startField("discountCodeFreeShippingUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",freeShippingCodeDiscount:");
        freeShippingCodeDiscount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeFreeShippingUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DiscountCodeRedeemCodeBulkDeleteArguments extends Arguments {
        DiscountCodeRedeemCodeBulkDeleteArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators that you can use to
        * search for code discounts. You can apply one or more filters to a query. Learn more about
        * [Shopify API search syntax](https://shopify.dev/docs/api/usage/search-syntax).
        * For a list of accepted values for the `search` field, refer to the
        * [`query` argument on the `codeDiscountNodes`
        * query](https://shopify.dev/docs/api/admin-graphql/latest/queries/codeDiscountNodes#argument-query).
        */
        public DiscountCodeRedeemCodeBulkDeleteArguments search(String value) {
            if (value != null) {
                startArgument("search");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a
        * [saved search](https://shopify.dev/docs/api/admin-graphql/latest/objects/savedsearch#field-id).
        */
        public DiscountCodeRedeemCodeBulkDeleteArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The IDs of the
        * [`DiscountRedeemCode`](https://shopify.dev/docs/api/admin-graphql/latest/objects/discountredeemcode#
        * field-id)
        * objects to delete.
        * For example, `gid://shopify/DiscountRedeemCode/123`.
        * You can use the
        * [`codeDiscountNodes`
        * query](https://shopify.dev/docs/api/admin-graphql/latest/queries/codeDiscountNodes)
        * to retrieve the ID.
        */
        public DiscountCodeRedeemCodeBulkDeleteArguments ids(List<ID> value) {
            if (value != null) {
                startArgument("ids");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface DiscountCodeRedeemCodeBulkDeleteArgumentsDefinition {
        void define(DiscountCodeRedeemCodeBulkDeleteArguments args);
    }

    /**
    * Asynchronously delete
    * [discount codes](https://help.shopify.com/manual/discounts/discount-types#discount-codes)
    * in bulk that customers can use to redeem a discount.
    */
    public MutationQuery discountCodeRedeemCodeBulkDelete(ID discountId, DiscountCodeRedeemCodeBulkDeletePayloadQueryDefinition queryDef) {
        return discountCodeRedeemCodeBulkDelete(discountId, args -> {}, queryDef);
    }

    /**
    * Asynchronously delete
    * [discount codes](https://help.shopify.com/manual/discounts/discount-types#discount-codes)
    * in bulk that customers can use to redeem a discount.
    */
    public MutationQuery discountCodeRedeemCodeBulkDelete(ID discountId, DiscountCodeRedeemCodeBulkDeleteArgumentsDefinition argsDef, DiscountCodeRedeemCodeBulkDeletePayloadQueryDefinition queryDef) {
        startField("discountCodeRedeemCodeBulkDelete");

        _queryBuilder.append("(discountId:");
        Query.appendQuotedString(_queryBuilder, discountId.toString());

        argsDef.define(new DiscountCodeRedeemCodeBulkDeleteArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeRedeemCodeBulkDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery discountRedeemCodeBulkAdd(ID discountId, List<DiscountRedeemCodeInput> codes, DiscountRedeemCodeBulkAddPayloadQueryDefinition queryDef) {
        startField("discountRedeemCodeBulkAdd");

        _queryBuilder.append("(discountId:");
        Query.appendQuotedString(_queryBuilder, discountId.toString());

        _queryBuilder.append(",codes:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (DiscountRedeemCodeInput item1 : codes) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountRedeemCodeBulkAddPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a dispute evidence.
    */
    public MutationQuery disputeEvidenceUpdate(ID id, ShopifyPaymentsDisputeEvidenceUpdateInput input, DisputeEvidenceUpdatePayloadQueryDefinition queryDef) {
        startField("disputeEvidenceUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DisputeEvidenceUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DraftOrderBulkAddTagsArguments extends Arguments {
        DraftOrderBulkAddTagsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The conditions for filtering draft orders on.
        * See the detailed [search syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public DraftOrderBulkAddTagsArguments search(String value) {
            if (value != null) {
                startArgument("search");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of the draft order saved search for filtering draft orders on.
        */
        public DraftOrderBulkAddTagsArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The IDs of the draft orders to add tags to.
        */
        public DraftOrderBulkAddTagsArguments ids(List<ID> value) {
            if (value != null) {
                startArgument("ids");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface DraftOrderBulkAddTagsArgumentsDefinition {
        void define(DraftOrderBulkAddTagsArguments args);
    }

    /**
    * Adds tags to multiple draft orders.
    */
    public MutationQuery draftOrderBulkAddTags(List<String> tags, DraftOrderBulkAddTagsPayloadQueryDefinition queryDef) {
        return draftOrderBulkAddTags(tags, args -> {}, queryDef);
    }

    /**
    * Adds tags to multiple draft orders.
    */
    public MutationQuery draftOrderBulkAddTags(List<String> tags, DraftOrderBulkAddTagsArgumentsDefinition argsDef, DraftOrderBulkAddTagsPayloadQueryDefinition queryDef) {
        startField("draftOrderBulkAddTags");

        _queryBuilder.append("(tags:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : tags) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        argsDef.define(new DraftOrderBulkAddTagsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderBulkAddTagsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DraftOrderBulkDeleteArguments extends Arguments {
        DraftOrderBulkDeleteArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The conditions for filtering draft orders on.
        * See the detailed [search syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public DraftOrderBulkDeleteArguments search(String value) {
            if (value != null) {
                startArgument("search");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of the draft order saved search for filtering draft orders on.
        */
        public DraftOrderBulkDeleteArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The IDs of the draft orders to delete.
        */
        public DraftOrderBulkDeleteArguments ids(List<ID> value) {
            if (value != null) {
                startArgument("ids");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface DraftOrderBulkDeleteArgumentsDefinition {
        void define(DraftOrderBulkDeleteArguments args);
    }

    /**
    * Deletes multiple draft orders.
    */
    public MutationQuery draftOrderBulkDelete(DraftOrderBulkDeletePayloadQueryDefinition queryDef) {
        return draftOrderBulkDelete(args -> {}, queryDef);
    }

    /**
    * Deletes multiple draft orders.
    */
    public MutationQuery draftOrderBulkDelete(DraftOrderBulkDeleteArgumentsDefinition argsDef, DraftOrderBulkDeletePayloadQueryDefinition queryDef) {
        startField("draftOrderBulkDelete");

        DraftOrderBulkDeleteArguments args = new DraftOrderBulkDeleteArguments(_queryBuilder);
        argsDef.define(args);
        DraftOrderBulkDeleteArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderBulkDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DraftOrderBulkRemoveTagsArguments extends Arguments {
        DraftOrderBulkRemoveTagsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The conditions for filtering draft orders on.
        * See the detailed [search syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public DraftOrderBulkRemoveTagsArguments search(String value) {
            if (value != null) {
                startArgument("search");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of the draft order saved search for filtering draft orders on.
        */
        public DraftOrderBulkRemoveTagsArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The IDs of the draft orders to remove tags from.
        */
        public DraftOrderBulkRemoveTagsArguments ids(List<ID> value) {
            if (value != null) {
                startArgument("ids");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface DraftOrderBulkRemoveTagsArgumentsDefinition {
        void define(DraftOrderBulkRemoveTagsArguments args);
    }

    /**
    * Removes tags from multiple draft orders.
    */
    public MutationQuery draftOrderBulkRemoveTags(List<String> tags, DraftOrderBulkRemoveTagsPayloadQueryDefinition queryDef) {
        return draftOrderBulkRemoveTags(tags, args -> {}, queryDef);
    }

    /**
    * Removes tags from multiple draft orders.
    */
    public MutationQuery draftOrderBulkRemoveTags(List<String> tags, DraftOrderBulkRemoveTagsArgumentsDefinition argsDef, DraftOrderBulkRemoveTagsPayloadQueryDefinition queryDef) {
        startField("draftOrderBulkRemoveTags");

        _queryBuilder.append("(tags:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : tags) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        argsDef.define(new DraftOrderBulkRemoveTagsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderBulkRemoveTagsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Calculates the properties of a draft order. Useful for determining information
    * such as total taxes or price without actually creating a draft order.
    */
    public MutationQuery draftOrderCalculate(DraftOrderInput input, DraftOrderCalculatePayloadQueryDefinition queryDef) {
        startField("draftOrderCalculate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderCalculatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DraftOrderCompleteArguments extends Arguments {
        DraftOrderCompleteArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The gateway for the completed draft order.
        */
        public DraftOrderCompleteArguments paymentGatewayId(ID value) {
            if (value != null) {
                startArgument("paymentGatewayId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * A channel definition handle used for sales channel attribution.
        */
        public DraftOrderCompleteArguments sourceName(String value) {
            if (value != null) {
                startArgument("sourceName");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface DraftOrderCompleteArgumentsDefinition {
        void define(DraftOrderCompleteArguments args);
    }

    /**
    * Completes a [draft order](https://shopify.dev/docs/api/admin-graphql/latest/objects/DraftOrder) and
    * converts it into a [regular order](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order).
    * The order appears in the merchant's orders list, and the customer can be notified about their order.
    * Use the `draftOrderComplete` mutation when a merchant is ready to finalize a draft order and create
    * a real
    * order in their store. The `draftOrderComplete` mutation also supports sales channel attribution for
    * tracking
    * order sources using the
    * [`sourceName`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderComplete#argume
    * nts-sourceName)
    * argument, [cart validation](https://shopify.dev/docs/apps/build/checkout/cart-checkout-validation)
    * controls for app integrations, and detailed error reporting for failed completions.
    * You can complete a draft order with different [payment
    * scenarios](https://help.shopify.com/manual/fulfillment/managing-orders/payments):
    * - Mark the order as paid immediately.
    * - Set the order as payment pending using [payment
    * terms](https://shopify.dev/docs/api/admin-graphql/latest/objects/PaymentTerms).
    * - Specify a custom payment amount.
    * - Select a specific payment gateway.
    * > Note:
    * > When completing a draft order, inventory is
    * [reserved](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps#inventor
    * y-states)
    * for the items in the order. This means the items will no longer be available for other customers to
    * purchase.
    * Make sure to verify inventory availability before completing the draft order.
    */
    public MutationQuery draftOrderComplete(ID id, DraftOrderCompletePayloadQueryDefinition queryDef) {
        return draftOrderComplete(id, args -> {}, queryDef);
    }

    /**
    * Completes a [draft order](https://shopify.dev/docs/api/admin-graphql/latest/objects/DraftOrder) and
    * converts it into a [regular order](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order).
    * The order appears in the merchant's orders list, and the customer can be notified about their order.
    * Use the `draftOrderComplete` mutation when a merchant is ready to finalize a draft order and create
    * a real
    * order in their store. The `draftOrderComplete` mutation also supports sales channel attribution for
    * tracking
    * order sources using the
    * [`sourceName`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderComplete#argume
    * nts-sourceName)
    * argument, [cart validation](https://shopify.dev/docs/apps/build/checkout/cart-checkout-validation)
    * controls for app integrations, and detailed error reporting for failed completions.
    * You can complete a draft order with different [payment
    * scenarios](https://help.shopify.com/manual/fulfillment/managing-orders/payments):
    * - Mark the order as paid immediately.
    * - Set the order as payment pending using [payment
    * terms](https://shopify.dev/docs/api/admin-graphql/latest/objects/PaymentTerms).
    * - Specify a custom payment amount.
    * - Select a specific payment gateway.
    * > Note:
    * > When completing a draft order, inventory is
    * [reserved](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps#inventor
    * y-states)
    * for the items in the order. This means the items will no longer be available for other customers to
    * purchase.
    * Make sure to verify inventory availability before completing the draft order.
    */
    public MutationQuery draftOrderComplete(ID id, DraftOrderCompleteArgumentsDefinition argsDef, DraftOrderCompletePayloadQueryDefinition queryDef) {
        startField("draftOrderComplete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new DraftOrderCompleteArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderCompletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a [draft order](https://shopify.dev/docs/api/admin-graphql/latest/objects/DraftOrder)
    * with attributes such as customer information, line items, shipping and billing addresses, and
    * payment terms.
    * Draft orders are useful for merchants that need to:
    * - Create new orders for sales made by phone, in person, by chat, or elsewhere. When a merchant
    * accepts payment for a draft order, an order is created.
    * - Send invoices to customers with a secure checkout link.
    * - Use custom items to represent additional costs or products not in inventory.
    * - Re-create orders manually from active sales channels.
    * - Sell products at discount or wholesale rates.
    * - Take pre-orders.
    * After creating a draft order, you can:
    * - Send an invoice to the customer using the
    * [`draftOrderInvoiceSend`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderInvo
    * iceSend) mutation.
    * - Complete the draft order using the
    * [`draftOrderComplete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderComplet
    * e) mutation.
    * - Update the draft order using the
    * [`draftOrderUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderUpdate)
    * mutation.
    * - Duplicate a draft order using the
    * [`draftOrderDuplicate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderDuplic
    * ate) mutation.
    * - Delete the draft order using the
    * [`draftOrderDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderDelete)
    * mutation.
    * > Note:
    * > When you create a draft order, you can't [reserve or hold
    * inventory](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps#inventor
    * y-states) for the items in the order by default.
    * > However, you can reserve inventory using the
    * [`reserveInventoryUntil`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderCrea
    * te#arguments-input.fields.reserveInventoryUntil) input.
    */
    public MutationQuery draftOrderCreate(DraftOrderInput input, DraftOrderCreatePayloadQueryDefinition queryDef) {
        startField("draftOrderCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a draft order from order.
    */
    public MutationQuery draftOrderCreateFromOrder(ID orderId, DraftOrderCreateFromOrderPayloadQueryDefinition queryDef) {
        startField("draftOrderCreateFromOrder");

        _queryBuilder.append("(orderId:");
        Query.appendQuotedString(_queryBuilder, orderId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderCreateFromOrderPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a draft order.
    */
    public MutationQuery draftOrderDelete(DraftOrderDeleteInput input, DraftOrderDeletePayloadQueryDefinition queryDef) {
        startField("draftOrderDelete");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DraftOrderDuplicateArguments extends Arguments {
        DraftOrderDuplicateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The ID of the draft order to duplicate.
        */
        public DraftOrderDuplicateArguments id(ID value) {
            if (value != null) {
                startArgument("id");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface DraftOrderDuplicateArgumentsDefinition {
        void define(DraftOrderDuplicateArguments args);
    }

    /**
    * Duplicates a draft order.
    */
    public MutationQuery draftOrderDuplicate(DraftOrderDuplicatePayloadQueryDefinition queryDef) {
        return draftOrderDuplicate(args -> {}, queryDef);
    }

    /**
    * Duplicates a draft order.
    */
    public MutationQuery draftOrderDuplicate(DraftOrderDuplicateArgumentsDefinition argsDef, DraftOrderDuplicatePayloadQueryDefinition queryDef) {
        startField("draftOrderDuplicate");

        DraftOrderDuplicateArguments args = new DraftOrderDuplicateArguments(_queryBuilder);
        argsDef.define(args);
        DraftOrderDuplicateArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderDuplicatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DraftOrderInvoicePreviewArguments extends Arguments {
        DraftOrderInvoicePreviewArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Specifies the draft order invoice email fields.
        */
        public DraftOrderInvoicePreviewArguments email(EmailInput value) {
            if (value != null) {
                startArgument("email");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface DraftOrderInvoicePreviewArgumentsDefinition {
        void define(DraftOrderInvoicePreviewArguments args);
    }

    /**
    * Previews a draft order invoice email.
    */
    public MutationQuery draftOrderInvoicePreview(ID id, DraftOrderInvoicePreviewPayloadQueryDefinition queryDef) {
        return draftOrderInvoicePreview(id, args -> {}, queryDef);
    }

    /**
    * Previews a draft order invoice email.
    */
    public MutationQuery draftOrderInvoicePreview(ID id, DraftOrderInvoicePreviewArgumentsDefinition argsDef, DraftOrderInvoicePreviewPayloadQueryDefinition queryDef) {
        startField("draftOrderInvoicePreview");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new DraftOrderInvoicePreviewArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderInvoicePreviewPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DraftOrderInvoiceSendArguments extends Arguments {
        DraftOrderInvoiceSendArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Specifies the draft order invoice email fields.
        */
        public DraftOrderInvoiceSendArguments email(EmailInput value) {
            if (value != null) {
                startArgument("email");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface DraftOrderInvoiceSendArgumentsDefinition {
        void define(DraftOrderInvoiceSendArguments args);
    }

    /**
    * Sends an email invoice for a draft order.
    */
    public MutationQuery draftOrderInvoiceSend(ID id, DraftOrderInvoiceSendPayloadQueryDefinition queryDef) {
        return draftOrderInvoiceSend(id, args -> {}, queryDef);
    }

    /**
    * Sends an email invoice for a draft order.
    */
    public MutationQuery draftOrderInvoiceSend(ID id, DraftOrderInvoiceSendArgumentsDefinition argsDef, DraftOrderInvoiceSendPayloadQueryDefinition queryDef) {
        startField("draftOrderInvoiceSend");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new DraftOrderInvoiceSendArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderInvoiceSendPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery draftOrderUpdate(ID id, DraftOrderInput input, DraftOrderUpdatePayloadQueryDefinition queryDef) {
        startField("draftOrderUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates the server pixel to connect to an EventBridge endpoint.
    * Running this mutation deletes any previous subscriptions for the server pixel.
    */
    public MutationQuery eventBridgeServerPixelUpdate(String arn, EventBridgeServerPixelUpdatePayloadQueryDefinition queryDef) {
        startField("eventBridgeServerPixelUpdate");

        _queryBuilder.append("(arn:");
        Query.appendQuotedString(_queryBuilder, arn.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new EventBridgeServerPixelUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new Amazon EventBridge webhook subscription.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
    */
    public MutationQuery eventBridgeWebhookSubscriptionCreate(WebhookSubscriptionTopic topic, EventBridgeWebhookSubscriptionInput webhookSubscription, EventBridgeWebhookSubscriptionCreatePayloadQueryDefinition queryDef) {
        startField("eventBridgeWebhookSubscriptionCreate");

        _queryBuilder.append("(topic:");
        _queryBuilder.append(topic.toString());

        _queryBuilder.append(",webhookSubscription:");
        webhookSubscription.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new EventBridgeWebhookSubscriptionCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates an Amazon EventBridge webhook subscription.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
    */
    public MutationQuery eventBridgeWebhookSubscriptionUpdate(ID id, EventBridgeWebhookSubscriptionInput webhookSubscription, EventBridgeWebhookSubscriptionUpdatePayloadQueryDefinition queryDef) {
        startField("eventBridgeWebhookSubscriptionUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",webhookSubscription:");
        webhookSubscription.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new EventBridgeWebhookSubscriptionUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Acknowledges file update failure by resetting FAILED status to READY and clearing any media errors.
    */
    public MutationQuery fileAcknowledgeUpdateFailed(List<ID> fileIds, FileAcknowledgeUpdateFailedPayloadQueryDefinition queryDef) {
        startField("fileAcknowledgeUpdateFailed");

        _queryBuilder.append("(fileIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : fileIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FileAcknowledgeUpdateFailedPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates file assets for a store from external URLs or files that were previously uploaded using the
    * [`stagedUploadsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/stageduploadscre
    * ate)
    * mutation.
    * Use the `fileCreate` mutation to add various types of media and documents to your store. These files
    * are added to the
    * [**Files** page](https://shopify.com/admin/settings/files) in the Shopify admin and can be
    * referenced by other
    * resources in your store.
    * The `fileCreate` mutation supports multiple file types:
    * - **Images**: Product photos, variant images, and general store imagery
    * - **Videos**: Shopify-hosted videos for product demonstrations and marketing
    * - **External videos**: YouTube and Vimeo videos for enhanced product experiences
    * - **3D models**: Interactive 3D representations of products
    * - **Generic files**: PDFs, documents, and other file types for store resources
    * The mutation handles duplicate filenames using configurable resolution modes that automatically
    * append UUIDs,
    * replace existing files, or raise errors when conflicts occur.
    * > Note:
    * > Files are processed asynchronously. Check the
    * >
    * [`fileStatus`](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/File#fields-fileStatus)
    * > field to monitor processing completion. The maximum number of files that can be created in a
    * single batch is 250.
    * After creating files, you can make subsequent updates using the following mutations:
    * - [`fileUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/fileUpdate):
    * Update file properties such as alt text or replace file contents while preserving the same URL.
    * - [`fileDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/fileDelete):
    * Remove files from your store when they are no longer needed.
    * To list all files in your store, use the
    * [`files`](https://shopify.dev/docs/api/admin-graphql/latest/queries/files) query.
    * Learn how to manage
    * [product media and file assets](https://shopify.dev/docs/apps/build/online-store/product-media)
    * in your app.
    */
    public MutationQuery fileCreate(List<FileCreateInput> files, FileCreatePayloadQueryDefinition queryDef) {
        startField("fileCreate");

        _queryBuilder.append("(files:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (FileCreateInput item1 : files) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FileCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes file assets that were previously uploaded to your store.
    * Use the `fileDelete` mutation to permanently remove media and file assets from your store when they
    * are no longer needed.
    * This mutation handles the complete removal of files from both your store's file library and any
    * associated references
    * to products or other resources.
    * The `fileDelete` mutation supports removal of multiple file types:
    * - **Images**: Product photos, variant images, and general store imagery
    * - **Videos**: Shopify-hosted videos for product demonstrations and marketing content
    * - **External Videos**: YouTube and Vimeo videos linked to your products
    * - **3D models**: Interactive 3D representations of products
    * - **Generic files**: PDFs, documents, and other file types stored in your
    * [**Files** page](https://shopify.com/admin/settings/files)
    * When you delete files that are referenced by products, the mutation automatically removes those
    * references and
    * reorders any remaining media to maintain proper positioning. Product file references are database
    * relationships
    * managed through a media reference system, not just links in product descriptions. The Shopify admin
    * provides a UI
    * to manage these relationships, and when files are deleted, the system automatically cleans up all
    * references.
    * Files that are currently being processed by other operations are rejected to prevent conflicts.
    * > Caution:
    * > File deletion is permanent and can't be undone. When you delete a file that's being used in your
    * store,
    * > it will immediately stop appearing wherever it was displayed. For example, if you delete a product
    * image,
    * > that product will show a broken image or placeholder on your storefront and in the admin. The same
    * applies
    * > to any other files linked from themes, blog posts, or pages. Before deleting files, you can use
    * the
    * > [`files` query](https://shopify.dev/api/admin-graphql/latest/queries/files) to list and review
    * > your store's file assets.
    * Learn how to manage
    * [product media and file assets](https://shopify.dev/docs/apps/build/online-store/product-media)
    * in your app.
    */
    public MutationQuery fileDelete(List<ID> fileIds, FileDeletePayloadQueryDefinition queryDef) {
        startField("fileDelete");

        _queryBuilder.append("(fileIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : fileIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FileDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates properties, content, and metadata associated with an existing file asset that has already
    * been uploaded to Shopify.
    * Use the `fileUpdate` mutation to modify various aspects of files already stored in your store.
    * Files can be updated individually or in batches.
    * The `fileUpdate` mutation supports updating multiple file properties:
    * - **Alt text**: Update accessibility descriptions for images and other media.
    * - **File content**: Replace image or generic file content while maintaining the same URL.
    * - **Filename**: Modify file names (extension must match the original).
    * - **Product references**: Add or remove associations between files and products. Removing
    * file-product associations
    * deletes the file from the product's media gallery and clears the image from any product variants
    * that were using it.
    * The mutation handles different file types with specific capabilities:
    * - **Images**: Update preview images, original source, filename, and alt text.
    * - **Generic files**: Update original source, filename, and alt text.
    * - **Videos and 3D models**: Update alt text and product references.
    * > Note:
    * > Files must be in `ready` state before they can be updated. The mutation includes file locking to
    * prevent
    * > conflicts during updates. You can't simultaneously update both `originalSource` and
    * `previewImageSource`.
    * After updating files, you can use related mutations for additional file management:
    * - [`fileCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/fileCreate):
    * Create new file assets from external URLs or staged uploads.
    * - [`fileDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/fileDelete):
    * Remove files from your store when they are no longer needed.
    * Learn how to manage
    * [product media and file assets](https://shopify.dev/docs/apps/build/online-store/product-media)
    * in your app.
    */
    public MutationQuery fileUpdate(List<FileUpdateInput> files, FileUpdatePayloadQueryDefinition queryDef) {
        startField("fileUpdate");

        _queryBuilder.append("(files:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (FileUpdateInput item1 : files) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FileUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Generates a signature for a Flow action payload.
    */
    public MutationQuery flowGenerateSignature(ID id, String payload, FlowGenerateSignaturePayloadQueryDefinition queryDef) {
        startField("flowGenerateSignature");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",payload:");
        Query.appendQuotedString(_queryBuilder, payload.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FlowGenerateSignaturePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FlowTriggerReceiveArguments extends Arguments {
        FlowTriggerReceiveArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The handle of the trigger.
        */
        public FlowTriggerReceiveArguments handle(String value) {
            if (value != null) {
                startArgument("handle");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The payload needed to run the Trigger.
        */
        public FlowTriggerReceiveArguments payload(String value) {
            if (value != null) {
                startArgument("payload");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface FlowTriggerReceiveArgumentsDefinition {
        void define(FlowTriggerReceiveArguments args);
    }

    /**
    * Triggers any workflows that begin with the trigger specified in the request body. To learn more,
    * refer to [_Create Shopify Flow triggers_](https://shopify.dev/apps/flow/triggers).
    */
    public MutationQuery flowTriggerReceive(FlowTriggerReceivePayloadQueryDefinition queryDef) {
        return flowTriggerReceive(args -> {}, queryDef);
    }

    /**
    * Triggers any workflows that begin with the trigger specified in the request body. To learn more,
    * refer to [_Create Shopify Flow triggers_](https://shopify.dev/apps/flow/triggers).
    */
    public MutationQuery flowTriggerReceive(FlowTriggerReceiveArgumentsDefinition argsDef, FlowTriggerReceivePayloadQueryDefinition queryDef) {
        startField("flowTriggerReceive");

        FlowTriggerReceiveArguments args = new FlowTriggerReceiveArguments(_queryBuilder);
        argsDef.define(args);
        FlowTriggerReceiveArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FlowTriggerReceivePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Cancels a fulfillment.
    */
    public MutationQuery fulfillmentCancel(ID id, FulfillmentCancelPayloadQueryDefinition queryDef) {
        startField("fulfillmentCancel");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentCancelPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentConstraintRuleCreateArguments extends Arguments {
        FulfillmentConstraintRuleCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Metafields to associate to the fulfillment constraint rule.
        */
        public FulfillmentConstraintRuleCreateArguments metafields(List<MetafieldInput> value) {
            if (value != null) {
                startArgument("metafields");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (MetafieldInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface FulfillmentConstraintRuleCreateArgumentsDefinition {
        void define(FulfillmentConstraintRuleCreateArguments args);
    }

    /**
    * Creates a fulfillment constraint rule and its metafield.
    */
    public MutationQuery fulfillmentConstraintRuleCreate(String functionId, List<DeliveryMethodType> deliveryMethodTypes, FulfillmentConstraintRuleCreatePayloadQueryDefinition queryDef) {
        return fulfillmentConstraintRuleCreate(functionId, deliveryMethodTypes, args -> {}, queryDef);
    }

    /**
    * Creates a fulfillment constraint rule and its metafield.
    */
    public MutationQuery fulfillmentConstraintRuleCreate(String functionId, List<DeliveryMethodType> deliveryMethodTypes, FulfillmentConstraintRuleCreateArgumentsDefinition argsDef, FulfillmentConstraintRuleCreatePayloadQueryDefinition queryDef) {
        startField("fulfillmentConstraintRuleCreate");

        _queryBuilder.append("(functionId:");
        Query.appendQuotedString(_queryBuilder, functionId.toString());

        _queryBuilder.append(",deliveryMethodTypes:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (DeliveryMethodType item1 : deliveryMethodTypes) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                _queryBuilder.append(item1.toString());
            }
        }
        _queryBuilder.append(']');

        argsDef.define(new FulfillmentConstraintRuleCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentConstraintRuleCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a fulfillment constraint rule and its metafields.
    */
    public MutationQuery fulfillmentConstraintRuleDelete(ID id, FulfillmentConstraintRuleDeletePayloadQueryDefinition queryDef) {
        startField("fulfillmentConstraintRuleDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentConstraintRuleDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Update a fulfillment constraint rule.
    */
    public MutationQuery fulfillmentConstraintRuleUpdate(ID id, List<DeliveryMethodType> deliveryMethodTypes, FulfillmentConstraintRuleUpdatePayloadQueryDefinition queryDef) {
        startField("fulfillmentConstraintRuleUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",deliveryMethodTypes:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (DeliveryMethodType item1 : deliveryMethodTypes) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                _queryBuilder.append(item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentConstraintRuleUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentCreateArguments extends Arguments {
        FulfillmentCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * An optional message for the fulfillment request.
        */
        public FulfillmentCreateArguments message(String value) {
            if (value != null) {
                startArgument("message");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface FulfillmentCreateArgumentsDefinition {
        void define(FulfillmentCreateArguments args);
    }

    /**
    * Creates a fulfillment for one or many fulfillment orders.
    * The fulfillment orders are associated with the same order and are assigned to the same location.
    */
    public MutationQuery fulfillmentCreate(FulfillmentInput fulfillment, FulfillmentCreatePayloadQueryDefinition queryDef) {
        return fulfillmentCreate(fulfillment, args -> {}, queryDef);
    }

    /**
    * Creates a fulfillment for one or many fulfillment orders.
    * The fulfillment orders are associated with the same order and are assigned to the same location.
    */
    public MutationQuery fulfillmentCreate(FulfillmentInput fulfillment, FulfillmentCreateArgumentsDefinition argsDef, FulfillmentCreatePayloadQueryDefinition queryDef) {
        startField("fulfillmentCreate");

        _queryBuilder.append("(fulfillment:");
        fulfillment.appendTo(_queryBuilder);

        argsDef.define(new FulfillmentCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a fulfillment event for a specified fulfillment.
    */
    public MutationQuery fulfillmentEventCreate(FulfillmentEventInput fulfillmentEvent, FulfillmentEventCreatePayloadQueryDefinition queryDef) {
        startField("fulfillmentEventCreate");

        _queryBuilder.append("(fulfillmentEvent:");
        fulfillmentEvent.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentEventCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentOrderAcceptCancellationRequestArguments extends Arguments {
        FulfillmentOrderAcceptCancellationRequestArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * An optional reason for accepting the cancellation request.
        */
        public FulfillmentOrderAcceptCancellationRequestArguments message(String value) {
            if (value != null) {
                startArgument("message");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface FulfillmentOrderAcceptCancellationRequestArgumentsDefinition {
        void define(FulfillmentOrderAcceptCancellationRequestArguments args);
    }

    /**
    * Accept a cancellation request sent to a fulfillment service for a fulfillment order.
    */
    public MutationQuery fulfillmentOrderAcceptCancellationRequest(ID id, FulfillmentOrderAcceptCancellationRequestPayloadQueryDefinition queryDef) {
        return fulfillmentOrderAcceptCancellationRequest(id, args -> {}, queryDef);
    }

    /**
    * Accept a cancellation request sent to a fulfillment service for a fulfillment order.
    */
    public MutationQuery fulfillmentOrderAcceptCancellationRequest(ID id, FulfillmentOrderAcceptCancellationRequestArgumentsDefinition argsDef, FulfillmentOrderAcceptCancellationRequestPayloadQueryDefinition queryDef) {
        startField("fulfillmentOrderAcceptCancellationRequest");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new FulfillmentOrderAcceptCancellationRequestArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderAcceptCancellationRequestPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentOrderAcceptFulfillmentRequestArguments extends Arguments {
        FulfillmentOrderAcceptFulfillmentRequestArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * An optional reason for accepting the fulfillment request.
        */
        public FulfillmentOrderAcceptFulfillmentRequestArguments message(String value) {
            if (value != null) {
                startArgument("message");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The estimated date and time when the fulfillment order will be shipped.
        */
        public FulfillmentOrderAcceptFulfillmentRequestArguments estimatedShippedAt(String value) {
            if (value != null) {
                startArgument("estimatedShippedAt");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface FulfillmentOrderAcceptFulfillmentRequestArgumentsDefinition {
        void define(FulfillmentOrderAcceptFulfillmentRequestArguments args);
    }

    /**
    * Accepts a fulfillment request sent to a fulfillment service for a fulfillment order.
    */
    public MutationQuery fulfillmentOrderAcceptFulfillmentRequest(ID id, FulfillmentOrderAcceptFulfillmentRequestPayloadQueryDefinition queryDef) {
        return fulfillmentOrderAcceptFulfillmentRequest(id, args -> {}, queryDef);
    }

    /**
    * Accepts a fulfillment request sent to a fulfillment service for a fulfillment order.
    */
    public MutationQuery fulfillmentOrderAcceptFulfillmentRequest(ID id, FulfillmentOrderAcceptFulfillmentRequestArgumentsDefinition argsDef, FulfillmentOrderAcceptFulfillmentRequestPayloadQueryDefinition queryDef) {
        startField("fulfillmentOrderAcceptFulfillmentRequest");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new FulfillmentOrderAcceptFulfillmentRequestArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderAcceptFulfillmentRequestPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Marks a fulfillment order as canceled.
    */
    public MutationQuery fulfillmentOrderCancel(ID id, FulfillmentOrderCancelPayloadQueryDefinition queryDef) {
        startField("fulfillmentOrderCancel");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderCancelPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentOrderCloseArguments extends Arguments {
        FulfillmentOrderCloseArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * An optional reason for marking the fulfillment order as incomplete.
        */
        public FulfillmentOrderCloseArguments message(String value) {
            if (value != null) {
                startArgument("message");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface FulfillmentOrderCloseArgumentsDefinition {
        void define(FulfillmentOrderCloseArguments args);
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
    public MutationQuery fulfillmentOrderClose(ID id, FulfillmentOrderClosePayloadQueryDefinition queryDef) {
        return fulfillmentOrderClose(id, args -> {}, queryDef);
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
    public MutationQuery fulfillmentOrderClose(ID id, FulfillmentOrderCloseArgumentsDefinition argsDef, FulfillmentOrderClosePayloadQueryDefinition queryDef) {
        startField("fulfillmentOrderClose");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new FulfillmentOrderCloseArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderClosePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery fulfillmentOrderHold(ID id, FulfillmentOrderHoldInput fulfillmentHold, FulfillmentOrderHoldPayloadQueryDefinition queryDef) {
        startField("fulfillmentOrderHold");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",fulfillmentHold:");
        fulfillmentHold.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderHoldPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Mark line items associated with a fulfillment order as being ready for pickup by a customer.
    * Sends a Ready For Pickup notification to the customer to let them know that their order is ready
    * to be picked up.
    */
    public MutationQuery fulfillmentOrderLineItemsPreparedForPickup(FulfillmentOrderLineItemsPreparedForPickupInput input, FulfillmentOrderLineItemsPreparedForPickupPayloadQueryDefinition queryDef) {
        startField("fulfillmentOrderLineItemsPreparedForPickup");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderLineItemsPreparedForPickupPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Merges a set or multiple sets of fulfillment orders together into one based on
    * line item inputs and quantities.
    */
    public MutationQuery fulfillmentOrderMerge(List<FulfillmentOrderMergeInput> fulfillmentOrderMergeInputs, FulfillmentOrderMergePayloadQueryDefinition queryDef) {
        startField("fulfillmentOrderMerge");

        _queryBuilder.append("(fulfillmentOrderMergeInputs:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (FulfillmentOrderMergeInput item1 : fulfillmentOrderMergeInputs) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderMergePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentOrderMoveArguments extends Arguments {
        FulfillmentOrderMoveArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The fulfillment order line items to be moved.
        * If left blank, all unfulfilled line items belonging to the fulfillment order are moved.
        */
        public FulfillmentOrderMoveArguments fulfillmentOrderLineItems(List<FulfillmentOrderLineItemInput> value) {
            if (value != null) {
                startArgument("fulfillmentOrderLineItems");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FulfillmentOrderLineItemInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface FulfillmentOrderMoveArgumentsDefinition {
        void define(FulfillmentOrderMoveArguments args);
    }

    /**
    * Changes the location which is assigned to fulfill a number of unfulfilled fulfillment order line
    * items.
    * Moving a fulfillment order will fail in the following circumstances:
    * * The fulfillment order is closed.
    * * The destination location doesn't stock the requested inventory item.
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
    public MutationQuery fulfillmentOrderMove(ID id, ID newLocationId, FulfillmentOrderMovePayloadQueryDefinition queryDef) {
        return fulfillmentOrderMove(id, newLocationId, args -> {}, queryDef);
    }

    /**
    * Changes the location which is assigned to fulfill a number of unfulfilled fulfillment order line
    * items.
    * Moving a fulfillment order will fail in the following circumstances:
    * * The fulfillment order is closed.
    * * The destination location doesn't stock the requested inventory item.
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
    public MutationQuery fulfillmentOrderMove(ID id, ID newLocationId, FulfillmentOrderMoveArgumentsDefinition argsDef, FulfillmentOrderMovePayloadQueryDefinition queryDef) {
        startField("fulfillmentOrderMove");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",newLocationId:");
        Query.appendQuotedString(_queryBuilder, newLocationId.toString());

        argsDef.define(new FulfillmentOrderMoveArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderMovePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Marks a scheduled fulfillment order as open.
    */
    public MutationQuery fulfillmentOrderOpen(ID id, FulfillmentOrderOpenPayloadQueryDefinition queryDef) {
        startField("fulfillmentOrderOpen");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderOpenPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentOrderRejectCancellationRequestArguments extends Arguments {
        FulfillmentOrderRejectCancellationRequestArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * An optional reason for rejecting the cancellation request.
        */
        public FulfillmentOrderRejectCancellationRequestArguments message(String value) {
            if (value != null) {
                startArgument("message");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface FulfillmentOrderRejectCancellationRequestArgumentsDefinition {
        void define(FulfillmentOrderRejectCancellationRequestArguments args);
    }

    /**
    * Rejects a cancellation request sent to a fulfillment service for a fulfillment order.
    */
    public MutationQuery fulfillmentOrderRejectCancellationRequest(ID id, FulfillmentOrderRejectCancellationRequestPayloadQueryDefinition queryDef) {
        return fulfillmentOrderRejectCancellationRequest(id, args -> {}, queryDef);
    }

    /**
    * Rejects a cancellation request sent to a fulfillment service for a fulfillment order.
    */
    public MutationQuery fulfillmentOrderRejectCancellationRequest(ID id, FulfillmentOrderRejectCancellationRequestArgumentsDefinition argsDef, FulfillmentOrderRejectCancellationRequestPayloadQueryDefinition queryDef) {
        startField("fulfillmentOrderRejectCancellationRequest");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new FulfillmentOrderRejectCancellationRequestArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderRejectCancellationRequestPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentOrderRejectFulfillmentRequestArguments extends Arguments {
        FulfillmentOrderRejectFulfillmentRequestArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The reason for the fulfillment order rejection.
        */
        public FulfillmentOrderRejectFulfillmentRequestArguments reason(FulfillmentOrderRejectionReason value) {
            if (value != null) {
                startArgument("reason");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * An optional reason for rejecting the fulfillment request.
        */
        public FulfillmentOrderRejectFulfillmentRequestArguments message(String value) {
            if (value != null) {
                startArgument("message");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * An optional array of line item rejection details. If none are provided, all line items will be
        * assumed to be unfulfillable.
        * **Note**: After the fulfillment request has been rejected, none of the line items will be able to be
        * fulfilled. This field documents which line items specifically were unable to be fulfilled and why.
        */
        public FulfillmentOrderRejectFulfillmentRequestArguments lineItems(List<IncomingRequestLineItemInput> value) {
            if (value != null) {
                startArgument("lineItems");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (IncomingRequestLineItemInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface FulfillmentOrderRejectFulfillmentRequestArgumentsDefinition {
        void define(FulfillmentOrderRejectFulfillmentRequestArguments args);
    }

    /**
    * Rejects a fulfillment request sent to a fulfillment service for a fulfillment order.
    */
    public MutationQuery fulfillmentOrderRejectFulfillmentRequest(ID id, FulfillmentOrderRejectFulfillmentRequestPayloadQueryDefinition queryDef) {
        return fulfillmentOrderRejectFulfillmentRequest(id, args -> {}, queryDef);
    }

    /**
    * Rejects a fulfillment request sent to a fulfillment service for a fulfillment order.
    */
    public MutationQuery fulfillmentOrderRejectFulfillmentRequest(ID id, FulfillmentOrderRejectFulfillmentRequestArgumentsDefinition argsDef, FulfillmentOrderRejectFulfillmentRequestPayloadQueryDefinition queryDef) {
        startField("fulfillmentOrderRejectFulfillmentRequest");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new FulfillmentOrderRejectFulfillmentRequestArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderRejectFulfillmentRequestPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentOrderReleaseHoldArguments extends Arguments {
        FulfillmentOrderReleaseHoldArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The IDs of the fulfillment holds to release.<br/>
        * <br/>
        * Holds will only be released if they belong to the fulfillment order specified by the `id`
        * argument.<br/>
        * <br/>
        * <strong>NOTE:</strong> If not supplied, all holds for the fulfillment order will be released.
        * It is highly recommended that apps supply the ids of the holds that they intend to release.
        * Releasing all holds on a fulfillment order will result in the fulfillment order being released
        * prematurely
        * and items being incorrectly fulfilled.
        */
        public FulfillmentOrderReleaseHoldArguments holdIds(List<ID> value) {
            if (value != null) {
                startArgument("holdIds");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * A configurable ID used to track the automation system releasing this hold.
        */
        public FulfillmentOrderReleaseHoldArguments externalId(String value) {
            if (value != null) {
                startArgument("externalId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface FulfillmentOrderReleaseHoldArgumentsDefinition {
        void define(FulfillmentOrderReleaseHoldArguments args);
    }

    /**
    * Releases the fulfillment hold on a fulfillment order.
    */
    public MutationQuery fulfillmentOrderReleaseHold(ID id, FulfillmentOrderReleaseHoldPayloadQueryDefinition queryDef) {
        return fulfillmentOrderReleaseHold(id, args -> {}, queryDef);
    }

    /**
    * Releases the fulfillment hold on a fulfillment order.
    */
    public MutationQuery fulfillmentOrderReleaseHold(ID id, FulfillmentOrderReleaseHoldArgumentsDefinition argsDef, FulfillmentOrderReleaseHoldPayloadQueryDefinition queryDef) {
        startField("fulfillmentOrderReleaseHold");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new FulfillmentOrderReleaseHoldArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderReleaseHoldPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Reschedules a scheduled fulfillment order.
    * Updates the value of the `fulfillAt` field on a scheduled fulfillment order.
    * The fulfillment order will be marked as ready for fulfillment at this date and time.
    */
    public MutationQuery fulfillmentOrderReschedule(ID id, String fulfillAt, FulfillmentOrderReschedulePayloadQueryDefinition queryDef) {
        startField("fulfillmentOrderReschedule");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",fulfillAt:");
        Query.appendQuotedString(_queryBuilder, fulfillAt.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderReschedulePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Splits a fulfillment order or orders based on line item inputs and quantities.
    */
    public MutationQuery fulfillmentOrderSplit(List<FulfillmentOrderSplitInput> fulfillmentOrderSplits, FulfillmentOrderSplitPayloadQueryDefinition queryDef) {
        startField("fulfillmentOrderSplit");

        _queryBuilder.append("(fulfillmentOrderSplits:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (FulfillmentOrderSplitInput item1 : fulfillmentOrderSplits) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderSplitPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentOrderSubmitCancellationRequestArguments extends Arguments {
        FulfillmentOrderSubmitCancellationRequestArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * An optional reason for the cancellation request.
        */
        public FulfillmentOrderSubmitCancellationRequestArguments message(String value) {
            if (value != null) {
                startArgument("message");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface FulfillmentOrderSubmitCancellationRequestArgumentsDefinition {
        void define(FulfillmentOrderSubmitCancellationRequestArguments args);
    }

    /**
    * Sends a cancellation request to the fulfillment service of a fulfillment order.
    */
    public MutationQuery fulfillmentOrderSubmitCancellationRequest(ID id, FulfillmentOrderSubmitCancellationRequestPayloadQueryDefinition queryDef) {
        return fulfillmentOrderSubmitCancellationRequest(id, args -> {}, queryDef);
    }

    /**
    * Sends a cancellation request to the fulfillment service of a fulfillment order.
    */
    public MutationQuery fulfillmentOrderSubmitCancellationRequest(ID id, FulfillmentOrderSubmitCancellationRequestArgumentsDefinition argsDef, FulfillmentOrderSubmitCancellationRequestPayloadQueryDefinition queryDef) {
        startField("fulfillmentOrderSubmitCancellationRequest");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new FulfillmentOrderSubmitCancellationRequestArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderSubmitCancellationRequestPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentOrderSubmitFulfillmentRequestArguments extends Arguments {
        FulfillmentOrderSubmitFulfillmentRequestArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * An optional message for the fulfillment request.
        */
        public FulfillmentOrderSubmitFulfillmentRequestArguments message(String value) {
            if (value != null) {
                startArgument("message");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Whether the customer should be notified when fulfillments are created for this fulfillment order.
        */
        public FulfillmentOrderSubmitFulfillmentRequestArguments notifyCustomer(Boolean value) {
            if (value != null) {
                startArgument("notifyCustomer");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The fulfillment order line items to be requested for fulfillment.
        * If left blank, all line items of the fulfillment order are requested for fulfillment.
        */
        public FulfillmentOrderSubmitFulfillmentRequestArguments fulfillmentOrderLineItems(List<FulfillmentOrderLineItemInput> value) {
            if (value != null) {
                startArgument("fulfillmentOrderLineItems");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (FulfillmentOrderLineItemInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface FulfillmentOrderSubmitFulfillmentRequestArgumentsDefinition {
        void define(FulfillmentOrderSubmitFulfillmentRequestArguments args);
    }

    /**
    * Sends a fulfillment request to the fulfillment service of a fulfillment order.
    */
    public MutationQuery fulfillmentOrderSubmitFulfillmentRequest(ID id, FulfillmentOrderSubmitFulfillmentRequestPayloadQueryDefinition queryDef) {
        return fulfillmentOrderSubmitFulfillmentRequest(id, args -> {}, queryDef);
    }

    /**
    * Sends a fulfillment request to the fulfillment service of a fulfillment order.
    */
    public MutationQuery fulfillmentOrderSubmitFulfillmentRequest(ID id, FulfillmentOrderSubmitFulfillmentRequestArgumentsDefinition argsDef, FulfillmentOrderSubmitFulfillmentRequestPayloadQueryDefinition queryDef) {
        startField("fulfillmentOrderSubmitFulfillmentRequest");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new FulfillmentOrderSubmitFulfillmentRequestArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderSubmitFulfillmentRequestPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Sets the latest date and time by which the fulfillment orders need to be fulfilled.
    */
    public MutationQuery fulfillmentOrdersSetFulfillmentDeadline(List<ID> fulfillmentOrderIds, String fulfillmentDeadline, FulfillmentOrdersSetFulfillmentDeadlinePayloadQueryDefinition queryDef) {
        startField("fulfillmentOrdersSetFulfillmentDeadline");

        _queryBuilder.append("(fulfillmentOrderIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : fulfillmentOrderIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(",fulfillmentDeadline:");
        Query.appendQuotedString(_queryBuilder, fulfillmentDeadline.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrdersSetFulfillmentDeadlinePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentServiceCreateArguments extends Arguments {
        FulfillmentServiceCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Whether the fulfillment service provides tracking numbers for packages.
        */
        public FulfillmentServiceCreateArguments trackingSupport(Boolean value) {
            if (value != null) {
                startArgument("trackingSupport");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Whether the fulfillment service manages product inventory and provides updates to Shopify.
        */
        public FulfillmentServiceCreateArguments inventoryManagement(Boolean value) {
            if (value != null) {
                startArgument("inventoryManagement");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Whether the fulfillment service requires products to be physically shipped.
        */
        public FulfillmentServiceCreateArguments requiresShippingMethod(Boolean value) {
            if (value != null) {
                startArgument("requiresShippingMethod");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FulfillmentServiceCreateArgumentsDefinition {
        void define(FulfillmentServiceCreateArguments args);
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
    public MutationQuery fulfillmentServiceCreate(String name, String callbackUrl, FulfillmentServiceCreatePayloadQueryDefinition queryDef) {
        return fulfillmentServiceCreate(name, callbackUrl, args -> {}, queryDef);
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
    public MutationQuery fulfillmentServiceCreate(String name, String callbackUrl, FulfillmentServiceCreateArgumentsDefinition argsDef, FulfillmentServiceCreatePayloadQueryDefinition queryDef) {
        startField("fulfillmentServiceCreate");

        _queryBuilder.append("(name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(",callbackUrl:");
        Query.appendQuotedString(_queryBuilder, callbackUrl.toString());

        argsDef.define(new FulfillmentServiceCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentServiceCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentServiceDeleteArguments extends Arguments {
        FulfillmentServiceDeleteArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The ID of an active merchant managed location where inventory and commitments will be relocated
        * after the fulfillment service is deleted.
        * Inventory will only be transferred if the
        * [`TRANSFER`](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentServiceDeleteInventoryAct
        * ion#value-transfer)
        * inventory action has been chosen.
        */
        public FulfillmentServiceDeleteArguments destinationLocationId(ID value) {
            if (value != null) {
                startArgument("destinationLocationId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The action to take with the location after the fulfillment service is deleted.
        */
        public FulfillmentServiceDeleteArguments inventoryAction(FulfillmentServiceDeleteInventoryAction value) {
            if (value != null) {
                startArgument("inventoryAction");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface FulfillmentServiceDeleteArgumentsDefinition {
        void define(FulfillmentServiceDeleteArguments args);
    }

    /**
    * Deletes a fulfillment service.
    */
    public MutationQuery fulfillmentServiceDelete(ID id, FulfillmentServiceDeletePayloadQueryDefinition queryDef) {
        return fulfillmentServiceDelete(id, args -> {}, queryDef);
    }

    /**
    * Deletes a fulfillment service.
    */
    public MutationQuery fulfillmentServiceDelete(ID id, FulfillmentServiceDeleteArgumentsDefinition argsDef, FulfillmentServiceDeletePayloadQueryDefinition queryDef) {
        startField("fulfillmentServiceDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new FulfillmentServiceDeleteArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentServiceDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentServiceUpdateArguments extends Arguments {
        FulfillmentServiceUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The name of the fulfillment service.
        */
        public FulfillmentServiceUpdateArguments name(String value) {
            if (value != null) {
                startArgument("name");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The URL to send requests for the fulfillment service. The following considerations apply:
        * - Shopify queries the <code>callback_url/fetch_tracking_numbers</code> endpoint to retrieve tracking
        * numbers
        * for orders, if `trackingSupport` is set to `true`.
        * - Shopify queries the <code>callback_url/fetch_stock</code> endpoint to retrieve inventory levels,
        * if `inventoryManagement` is set to `true`.
        * - Shopify uses the <code>callback_url/fulfillment_order_notification</code> endpoint to send
        * [fulfillment and cancellation
        * requests](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments#step-2-r
        * eceive-fulfillment-requests-and-cancellations).
        */
        public FulfillmentServiceUpdateArguments callbackUrl(String value) {
            if (value != null) {
                startArgument("callbackUrl");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Whether the fulfillment service provides tracking numbers for packages.
        */
        public FulfillmentServiceUpdateArguments trackingSupport(Boolean value) {
            if (value != null) {
                startArgument("trackingSupport");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Whether the fulfillment service tracks product inventory and provides updates to Shopify.
        */
        public FulfillmentServiceUpdateArguments inventoryManagement(Boolean value) {
            if (value != null) {
                startArgument("inventoryManagement");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Whether the fulfillment service requires products to be physically shipped.
        */
        public FulfillmentServiceUpdateArguments requiresShippingMethod(Boolean value) {
            if (value != null) {
                startArgument("requiresShippingMethod");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FulfillmentServiceUpdateArgumentsDefinition {
        void define(FulfillmentServiceUpdateArguments args);
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
    public MutationQuery fulfillmentServiceUpdate(ID id, FulfillmentServiceUpdatePayloadQueryDefinition queryDef) {
        return fulfillmentServiceUpdate(id, args -> {}, queryDef);
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
    public MutationQuery fulfillmentServiceUpdate(ID id, FulfillmentServiceUpdateArgumentsDefinition argsDef, FulfillmentServiceUpdatePayloadQueryDefinition queryDef) {
        startField("fulfillmentServiceUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new FulfillmentServiceUpdateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentServiceUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentTrackingInfoUpdateArguments extends Arguments {
        FulfillmentTrackingInfoUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Whether the customer will be notified of this update and future updates for the fulfillment.
        * If this field is left blank, then notifications won't be sent to the customer when the fulfillment
        * is updated.
        */
        public FulfillmentTrackingInfoUpdateArguments notifyCustomer(Boolean value) {
            if (value != null) {
                startArgument("notifyCustomer");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FulfillmentTrackingInfoUpdateArgumentsDefinition {
        void define(FulfillmentTrackingInfoUpdateArguments args);
    }

    /**
    * Updates tracking information for a fulfillment.
    */
    public MutationQuery fulfillmentTrackingInfoUpdate(ID fulfillmentId, FulfillmentTrackingInput trackingInfoInput, FulfillmentTrackingInfoUpdatePayloadQueryDefinition queryDef) {
        return fulfillmentTrackingInfoUpdate(fulfillmentId, trackingInfoInput, args -> {}, queryDef);
    }

    /**
    * Updates tracking information for a fulfillment.
    */
    public MutationQuery fulfillmentTrackingInfoUpdate(ID fulfillmentId, FulfillmentTrackingInput trackingInfoInput, FulfillmentTrackingInfoUpdateArgumentsDefinition argsDef, FulfillmentTrackingInfoUpdatePayloadQueryDefinition queryDef) {
        startField("fulfillmentTrackingInfoUpdate");

        _queryBuilder.append("(fulfillmentId:");
        Query.appendQuotedString(_queryBuilder, fulfillmentId.toString());

        _queryBuilder.append(",trackingInfoInput:");
        trackingInfoInput.appendTo(_queryBuilder);

        argsDef.define(new FulfillmentTrackingInfoUpdateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentTrackingInfoUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Create a gift card.
    */
    public MutationQuery giftCardCreate(GiftCardCreateInput input, GiftCardCreatePayloadQueryDefinition queryDef) {
        startField("giftCardCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GiftCardCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Credit a gift card.
    */
    public MutationQuery giftCardCredit(ID id, GiftCardCreditInput creditInput, GiftCardCreditPayloadQueryDefinition queryDef) {
        startField("giftCardCredit");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",creditInput:");
        creditInput.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GiftCardCreditPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deactivate a gift card. A deactivated gift card cannot be used by a customer.
    * A deactivated gift card cannot be re-enabled.
    */
    public MutationQuery giftCardDeactivate(ID id, GiftCardDeactivatePayloadQueryDefinition queryDef) {
        startField("giftCardDeactivate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GiftCardDeactivatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Debit a gift card.
    */
    public MutationQuery giftCardDebit(ID id, GiftCardDebitInput debitInput, GiftCardDebitPayloadQueryDefinition queryDef) {
        startField("giftCardDebit");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",debitInput:");
        debitInput.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GiftCardDebitPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Send notification to the customer of a gift card.
    */
    public MutationQuery giftCardSendNotificationToCustomer(ID id, GiftCardSendNotificationToCustomerPayloadQueryDefinition queryDef) {
        startField("giftCardSendNotificationToCustomer");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GiftCardSendNotificationToCustomerPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Send notification to the recipient of a gift card.
    */
    public MutationQuery giftCardSendNotificationToRecipient(ID id, GiftCardSendNotificationToRecipientPayloadQueryDefinition queryDef) {
        startField("giftCardSendNotificationToRecipient");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GiftCardSendNotificationToRecipientPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Update a gift card.
    */
    public MutationQuery giftCardUpdate(ID id, GiftCardUpdateInput input, GiftCardUpdatePayloadQueryDefinition queryDef) {
        startField("giftCardUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GiftCardUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class InventoryActivateArguments extends Arguments {
        InventoryActivateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The initial available quantity of the inventory item being activated at the location.
        */
        public InventoryActivateArguments available(Integer value) {
            if (value != null) {
                startArgument("available");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The initial on_hand quantity of the inventory item being activated at the location.
        */
        public InventoryActivateArguments onHand(Integer value) {
            if (value != null) {
                startArgument("onHand");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Allow activation at or away from fulfillment service location with sku sharing off. This will
        * deactivate inventory at all other locations.
        */
        public InventoryActivateArguments stockAtLegacyLocation(Boolean value) {
            if (value != null) {
                startArgument("stockAtLegacyLocation");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface InventoryActivateArgumentsDefinition {
        void define(InventoryActivateArguments args);
    }

    /**
    * Activate an inventory item at a location.
    */
    public MutationQuery inventoryActivate(ID inventoryItemId, ID locationId, InventoryActivatePayloadQueryDefinition queryDef) {
        return inventoryActivate(inventoryItemId, locationId, args -> {}, queryDef);
    }

    /**
    * Activate an inventory item at a location.
    */
    public MutationQuery inventoryActivate(ID inventoryItemId, ID locationId, InventoryActivateArgumentsDefinition argsDef, InventoryActivatePayloadQueryDefinition queryDef) {
        startField("inventoryActivate");

        _queryBuilder.append("(inventoryItemId:");
        Query.appendQuotedString(_queryBuilder, inventoryItemId.toString());

        _queryBuilder.append(",locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

        argsDef.define(new InventoryActivateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryActivatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Apply changes to inventory quantities.
    */
    public MutationQuery inventoryAdjustQuantities(InventoryAdjustQuantitiesInput input, InventoryAdjustQuantitiesPayloadQueryDefinition queryDef) {
        startField("inventoryAdjustQuantities");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryAdjustQuantitiesPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Modify the activation status of an inventory item at locations. Activating an inventory item at a
    * particular location allows that location to stock that inventory item. Deactivating an inventory
    * item at a location removes the inventory item's quantities and turns off the inventory item from
    * that location.
    */
    public MutationQuery inventoryBulkToggleActivation(ID inventoryItemId, List<InventoryBulkToggleActivationInput> inventoryItemUpdates, InventoryBulkToggleActivationPayloadQueryDefinition queryDef) {
        startField("inventoryBulkToggleActivation");

        _queryBuilder.append("(inventoryItemId:");
        Query.appendQuotedString(_queryBuilder, inventoryItemId.toString());

        _queryBuilder.append(",inventoryItemUpdates:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (InventoryBulkToggleActivationInput item1 : inventoryItemUpdates) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryBulkToggleActivationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Removes an inventory item's quantities from a location, and turns off inventory at the location.
    */
    public MutationQuery inventoryDeactivate(ID inventoryLevelId, InventoryDeactivatePayloadQueryDefinition queryDef) {
        startField("inventoryDeactivate");

        _queryBuilder.append("(inventoryLevelId:");
        Query.appendQuotedString(_queryBuilder, inventoryLevelId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryDeactivatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates an inventory item.
    */
    public MutationQuery inventoryItemUpdate(ID id, InventoryItemInput input, InventoryItemUpdatePayloadQueryDefinition queryDef) {
        startField("inventoryItemUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryItemUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Moves inventory between inventory quantity names at a single location.
    */
    public MutationQuery inventoryMoveQuantities(InventoryMoveQuantitiesInput input, InventoryMoveQuantitiesPayloadQueryDefinition queryDef) {
        startField("inventoryMoveQuantities");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryMoveQuantitiesPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery inventorySetQuantities(InventorySetQuantitiesInput input, InventorySetQuantitiesPayloadQueryDefinition queryDef) {
        startField("inventorySetQuantities");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventorySetQuantitiesPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Set up scheduled changes of inventory items.
    */
    public MutationQuery inventorySetScheduledChanges(InventorySetScheduledChangesInput input, InventorySetScheduledChangesPayloadQueryDefinition queryDef) {
        startField("inventorySetScheduledChanges");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventorySetScheduledChangesPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds items to an inventory shipment.
    */
    public MutationQuery inventoryShipmentAddItems(ID id, List<InventoryShipmentLineItemInput> lineItems, InventoryShipmentAddItemsPayloadQueryDefinition queryDef) {
        startField("inventoryShipmentAddItems");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",lineItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (InventoryShipmentLineItemInput item1 : lineItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentAddItemsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds a draft shipment to an inventory transfer.
    */
    public MutationQuery inventoryShipmentCreate(InventoryShipmentCreateInput input, InventoryShipmentCreatePayloadQueryDefinition queryDef) {
        startField("inventoryShipmentCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds an in-transit shipment to an inventory transfer.
    */
    public MutationQuery inventoryShipmentCreateInTransit(InventoryShipmentCreateInput input, InventoryShipmentCreateInTransitPayloadQueryDefinition queryDef) {
        startField("inventoryShipmentCreateInTransit");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentCreateInTransitPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes an inventory shipment. Only draft shipments can be deleted.
    */
    public MutationQuery inventoryShipmentDelete(ID id, InventoryShipmentDeletePayloadQueryDefinition queryDef) {
        startField("inventoryShipmentDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Marks a draft inventory shipment as in transit.
    */
    public MutationQuery inventoryShipmentMarkInTransit(ID id, InventoryShipmentMarkInTransitPayloadQueryDefinition queryDef) {
        startField("inventoryShipmentMarkInTransit");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentMarkInTransitPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class InventoryShipmentReceiveArguments extends Arguments {
        InventoryShipmentReceiveArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The list of receive line items for the inventory shipment.
        */
        public InventoryShipmentReceiveArguments lineItems(List<InventoryShipmentReceiveItemInput> value) {
            if (value != null) {
                startArgument("lineItems");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (InventoryShipmentReceiveItemInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The bulk receive action for the inventory shipment.
        */
        public InventoryShipmentReceiveArguments bulkReceiveAction(InventoryShipmentReceiveLineItemReason value) {
            if (value != null) {
                startArgument("bulkReceiveAction");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface InventoryShipmentReceiveArgumentsDefinition {
        void define(InventoryShipmentReceiveArguments args);
    }

    /**
    * Receive an inventory shipment.
    */
    public MutationQuery inventoryShipmentReceive(ID id, InventoryShipmentReceivePayloadQueryDefinition queryDef) {
        return inventoryShipmentReceive(id, args -> {}, queryDef);
    }

    /**
    * Receive an inventory shipment.
    */
    public MutationQuery inventoryShipmentReceive(ID id, InventoryShipmentReceiveArgumentsDefinition argsDef, InventoryShipmentReceivePayloadQueryDefinition queryDef) {
        startField("inventoryShipmentReceive");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new InventoryShipmentReceiveArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentReceivePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Remove items from an inventory shipment.
    */
    public MutationQuery inventoryShipmentRemoveItems(ID id, List<ID> lineItems, InventoryShipmentRemoveItemsPayloadQueryDefinition queryDef) {
        startField("inventoryShipmentRemoveItems");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",lineItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : lineItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentRemoveItemsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Edits the tracking info on an inventory shipment.
    */
    public MutationQuery inventoryShipmentSetTracking(ID id, InventoryShipmentTrackingInput tracking, InventoryShipmentSetTrackingPayloadQueryDefinition queryDef) {
        startField("inventoryShipmentSetTracking");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",tracking:");
        tracking.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentSetTrackingPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class InventoryShipmentUpdateItemQuantitiesArguments extends Arguments {
        InventoryShipmentUpdateItemQuantitiesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The list of line items to be updated to the shipment.
        */
        public InventoryShipmentUpdateItemQuantitiesArguments items(List<InventoryShipmentUpdateItemQuantitiesInput> value) {
            if (value != null) {
                startArgument("items");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (InventoryShipmentUpdateItemQuantitiesInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface InventoryShipmentUpdateItemQuantitiesArgumentsDefinition {
        void define(InventoryShipmentUpdateItemQuantitiesArguments args);
    }

    /**
    * Updates items on an inventory shipment.
    */
    public MutationQuery inventoryShipmentUpdateItemQuantities(ID id, InventoryShipmentUpdateItemQuantitiesPayloadQueryDefinition queryDef) {
        return inventoryShipmentUpdateItemQuantities(id, args -> {}, queryDef);
    }

    /**
    * Updates items on an inventory shipment.
    */
    public MutationQuery inventoryShipmentUpdateItemQuantities(ID id, InventoryShipmentUpdateItemQuantitiesArgumentsDefinition argsDef, InventoryShipmentUpdateItemQuantitiesPayloadQueryDefinition queryDef) {
        startField("inventoryShipmentUpdateItemQuantities");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new InventoryShipmentUpdateItemQuantitiesArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentUpdateItemQuantitiesPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Cancels an inventory transfer.
    */
    public MutationQuery inventoryTransferCancel(ID id, InventoryTransferCancelPayloadQueryDefinition queryDef) {
        startField("inventoryTransferCancel");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferCancelPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates an inventory transfer.
    */
    public MutationQuery inventoryTransferCreate(InventoryTransferCreateInput input, InventoryTransferCreatePayloadQueryDefinition queryDef) {
        startField("inventoryTransferCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates an inventory transfer in ready to ship.
    */
    public MutationQuery inventoryTransferCreateAsReadyToShip(InventoryTransferCreateAsReadyToShipInput input, InventoryTransferCreateAsReadyToShipPayloadQueryDefinition queryDef) {
        startField("inventoryTransferCreateAsReadyToShip");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferCreateAsReadyToShipPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes an inventory transfer.
    */
    public MutationQuery inventoryTransferDelete(ID id, InventoryTransferDeletePayloadQueryDefinition queryDef) {
        startField("inventoryTransferDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * This mutation allows duplicating an existing inventory transfer. The duplicated transfer will have
    * the same
    * line items and quantities as the original transfer, but will be in a draft state with no shipments.
    */
    public MutationQuery inventoryTransferDuplicate(ID id, InventoryTransferDuplicatePayloadQueryDefinition queryDef) {
        startField("inventoryTransferDuplicate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferDuplicatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Edits an inventory transfer.
    */
    public MutationQuery inventoryTransferEdit(ID id, InventoryTransferEditInput input, InventoryTransferEditPayloadQueryDefinition queryDef) {
        startField("inventoryTransferEdit");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferEditPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Sets an inventory transfer to ready to ship.
    */
    public MutationQuery inventoryTransferMarkAsReadyToShip(ID id, InventoryTransferMarkAsReadyToShipPayloadQueryDefinition queryDef) {
        startField("inventoryTransferMarkAsReadyToShip");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferMarkAsReadyToShipPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * This mutation allows removing the shippable quantities of line items on a Transfer.
    * It removes all quantities of the item from the transfer that are not associated with shipments.
    */
    public MutationQuery inventoryTransferRemoveItems(InventoryTransferRemoveItemsInput input, InventoryTransferRemoveItemsPayloadQueryDefinition queryDef) {
        startField("inventoryTransferRemoveItems");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferRemoveItemsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * This mutation allows for the setting of line items on a Transfer. Will replace the items already
    * set, if any.
    */
    public MutationQuery inventoryTransferSetItems(InventoryTransferSetItemsInput input, InventoryTransferSetItemsPayloadQueryDefinition queryDef) {
        startField("inventoryTransferSetItems");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferSetItemsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Activates a location so that you can stock inventory at the location. Refer to the
    * [`isActive`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location#field-isactive) and
    * [`activatable`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location#field-activatable
    * )
    * fields on the `Location` object.
    */
    public MutationQuery locationActivate(ID locationId, LocationActivatePayloadQueryDefinition queryDef) {
        startField("locationActivate");

        _queryBuilder.append("(locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new LocationActivatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds a new location.
    */
    public MutationQuery locationAdd(LocationAddInput input, LocationAddPayloadQueryDefinition queryDef) {
        startField("locationAdd");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new LocationAddPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LocationDeactivateArguments extends Arguments {
        LocationDeactivateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The ID of a destination location to which inventory, pending orders and moving transfers will be
        * moved from the location to deactivate.
        */
        public LocationDeactivateArguments destinationLocationId(ID value) {
            if (value != null) {
                startArgument("destinationLocationId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface LocationDeactivateArgumentsDefinition {
        void define(LocationDeactivateArguments args);
    }

    /**
    * Deactivates a location and moves inventory, pending orders, and moving transfers to a destination
    * location.
    */
    public MutationQuery locationDeactivate(ID locationId, LocationDeactivatePayloadQueryDefinition queryDef) {
        return locationDeactivate(locationId, args -> {}, queryDef);
    }

    /**
    * Deactivates a location and moves inventory, pending orders, and moving transfers to a destination
    * location.
    */
    public MutationQuery locationDeactivate(ID locationId, LocationDeactivateArgumentsDefinition argsDef, LocationDeactivatePayloadQueryDefinition queryDef) {
        startField("locationDeactivate");

        _queryBuilder.append("(locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

        argsDef.define(new LocationDeactivateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new LocationDeactivatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a location.
    */
    public MutationQuery locationDelete(ID locationId, LocationDeletePayloadQueryDefinition queryDef) {
        startField("locationDelete");

        _queryBuilder.append("(locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new LocationDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Edits an existing location.
    * [As of the 2023-10 API
    * version](https://shopify.dev/changelog/apps-can-now-change-the-name-and-address-of-their-fulfillment
    * -service-locations), apps can change the name and address of their fulfillment service locations.
    */
    public MutationQuery locationEdit(ID id, LocationEditInput input, LocationEditPayloadQueryDefinition queryDef) {
        startField("locationEdit");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new LocationEditPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Disables local pickup for a location.
    */
    public MutationQuery locationLocalPickupDisable(ID locationId, LocationLocalPickupDisablePayloadQueryDefinition queryDef) {
        startField("locationLocalPickupDisable");

        _queryBuilder.append("(locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new LocationLocalPickupDisablePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Enables local pickup for a location.
    */
    public MutationQuery locationLocalPickupEnable(DeliveryLocationLocalPickupEnableInput localPickupSettings, LocationLocalPickupEnablePayloadQueryDefinition queryDef) {
        startField("locationLocalPickupEnable");

        _queryBuilder.append("(localPickupSettings:");
        localPickupSettings.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new LocationLocalPickupEnablePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new market.
    */
    public MutationQuery marketCreate(MarketCreateInput input, MarketCreatePayloadQueryDefinition queryDef) {
        startField("marketCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates currency settings of a market.
    */
    public MutationQuery marketCurrencySettingsUpdate(ID marketId, MarketCurrencySettingsUpdateInput input, MarketCurrencySettingsUpdatePayloadQueryDefinition queryDef) {
        startField("marketCurrencySettingsUpdate");

        _queryBuilder.append("(marketId:");
        Query.appendQuotedString(_queryBuilder, marketId.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketCurrencySettingsUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a market definition.
    */
    public MutationQuery marketDelete(ID id, MarketDeletePayloadQueryDefinition queryDef) {
        startField("marketDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates or updates market localizations.
    */
    public MutationQuery marketLocalizationsRegister(ID resourceId, List<MarketLocalizationRegisterInput> marketLocalizations, MarketLocalizationsRegisterPayloadQueryDefinition queryDef) {
        startField("marketLocalizationsRegister");

        _queryBuilder.append("(resourceId:");
        Query.appendQuotedString(_queryBuilder, resourceId.toString());

        _queryBuilder.append(",marketLocalizations:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (MarketLocalizationRegisterInput item1 : marketLocalizations) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketLocalizationsRegisterPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes market localizations.
    */
    public MutationQuery marketLocalizationsRemove(ID resourceId, List<String> marketLocalizationKeys, List<ID> marketIds, MarketLocalizationsRemovePayloadQueryDefinition queryDef) {
        startField("marketLocalizationsRemove");

        _queryBuilder.append("(resourceId:");
        Query.appendQuotedString(_queryBuilder, resourceId.toString());

        _queryBuilder.append(",marketLocalizationKeys:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : marketLocalizationKeys) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(",marketIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : marketIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketLocalizationsRemovePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates the properties of a market.
    */
    public MutationQuery marketUpdate(ID id, MarketUpdateInput input, MarketUpdatePayloadQueryDefinition queryDef) {
        startField("marketUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes all external marketing activities. Deletion is performed by a background job, as it may take
    * a bit of time to complete if a large number of activities are to be deleted. Attempting to create or
    * modify external activities before the job has completed will result in the create/update/upsert
    * mutation returning an error.
    */
    public MutationQuery marketingActivitiesDeleteAllExternal(MarketingActivitiesDeleteAllExternalPayloadQueryDefinition queryDef) {
        startField("marketingActivitiesDeleteAllExternal");

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivitiesDeleteAllExternalPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Create new marketing activity. Marketing activity app extensions are deprecated and will be removed
    * in the near future.
    */
    public MutationQuery marketingActivityCreate(MarketingActivityCreateInput input, MarketingActivityCreatePayloadQueryDefinition queryDef) {
        startField("marketingActivityCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new external marketing activity.
    */
    public MutationQuery marketingActivityCreateExternal(MarketingActivityCreateExternalInput input, MarketingActivityCreateExternalPayloadQueryDefinition queryDef) {
        startField("marketingActivityCreateExternal");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityCreateExternalPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MarketingActivityDeleteExternalArguments extends Arguments {
        MarketingActivityDeleteExternalArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The ID of the marketing activity. A marketing activity ID or remote ID must be provided.
        */
        public MarketingActivityDeleteExternalArguments marketingActivityId(ID value) {
            if (value != null) {
                startArgument("marketingActivityId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * A custom unique identifier for the marketing activity, which can be used to manage the activity and
        * send engagement metrics without having to store our marketing activity ID in your systems. A
        * marketing activity ID or remote ID must be provided.
        */
        public MarketingActivityDeleteExternalArguments remoteId(String value) {
            if (value != null) {
                startArgument("remoteId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MarketingActivityDeleteExternalArgumentsDefinition {
        void define(MarketingActivityDeleteExternalArguments args);
    }

    /**
    * Deletes an external marketing activity.
    */
    public MutationQuery marketingActivityDeleteExternal(MarketingActivityDeleteExternalPayloadQueryDefinition queryDef) {
        return marketingActivityDeleteExternal(args -> {}, queryDef);
    }

    /**
    * Deletes an external marketing activity.
    */
    public MutationQuery marketingActivityDeleteExternal(MarketingActivityDeleteExternalArgumentsDefinition argsDef, MarketingActivityDeleteExternalPayloadQueryDefinition queryDef) {
        startField("marketingActivityDeleteExternal");

        MarketingActivityDeleteExternalArguments args = new MarketingActivityDeleteExternalArguments(_queryBuilder);
        argsDef.define(args);
        MarketingActivityDeleteExternalArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityDeleteExternalPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a marketing activity with the latest information. Marketing activity app extensions are
    * deprecated and will be removed in the near future.
    */
    public MutationQuery marketingActivityUpdate(MarketingActivityUpdateInput input, MarketingActivityUpdatePayloadQueryDefinition queryDef) {
        startField("marketingActivityUpdate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MarketingActivityUpdateExternalArguments extends Arguments {
        MarketingActivityUpdateExternalArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The ID of the marketing activity. Specify either the marketing activity ID, remote ID, or UTM to
        * update the marketing activity.
        */
        public MarketingActivityUpdateExternalArguments marketingActivityId(ID value) {
            if (value != null) {
                startArgument("marketingActivityId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * A custom unique identifier for the marketing activity, which can be used to manage the activity and
        * send engagement metrics without having to store our marketing activity ID in your systems. Specify
        * either the marketing activity ID, remote ID, or UTM to update the marketing activity.
        */
        public MarketingActivityUpdateExternalArguments remoteId(String value) {
            if (value != null) {
                startArgument("remoteId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Specifies the [Urchin Traffic Module (UTM) parameters](https://en.wikipedia.org/wiki/UTM_parameters)
        * that are associated with a related marketing campaign. Specify either the marketing activity ID,
        * remote ID, or UTM to update the marketing activity.
        */
        public MarketingActivityUpdateExternalArguments utm(UTMInput value) {
            if (value != null) {
                startArgument("utm");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface MarketingActivityUpdateExternalArgumentsDefinition {
        void define(MarketingActivityUpdateExternalArguments args);
    }

    /**
    * Update an external marketing activity.
    */
    public MutationQuery marketingActivityUpdateExternal(MarketingActivityUpdateExternalInput input, MarketingActivityUpdateExternalPayloadQueryDefinition queryDef) {
        return marketingActivityUpdateExternal(input, args -> {}, queryDef);
    }

    /**
    * Update an external marketing activity.
    */
    public MutationQuery marketingActivityUpdateExternal(MarketingActivityUpdateExternalInput input, MarketingActivityUpdateExternalArgumentsDefinition argsDef, MarketingActivityUpdateExternalPayloadQueryDefinition queryDef) {
        startField("marketingActivityUpdateExternal");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        argsDef.define(new MarketingActivityUpdateExternalArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityUpdateExternalPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new external marketing activity or updates an existing one. When optional fields are
    * absent or null, associated information will be removed from an existing marketing activity.
    */
    public MutationQuery marketingActivityUpsertExternal(MarketingActivityUpsertExternalInput input, MarketingActivityUpsertExternalPayloadQueryDefinition queryDef) {
        startField("marketingActivityUpsertExternal");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityUpsertExternalPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MarketingEngagementCreateArguments extends Arguments {
        MarketingEngagementCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The identifier of the marketing activity for which the engagement metrics are being provided. This
        * or the remoteId should be set when and only when providing activity-level engagements. This should
        * be nil when providing channel-level engagements.
        */
        public MarketingEngagementCreateArguments marketingActivityId(ID value) {
            if (value != null) {
                startArgument("marketingActivityId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * A custom unique identifier for the marketing activity, which can be used to manage the activity and
        * send engagement metrics without having to store our marketing activity ID in your systems. This or
        * the marketingActivityId should be set when and only when providing activity-level engagements. This
        * should be nil when providing channel-level engagements.
        */
        public MarketingEngagementCreateArguments remoteId(String value) {
            if (value != null) {
                startArgument("remoteId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The unique string identifier of the channel to which the engagement metrics are being provided. This
        * should be set when and only when providing channel-level engagements. This should be nil when
        * providing activity-level engagements. For the correct handle for your channel, contact your partner
        * manager.
        */
        public MarketingEngagementCreateArguments channelHandle(String value) {
            if (value != null) {
                startArgument("channelHandle");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MarketingEngagementCreateArgumentsDefinition {
        void define(MarketingEngagementCreateArguments args);
    }

    /**
    * Creates a new marketing engagement for a marketing activity or a marketing channel.
    */
    public MutationQuery marketingEngagementCreate(MarketingEngagementInput marketingEngagement, MarketingEngagementCreatePayloadQueryDefinition queryDef) {
        return marketingEngagementCreate(marketingEngagement, args -> {}, queryDef);
    }

    /**
    * Creates a new marketing engagement for a marketing activity or a marketing channel.
    */
    public MutationQuery marketingEngagementCreate(MarketingEngagementInput marketingEngagement, MarketingEngagementCreateArgumentsDefinition argsDef, MarketingEngagementCreatePayloadQueryDefinition queryDef) {
        startField("marketingEngagementCreate");

        _queryBuilder.append("(marketingEngagement:");
        marketingEngagement.appendTo(_queryBuilder);

        argsDef.define(new MarketingEngagementCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketingEngagementCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MarketingEngagementsDeleteArguments extends Arguments {
        MarketingEngagementsDeleteArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The handle of the channel for which engagement data should be deleted.
        */
        public MarketingEngagementsDeleteArguments channelHandle(String value) {
            if (value != null) {
                startArgument("channelHandle");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * When true, engagements for all channels that belong to the api client will be deleted.
        */
        public MarketingEngagementsDeleteArguments deleteEngagementsForAllChannels(Boolean value) {
            if (value != null) {
                startArgument("deleteEngagementsForAllChannels");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MarketingEngagementsDeleteArgumentsDefinition {
        void define(MarketingEngagementsDeleteArguments args);
    }

    /**
    * Marks channel-level engagement data such that it no longer appears in reports.
    * Activity-level data cannot be deleted directly, instead the MarketingActivity itself should be
    * deleted to
    * hide it from reports.
    */
    public MutationQuery marketingEngagementsDelete(MarketingEngagementsDeletePayloadQueryDefinition queryDef) {
        return marketingEngagementsDelete(args -> {}, queryDef);
    }

    /**
    * Marks channel-level engagement data such that it no longer appears in reports.
    * Activity-level data cannot be deleted directly, instead the MarketingActivity itself should be
    * deleted to
    * hide it from reports.
    */
    public MutationQuery marketingEngagementsDelete(MarketingEngagementsDeleteArgumentsDefinition argsDef, MarketingEngagementsDeletePayloadQueryDefinition queryDef) {
        startField("marketingEngagementsDelete");

        MarketingEngagementsDeleteArguments args = new MarketingEngagementsDeleteArguments(_queryBuilder);
        argsDef.define(args);
        MarketingEngagementsDeleteArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MarketingEngagementsDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a menu.
    */
    public MutationQuery menuCreate(String title, String handle, List<MenuItemCreateInput> items, MenuCreatePayloadQueryDefinition queryDef) {
        startField("menuCreate");

        _queryBuilder.append("(title:");
        Query.appendQuotedString(_queryBuilder, title.toString());

        _queryBuilder.append(",handle:");
        Query.appendQuotedString(_queryBuilder, handle.toString());

        _queryBuilder.append(",items:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (MenuItemCreateInput item1 : items) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MenuCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a menu.
    */
    public MutationQuery menuDelete(ID id, MenuDeletePayloadQueryDefinition queryDef) {
        startField("menuDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MenuDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MenuUpdateArguments extends Arguments {
        MenuUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The menu's handle.
        */
        public MenuUpdateArguments handle(String value) {
            if (value != null) {
                startArgument("handle");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MenuUpdateArgumentsDefinition {
        void define(MenuUpdateArguments args);
    }

    /**
    * Updates a menu.
    */
    public MutationQuery menuUpdate(ID id, String title, List<MenuItemUpdateInput> items, MenuUpdatePayloadQueryDefinition queryDef) {
        return menuUpdate(id, title, items, args -> {}, queryDef);
    }

    /**
    * Updates a menu.
    */
    public MutationQuery menuUpdate(ID id, String title, List<MenuItemUpdateInput> items, MenuUpdateArgumentsDefinition argsDef, MenuUpdatePayloadQueryDefinition queryDef) {
        startField("menuUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",title:");
        Query.appendQuotedString(_queryBuilder, title.toString());

        _queryBuilder.append(",items:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (MenuItemUpdateInput item1 : items) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        argsDef.define(new MenuUpdateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MenuUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a metafield definition. Any metafields existing under the same owner type, namespace, and
    * key will be
    * checked against this definition and will have their type updated accordingly. For metafields that
    * are not
    * valid, they will remain unchanged but any attempts to update them must align with this definition.
    */
    public MutationQuery metafieldDefinitionCreate(MetafieldDefinitionInput definition, MetafieldDefinitionCreatePayloadQueryDefinition queryDef) {
        startField("metafieldDefinitionCreate");

        _queryBuilder.append("(definition:");
        definition.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldDefinitionDeleteArguments extends Arguments {
        MetafieldDefinitionDeleteArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The id of the metafield definition to delete. Using `identifier` is preferred.
        */
        public MetafieldDefinitionDeleteArguments id(ID value) {
            if (value != null) {
                startArgument("id");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The identifier of the metafield definition to delete.
        */
        public MetafieldDefinitionDeleteArguments identifier(MetafieldDefinitionIdentifierInput value) {
            if (value != null) {
                startArgument("identifier");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Whether to delete all associated metafields.
        */
        public MetafieldDefinitionDeleteArguments deleteAllAssociatedMetafields(Boolean value) {
            if (value != null) {
                startArgument("deleteAllAssociatedMetafields");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MetafieldDefinitionDeleteArgumentsDefinition {
        void define(MetafieldDefinitionDeleteArguments args);
    }

    /**
    * Delete a metafield definition.
    * Optionally deletes all associated metafields asynchronously when specified.
    */
    public MutationQuery metafieldDefinitionDelete(MetafieldDefinitionDeletePayloadQueryDefinition queryDef) {
        return metafieldDefinitionDelete(args -> {}, queryDef);
    }

    /**
    * Delete a metafield definition.
    * Optionally deletes all associated metafields asynchronously when specified.
    */
    public MutationQuery metafieldDefinitionDelete(MetafieldDefinitionDeleteArgumentsDefinition argsDef, MetafieldDefinitionDeletePayloadQueryDefinition queryDef) {
        startField("metafieldDefinitionDelete");

        MetafieldDefinitionDeleteArguments args = new MetafieldDefinitionDeleteArguments(_queryBuilder);
        argsDef.define(args);
        MetafieldDefinitionDeleteArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldDefinitionPinArguments extends Arguments {
        MetafieldDefinitionPinArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The id of the metafield definition to pin. Using `identifier` is preferred.
        */
        public MetafieldDefinitionPinArguments definitionId(ID value) {
            if (value != null) {
                startArgument("definitionId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The identifier of the metafield definition to pin.
        */
        public MetafieldDefinitionPinArguments identifier(MetafieldDefinitionIdentifierInput value) {
            if (value != null) {
                startArgument("identifier");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface MetafieldDefinitionPinArgumentsDefinition {
        void define(MetafieldDefinitionPinArguments args);
    }

    /**
    * You can organize your metafields in your Shopify admin by pinning/unpinning metafield definitions.
    * The order of your pinned metafield definitions determines the order in which your metafields are
    * displayed
    * on the corresponding pages in your Shopify admin. By default, only pinned metafields are
    * automatically displayed.
    */
    public MutationQuery metafieldDefinitionPin(MetafieldDefinitionPinPayloadQueryDefinition queryDef) {
        return metafieldDefinitionPin(args -> {}, queryDef);
    }

    /**
    * You can organize your metafields in your Shopify admin by pinning/unpinning metafield definitions.
    * The order of your pinned metafield definitions determines the order in which your metafields are
    * displayed
    * on the corresponding pages in your Shopify admin. By default, only pinned metafields are
    * automatically displayed.
    */
    public MutationQuery metafieldDefinitionPin(MetafieldDefinitionPinArgumentsDefinition argsDef, MetafieldDefinitionPinPayloadQueryDefinition queryDef) {
        startField("metafieldDefinitionPin");

        MetafieldDefinitionPinArguments args = new MetafieldDefinitionPinArguments(_queryBuilder);
        argsDef.define(args);
        MetafieldDefinitionPinArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionPinPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldDefinitionUnpinArguments extends Arguments {
        MetafieldDefinitionUnpinArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The ID of the metafield definition to unpin. Using `identifier` is preferred.
        */
        public MetafieldDefinitionUnpinArguments definitionId(ID value) {
            if (value != null) {
                startArgument("definitionId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The identifier of the metafield definition to unpin.
        */
        public MetafieldDefinitionUnpinArguments identifier(MetafieldDefinitionIdentifierInput value) {
            if (value != null) {
                startArgument("identifier");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface MetafieldDefinitionUnpinArgumentsDefinition {
        void define(MetafieldDefinitionUnpinArguments args);
    }

    /**
    * You can organize your metafields in your Shopify admin by pinning/unpinning metafield definitions.
    * The order of your pinned metafield definitions determines the order in which your metafields are
    * displayed
    * on the corresponding pages in your Shopify admin. By default, only pinned metafields are
    * automatically displayed.
    */
    public MutationQuery metafieldDefinitionUnpin(MetafieldDefinitionUnpinPayloadQueryDefinition queryDef) {
        return metafieldDefinitionUnpin(args -> {}, queryDef);
    }

    /**
    * You can organize your metafields in your Shopify admin by pinning/unpinning metafield definitions.
    * The order of your pinned metafield definitions determines the order in which your metafields are
    * displayed
    * on the corresponding pages in your Shopify admin. By default, only pinned metafields are
    * automatically displayed.
    */
    public MutationQuery metafieldDefinitionUnpin(MetafieldDefinitionUnpinArgumentsDefinition argsDef, MetafieldDefinitionUnpinPayloadQueryDefinition queryDef) {
        startField("metafieldDefinitionUnpin");

        MetafieldDefinitionUnpinArguments args = new MetafieldDefinitionUnpinArguments(_queryBuilder);
        argsDef.define(args);
        MetafieldDefinitionUnpinArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionUnpinPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a metafield definition.
    */
    public MutationQuery metafieldDefinitionUpdate(MetafieldDefinitionUpdateInput definition, MetafieldDefinitionUpdatePayloadQueryDefinition queryDef) {
        startField("metafieldDefinitionUpdate");

        _queryBuilder.append("(definition:");
        definition.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes multiple metafields in bulk.
    */
    public MutationQuery metafieldsDelete(List<MetafieldIdentifierInput> metafields, MetafieldsDeletePayloadQueryDefinition queryDef) {
        startField("metafieldsDelete");

        _queryBuilder.append("(metafields:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (MetafieldIdentifierInput item1 : metafields) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetafieldsDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery metafieldsSet(List<MetafieldsSetInput> metafields, MetafieldsSetPayloadQueryDefinition queryDef) {
        startField("metafieldsSet");

        _queryBuilder.append("(metafields:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (MetafieldsSetInput item1 : metafields) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetafieldsSetPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Asynchronously delete metaobjects and their associated metafields in bulk.
    */
    public MutationQuery metaobjectBulkDelete(MetaobjectBulkDeleteWhereCondition where, MetaobjectBulkDeletePayloadQueryDefinition queryDef) {
        startField("metaobjectBulkDelete");

        _queryBuilder.append("(where:");
        where.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectBulkDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new metaobject.
    */
    public MutationQuery metaobjectCreate(MetaobjectCreateInput metaobject, MetaobjectCreatePayloadQueryDefinition queryDef) {
        startField("metaobjectCreate");

        _queryBuilder.append("(metaobject:");
        metaobject.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new metaobject definition.
    */
    public MutationQuery metaobjectDefinitionCreate(MetaobjectDefinitionCreateInput definition, MetaobjectDefinitionCreatePayloadQueryDefinition queryDef) {
        startField("metaobjectDefinitionCreate");

        _queryBuilder.append("(definition:");
        definition.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectDefinitionCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes the specified metaobject definition.
    * Also deletes all related metafield definitions, metaobjects, and metafields asynchronously.
    */
    public MutationQuery metaobjectDefinitionDelete(ID id, MetaobjectDefinitionDeletePayloadQueryDefinition queryDef) {
        startField("metaobjectDefinitionDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectDefinitionDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a metaobject definition with new settings and metafield definitions.
    */
    public MutationQuery metaobjectDefinitionUpdate(ID id, MetaobjectDefinitionUpdateInput definition, MetaobjectDefinitionUpdatePayloadQueryDefinition queryDef) {
        startField("metaobjectDefinitionUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",definition:");
        definition.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectDefinitionUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes the specified metaobject and its associated metafields.
    */
    public MutationQuery metaobjectDelete(ID id, MetaobjectDeletePayloadQueryDefinition queryDef) {
        startField("metaobjectDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates an existing metaobject.
    */
    public MutationQuery metaobjectUpdate(ID id, MetaobjectUpdateInput metaobject, MetaobjectUpdatePayloadQueryDefinition queryDef) {
        startField("metaobjectUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",metaobject:");
        metaobject.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Retrieves a metaobject by handle, then updates it with the provided input values.
    * If no matching metaobject is found, a new metaobject is created with the provided input values.
    */
    public MutationQuery metaobjectUpsert(MetaobjectHandleInput handle, MetaobjectUpsertInput metaobject, MetaobjectUpsertPayloadQueryDefinition queryDef) {
        startField("metaobjectUpsert");

        _queryBuilder.append("(handle:");
        handle.appendTo(_queryBuilder);

        _queryBuilder.append(",metaobject:");
        metaobject.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectUpsertPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Create a mobile platform application.
    */
    public MutationQuery mobilePlatformApplicationCreate(MobilePlatformApplicationCreateInput input, MobilePlatformApplicationCreatePayloadQueryDefinition queryDef) {
        startField("mobilePlatformApplicationCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MobilePlatformApplicationCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Delete a mobile platform application.
    */
    public MutationQuery mobilePlatformApplicationDelete(ID id, MobilePlatformApplicationDeletePayloadQueryDefinition queryDef) {
        startField("mobilePlatformApplicationDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MobilePlatformApplicationDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Update a mobile platform application.
    */
    public MutationQuery mobilePlatformApplicationUpdate(ID id, MobilePlatformApplicationUpdateInput input, MobilePlatformApplicationUpdatePayloadQueryDefinition queryDef) {
        startField("mobilePlatformApplicationUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MobilePlatformApplicationUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class OrderCancelArguments extends Arguments {
        OrderCancelArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Indicates how to refund the amount paid by the customer. Authorized payments will be voided
        * regardless of this setting.
        */
        public OrderCancelArguments refundMethod(OrderCancelRefundMethodInput value) {
            if (value != null) {
                startArgument("refundMethod");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Whether to send a notification to the customer about the order cancellation.
        */
        public OrderCancelArguments notifyCustomer(Boolean value) {
            if (value != null) {
                startArgument("notifyCustomer");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * A staff-facing note about the order cancellation. This is not visible to the customer.
        */
        public OrderCancelArguments staffNote(String value) {
            if (value != null) {
                startArgument("staffNote");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface OrderCancelArgumentsDefinition {
        void define(OrderCancelArguments args);
    }

    /**
    * Cancels an order, with options for refunding, restocking inventory, and customer notification.
    * > Caution:
    * > Order cancellation is irreversible. An order that has been cancelled can't be restored to its
    * original state.
    * Use the `orderCancel` mutation to programmatically cancel orders in scenarios such as:
    * - Customer-requested cancellations due to size, color, or other preference changes
    * - Payment processing failures or declined transactions
    * - Fraud detection and prevention
    * - Insufficient inventory availability
    * - Staff errors in order processing
    * - Wholesale or B2B order management workflows
    * The `orderCancel` mutation provides flexible refund options including refunding to original payment
    * methods
    * or issuing store credit. If a payment was only authorized (temporarily held) but not yet charged,
    * that hold will be automatically released when the order is cancelled, even if you choose not to
    * refund other payments.
    * The mutation supports different cancellation reasons: customer requests, payment declines, fraud,
    * inventory issues, staff errors, or other unspecified reasons. Each cancellation can include optional
    * staff notes for internal documentation (notes aren't visible to customers).
    * An order can only be cancelled if it meets the following criteria:
    * - The order hasn't already been cancelled.
    * - The order has no pending payment authorizations.
    * - The order has no active returns in progress.
    * - The order has no outstanding fulfillments that can't be cancelled.
    * Orders might be assigned to locations that become
    * [deactivated](https://help.shopify.com/manual/fulfillment/setup/locations-management#deactivate-and-
    * reactivate-locations)
    * after the order was created. When cancelling such orders, inventory behavior depends on payment
    * status:
    * - **Paid orders**: Cancellation will fail with an error if restocking is enabled, since inventory
    * can't be returned to deactivated locations.
    * - **Unpaid orders**: Cancellation succeeds but inventory is not restocked anywhere, even when the
    * restock option is enabled. The committed inventory effectively becomes unavailable rather than being
    * returned to stock at the deactivated location.
    * After you cancel an order, you can still make limited updates to certain fields (like
    * notes and tags) using the
    * [`orderUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderUpdate).
    * For partial refunds or more complex refund scenarios on active orders,
    * such as refunding only specific line items while keeping the rest of the order fulfilled,
    * consider using the
    * [`refundCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/refundCreate)
    * mutation instead of full order cancellation.
    * Learn how to build apps that integrate with
    * [order management and fulfillment
    * processes](https://shopify.dev/docs/apps/build/orders-fulfillment).
    */
    public MutationQuery orderCancel(ID orderId, boolean restock, OrderCancelReason reason, OrderCancelPayloadQueryDefinition queryDef) {
        return orderCancel(orderId, restock, reason, args -> {}, queryDef);
    }

    /**
    * Cancels an order, with options for refunding, restocking inventory, and customer notification.
    * > Caution:
    * > Order cancellation is irreversible. An order that has been cancelled can't be restored to its
    * original state.
    * Use the `orderCancel` mutation to programmatically cancel orders in scenarios such as:
    * - Customer-requested cancellations due to size, color, or other preference changes
    * - Payment processing failures or declined transactions
    * - Fraud detection and prevention
    * - Insufficient inventory availability
    * - Staff errors in order processing
    * - Wholesale or B2B order management workflows
    * The `orderCancel` mutation provides flexible refund options including refunding to original payment
    * methods
    * or issuing store credit. If a payment was only authorized (temporarily held) but not yet charged,
    * that hold will be automatically released when the order is cancelled, even if you choose not to
    * refund other payments.
    * The mutation supports different cancellation reasons: customer requests, payment declines, fraud,
    * inventory issues, staff errors, or other unspecified reasons. Each cancellation can include optional
    * staff notes for internal documentation (notes aren't visible to customers).
    * An order can only be cancelled if it meets the following criteria:
    * - The order hasn't already been cancelled.
    * - The order has no pending payment authorizations.
    * - The order has no active returns in progress.
    * - The order has no outstanding fulfillments that can't be cancelled.
    * Orders might be assigned to locations that become
    * [deactivated](https://help.shopify.com/manual/fulfillment/setup/locations-management#deactivate-and-
    * reactivate-locations)
    * after the order was created. When cancelling such orders, inventory behavior depends on payment
    * status:
    * - **Paid orders**: Cancellation will fail with an error if restocking is enabled, since inventory
    * can't be returned to deactivated locations.
    * - **Unpaid orders**: Cancellation succeeds but inventory is not restocked anywhere, even when the
    * restock option is enabled. The committed inventory effectively becomes unavailable rather than being
    * returned to stock at the deactivated location.
    * After you cancel an order, you can still make limited updates to certain fields (like
    * notes and tags) using the
    * [`orderUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderUpdate).
    * For partial refunds or more complex refund scenarios on active orders,
    * such as refunding only specific line items while keeping the rest of the order fulfilled,
    * consider using the
    * [`refundCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/refundCreate)
    * mutation instead of full order cancellation.
    * Learn how to build apps that integrate with
    * [order management and fulfillment
    * processes](https://shopify.dev/docs/apps/build/orders-fulfillment).
    */
    public MutationQuery orderCancel(ID orderId, boolean restock, OrderCancelReason reason, OrderCancelArgumentsDefinition argsDef, OrderCancelPayloadQueryDefinition queryDef) {
        startField("orderCancel");

        _queryBuilder.append("(orderId:");
        Query.appendQuotedString(_queryBuilder, orderId.toString());

        _queryBuilder.append(",restock:");
        _queryBuilder.append(restock);

        _queryBuilder.append(",reason:");
        _queryBuilder.append(reason.toString());

        argsDef.define(new OrderCancelArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderCancelPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Captures payment for an authorized transaction on an order. Use this mutation to claim the money
    * that was previously
    * reserved by an authorization transaction.
    * The `orderCapture` mutation can be used in the following scenarios:
    * - To capture the full amount of an authorized transaction
    * - To capture a partial payment by specifying an amount less than the total order amount
    * - To perform multiple captures on the same order, as long as the order transaction is
    * [multi-capturable](https://shopify.dev/docs/api/admin-graphql/latest/objects/ordertransaction#field-
    * OrderTransaction.fields.multiCapturable)
    * > Note:
    * > Multi-capture functionality is only available to stores on a
    * [Shopify Plus
    * plan](https://help.shopify.com/manual/intro-to-shopify/pricing-plans/plans-features/shopify-plus-pla
    * n).
    * For multi-currency orders, the
    * [`currency`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderCapture#arguments-inpu
    * t.fields.currency)
    * field is required and should match the presentment currency from the order.
    * After capturing a payment, you can:
    * - View the transaction details including status, amount, and processing information.
    * - Track the captured amount in both shop and presentment currencies.
    * - Monitor the transaction's settlement status.
    * Learn more about [order
    * transactions](https://shopify.dev/docs/api/admin-graphql/latest/objects/OrderTransaction).
    */
    public MutationQuery orderCapture(OrderCaptureInput input, OrderCapturePayloadQueryDefinition queryDef) {
        startField("orderCapture");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderCapturePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Closes an open order.
    */
    public MutationQuery orderClose(OrderCloseInput input, OrderClosePayloadQueryDefinition queryDef) {
        startField("orderClose");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderClosePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class OrderCreateArguments extends Arguments {
        OrderCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The strategies for updating inventory and whether to send shipping and order confirmations to
        * customers.
        */
        public OrderCreateArguments options(OrderCreateOptionsInput value) {
            if (value != null) {
                startArgument("options");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface OrderCreateArgumentsDefinition {
        void define(OrderCreateArguments args);
    }

    /**
    * Creates an order with attributes such as customer information, line items, and shipping and billing
    * addresses.
    * Use the `orderCreate` mutation to programmatically generate orders in scenarios where
    * orders aren't created through the standard checkout process, such as when importing orders from an
    * external
    * system or creating orders for wholesale customers.
    * The `orderCreate` mutation doesn't support applying multiple discounts, such as discounts on line
    * items.
    * Automatic discounts won't be applied unless you replicate the logic of those discounts in your
    * custom
    * implementation. You can [apply a discount
    * code](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/OrderCreateDiscountCodeInput),
    * but only one discount code can be set for each order.
    * > Note:
    * > If you're using the `orderCreate` mutation with a
    * > [trial](https://help.shopify.com/manual/intro-to-shopify/pricing-plans/free-trial) or
    * > [development store](https://shopify.dev/docs/api/development-stores), then you can create a
    * > maximum of five new orders per minute.
    * After you create an order, you can make subsequent edits to the order using one of the following
    * mutations:
    * * [`orderUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderUpdate):
    * Used for simple updates to an order, such as changing the order's note, tags, or customer
    * information.
    * * [`orderEditBegin`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderEditBegin):
    * Used when you need to make significant updates to an order, such as adding or removing line items,
    * changing
    * quantities, or modifying discounts. The `orderEditBegin` mutation initiates an order editing
    * session,
    * allowing you to make multiple changes before finalizing them. Learn more about using the
    * `orderEditBegin`
    * mutation to [edit existing
    * orders](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps/edit-orders).
    * Learn how to build apps that integrate with
    * [order management and fulfillment
    * processes](https://shopify.dev/docs/apps/build/orders-fulfillment).
    */
    public MutationQuery orderCreate(OrderCreateOrderInput order, OrderCreatePayloadQueryDefinition queryDef) {
        return orderCreate(order, args -> {}, queryDef);
    }

    /**
    * Creates an order with attributes such as customer information, line items, and shipping and billing
    * addresses.
    * Use the `orderCreate` mutation to programmatically generate orders in scenarios where
    * orders aren't created through the standard checkout process, such as when importing orders from an
    * external
    * system or creating orders for wholesale customers.
    * The `orderCreate` mutation doesn't support applying multiple discounts, such as discounts on line
    * items.
    * Automatic discounts won't be applied unless you replicate the logic of those discounts in your
    * custom
    * implementation. You can [apply a discount
    * code](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/OrderCreateDiscountCodeInput),
    * but only one discount code can be set for each order.
    * > Note:
    * > If you're using the `orderCreate` mutation with a
    * > [trial](https://help.shopify.com/manual/intro-to-shopify/pricing-plans/free-trial) or
    * > [development store](https://shopify.dev/docs/api/development-stores), then you can create a
    * > maximum of five new orders per minute.
    * After you create an order, you can make subsequent edits to the order using one of the following
    * mutations:
    * * [`orderUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderUpdate):
    * Used for simple updates to an order, such as changing the order's note, tags, or customer
    * information.
    * * [`orderEditBegin`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderEditBegin):
    * Used when you need to make significant updates to an order, such as adding or removing line items,
    * changing
    * quantities, or modifying discounts. The `orderEditBegin` mutation initiates an order editing
    * session,
    * allowing you to make multiple changes before finalizing them. Learn more about using the
    * `orderEditBegin`
    * mutation to [edit existing
    * orders](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps/edit-orders).
    * Learn how to build apps that integrate with
    * [order management and fulfillment
    * processes](https://shopify.dev/docs/apps/build/orders-fulfillment).
    */
    public MutationQuery orderCreate(OrderCreateOrderInput order, OrderCreateArgumentsDefinition argsDef, OrderCreatePayloadQueryDefinition queryDef) {
        startField("orderCreate");

        _queryBuilder.append("(order:");
        order.appendTo(_queryBuilder);

        argsDef.define(new OrderCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class OrderCreateMandatePaymentArguments extends Arguments {
        OrderCreateMandatePaymentArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The ID of the payment schedule to collect the balance for.
        */
        public OrderCreateMandatePaymentArguments paymentScheduleId(ID value) {
            if (value != null) {
                startArgument("paymentScheduleId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The payment amount to collect.
        */
        public OrderCreateMandatePaymentArguments amount(MoneyInput value) {
            if (value != null) {
                startArgument("amount");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Whether the payment should be authorized or captured. If `false`, then the authorization of
        * the payment is triggered.
        */
        public OrderCreateMandatePaymentArguments autoCapture(Boolean value) {
            if (value != null) {
                startArgument("autoCapture");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OrderCreateMandatePaymentArgumentsDefinition {
        void define(OrderCreateMandatePaymentArguments args);
    }

    /**
    * Creates a payment for an order by mandate.
    */
    public MutationQuery orderCreateMandatePayment(ID id, String idempotencyKey, ID mandateId, OrderCreateMandatePaymentPayloadQueryDefinition queryDef) {
        return orderCreateMandatePayment(id, idempotencyKey, mandateId, args -> {}, queryDef);
    }

    /**
    * Creates a payment for an order by mandate.
    */
    public MutationQuery orderCreateMandatePayment(ID id, String idempotencyKey, ID mandateId, OrderCreateMandatePaymentArgumentsDefinition argsDef, OrderCreateMandatePaymentPayloadQueryDefinition queryDef) {
        startField("orderCreateMandatePayment");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",idempotencyKey:");
        Query.appendQuotedString(_queryBuilder, idempotencyKey.toString());

        _queryBuilder.append(",mandateId:");
        Query.appendQuotedString(_queryBuilder, mandateId.toString());

        argsDef.define(new OrderCreateMandatePaymentArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderCreateMandatePaymentPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class OrderCreateManualPaymentArguments extends Arguments {
        OrderCreateManualPaymentArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The manual payment amount to be created.
        */
        public OrderCreateManualPaymentArguments amount(MoneyInput value) {
            if (value != null) {
                startArgument("amount");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * The name of the payment method used for creating the payment. If none is provided, then the default
        * manual payment method ('Other') will be used.
        */
        public OrderCreateManualPaymentArguments paymentMethodName(String value) {
            if (value != null) {
                startArgument("paymentMethodName");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The date and time ([ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format) when a manual payment
        * was processed. If you're importing transactions from an app or another platform, then you can set
        * processedAt to a date and time in the past to match when the original transaction was created.
        */
        public OrderCreateManualPaymentArguments processedAt(String value) {
            if (value != null) {
                startArgument("processedAt");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface OrderCreateManualPaymentArgumentsDefinition {
        void define(OrderCreateManualPaymentArguments args);
    }

    /**
    * Create a manual payment for an order. You can only create a manual payment for an order if it isn't
    * already
    * fully paid.
    */
    public MutationQuery orderCreateManualPayment(ID id, OrderCreateManualPaymentPayloadQueryDefinition queryDef) {
        return orderCreateManualPayment(id, args -> {}, queryDef);
    }

    /**
    * Create a manual payment for an order. You can only create a manual payment for an order if it isn't
    * already
    * fully paid.
    */
    public MutationQuery orderCreateManualPayment(ID id, OrderCreateManualPaymentArgumentsDefinition argsDef, OrderCreateManualPaymentPayloadQueryDefinition queryDef) {
        startField("orderCreateManualPayment");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new OrderCreateManualPaymentArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderCreateManualPaymentPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Removes customer from an order.
    */
    public MutationQuery orderCustomerRemove(ID orderId, OrderCustomerRemovePayloadQueryDefinition queryDef) {
        startField("orderCustomerRemove");

        _queryBuilder.append("(orderId:");
        Query.appendQuotedString(_queryBuilder, orderId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderCustomerRemovePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Sets a customer on an order.
    */
    public MutationQuery orderCustomerSet(ID orderId, ID customerId, OrderCustomerSetPayloadQueryDefinition queryDef) {
        startField("orderCustomerSet");

        _queryBuilder.append("(orderId:");
        Query.appendQuotedString(_queryBuilder, orderId.toString());

        _queryBuilder.append(",customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderCustomerSetPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes an order. For more information on which orders can be deleted, refer to [Delete an
    * order](https://help.shopify.com/manual/orders/cancel-delete-order#delete-an-order).
    */
    public MutationQuery orderDelete(ID orderId, OrderDeletePayloadQueryDefinition queryDef) {
        startField("orderDelete");

        _queryBuilder.append("(orderId:");
        Query.appendQuotedString(_queryBuilder, orderId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class OrderEditAddCustomItemArguments extends Arguments {
        OrderEditAddCustomItemArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The ID of the retail [location](https://shopify.dev/api/admin-graphql/latest/objects/location)
        * (if applicable) from which the custom item is sold. Used for tax calculations. A default location
        * will be chosen automatically if none is provided.
        */
        public OrderEditAddCustomItemArguments locationId(ID value) {
            if (value != null) {
                startArgument("locationId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Whether the custom item is taxable. Defaults to `true`.
        */
        public OrderEditAddCustomItemArguments taxable(Boolean value) {
            if (value != null) {
                startArgument("taxable");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Whether the custom item requires shipping. Defaults to `false`.
        */
        public OrderEditAddCustomItemArguments requiresShipping(Boolean value) {
            if (value != null) {
                startArgument("requiresShipping");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OrderEditAddCustomItemArgumentsDefinition {
        void define(OrderEditAddCustomItemArguments args);
    }

    /**
    * Adds a custom line item to an existing order. For example, you could add a gift wrapping service as
    * a [custom line
    * item](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing#add-a-custom-line-ite
    * m). To learn how to edit existing orders, refer to [Edit an existing order with Admin
    * API](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */
    public MutationQuery orderEditAddCustomItem(ID id, String title, MoneyInput price, int quantity, OrderEditAddCustomItemPayloadQueryDefinition queryDef) {
        return orderEditAddCustomItem(id, title, price, quantity, args -> {}, queryDef);
    }

    /**
    * Adds a custom line item to an existing order. For example, you could add a gift wrapping service as
    * a [custom line
    * item](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing#add-a-custom-line-ite
    * m). To learn how to edit existing orders, refer to [Edit an existing order with Admin
    * API](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */
    public MutationQuery orderEditAddCustomItem(ID id, String title, MoneyInput price, int quantity, OrderEditAddCustomItemArgumentsDefinition argsDef, OrderEditAddCustomItemPayloadQueryDefinition queryDef) {
        startField("orderEditAddCustomItem");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",title:");
        Query.appendQuotedString(_queryBuilder, title.toString());

        _queryBuilder.append(",price:");
        price.appendTo(_queryBuilder);

        _queryBuilder.append(",quantity:");
        _queryBuilder.append(quantity);

        argsDef.define(new OrderEditAddCustomItemArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderEditAddCustomItemPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds a discount to a line item on the current order edit. For more information on how to use the
    * GraphQL Admin API to edit an existing order, refer to [Edit existing
    * orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */
    public MutationQuery orderEditAddLineItemDiscount(ID id, ID lineItemId, OrderEditAppliedDiscountInput discount, OrderEditAddLineItemDiscountPayloadQueryDefinition queryDef) {
        startField("orderEditAddLineItemDiscount");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",lineItemId:");
        Query.appendQuotedString(_queryBuilder, lineItemId.toString());

        _queryBuilder.append(",discount:");
        discount.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderEditAddLineItemDiscountPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds a shipping line to an existing order. For more information on how to use the GraphQL Admin API
    * to edit an existing order, refer to [Edit existing
    * orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */
    public MutationQuery orderEditAddShippingLine(ID id, OrderEditAddShippingLineInput shippingLine, OrderEditAddShippingLinePayloadQueryDefinition queryDef) {
        startField("orderEditAddShippingLine");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",shippingLine:");
        shippingLine.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderEditAddShippingLinePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class OrderEditAddVariantArguments extends Arguments {
        OrderEditAddVariantArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The ID of the [location](https://shopify.dev/api/admin-graphql/latest/objects/location)
        * to check for inventory availability. A default location ID is chosen automatically if none is
        * provided.
        */
        public OrderEditAddVariantArguments locationId(ID value) {
            if (value != null) {
                startArgument("locationId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Whether the mutation can create a line item for a variant that's already on the calculated order.
        */
        public OrderEditAddVariantArguments allowDuplicates(Boolean value) {
            if (value != null) {
                startArgument("allowDuplicates");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OrderEditAddVariantArgumentsDefinition {
        void define(OrderEditAddVariantArguments args);
    }

    /**
    * Adds a line item from an existing product variant. As of API version 2025-04, the
    * [orderEditAddVariant](https://shopify.dev/api/admin-graphql/latest/mutations/ordereditaddvariant)
    * API will respect the contextual pricing of the variant.
    */
    public MutationQuery orderEditAddVariant(ID id, ID variantId, int quantity, OrderEditAddVariantPayloadQueryDefinition queryDef) {
        return orderEditAddVariant(id, variantId, quantity, args -> {}, queryDef);
    }

    /**
    * Adds a line item from an existing product variant. As of API version 2025-04, the
    * [orderEditAddVariant](https://shopify.dev/api/admin-graphql/latest/mutations/ordereditaddvariant)
    * API will respect the contextual pricing of the variant.
    */
    public MutationQuery orderEditAddVariant(ID id, ID variantId, int quantity, OrderEditAddVariantArgumentsDefinition argsDef, OrderEditAddVariantPayloadQueryDefinition queryDef) {
        startField("orderEditAddVariant");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",variantId:");
        Query.appendQuotedString(_queryBuilder, variantId.toString());

        _queryBuilder.append(",quantity:");
        _queryBuilder.append(quantity);

        argsDef.define(new OrderEditAddVariantArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderEditAddVariantPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Starts editing an order. Mutations are operating on `OrderEdit`.
    * All order edits start with `orderEditBegin`, have any number of `orderEdit`* mutations made, and end
    * with `orderEditCommit`.
    */
    public MutationQuery orderEditBegin(ID id, OrderEditBeginPayloadQueryDefinition queryDef) {
        startField("orderEditBegin");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderEditBeginPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class OrderEditCommitArguments extends Arguments {
        OrderEditCommitArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Whether to notify the customer or not.
        */
        public OrderEditCommitArguments notifyCustomer(Boolean value) {
            if (value != null) {
                startArgument("notifyCustomer");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Note for staff members.
        */
        public OrderEditCommitArguments staffNote(String value) {
            if (value != null) {
                startArgument("staffNote");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface OrderEditCommitArgumentsDefinition {
        void define(OrderEditCommitArguments args);
    }

    /**
    * Applies and saves staged changes to an order. Mutations are operating on `OrderEdit`.
    * All order edits start with `orderEditBegin`, have any number of `orderEdit`* mutations made, and end
    * with `orderEditCommit`.
    */
    public MutationQuery orderEditCommit(ID id, OrderEditCommitPayloadQueryDefinition queryDef) {
        return orderEditCommit(id, args -> {}, queryDef);
    }

    /**
    * Applies and saves staged changes to an order. Mutations are operating on `OrderEdit`.
    * All order edits start with `orderEditBegin`, have any number of `orderEdit`* mutations made, and end
    * with `orderEditCommit`.
    */
    public MutationQuery orderEditCommit(ID id, OrderEditCommitArgumentsDefinition argsDef, OrderEditCommitPayloadQueryDefinition queryDef) {
        startField("orderEditCommit");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new OrderEditCommitArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderEditCommitPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Removes a discount on the current order edit. For more information on how to use the GraphQL Admin
    * API to edit an existing order, refer to [Edit existing
    * orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */
    public MutationQuery orderEditRemoveDiscount(ID id, ID discountApplicationId, OrderEditRemoveDiscountPayloadQueryDefinition queryDef) {
        startField("orderEditRemoveDiscount");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",discountApplicationId:");
        Query.appendQuotedString(_queryBuilder, discountApplicationId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderEditRemoveDiscountPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Removes a shipping line from an existing order. For more information on how to use the GraphQL Admin
    * API to edit an existing order, refer to [Edit existing
    * orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */
    public MutationQuery orderEditRemoveShippingLine(ID id, ID shippingLineId, OrderEditRemoveShippingLinePayloadQueryDefinition queryDef) {
        startField("orderEditRemoveShippingLine");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",shippingLineId:");
        Query.appendQuotedString(_queryBuilder, shippingLineId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderEditRemoveShippingLinePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class OrderEditSetQuantityArguments extends Arguments {
        OrderEditSetQuantityArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Whether or not to restock the line item when the updated quantity is less than the original
        * quantity.
        */
        public OrderEditSetQuantityArguments restock(Boolean value) {
            if (value != null) {
                startArgument("restock");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OrderEditSetQuantityArgumentsDefinition {
        void define(OrderEditSetQuantityArguments args);
    }

    /**
    * Sets the quantity of a line item on an order that is being edited. For more information on how to
    * use the GraphQL Admin API to edit an existing order, refer to [Edit existing
    * orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */
    public MutationQuery orderEditSetQuantity(ID id, ID lineItemId, int quantity, OrderEditSetQuantityPayloadQueryDefinition queryDef) {
        return orderEditSetQuantity(id, lineItemId, quantity, args -> {}, queryDef);
    }

    /**
    * Sets the quantity of a line item on an order that is being edited. For more information on how to
    * use the GraphQL Admin API to edit an existing order, refer to [Edit existing
    * orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */
    public MutationQuery orderEditSetQuantity(ID id, ID lineItemId, int quantity, OrderEditSetQuantityArgumentsDefinition argsDef, OrderEditSetQuantityPayloadQueryDefinition queryDef) {
        startField("orderEditSetQuantity");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",lineItemId:");
        Query.appendQuotedString(_queryBuilder, lineItemId.toString());

        _queryBuilder.append(",quantity:");
        _queryBuilder.append(quantity);

        argsDef.define(new OrderEditSetQuantityArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderEditSetQuantityPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a manual line level discount on the current order edit. For more information on how to use
    * the GraphQL Admin API to edit an existing order, refer to [Edit existing
    * orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */
    public MutationQuery orderEditUpdateDiscount(ID id, OrderEditAppliedDiscountInput discount, ID discountApplicationId, OrderEditUpdateDiscountPayloadQueryDefinition queryDef) {
        startField("orderEditUpdateDiscount");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",discount:");
        discount.appendTo(_queryBuilder);

        _queryBuilder.append(",discountApplicationId:");
        Query.appendQuotedString(_queryBuilder, discountApplicationId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderEditUpdateDiscountPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a shipping line on the current order edit. For more information on how to use the GraphQL
    * Admin API to edit an existing order, refer to [Edit existing
    * orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
    */
    public MutationQuery orderEditUpdateShippingLine(ID id, OrderEditUpdateShippingLineInput shippingLine, ID shippingLineId, OrderEditUpdateShippingLinePayloadQueryDefinition queryDef) {
        startField("orderEditUpdateShippingLine");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",shippingLine:");
        shippingLine.appendTo(_queryBuilder);

        _queryBuilder.append(",shippingLineId:");
        Query.appendQuotedString(_queryBuilder, shippingLineId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderEditUpdateShippingLinePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class OrderInvoiceSendArguments extends Arguments {
        OrderInvoiceSendArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The email input fields for the order invoice. The `bcc` and `from` fields should be store or staff
        * account emails.
        */
        public OrderInvoiceSendArguments email(EmailInput value) {
            if (value != null) {
                startArgument("email");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface OrderInvoiceSendArgumentsDefinition {
        void define(OrderInvoiceSendArguments args);
    }

    /**
    * Sends an email invoice for an order.
    */
    public MutationQuery orderInvoiceSend(ID id, OrderInvoiceSendPayloadQueryDefinition queryDef) {
        return orderInvoiceSend(id, args -> {}, queryDef);
    }

    /**
    * Sends an email invoice for an order.
    */
    public MutationQuery orderInvoiceSend(ID id, OrderInvoiceSendArgumentsDefinition argsDef, OrderInvoiceSendPayloadQueryDefinition queryDef) {
        startField("orderInvoiceSend");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new OrderInvoiceSendArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderInvoiceSendPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Marks an order as paid by recording a payment transaction for the outstanding amount.
    * Use the `orderMarkAsPaid` mutation to record payments received outside the standard checkout
    * process. The `orderMarkAsPaid` mutation is particularly useful in scenarios where:
    * - Orders were created with manual payment methods (cash on delivery, bank deposit, money order)
    * - Payments were received offline and need to be recorded in the system
    * - Previously authorized payments need to be captured manually
    * - Orders require manual payment reconciliation due to external payment processing
    * The mutation validates that the order can be marked as paid before processing.
    * An order can be marked as paid only if it has a positive outstanding balance and its
    * [financial
    * status](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-Order.fields.displayFi
    * nancialStatus)
    * isn't already `PAID`. The mutation will either create a new sale transaction for the full
    * outstanding amount or capture an existing authorized transaction, depending on the order's current
    * payment state.
    * After successfully marking an order as paid, the order's financial status is updated to
    * reflect the payment, and payment events are logged for tracking and analytics
    * purposes.
    * Learn more about [managing
    * orders](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps)
    * in apps.
    */
    public MutationQuery orderMarkAsPaid(OrderMarkAsPaidInput input, OrderMarkAsPaidPayloadQueryDefinition queryDef) {
        startField("orderMarkAsPaid");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderMarkAsPaidPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Opens a closed order.
    */
    public MutationQuery orderOpen(OrderOpenInput input, OrderOpenPayloadQueryDefinition queryDef) {
        startField("orderOpen");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderOpenPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Create a risk assessment for an order.
    */
    public MutationQuery orderRiskAssessmentCreate(OrderRiskAssessmentCreateInput orderRiskAssessmentInput, OrderRiskAssessmentCreatePayloadQueryDefinition queryDef) {
        startField("orderRiskAssessmentCreate");

        _queryBuilder.append("(orderRiskAssessmentInput:");
        orderRiskAssessmentInput.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderRiskAssessmentCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates the attributes of an order, such as the customer's email, the shipping address for the
    * order,
    * tags, and [metafields](https://shopify.dev/docs/apps/build/custom-data) associated with the order.
    * If you need to make significant updates to an order, such as adding or removing line items, changing
    * quantities, or modifying discounts, then use
    * the [`orderEditBegin`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderEditBegin)
    * mutation instead. The `orderEditBegin` mutation initiates an order editing session,
    * allowing you to make multiple changes before finalizing them. Learn more about using the
    * `orderEditBegin`
    * mutation to [edit existing
    * orders](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps/edit-orders).
    * Learn how to build apps that integrate with
    * [order management and fulfillment
    * processes](https://shopify.dev/docs/apps/build/orders-fulfillment).
    */
    public MutationQuery orderUpdate(OrderInput input, OrderUpdatePayloadQueryDefinition queryDef) {
        startField("orderUpdate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a page.
    */
    public MutationQuery pageCreate(PageCreateInput page, PageCreatePayloadQueryDefinition queryDef) {
        startField("pageCreate");

        _queryBuilder.append("(page:");
        page.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PageCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a page.
    */
    public MutationQuery pageDelete(ID id, PageDeletePayloadQueryDefinition queryDef) {
        startField("pageDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PageDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a page.
    */
    public MutationQuery pageUpdate(ID id, PageUpdateInput page, PageUpdatePayloadQueryDefinition queryDef) {
        startField("pageUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",page:");
        page.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PageUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Activates and deactivates payment customizations.
    */
    public MutationQuery paymentCustomizationActivation(List<ID> ids, boolean enabled, PaymentCustomizationActivationPayloadQueryDefinition queryDef) {
        startField("paymentCustomizationActivation");

        _queryBuilder.append("(ids:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : ids) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(",enabled:");
        _queryBuilder.append(enabled);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PaymentCustomizationActivationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a payment customization.
    */
    public MutationQuery paymentCustomizationCreate(PaymentCustomizationInput paymentCustomization, PaymentCustomizationCreatePayloadQueryDefinition queryDef) {
        startField("paymentCustomizationCreate");

        _queryBuilder.append("(paymentCustomization:");
        paymentCustomization.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PaymentCustomizationCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a payment customization.
    */
    public MutationQuery paymentCustomizationDelete(ID id, PaymentCustomizationDeletePayloadQueryDefinition queryDef) {
        startField("paymentCustomizationDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PaymentCustomizationDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a payment customization.
    */
    public MutationQuery paymentCustomizationUpdate(ID id, PaymentCustomizationInput paymentCustomization, PaymentCustomizationUpdatePayloadQueryDefinition queryDef) {
        startField("paymentCustomizationUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",paymentCustomization:");
        paymentCustomization.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PaymentCustomizationUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Sends an email payment reminder for a payment schedule.
    */
    public MutationQuery paymentReminderSend(ID paymentScheduleId, PaymentReminderSendPayloadQueryDefinition queryDef) {
        startField("paymentReminderSend");

        _queryBuilder.append("(paymentScheduleId:");
        Query.appendQuotedString(_queryBuilder, paymentScheduleId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PaymentReminderSendPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Create payment terms on an order. To create payment terms on a draft order, use a draft order
    * mutation and include the request with the `DraftOrderInput`.
    */
    public MutationQuery paymentTermsCreate(ID referenceId, PaymentTermsCreateInput paymentTermsAttributes, PaymentTermsCreatePayloadQueryDefinition queryDef) {
        startField("paymentTermsCreate");

        _queryBuilder.append("(referenceId:");
        Query.appendQuotedString(_queryBuilder, referenceId.toString());

        _queryBuilder.append(",paymentTermsAttributes:");
        paymentTermsAttributes.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PaymentTermsCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Delete payment terms for an order. To delete payment terms on a draft order, use a draft order
    * mutation and include the request with the `DraftOrderInput`.
    */
    public MutationQuery paymentTermsDelete(PaymentTermsDeleteInput input, PaymentTermsDeletePayloadQueryDefinition queryDef) {
        startField("paymentTermsDelete");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PaymentTermsDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Update payment terms on an order. To update payment terms on a draft order, use a draft order
    * mutation and include the request with the `DraftOrderInput`.
    */
    public MutationQuery paymentTermsUpdate(PaymentTermsUpdateInput input, PaymentTermsUpdatePayloadQueryDefinition queryDef) {
        startField("paymentTermsUpdate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PaymentTermsUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a price list. You can use the `priceListCreate` mutation to create a new price list and
    * associate it with a catalog. This enables you to sell your products with contextual pricing.
    */
    public MutationQuery priceListCreate(PriceListCreateInput input, PriceListCreatePayloadQueryDefinition queryDef) {
        startField("priceListCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PriceListCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a price list. For example, you can delete a price list so that it no longer applies for
    * products in the associated market.
    */
    public MutationQuery priceListDelete(ID id, PriceListDeletePayloadQueryDefinition queryDef) {
        startField("priceListDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PriceListDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates or updates fixed prices on a price list. You can use the `priceListFixedPricesAdd` mutation
    * to set a fixed price for specific product variants. This lets you change product variant pricing on
    * a per country basis. Any existing fixed price list prices for these variants will be overwritten.
    */
    public MutationQuery priceListFixedPricesAdd(ID priceListId, List<PriceListPriceInput> prices, PriceListFixedPricesAddPayloadQueryDefinition queryDef) {
        startField("priceListFixedPricesAdd");

        _queryBuilder.append("(priceListId:");
        Query.appendQuotedString(_queryBuilder, priceListId.toString());

        _queryBuilder.append(",prices:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (PriceListPriceInput item1 : prices) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PriceListFixedPricesAddPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PriceListFixedPricesByProductUpdateArguments extends Arguments {
        PriceListFixedPricesByProductUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * A list of `PriceListProductPriceInput` that identifies which products to update the fixed prices
        * for.
        */
        public PriceListFixedPricesByProductUpdateArguments pricesToAdd(List<PriceListProductPriceInput> value) {
            if (value != null) {
                startArgument("pricesToAdd");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (PriceListProductPriceInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * A list of product IDs that identifies which products to remove the fixed prices for.
        */
        public PriceListFixedPricesByProductUpdateArguments pricesToDeleteByProductIds(List<ID> value) {
            if (value != null) {
                startArgument("pricesToDeleteByProductIds");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface PriceListFixedPricesByProductUpdateArgumentsDefinition {
        void define(PriceListFixedPricesByProductUpdateArguments args);
    }

    /**
    * Updates the fixed prices for all variants for a product on a price list. You can use the
    * `priceListFixedPricesByProductUpdate` mutation to set or remove a fixed price for all variants of a
    * product associated with the price list.
    */
    public MutationQuery priceListFixedPricesByProductUpdate(ID priceListId, PriceListFixedPricesByProductUpdatePayloadQueryDefinition queryDef) {
        return priceListFixedPricesByProductUpdate(priceListId, args -> {}, queryDef);
    }

    /**
    * Updates the fixed prices for all variants for a product on a price list. You can use the
    * `priceListFixedPricesByProductUpdate` mutation to set or remove a fixed price for all variants of a
    * product associated with the price list.
    */
    public MutationQuery priceListFixedPricesByProductUpdate(ID priceListId, PriceListFixedPricesByProductUpdateArgumentsDefinition argsDef, PriceListFixedPricesByProductUpdatePayloadQueryDefinition queryDef) {
        startField("priceListFixedPricesByProductUpdate");

        _queryBuilder.append("(priceListId:");
        Query.appendQuotedString(_queryBuilder, priceListId.toString());

        argsDef.define(new PriceListFixedPricesByProductUpdateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PriceListFixedPricesByProductUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes specific fixed prices from a price list using a product variant ID. You can use the
    * `priceListFixedPricesDelete` mutation to delete a set of fixed prices from a price list. After
    * deleting the set of fixed prices from the price list, the price of each product variant reverts to
    * the original price that was determined by the price list adjustment.
    */
    public MutationQuery priceListFixedPricesDelete(ID priceListId, List<ID> variantIds, PriceListFixedPricesDeletePayloadQueryDefinition queryDef) {
        startField("priceListFixedPricesDelete");

        _queryBuilder.append("(priceListId:");
        Query.appendQuotedString(_queryBuilder, priceListId.toString());

        _queryBuilder.append(",variantIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : variantIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PriceListFixedPricesDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates fixed prices on a price list. You can use the `priceListFixedPricesUpdate` mutation to set a
    * fixed price for specific product variants or to delete prices for variants associated with the price
    * list.
    */
    public MutationQuery priceListFixedPricesUpdate(ID priceListId, List<PriceListPriceInput> pricesToAdd, List<ID> variantIdsToDelete, PriceListFixedPricesUpdatePayloadQueryDefinition queryDef) {
        startField("priceListFixedPricesUpdate");

        _queryBuilder.append("(priceListId:");
        Query.appendQuotedString(_queryBuilder, priceListId.toString());

        _queryBuilder.append(",pricesToAdd:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (PriceListPriceInput item1 : pricesToAdd) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(",variantIdsToDelete:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : variantIdsToDelete) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PriceListFixedPricesUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a price list.
    * If you modify the currency, then any fixed prices set on the price list will be deleted.
    */
    public MutationQuery priceListUpdate(ID id, PriceListUpdateInput input, PriceListUpdatePayloadQueryDefinition queryDef) {
        startField("priceListUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PriceListUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Disable a shop's privacy features.
    */
    public MutationQuery privacyFeaturesDisable(List<PrivacyFeaturesEnum> featuresToDisable, PrivacyFeaturesDisablePayloadQueryDefinition queryDef) {
        startField("privacyFeaturesDisable");

        _queryBuilder.append("(featuresToDisable:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (PrivacyFeaturesEnum item1 : featuresToDisable) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                _queryBuilder.append(item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PrivacyFeaturesDisablePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new componentized product.
    */
    public MutationQuery productBundleCreate(ProductBundleCreateInput input, ProductBundleCreatePayloadQueryDefinition queryDef) {
        startField("productBundleCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductBundleCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a componentized product.
    */
    public MutationQuery productBundleUpdate(ProductBundleUpdateInput input, ProductBundleUpdatePayloadQueryDefinition queryDef) {
        startField("productBundleUpdate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductBundleUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductCreateArguments extends Arguments {
        ProductCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The attributes of the new product.
        */
        public ProductCreateArguments product(ProductCreateInput value) {
            if (value != null) {
                startArgument("product");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * The media to add to the product.
        */
        public ProductCreateArguments media(List<CreateMediaInput> value) {
            if (value != null) {
                startArgument("media");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CreateMediaInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface ProductCreateArgumentsDefinition {
        void define(ProductCreateArguments args);
    }

    /**
    * Creates a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
    * with attributes such as title, description, vendor, and media.
    * The `productCreate` mutation helps you create many products at once, avoiding the tedious or
    * time-consuming
    * process of adding them one by one in the Shopify admin. Common examples include creating products
    * for a
    * new collection, launching a new product line, or adding seasonal products.
    * You can define product
    * [options](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption) and
    * [values](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOptionValue),
    * allowing you to create products with different variations like sizes or colors. You can also
    * associate media
    * files to your products, including images and videos.
    * The `productCreate` mutation only supports creating a product with its initial
    * [product variant](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant).
    * To create multiple product variants for a single product and manage prices, use the
    * [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkCreate)
    * mutation.
    * > Note:
    * > The `productCreate` mutation has a
    * [throttle](https://shopify.dev/docs/api/usage/rate-limits#resource-based-rate-limits)
    * > that takes effect when a store has 50,000 product variants. After this threshold is reached, no
    * more than
    * > 1,000 new product variants can be created per day.
    * After you create a product, you can make subsequent edits to the product using one of the following
    * mutations:
    * -
    * [`publishablePublish`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/publishablePublis
    * h):
    * Used to publish the product and make it available to customers. The `productCreate` mutation creates
    * products
    * in an unpublished state by default, so you must perform a separate operation to publish the product.
    * - [`productUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productUpdate):
    * Used to update a single product, such as changing the product's title, description, vendor, or
    * associated media.
    * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet):
    * Used to perform multiple operations on products, such as creating or modifying product options and
    * variants.
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
    * and [adding product
    * data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
    */
    public MutationQuery productCreate(ProductCreatePayloadQueryDefinition queryDef) {
        return productCreate(args -> {}, queryDef);
    }

    /**
    * Creates a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
    * with attributes such as title, description, vendor, and media.
    * The `productCreate` mutation helps you create many products at once, avoiding the tedious or
    * time-consuming
    * process of adding them one by one in the Shopify admin. Common examples include creating products
    * for a
    * new collection, launching a new product line, or adding seasonal products.
    * You can define product
    * [options](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption) and
    * [values](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOptionValue),
    * allowing you to create products with different variations like sizes or colors. You can also
    * associate media
    * files to your products, including images and videos.
    * The `productCreate` mutation only supports creating a product with its initial
    * [product variant](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant).
    * To create multiple product variants for a single product and manage prices, use the
    * [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkCreate)
    * mutation.
    * > Note:
    * > The `productCreate` mutation has a
    * [throttle](https://shopify.dev/docs/api/usage/rate-limits#resource-based-rate-limits)
    * > that takes effect when a store has 50,000 product variants. After this threshold is reached, no
    * more than
    * > 1,000 new product variants can be created per day.
    * After you create a product, you can make subsequent edits to the product using one of the following
    * mutations:
    * -
    * [`publishablePublish`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/publishablePublis
    * h):
    * Used to publish the product and make it available to customers. The `productCreate` mutation creates
    * products
    * in an unpublished state by default, so you must perform a separate operation to publish the product.
    * - [`productUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productUpdate):
    * Used to update a single product, such as changing the product's title, description, vendor, or
    * associated media.
    * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet):
    * Used to perform multiple operations on products, such as creating or modifying product options and
    * variants.
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
    * and [adding product
    * data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
    */
    public MutationQuery productCreate(ProductCreateArgumentsDefinition argsDef, ProductCreatePayloadQueryDefinition queryDef) {
        startField("productCreate");

        ProductCreateArguments args = new ProductCreateArguments(_queryBuilder);
        argsDef.define(args);
        ProductCreateArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductDeleteArguments extends Arguments {
        ProductDeleteArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Specifies whether or not to run the mutation synchronously.
        */
        public ProductDeleteArguments synchronous(Boolean value) {
            if (value != null) {
                startArgument("synchronous");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductDeleteArgumentsDefinition {
        void define(ProductDeleteArguments args);
    }

    /**
    * Permanently deletes a product and all its associated data, including variants, media, publications,
    * and inventory items.
    * Use the `productDelete` mutation to programmatically remove products from your store when they need
    * to be
    * permanently deleted from your catalog, such as when removing discontinued items, cleaning up test
    * data, or
    * synchronizing with external inventory management systems.
    * The `productDelete` mutation removes the product from all associated collections,
    * and removes all associated data for the product, including:
    * - All product variants and their inventory items
    * - Product media (images, videos) that are not referenced by other products
    * - [Product options](https://shopify.dev/api/admin-graphql/latest/objects/ProductOption) and [option
    * values](https://shopify.dev/api/admin-graphql/latest/objects/ProductOptionValue)
    * - Product publications across all sales channels
    * - Product tags and metadata associations
    * The `productDelete` mutation also has the following effects on existing orders and transactions:
    * - **Draft orders**: Existing draft orders that reference this product will retain the product
    * information as stored data, but the product reference will be removed. Draft orders can still be
    * completed with the stored product details.
    * - **Completed orders and refunds**: Previously completed orders that included this product aren't
    * affected. The product information in completed orders is preserved for record-keeping, and existing
    * refunds for this product remain valid and processable.
    * > Caution:
    * > Product deletion is irreversible. After a product is deleted, it can't be recovered. Consider
    * archiving
    * > or unpublishing products instead if you might need to restore them later.
    * If you need to delete a large product, such as one that has many
    * [variants](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant)
    * that are active at several
    * [locations](https://shopify.dev/api/admin-graphql/latest/objects/Location),
    * you might encounter timeout errors. To avoid these timeout errors, you can set the
    * [`synchronous`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productDelete#arguments-
    * synchronous)
    * parameter to `false` to run the deletion asynchronously, which returns a
    * [`ProductDeleteOperation`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductDeleteOp
    * eration)
    * that you can monitor for completion status.
    * If you need more granular control over product cleanup, consider using these alternative mutations:
    * - [`productUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productUpdate):
    * Update the product status to archived or unpublished instead of deleting.
    * -
    * [`productVariantsBulkDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkDelete):
    * Delete specific variants while keeping the product.
    * -
    * [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsD
    * elete):
    * Delete the choices available for a product, such as size, color, or material.
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model).
    */
    public MutationQuery productDelete(ProductDeleteInput input, ProductDeletePayloadQueryDefinition queryDef) {
        return productDelete(input, args -> {}, queryDef);
    }

    /**
    * Permanently deletes a product and all its associated data, including variants, media, publications,
    * and inventory items.
    * Use the `productDelete` mutation to programmatically remove products from your store when they need
    * to be
    * permanently deleted from your catalog, such as when removing discontinued items, cleaning up test
    * data, or
    * synchronizing with external inventory management systems.
    * The `productDelete` mutation removes the product from all associated collections,
    * and removes all associated data for the product, including:
    * - All product variants and their inventory items
    * - Product media (images, videos) that are not referenced by other products
    * - [Product options](https://shopify.dev/api/admin-graphql/latest/objects/ProductOption) and [option
    * values](https://shopify.dev/api/admin-graphql/latest/objects/ProductOptionValue)
    * - Product publications across all sales channels
    * - Product tags and metadata associations
    * The `productDelete` mutation also has the following effects on existing orders and transactions:
    * - **Draft orders**: Existing draft orders that reference this product will retain the product
    * information as stored data, but the product reference will be removed. Draft orders can still be
    * completed with the stored product details.
    * - **Completed orders and refunds**: Previously completed orders that included this product aren't
    * affected. The product information in completed orders is preserved for record-keeping, and existing
    * refunds for this product remain valid and processable.
    * > Caution:
    * > Product deletion is irreversible. After a product is deleted, it can't be recovered. Consider
    * archiving
    * > or unpublishing products instead if you might need to restore them later.
    * If you need to delete a large product, such as one that has many
    * [variants](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant)
    * that are active at several
    * [locations](https://shopify.dev/api/admin-graphql/latest/objects/Location),
    * you might encounter timeout errors. To avoid these timeout errors, you can set the
    * [`synchronous`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productDelete#arguments-
    * synchronous)
    * parameter to `false` to run the deletion asynchronously, which returns a
    * [`ProductDeleteOperation`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductDeleteOp
    * eration)
    * that you can monitor for completion status.
    * If you need more granular control over product cleanup, consider using these alternative mutations:
    * - [`productUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productUpdate):
    * Update the product status to archived or unpublished instead of deleting.
    * -
    * [`productVariantsBulkDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkDelete):
    * Delete specific variants while keeping the product.
    * -
    * [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsD
    * elete):
    * Delete the choices available for a product, such as size, color, or material.
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model).
    */
    public MutationQuery productDelete(ProductDeleteInput input, ProductDeleteArgumentsDefinition argsDef, ProductDeletePayloadQueryDefinition queryDef) {
        startField("productDelete");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        argsDef.define(new ProductDeleteArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductDuplicateArguments extends Arguments {
        ProductDuplicateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The new status of the product. If no value is provided the status will be inherited from the
        * original product.
        */
        public ProductDuplicateArguments newStatus(ProductStatus value) {
            if (value != null) {
                startArgument("newStatus");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * Specifies whether or not to duplicate images.
        */
        public ProductDuplicateArguments includeImages(Boolean value) {
            if (value != null) {
                startArgument("includeImages");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Specifies whether or not to duplicate translations.
        */
        public ProductDuplicateArguments includeTranslations(Boolean value) {
            if (value != null) {
                startArgument("includeTranslations");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Specifies whether or not to run the mutation synchronously.
        */
        public ProductDuplicateArguments synchronous(Boolean value) {
            if (value != null) {
                startArgument("synchronous");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductDuplicateArgumentsDefinition {
        void define(ProductDuplicateArguments args);
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
    public MutationQuery productDuplicate(ID productId, String newTitle, ProductDuplicatePayloadQueryDefinition queryDef) {
        return productDuplicate(productId, newTitle, args -> {}, queryDef);
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
    public MutationQuery productDuplicate(ID productId, String newTitle, ProductDuplicateArgumentsDefinition argsDef, ProductDuplicatePayloadQueryDefinition queryDef) {
        startField("productDuplicate");

        _queryBuilder.append("(productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        _queryBuilder.append(",newTitle:");
        Query.appendQuotedString(_queryBuilder, newTitle.toString());

        argsDef.define(new ProductDuplicateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductDuplicatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductFeedCreateArguments extends Arguments {
        ProductFeedCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The properties of the new product feed.
        */
        public ProductFeedCreateArguments input(ProductFeedInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ProductFeedCreateArgumentsDefinition {
        void define(ProductFeedCreateArguments args);
    }

    /**
    * Creates a product feed for a specific publication.
    */
    public MutationQuery productFeedCreate(ProductFeedCreatePayloadQueryDefinition queryDef) {
        return productFeedCreate(args -> {}, queryDef);
    }

    /**
    * Creates a product feed for a specific publication.
    */
    public MutationQuery productFeedCreate(ProductFeedCreateArgumentsDefinition argsDef, ProductFeedCreatePayloadQueryDefinition queryDef) {
        startField("productFeedCreate");

        ProductFeedCreateArguments args = new ProductFeedCreateArguments(_queryBuilder);
        argsDef.define(args);
        ProductFeedCreateArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductFeedCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a product feed for a specific publication.
    */
    public MutationQuery productFeedDelete(ID id, ProductFeedDeletePayloadQueryDefinition queryDef) {
        startField("productFeedDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductFeedDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductFullSyncArguments extends Arguments {
        ProductFullSyncArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Syncs only products that haven't changed since the specified timestamp.
        */
        public ProductFullSyncArguments beforeUpdatedAt(String value) {
            if (value != null) {
                startArgument("beforeUpdatedAt");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Syncs only products that have changed since the specified timestamp.
        */
        public ProductFullSyncArguments updatedAtSince(String value) {
            if (value != null) {
                startArgument("updatedAtSince");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface ProductFullSyncArgumentsDefinition {
        void define(ProductFullSyncArguments args);
    }

    /**
    * Runs the full product sync for a given shop.
    */
    public MutationQuery productFullSync(ID id, ProductFullSyncPayloadQueryDefinition queryDef) {
        return productFullSync(id, args -> {}, queryDef);
    }

    /**
    * Runs the full product sync for a given shop.
    */
    public MutationQuery productFullSync(ID id, ProductFullSyncArgumentsDefinition argsDef, ProductFullSyncPayloadQueryDefinition queryDef) {
        startField("productFullSync");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new ProductFullSyncArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductFullSyncPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds multiple selling plan groups to a product.
    */
    public MutationQuery productJoinSellingPlanGroups(ID id, List<ID> sellingPlanGroupIds, ProductJoinSellingPlanGroupsPayloadQueryDefinition queryDef) {
        startField("productJoinSellingPlanGroups");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",sellingPlanGroupIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : sellingPlanGroupIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductJoinSellingPlanGroupsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Removes multiple groups from a product.
    */
    public MutationQuery productLeaveSellingPlanGroups(ID id, List<ID> sellingPlanGroupIds, ProductLeaveSellingPlanGroupsPayloadQueryDefinition queryDef) {
        startField("productLeaveSellingPlanGroups");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",sellingPlanGroupIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : sellingPlanGroupIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductLeaveSellingPlanGroupsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductOptionUpdateArguments extends Arguments {
        ProductOptionUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * New option values to create.
        */
        public ProductOptionUpdateArguments optionValuesToAdd(List<OptionValueCreateInput> value) {
            if (value != null) {
                startArgument("optionValuesToAdd");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OptionValueCreateInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * Existing option values to update.
        */
        public ProductOptionUpdateArguments optionValuesToUpdate(List<OptionValueUpdateInput> value) {
            if (value != null) {
                startArgument("optionValuesToUpdate");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OptionValueUpdateInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * IDs of the existing option values to delete.
        */
        public ProductOptionUpdateArguments optionValuesToDelete(List<ID> value) {
            if (value != null) {
                startArgument("optionValuesToDelete");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The strategy defines which behavior the mutation should observe regarding variants,
        * such as creating variants or deleting them in response to option values to add or to delete.
        * If not provided or set to null, the strategy `LEAVE_AS_IS` will be used.
        */
        public ProductOptionUpdateArguments variantStrategy(ProductOptionUpdateVariantStrategy value) {
            if (value != null) {
                startArgument("variantStrategy");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface ProductOptionUpdateArgumentsDefinition {
        void define(ProductOptionUpdateArguments args);
    }

    /**
    * Updates an [option](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption)
    * on a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product),
    * such as size, color, or material. Each option includes a name, position, and a list of values. The
    * combination
    * of a product option and value creates a [product
    * variant](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant).
    * Use the `productOptionUpdate` mutation for the following use cases:
    * - **Update product choices**: Modify an existing option, like "Size" (Small, Medium, Large) or
    * "Color" (Red, Blue, Green), so customers can select their preferred variant.
    * - **Enable personalization features**: Update an option (for example, "Engraving text") to let
    * customers customize their purchase.
    * - **Offer seasonal or limited edition products**: Update a value
    * (for example, "Holiday red") on an existing option to support limited-time or seasonal variants.
    * - **Integrate with apps that manage product configuration**: Allow third-party apps to update
    * options, like
    * "Bundle size", when customers select or customize
    * [product bundles](https://shopify.dev/docs/apps/build/product-merchandising/bundles).
    * - **Link options to metafields**: Associate a product option with a custom
    * [metafield](https://shopify.dev/docs/apps/build/custom-data), like "Fabric code", for
    * richer integrations with other systems or apps.
    * > Note:
    * > The `productOptionUpdate` mutation enforces strict data integrity for product options and
    * variants.
    * All option positions must be sequential, and every option should be used by at least one variant.
    * After you update a product option, you can further manage a product's configuration using related
    * mutations:
    * -
    * [`productOptionsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsC
    * reate)
    * -
    * [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsD
    * elete)
    * -
    * [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptions
    * Reorder)
    * -
    * [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkCreate)
    * -
    * [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkUpdate)
    * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet)
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
    * and [adding product
    * data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
    */
    public MutationQuery productOptionUpdate(OptionUpdateInput option, ID productId, ProductOptionUpdatePayloadQueryDefinition queryDef) {
        return productOptionUpdate(option, productId, args -> {}, queryDef);
    }

    /**
    * Updates an [option](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption)
    * on a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product),
    * such as size, color, or material. Each option includes a name, position, and a list of values. The
    * combination
    * of a product option and value creates a [product
    * variant](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant).
    * Use the `productOptionUpdate` mutation for the following use cases:
    * - **Update product choices**: Modify an existing option, like "Size" (Small, Medium, Large) or
    * "Color" (Red, Blue, Green), so customers can select their preferred variant.
    * - **Enable personalization features**: Update an option (for example, "Engraving text") to let
    * customers customize their purchase.
    * - **Offer seasonal or limited edition products**: Update a value
    * (for example, "Holiday red") on an existing option to support limited-time or seasonal variants.
    * - **Integrate with apps that manage product configuration**: Allow third-party apps to update
    * options, like
    * "Bundle size", when customers select or customize
    * [product bundles](https://shopify.dev/docs/apps/build/product-merchandising/bundles).
    * - **Link options to metafields**: Associate a product option with a custom
    * [metafield](https://shopify.dev/docs/apps/build/custom-data), like "Fabric code", for
    * richer integrations with other systems or apps.
    * > Note:
    * > The `productOptionUpdate` mutation enforces strict data integrity for product options and
    * variants.
    * All option positions must be sequential, and every option should be used by at least one variant.
    * After you update a product option, you can further manage a product's configuration using related
    * mutations:
    * -
    * [`productOptionsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsC
    * reate)
    * -
    * [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsD
    * elete)
    * -
    * [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptions
    * Reorder)
    * -
    * [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkCreate)
    * -
    * [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkUpdate)
    * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet)
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
    * and [adding product
    * data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
    */
    public MutationQuery productOptionUpdate(OptionUpdateInput option, ID productId, ProductOptionUpdateArgumentsDefinition argsDef, ProductOptionUpdatePayloadQueryDefinition queryDef) {
        startField("productOptionUpdate");

        _queryBuilder.append("(option:");
        option.appendTo(_queryBuilder);

        _queryBuilder.append(",productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        argsDef.define(new ProductOptionUpdateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductOptionUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductOptionsCreateArguments extends Arguments {
        ProductOptionsCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The strategy defines which behavior the mutation should observe regarding variants.
        * If not provided or set to null, the strategy `LEAVE_AS_IS` will be used.
        */
        public ProductOptionsCreateArguments variantStrategy(ProductOptionCreateVariantStrategy value) {
            if (value != null) {
                startArgument("variantStrategy");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface ProductOptionsCreateArgumentsDefinition {
        void define(ProductOptionsCreateArguments args);
    }

    /**
    * Creates one or more
    * [options](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption)
    * on a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product),
    * such as size, color, or material. Each option includes a name, position, and a list of values. The
    * combination
    * of a product option and value creates a [product
    * variant](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant).
    * Use the `productOptionsCreate` mutation for the following use cases:
    * - **Add product choices**: Add a new option, like "Size" (Small, Medium, Large) or
    * "Color" (Red, Blue, Green), to an existing product so customers can select their preferred variant.
    * - **Enable personalization features**: Add options such as "Engraving text" to let customers
    * customize their purchase.
    * - **Offer seasonal or limited edition products**: Add a new value
    * (for example, "Holiday red") to an existing option to support limited-time or seasonal variants.
    * - **Integrate with apps that manage product configuration**: Allow third-party apps to add options,
    * like
    * "Bundle size", when customers select or customize
    * [product bundles](https://shopify.dev/docs/apps/build/product-merchandising/bundles).
    * - **Link options to metafields**: Associate a product option with a custom
    * [metafield](https://shopify.dev/docs/apps/build/custom-data), like "Fabric code", for
    * richer integrations with other systems or apps.
    * > Note:
    * > The `productOptionsCreate` mutation enforces strict data integrity for product options and
    * variants.
    * All option positions must be sequential, and every option should be used by at least one variant.
    * If you use the [`CREATE` variant
    * strategy](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsCreate#arguments
    * -variantStrategy.enums.CREATE), consider the maximum allowed number of variants for each product
    * (100 by default, and 2,048 if you've
    * [enabled the **Extended Variants** developer
    * preview](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/migrate-and-test#crea
    * te-a-development-store-that-allows-2-048-variants-per-product)).
    * After you create product options, you can further manage a product's configuration using related
    * mutations:
    * -
    * [`productOptionUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionUpd
    * ate)
    * -
    * [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptions
    * Reorder)
    * -
    * [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsD
    * elete)
    * -
    * [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkCreate)
    * -
    * [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkUpdate)
    * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet)
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
    * and [adding product
    * data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
    */
    public MutationQuery productOptionsCreate(ID productId, List<OptionCreateInput> options, ProductOptionsCreatePayloadQueryDefinition queryDef) {
        return productOptionsCreate(productId, options, args -> {}, queryDef);
    }

    /**
    * Creates one or more
    * [options](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption)
    * on a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product),
    * such as size, color, or material. Each option includes a name, position, and a list of values. The
    * combination
    * of a product option and value creates a [product
    * variant](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant).
    * Use the `productOptionsCreate` mutation for the following use cases:
    * - **Add product choices**: Add a new option, like "Size" (Small, Medium, Large) or
    * "Color" (Red, Blue, Green), to an existing product so customers can select their preferred variant.
    * - **Enable personalization features**: Add options such as "Engraving text" to let customers
    * customize their purchase.
    * - **Offer seasonal or limited edition products**: Add a new value
    * (for example, "Holiday red") to an existing option to support limited-time or seasonal variants.
    * - **Integrate with apps that manage product configuration**: Allow third-party apps to add options,
    * like
    * "Bundle size", when customers select or customize
    * [product bundles](https://shopify.dev/docs/apps/build/product-merchandising/bundles).
    * - **Link options to metafields**: Associate a product option with a custom
    * [metafield](https://shopify.dev/docs/apps/build/custom-data), like "Fabric code", for
    * richer integrations with other systems or apps.
    * > Note:
    * > The `productOptionsCreate` mutation enforces strict data integrity for product options and
    * variants.
    * All option positions must be sequential, and every option should be used by at least one variant.
    * If you use the [`CREATE` variant
    * strategy](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsCreate#arguments
    * -variantStrategy.enums.CREATE), consider the maximum allowed number of variants for each product
    * (100 by default, and 2,048 if you've
    * [enabled the **Extended Variants** developer
    * preview](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/migrate-and-test#crea
    * te-a-development-store-that-allows-2-048-variants-per-product)).
    * After you create product options, you can further manage a product's configuration using related
    * mutations:
    * -
    * [`productOptionUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionUpd
    * ate)
    * -
    * [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptions
    * Reorder)
    * -
    * [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsD
    * elete)
    * -
    * [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkCreate)
    * -
    * [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkUpdate)
    * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet)
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
    * and [adding product
    * data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
    */
    public MutationQuery productOptionsCreate(ID productId, List<OptionCreateInput> options, ProductOptionsCreateArgumentsDefinition argsDef, ProductOptionsCreatePayloadQueryDefinition queryDef) {
        startField("productOptionsCreate");

        _queryBuilder.append("(productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        _queryBuilder.append(",options:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (OptionCreateInput item1 : options) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        argsDef.define(new ProductOptionsCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductOptionsCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductOptionsDeleteArguments extends Arguments {
        ProductOptionsDeleteArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The strategy defines which behavior the mutation should observe,such as how to handle a situation
        * where deleting an option would result in duplicate variants.
        */
        public ProductOptionsDeleteArguments strategy(ProductOptionDeleteStrategy value) {
            if (value != null) {
                startArgument("strategy");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface ProductOptionsDeleteArgumentsDefinition {
        void define(ProductOptionsDeleteArguments args);
    }

    /**
    * Deletes one or more
    * [options](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption)
    * from a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product). Product options
    * define the choices available for a product, such as size, color, or material.
    * > Caution:
    * > Removing an option can affect a product's
    * > [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant) and their
    * > configuration. Deleting an option might also delete associated option values and, depending on the
    * chosen
    * >
    * [strategy](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productoptionsdelete#argument
    * s-strategy),
    * > might affect variants.
    * Use the `productOptionsDelete` mutation for the following use cases:
    * - **Simplify product configuration**: Remove obsolete or unnecessary options
    * (for example, discontinue "Material" if all variants are now the same material).
    * - **Clean up after seasonal or limited-time offerings**: Delete options that are no longer
    * relevant (for example, "Holiday edition").
    * - **Automate catalog management**: Enable apps or integrations to programmatically remove options as
    * product
    * data changes.
    * > Note:
    * > The `productOptionsDelete` mutation enforces strict data integrity for product options and
    * variants.
    * > All option positions must remain sequential, and every remaining option must be used by at least
    * one variant.
    * After you delete a product option, you can further manage a product's configuration using related
    * mutations:
    * -
    * [`productOptionsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsC
    * reate)
    * -
    * [`productOptionUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionUpd
    * ate)
    * -
    * [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptions
    * Reorder)
    * -
    * [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkCreate)
    * -
    * [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkUpdate)
    * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet)
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
    * and [adding product
    * data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
    */
    public MutationQuery productOptionsDelete(ID productId, List<ID> options, ProductOptionsDeletePayloadQueryDefinition queryDef) {
        return productOptionsDelete(productId, options, args -> {}, queryDef);
    }

    /**
    * Deletes one or more
    * [options](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption)
    * from a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product). Product options
    * define the choices available for a product, such as size, color, or material.
    * > Caution:
    * > Removing an option can affect a product's
    * > [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant) and their
    * > configuration. Deleting an option might also delete associated option values and, depending on the
    * chosen
    * >
    * [strategy](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productoptionsdelete#argument
    * s-strategy),
    * > might affect variants.
    * Use the `productOptionsDelete` mutation for the following use cases:
    * - **Simplify product configuration**: Remove obsolete or unnecessary options
    * (for example, discontinue "Material" if all variants are now the same material).
    * - **Clean up after seasonal or limited-time offerings**: Delete options that are no longer
    * relevant (for example, "Holiday edition").
    * - **Automate catalog management**: Enable apps or integrations to programmatically remove options as
    * product
    * data changes.
    * > Note:
    * > The `productOptionsDelete` mutation enforces strict data integrity for product options and
    * variants.
    * > All option positions must remain sequential, and every remaining option must be used by at least
    * one variant.
    * After you delete a product option, you can further manage a product's configuration using related
    * mutations:
    * -
    * [`productOptionsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsC
    * reate)
    * -
    * [`productOptionUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionUpd
    * ate)
    * -
    * [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptions
    * Reorder)
    * -
    * [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkCreate)
    * -
    * [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkUpdate)
    * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet)
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
    * and [adding product
    * data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
    */
    public MutationQuery productOptionsDelete(ID productId, List<ID> options, ProductOptionsDeleteArgumentsDefinition argsDef, ProductOptionsDeletePayloadQueryDefinition queryDef) {
        startField("productOptionsDelete");

        _queryBuilder.append("(productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        _queryBuilder.append(",options:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : options) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        argsDef.define(new ProductOptionsDeleteArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductOptionsDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Reorders the [options](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption) and
    * [option values](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOptionValue) on a
    * [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product),
    * updating the order in which [product
    * variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
    * are presented to customers.
    * The `productOptionsReorder` mutation accepts a list of product options, each identified by `id` or
    * `name`, and an
    * optional list of values (also by `id` or `name`) specifying the new order. The order of options in
    * the
    * mutation's input determines their new positions (for example, the first option becomes `option1`).
    * The order of values within each option determines their new positions. The mutation recalculates the
    * order of
    * variants based on the new option and value order.
    * Suppose a product has the following variants:
    * 1. `"Red / Small"`
    * 2. `"Green / Medium"`
    * 3. `"Blue / Small"`
    * You reorder options and values:
    * ```
    * options: [
    * { name: "Size", values: [{ name: "Small" }, { name: "Medium" }] },
    * { name: "Color", values: [{ name: "Green" }, { name: "Red" }, { name: "Blue" }] }
    * ]
    * ```
    * The resulting variant order will be:
    * 1. `"Small / Green"`
    * 2. `"Small / Red"`
    * 3. `"Small / Blue"`
    * 4. `"Medium / Green"`
    * Use the `productOptionsReorder` mutation for the following use cases:
    * - **Change the order of product options**: For example, display "Color" before "Size" in a store.
    * - **Reorder option values within an option**: For example, show "Red" before "Blue" in a color
    * picker.
    * - **Control the order of product variants**: The order of options and their values determines the
    * sequence in which variants are listed and selected.
    * - **Highlight best-selling options**: Present the most popular or relevant options and values first.
    * - **Promote merchandising strategies**: Highlight seasonal colors, limited editions, or featured
    * sizes.
    * > Note:
    * > The `productOptionsReorder` mutation enforces strict data integrity for product options and
    * variants.
    * > All option positions must be sequential, and every option should be used by at least one variant.
    * After you reorder product options, you can further manage a product's configuration using related
    * mutations:
    * -
    * [`productOptionsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsC
    * reate)
    * -
    * [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsD
    * elete)
    * -
    * [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkCreate)
    * -
    * [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkUpdate)
    * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet)
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
    * and [managing product
    * data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
    */
    public MutationQuery productOptionsReorder(ID productId, List<OptionReorderInput> options, ProductOptionsReorderPayloadQueryDefinition queryDef) {
        startField("productOptionsReorder");

        _queryBuilder.append("(productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        _queryBuilder.append(",options:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (OptionReorderInput item1 : options) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductOptionsReorderPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Asynchronously reorders the media attached to a product.
    */
    public MutationQuery productReorderMedia(ID id, List<MoveInput> moves, ProductReorderMediaPayloadQueryDefinition queryDef) {
        startField("productReorderMedia");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",moves:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (MoveInput item1 : moves) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductReorderMediaPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductSetArguments extends Arguments {
        ProductSetArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Whether the mutation should be run synchronously or asynchronously.
        * If `true`, the mutation will return the updated `product`.
        * If `false`, the mutation will return a `productSetOperation`.
        * Defaults to `true`.
        * Setting `synchronous: false` may be desirable depending on the input complexity/size, and should be
        * used if you are experiencing timeouts.
        * **Note**: When run in the context of a
        * [bulk operation](https://shopify.dev/api/usage/bulk-operations/imports), the mutation will
        * always run synchronously and this argument will be ignored.
        */
        public ProductSetArguments synchronous(Boolean value) {
            if (value != null) {
                startArgument("synchronous");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Specifies the identifier that will be used to lookup the resource.
        */
        public ProductSetArguments identifier(ProductSetIdentifiers value) {
            if (value != null) {
                startArgument("identifier");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ProductSetArgumentsDefinition {
        void define(ProductSetArguments args);
    }

    /**
    * Performs multiple operations to create or update products in a single request.
    * Use the `productSet` mutation to sync information from an external data source into Shopify, manage
    * large
    * product catalogs, and perform batch updates. The mutation is helpful for bulk product management,
    * including price
    * adjustments, inventory updates, and product lifecycle management.
    * The behavior of `productSet` depends on the type of field it's modifying:
    * - **For list fields**: Creates new entries, updates existing entries, and deletes existing entries
    * that aren't included in the mutation's input. Common examples of list fields include
    * [`collections`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet#arguments-inp
    * ut.fields.collections),
    * [`metafields`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet#arguments-inpu
    * t.fields.metafields),
    * and
    * [`variants`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet#arguments-input.
    * fields.variants).
    * - **For all other field types**: Updates only the included fields. Any omitted fields will remain
    * unchanged.
    * > Note:
    * > By default, stores have a limit of 100 product variants for each product. You can create a
    * development store and
    * > [enable the **Extended Variants** developer
    * preview](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/migrate-and-test#crea
    * te-a-development-store-that-allows-2-048-variants-per-product)
    * > to create or update a maximum of 2,048 product variants in a single operation.
    * You can run `productSet` in one of the following modes:
    * - **Synchronously**: Returns the updated product in the response.
    * - **Asynchronously**: Returns a
    * [`ProductSetOperation`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductSetOperatio
    * n) object.
    * Use the [`productOperation`](https://shopify.dev/api/admin-graphql/latest/queries/productOperation)
    * query to check the status of the operation and
    * retrieve details of the updated product and its product variants.
    * If you need to only manage product variants, then use one of the following mutations:
    * -
    * [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkCreate)
    * -
    * [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkUpdate)
    * -
    * [`productVariantsBulkDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkDelete)
    * If you need to only manage product options, then use one of the following mutations:
    * -
    * [`productOptionsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsC
    * reate)
    * -
    * [`productOptionUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionUpd
    * ate)
    * -
    * [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptions
    * Reorder)
    * -
    * [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsD
    * elete)
    * Learn more about [syncing product data from an external
    * source](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/sync-data).
    */
    public MutationQuery productSet(ProductSetInput input, ProductSetPayloadQueryDefinition queryDef) {
        return productSet(input, args -> {}, queryDef);
    }

    /**
    * Performs multiple operations to create or update products in a single request.
    * Use the `productSet` mutation to sync information from an external data source into Shopify, manage
    * large
    * product catalogs, and perform batch updates. The mutation is helpful for bulk product management,
    * including price
    * adjustments, inventory updates, and product lifecycle management.
    * The behavior of `productSet` depends on the type of field it's modifying:
    * - **For list fields**: Creates new entries, updates existing entries, and deletes existing entries
    * that aren't included in the mutation's input. Common examples of list fields include
    * [`collections`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet#arguments-inp
    * ut.fields.collections),
    * [`metafields`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet#arguments-inpu
    * t.fields.metafields),
    * and
    * [`variants`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet#arguments-input.
    * fields.variants).
    * - **For all other field types**: Updates only the included fields. Any omitted fields will remain
    * unchanged.
    * > Note:
    * > By default, stores have a limit of 100 product variants for each product. You can create a
    * development store and
    * > [enable the **Extended Variants** developer
    * preview](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/migrate-and-test#crea
    * te-a-development-store-that-allows-2-048-variants-per-product)
    * > to create or update a maximum of 2,048 product variants in a single operation.
    * You can run `productSet` in one of the following modes:
    * - **Synchronously**: Returns the updated product in the response.
    * - **Asynchronously**: Returns a
    * [`ProductSetOperation`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductSetOperatio
    * n) object.
    * Use the [`productOperation`](https://shopify.dev/api/admin-graphql/latest/queries/productOperation)
    * query to check the status of the operation and
    * retrieve details of the updated product and its product variants.
    * If you need to only manage product variants, then use one of the following mutations:
    * -
    * [`productVariantsBulkCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkCreate)
    * -
    * [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkUpdate)
    * -
    * [`productVariantsBulkDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkDelete)
    * If you need to only manage product options, then use one of the following mutations:
    * -
    * [`productOptionsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsC
    * reate)
    * -
    * [`productOptionUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionUpd
    * ate)
    * -
    * [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptions
    * Reorder)
    * -
    * [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsD
    * elete)
    * Learn more about [syncing product data from an external
    * source](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/sync-data).
    */
    public MutationQuery productSet(ProductSetInput input, ProductSetArgumentsDefinition argsDef, ProductSetPayloadQueryDefinition queryDef) {
        startField("productSet");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        argsDef.define(new ProductSetArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductSetPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductUpdateArguments extends Arguments {
        ProductUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The updated properties for a product.
        */
        public ProductUpdateArguments product(ProductUpdateInput value) {
            if (value != null) {
                startArgument("product");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * List of new media to be added to the product.
        */
        public ProductUpdateArguments media(List<CreateMediaInput> value) {
            if (value != null) {
                startArgument("media");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CreateMediaInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface ProductUpdateArgumentsDefinition {
        void define(ProductUpdateArguments args);
    }

    /**
    * Updates a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
    * with attributes such as title, description, vendor, and media.
    * The `productUpdate` mutation helps you modify many products at once, avoiding the tedious or
    * time-consuming
    * process of updating them one by one in the Shopify admin. Common examples including updating
    * product details like status or tags.
    * The `productUpdate` mutation doesn't support updating
    * [product variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant).
    * To update multiple product variants for a single product and manage prices, use the
    * [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkUpdate)
    * mutation.
    * > Note:
    * > The `productUpdate` mutation has a
    * [throttle](https://shopify.dev/docs/api/usage/rate-limits#resource-based-rate-limits)
    * > that takes effect when a store has 50,000 product variants. After this threshold is reached, no
    * more than
    * > 1,000 new product variants can be updated per day.
    * After updating a product, you can make additional changes using one of the following mutations:
    * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet):
    * Used to perform multiple operations on products, such as creating or modifying product options and
    * variants.
    * -
    * [`publishablePublish`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/publishablePublis
    * h):
    * Used to publish the product and make it available to customers, if the product is currently
    * unpublished.
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
    * and [adding product
    * data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
    */
    public MutationQuery productUpdate(ProductUpdatePayloadQueryDefinition queryDef) {
        return productUpdate(args -> {}, queryDef);
    }

    /**
    * Updates a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
    * with attributes such as title, description, vendor, and media.
    * The `productUpdate` mutation helps you modify many products at once, avoiding the tedious or
    * time-consuming
    * process of updating them one by one in the Shopify admin. Common examples including updating
    * product details like status or tags.
    * The `productUpdate` mutation doesn't support updating
    * [product variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant).
    * To update multiple product variants for a single product and manage prices, use the
    * [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkUpdate)
    * mutation.
    * > Note:
    * > The `productUpdate` mutation has a
    * [throttle](https://shopify.dev/docs/api/usage/rate-limits#resource-based-rate-limits)
    * > that takes effect when a store has 50,000 product variants. After this threshold is reached, no
    * more than
    * > 1,000 new product variants can be updated per day.
    * After updating a product, you can make additional changes using one of the following mutations:
    * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet):
    * Used to perform multiple operations on products, such as creating or modifying product options and
    * variants.
    * -
    * [`publishablePublish`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/publishablePublis
    * h):
    * Used to publish the product and make it available to customers, if the product is currently
    * unpublished.
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
    * and [adding product
    * data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
    */
    public MutationQuery productUpdate(ProductUpdateArgumentsDefinition argsDef, ProductUpdatePayloadQueryDefinition queryDef) {
        startField("productUpdate");

        ProductUpdateArguments args = new ProductUpdateArguments(_queryBuilder);
        argsDef.define(args);
        ProductUpdateArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Appends media from a product to variants of the product.
    */
    public MutationQuery productVariantAppendMedia(ID productId, List<ProductVariantAppendMediaInput> variantMedia, ProductVariantAppendMediaPayloadQueryDefinition queryDef) {
        startField("productVariantAppendMedia");

        _queryBuilder.append("(productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        _queryBuilder.append(",variantMedia:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ProductVariantAppendMediaInput item1 : variantMedia) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantAppendMediaPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Detaches media from product variants.
    */
    public MutationQuery productVariantDetachMedia(ID productId, List<ProductVariantDetachMediaInput> variantMedia, ProductVariantDetachMediaPayloadQueryDefinition queryDef) {
        startField("productVariantDetachMedia");

        _queryBuilder.append("(productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        _queryBuilder.append(",variantMedia:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ProductVariantDetachMediaInput item1 : variantMedia) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantDetachMediaPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds multiple selling plan groups to a product variant.
    */
    public MutationQuery productVariantJoinSellingPlanGroups(ID id, List<ID> sellingPlanGroupIds, ProductVariantJoinSellingPlanGroupsPayloadQueryDefinition queryDef) {
        startField("productVariantJoinSellingPlanGroups");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",sellingPlanGroupIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : sellingPlanGroupIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantJoinSellingPlanGroupsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Remove multiple groups from a product variant.
    */
    public MutationQuery productVariantLeaveSellingPlanGroups(ID id, List<ID> sellingPlanGroupIds, ProductVariantLeaveSellingPlanGroupsPayloadQueryDefinition queryDef) {
        startField("productVariantLeaveSellingPlanGroups");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",sellingPlanGroupIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : sellingPlanGroupIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantLeaveSellingPlanGroupsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates new bundles, updates existing bundles, and removes bundle components for one or multiple
    * bundles.
    */
    public MutationQuery productVariantRelationshipBulkUpdate(List<ProductVariantRelationshipUpdateInput> input, ProductVariantRelationshipBulkUpdatePayloadQueryDefinition queryDef) {
        startField("productVariantRelationshipBulkUpdate");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ProductVariantRelationshipUpdateInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantRelationshipBulkUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductVariantsBulkCreateArguments extends Arguments {
        ProductVariantsBulkCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * List of new media to be added to the product.
        */
        public ProductVariantsBulkCreateArguments media(List<CreateMediaInput> value) {
            if (value != null) {
                startArgument("media");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CreateMediaInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The strategy defines which behavior the mutation should observe, such as whether to keep or delete
        * the standalone variant (when product has only a single or default variant) when creating new
        * variants in bulk.
        */
        public ProductVariantsBulkCreateArguments strategy(ProductVariantsBulkCreateStrategy value) {
            if (value != null) {
                startArgument("strategy");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface ProductVariantsBulkCreateArgumentsDefinition {
        void define(ProductVariantsBulkCreateArguments args);
    }

    /**
    * Creates multiple [product
    * variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
    * for a single [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) in one
    * operation.
    * You can run this mutation directly or as part of a [bulk
    * operation](https://shopify.dev/docs/api/usage/bulk-operations/imports)
    * for large-scale catalog updates.
    * Use the `productVariantsBulkCreate` mutation to efficiently add new product variants—such as
    * different sizes,
    * colors, or materials—to an existing product. The mutation is helpful if you need to add product
    * variants in bulk,
    * such as importing from an external system.
    * The mutation supports:
    * - Creating variants with custom options and values
    * - Associating media (for example, images, videos, and 3D models) with the product or its variants
    * - Handling complex product configurations
    * > Note:
    * > By default, stores have a limit of 100 product variants for each product. You can create a
    * development store and
    * > [enable the **Extended Variants** developer
    * preview](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/migrate-and-test#crea
    * te-a-development-store-that-allows-2-048-variants-per-product)
    * > to create a maximum of 2,048 product variants in a single operation.
    * After creating variants, you can make additional changes using one of the following mutations:
    * -
    * [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkUpdate):
    * Updates multiple product variants for a single product in one operation.
    * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet):
    * Used to perform multiple operations on products, such as creating or modifying product options and
    * variants.
    * You can also specifically manage product options through related mutations:
    * -
    * [`productOptionsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsC
    * reate)
    * -
    * [`productOptionUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionUpd
    * ate)
    * -
    * [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptions
    * Reorder)
    * -
    * [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsD
    * elete)
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
    * and [adding product
    * data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
    */
    public MutationQuery productVariantsBulkCreate(List<ProductVariantsBulkInput> variants, ID productId, ProductVariantsBulkCreatePayloadQueryDefinition queryDef) {
        return productVariantsBulkCreate(variants, productId, args -> {}, queryDef);
    }

    /**
    * Creates multiple [product
    * variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
    * for a single [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) in one
    * operation.
    * You can run this mutation directly or as part of a [bulk
    * operation](https://shopify.dev/docs/api/usage/bulk-operations/imports)
    * for large-scale catalog updates.
    * Use the `productVariantsBulkCreate` mutation to efficiently add new product variants—such as
    * different sizes,
    * colors, or materials—to an existing product. The mutation is helpful if you need to add product
    * variants in bulk,
    * such as importing from an external system.
    * The mutation supports:
    * - Creating variants with custom options and values
    * - Associating media (for example, images, videos, and 3D models) with the product or its variants
    * - Handling complex product configurations
    * > Note:
    * > By default, stores have a limit of 100 product variants for each product. You can create a
    * development store and
    * > [enable the **Extended Variants** developer
    * preview](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/migrate-and-test#crea
    * te-a-development-store-that-allows-2-048-variants-per-product)
    * > to create a maximum of 2,048 product variants in a single operation.
    * After creating variants, you can make additional changes using one of the following mutations:
    * -
    * [`productVariantsBulkUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productVar
    * iantsBulkUpdate):
    * Updates multiple product variants for a single product in one operation.
    * - [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet):
    * Used to perform multiple operations on products, such as creating or modifying product options and
    * variants.
    * You can also specifically manage product options through related mutations:
    * -
    * [`productOptionsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsC
    * reate)
    * -
    * [`productOptionUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionUpd
    * ate)
    * -
    * [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptions
    * Reorder)
    * -
    * [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsD
    * elete)
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
    * and [adding product
    * data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
    */
    public MutationQuery productVariantsBulkCreate(List<ProductVariantsBulkInput> variants, ID productId, ProductVariantsBulkCreateArgumentsDefinition argsDef, ProductVariantsBulkCreatePayloadQueryDefinition queryDef) {
        startField("productVariantsBulkCreate");

        _queryBuilder.append("(variants:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ProductVariantsBulkInput item1 : variants) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(",productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        argsDef.define(new ProductVariantsBulkCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantsBulkCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes multiple variants in a single product. This mutation can be called directly or via the
    * bulkOperation.
    */
    public MutationQuery productVariantsBulkDelete(List<ID> variantsIds, ID productId, ProductVariantsBulkDeletePayloadQueryDefinition queryDef) {
        startField("productVariantsBulkDelete");

        _queryBuilder.append("(variantsIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : variantsIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(",productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantsBulkDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Reorders multiple variants in a single product. This mutation can be called directly or via the
    * bulkOperation.
    */
    public MutationQuery productVariantsBulkReorder(ID productId, List<ProductVariantPositionInput> positions, ProductVariantsBulkReorderPayloadQueryDefinition queryDef) {
        startField("productVariantsBulkReorder");

        _queryBuilder.append("(productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        _queryBuilder.append(",positions:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ProductVariantPositionInput item1 : positions) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantsBulkReorderPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductVariantsBulkUpdateArguments extends Arguments {
        ProductVariantsBulkUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * List of new media to be added to the product.
        */
        public ProductVariantsBulkUpdateArguments media(List<CreateMediaInput> value) {
            if (value != null) {
                startArgument("media");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CreateMediaInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * When partial updates are allowed, valid variant changes may be persisted even if some of
        * the variants updated have invalid data and cannot be persisted.
        * When partial updates are not allowed, any error will prevent all variants from updating.
        */
        public ProductVariantsBulkUpdateArguments allowPartialUpdates(Boolean value) {
            if (value != null) {
                startArgument("allowPartialUpdates");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductVariantsBulkUpdateArgumentsDefinition {
        void define(ProductVariantsBulkUpdateArguments args);
    }

    /**
    * Updates multiple [product
    * variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
    * for a single [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) in one
    * operation.
    * You can run this mutation directly or as part of a [bulk
    * operation](https://shopify.dev/docs/api/usage/bulk-operations/imports)
    * for large-scale catalog updates.
    * Use the `productVariantsBulkUpdate` mutation to efficiently modify product variants—such as
    * different sizes,
    * colors, or materials—associated with an existing product. The mutation is helpful if you need to
    * update a
    * product's variants in bulk, such as importing from an external system.
    * The mutation supports:
    * - Updating variants with custom options and values
    * - Associating media (for example, images, videos, and 3D models) with the product or its variants
    * - Handling complex product configurations
    * > Note:
    * > By default, stores have a limit of 100 product variants for each product. You can create a
    * development store and
    * > [enable the **Extended Variants** developer
    * preview](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/migrate-and-test#crea
    * te-a-development-store-that-allows-2-048-variants-per-product)
    * > to update a maximum of 2,048 product variants in a single operation.
    * After creating variants, you can make additional changes using the
    * [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet) mutation,
    * which is used to perform multiple operations on products, such as creating or modifying product
    * options and variants.
    * You can also specifically manage product options through related mutations:
    * -
    * [`productOptionsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsC
    * reate)
    * -
    * [`productOptionUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionUpd
    * ate)
    * -
    * [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptions
    * Reorder)
    * -
    * [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsD
    * elete)
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
    * and [adding product
    * data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
    */
    public MutationQuery productVariantsBulkUpdate(List<ProductVariantsBulkInput> variants, ID productId, ProductVariantsBulkUpdatePayloadQueryDefinition queryDef) {
        return productVariantsBulkUpdate(variants, productId, args -> {}, queryDef);
    }

    /**
    * Updates multiple [product
    * variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
    * for a single [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) in one
    * operation.
    * You can run this mutation directly or as part of a [bulk
    * operation](https://shopify.dev/docs/api/usage/bulk-operations/imports)
    * for large-scale catalog updates.
    * Use the `productVariantsBulkUpdate` mutation to efficiently modify product variants—such as
    * different sizes,
    * colors, or materials—associated with an existing product. The mutation is helpful if you need to
    * update a
    * product's variants in bulk, such as importing from an external system.
    * The mutation supports:
    * - Updating variants with custom options and values
    * - Associating media (for example, images, videos, and 3D models) with the product or its variants
    * - Handling complex product configurations
    * > Note:
    * > By default, stores have a limit of 100 product variants for each product. You can create a
    * development store and
    * > [enable the **Extended Variants** developer
    * preview](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/migrate-and-test#crea
    * te-a-development-store-that-allows-2-048-variants-per-product)
    * > to update a maximum of 2,048 product variants in a single operation.
    * After creating variants, you can make additional changes using the
    * [`productSet`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productSet) mutation,
    * which is used to perform multiple operations on products, such as creating or modifying product
    * options and variants.
    * You can also specifically manage product options through related mutations:
    * -
    * [`productOptionsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsC
    * reate)
    * -
    * [`productOptionUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionUpd
    * ate)
    * -
    * [`productOptionsReorder`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptions
    * Reorder)
    * -
    * [`productOptionsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productOptionsD
    * elete)
    * Learn more about the [product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model)
    * and [adding product
    * data](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/add-data).
    */
    public MutationQuery productVariantsBulkUpdate(List<ProductVariantsBulkInput> variants, ID productId, ProductVariantsBulkUpdateArgumentsDefinition argsDef, ProductVariantsBulkUpdatePayloadQueryDefinition queryDef) {
        startField("productVariantsBulkUpdate");

        _queryBuilder.append("(variants:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ProductVariantsBulkInput item1 : variants) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(",productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        argsDef.define(new ProductVariantsBulkUpdateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantsBulkUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates the server pixel to connect to a Google PubSub endpoint.
    * Running this mutation deletes any previous subscriptions for the server pixel.
    */
    public MutationQuery pubSubServerPixelUpdate(String pubSubProject, String pubSubTopic, PubSubServerPixelUpdatePayloadQueryDefinition queryDef) {
        startField("pubSubServerPixelUpdate");

        _queryBuilder.append("(pubSubProject:");
        Query.appendQuotedString(_queryBuilder, pubSubProject.toString());

        _queryBuilder.append(",pubSubTopic:");
        Query.appendQuotedString(_queryBuilder, pubSubTopic.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PubSubServerPixelUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new Google Cloud Pub/Sub webhook subscription.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
    */
    public MutationQuery pubSubWebhookSubscriptionCreate(WebhookSubscriptionTopic topic, PubSubWebhookSubscriptionInput webhookSubscription, PubSubWebhookSubscriptionCreatePayloadQueryDefinition queryDef) {
        startField("pubSubWebhookSubscriptionCreate");

        _queryBuilder.append("(topic:");
        _queryBuilder.append(topic.toString());

        _queryBuilder.append(",webhookSubscription:");
        webhookSubscription.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PubSubWebhookSubscriptionCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a Google Cloud Pub/Sub webhook subscription.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
    */
    public MutationQuery pubSubWebhookSubscriptionUpdate(ID id, PubSubWebhookSubscriptionInput webhookSubscription, PubSubWebhookSubscriptionUpdatePayloadQueryDefinition queryDef) {
        startField("pubSubWebhookSubscriptionUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",webhookSubscription:");
        webhookSubscription.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PubSubWebhookSubscriptionUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a publication.
    */
    public MutationQuery publicationCreate(PublicationCreateInput input, PublicationCreatePayloadQueryDefinition queryDef) {
        startField("publicationCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PublicationCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a publication.
    */
    public MutationQuery publicationDelete(ID id, PublicationDeletePayloadQueryDefinition queryDef) {
        startField("publicationDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PublicationDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a publication.
    */
    public MutationQuery publicationUpdate(ID id, PublicationUpdateInput input, PublicationUpdatePayloadQueryDefinition queryDef) {
        startField("publicationUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PublicationUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Publishes a resource to a channel. If the resource is a product, then it's visible in the channel
    * only if the product status is `active`. Products that are sold exclusively on subscription
    * (`requiresSellingPlan: true`) can be published only on online stores.
    */
    public MutationQuery publishablePublish(ID id, List<PublicationInput> input, PublishablePublishPayloadQueryDefinition queryDef) {
        startField("publishablePublish");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (PublicationInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PublishablePublishPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Publishes a resource to current channel. If the resource is a product, then it's visible in the
    * channel only if the product status is `active`. Products that are sold exclusively on subscription
    * (`requiresSellingPlan: true`) can be published only on online stores.
    */
    public MutationQuery publishablePublishToCurrentChannel(ID id, PublishablePublishToCurrentChannelPayloadQueryDefinition queryDef) {
        startField("publishablePublishToCurrentChannel");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PublishablePublishToCurrentChannelPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Unpublishes a resource from a channel. If the resource is a product, then it's visible in the
    * channel only if the product status is `active`.
    */
    public MutationQuery publishableUnpublish(ID id, List<PublicationInput> input, PublishableUnpublishPayloadQueryDefinition queryDef) {
        startField("publishableUnpublish");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (PublicationInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PublishableUnpublishPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Unpublishes a resource from the current channel. If the resource is a product, then it's visible in
    * the channel only if the product status is `active`.
    */
    public MutationQuery publishableUnpublishToCurrentChannel(ID id, PublishableUnpublishToCurrentChannelPayloadQueryDefinition queryDef) {
        startField("publishableUnpublishToCurrentChannel");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PublishableUnpublishToCurrentChannelPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates quantity pricing on a price list. You can use the `quantityPricingByVariantUpdate` mutation
    * to set fixed prices, quantity rules, and quantity price breaks. This mutation does not allow partial
    * successes. If any of the requested resources fail to update, none of the requested resources will be
    * updated. Delete operations are executed before create operations.
    */
    public MutationQuery quantityPricingByVariantUpdate(ID priceListId, QuantityPricingByVariantUpdateInput input, QuantityPricingByVariantUpdatePayloadQueryDefinition queryDef) {
        startField("quantityPricingByVariantUpdate");

        _queryBuilder.append("(priceListId:");
        Query.appendQuotedString(_queryBuilder, priceListId.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new QuantityPricingByVariantUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates or updates existing quantity rules on a price list.
    * You can use the `quantityRulesAdd` mutation to set order level minimums, maximumums and increments
    * for specific product variants.
    */
    public MutationQuery quantityRulesAdd(ID priceListId, List<QuantityRuleInput> quantityRules, QuantityRulesAddPayloadQueryDefinition queryDef) {
        startField("quantityRulesAdd");

        _queryBuilder.append("(priceListId:");
        Query.appendQuotedString(_queryBuilder, priceListId.toString());

        _queryBuilder.append(",quantityRules:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (QuantityRuleInput item1 : quantityRules) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new QuantityRulesAddPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes specific quantity rules from a price list using a product variant ID.
    * You can use the `quantityRulesDelete` mutation to delete a set of quantity rules from a price list.
    */
    public MutationQuery quantityRulesDelete(ID priceListId, List<ID> variantIds, QuantityRulesDeletePayloadQueryDefinition queryDef) {
        startField("quantityRulesDelete");

        _queryBuilder.append("(priceListId:");
        Query.appendQuotedString(_queryBuilder, priceListId.toString());

        _queryBuilder.append(",variantIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : variantIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new QuantityRulesDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a refund for an order, allowing you to process returns and issue payments back to customers.
    * Use the `refundCreate` mutation to programmatically process refunds in scenarios where you need to
    * return money to customers, such as when handling returns, processing chargebacks, or correcting
    * order errors.
    * The `refundCreate` mutation supports various refund scenarios:
    * - Refunding line items with optional restocking
    * - Refunding shipping costs
    * - Refunding duties and import taxes
    * - Refunding additional fees
    * - Processing refunds through different payment methods
    * - Issuing store credit refunds (when enabled)
    * You can create both full and partial refunds, and optionally allow over-refunding in specific
    * cases.
    * After creating a refund, you can track its status and details through the order's
    * [`refunds`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-Order.fields.refun
    * ds)
    * field. The refund is associated with the order and can be used for reporting and reconciliation
    * purposes.
    * Learn more about
    * [managing
    * returns](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/build-return-management
    * )
    * and [refunding
    * duties](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/view-and-refund-duties).
    * > Note:
    * > The refunding behavior of the `refundCreate` mutation is similar to the
    * [`refundReturn`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/returnRefund)
    * mutation. The key difference is that the `refundCreate` mutation lets you to specify restocking
    * behavior
    * for line items, whereas the `returnRefund` mutation focuses solely on handling the financial refund
    * without
    * any restocking input.
    */
    public MutationQuery refundCreate(RefundInput input, RefundCreatePayloadQueryDefinition queryDef) {
        startField("refundCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RefundCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RemoveFromReturnArguments extends Arguments {
        RemoveFromReturnArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The return line items to remove from the return.
        */
        public RemoveFromReturnArguments returnLineItems(List<ReturnLineItemRemoveFromReturnInput> value) {
            if (value != null) {
                startArgument("returnLineItems");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ReturnLineItemRemoveFromReturnInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The exchange line items to remove from the return.
        */
        public RemoveFromReturnArguments exchangeLineItems(List<ExchangeLineItemRemoveFromReturnInput> value) {
            if (value != null) {
                startArgument("exchangeLineItems");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ExchangeLineItemRemoveFromReturnInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface RemoveFromReturnArgumentsDefinition {
        void define(RemoveFromReturnArguments args);
    }

    /**
    * Removes return and/or exchange lines from a return.
    */
    public MutationQuery removeFromReturn(ID returnId, RemoveFromReturnPayloadQueryDefinition queryDef) {
        return removeFromReturn(returnId, args -> {}, queryDef);
    }

    /**
    * Removes return and/or exchange lines from a return.
    */
    public MutationQuery removeFromReturn(ID returnId, RemoveFromReturnArgumentsDefinition argsDef, RemoveFromReturnPayloadQueryDefinition queryDef) {
        startField("removeFromReturn");

        _queryBuilder.append("(returnId:");
        Query.appendQuotedString(_queryBuilder, returnId.toString());

        argsDef.define(new RemoveFromReturnArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RemoveFromReturnPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Approves a customer's return request.
    * If this mutation is successful, then the `Return.status` field of the
    * approved return is set to `OPEN`.
    */
    public MutationQuery returnApproveRequest(ReturnApproveRequestInput input, ReturnApproveRequestPayloadQueryDefinition queryDef) {
        startField("returnApproveRequest");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReturnApproveRequestPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Cancels a return and restores the items back to being fulfilled.
    * Canceling a return is only available before any work has been done
    * on the return (such as an inspection or refund).
    */
    public MutationQuery returnCancel(ID id, ReturnCancelPayloadQueryDefinition queryDef) {
        startField("returnCancel");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReturnCancelPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Indicates a return is complete, either when a refund has been made and items restocked,
    * or simply when it has been marked as returned in the system.
    */
    public MutationQuery returnClose(ID id, ReturnClosePayloadQueryDefinition queryDef) {
        startField("returnClose");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReturnClosePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a return from an existing order that has at least one fulfilled
    * [line item](https://shopify.dev/docs/api/admin-graphql/latest/objects/LineItem)
    * that hasn't yet been refunded. If you create a return on an archived order, then the order is
    * automatically
    * unarchived.
    * Use the `returnCreate` mutation when your workflow involves
    * [approving](https://shopify.dev/docs/api/admin-graphql/latest/mutations/returnApproveRequest) or
    * [declining](https://shopify.dev/docs/api/admin-graphql/latest/mutations/returnDeclineRequest)
    * requested returns
    * outside of the Shopify platform.
    * The `returnCreate` mutation performs the following actions:
    * - Creates a return in the `OPEN` state, and assumes that the return request from the customer has
    * already been
    * approved
    * - Creates a [reverse fulfillment
    * order](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/manage-reverse-fulfillmen
    * t-orders),
    * and enables you to create a [reverse
    * delivery](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/manage-reverse-deliver
    * ies)
    * for the reverse fulfillment order
    * - Creates a sales agreement with a `RETURN` reason, which links to all sales created for the return
    * or exchange
    * - Generates sales records that reverse the sales records for the items being returned
    * - Generates sales records for any exchange line items
    * After you've created a return, use the
    * [`return`](https://shopify.dev/docs/api/admin-graphql/latest/queries/return) query to retrieve the
    * return by its ID. Learn more about providing a
    * [return management
    * workflow](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/build-return-managemen
    * t)
    * for merchants.
    */
    public MutationQuery returnCreate(ReturnInput returnInput, ReturnCreatePayloadQueryDefinition queryDef) {
        startField("returnCreate");

        _queryBuilder.append("(returnInput:");
        returnInput.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReturnCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Declines a return on an order.
    * When a return is declined, each `ReturnLineItem.fulfillmentLineItem` can be associated to a new
    * return.
    * Use the `ReturnCreate` or `ReturnRequest` mutation to initiate a new return.
    */
    public MutationQuery returnDeclineRequest(ReturnDeclineRequestInput input, ReturnDeclineRequestPayloadQueryDefinition queryDef) {
        startField("returnDeclineRequest");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReturnDeclineRequestPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Process a return.
    */
    public MutationQuery returnProcess(ReturnProcessInput input, ReturnProcessPayloadQueryDefinition queryDef) {
        startField("returnProcess");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReturnProcessPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Reopens a closed return.
    */
    public MutationQuery returnReopen(ID id, ReturnReopenPayloadQueryDefinition queryDef) {
        startField("returnReopen");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReturnReopenPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A customer's return request that hasn't been approved or declined.
    * This mutation sets the value of the `Return.status` field to `REQUESTED`.
    * To create a return that has the `Return.status` field set to `OPEN`, use the `returnCreate`
    * mutation.
    */
    public MutationQuery returnRequest(ReturnRequestInput input, ReturnRequestPayloadQueryDefinition queryDef) {
        startField("returnRequest");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReturnRequestPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ReverseDeliveryCreateWithShippingArguments extends Arguments {
        ReverseDeliveryCreateWithShippingArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The tracking information for the reverse delivery.
        */
        public ReverseDeliveryCreateWithShippingArguments trackingInput(ReverseDeliveryTrackingInput value) {
            if (value != null) {
                startArgument("trackingInput");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * The return label file information for the reverse delivery.
        */
        public ReverseDeliveryCreateWithShippingArguments labelInput(ReverseDeliveryLabelInput value) {
            if (value != null) {
                startArgument("labelInput");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * When `true` the customer is notified with delivery instructions if the
        * `ReverseFulfillmentOrder.order.email` is present.
        */
        public ReverseDeliveryCreateWithShippingArguments notifyCustomer(Boolean value) {
            if (value != null) {
                startArgument("notifyCustomer");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReverseDeliveryCreateWithShippingArgumentsDefinition {
        void define(ReverseDeliveryCreateWithShippingArguments args);
    }

    /**
    * Creates a new reverse delivery with associated external shipping information.
    */
    public MutationQuery reverseDeliveryCreateWithShipping(ID reverseFulfillmentOrderId, List<ReverseDeliveryLineItemInput> reverseDeliveryLineItems, ReverseDeliveryCreateWithShippingPayloadQueryDefinition queryDef) {
        return reverseDeliveryCreateWithShipping(reverseFulfillmentOrderId, reverseDeliveryLineItems, args -> {}, queryDef);
    }

    /**
    * Creates a new reverse delivery with associated external shipping information.
    */
    public MutationQuery reverseDeliveryCreateWithShipping(ID reverseFulfillmentOrderId, List<ReverseDeliveryLineItemInput> reverseDeliveryLineItems, ReverseDeliveryCreateWithShippingArgumentsDefinition argsDef, ReverseDeliveryCreateWithShippingPayloadQueryDefinition queryDef) {
        startField("reverseDeliveryCreateWithShipping");

        _queryBuilder.append("(reverseFulfillmentOrderId:");
        Query.appendQuotedString(_queryBuilder, reverseFulfillmentOrderId.toString());

        _queryBuilder.append(",reverseDeliveryLineItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ReverseDeliveryLineItemInput item1 : reverseDeliveryLineItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        argsDef.define(new ReverseDeliveryCreateWithShippingArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReverseDeliveryCreateWithShippingPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ReverseDeliveryShippingUpdateArguments extends Arguments {
        ReverseDeliveryShippingUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The tracking information for the reverse delivery.
        */
        public ReverseDeliveryShippingUpdateArguments trackingInput(ReverseDeliveryTrackingInput value) {
            if (value != null) {
                startArgument("trackingInput");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * The return label file information for the reverse delivery.
        */
        public ReverseDeliveryShippingUpdateArguments labelInput(ReverseDeliveryLabelInput value) {
            if (value != null) {
                startArgument("labelInput");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * If `true` and an email address exists on the `ReverseFulfillmentOrder.order`, then the customer is
        * notified with the updated delivery instructions.
        */
        public ReverseDeliveryShippingUpdateArguments notifyCustomer(Boolean value) {
            if (value != null) {
                startArgument("notifyCustomer");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReverseDeliveryShippingUpdateArgumentsDefinition {
        void define(ReverseDeliveryShippingUpdateArguments args);
    }

    /**
    * Updates a reverse delivery with associated external shipping information.
    */
    public MutationQuery reverseDeliveryShippingUpdate(ID reverseDeliveryId, ReverseDeliveryShippingUpdatePayloadQueryDefinition queryDef) {
        return reverseDeliveryShippingUpdate(reverseDeliveryId, args -> {}, queryDef);
    }

    /**
    * Updates a reverse delivery with associated external shipping information.
    */
    public MutationQuery reverseDeliveryShippingUpdate(ID reverseDeliveryId, ReverseDeliveryShippingUpdateArgumentsDefinition argsDef, ReverseDeliveryShippingUpdatePayloadQueryDefinition queryDef) {
        startField("reverseDeliveryShippingUpdate");

        _queryBuilder.append("(reverseDeliveryId:");
        Query.appendQuotedString(_queryBuilder, reverseDeliveryId.toString());

        argsDef.define(new ReverseDeliveryShippingUpdateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReverseDeliveryShippingUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Disposes reverse fulfillment order line items.
    */
    public MutationQuery reverseFulfillmentOrderDispose(List<ReverseFulfillmentOrderDisposeInput> dispositionInputs, ReverseFulfillmentOrderDisposePayloadQueryDefinition queryDef) {
        startField("reverseFulfillmentOrderDispose");

        _queryBuilder.append("(dispositionInputs:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ReverseFulfillmentOrderDisposeInput item1 : dispositionInputs) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReverseFulfillmentOrderDisposePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a saved search.
    */
    public MutationQuery savedSearchCreate(SavedSearchCreateInput input, SavedSearchCreatePayloadQueryDefinition queryDef) {
        startField("savedSearchCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SavedSearchCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Delete a saved search.
    */
    public MutationQuery savedSearchDelete(SavedSearchDeleteInput input, SavedSearchDeletePayloadQueryDefinition queryDef) {
        startField("savedSearchDelete");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SavedSearchDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a saved search.
    */
    public MutationQuery savedSearchUpdate(SavedSearchUpdateInput input, SavedSearchUpdatePayloadQueryDefinition queryDef) {
        startField("savedSearchUpdate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SavedSearchUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * <div class="note"><h4>Theme app extensions</h4>
    * <p>If your app integrates with a Shopify theme and you plan to submit it to the Shopify App Store,
    * you must use theme app extensions instead of Script tags. Script tags can only be used with vintage
    * themes. <a href="/apps/online-store#what-integration-method-should-i-use" target="_blank">Learn
    * more</a>.</p></div>
    * <div class="note"><h4>Script tag deprecation</h4>
    * <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a
    * href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade to Checkout
    * Extensibility</a> before this date. <a href="/docs/api/liquid/objects#script">Shopify Scripts</a>
    * will continue to work alongside Checkout Extensibility until August 28, 2025.</p></div>
    * Creates a new script tag.
    */
    public MutationQuery scriptTagCreate(ScriptTagInput input, ScriptTagCreatePayloadQueryDefinition queryDef) {
        startField("scriptTagCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ScriptTagCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * <div class="note"><h4>Theme app extensions</h4>
    * <p>If your app integrates with a Shopify theme and you plan to submit it to the Shopify App Store,
    * you must use theme app extensions instead of Script tags. Script tags can only be used with vintage
    * themes. <a href="/apps/online-store#what-integration-method-should-i-use" target="_blank">Learn
    * more</a>.</p></div>
    * <div class="note"><h4>Script tag deprecation</h4>
    * <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a
    * href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade to Checkout
    * Extensibility</a> before this date. <a href="/docs/api/liquid/objects#script">Shopify Scripts</a>
    * will continue to work alongside Checkout Extensibility until August 28, 2025.</p></div>
    * Deletes a script tag.
    */
    public MutationQuery scriptTagDelete(ID id, ScriptTagDeletePayloadQueryDefinition queryDef) {
        startField("scriptTagDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ScriptTagDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * <div class="note"><h4>Theme app extensions</h4>
    * <p>If your app integrates with a Shopify theme and you plan to submit it to the Shopify App Store,
    * you must use theme app extensions instead of Script tags. Script tags can only be used with vintage
    * themes. <a href="/apps/online-store#what-integration-method-should-i-use" target="_blank">Learn
    * more</a>.</p></div>
    * <div class="note"><h4>Script tag deprecation</h4>
    * <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a
    * href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade to Checkout
    * Extensibility</a> before this date. <a href="/docs/api/liquid/objects#script">Shopify Scripts</a>
    * will continue to work alongside Checkout Extensibility until August 28, 2025.</p></div>
    * Updates a script tag.
    */
    public MutationQuery scriptTagUpdate(ID id, ScriptTagInput input, ScriptTagUpdatePayloadQueryDefinition queryDef) {
        startField("scriptTagUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ScriptTagUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a segment.
    */
    public MutationQuery segmentCreate(String name, String query, SegmentCreatePayloadQueryDefinition queryDef) {
        startField("segmentCreate");

        _queryBuilder.append("(name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(",query:");
        Query.appendQuotedString(_queryBuilder, query.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SegmentCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a segment.
    */
    public MutationQuery segmentDelete(ID id, SegmentDeletePayloadQueryDefinition queryDef) {
        startField("segmentDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SegmentDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SegmentUpdateArguments extends Arguments {
        SegmentUpdateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The new name for the segment.
        */
        public SegmentUpdateArguments name(String value) {
            if (value != null) {
                startArgument("name");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * A precise definition of the segment. The definition is composed of a combination of conditions on
        * facts about customers such as `email_subscription_status = 'SUBSCRIBED'` with [this
        * syntax](https://shopify.dev/api/shopifyql/segment-query-language-reference).
        */
        public SegmentUpdateArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface SegmentUpdateArgumentsDefinition {
        void define(SegmentUpdateArguments args);
    }

    /**
    * Updates a segment.
    */
    public MutationQuery segmentUpdate(ID id, SegmentUpdatePayloadQueryDefinition queryDef) {
        return segmentUpdate(id, args -> {}, queryDef);
    }

    /**
    * Updates a segment.
    */
    public MutationQuery segmentUpdate(ID id, SegmentUpdateArgumentsDefinition argsDef, SegmentUpdatePayloadQueryDefinition queryDef) {
        startField("segmentUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new SegmentUpdateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SegmentUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds multiple product variants to a selling plan group.
    */
    public MutationQuery sellingPlanGroupAddProductVariants(ID id, List<ID> productVariantIds, SellingPlanGroupAddProductVariantsPayloadQueryDefinition queryDef) {
        startField("sellingPlanGroupAddProductVariants");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",productVariantIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : productVariantIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupAddProductVariantsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds multiple products to a selling plan group.
    */
    public MutationQuery sellingPlanGroupAddProducts(ID id, List<ID> productIds, SellingPlanGroupAddProductsPayloadQueryDefinition queryDef) {
        startField("sellingPlanGroupAddProducts");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",productIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : productIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupAddProductsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SellingPlanGroupCreateArguments extends Arguments {
        SellingPlanGroupCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The resources this Selling Plan Group should be applied to.
        */
        public SellingPlanGroupCreateArguments resources(SellingPlanGroupResourceInput value) {
            if (value != null) {
                startArgument("resources");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface SellingPlanGroupCreateArgumentsDefinition {
        void define(SellingPlanGroupCreateArguments args);
    }

    /**
    * Creates a Selling Plan Group.
    */
    public MutationQuery sellingPlanGroupCreate(SellingPlanGroupInput input, SellingPlanGroupCreatePayloadQueryDefinition queryDef) {
        return sellingPlanGroupCreate(input, args -> {}, queryDef);
    }

    /**
    * Creates a Selling Plan Group.
    */
    public MutationQuery sellingPlanGroupCreate(SellingPlanGroupInput input, SellingPlanGroupCreateArgumentsDefinition argsDef, SellingPlanGroupCreatePayloadQueryDefinition queryDef) {
        startField("sellingPlanGroupCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        argsDef.define(new SellingPlanGroupCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Delete a Selling Plan Group. This does not affect subscription contracts.
    */
    public MutationQuery sellingPlanGroupDelete(ID id, SellingPlanGroupDeletePayloadQueryDefinition queryDef) {
        startField("sellingPlanGroupDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Removes multiple product variants from a selling plan group.
    */
    public MutationQuery sellingPlanGroupRemoveProductVariants(ID id, List<ID> productVariantIds, SellingPlanGroupRemoveProductVariantsPayloadQueryDefinition queryDef) {
        startField("sellingPlanGroupRemoveProductVariants");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",productVariantIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : productVariantIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupRemoveProductVariantsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Removes multiple products from a selling plan group.
    */
    public MutationQuery sellingPlanGroupRemoveProducts(ID id, List<ID> productIds, SellingPlanGroupRemoveProductsPayloadQueryDefinition queryDef) {
        startField("sellingPlanGroupRemoveProducts");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",productIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : productIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupRemoveProductsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Update a Selling Plan Group.
    */
    public MutationQuery sellingPlanGroupUpdate(ID id, SellingPlanGroupInput input, SellingPlanGroupUpdatePayloadQueryDefinition queryDef) {
        startField("sellingPlanGroupUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new unconfigured server pixel. A single server pixel can exist for an app and shop
    * combination. If you call this mutation when a server pixel already exists, then an error will
    * return.
    */
    public MutationQuery serverPixelCreate(ServerPixelCreatePayloadQueryDefinition queryDef) {
        startField("serverPixelCreate");

        _queryBuilder.append('{');
        queryDef.define(new ServerPixelCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes the Server Pixel associated with the current app & shop.
    */
    public MutationQuery serverPixelDelete(ServerPixelDeletePayloadQueryDefinition queryDef) {
        startField("serverPixelDelete");

        _queryBuilder.append('{');
        queryDef.define(new ServerPixelDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a shipping package.
    */
    public MutationQuery shippingPackageDelete(ID id, ShippingPackageDeletePayloadQueryDefinition queryDef) {
        startField("shippingPackageDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ShippingPackageDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Set a shipping package as the default.
    * The default shipping package is the one used to calculate shipping costs on checkout.
    */
    public MutationQuery shippingPackageMakeDefault(ID id, ShippingPackageMakeDefaultPayloadQueryDefinition queryDef) {
        startField("shippingPackageMakeDefault");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ShippingPackageMakeDefaultPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a shipping package.
    */
    public MutationQuery shippingPackageUpdate(ID id, CustomShippingPackageInput shippingPackage, ShippingPackageUpdatePayloadQueryDefinition queryDef) {
        startField("shippingPackageUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",shippingPackage:");
        shippingPackage.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ShippingPackageUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a locale for a shop. This also deletes all translations of this locale.
    */
    public MutationQuery shopLocaleDisable(String locale, ShopLocaleDisablePayloadQueryDefinition queryDef) {
        startField("shopLocaleDisable");

        _queryBuilder.append("(locale:");
        Query.appendQuotedString(_queryBuilder, locale.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ShopLocaleDisablePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ShopLocaleEnableArguments extends Arguments {
        ShopLocaleEnableArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The list of markets web presences to add the locale to.
        */
        public ShopLocaleEnableArguments marketWebPresenceIds(List<ID> value) {
            if (value != null) {
                startArgument("marketWebPresenceIds");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface ShopLocaleEnableArgumentsDefinition {
        void define(ShopLocaleEnableArguments args);
    }

    /**
    * Adds a locale for a shop. The newly added locale is in the unpublished state.
    */
    public MutationQuery shopLocaleEnable(String locale, ShopLocaleEnablePayloadQueryDefinition queryDef) {
        return shopLocaleEnable(locale, args -> {}, queryDef);
    }

    /**
    * Adds a locale for a shop. The newly added locale is in the unpublished state.
    */
    public MutationQuery shopLocaleEnable(String locale, ShopLocaleEnableArgumentsDefinition argsDef, ShopLocaleEnablePayloadQueryDefinition queryDef) {
        startField("shopLocaleEnable");

        _queryBuilder.append("(locale:");
        Query.appendQuotedString(_queryBuilder, locale.toString());

        argsDef.define(new ShopLocaleEnableArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ShopLocaleEnablePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a locale for a shop.
    */
    public MutationQuery shopLocaleUpdate(String locale, ShopLocaleInput shopLocale, ShopLocaleUpdatePayloadQueryDefinition queryDef) {
        startField("shopLocaleUpdate");

        _queryBuilder.append("(locale:");
        Query.appendQuotedString(_queryBuilder, locale.toString());

        _queryBuilder.append(",shopLocale:");
        shopLocale.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ShopLocaleUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a shop policy.
    */
    public MutationQuery shopPolicyUpdate(ShopPolicyInput shopPolicy, ShopPolicyUpdatePayloadQueryDefinition queryDef) {
        startField("shopPolicyUpdate");

        _queryBuilder.append("(shopPolicy:");
        shopPolicy.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ShopPolicyUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery shopResourceFeedbackCreate(ResourceFeedbackCreateInput input, ShopResourceFeedbackCreatePayloadQueryDefinition queryDef) {
        startField("shopResourceFeedbackCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ShopResourceFeedbackCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ShopifyPaymentsPayoutAlternateCurrencyCreateArguments extends Arguments {
        ShopifyPaymentsPayoutAlternateCurrencyCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The ID of the Shopify Payments account on which the mutation is being performed.
        */
        public ShopifyPaymentsPayoutAlternateCurrencyCreateArguments accountId(ID value) {
            if (value != null) {
                startArgument("accountId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface ShopifyPaymentsPayoutAlternateCurrencyCreateArgumentsDefinition {
        void define(ShopifyPaymentsPayoutAlternateCurrencyCreateArguments args);
    }

    /**
    * Creates an alternate currency payout for a Shopify Payments account.
    */
    public MutationQuery shopifyPaymentsPayoutAlternateCurrencyCreate(CurrencyCode currency, ShopifyPaymentsPayoutAlternateCurrencyCreatePayloadQueryDefinition queryDef) {
        return shopifyPaymentsPayoutAlternateCurrencyCreate(currency, args -> {}, queryDef);
    }

    /**
    * Creates an alternate currency payout for a Shopify Payments account.
    */
    public MutationQuery shopifyPaymentsPayoutAlternateCurrencyCreate(CurrencyCode currency, ShopifyPaymentsPayoutAlternateCurrencyCreateArgumentsDefinition argsDef, ShopifyPaymentsPayoutAlternateCurrencyCreatePayloadQueryDefinition queryDef) {
        startField("shopifyPaymentsPayoutAlternateCurrencyCreate");

        _queryBuilder.append("(currency:");
        _queryBuilder.append(currency.toString());

        argsDef.define(new ShopifyPaymentsPayoutAlternateCurrencyCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsPayoutAlternateCurrencyCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates staged upload targets for file uploads such as images, videos, and 3D models.
    * Use the `stagedUploadsCreate` mutation instead of direct file creation mutations when:
    * - **Uploading large files**: Files over a few MB benefit from staged uploads for better reliability
    * - **Uploading media files**: Videos, 3D models, and high-resolution images
    * - **Bulk importing**: CSV files, product catalogs, or other bulk data
    * - **Using external file sources**: When files are stored remotely and need to be transferred to
    * Shopify
    * For small files or simple use cases, you can use
    * [`fileCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/fileCreate)
    * directly by providing the file content inline.
    * The `stagedUploadsCreate` mutation is the first step in Shopify's secure two-step upload process:
    * **Step 1: Create staged upload targets** (this mutation)
    * - Generate secure, temporary upload URLs for your files.
    * - Receive authentication parameters for the upload.
    * **Step 2: Upload files and create assets**
    * - Upload your files directly to the provided URLs using the authentication parameters.
    * - Use the returned `resourceUrl` as the `originalSource` in subsequent mutations like `fileCreate`.
    * This approach provides better performance for large files, handles network interruptions gracefully,
    * and ensures secure file transfers to Shopify's storage infrastructure.
    * > Note:
    * > File size is required when uploading
    * >
    * [`VIDEO`](https://shopify.dev/docs/api/admin-graphql/latest/enums/StagedUploadTargetGenerateUploadRe
    * source#enums-VIDEO) or
    * >
    * [`MODEL_3D`](https://shopify.dev/docs/api/admin-graphql/latest/enums/StagedUploadTargetGenerateUploa
    * dResource#enums-MODEL_3D)
    * > resources.
    * After creating staged upload targets, complete the process by:
    * 1. **Uploading files**: Send your files to the returned
    * [`url`](https://shopify.dev/docs/api/admin-graphql/latest/objects/StagedMediaUploadTarget#field-Stag
    * edMediaUploadTarget.fields.url) using the provided
    * [`parameters`](https://shopify.dev/docs/api/admin-graphql/latest/objects/StagedMediaUploadTarget#fie
    * ld-StagedMediaUploadTarget.fields.parameters)
    * for authentication
    * 2. **Creating file assets**: Use the
    * [`resourceUrl`](https://shopify.dev/docs/api/admin-graphql/latest/objects/StagedMediaUploadTarget#fi
    * eld-StagedMediaUploadTarget.fields.resourceUrl)
    * as the `originalSource` in mutations such as:
    * - [`fileCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/fileCreate):
    * Creates file assets from staged uploads
    * - [`productUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productUpdate):
    * Updates products with new media from staged uploads
    * Learn more about [uploading media to Shopify](https://shopify.dev/apps/online-store/media/products).
    */
    public MutationQuery stagedUploadsCreate(List<StagedUploadInput> input, StagedUploadsCreatePayloadQueryDefinition queryDef) {
        startField("stagedUploadsCreate");

        _queryBuilder.append("(input:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (StagedUploadInput item1 : input) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new StagedUploadsCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class StandardMetafieldDefinitionEnableArguments extends Arguments {
        StandardMetafieldDefinitionEnableArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The ID of the standard metafield definition template to enable.
        */
        public StandardMetafieldDefinitionEnableArguments id(ID value) {
            if (value != null) {
                startArgument("id");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The namespace of the standard metafield to enable. Used in combination with `key`.
        */
        public StandardMetafieldDefinitionEnableArguments namespace(String value) {
            if (value != null) {
                startArgument("namespace");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The key of the standard metafield to enable. Used in combination with `namespace`.
        */
        public StandardMetafieldDefinitionEnableArguments key(String value) {
            if (value != null) {
                startArgument("key");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Whether to pin the metafield definition.
        */
        public StandardMetafieldDefinitionEnableArguments pin(Boolean value) {
            if (value != null) {
                startArgument("pin");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The capabilities of the metafield definition.
        */
        public StandardMetafieldDefinitionEnableArguments capabilities(MetafieldCapabilityCreateInput value) {
            if (value != null) {
                startArgument("capabilities");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * The access settings that apply to each of the metafields that belong to the metafield definition.
        */
        public StandardMetafieldDefinitionEnableArguments access(StandardMetafieldDefinitionAccessInput value) {
            if (value != null) {
                startArgument("access");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface StandardMetafieldDefinitionEnableArgumentsDefinition {
        void define(StandardMetafieldDefinitionEnableArguments args);
    }

    /**
    * Activates the specified standard metafield definition from its template.
    * Refer to the [list of standard metafield definition
    * templates](https://shopify.dev/apps/metafields/definitions/standard-definitions).
    */
    public MutationQuery standardMetafieldDefinitionEnable(MetafieldOwnerType ownerType, StandardMetafieldDefinitionEnablePayloadQueryDefinition queryDef) {
        return standardMetafieldDefinitionEnable(ownerType, args -> {}, queryDef);
    }

    /**
    * Activates the specified standard metafield definition from its template.
    * Refer to the [list of standard metafield definition
    * templates](https://shopify.dev/apps/metafields/definitions/standard-definitions).
    */
    public MutationQuery standardMetafieldDefinitionEnable(MetafieldOwnerType ownerType, StandardMetafieldDefinitionEnableArgumentsDefinition argsDef, StandardMetafieldDefinitionEnablePayloadQueryDefinition queryDef) {
        startField("standardMetafieldDefinitionEnable");

        _queryBuilder.append("(ownerType:");
        _queryBuilder.append(ownerType.toString());

        argsDef.define(new StandardMetafieldDefinitionEnableArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new StandardMetafieldDefinitionEnablePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Enables the specified standard metaobject definition from its template.
    */
    public MutationQuery standardMetaobjectDefinitionEnable(String type, StandardMetaobjectDefinitionEnablePayloadQueryDefinition queryDef) {
        startField("standardMetaobjectDefinitionEnable");

        _queryBuilder.append("(type:");
        Query.appendQuotedString(_queryBuilder, type.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new StandardMetaobjectDefinitionEnablePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a credit transaction that increases the store credit account balance by the given amount.
    * This operation will create an account if one does not already exist.
    * A store credit account owner can hold multiple accounts each with a different currency.
    * Use the most appropriate currency for the given store credit account owner.
    */
    public MutationQuery storeCreditAccountCredit(ID id, StoreCreditAccountCreditInput creditInput, StoreCreditAccountCreditPayloadQueryDefinition queryDef) {
        startField("storeCreditAccountCredit");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",creditInput:");
        creditInput.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountCreditPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a debit transaction that decreases the store credit account balance by the given amount.
    */
    public MutationQuery storeCreditAccountDebit(ID id, StoreCreditAccountDebitInput debitInput, StoreCreditAccountDebitPayloadQueryDefinition queryDef) {
        startField("storeCreditAccountDebit");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",debitInput:");
        debitInput.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountDebitPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery storefrontAccessTokenCreate(StorefrontAccessTokenInput input, StorefrontAccessTokenCreatePayloadQueryDefinition queryDef) {
        startField("storefrontAccessTokenCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new StorefrontAccessTokenCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a storefront access token.
    */
    public MutationQuery storefrontAccessTokenDelete(StorefrontAccessTokenDeleteInput input, StorefrontAccessTokenDeletePayloadQueryDefinition queryDef) {
        startField("storefrontAccessTokenDelete");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new StorefrontAccessTokenDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new subscription billing attempt. For more information, refer to [Create a subscription
    * contract](https://shopify.dev/docs/apps/selling-strategies/subscriptions/contracts/create#step-4-cre
    * ate-a-billing-attempt).
    */
    public MutationQuery subscriptionBillingAttemptCreate(ID subscriptionContractId, SubscriptionBillingAttemptInput subscriptionBillingAttemptInput, SubscriptionBillingAttemptCreatePayloadQueryDefinition queryDef) {
        startField("subscriptionBillingAttemptCreate");

        _queryBuilder.append("(subscriptionContractId:");
        Query.appendQuotedString(_queryBuilder, subscriptionContractId.toString());

        _queryBuilder.append(",subscriptionBillingAttemptInput:");
        subscriptionBillingAttemptInput.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingAttemptCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SubscriptionBillingCycleBulkChargeArguments extends Arguments {
        SubscriptionBillingCycleBulkChargeArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Criteria to filter the billing cycles on which the action is executed.
        */
        public SubscriptionBillingCycleBulkChargeArguments filters(SubscriptionBillingCycleBulkFilters value) {
            if (value != null) {
                startArgument("filters");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * The behaviour to use when updating inventory.
        */
        public SubscriptionBillingCycleBulkChargeArguments inventoryPolicy(SubscriptionBillingAttemptInventoryPolicy value) {
            if (value != null) {
                startArgument("inventoryPolicy");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface SubscriptionBillingCycleBulkChargeArgumentsDefinition {
        void define(SubscriptionBillingCycleBulkChargeArguments args);
    }

    /**
    * Asynchronously queries and charges all subscription billing cycles whose
    * [billingAttemptExpectedDate](https://shopify.dev/api/admin-graphql/latest/objects/SubscriptionBillin
    * gCycle#field-billingattemptexpecteddate) values fall within a specified date range and meet
    * additional filtering criteria. The results of this action can be retrieved using the
    * [subscriptionBillingCycleBulkResults](https://shopify.dev/api/admin-graphql/latest/queries/subscript
    * ionBillingCycleBulkResults) query.
    */
    public MutationQuery subscriptionBillingCycleBulkCharge(SubscriptionBillingCyclesDateRangeSelector billingAttemptExpectedDateRange, SubscriptionBillingCycleBulkChargePayloadQueryDefinition queryDef) {
        return subscriptionBillingCycleBulkCharge(billingAttemptExpectedDateRange, args -> {}, queryDef);
    }

    /**
    * Asynchronously queries and charges all subscription billing cycles whose
    * [billingAttemptExpectedDate](https://shopify.dev/api/admin-graphql/latest/objects/SubscriptionBillin
    * gCycle#field-billingattemptexpecteddate) values fall within a specified date range and meet
    * additional filtering criteria. The results of this action can be retrieved using the
    * [subscriptionBillingCycleBulkResults](https://shopify.dev/api/admin-graphql/latest/queries/subscript
    * ionBillingCycleBulkResults) query.
    */
    public MutationQuery subscriptionBillingCycleBulkCharge(SubscriptionBillingCyclesDateRangeSelector billingAttemptExpectedDateRange, SubscriptionBillingCycleBulkChargeArgumentsDefinition argsDef, SubscriptionBillingCycleBulkChargePayloadQueryDefinition queryDef) {
        startField("subscriptionBillingCycleBulkCharge");

        _queryBuilder.append("(billingAttemptExpectedDateRange:");
        billingAttemptExpectedDateRange.appendTo(_queryBuilder);

        argsDef.define(new SubscriptionBillingCycleBulkChargeArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleBulkChargePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SubscriptionBillingCycleBulkSearchArguments extends Arguments {
        SubscriptionBillingCycleBulkSearchArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Criteria to filter the billing cycles on which the action is executed.
        */
        public SubscriptionBillingCycleBulkSearchArguments filters(SubscriptionBillingCycleBulkFilters value) {
            if (value != null) {
                startArgument("filters");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface SubscriptionBillingCycleBulkSearchArgumentsDefinition {
        void define(SubscriptionBillingCycleBulkSearchArguments args);
    }

    /**
    * Asynchronously queries all subscription billing cycles whose
    * [billingAttemptExpectedDate](https://shopify.dev/api/admin-graphql/latest/objects/SubscriptionBillin
    * gCycle#field-billingattemptexpecteddate) values fall within a specified date range and meet
    * additional filtering criteria. The results of this action can be retrieved using the
    * [subscriptionBillingCycleBulkResults](https://shopify.dev/api/admin-graphql/latest/queries/subscript
    * ionBillingCycleBulkResults) query.
    */
    public MutationQuery subscriptionBillingCycleBulkSearch(SubscriptionBillingCyclesDateRangeSelector billingAttemptExpectedDateRange, SubscriptionBillingCycleBulkSearchPayloadQueryDefinition queryDef) {
        return subscriptionBillingCycleBulkSearch(billingAttemptExpectedDateRange, args -> {}, queryDef);
    }

    /**
    * Asynchronously queries all subscription billing cycles whose
    * [billingAttemptExpectedDate](https://shopify.dev/api/admin-graphql/latest/objects/SubscriptionBillin
    * gCycle#field-billingattemptexpecteddate) values fall within a specified date range and meet
    * additional filtering criteria. The results of this action can be retrieved using the
    * [subscriptionBillingCycleBulkResults](https://shopify.dev/api/admin-graphql/latest/queries/subscript
    * ionBillingCycleBulkResults) query.
    */
    public MutationQuery subscriptionBillingCycleBulkSearch(SubscriptionBillingCyclesDateRangeSelector billingAttemptExpectedDateRange, SubscriptionBillingCycleBulkSearchArgumentsDefinition argsDef, SubscriptionBillingCycleBulkSearchPayloadQueryDefinition queryDef) {
        startField("subscriptionBillingCycleBulkSearch");

        _queryBuilder.append("(billingAttemptExpectedDateRange:");
        billingAttemptExpectedDateRange.appendTo(_queryBuilder);

        argsDef.define(new SubscriptionBillingCycleBulkSearchArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleBulkSearchPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SubscriptionBillingCycleChargeArguments extends Arguments {
        SubscriptionBillingCycleChargeArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The behaviour to use when updating inventory.
        */
        public SubscriptionBillingCycleChargeArguments inventoryPolicy(SubscriptionBillingAttemptInventoryPolicy value) {
            if (value != null) {
                startArgument("inventoryPolicy");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface SubscriptionBillingCycleChargeArgumentsDefinition {
        void define(SubscriptionBillingCycleChargeArguments args);
    }

    /**
    * Creates a new subscription billing attempt for a specified billing cycle. This is the alternative
    * mutation for
    * [subscriptionBillingAttemptCreate](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subsc
    * riptionBillingAttemptCreate). For more information, refer to [Create a subscription
    * contract](https://shopify.dev/docs/apps/selling-strategies/subscriptions/contracts/create#step-4-cre
    * ate-a-billing-attempt).
    */
    public MutationQuery subscriptionBillingCycleCharge(ID subscriptionContractId, SubscriptionBillingCycleSelector billingCycleSelector, SubscriptionBillingCycleChargePayloadQueryDefinition queryDef) {
        return subscriptionBillingCycleCharge(subscriptionContractId, billingCycleSelector, args -> {}, queryDef);
    }

    /**
    * Creates a new subscription billing attempt for a specified billing cycle. This is the alternative
    * mutation for
    * [subscriptionBillingAttemptCreate](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subsc
    * riptionBillingAttemptCreate). For more information, refer to [Create a subscription
    * contract](https://shopify.dev/docs/apps/selling-strategies/subscriptions/contracts/create#step-4-cre
    * ate-a-billing-attempt).
    */
    public MutationQuery subscriptionBillingCycleCharge(ID subscriptionContractId, SubscriptionBillingCycleSelector billingCycleSelector, SubscriptionBillingCycleChargeArgumentsDefinition argsDef, SubscriptionBillingCycleChargePayloadQueryDefinition queryDef) {
        startField("subscriptionBillingCycleCharge");

        _queryBuilder.append("(subscriptionContractId:");
        Query.appendQuotedString(_queryBuilder, subscriptionContractId.toString());

        _queryBuilder.append(",billingCycleSelector:");
        billingCycleSelector.appendTo(_queryBuilder);

        argsDef.define(new SubscriptionBillingCycleChargeArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleChargePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Commits the updates of a Subscription Billing Cycle Contract draft.
    */
    public MutationQuery subscriptionBillingCycleContractDraftCommit(ID draftId, SubscriptionBillingCycleContractDraftCommitPayloadQueryDefinition queryDef) {
        startField("subscriptionBillingCycleContractDraftCommit");

        _queryBuilder.append("(draftId:");
        Query.appendQuotedString(_queryBuilder, draftId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleContractDraftCommitPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Concatenates a contract to a Subscription Draft.
    */
    public MutationQuery subscriptionBillingCycleContractDraftConcatenate(ID draftId, List<SubscriptionBillingCycleInput> concatenatedBillingCycleContracts, SubscriptionBillingCycleContractDraftConcatenatePayloadQueryDefinition queryDef) {
        startField("subscriptionBillingCycleContractDraftConcatenate");

        _queryBuilder.append("(draftId:");
        Query.appendQuotedString(_queryBuilder, draftId.toString());

        _queryBuilder.append(",concatenatedBillingCycleContracts:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (SubscriptionBillingCycleInput item1 : concatenatedBillingCycleContracts) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleContractDraftConcatenatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Edit the contents of a subscription contract for the specified billing cycle.
    */
    public MutationQuery subscriptionBillingCycleContractEdit(SubscriptionBillingCycleInput billingCycleInput, SubscriptionBillingCycleContractEditPayloadQueryDefinition queryDef) {
        startField("subscriptionBillingCycleContractEdit");

        _queryBuilder.append("(billingCycleInput:");
        billingCycleInput.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleContractEditPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Delete the schedule and contract edits of the selected subscription billing cycle.
    */
    public MutationQuery subscriptionBillingCycleEditDelete(SubscriptionBillingCycleInput billingCycleInput, SubscriptionBillingCycleEditDeletePayloadQueryDefinition queryDef) {
        startField("subscriptionBillingCycleEditDelete");

        _queryBuilder.append("(billingCycleInput:");
        billingCycleInput.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleEditDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Delete the current and future schedule and contract edits of a list of subscription billing cycles.
    */
    public MutationQuery subscriptionBillingCycleEditsDelete(ID contractId, SubscriptionBillingCyclesTargetSelection targetSelection, SubscriptionBillingCycleEditsDeletePayloadQueryDefinition queryDef) {
        startField("subscriptionBillingCycleEditsDelete");

        _queryBuilder.append("(contractId:");
        Query.appendQuotedString(_queryBuilder, contractId.toString());

        _queryBuilder.append(",targetSelection:");
        _queryBuilder.append(targetSelection.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleEditsDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Modify the schedule of a specific billing cycle.
    */
    public MutationQuery subscriptionBillingCycleScheduleEdit(SubscriptionBillingCycleInput billingCycleInput, SubscriptionBillingCycleScheduleEditInput input, SubscriptionBillingCycleScheduleEditPayloadQueryDefinition queryDef) {
        startField("subscriptionBillingCycleScheduleEdit");

        _queryBuilder.append("(billingCycleInput:");
        billingCycleInput.appendTo(_queryBuilder);

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleScheduleEditPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Skips a Subscription Billing Cycle.
    */
    public MutationQuery subscriptionBillingCycleSkip(SubscriptionBillingCycleInput billingCycleInput, SubscriptionBillingCycleSkipPayloadQueryDefinition queryDef) {
        startField("subscriptionBillingCycleSkip");

        _queryBuilder.append("(billingCycleInput:");
        billingCycleInput.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleSkipPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Unskips a Subscription Billing Cycle.
    */
    public MutationQuery subscriptionBillingCycleUnskip(SubscriptionBillingCycleInput billingCycleInput, SubscriptionBillingCycleUnskipPayloadQueryDefinition queryDef) {
        startField("subscriptionBillingCycleUnskip");

        _queryBuilder.append("(billingCycleInput:");
        billingCycleInput.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleUnskipPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Activates a Subscription Contract. Contract status must be either active, paused, or failed.
    */
    public MutationQuery subscriptionContractActivate(ID subscriptionContractId, SubscriptionContractActivatePayloadQueryDefinition queryDef) {
        startField("subscriptionContractActivate");

        _queryBuilder.append("(subscriptionContractId:");
        Query.appendQuotedString(_queryBuilder, subscriptionContractId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractActivatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a Subscription Contract.
    */
    public MutationQuery subscriptionContractAtomicCreate(SubscriptionContractAtomicCreateInput input, SubscriptionContractAtomicCreatePayloadQueryDefinition queryDef) {
        startField("subscriptionContractAtomicCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractAtomicCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Cancels a Subscription Contract.
    */
    public MutationQuery subscriptionContractCancel(ID subscriptionContractId, SubscriptionContractCancelPayloadQueryDefinition queryDef) {
        startField("subscriptionContractCancel");

        _queryBuilder.append("(subscriptionContractId:");
        Query.appendQuotedString(_queryBuilder, subscriptionContractId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractCancelPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery subscriptionContractCreate(SubscriptionContractCreateInput input, SubscriptionContractCreatePayloadQueryDefinition queryDef) {
        startField("subscriptionContractCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Expires a Subscription Contract.
    */
    public MutationQuery subscriptionContractExpire(ID subscriptionContractId, SubscriptionContractExpirePayloadQueryDefinition queryDef) {
        startField("subscriptionContractExpire");

        _queryBuilder.append("(subscriptionContractId:");
        Query.appendQuotedString(_queryBuilder, subscriptionContractId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractExpirePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Fails a Subscription Contract.
    */
    public MutationQuery subscriptionContractFail(ID subscriptionContractId, SubscriptionContractFailPayloadQueryDefinition queryDef) {
        startField("subscriptionContractFail");

        _queryBuilder.append("(subscriptionContractId:");
        Query.appendQuotedString(_queryBuilder, subscriptionContractId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractFailPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Pauses a Subscription Contract.
    */
    public MutationQuery subscriptionContractPause(ID subscriptionContractId, SubscriptionContractPausePayloadQueryDefinition queryDef) {
        startField("subscriptionContractPause");

        _queryBuilder.append("(subscriptionContractId:");
        Query.appendQuotedString(_queryBuilder, subscriptionContractId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractPausePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Allows for the easy change of a Product in a Contract or a Product price change.
    */
    public MutationQuery subscriptionContractProductChange(ID subscriptionContractId, ID lineId, SubscriptionContractProductChangeInput input, SubscriptionContractProductChangePayloadQueryDefinition queryDef) {
        startField("subscriptionContractProductChange");

        _queryBuilder.append("(subscriptionContractId:");
        Query.appendQuotedString(_queryBuilder, subscriptionContractId.toString());

        _queryBuilder.append(",lineId:");
        Query.appendQuotedString(_queryBuilder, lineId.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractProductChangePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Sets the next billing date of a Subscription Contract. This field is managed by the apps.
    * Alternatively you can utilize our
    * [Billing Cycles
    * APIs](https://shopify.dev/docs/apps/selling-strategies/subscriptions/billing-cycles),
    * which provide auto-computed billing dates and additional functionalities.
    */
    public MutationQuery subscriptionContractSetNextBillingDate(ID contractId, String date, SubscriptionContractSetNextBillingDatePayloadQueryDefinition queryDef) {
        startField("subscriptionContractSetNextBillingDate");

        _queryBuilder.append("(contractId:");
        Query.appendQuotedString(_queryBuilder, contractId.toString());

        _queryBuilder.append(",date:");
        Query.appendQuotedString(_queryBuilder, date.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractSetNextBillingDatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The subscriptionContractUpdate mutation allows you to create a draft of an existing subscription
    * contract. This [draft](https://shopify.dev/api/admin-graphql/latest/objects/SubscriptionDraft) can
    * be reviewed and modified as needed. Once the draft is committed with
    * [subscriptionDraftCommit](https://shopify.dev/api/admin-graphql/latest/mutations/subscriptionDraftCo
    * mmit), the changes are applied to the original subscription contract.
    */
    public MutationQuery subscriptionContractUpdate(ID contractId, SubscriptionContractUpdatePayloadQueryDefinition queryDef) {
        startField("subscriptionContractUpdate");

        _queryBuilder.append("(contractId:");
        Query.appendQuotedString(_queryBuilder, contractId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Commits the updates of a Subscription Contract draft.
    */
    public MutationQuery subscriptionDraftCommit(ID draftId, SubscriptionDraftCommitPayloadQueryDefinition queryDef) {
        startField("subscriptionDraftCommit");

        _queryBuilder.append("(draftId:");
        Query.appendQuotedString(_queryBuilder, draftId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftCommitPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds a subscription discount to a subscription draft.
    */
    public MutationQuery subscriptionDraftDiscountAdd(ID draftId, SubscriptionManualDiscountInput input, SubscriptionDraftDiscountAddPayloadQueryDefinition queryDef) {
        startField("subscriptionDraftDiscountAdd");

        _queryBuilder.append("(draftId:");
        Query.appendQuotedString(_queryBuilder, draftId.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftDiscountAddPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Applies a code discount on the subscription draft.
    */
    public MutationQuery subscriptionDraftDiscountCodeApply(ID draftId, String redeemCode, SubscriptionDraftDiscountCodeApplyPayloadQueryDefinition queryDef) {
        startField("subscriptionDraftDiscountCodeApply");

        _queryBuilder.append("(draftId:");
        Query.appendQuotedString(_queryBuilder, draftId.toString());

        _queryBuilder.append(",redeemCode:");
        Query.appendQuotedString(_queryBuilder, redeemCode.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftDiscountCodeApplyPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Removes a subscription discount from a subscription draft.
    */
    public MutationQuery subscriptionDraftDiscountRemove(ID draftId, ID discountId, SubscriptionDraftDiscountRemovePayloadQueryDefinition queryDef) {
        startField("subscriptionDraftDiscountRemove");

        _queryBuilder.append("(draftId:");
        Query.appendQuotedString(_queryBuilder, draftId.toString());

        _queryBuilder.append(",discountId:");
        Query.appendQuotedString(_queryBuilder, discountId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftDiscountRemovePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a subscription discount on a subscription draft.
    */
    public MutationQuery subscriptionDraftDiscountUpdate(ID draftId, ID discountId, SubscriptionManualDiscountInput input, SubscriptionDraftDiscountUpdatePayloadQueryDefinition queryDef) {
        startField("subscriptionDraftDiscountUpdate");

        _queryBuilder.append("(draftId:");
        Query.appendQuotedString(_queryBuilder, draftId.toString());

        _queryBuilder.append(",discountId:");
        Query.appendQuotedString(_queryBuilder, discountId.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftDiscountUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds a subscription free shipping discount to a subscription draft.
    */
    public MutationQuery subscriptionDraftFreeShippingDiscountAdd(ID draftId, SubscriptionFreeShippingDiscountInput input, SubscriptionDraftFreeShippingDiscountAddPayloadQueryDefinition queryDef) {
        startField("subscriptionDraftFreeShippingDiscountAdd");

        _queryBuilder.append("(draftId:");
        Query.appendQuotedString(_queryBuilder, draftId.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftFreeShippingDiscountAddPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a subscription free shipping discount on a subscription draft.
    */
    public MutationQuery subscriptionDraftFreeShippingDiscountUpdate(ID draftId, ID discountId, SubscriptionFreeShippingDiscountInput input, SubscriptionDraftFreeShippingDiscountUpdatePayloadQueryDefinition queryDef) {
        startField("subscriptionDraftFreeShippingDiscountUpdate");

        _queryBuilder.append("(draftId:");
        Query.appendQuotedString(_queryBuilder, draftId.toString());

        _queryBuilder.append(",discountId:");
        Query.appendQuotedString(_queryBuilder, discountId.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftFreeShippingDiscountUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds a subscription line to a subscription draft.
    */
    public MutationQuery subscriptionDraftLineAdd(ID draftId, SubscriptionLineInput input, SubscriptionDraftLineAddPayloadQueryDefinition queryDef) {
        startField("subscriptionDraftLineAdd");

        _queryBuilder.append("(draftId:");
        Query.appendQuotedString(_queryBuilder, draftId.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftLineAddPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Removes a subscription line from a subscription draft.
    */
    public MutationQuery subscriptionDraftLineRemove(ID draftId, ID lineId, SubscriptionDraftLineRemovePayloadQueryDefinition queryDef) {
        startField("subscriptionDraftLineRemove");

        _queryBuilder.append("(draftId:");
        Query.appendQuotedString(_queryBuilder, draftId.toString());

        _queryBuilder.append(",lineId:");
        Query.appendQuotedString(_queryBuilder, lineId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftLineRemovePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a subscription line on a subscription draft.
    */
    public MutationQuery subscriptionDraftLineUpdate(ID draftId, ID lineId, SubscriptionLineUpdateInput input, SubscriptionDraftLineUpdatePayloadQueryDefinition queryDef) {
        startField("subscriptionDraftLineUpdate");

        _queryBuilder.append("(draftId:");
        Query.appendQuotedString(_queryBuilder, draftId.toString());

        _queryBuilder.append(",lineId:");
        Query.appendQuotedString(_queryBuilder, lineId.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftLineUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a Subscription Draft.
    */
    public MutationQuery subscriptionDraftUpdate(ID draftId, SubscriptionDraftInput input, SubscriptionDraftUpdatePayloadQueryDefinition queryDef) {
        startField("subscriptionDraftUpdate");

        _queryBuilder.append("(draftId:");
        Query.appendQuotedString(_queryBuilder, draftId.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Add tags to an order, a draft order, a customer, a product, or an online store article.
    */
    public MutationQuery tagsAdd(ID id, List<String> tags, TagsAddPayloadQueryDefinition queryDef) {
        startField("tagsAdd");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",tags:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : tags) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new TagsAddPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Remove tags from an order, a draft order, a customer, a product, or an online store article.
    */
    public MutationQuery tagsRemove(ID id, List<String> tags, TagsRemovePayloadQueryDefinition queryDef) {
        startField("tagsRemove");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",tags:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : tags) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new TagsRemovePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Allows tax app configurations for tax partners.
    */
    public MutationQuery taxAppConfigure(boolean ready, TaxAppConfigurePayloadQueryDefinition queryDef) {
        startField("taxAppConfigure");

        _queryBuilder.append("(ready:");
        _queryBuilder.append(ready);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new TaxAppConfigurePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ThemeCreateArguments extends Arguments {
        ThemeCreateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The name of the theme to be created.
        */
        public ThemeCreateArguments name(String value) {
            if (value != null) {
                startArgument("name");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The role of the theme to be created. Only UNPUBLISHED and DEVELOPMENT roles are permitted.
        */
        public ThemeCreateArguments role(ThemeRole value) {
            if (value != null) {
                startArgument("role");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface ThemeCreateArgumentsDefinition {
        void define(ThemeCreateArguments args);
    }

    /**
    * Creates a theme using an external URL or for files that were previously uploaded using the
    * [stagedUploadsCreate
    * mutation](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
    * These themes are added to the [Themes page](https://admin.shopify.com/themes) in Shopify admin.
    */
    public MutationQuery themeCreate(String source, ThemeCreatePayloadQueryDefinition queryDef) {
        return themeCreate(source, args -> {}, queryDef);
    }

    /**
    * Creates a theme using an external URL or for files that were previously uploaded using the
    * [stagedUploadsCreate
    * mutation](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
    * These themes are added to the [Themes page](https://admin.shopify.com/themes) in Shopify admin.
    */
    public MutationQuery themeCreate(String source, ThemeCreateArgumentsDefinition argsDef, ThemeCreatePayloadQueryDefinition queryDef) {
        startField("themeCreate");

        _queryBuilder.append("(source:");
        Query.appendQuotedString(_queryBuilder, source.toString());

        argsDef.define(new ThemeCreateArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ThemeCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a theme.
    */
    public MutationQuery themeDelete(ID id, ThemeDeletePayloadQueryDefinition queryDef) {
        startField("themeDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ThemeDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Copy theme files. Copying to existing theme files will overwrite them.
    */
    public MutationQuery themeFilesCopy(ID themeId, List<ThemeFilesCopyFileInput> files, ThemeFilesCopyPayloadQueryDefinition queryDef) {
        startField("themeFilesCopy");

        _queryBuilder.append("(themeId:");
        Query.appendQuotedString(_queryBuilder, themeId.toString());

        _queryBuilder.append(",files:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ThemeFilesCopyFileInput item1 : files) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ThemeFilesCopyPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a theme's files.
    */
    public MutationQuery themeFilesDelete(ID themeId, List<String> files, ThemeFilesDeletePayloadQueryDefinition queryDef) {
        startField("themeFilesDelete");

        _queryBuilder.append("(themeId:");
        Query.appendQuotedString(_queryBuilder, themeId.toString());

        _queryBuilder.append(",files:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : files) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ThemeFilesDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Create or update theme files.
    */
    public MutationQuery themeFilesUpsert(ID themeId, List<OnlineStoreThemeFilesUpsertFileInput> files, ThemeFilesUpsertPayloadQueryDefinition queryDef) {
        startField("themeFilesUpsert");

        _queryBuilder.append("(themeId:");
        Query.appendQuotedString(_queryBuilder, themeId.toString());

        _queryBuilder.append(",files:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (OnlineStoreThemeFilesUpsertFileInput item1 : files) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ThemeFilesUpsertPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Publishes a theme.
    */
    public MutationQuery themePublish(ID id, ThemePublishPayloadQueryDefinition queryDef) {
        startField("themePublish");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ThemePublishPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a theme.
    */
    public MutationQuery themeUpdate(ID id, OnlineStoreThemeInput input, ThemeUpdatePayloadQueryDefinition queryDef) {
        startField("themeUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ThemeUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Trigger the voiding of an uncaptured authorization transaction.
    */
    public MutationQuery transactionVoid(ID parentTransactionId, TransactionVoidPayloadQueryDefinition queryDef) {
        startField("transactionVoid");

        _queryBuilder.append("(parentTransactionId:");
        Query.appendQuotedString(_queryBuilder, parentTransactionId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new TransactionVoidPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates or updates translations.
    */
    public MutationQuery translationsRegister(ID resourceId, List<TranslationInput> translations, TranslationsRegisterPayloadQueryDefinition queryDef) {
        startField("translationsRegister");

        _queryBuilder.append("(resourceId:");
        Query.appendQuotedString(_queryBuilder, resourceId.toString());

        _queryBuilder.append(",translations:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (TranslationInput item1 : translations) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new TranslationsRegisterPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class TranslationsRemoveArguments extends Arguments {
        TranslationsRemoveArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The list of market IDs.
        */
        public TranslationsRemoveArguments marketIds(List<ID> value) {
            if (value != null) {
                startArgument("marketIds");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface TranslationsRemoveArgumentsDefinition {
        void define(TranslationsRemoveArguments args);
    }

    /**
    * Deletes translations.
    */
    public MutationQuery translationsRemove(ID resourceId, List<String> translationKeys, List<String> locales, TranslationsRemovePayloadQueryDefinition queryDef) {
        return translationsRemove(resourceId, translationKeys, locales, args -> {}, queryDef);
    }

    /**
    * Deletes translations.
    */
    public MutationQuery translationsRemove(ID resourceId, List<String> translationKeys, List<String> locales, TranslationsRemoveArgumentsDefinition argsDef, TranslationsRemovePayloadQueryDefinition queryDef) {
        startField("translationsRemove");

        _queryBuilder.append("(resourceId:");
        Query.appendQuotedString(_queryBuilder, resourceId.toString());

        _queryBuilder.append(",translationKeys:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : translationKeys) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(",locales:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : locales) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        argsDef.define(new TranslationsRemoveArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new TranslationsRemovePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Asynchronously delete [URL
    * redirects](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirect) in bulk.
    */
    public MutationQuery urlRedirectBulkDeleteAll(UrlRedirectBulkDeleteAllPayloadQueryDefinition queryDef) {
        startField("urlRedirectBulkDeleteAll");

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectBulkDeleteAllPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery urlRedirectBulkDeleteByIds(List<ID> ids, UrlRedirectBulkDeleteByIdsPayloadQueryDefinition queryDef) {
        startField("urlRedirectBulkDeleteByIds");

        _queryBuilder.append("(ids:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : ids) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectBulkDeleteByIdsPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Asynchronously delete redirects in bulk.
    */
    public MutationQuery urlRedirectBulkDeleteBySavedSearch(ID savedSearchId, UrlRedirectBulkDeleteBySavedSearchPayloadQueryDefinition queryDef) {
        startField("urlRedirectBulkDeleteBySavedSearch");

        _queryBuilder.append("(savedSearchId:");
        Query.appendQuotedString(_queryBuilder, savedSearchId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectBulkDeleteBySavedSearchPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Asynchronously delete redirects in bulk.
    */
    public MutationQuery urlRedirectBulkDeleteBySearch(String search, UrlRedirectBulkDeleteBySearchPayloadQueryDefinition queryDef) {
        startField("urlRedirectBulkDeleteBySearch");

        _queryBuilder.append("(search:");
        Query.appendQuotedString(_queryBuilder, search.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectBulkDeleteBySearchPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a [`UrlRedirect`](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirect) object.
    */
    public MutationQuery urlRedirectCreate(UrlRedirectInput urlRedirect, UrlRedirectCreatePayloadQueryDefinition queryDef) {
        startField("urlRedirectCreate");

        _queryBuilder.append("(urlRedirect:");
        urlRedirect.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a [`UrlRedirect`](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirect) object.
    */
    public MutationQuery urlRedirectDelete(ID id, UrlRedirectDeletePayloadQueryDefinition queryDef) {
        startField("urlRedirectDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery urlRedirectImportCreate(String url, UrlRedirectImportCreatePayloadQueryDefinition queryDef) {
        startField("urlRedirectImportCreate");

        _queryBuilder.append("(url:");
        Query.appendQuotedString(_queryBuilder, url.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectImportCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Submits a `UrlRedirectImport` request to be processed.
    * The `UrlRedirectImport` request is first created with the
    * [`urlRedirectImportCreate`](https://shopify.dev/api/admin-graphql/latest/mutations/urlRedirectImport
    * Create) mutation.
    */
    public MutationQuery urlRedirectImportSubmit(ID id, UrlRedirectImportSubmitPayloadQueryDefinition queryDef) {
        startField("urlRedirectImportSubmit");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectImportSubmitPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a URL redirect.
    */
    public MutationQuery urlRedirectUpdate(ID id, UrlRedirectInput urlRedirect, UrlRedirectUpdatePayloadQueryDefinition queryDef) {
        startField("urlRedirectUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",urlRedirect:");
        urlRedirect.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a validation.
    */
    public MutationQuery validationCreate(ValidationCreateInput validation, ValidationCreatePayloadQueryDefinition queryDef) {
        startField("validationCreate");

        _queryBuilder.append("(validation:");
        validation.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ValidationCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a validation.
    */
    public MutationQuery validationDelete(ID id, ValidationDeletePayloadQueryDefinition queryDef) {
        startField("validationDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ValidationDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Update a validation.
    */
    public MutationQuery validationUpdate(ValidationUpdateInput validation, ID id, ValidationUpdatePayloadQueryDefinition queryDef) {
        startField("validationUpdate");

        _queryBuilder.append("(validation:");
        validation.appendTo(_queryBuilder);

        _queryBuilder.append(",id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ValidationUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery webPixelCreate(WebPixelInput webPixel, WebPixelCreatePayloadQueryDefinition queryDef) {
        startField("webPixelCreate");

        _queryBuilder.append("(webPixel:");
        webPixel.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new WebPixelCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes the web pixel shop settings.
    */
    public MutationQuery webPixelDelete(ID id, WebPixelDeletePayloadQueryDefinition queryDef) {
        startField("webPixelDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new WebPixelDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public MutationQuery webPixelUpdate(ID id, WebPixelInput webPixel, WebPixelUpdatePayloadQueryDefinition queryDef) {
        startField("webPixelUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",webPixel:");
        webPixel.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new WebPixelUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a web presence.
    */
    public MutationQuery webPresenceCreate(WebPresenceCreateInput input, WebPresenceCreatePayloadQueryDefinition queryDef) {
        startField("webPresenceCreate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new WebPresenceCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a web presence.
    */
    public MutationQuery webPresenceDelete(ID id, WebPresenceDeletePayloadQueryDefinition queryDef) {
        startField("webPresenceDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new WebPresenceDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a web presence.
    */
    public MutationQuery webPresenceUpdate(ID id, WebPresenceUpdateInput input, WebPresenceUpdatePayloadQueryDefinition queryDef) {
        startField("webPresenceUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new WebPresenceUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new webhook subscription.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
    */
    public MutationQuery webhookSubscriptionCreate(WebhookSubscriptionTopic topic, WebhookSubscriptionInput webhookSubscription, WebhookSubscriptionCreatePayloadQueryDefinition queryDef) {
        startField("webhookSubscriptionCreate");

        _queryBuilder.append("(topic:");
        _queryBuilder.append(topic.toString());

        _queryBuilder.append(",webhookSubscription:");
        webhookSubscription.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new WebhookSubscriptionCreatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Deletes a webhook subscription.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
    */
    public MutationQuery webhookSubscriptionDelete(ID id, WebhookSubscriptionDeletePayloadQueryDefinition queryDef) {
        startField("webhookSubscriptionDelete");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new WebhookSubscriptionDeletePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates a webhook subscription.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
    */
    public MutationQuery webhookSubscriptionUpdate(ID id, WebhookSubscriptionInput webhookSubscription, WebhookSubscriptionUpdatePayloadQueryDefinition queryDef) {
        startField("webhookSubscriptionUpdate");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(",webhookSubscription:");
        webhookSubscription.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new WebhookSubscriptionUpdatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}
