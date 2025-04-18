// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;



/**
* You can use the `MobilePlatformApplication` resource to enable
* [shared web credentials](https://developer.apple.com/documentation/security/shared_web_credentials)
* for Shopify iOS apps,
* as well as to create [iOS universal link](https://developer.apple.com/ios/universal-links/)
* or [Android app link](https://developer.android.com/training/app-links/) verification endpoints for
* merchant Shopify iOS or Android apps.
* Shared web credentials let iOS users access a native app after logging into the respective website
* in Safari without re-entering
* their username and password. If a user changes their credentials in the app, then those changes are
* reflected in Safari.
* You must use a custom domain to integrate shared web credentials with Shopify. With each platform's
* link system,
* users can tap a link to a shop's website and get seamlessly redirected to a merchant's installed app
* without going
* through a browser or manually selecting an app.
* For full configuration instructions on iOS shared web credentials,
* see the [associated domains
* setup](https://developer.apple.com/documentation/security/password_autofill/setting_up_an_app_s_asso
* ciated_domains) technical documentation.
* For full configuration instructions on iOS universal links or Android App Links,
* see the respective [iOS universal
* link](https://developer.apple.com/documentation/uikit/core_app/allowing_apps_and_websites_to_link_to
* _your_content)
* or [Android app link](https://developer.android.com/training/app-links) technical documentation.
*/

public interface MobilePlatformApplication {
    String getGraphQlTypeName();
}

