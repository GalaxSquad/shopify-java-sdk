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
* The connection type for the `CustomerSegmentMembers` object.
*/
public class CustomerSegmentMemberConnection extends AbstractResponse<CustomerSegmentMemberConnection> {
    public CustomerSegmentMemberConnection() {
    }

    public CustomerSegmentMemberConnection(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "edges": {
                    List<CustomerSegmentMemberEdge> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CustomerSegmentMemberEdge(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "pageInfo": {
                    responseData.put(key, new PageInfo(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "statistics": {
                    responseData.put(key, new SegmentStatistics(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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
        return "CustomerSegmentMemberConnection";
    }

    /**
    * A list of edges.
    */

    public List<CustomerSegmentMemberEdge> getEdges() {
        return (List<CustomerSegmentMemberEdge>) get("edges");
    }

    public CustomerSegmentMemberConnection setEdges(List<CustomerSegmentMemberEdge> arg) {
        optimisticData.put(getKey("edges"), arg);
        return this;
    }

    /**
    * An object that’s used to retrieve [cursor
    * information](https://shopify.dev/api/usage/pagination-graphql) about the current page.
    */

    public PageInfo getPageInfo() {
        return (PageInfo) get("pageInfo");
    }

    public CustomerSegmentMemberConnection setPageInfo(PageInfo arg) {
        optimisticData.put(getKey("pageInfo"), arg);
        return this;
    }

    /**
    * The statistics for a given segment.
    */

    public SegmentStatistics getStatistics() {
        return (SegmentStatistics) get("statistics");
    }

    public CustomerSegmentMemberConnection setStatistics(SegmentStatistics arg) {
        optimisticData.put(getKey("statistics"), arg);
        return this;
    }

    /**
    * The total number of members in a given segment.
    */

    public Integer getTotalCount() {
        return (Integer) get("totalCount");
    }

    public CustomerSegmentMemberConnection setTotalCount(Integer arg) {
        optimisticData.put(getKey("totalCount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "edges": return true;

            case "pageInfo": return true;

            case "statistics": return true;

            case "totalCount": return false;

            default: return false;
        }
    }
}

