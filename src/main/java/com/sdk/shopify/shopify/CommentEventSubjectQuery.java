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
* The subject line of a comment event.
*/
public class CommentEventSubjectQuery extends Query<CommentEventSubjectQuery> {
    CommentEventSubjectQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * Whether the timeline subject has a timeline comment. If true, then a timeline comment exists.
    */
    public CommentEventSubjectQuery hasTimelineComment() {
        startField("hasTimelineComment");

        return this;
    }

    /**
    * A globally-unique ID.
    */
    public CommentEventSubjectQuery id() {
        startField("id");

        return this;
    }

    public CommentEventSubjectQuery onCompany(CompanyQueryDefinition queryDef) {
        startInlineFragment("Company");
        queryDef.define(new CompanyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CommentEventSubjectQuery onCompanyLocation(CompanyLocationQueryDefinition queryDef) {
        startInlineFragment("CompanyLocation");
        queryDef.define(new CompanyLocationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CommentEventSubjectQuery onCustomer(CustomerQueryDefinition queryDef) {
        startInlineFragment("Customer");
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CommentEventSubjectQuery onDraftOrder(DraftOrderQueryDefinition queryDef) {
        startInlineFragment("DraftOrder");
        queryDef.define(new DraftOrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CommentEventSubjectQuery onOrder(OrderQueryDefinition queryDef) {
        startInlineFragment("Order");
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CommentEventSubjectQuery onPriceRule(PriceRuleQueryDefinition queryDef) {
        startInlineFragment("PriceRule");
        queryDef.define(new PriceRuleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
