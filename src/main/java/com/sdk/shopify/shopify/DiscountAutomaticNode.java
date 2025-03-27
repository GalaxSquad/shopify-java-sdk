// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The `DiscountAutomaticNode` object enables you to manage [automatic
* discounts](https://help.shopify.com/manual/discounts/discount-types#automatic-discounts) that are
* applied when an order meets specific criteria. You can create amount off, free shipping, or buy X
* get Y automatic discounts. For example, you can offer customers a free shipping discount that
* applies when conditions are met. Or you can offer customers a buy X get Y discount that's
* automatically applied when customers spend a specified amount of money, or a specified quantity of
* products.
* Learn more about working with [Shopify's discount
* model](https://shopify.dev/docs/apps/build/discounts),
* including related queries, mutations, limitations, and considerations.
*/
public class DiscountAutomaticNode extends AbstractResponse<DiscountAutomaticNode> implements HasEvents, HasMetafieldDefinitions, HasMetafields, MetafieldReferencer, Node {
    public DiscountAutomaticNode() {
    }

    public DiscountAutomaticNode(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "automaticDiscount": {
                    responseData.put(key, UnknownDiscountAutomatic.create(jsonAsObject(field.getValue(), key)));

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

    public DiscountAutomaticNode(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DiscountAutomaticNode";
    }

    /**
    * A discount that's applied automatically when an order meets specific criteria. Learn more about
    * [automatic discounts](https://help.shopify.com/manual/discounts/discount-types#automatic-discounts).
    */

    public DiscountAutomatic getAutomaticDiscount() {
        return (DiscountAutomatic) get("automaticDiscount");
    }

    public DiscountAutomaticNode setAutomaticDiscount(DiscountAutomatic arg) {
        optimisticData.put(getKey("automaticDiscount"), arg);
        return this;
    }

    /**
    * The paginated list of events associated with the host subject.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public DiscountAutomaticNode setEvents(EventConnection arg) {
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

    public DiscountAutomaticNode setMetafield(Metafield arg) {
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

    public DiscountAutomaticNode setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "automaticDiscount": return false;

            case "events": return true;

            case "id": return false;

            case "metafield": return true;

            case "metafields": return true;

            default: return false;
        }
    }
}

