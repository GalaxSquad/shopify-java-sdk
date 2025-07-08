// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;
import java.util.List;

/**
* Represents information about the metafields associated to the specified resource.
*/
public class HasMetafieldsQuery extends Query<HasMetafieldsQuery> {
    HasMetafieldsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public class MetafieldArguments extends Arguments {
        MetafieldArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
        */
        public MetafieldArguments namespace(String value) {
            if (value != null) {
                startArgument("namespace");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MetafieldArgumentsDefinition {
        void define(MetafieldArguments args);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public HasMetafieldsQuery metafield(String key, MetafieldQueryDefinition queryDef) {
        return metafield(key, args -> {}, queryDef);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public HasMetafieldsQuery metafield(String key, MetafieldArgumentsDefinition argsDef, MetafieldQueryDefinition queryDef) {
        startField("metafield");

        _queryBuilder.append("(key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

        argsDef.define(new MetafieldArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetafieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldsArguments extends Arguments {
        MetafieldsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The metafield namespace to filter by. If omitted, the app-reserved namespace will be used.
        */
        public MetafieldsArguments namespace(String value) {
            if (value != null) {
                startArgument("namespace");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * List of keys of metafields in the format `namespace.key`, will be returned in the same format.
        */
        public MetafieldsArguments keys(List<String> value) {
            if (value != null) {
                startArgument("keys");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : value) {
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
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come after the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come before the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MetafieldsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MetafieldsArgumentsDefinition {
        void define(MetafieldsArguments args);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public HasMetafieldsQuery metafields(MetafieldConnectionQueryDefinition queryDef) {
        return metafields(args -> {}, queryDef);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public HasMetafieldsQuery metafields(MetafieldsArgumentsDefinition argsDef, MetafieldConnectionQueryDefinition queryDef) {
        startField("metafields");

        MetafieldsArguments args = new MetafieldsArguments(_queryBuilder);
        argsDef.define(args);
        MetafieldsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetafieldConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public HasMetafieldsQuery onAppInstallation(AppInstallationQueryDefinition queryDef) {
        startInlineFragment("AppInstallation");
        queryDef.define(new AppInstallationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onArticle(ArticleQueryDefinition queryDef) {
        startInlineFragment("Article");
        queryDef.define(new ArticleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onBlog(BlogQueryDefinition queryDef) {
        startInlineFragment("Blog");
        queryDef.define(new BlogQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onCartTransform(CartTransformQueryDefinition queryDef) {
        startInlineFragment("CartTransform");
        queryDef.define(new CartTransformQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onCollection(CollectionQueryDefinition queryDef) {
        startInlineFragment("Collection");
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onCompany(CompanyQueryDefinition queryDef) {
        startInlineFragment("Company");
        queryDef.define(new CompanyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onCompanyLocation(CompanyLocationQueryDefinition queryDef) {
        startInlineFragment("CompanyLocation");
        queryDef.define(new CompanyLocationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onCustomer(CustomerQueryDefinition queryDef) {
        startInlineFragment("Customer");
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onCustomerSegmentMember(CustomerSegmentMemberQueryDefinition queryDef) {
        startInlineFragment("CustomerSegmentMember");
        queryDef.define(new CustomerSegmentMemberQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onDeliveryCustomization(DeliveryCustomizationQueryDefinition queryDef) {
        startInlineFragment("DeliveryCustomization");
        queryDef.define(new DeliveryCustomizationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onDiscountAutomaticNode(DiscountAutomaticNodeQueryDefinition queryDef) {
        startInlineFragment("DiscountAutomaticNode");
        queryDef.define(new DiscountAutomaticNodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onDiscountCodeNode(DiscountCodeNodeQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeNode");
        queryDef.define(new DiscountCodeNodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onDiscountNode(DiscountNodeQueryDefinition queryDef) {
        startInlineFragment("DiscountNode");
        queryDef.define(new DiscountNodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onDraftOrder(DraftOrderQueryDefinition queryDef) {
        startInlineFragment("DraftOrder");
        queryDef.define(new DraftOrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onFulfillmentConstraintRule(FulfillmentConstraintRuleQueryDefinition queryDef) {
        startInlineFragment("FulfillmentConstraintRule");
        queryDef.define(new FulfillmentConstraintRuleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onGiftCardCreditTransaction(GiftCardCreditTransactionQueryDefinition queryDef) {
        startInlineFragment("GiftCardCreditTransaction");
        queryDef.define(new GiftCardCreditTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onGiftCardDebitTransaction(GiftCardDebitTransactionQueryDefinition queryDef) {
        startInlineFragment("GiftCardDebitTransaction");
        queryDef.define(new GiftCardDebitTransactionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onImage(ImageQueryDefinition queryDef) {
        startInlineFragment("Image");
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onInventoryTransfer(InventoryTransferQueryDefinition queryDef) {
        startInlineFragment("InventoryTransfer");
        queryDef.define(new InventoryTransferQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onLocation(LocationQueryDefinition queryDef) {
        startInlineFragment("Location");
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onMarket(MarketQueryDefinition queryDef) {
        startInlineFragment("Market");
        queryDef.define(new MarketQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onMediaImage(MediaImageQueryDefinition queryDef) {
        startInlineFragment("MediaImage");
        queryDef.define(new MediaImageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onOrder(OrderQueryDefinition queryDef) {
        startInlineFragment("Order");
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onPage(PageQueryDefinition queryDef) {
        startInlineFragment("Page");
        queryDef.define(new PageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onPaymentCustomization(PaymentCustomizationQueryDefinition queryDef) {
        startInlineFragment("PaymentCustomization");
        queryDef.define(new PaymentCustomizationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onProduct(ProductQueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onProductVariant(ProductVariantQueryDefinition queryDef) {
        startInlineFragment("ProductVariant");
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onSellingPlan(SellingPlanQueryDefinition queryDef) {
        startInlineFragment("SellingPlan");
        queryDef.define(new SellingPlanQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onShop(ShopQueryDefinition queryDef) {
        startInlineFragment("Shop");
        queryDef.define(new ShopQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldsQuery onValidation(ValidationQueryDefinition queryDef) {
        startInlineFragment("Validation");
        queryDef.define(new ValidationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
