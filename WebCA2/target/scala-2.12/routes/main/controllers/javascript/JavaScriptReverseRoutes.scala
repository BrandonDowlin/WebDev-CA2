
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/fuck you/WebDev-CA2/WebCA2/conf/routes
// @DATE:Fri Nov 24 13:17:51 GMT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def Gorillaz: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Gorillaz",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gorillaz"})
        }
      """
    )
  
    // @LINE:15
    def Kanye: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Kanye",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kanye-west"})
        }
      """
    )
  
    // @LINE:10
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:8
    def venues: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.venues",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "venues"})
        }
      """
    )
  
    // @LINE:14
    def Jeff: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Jeff",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jeff-dunham"})
        }
      """
    )
  
    // @LINE:17
    def Michael: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Michael",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "michael-mcintyre"})
        }
      """
    )
  
    // @LINE:11
    def form: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.form",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "form"})
        }
      """
    )
  
    // @LINE:12
    def Danny: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Danny",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "danny-brown"})
        }
      """
    )
  
    // @LINE:7
    def events: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.events",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events"})
        }
      """
    )
  
    // @LINE:9
    def aboutus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.aboutus",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:16
    def Keith: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Keith",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "keith-barry"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
