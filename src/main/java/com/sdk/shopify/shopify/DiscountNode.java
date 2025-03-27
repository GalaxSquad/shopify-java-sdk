// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The `DiscountNode` object enables you to manage
* [discounts](https://help.shopify.com/manual/discounts), which are applied at checkout or on a cart.
* Discounts are a way for merchants to promote sales and special offers, or as customer loyalty
* rewards. Discounts can apply to [orders, products, or
* shipping](https://shopify.dev/docs/apps/build/discounts#discount-classes), and can be either
* automatic or code-based. For example, you can offer customers a buy X get Y discount that's
* automatically applied when purchases meet specific criteria. Or, you can offer discounts where
* customers have to enter a code to redeem an amount off discount on products, variants, or
* collections in a store.
* Learn more about working with [Shopify's discount
* model](https://shopify.dev/docs/apps/build/discounts),
* including related mutations, limitations, and considerations.
*/
public class DiscountNode extends AbstractResponse<DiscountNode> implements HasEvents, HasMetafieldDefinitions, HasMetafields, MetafieldReferencer, Node {
    public DiscountNode() {
    }

    public DiscountNode(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "discount": {
                    responseData.put(key, UnknownDiscount.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "events": {
                    responseData.put(key, new EventConnection(jsonAsObject(field.getValue(), key)));

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

    public DiscountNode(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DiscountNode";
    }

    /**
    * A discount that's applied at checkout or on cart.
    * Discounts can be [automatic or
    * code-based](https://shopify.dev/docs/apps/build/discounts#discount-methods).
    */

    public Discount getDiscount() {
        return (Discount) get("discount");
    }

    public DiscountNode setDiscount(Discount arg) {
        optimisticData.put(getKey("discount"), arg);
        return this;
    }

    /**
    * The paginated list of events associated with the host subject.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public DiscountNode setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
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

    public DiscountNode setMetafield(Metafield arg) {
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

    public DiscountNode setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "discount": return false;

            case "events": return true;

            case "id": return false;

            case "metafield": return true;

            case "metafields": return true;

            default: return false;
        }
    }
}

