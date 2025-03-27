// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The resource referenced by the metafield value.
*/
public class MetafieldReferenceQuery extends Query<MetafieldReferenceQuery> {
    MetafieldReferenceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public MetafieldReferenceQuery onCollection(CollectionQueryDefinition queryDef) {
        startInlineFragment("Collection");
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferenceQuery onCompany(CompanyQueryDefinition queryDef) {
        startInlineFragment("Company");
        queryDef.define(new CompanyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferenceQuery onCustomer(CustomerQueryDefinition queryDef) {
        startInlineFragment("Customer");
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferenceQuery onGenericFile(GenericFileQueryDefinition queryDef) {
        startInlineFragment("GenericFile");
        queryDef.define(new GenericFileQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferenceQuery onMediaImage(MediaImageQueryDefinition queryDef) {
        startInlineFragment("MediaImage");
        queryDef.define(new MediaImageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferenceQuery onMetaobject(MetaobjectQueryDefinition queryDef) {
        startInlineFragment("Metaobject");
        queryDef.define(new MetaobjectQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferenceQuery onModel3d(Model3dQueryDefinition queryDef) {
        startInlineFragment("Model3d");
        queryDef.define(new Model3dQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferenceQuery onOrder(OrderQueryDefinition queryDef) {
        startInlineFragment("Order");
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferenceQuery onPage(PageQueryDefinition queryDef) {
        startInlineFragment("Page");
        queryDef.define(new PageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferenceQuery onProduct(ProductQueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferenceQuery onProductVariant(ProductVariantQueryDefinition queryDef) {
        startInlineFragment("ProductVariant");
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferenceQuery onTaxonomyValue(TaxonomyValueQueryDefinition queryDef) {
        startInlineFragment("TaxonomyValue");
        queryDef.define(new TaxonomyValueQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MetafieldReferenceQuery onVideo(VideoQueryDefinition queryDef) {
        startInlineFragment("Video");
        queryDef.define(new VideoQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
