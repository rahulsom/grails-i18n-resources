grails-i18n-resources
====

Serves up i18n bundle to javascript

Usage
----

1. In your plugins section of `BuildConfig.groovy` add this

```
    compile ":grails-i18n-resources:0.1"
```

2. In your `*Resources.groovy`, add dependency `i18n` to modules that need i18n.
3. In your page, you can setup a callback in which you can execute code like this

```
$.i18n.properties({
  name: 'messages',
  path: '<g:resource dir="i18n/"/>',
  mode: 'map',
  callback: function() {
    // your code here 
  },
  cache: true
});
```

Take a look at [jquery-i18n-properties](https://code.google.com/p/jquery-i18n-properties/) for more on the syntax.

Building
----

1. Checkout source
2. Package plugin

```
grails package-plugin
```