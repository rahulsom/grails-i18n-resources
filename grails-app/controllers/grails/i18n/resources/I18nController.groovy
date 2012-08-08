package grails.i18n.resources

import javax.servlet.ServletContext

class I18nController {

  def index() {
    log.fatal params.id

    def f = new File("grails-app/i18n/${params.id}")
    InputStream stream = null
    if (f.exists()) {
      stream = new FileInputStream("grails-app/i18n/${params.id}")
    } else {
      ServletContext sc = grailsApplication.parentContext.servletContext
      def res = sc.getResource("/WEB-INF/grails-app/i18n/${params.id}")
      if (res) {
        stream = sc.getResourceAsStream("/WEB-INF/grails-app/i18n/${params.id}")
      }
    }
    if (stream) {
      log.fatal "Streaming"
      render stream.text
    } else {
      log.fatal "Not found"
      response.sendError(404)
    }
  }
}
