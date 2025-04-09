// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* Links a location group with zones. Both are associated to a delivery profile.
*/
public class DeliveryProfileLocationGroupQuery extends Query<DeliveryProfileLocationGroupQuery> {
    DeliveryProfileLocationGroupQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The countries already selected in any zone for the specified location group.
    */
    public DeliveryProfileLocationGroupQuery countriesInAnyZone(DeliveryCountryAndZoneQueryDefinition queryDef) {
        startField("countriesInAnyZone");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCountryAndZoneQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The collection of locations that make up the specified location group.
    */
    public DeliveryProfileLocationGroupQuery locationGroup(DeliveryLocationGroupQueryDefinition queryDef) {
        startField("locationGroup");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryLocationGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LocationGroupZonesArguments extends Arguments {
        LocationGroupZonesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LocationGroupZonesArguments first(Integer value) {
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
        public LocationGroupZonesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LocationGroupZonesArguments last(Integer value) {
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
        public LocationGroupZonesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public LocationGroupZonesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LocationGroupZonesArgumentsDefinition {
        void define(LocationGroupZonesArguments args);
    }

    /**
    * The applicable zones associated to the specified location group.
    */
    public DeliveryProfileLocationGroupQuery locationGroupZones(DeliveryLocationGroupZoneConnectionQueryDefinition queryDef) {
        return locationGroupZones(args -> {}, queryDef);
    }

    /**
    * The applicable zones associated to the specified location group.
    */
    public DeliveryProfileLocationGroupQuery locationGroupZones(LocationGroupZonesArgumentsDefinition argsDef, DeliveryLocationGroupZoneConnectionQueryDefinition queryDef) {
        startField("locationGroupZones");

        LocationGroupZonesArguments args = new LocationGroupZonesArguments(_queryBuilder);
        argsDef.define(args);
        LocationGroupZonesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DeliveryLocationGroupZoneConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
