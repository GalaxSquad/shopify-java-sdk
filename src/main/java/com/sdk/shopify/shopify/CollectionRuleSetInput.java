// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;
import java.util.List;

public class CollectionRuleSetInput implements Serializable {
    private boolean appliedDisjunctively;

    private Input<List<CollectionRuleInput>> rules = Input.undefined();

    public CollectionRuleSetInput(boolean appliedDisjunctively) {
        this.appliedDisjunctively = appliedDisjunctively;
    }

    public boolean getAppliedDisjunctively() {
        return appliedDisjunctively;
    }

    public CollectionRuleSetInput setAppliedDisjunctively(boolean appliedDisjunctively) {
        this.appliedDisjunctively = appliedDisjunctively;
        return this;
    }

    public List<CollectionRuleInput> getRules() {
        return rules.getValue();
    }

    public Input<List<CollectionRuleInput>> getRulesInput() {
        return rules;
    }

    public CollectionRuleSetInput setRules(List<CollectionRuleInput> rules) {
        this.rules = Input.optional(rules);
        return this;
    }

    public CollectionRuleSetInput setRulesInput(Input<List<CollectionRuleInput>> rules) {
        if (rules == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.rules = rules;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("appliedDisjunctively:");
        _queryBuilder.append(appliedDisjunctively);

        if (this.rules.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("rules:");
            if (rules.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CollectionRuleInput item1 : rules.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
