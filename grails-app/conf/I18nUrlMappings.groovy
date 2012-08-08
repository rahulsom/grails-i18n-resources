class I18nUrlMappings {

  static mappings = {
    "/i18n/$id" {
      controller = 'i18n'
      action = 'index'
      constraints {
        // apply constraints here
      }
    }
  }
}
