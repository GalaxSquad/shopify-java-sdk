// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.util.List;

/**
* Represents a group of adjustments made as part of the same operation.
*/
public class InventoryAdjustmentGroupQuery extends Query<InventoryAdjustmentGroupQuery> {
    InventoryAdjustmentGroupQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The app that triggered the inventory event, if one exists.
    */
    public InventoryAdjustmentGroupQuery app(AppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ChangesArguments extends Arguments {
        ChangesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The IDs of the inventory items to filter changes by.
        */
        public ChangesArguments inventoryItemIds(List<ID> value) {
            if (value != null) {
                startArgument("inventoryItemIds");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The IDs of the locations to filter changes by.
        */
        public ChangesArguments locationIds(List<ID> value) {
            if (value != null) {
                startArgument("locationIds");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The [names](https://shopify.dev/docs/apps/fulfillment/inventory-management-apps#inventory-states)
        * of the requested inventory quantities.
        */
        public ChangesArguments quantityNames(List<String> value) {
            if (value != null) {
                startArgument("quantityNames");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface ChangesArgumentsDefinition {
        void define(ChangesArguments args);
    }

    /**
    * The set of inventory quantity changes that occurred in the inventory event.
    */
    public InventoryAdjustmentGroupQuery changes(InventoryChangeQueryDefinition queryDef) {
        return changes(args -> {}, queryDef);
    }

    /**
    * The set of inventory quantity changes that occurred in the inventory event.
    */
    public InventoryAdjustmentGroupQuery changes(ChangesArgumentsDefinition argsDef, InventoryChangeQueryDefinition queryDef) {
        startField("changes");

        ChangesArguments args = new ChangesArguments(_queryBuilder);
        argsDef.define(args);
        ChangesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new InventoryChangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time the inventory adjustment group was created.
    */
    public InventoryAdjustmentGroupQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The reason for the group of adjustments.
    */
    public InventoryAdjustmentGroupQuery reason() {
        startField("reason");

        return this;
    }

    /**
    * A freeform URI that represents why the inventory change happened. This can be the entity adjusting
    * inventory
    * quantities or the Shopify resource that's associated with the inventory adjustment. For example, a
    * unit in a
    * draft order might have been previously reserved, and a merchant later creates an order from the
    * draft order.
    * In this case, the `referenceDocumentUri` for the inventory adjustment is a URI referencing the order
    * ID.
    */
    public InventoryAdjustmentGroupQuery referenceDocumentUri() {
        startField("referenceDocumentUri");

        return this;
    }

    /**
    * The staff member associated with the inventory event.
    */
    public InventoryAdjustmentGroupQuery staffMember(StaffMemberQueryDefinition queryDef) {
        startField("staffMember");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
