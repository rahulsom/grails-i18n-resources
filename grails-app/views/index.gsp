<html>
<head>
  <title>Test page</title>
  <r:require modules="i18n"/>
  <r:layoutResources/>
</head>
<body>
  <div id="demo">Dummy text</div>
  <div id="demo2">Dummy text</div>
  <div id="demo3">Dummy text</div>
  <r:script>
    $.i18n.properties({
      name: 'messages',
      path: '<g:resource dir="i18n/"/>',
      mode: 'both',
      callback: function(){
        $('#demo').html($.i18n.prop('i18n.test.hello'));
        $('#demo2').html($.i18n.prop('i18n.test.hello2', 'World'));
        $('#demo3').html($.i18n.prop.apply(null, ['i18n.test.hello3', 'World', 'everything']));
      }
    });
  </r:script>
  <r:layoutResources/>
</body>
</html>