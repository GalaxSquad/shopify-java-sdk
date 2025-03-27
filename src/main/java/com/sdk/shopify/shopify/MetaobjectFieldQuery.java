// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* Provides a field definition and the data value assigned to it.
*/
public class MetaobjectFieldQuery extends Query<MetaobjectFieldQuery> {
    MetaobjectFieldQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The field definition for this object key.
    */
    public MetaobjectFieldQuery definition(MetaobjectFieldDefinitionQueryDefinition queryDef) {
        startField("definition");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectFieldDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The assigned field value in JSON format.
    */
    public MetaobjectFieldQuery jsonValue() {
        startField("jsonValue");

        return this;
    }

    /**
    * The object key of this field.
    */
    public MetaobjectFieldQuery key() {
        startField("key");

        return this;
    }

    /**
    * For resource reference fields, provides the referenced object.
    */
    public MetaobjectFieldQuery reference(MetafieldReferenceQueryDefinition queryDef) {
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
    * For resource reference list fields, provides the list of referenced objects.
    */
    public MetaobjectFieldQuery references(MetafieldReferenceConnectionQueryDefinition queryDef) {
        return references(args -> {}, queryDef);
    }

    /**
    * For resource reference list fields, provides the list of referenced objects.
    */
    public MetaobjectFieldQuery references(ReferencesArgumentsDefinition argsDef, MetafieldReferenceConnectionQueryDefinition queryDef) {
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
    * For file reference or color fields, provides visual attributes for this field.
    */
    public MetaobjectFieldQuery thumbnail(MetaobjectThumbnailQueryDefinition queryDef) {
        startField("thumbnail");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectThumbnailQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The type of the field.
    */
    public MetaobjectFieldQuery type() {
        startField("type");

        return this;
    }

    /**
    * The assigned field value, always stored as a string regardless of the field type.
    */
    public MetaobjectFieldQuery value() {
        startField("value");

        return this;
    }
}
