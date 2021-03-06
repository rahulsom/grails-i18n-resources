class GrailsI18nResourcesGrailsPlugin {
  // the plugin version
  def version = "0.2"
  // the version or versions of Grails the plugin is designed for
  def grailsVersion = "2.0 > *"
  // the other plugins this plugin depends on
  def dependsOn = [:]
  // resources that are excluded from plugin packaging
  def pluginExcludes = [
      "grails-app/views/error.gsp",
      "grails-app/views/index.gsp",
      "grails-app/i18n/*"
  ]

  // TODO Fill in these fields
  def title = "Grails I18n Resources Plugin"
  // Headline display name of the plugin
  def author = "Rahul Somasunderam"
  def authorEmail = ""
  def description = '''\
Serves up i18n bundle to javascript
'''

  // URL to the plugin's documentation
  def documentation = "http://grails.org/plugin/grails-i18n-resources"

  // Extra (optional) plugin metadata

  // License: one of 'APACHE', 'GPL2', 'GPL3'
  //    def license = "APACHE"

  // Details of company behind the plugin (if there is one)
  //    def organization = [ name: "My Company", url: "http://www.my-company.com/" ]

  // Any additional developers beyond the author specified above.
  def developers = [
    [ name: "Rahul Somasunderam", email: "rahul.som@gmail.com" ],
    [ name: "Dave Klein", email: "kickingdownthecobblestones@gmail.com" ],
  ]

  // Location of the plugin's issue tracker.
  def issueManagement = [ system: "GitHub", url: "http://github.com/rahulsom/grails-i18n-resources/issues" ]

  // Online location of the plugin's browseable source code.
  def scm = [ url: "http://github.com/rahulsom/grails-i18n-resources/" ]

  def doWithWebDescriptor = { xml ->
    // TODO Implement additions to web.xml (optional), this event occurs before
  }

  def doWithSpring = {
    // TODO Implement runtime spring config (optional)
  }

  def doWithDynamicMethods = { ctx ->
    // TODO Implement registering dynamic methods to classes (optional)
  }

  def doWithApplicationContext = { applicationContext ->
    // TODO Implement post initialization spring config (optional)
  }

  def onChange = { event ->
    // TODO Implement code that is executed when any artefact that this plugin is
    // watching is modified and reloaded. The event contains: event.source,
    // event.application, event.manager, event.ctx, and event.plugin.
  }

  def onConfigChange = { event ->
    // TODO Implement code that is executed when the project configuration changes.
    // The event is the same as for 'onChange'.
  }

  def onShutdown = { event ->
    // TODO Implement code that is executed when the application shuts down (optional)
  }
}
