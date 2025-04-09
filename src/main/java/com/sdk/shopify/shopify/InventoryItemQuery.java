// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;

/**
* Represents the goods available to be shipped to a customer.
* It holds essential information about the goods, including SKU and whether it is tracked.
* Learn [more about the relationships between inventory
* objects](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps/manage-qua
* ntities-states#inventory-object-relationships).
*/
public class InventoryItemQuery extends Query<InventoryItemQuery> {
    InventoryItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The ISO 3166-1 alpha-2 country code of where the item originated from.
    */
    public InventoryItemQuery countryCodeOfOrigin() {
        startField("countryCodeOfOrigin");

        return this;
    }

    public class CountryHarmonizedSystemCodesArguments extends Arguments {
        CountryHarmonizedSystemCodesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CountryHarmonizedSystemCodesArguments first(Integer value) {
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
        public CountryHarmonizedSystemCodesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CountryHarmonizedSystemCodesArguments last(Integer value) {
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
        public CountryHarmonizedSystemCodesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CountryHarmonizedSystemCodesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CountryHarmonizedSystemCodesArgumentsDefinition {
        void define(CountryHarmonizedSystemCodesArguments args);
    }

    /**
    * A list of country specific harmonized system codes.
    */
    public InventoryItemQuery countryHarmonizedSystemCodes(CountryHarmonizedSystemCodeConnectionQueryDefinition queryDef) {
        return countryHarmonizedSystemCodes(args -> {}, queryDef);
    }

    /**
    * A list of country specific harmonized system codes.
    */
    public InventoryItemQuery countryHarmonizedSystemCodes(CountryHarmonizedSystemCodesArgumentsDefinition argsDef, CountryHarmonizedSystemCodeConnectionQueryDefinition queryDef) {
        startField("countryHarmonizedSystemCodes");

        CountryHarmonizedSystemCodesArguments args = new CountryHarmonizedSystemCodesArguments(_queryBuilder);
        argsDef.define(args);
        CountryHarmonizedSystemCodesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountryHarmonizedSystemCodeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the inventory item was created.
    */
    public InventoryItemQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The number of inventory items that share the same SKU with this item.
    */
    public InventoryItemQuery duplicateSkuCount() {
        startField("duplicateSkuCount");

        return this;
    }

    /**
    * The harmonized system code of the item. This must be a number between 6 and 13 digits.
    */
    public InventoryItemQuery harmonizedSystemCode() {
        startField("harmonizedSystemCode");

        return this;
    }

    /**
    * The URL that points to the inventory history for the item.
    */
    public InventoryItemQuery inventoryHistoryUrl() {
        startField("inventoryHistoryUrl");

        return this;
    }

    /**
    * The inventory item's quantities at the specified location.
    */
    public InventoryItemQuery inventoryLevel(ID locationId, InventoryLevelQueryDefinition queryDef) {
        startField("inventoryLevel");

        _queryBuilder.append("(locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

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
    * A list of the inventory item's quantities for each location that the inventory item can be stocked
    * at.
    */
    public InventoryItemQuery inventoryLevels(InventoryLevelConnectionQueryDefinition queryDef) {
        return inventoryLevels(args -> {}, queryDef);
    }

    /**
    * A list of the inventory item's quantities for each location that the inventory item can be stocked
    * at.
    */
    public InventoryItemQuery inventoryLevels(InventoryLevelsArgumentsDefinition argsDef, InventoryLevelConnectionQueryDefinition queryDef) {
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
    * The ID of the corresponding resource in the REST Admin API.
    */
    public InventoryItemQuery legacyResourceId() {
        startField("legacyResourceId");

        return this;
    }

    /**
    * The number of locations where this inventory item is stocked.
    */
    public InventoryItemQuery locationsCount(CountQueryDefinition queryDef) {
        startField("locationsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The packaging dimensions of the inventory item.
    */
    public InventoryItemQuery measurement(InventoryItemMeasurementQueryDefinition queryDef) {
        startField("measurement");

        _queryBuilder.append('{');
        queryDef.define(new InventoryItemMeasurementQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The ISO 3166-2 alpha-2 province code of where the item originated from.
    */
    public InventoryItemQuery provinceCodeOfOrigin() {
        startField("provinceCodeOfOrigin");

        return this;
    }

    /**
    * Whether the inventory item requires shipping.
    */
    public InventoryItemQuery requiresShipping() {
        startField("requiresShipping");

        return this;
    }

    /**
    * Inventory item SKU. Case-sensitive string.
    */
    public InventoryItemQuery sku() {
        startField("sku");

        return this;
    }

    /**
    * Whether inventory levels are tracked for the item.
    */
    public InventoryItemQuery tracked() {
        startField("tracked");

        return this;
    }

    /**
    * Whether the value of the `tracked` field for the inventory item can be changed.
    */
    public InventoryItemQuery trackedEditable(EditablePropertyQueryDefinition queryDef) {
        startField("trackedEditable");

        _queryBuilder.append('{');
        queryDef.define(new EditablePropertyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Unit cost associated with the inventory item. Note: the user must have "View product costs"
    * permission granted in order to access this field once product granular permissions are enabled.
    */
    public InventoryItemQuery unitCost(MoneyV2QueryDefinition queryDef) {
        startField("unitCost");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the inventory item was updated.
    */
    public InventoryItemQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    /**
    * The variant that owns this inventory item.
    */
    public InventoryItemQuery variant(ProductVariantQueryDefinition queryDef) {
        startField("variant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
