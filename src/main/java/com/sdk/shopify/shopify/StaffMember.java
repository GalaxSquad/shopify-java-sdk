// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Represents the data about a staff member's Shopify account. Merchants can use staff member data to
* get more information about the staff members in their store.
*/
public class StaffMember extends AbstractResponse<StaffMember> implements Node {
    public StaffMember() {
    }

    public StaffMember(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "accountType": {
                    AccountType optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = AccountType.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "active": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "avatar": {
                    responseData.put(key, new Image(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "email": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "exists": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "firstName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "initials": {
                    List<String> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<String> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(jsonAsString(element1, key));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isShopOwner": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "lastName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locale": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "phone": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "privateData": {
                    responseData.put(key, new StaffMemberPrivateData(jsonAsObject(field.getValue(), key)));

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

    public StaffMember(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "StaffMember";
    }

    /**
    * The type of account the staff member has.
    */

    public AccountType getAccountType() {
        return (AccountType) get("accountType");
    }

    public StaffMember setAccountType(AccountType arg) {
        optimisticData.put(getKey("accountType"), arg);
        return this;
    }

    /**
    * Whether the staff member is active.
    */

    public Boolean getActive() {
        return (Boolean) get("active");
    }

    public StaffMember setActive(Boolean arg) {
        optimisticData.put(getKey("active"), arg);
        return this;
    }

    /**
    * The image used as the staff member's avatar in the Shopify admin.
    */

    public Image getAvatar() {
        return (Image) get("avatar");
    }

    public StaffMember setAvatar(Image arg) {
        optimisticData.put(getKey("avatar"), arg);
        return this;
    }

    /**
    * The staff member's email address.
    */

    public String getEmail() {
        return (String) get("email");
    }

    public StaffMember setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
    * Whether the staff member's account exists.
    */

    public Boolean getExists() {
        return (Boolean) get("exists");
    }

    public StaffMember setExists(Boolean arg) {
        optimisticData.put(getKey("exists"), arg);
        return this;
    }

    /**
    * The staff member's first name.
    */

    public String getFirstName() {
        return (String) get("firstName");
    }

    public StaffMember setFirstName(String arg) {
        optimisticData.put(getKey("firstName"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The staff member's initials, if available.
    */

    public List<String> getInitials() {
        return (List<String>) get("initials");
    }

    public StaffMember setInitials(List<String> arg) {
        optimisticData.put(getKey("initials"), arg);
        return this;
    }

    /**
    * Whether the staff member is the shop owner.
    */

    public Boolean getIsShopOwner() {
        return (Boolean) get("isShopOwner");
    }

    public StaffMember setIsShopOwner(Boolean arg) {
        optimisticData.put(getKey("isShopOwner"), arg);
        return this;
    }

    /**
    * The staff member's last name.
    */

    public String getLastName() {
        return (String) get("lastName");
    }

    public StaffMember setLastName(String arg) {
        optimisticData.put(getKey("lastName"), arg);
        return this;
    }

    /**
    * The staff member's preferred locale. Locale values use the format `language` or `language-COUNTRY`,
    * where `language` is a two-letter language code, and `COUNTRY` is a two-letter country code. For
    * example: `en` or `en-US`
    */

    public String getLocale() {
        return (String) get("locale");
    }

    public StaffMember setLocale(String arg) {
        optimisticData.put(getKey("locale"), arg);
        return this;
    }

    /**
    * The staff member's full name.
    */

    public String getName() {
        return (String) get("name");
    }

    public StaffMember setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The staff member's phone number.
    */

    public String getPhone() {
        return (String) get("phone");
    }

    public StaffMember setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    /**
    * The data used to customize the Shopify admin experience for the staff member.
    */

    public StaffMemberPrivateData getPrivateData() {
        return (StaffMemberPrivateData) get("privateData");
    }

    public StaffMember setPrivateData(StaffMemberPrivateData arg) {
        optimisticData.put(getKey("privateData"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "accountType": return false;

            case "active": return false;

            case "avatar": return true;

            case "email": return false;

            case "exists": return false;

            case "firstName": return false;

            case "id": return false;

            case "initials": return false;

            case "isShopOwner": return false;

            case "lastName": return false;

            case "locale": return false;

            case "name": return false;

            case "phone": return false;

            case "privateData": return true;

            default: return false;
        }
    }
}

