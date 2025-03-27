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
* Provides the definition of a generic object structure composed of metafields.
*/
public class MetaobjectDefinitionQuery extends Query<MetaobjectDefinitionQuery> {
    MetaobjectDefinitionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Access configuration for the metaobject definition.
    */
    public MetaobjectDefinitionQuery access(MetaobjectAccessQueryDefinition queryDef) {
        startField("access");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectAccessQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The capabilities of the metaobject definition.
    */
    public MetaobjectDefinitionQuery capabilities(MetaobjectCapabilitiesQueryDefinition queryDef) {
        startField("capabilities");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectCapabilitiesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The app used to create the metaobject definition.
    */
    public MetaobjectDefinitionQuery createdByApp(AppQueryDefinition queryDef) {
        startField("createdByApp");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The staff member who created the metaobject definition.
    */
    public MetaobjectDefinitionQuery createdByStaff(StaffMemberQueryDefinition queryDef) {
        startField("createdByStaff");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The administrative description.
    */
    public MetaobjectDefinitionQuery description() {
        startField("description");

        return this;
    }

    /**
    * The key of a field to reference as the display name for each object.
    */
    public MetaobjectDefinitionQuery displayNameKey() {
        startField("displayNameKey");

        return this;
    }

    /**
    * The fields defined for this object type.
    */
    public MetaobjectDefinitionQuery fieldDefinitions(MetaobjectFieldDefinitionQueryDefinition queryDef) {
        startField("fieldDefinitions");

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectFieldDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether this metaobject definition has field whose type can visually represent a metaobject with    
    * the `thumbnailField`.
    */
    public MetaobjectDefinitionQuery hasThumbnailField() {
        startField("hasThumbnailField");

        return this;
    }

    public class MetaobjectsArguments extends Arguments {
        MetaobjectsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetaobjectsArguments first(Integer value) {
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
        public MetaobjectsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetaobjectsArguments last(Integer value) {
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
        public MetaobjectsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MetaobjectsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MetaobjectsArgumentsDefinition {
        void define(MetaobjectsArguments args);
    }

    /**
    * A paginated connection to the metaobjects associated with the definition.
    */
    public MetaobjectDefinitionQuery metaobjects(MetaobjectConnectionQueryDefinition queryDef) {
        return metaobjects(args -> {}, queryDef);
    }

    /**
    * A paginated connection to the metaobjects associated with the definition.
    */
    public MetaobjectDefinitionQuery metaobjects(MetaobjectsArgumentsDefinition argsDef, MetaobjectConnectionQueryDefinition queryDef) {
        startField("metaobjects");

        MetaobjectsArguments args = new MetaobjectsArguments(_queryBuilder);
        argsDef.define(args);
        MetaobjectsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The count of metaobjects created for the definition.
    */
    public MetaobjectDefinitionQuery metaobjectsCount() {
        startField("metaobjectsCount");

        return this;
    }

    /**
    * The human-readable name.
    */
    public MetaobjectDefinitionQuery name() {
        startField("name");

        return this;
    }

    /**
    * The type of the object definition. Defines the namespace of associated metafields.
    */
    public MetaobjectDefinitionQuery type() {
        startField("type");

        return this;
    }
}
