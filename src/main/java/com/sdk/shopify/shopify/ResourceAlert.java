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
* An alert message that appears in the Shopify admin about a problem with a store resource, with 1 or
* more actions to take. For example, you could use an alert to indicate that you're not charging taxes
* on some product variants.
* They can optionally have a specific icon and be dismissed by merchants.
*/
public class ResourceAlert extends AbstractResponse<ResourceAlert> {
    public ResourceAlert() {
    }

    public ResourceAlert(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "actions": {
                    List<ResourceAlertAction> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ResourceAlertAction(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "content": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "dismissibleHandle": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "icon": {
                    ResourceAlertIcon optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = ResourceAlertIcon.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "severity": {
                    responseData.put(key, ResourceAlertSeverity.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public String getGraphQlTypeName() {
        return "ResourceAlert";
    }

    /**
    * Buttons in the alert that link to related information.
    * For example, _Edit variants_.
    */

    public List<ResourceAlertAction> getActions() {
        return (List<ResourceAlertAction>) get("actions");
    }

    public ResourceAlert setActions(List<ResourceAlertAction> arg) {
        optimisticData.put(getKey("actions"), arg);
        return this;
    }

    /**
    * The secondary text in the alert that includes further information or instructions about how to solve
    * a problem.
    */

    public String getContent() {
        return (String) get("content");
    }

    public ResourceAlert setContent(String arg) {
        optimisticData.put(getKey("content"), arg);
        return this;
    }

    /**
    * Unique identifier that appears when an alert is manually closed by the merchant.
    * Most alerts can't be manually closed.
    */

    public String getDismissibleHandle() {
        return (String) get("dismissibleHandle");
    }

    public ResourceAlert setDismissibleHandle(String arg) {
        optimisticData.put(getKey("dismissibleHandle"), arg);
        return this;
    }

    /**
    * An icon that's optionally displayed with the alert.
    */

    public ResourceAlertIcon getIcon() {
        return (ResourceAlertIcon) get("icon");
    }

    public ResourceAlert setIcon(ResourceAlertIcon arg) {
        optimisticData.put(getKey("icon"), arg);
        return this;
    }

    /**
    * Indication of how important the alert is.
    */

    public ResourceAlertSeverity getSeverity() {
        return (ResourceAlertSeverity) get("severity");
    }

    public ResourceAlert setSeverity(ResourceAlertSeverity arg) {
        optimisticData.put(getKey("severity"), arg);
        return this;
    }

    /**
    * The primary text in the alert that includes information or describes the problem.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public ResourceAlert setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "actions": return true;

            case "content": return false;

            case "dismissibleHandle": return false;

            case "icon": return false;

            case "severity": return false;

            case "title": return false;

            default: return false;
        }
    }
}

