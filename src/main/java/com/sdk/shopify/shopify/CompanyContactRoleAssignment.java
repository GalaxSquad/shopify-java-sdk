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
* The CompanyContactRoleAssignment describes the company and location associated to a company
* contact's role.
*/
public class CompanyContactRoleAssignment extends AbstractResponse<CompanyContactRoleAssignment> implements Node {
    public CompanyContactRoleAssignment() {
    }

    public CompanyContactRoleAssignment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "company": {
                    responseData.put(key, new Company(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "companyContact": {
                    responseData.put(key, new CompanyContact(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "companyLocation": {
                    responseData.put(key, new CompanyLocation(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "role": {
                    responseData.put(key, new CompanyContactRole(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "updatedAt": {
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

    public CompanyContactRoleAssignment(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "CompanyContactRoleAssignment";
    }

    /**
    * The company this role assignment belongs to.
    */

    public Company getCompany() {
        return (Company) get("company");
    }

    public CompanyContactRoleAssignment setCompany(Company arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    /**
    * The company contact for whom this role is assigned.
    */

    public CompanyContact getCompanyContact() {
        return (CompanyContact) get("companyContact");
    }

    public CompanyContactRoleAssignment setCompanyContact(CompanyContact arg) {
        optimisticData.put(getKey("companyContact"), arg);
        return this;
    }

    /**
    * The company location to which the role is assigned.
    */

    public CompanyLocation getCompanyLocation() {
        return (CompanyLocation) get("companyLocation");
    }

    public CompanyContactRoleAssignment setCompanyLocation(CompanyLocation arg) {
        optimisticData.put(getKey("companyLocation"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the assignment
    * record was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public CompanyContactRoleAssignment setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The role that's assigned to the company contact.
    */

    public CompanyContactRole getRole() {
        return (CompanyContactRole) get("role");
    }

    public CompanyContactRoleAssignment setRole(CompanyContactRole arg) {
        optimisticData.put(getKey("role"), arg);
        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the assignment
    * record was last updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public CompanyContactRoleAssignment setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "company": return true;

            case "companyContact": return true;

            case "companyLocation": return true;

            case "createdAt": return false;

            case "id": return false;

            case "role": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

