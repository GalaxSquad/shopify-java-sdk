// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CheckoutBrandingControlColorRolesInput implements Serializable {
    private Input<String> background = Input.undefined();

    private Input<String> text = Input.undefined();

    private Input<String> border = Input.undefined();

    private Input<String> icon = Input.undefined();

    private Input<String> accent = Input.undefined();

    private Input<String> decorative = Input.undefined();

    private Input<CheckoutBrandingColorRolesInput> selected = Input.undefined();

    public String getBackground() {
        return background.getValue();
    }

    public Input<String> getBackgroundInput() {
        return background;
    }

    public CheckoutBrandingControlColorRolesInput setBackground(String background) {
        this.background = Input.optional(background);
        return this;
    }

    public CheckoutBrandingControlColorRolesInput setBackgroundInput(Input<String> background) {
        if (background == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.background = background;
        return this;
    }

    public String getText() {
        return text.getValue();
    }

    public Input<String> getTextInput() {
        return text;
    }

    public CheckoutBrandingControlColorRolesInput setText(String text) {
        this.text = Input.optional(text);
        return this;
    }

    public CheckoutBrandingControlColorRolesInput setTextInput(Input<String> text) {
        if (text == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.text = text;
        return this;
    }

    public String getBorder() {
        return border.getValue();
    }

    public Input<String> getBorderInput() {
        return border;
    }

    public CheckoutBrandingControlColorRolesInput setBorder(String border) {
        this.border = Input.optional(border);
        return this;
    }

    public CheckoutBrandingControlColorRolesInput setBorderInput(Input<String> border) {
        if (border == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.border = border;
        return this;
    }

    public String getIcon() {
        return icon.getValue();
    }

    public Input<String> getIconInput() {
        return icon;
    }

    public CheckoutBrandingControlColorRolesInput setIcon(String icon) {
        this.icon = Input.optional(icon);
        return this;
    }

    public CheckoutBrandingControlColorRolesInput setIconInput(Input<String> icon) {
        if (icon == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.icon = icon;
        return this;
    }

    public String getAccent() {
        return accent.getValue();
    }

    public Input<String> getAccentInput() {
        return accent;
    }

    public CheckoutBrandingControlColorRolesInput setAccent(String accent) {
        this.accent = Input.optional(accent);
        return this;
    }

    public CheckoutBrandingControlColorRolesInput setAccentInput(Input<String> accent) {
        if (accent == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.accent = accent;
        return this;
    }

    public String getDecorative() {
        return decorative.getValue();
    }

    public Input<String> getDecorativeInput() {
        return decorative;
    }

    public CheckoutBrandingControlColorRolesInput setDecorative(String decorative) {
        this.decorative = Input.optional(decorative);
        return this;
    }

    public CheckoutBrandingControlColorRolesInput setDecorativeInput(Input<String> decorative) {
        if (decorative == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.decorative = decorative;
        return this;
    }

    public CheckoutBrandingColorRolesInput getSelected() {
        return selected.getValue();
    }

    public Input<CheckoutBrandingColorRolesInput> getSelectedInput() {
        return selected;
    }

    public CheckoutBrandingControlColorRolesInput setSelected(CheckoutBrandingColorRolesInput selected) {
        this.selected = Input.optional(selected);
        return this;
    }

    public CheckoutBrandingControlColorRolesInput setSelectedInput(Input<CheckoutBrandingColorRolesInput> selected) {
        if (selected == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.selected = selected;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.background.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("background:");
            if (background.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, background.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.text.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("text:");
            if (text.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, text.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.border.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("border:");
            if (border.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, border.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.icon.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("icon:");
            if (icon.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, icon.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.accent.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("accent:");
            if (accent.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, accent.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.decorative.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("decorative:");
            if (decorative.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, decorative.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.selected.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("selected:");
            if (selected.getValue() != null) {
                selected.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
