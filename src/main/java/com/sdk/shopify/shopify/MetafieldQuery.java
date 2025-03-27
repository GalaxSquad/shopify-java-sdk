// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* Metafields enable you to attach additional information to a Shopify resource, such as a
* [Product](https://shopify.dev/api/admin-graphql/latest/objects/product) or a
* [Collection](https://shopify.dev/api/admin-graphql/latest/objects/collection).
* For more information about where you can attach metafields refer to
* [HasMetafields](https://shopify.dev/api/admin/graphql/reference/common-objects/HasMetafields).
* Some examples of the data that metafields enable you to store are specifications, size charts,
* downloadable documents, release dates, images, or part numbers.
* Metafields are identified by an owner resource, namespace, and key. and store a value along with
* type information for that value.
*/
public class MetafieldQuery extends Query<MetafieldQuery> {
    MetafieldQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The data stored in the resource, represented as a digest.
    */
    public MetafieldQuery compareDigest() {
        startField("compareDigest");

        return this;
    }

    /**
    * The date and time when the metafield was created.
    */
    public MetafieldQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The metafield definition that the metafield belongs to, if any.
    */
    public MetafieldQuery definition(MetafieldDefinitionQueryDefinition queryDef) {
        startField("definition");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The description of the metafield.
    */
    public MetafieldQuery description() {
        startField("description");

        return this;
    }

    /**
    * The data stored in the metafield in JSON format.
    */
    public MetafieldQuery jsonValue() {
        startField("jsonValue");

        return this;
    }

    /**
    * The unique identifier for the metafield within its namespace.
    */
    public MetafieldQuery key() {
        startField("key");

        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public MetafieldQuery legacyResourceId() {
        startField("legacyResourceId");

        return this;
    }

    /**
    * The container for a group of metafields that the metafield is associated with.
    */
    public MetafieldQuery namespace() {
        startField("namespace");

        return this;
    }

    /**
    * The resource that the metafield is attached to.
    */
    public MetafieldQuery owner(HasMetafieldsQueryDefinition queryDef) {
        startField("owner");

        _queryBuilder.append('{');
        queryDef.define(new HasMetafieldsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The type of resource that the metafield is attached to.
    */
    public MetafieldQuery ownerType() {
        startField("ownerType");

        return this;
    }

    /**
    * Returns a reference object if the metafield definition's type is a resource reference.
    */
    public MetafieldQuery reference(MetafieldReferenceQueryDefinition queryDef) {
        startField("reference");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldReferenceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ReferencesArguments extends Arguments {
        ReferencesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReferencesArguments first(Integer value) {
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
        public ReferencesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReferencesArguments last(Integer value) {
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
        public ReferencesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface ReferencesArgumentsDefinition {
        void define(ReferencesArguments args);
    }

    /**
    * A list of reference objects if the metafield's type is a resource reference list.
    */
    public MetafieldQuery references(MetafieldReferenceConnectionQueryDefinition queryDef) {
        return references(args -> {}, queryDef);
    }

    /**
    * A list of reference objects if the metafield's type is a resource reference list.
    */
    public MetafieldQuery references(ReferencesArgumentsDefinition argsDef, MetafieldReferenceConnectionQueryDefinition queryDef) {
        startField("references");

        ReferencesArguments args = new ReferencesArguments(_queryBuilder);
        argsDef.define(args);
        ReferencesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetafieldReferenceConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The type of data that is stored in the metafield.
    * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
    */
    public MetafieldQuery type() {
        startField("type");

        return this;
    }

    /**
    * The date and time when the metafield was updated.
    */
    public MetafieldQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    /**
    * The data stored in the metafield. Always stored as a string, regardless of the metafield's type.
    */
    public MetafieldQuery value() {
        startField("value");

        return this;
    }
}
