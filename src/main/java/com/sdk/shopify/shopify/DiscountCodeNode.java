// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The `DiscountCodeNode` object enables you to manage [code
* discounts](https://help.shopify.com/manual/discounts/discount-types#discount-codes) that are applied
* when customers enter a code at checkout. For example, you can offer discounts where customers have
* to enter a code to redeem an amount off discount on products, variants, or collections in a store.
* Or, you can offer discounts where customers have to enter a code to get free shipping. Merchants can
* create and share discount codes individually with customers.
* Learn more about working with [Shopify's discount
* model](https://shopify.dev/docs/apps/build/discounts),
* including related queries, mutations, limitations, and considerations.
*/
public class DiscountCodeNode extends AbstractResponse<DiscountCodeNode> implements HasEvents, HasMetafieldDefinitions, HasMetafields, MetafieldReferencer, Node {
    public DiscountCodeNode() {
    }

    public DiscountCodeNode(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "codeDiscount": {
                    responseData.put(key, UnknownDiscountCode.create(jsonAsObject(field.getValue(), key)));

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

    public DiscountCodeNode(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DiscountCodeNode";
    }

    /**
    * The underlying code discount object.
    */

    public DiscountCode getCodeDiscount() {
        return (DiscountCode) get("codeDiscount");
    }

    public DiscountCodeNode setCodeDiscount(DiscountCode arg) {
        optimisticData.put(getKey("codeDiscount"), arg);
        return this;
    }

    /**
    * The paginated list of events associated with the host subject.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public DiscountCodeNode setEvents(EventConnection arg) {
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

    public DiscountCodeNode setMetafield(Metafield arg) {
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

    public DiscountCodeNode setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "codeDiscount": return false;

            case "events": return true;

            case "id": return false;

            case "metafield": return true;

            case "metafields": return true;

            default: return false;
        }
    }
}

