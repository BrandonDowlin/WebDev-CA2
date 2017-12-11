
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/WebDev-CA2/WebCA2/conf/routes
// @DATE:Mon Dec 11 14:32:54 GMT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def Gorillaz(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "gorillaz")
    }
  
    // @LINE:15
    def Kanye(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kanye-west")
    }
  
    // @LINE:10
    def profile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:8
    def venues(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "venues")
    }
  
    // @LINE:14
    def Jeff(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "jeff-dunham")
    }
  
    // @LINE:17
    def Michael(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "michael-mcintyre")
    }
  
    // @LINE:11
    def form(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "form")
    }
  
    // @LINE:12
    def Danny(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "danny-brown")
    }
  
    // @LINE:7
    def events(cat:Long = 0L): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "events" + play.core.routing.queryString(List(if(cat == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)))))
    }
  
    // @LINE:9
    def aboutus(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "aboutus")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:16
    def Keith(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "keith-barry")
    }
  
  }

  // @LINE:20
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
