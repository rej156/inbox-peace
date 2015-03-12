$(function () {
  var ajaxTimeout = setInterval(autorun, 300);
  function autorun() {
    if ($("#loading").is(":visible") == false){
      if(ajaxTimeout) {
        clearInterval(ajaxTimeout);
        ajaxTimeout = false;
      }
      $(".aki.pp").append("<div id='zen'></div>");
      inbox_peace.content.init();
    }
  }
});
