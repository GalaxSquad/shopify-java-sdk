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
* Provides an object instance represented by a MetaobjectDefinition.
*/
public class MetaobjectQuery extends Query<MetaobjectQuery> {
    MetaobjectQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Metaobject capabilities for this Metaobject.
    */
    public MetaobjectQuery capabilities(MetaobjectCapabilityDataQueryDefinition queryDef) {
        startField("capabilities");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectCapabilityDataQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The app used to create the object.
    */
    public MetaobjectQuery createdBy(AppQueryDefinition queryDef) {
        startField("createdBy");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The app used to create the object.
    */
    public MetaobjectQuery createdByApp(AppQueryDefinition queryDef) {
        startField("createdByApp");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The staff member who created the metaobject.
    */
    public MetaobjectQuery createdByStaff(StaffMemberQueryDefinition queryDef) {
        startField("createdByStaff");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The MetaobjectDefinition that models this object type.
    */
    public MetaobjectQuery definition(MetaobjectDefinitionQueryDefinition queryDef) {
        startField("definition");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The preferred display name field value of the metaobject.
    */
    public MetaobjectQuery displayName() {
        startField("displayName");

        return this;
    }

    /**
    * The field for an object key, or null if the key has no field definition.
    */
    public MetaobjectQuery field(String key, MetaobjectFieldQueryDefinition queryDef) {
        startField("field");

        _queryBuilder.append("(key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectFieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * All ordered fields of the metaobject with their definitions and values.
    */
    public MetaobjectQuery fields(MetaobjectFieldQueryDefinition queryDef) {
        startField("fields");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectFieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The unique handle of the object, useful as a custom ID.
    */
    public MetaobjectQuery handle() {
        startField("handle");

        return this;
    }

    public class ReferencedByArguments extends Arguments {
        ReferencedByArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReferencedByArguments first(Integer value) {
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
        public ReferencedByArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReferencedByArguments last(Integer value) {
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
        public ReferencedByArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ReferencedByArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReferencedByArgumentsDefinition {
        void define(ReferencedByArguments args);
    }

    /**
    * List of back references metafields that belong to the resource.
    */
    public MetaobjectQuery referencedBy(MetafieldRelationConnectionQueryDefinition queryDef) {
        return referencedBy(args -> {}, queryDef);
    }

    /**
    * List of back references metafields that belong to the resource.
    */
    public MetaobjectQuery referencedBy(ReferencedByArgumentsDefinition argsDef, MetafieldRelationConnectionQueryDefinition queryDef) {
        startField("referencedBy");

        ReferencedByArguments args = new ReferencedByArguments(_queryBuilder);
        argsDef.define(args);
        ReferencedByArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetafieldRelationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The recommended field to visually represent this metaobject. May be a file reference or color       
    * field.
    */
    public MetaobjectQuery thumbnailField(MetaobjectFieldQueryDefinition queryDef) {
        startField("thumbnailField");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectFieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The type of the metaobject.
    */
    public MetaobjectQuery type() {
        startField("type");

        return this;
    }

    /**
    * When the object was last updated.
    */
    public MetaobjectQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
