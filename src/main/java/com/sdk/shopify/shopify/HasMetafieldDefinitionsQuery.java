// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Resources that metafield definitions can be applied to.
*/
public class HasMetafieldDefinitionsQuery extends Query<HasMetafieldDefinitionsQuery> {
    HasMetafieldDefinitionsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public HasMetafieldDefinitionsQuery onArticle(ArticleQueryDefinition queryDef) {
        startInlineFragment("Article");
        queryDef.define(new ArticleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onBlog(BlogQueryDefinition queryDef) {
        startInlineFragment("Blog");
        queryDef.define(new BlogQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onCollection(CollectionQueryDefinition queryDef) {
        startInlineFragment("Collection");
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onCompany(CompanyQueryDefinition queryDef) {
        startInlineFragment("Company");
        queryDef.define(new CompanyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onCompanyLocation(CompanyLocationQueryDefinition queryDef) {
        startInlineFragment("CompanyLocation");
        queryDef.define(new CompanyLocationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onCustomer(CustomerQueryDefinition queryDef) {
        startInlineFragment("Customer");
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onDeliveryCustomization(DeliveryCustomizationQueryDefinition queryDef) {
        startInlineFragment("DeliveryCustomization");
        queryDef.define(new DeliveryCustomizationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onDiscountAutomaticNode(DiscountAutomaticNodeQueryDefinition queryDef) {
        startInlineFragment("DiscountAutomaticNode");
        queryDef.define(new DiscountAutomaticNodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onDiscountCodeNode(DiscountCodeNodeQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeNode");
        queryDef.define(new DiscountCodeNodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onDiscountNode(DiscountNodeQueryDefinition queryDef) {
        startInlineFragment("DiscountNode");
        queryDef.define(new DiscountNodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onLocation(LocationQueryDefinition queryDef) {
        startInlineFragment("Location");
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onMarket(MarketQueryDefinition queryDef) {
        startInlineFragment("Market");
        queryDef.define(new MarketQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onOrder(OrderQueryDefinition queryDef) {
        startInlineFragment("Order");
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onPage(PageQueryDefinition queryDef) {
        startInlineFragment("Page");
        queryDef.define(new PageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onPaymentCustomization(PaymentCustomizationQueryDefinition queryDef) {
        startInlineFragment("PaymentCustomization");
        queryDef.define(new PaymentCustomizationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onProduct(ProductQueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onProductVariant(ProductVariantQueryDefinition queryDef) {
        startInlineFragment("ProductVariant");
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onSellingPlan(SellingPlanQueryDefinition queryDef) {
        startInlineFragment("SellingPlan");
        queryDef.define(new SellingPlanQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasMetafieldDefinitionsQuery onValidation(ValidationQueryDefinition queryDef) {
        startInlineFragment("Validation");
        queryDef.define(new ValidationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
