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

/**
* Types of resources that may use metafields to reference other resources.
*/
public class MetafieldReferencerQuery extends Query<MetafieldReferencerQuery> {
    MetafieldReferencerQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public MetafieldReferencerQuery onAppInstallation(AppInstallationQueryDefinition queryDef) {
        startInlineFragment("AppInstallation");
        queryDef.define(new AppInstallationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onArticle(ArticleQueryDefinition queryDef) {
        startInlineFragment("Article");
        queryDef.define(new ArticleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onBlog(BlogQueryDefinition queryDef) {
        startInlineFragment("Blog");
        queryDef.define(new BlogQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onCollection(CollectionQueryDefinition queryDef) {
        startInlineFragment("Collection");
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onCompany(CompanyQueryDefinition queryDef) {
        startInlineFragment("Company");
        queryDef.define(new CompanyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onCompanyLocation(CompanyLocationQueryDefinition queryDef) {
        startInlineFragment("CompanyLocation");
        queryDef.define(new CompanyLocationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onCustomer(CustomerQueryDefinition queryDef) {
        startInlineFragment("Customer");
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onDeliveryCustomization(DeliveryCustomizationQueryDefinition queryDef) {
        startInlineFragment("DeliveryCustomization");
        queryDef.define(new DeliveryCustomizationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onDiscountAutomaticNode(DiscountAutomaticNodeQueryDefinition queryDef) {
        startInlineFragment("DiscountAutomaticNode");
        queryDef.define(new DiscountAutomaticNodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onDiscountCodeNode(DiscountCodeNodeQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeNode");
        queryDef.define(new DiscountCodeNodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onDiscountNode(DiscountNodeQueryDefinition queryDef) {
        startInlineFragment("DiscountNode");
        queryDef.define(new DiscountNodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onDraftOrder(DraftOrderQueryDefinition queryDef) {
        startInlineFragment("DraftOrder");
        queryDef.define(new DraftOrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onFulfillmentOrder(FulfillmentOrderQueryDefinition queryDef) {
        startInlineFragment("FulfillmentOrder");
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onLocation(LocationQueryDefinition queryDef) {
        startInlineFragment("Location");
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onMarket(MarketQueryDefinition queryDef) {
        startInlineFragment("Market");
        queryDef.define(new MarketQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onMetaobject(MetaobjectQueryDefinition queryDef) {
        startInlineFragment("Metaobject");
        queryDef.define(new MetaobjectQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onOrder(OrderQueryDefinition queryDef) {
        startInlineFragment("Order");
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onPage(PageQueryDefinition queryDef) {
        startInlineFragment("Page");
        queryDef.define(new PageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onPaymentCustomization(PaymentCustomizationQueryDefinition queryDef) {
        startInlineFragment("PaymentCustomization");
        queryDef.define(new PaymentCustomizationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onProduct(ProductQueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onProductVariant(ProductVariantQueryDefinition queryDef) {
        startInlineFragment("ProductVariant");
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferencerQuery onShop(ShopQueryDefinition queryDef) {
        startInlineFragment("Shop");
        queryDef.define(new ShopQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
