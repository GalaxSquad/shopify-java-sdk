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
* Represents at rule that's used to assign products to a collection.
*/
public class CollectionRuleQuery extends Query<CollectionRuleQuery> {
    CollectionRuleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The attribute that the rule focuses on. For example, `title` or `product_type`.
    */
    public CollectionRuleQuery column() {
        startField("column");

        return this;
    }

    /**
    * The value that the operator is applied to. For example, `Hats`.
    */
    public CollectionRuleQuery condition() {
        startField("condition");

        return this;
    }

    /**
    * The value that the operator is applied to.
    */
    public CollectionRuleQuery conditionObject(CollectionRuleConditionObjectQueryDefinition queryDef) {
        startField("conditionObject");

        _queryBuilder.append('{');
        queryDef.define(new CollectionRuleConditionObjectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The type of operator that the rule is based on. For example, `equals`, `contains`, or `not_equals`.
    */
    public CollectionRuleQuery relation() {
        startField("relation");

        return this;
    }
}
