// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;
import java.util.List;

/**
* The quantities of an inventory item that are related to a specific location.
* Learn [more about the relationships between inventory
* objects](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-qua
* ntities-states#inventory-object-relationships).
*/
public class InventoryLevelQuery extends Query<InventoryLevelQuery> {
    InventoryLevelQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Whether the inventory items associated with the inventory level can be deactivated.
    */
    public InventoryLevelQuery canDeactivate() {
        startField("canDeactivate");

        return this;
    }

    /**
    * The date and time when the inventory level was created.
    */
    public InventoryLevelQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * Describes either the impact of deactivating the inventory level, or why the inventory level can't be
    * deactivated.
    */
    public InventoryLevelQuery deactivationAlert() {
        startField("deactivationAlert");

        return this;
    }

    /**
    * Inventory item associated with the inventory level.
    */
    public InventoryLevelQuery item(InventoryItemQueryDefinition queryDef) {
        startField("item");

        _queryBuilder.append('{');
        queryDef.define(new InventoryItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The location associated with the inventory level.
    */
    public InventoryLevelQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Quantities for the requested names.
    */
    public InventoryLevelQuery quantities(List<String> names, InventoryQuantityQueryDefinition queryDef) {
        startField("quantities");

        _queryBuilder.append("(names:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : names) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryQuantityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ScheduledChangesArguments extends Arguments {
        ScheduledChangesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ScheduledChangesArguments first(Integer value) {
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
        public ScheduledChangesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ScheduledChangesArguments last(Integer value) {
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
        public ScheduledChangesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ScheduledChangesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Sort the underlying list using a key. If your query is slow or returns an error, then [try
        * specifying a sort key that matches the field used in the
        * search](https://shopify.dev/api/usage/pagination-graphql#search-performance-considerations).
        */
        public ScheduledChangesArguments sortKey(ScheduledChangeSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | expected_at | time |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | quantity_names | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public ScheduledChangesArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface ScheduledChangesArgumentsDefinition {
        void define(ScheduledChangesArguments args);
    }

    /**
    * Scheduled changes for the requested quantity names.
    */
    public InventoryLevelQuery scheduledChanges(InventoryScheduledChangeConnectionQueryDefinition queryDef) {
        return scheduledChanges(args -> {}, queryDef);
    }

    /**
    * Scheduled changes for the requested quantity names.
    */
    public InventoryLevelQuery scheduledChanges(ScheduledChangesArgumentsDefinition argsDef, InventoryScheduledChangeConnectionQueryDefinition queryDef) {
        startField("scheduledChanges");

        ScheduledChangesArguments args = new ScheduledChangesArguments(_queryBuilder);
        argsDef.define(args);
        ScheduledChangesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new InventoryScheduledChangeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the inventory level was updated.
    */
    public InventoryLevelQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
