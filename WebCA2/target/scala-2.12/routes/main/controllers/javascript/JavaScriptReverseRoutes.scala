
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/brandon/Web/WebDev-CA2/WebCA2/conf/routes
// @DATE:Mon Dec 18 17:42:00 GMT 2017

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

  
    // @LINE:25
    def addVenueSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addVenueSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addVenueSubmit"})
        }
      """
    )
  
    // @LINE:21
    def deleteEvent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteEvent",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteEvent/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:13
    def Gorillaz: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Gorillaz",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gorillaz"})
        }
      """
    )
  
    // @LINE:22
    def updateEvent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateEvent",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateEvent/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:19
    def addEvent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addEvent",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addevent"})
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
  
    // @LINE:24
    def addVenue: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addVenue",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addvenue"})
        }
      """
    )
  
    // @LINE:7
    def events: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.events",
      """
        function(cat0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events" + _qS([(cat0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0))])})
        }
      """
    )
  
    // @LINE:27
    def updateVenue: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateVenue",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateVenue/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:20
    def addEventSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addEventSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addEventSubmit"})
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
  
    // @LINE:26
    def deleteVenue: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteVenue",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteVenue/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
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

  // @LINE:30
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
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
