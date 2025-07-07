// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Published translations associated with the resource.
*/
public class UnknownHasPublishedTranslations extends AbstractResponse<UnknownHasPublishedTranslations> implements HasPublishedTranslations {
    public UnknownHasPublishedTranslations() {
    }

    public UnknownHasPublishedTranslations(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "translations": {
                    List<Translation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Translation(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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

    public static HasPublishedTranslations create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "Article": {
                return new Article(fields);
            }

            case "Blog": {
                return new Blog(fields);
            }

            case "Collection": {
                return new Collection(fields);
            }

            case "CookieBanner": {
                return new CookieBanner(fields);
            }

            case "Link": {
                return new Link(fields);
            }

            case "Menu": {
                return new Menu(fields);
            }

            case "OnlineStoreTheme": {
                return new OnlineStoreTheme(fields);
            }

            case "Page": {
                return new Page(fields);
            }

            case "Product": {
                return new Product(fields);
            }

            case "ProductOption": {
                return new ProductOption(fields);
            }

            case "ProductOptionValue": {
                return new ProductOptionValue(fields);
            }

            case "ProductVariant": {
                return new ProductVariant(fields);
            }

            case "SellingPlan": {
                return new SellingPlan(fields);
            }

            case "SellingPlanGroup": {
                return new SellingPlanGroup(fields);
            }

            case "Shop": {
                return new Shop(fields);
            }

            case "ShopPolicy": {
                return new ShopPolicy(fields);
            }

            default: {
                return new UnknownHasPublishedTranslations(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The published translations associated with the resource.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public UnknownHasPublishedTranslations setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "translations": return true;

            default: return false;
        }
    }
}

