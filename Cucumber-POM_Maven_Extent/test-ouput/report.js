$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/RajniKilhore/eclipse-workspace/coneptNeerajLink/src/test/java/Features/feat.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8956494900,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#without Examples Keyword"
    }
  ],
  "line": 5,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "he search for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "choose to buy the first item",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "moves to checkout from mini cart",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "enter personal details on checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "place the order",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify the order details",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 41594115800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dress",
      "offset": 15
    }
  ],
  "location": "HomePageSteps.he_search_for(String)"
});
formatter.result({
  "duration": 67574823900,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageSteps.choose_to_buy_the_first_item()"
});
formatter.result({
  "duration": 59520818700,
  "status": "passed"
});
formatter.match({
  "location": "CartPageSteps.moves_to_checkout_from_mini_cart()"
});
formatter.result({
  "duration": 20928246900,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutPageSteps.enter_personal_details_on_checkout_page()"
});
formatter.result({
  "duration": 1587756400,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutPageSteps.place_the_order()"
});
formatter.result({
  "duration": 4234033300,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cinput type\u003d\"checkbox\" class\u003d\"woocommerce-form__input woocommerce-form__input-checkbox input-checkbox\" name\u003d\"terms\" id\u003d\"terms\"\u003e is not clickable at point (652, 93). Other element would receive the click: \u003cdiv class\u003d\"blockUI blockOverlay\" style\u003d\"z-index: 1000; border: none; margin: 0px; padding: 0px; width: 100%; height: 100%; top: 0px; left: 0px; background: rgb(255, 255, 255); opacity: 0.6; cursor: default; position: absolute;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d84.0.4147.89)\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027LAPTOP-54IG476S\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.89, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\RAJNIK~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:55855}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: cb0fb18e3390e1cdcf639bd520f31194\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat pageObjects.CheckoutPage.check_TermsAndCondition(CheckoutPage.java:137)\r\n\tat StepDefinition.CheckoutPageSteps.place_the_order(CheckoutPageSteps.java:25)\r\n\tat ✽.Then place the order(C:/Users/RajniKilhore/eclipse-workspace/coneptNeerajLink/src/test/java/Features/feat.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ConfirmationPageSteps.verify_the_order_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 39300,
  "status": "passed"
});
});