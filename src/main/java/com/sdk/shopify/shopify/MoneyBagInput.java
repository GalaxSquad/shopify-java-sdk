// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class MoneyBagInput implements Serializable {
    private MoneyInput shopMoney;

    private Input<MoneyInput> presentmentMoney = Input.undefined();

    public MoneyBagInput(MoneyInput shopMoney) {
        this.shopMoney = shopMoney;
    }

    public MoneyInput getShopMoney() {
        return shopMoney;
    }

    public MoneyBagInput setShopMoney(MoneyInput shopMoney) {
        this.shopMoney = shopMoney;
        return this;
    }

    public MoneyInput getPresentmentMoney() {
        return presentmentMoney.getValue();
    }

    public Input<MoneyInput> getPresentmentMoneyInput() {
        return presentmentMoney;
    }

    public MoneyBagInput setPresentmentMoney(MoneyInput presentmentMoney) {
        this.presentmentMoney = Input.optional(presentmentMoney);
        return this;
    }

    public MoneyBagInput setPresentmentMoneyInput(Input<MoneyInput> presentmentMoney) {
        if (presentmentMoney == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.presentmentMoney = presentmentMoney;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("shopMoney:");
        shopMoney.appendTo(_queryBuilder);

        if (this.presentmentMoney.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("presentmentMoney:");
            if (presentmentMoney.getValue() != null) {
                presentmentMoney.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
