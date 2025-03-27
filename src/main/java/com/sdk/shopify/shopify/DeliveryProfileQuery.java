// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;

/**
* A shipping profile. In Shopify, a shipping profile is a set of shipping rates scoped to a set of
* products or variants that can be shipped from selected locations to zones. Learn more about
* [building with delivery
* profiles](https://shopify.dev/apps/build/purchase-options/deferred/delivery-and-deferment/build-deli
* very-profiles).
*/
public class DeliveryProfileQuery extends Query<DeliveryProfileQuery> {
    DeliveryProfileQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The number of active shipping rates for the profile.
    */
    public DeliveryProfileQuery activeMethodDefinitionsCount() {
        startField("activeMethodDefinitionsCount");

        return this;
    }

    /**
    * Whether this is the default profile.
    */
    public DeliveryProfileQuery defaultValue() {
        startField("default");

        return this;
    }

    /**
    * Whether this shop has enabled legacy compatibility mode for delivery profiles.
    */
    public DeliveryProfileQuery legacyMode() {
        startField("legacyMode");

        return this;
    }

    /**
    * The number of locations without rates defined.
    */
    public DeliveryProfileQuery locationsWithoutRatesCount() {
        startField("locationsWithoutRatesCount");

        return this;
    }

    /**
    * The name of the delivery profile.
    */
    public DeliveryProfileQuery name() {
        startField("name");

        return this;
    }

    /**
    * The number of active origin locations for the profile.
    */
    public DeliveryProfileQuery originLocationCount() {
        startField("originLocationCount");

        return this;
    }

    /**
    * How many product variants are in this profile.
    */
    public DeliveryProfileQuery productVariantsCount(CountQueryDefinition queryDef) {
        startField("productVariantsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProfileItemsArguments extends Arguments {
        ProfileItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProfileItemsArguments first(Integer value) {
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
        public ProfileItemsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProfileItemsArguments last(Integer value) {
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
        public ProfileItemsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ProfileItemsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProfileItemsArgumentsDefinition {
        void define(ProfileItemsArguments args);
    }

    /**
    * The products and variants associated with this profile.
    */
    public DeliveryProfileQuery profileItems(DeliveryProfileItemConnectionQueryDefinition queryDef) {
        return profileItems(args -> {}, queryDef);
    }

    /**
    * The products and variants associated with this profile.
    */
    public DeliveryProfileQuery profileItems(ProfileItemsArgumentsDefinition argsDef, DeliveryProfileItemConnectionQueryDefinition queryDef) {
        startField("profileItems");

        ProfileItemsArguments args = new ProfileItemsArguments(_queryBuilder);
        argsDef.define(args);
        ProfileItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DeliveryProfileItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProfileLocationGroupsArguments extends Arguments {
        ProfileLocationGroupsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Filter the location groups of the profile by location group ID.
        */
        public ProfileLocationGroupsArguments locationGroupId(ID value) {
            if (value != null) {
                startArgument("locationGroupId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface ProfileLocationGroupsArgumentsDefinition {
        void define(ProfileLocationGroupsArguments args);
    }

    /**
    * The location groups and associated zones using this profile.
    */
    public DeliveryProfileQuery profileLocationGroups(DeliveryProfileLocationGroupQueryDefinition queryDef) {
        return profileLocationGroups(args -> {}, queryDef);
    }

    /**
    * The location groups and associated zones using this profile.
    */
    public DeliveryProfileQuery profileLocationGroups(ProfileLocationGroupsArgumentsDefinition argsDef, DeliveryProfileLocationGroupQueryDefinition queryDef) {
        startField("profileLocationGroups");

        ProfileLocationGroupsArguments args = new ProfileLocationGroupsArguments(_queryBuilder);
        argsDef.define(args);
        ProfileLocationGroupsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DeliveryProfileLocationGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SellingPlanGroupsArguments extends Arguments {
        SellingPlanGroupsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SellingPlanGroupsArguments first(Integer value) {
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
        public SellingPlanGroupsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SellingPlanGroupsArguments last(Integer value) {
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
        public SellingPlanGroupsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public SellingPlanGroupsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SellingPlanGroupsArgumentsDefinition {
        void define(SellingPlanGroupsArguments args);
    }

    /**
    * Selling plan groups associated with the specified delivery profile.
    */
    public DeliveryProfileQuery sellingPlanGroups(SellingPlanGroupConnectionQueryDefinition queryDef) {
        return sellingPlanGroups(args -> {}, queryDef);
    }

    /**
    * Selling plan groups associated with the specified delivery profile.
    */
    public DeliveryProfileQuery sellingPlanGroups(SellingPlanGroupsArgumentsDefinition argsDef, SellingPlanGroupConnectionQueryDefinition queryDef) {
        startField("sellingPlanGroups");

        SellingPlanGroupsArguments args = new SellingPlanGroupsArguments(_queryBuilder);
        argsDef.define(args);
        SellingPlanGroupsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * List of locations that haven't been assigned to a location group for this profile.
    */
    public DeliveryProfileQuery unassignedLocations(LocationQueryDefinition queryDef) {
        startField("unassignedLocations");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UnassignedLocationsPaginatedArguments extends Arguments {
        UnassignedLocationsPaginatedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public UnassignedLocationsPaginatedArguments first(Integer value) {
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
        public UnassignedLocationsPaginatedArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public UnassignedLocationsPaginatedArguments last(Integer value) {
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
        public UnassignedLocationsPaginatedArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public UnassignedLocationsPaginatedArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface UnassignedLocationsPaginatedArgumentsDefinition {
        void define(UnassignedLocationsPaginatedArguments args);
    }

    /**
    * List of locations that have not been assigned to a location group for this profile.
    */
    public DeliveryProfileQuery unassignedLocationsPaginated(LocationConnectionQueryDefinition queryDef) {
        return unassignedLocationsPaginated(args -> {}, queryDef);
    }

    /**
    * List of locations that have not been assigned to a location group for this profile.
    */
    public DeliveryProfileQuery unassignedLocationsPaginated(UnassignedLocationsPaginatedArgumentsDefinition argsDef, LocationConnectionQueryDefinition queryDef) {
        startField("unassignedLocationsPaginated");

        UnassignedLocationsPaginatedArguments args = new UnassignedLocationsPaginatedArguments(_queryBuilder);
        argsDef.define(args);
        UnassignedLocationsPaginatedArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LocationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of countries with active rates to deliver to.
    */
    public DeliveryProfileQuery zoneCountryCount() {
        startField("zoneCountryCount");

        return this;
    }
}
