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

import java.util.Map;

/**
* Represents information about the metafields associated to the specified resource.
*/
public class UnknownHasMetafields extends AbstractResponse<UnknownHasMetafields> implements HasMetafields {
    public UnknownHasMetafields() {
    }

    public UnknownHasMetafields(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static HasMetafields create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "AppInstallation": {
                return new AppInstallation(fields);
            }

            case "Article": {
                return new Article(fields);
            }

            case "Blog": {
                return new Blog(fields);
            }

            case "CartTransform": {
                return new CartTransform(fields);
            }

            case "Collection": {
                return new Collection(fields);
            }

            case "Company": {
                return new Company(fields);
            }

            case "CompanyLocation": {
                return new CompanyLocation(fields);
            }

            case "Customer": {
                return new Customer(fields);
            }

            case "CustomerSegmentMember": {
                return new CustomerSegmentMember(fields);
            }

            case "DeliveryCustomization": {
                return new DeliveryCustomization(fields);
            }

            case "DiscountAutomaticNode": {
                return new DiscountAutomaticNode(fields);
            }

            case "DiscountCodeNode": {
                return new DiscountCodeNode(fields);
            }

            case "DiscountNode": {
                return new DiscountNode(fields);
            }

            case "DraftOrder": {
                return new DraftOrder(fields);
            }

            case "FulfillmentConstraintRule": {
                return new FulfillmentConstraintRule(fields);
            }

            case "GiftCardCreditTransaction": {
                return new GiftCardCreditTransaction(fields);
            }
            case "GiftCardDebitTransaction": {
                return new GiftCardDebitTransaction(fields);
            }


            case "Image": {
                return new Image(fields);
            }

            case "Location": {
                return new Location(fields);
            }

            case "Market": {
                return new Market(fields);
            }

            case "MediaImage": {
                return new MediaImage(fields);
            }

            case "Order": {
                return new Order(fields);
            }

            case "Page": {
                return new Page(fields);
            }

            case "PaymentCustomization": {
                return new PaymentCustomization(fields);
            }

            case "Product": {
                return new Product(fields);
            }

            case "ProductVariant": {
                return new ProductVariant(fields);
            }

            case "SellingPlan": {
                return new SellingPlan(fields);
            }

            case "Shop": {
                return new Shop(fields);
            }

            case "Validation": {
                return new Validation(fields);
            }

            default: {
                return new UnknownHasMetafields(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */

    public Metafield getMetafield() {
        return (Metafield) get("metafield");
    }

    public UnknownHasMetafields setMetafield(Metafield arg) {
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

    public UnknownHasMetafields setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "metafield": return true;

            case "metafields": return true;

            default: return false;
        }
    }
}

