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

import java.util.List;

/**
* Represents the location where the physical good resides. You can stock inventory at active
* locations. Active
* locations that have `fulfills_online_orders: true` and are configured with a shipping rate, pickup
* enabled or
* local delivery will be able to sell from their storefront.
*/
public class LocationQuery extends Query<LocationQuery> {
    LocationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Whether the location can be reactivated. If `false`, then trying to activate the location with the
    * [`LocationActivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationActivate)
    * mutation will return an error that describes why the location can't be activated.
    */
    public LocationQuery activatable() {
        startField("activatable");

        return this;
    }

    /**
    * The address of this location.
    */
    public LocationQuery address(LocationAddressQueryDefinition queryDef) {
        startField("address");

        _queryBuilder.append('{');
        queryDef.define(new LocationAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the location address has been verified.
    */
    public LocationQuery addressVerified() {
        startField("addressVerified");

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) that the location was
    * added to a shop.
    */
    public LocationQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * Whether this location can be deactivated. If `true`, then the location can be deactivated by calling
    * the
    * [`LocationDeactivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationDeactivat
    * e)
    * mutation. If `false`, then calling the mutation to deactivate it will return an error that describes
    * why the
    * location can't be deactivated.
    */
    public LocationQuery deactivatable() {
        startField("deactivatable");

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) that the location was
    * deactivated at. For example, 3:30 pm on September 7, 2019 in the time zone of UTC (Universal Time
    * Coordinated) is represented as `"2019-09-07T15:50:00Z`".
    */
    public LocationQuery deactivatedAt() {
        startField("deactivatedAt");

        return this;
    }

    /**
    * Whether this location can be deleted.
    */
    public LocationQuery deletable() {
        startField("deletable");

        return this;
    }

    /**
    * Name of the service provider that fulfills from this location.
    */
    public LocationQuery fulfillmentService(FulfillmentServiceQueryDefinition queryDef) {
        startField("fulfillmentService");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentServiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether this location can fulfill online orders.
    */
    public LocationQuery fulfillsOnlineOrders() {
        startField("fulfillsOnlineOrders");

        return this;
    }

    /**
    * Whether this location has active inventory.
    */
    public LocationQuery hasActiveInventory() {
        startField("hasActiveInventory");

        return this;
    }

    /**
    * Whether this location has orders that need to be fulfilled.
    */
    public LocationQuery hasUnfulfilledOrders() {
        startField("hasUnfulfilledOrders");

        return this;
    }

    /**
    * The quantities of an inventory item at this location.
    */
    public LocationQuery inventoryLevel(ID inventoryItemId, InventoryLevelQueryDefinition queryDef) {
        startField("inventoryLevel");

        _queryBuilder.append("(inventoryItemId:");
        Query.appendQuotedString(_queryBuilder, inventoryItemId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryLevelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class InventoryLevelsArguments extends Arguments {
        InventoryLevelsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public InventoryLevelsArguments first(Integer value) {
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
        public InventoryLevelsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public InventoryLevelsArguments last(Integer value) {
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
        public InventoryLevelsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public InventoryLevelsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | created_at | time |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | inventory_group_id | id |
        * | inventory_item_id | id |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public InventoryLevelsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface InventoryLevelsArgumentsDefinition {
        void define(InventoryLevelsArguments args);
    }

    /**
    * A list of the quantities of the inventory items that can be stocked at this location.
    */
    public LocationQuery inventoryLevels(InventoryLevelConnectionQueryDefinition queryDef) {
        return inventoryLevels(args -> {}, queryDef);
    }

    /**
    * A list of the quantities of the inventory items that can be stocked at this location.
    */
    public LocationQuery inventoryLevels(InventoryLevelsArgumentsDefinition argsDef, InventoryLevelConnectionQueryDefinition queryDef) {
        startField("inventoryLevels");

        InventoryLevelsArguments args = new InventoryLevelsArguments(_queryBuilder);
        argsDef.define(args);
        InventoryLevelsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new InventoryLevelConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the location is active. A deactivated location can be activated (change `isActive: true`) if
    * it has
    * `activatable` set to `true` by calling the
    * [`locationActivate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationActivate)
    * mutation.
    */
    public LocationQuery isActive() {
        startField("isActive");

        return this;
    }

    /**
    * Whether this location is a fulfillment service.
    */
    public LocationQuery isFulfillmentService() {
        startField("isFulfillmentService");

        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public LocationQuery legacyResourceId() {
        startField("legacyResourceId");

        return this;
    }

    /**
    * Local pickup settings for the location.
    */
    public LocationQuery localPickupSettingsV2(DeliveryLocalPickupSettingsQueryDefinition queryDef) {
        startField("localPickupSettingsV2");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryLocalPickupSettingsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldArguments extends Arguments {
        MetafieldArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
        */
        public MetafieldArguments namespace(String value) {
            if (value != null) {
                startArgument("namespace");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MetafieldArgumentsDefinition {
        void define(MetafieldArguments args);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public LocationQuery metafield(String key, MetafieldQueryDefinition queryDef) {
        return metafield(key, args -> {}, queryDef);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public LocationQuery metafield(String key, MetafieldArgumentsDefinition argsDef, MetafieldQueryDefinition queryDef) {
        startField("metafield");

        _queryBuilder.append("(key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

        argsDef.define(new MetafieldArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetafieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldsArguments extends Arguments {
        MetafieldsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The metafield namespace to filter by. If omitted, the app-reserved namespace will be used.
        */
        public MetafieldsArguments namespace(String value) {
            if (value != null) {
                startArgument("namespace");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * List of keys of metafields in the format `namespace.key`, will be returned in the same format.
        */
        public MetafieldsArguments keys(List<String> value) {
            if (value != null) {
                startArgument("keys");
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

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments first(Integer value) {
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
        public MetafieldsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments last(Integer value) {
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
        public MetafieldsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MetafieldsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MetafieldsArgumentsDefinition {
        void define(MetafieldsArguments args);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public LocationQuery metafields(MetafieldConnectionQueryDefinition queryDef) {
        return metafields(args -> {}, queryDef);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public LocationQuery metafields(MetafieldsArgumentsDefinition argsDef, MetafieldConnectionQueryDefinition queryDef) {
        startField("metafields");

        MetafieldsArguments args = new MetafieldsArguments(_queryBuilder);
        argsDef.define(args);
        MetafieldsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetafieldConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the location.
    */
    public LocationQuery name() {
        startField("name");

        return this;
    }

    /**
    * Whether this location is used for calculating shipping rates. In multi-origin shipping mode, this
    * flag is ignored.
    */
    public LocationQuery shipsInventory() {
        startField("shipsInventory");

        return this;
    }

    /**
    * List of suggested addresses for this location (empty if none).
    */
    public LocationQuery suggestedAddresses(LocationSuggestedAddressQueryDefinition queryDef) {
        startField("suggestedAddresses");

        _queryBuilder.append('{');
        queryDef.define(new LocationSuggestedAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the location was
    * last updated.
    */
    public LocationQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
