// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A market is a group of one or more regions that you want to target for international sales.
* By creating a market, you can configure a distinct, localized shopping experience for
* customers from a specific area of the world. For example, you can
* [change
* currency](https://shopify.dev/api/admin-graphql/current/mutations/marketCurrencySettingsUpdate),
* [configure international
* pricing](https://shopify.dev/apps/internationalization/product-price-lists),
* or [add market-specific domains or
* subfolders](https://shopify.dev/api/admin-graphql/current/objects/MarketWebPresence).
*/
public class Market extends AbstractResponse<Market> implements HasMetafieldDefinitions, HasMetafields, MetafieldReferencer, Node {
    public Market() {
    }

    public Market(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "assignedCustomization": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "catalogs": {
                    responseData.put(key, new MarketCatalogConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "catalogsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "conditions": {
                    MarketConditions optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketConditions(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "currencySettings": {
                    MarketCurrencySettings optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketCurrencySettings(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "handle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "metafield": {
                    Metafield optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Metafield(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafields": {
                    responseData.put(key, new MetafieldConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "priceInclusions": {
                    MarketPriceInclusions optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarketPriceInclusions(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    responseData.put(key, MarketStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "type": {
                    responseData.put(key, MarketType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "webPresences": {
                    responseData.put(key, new MarketWebPresenceConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public Market(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Market";
    }

    /**
    * Whether the market has a customization with the given ID.
    */

    public Boolean getAssignedCustomization() {
        return (Boolean) get("assignedCustomization");
    }

    public Market setAssignedCustomization(Boolean arg) {
        optimisticData.put(getKey("assignedCustomization"), arg);
        return this;
    }

    /**
    * The catalogs that belong to the market.
    */

    public MarketCatalogConnection getCatalogs() {
        return (MarketCatalogConnection) get("catalogs");
    }

    public Market setCatalogs(MarketCatalogConnection arg) {
        optimisticData.put(getKey("catalogs"), arg);
        return this;
    }

    /**
    * The number of catalogs that belong to the market.
    */

    public Count getCatalogsCount() {
        return (Count) get("catalogsCount");
    }

    public Market setCatalogsCount(Count arg) {
        optimisticData.put(getKey("catalogsCount"), arg);
        return this;
    }

    /**
    * The conditions under which a visitor is in the market.
    */

    public MarketConditions getConditions() {
        return (MarketConditions) get("conditions");
    }

    public Market setConditions(MarketConditions arg) {
        optimisticData.put(getKey("conditions"), arg);
        return this;
    }

    /**
    * The market’s currency settings.
    */

    public MarketCurrencySettings getCurrencySettings() {
        return (MarketCurrencySettings) get("currencySettings");
    }

    public Market setCurrencySettings(MarketCurrencySettings arg) {
        optimisticData.put(getKey("currencySettings"), arg);
        return this;
    }

    /**
    * A short, human-readable unique identifier for the market. This is changeable by the merchant.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public Market setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */

    public Metafield getMetafield() {
        return (Metafield) get("metafield");
    }

    public Market setMetafield(Metafield arg) {
        optimisticData.put(getKey("metafield"), arg);
        return this;
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */

    public MetafieldConnection getMetafields() {
        return (MetafieldConnection) get("metafields");
    }

    public Market setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The name of the market. Not shown to customers.
    */

    public String getName() {
        return (String) get("name");
    }

    public Market setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The inclusive pricing strategy for a market. This determines if prices include duties and / or
    * taxes.
    */

    public MarketPriceInclusions getPriceInclusions() {
        return (MarketPriceInclusions) get("priceInclusions");
    }

    public Market setPriceInclusions(MarketPriceInclusions arg) {
        optimisticData.put(getKey("priceInclusions"), arg);
        return this;
    }

    /**
    * Status of the market. Replaces the enabled field.
    */

    public MarketStatus getStatus() {
        return (MarketStatus) get("status");
    }

    public Market setStatus(MarketStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The type of the market.
    */

    public MarketType getType() {
        return (MarketType) get("type");
    }

    public Market setType(MarketType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
    * The market’s web presences, which defines its SEO strategy. This can be a different domain,
    * subdomain, or subfolders of the primary domain. Each web presence comprises one or more
    * language variants. If a market doesn't have any web presences, then the market is accessible on the
    * primary market's domains using [country
    * selectors](https://shopify.dev/themes/internationalization/multiple-currencies-languages#the-country
    * -selector).
    */

    public MarketWebPresenceConnection getWebPresences() {
        return (MarketWebPresenceConnection) get("webPresences");
    }

    public Market setWebPresences(MarketWebPresenceConnection arg) {
        optimisticData.put(getKey("webPresences"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "assignedCustomization": return false;

            case "catalogs": return true;

            case "catalogsCount": return true;

            case "conditions": return true;

            case "currencySettings": return true;

            case "handle": return false;

            case "id": return false;

            case "metafield": return true;

            case "metafields": return true;

            case "name": return false;

            case "priceInclusions": return true;

            case "status": return false;

            case "type": return false;

            case "webPresences": return true;

            default: return false;
        }
    }
}

