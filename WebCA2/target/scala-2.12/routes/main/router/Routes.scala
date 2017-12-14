
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Documents/stop/WebDev-CA2/WebCA2/conf/routes
// @DATE:Thu Dec 14 22:04:37 GMT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:25
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:25
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """events""", """controllers.HomeController.events(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """venues""", """controllers.HomeController.venues"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aboutus""", """controllers.HomeController.aboutus"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.HomeController.profile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """form""", """controllers.HomeController.form"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """danny-brown""", """controllers.HomeController.Danny"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gorillaz""", """controllers.HomeController.Gorillaz"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jeff-dunham""", """controllers.HomeController.Jeff"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kanye-west""", """controllers.HomeController.Kanye"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """keith-barry""", """controllers.HomeController.Keith"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """michael-mcintyre""", """controllers.HomeController.Michael"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addevent""", """controllers.HomeController.addEvent"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEventSubmit""", """controllers.HomeController.addEventSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteEvent/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteEvent(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEvent/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateEvent(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_events1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("events")))
  )
  private[this] lazy val controllers_HomeController_events1_invoker = createInvoker(
    HomeController_0.events(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "events",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """events""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_venues2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("venues")))
  )
  private[this] lazy val controllers_HomeController_venues2_invoker = createInvoker(
    HomeController_0.venues,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "venues",
      Nil,
      "GET",
      this.prefix + """venues""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_aboutus3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aboutus")))
  )
  private[this] lazy val controllers_HomeController_aboutus3_invoker = createInvoker(
    HomeController_0.aboutus,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "aboutus",
      Nil,
      "GET",
      this.prefix + """aboutus""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_profile4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_HomeController_profile4_invoker = createInvoker(
    HomeController_0.profile,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "profile",
      Nil,
      "GET",
      this.prefix + """profile""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_form5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("form")))
  )
  private[this] lazy val controllers_HomeController_form5_invoker = createInvoker(
    HomeController_0.form,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "form",
      Nil,
      "GET",
      this.prefix + """form""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_Danny6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("danny-brown")))
  )
  private[this] lazy val controllers_HomeController_Danny6_invoker = createInvoker(
    HomeController_0.Danny,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Danny",
      Nil,
      "GET",
      this.prefix + """danny-brown""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_Gorillaz7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gorillaz")))
  )
  private[this] lazy val controllers_HomeController_Gorillaz7_invoker = createInvoker(
    HomeController_0.Gorillaz,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Gorillaz",
      Nil,
      "GET",
      this.prefix + """gorillaz""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_Jeff8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jeff-dunham")))
  )
  private[this] lazy val controllers_HomeController_Jeff8_invoker = createInvoker(
    HomeController_0.Jeff,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Jeff",
      Nil,
      "GET",
      this.prefix + """jeff-dunham""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_Kanye9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kanye-west")))
  )
  private[this] lazy val controllers_HomeController_Kanye9_invoker = createInvoker(
    HomeController_0.Kanye,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Kanye",
      Nil,
      "GET",
      this.prefix + """kanye-west""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_Keith10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("keith-barry")))
  )
  private[this] lazy val controllers_HomeController_Keith10_invoker = createInvoker(
    HomeController_0.Keith,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Keith",
      Nil,
      "GET",
      this.prefix + """keith-barry""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_Michael11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("michael-mcintyre")))
  )
  private[this] lazy val controllers_HomeController_Michael11_invoker = createInvoker(
    HomeController_0.Michael,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Michael",
      Nil,
      "GET",
      this.prefix + """michael-mcintyre""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_addEvent12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addevent")))
  )
  private[this] lazy val controllers_HomeController_addEvent12_invoker = createInvoker(
    HomeController_0.addEvent,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEvent",
      Nil,
      "GET",
      this.prefix + """addevent""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_addEventSubmit13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEventSubmit")))
  )
  private[this] lazy val controllers_HomeController_addEventSubmit13_invoker = createInvoker(
    HomeController_0.addEventSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addEventSubmit",
      Nil,
      "POST",
      this.prefix + """addEventSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_deleteEvent14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteEvent/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteEvent14_invoker = createInvoker(
    HomeController_0.deleteEvent(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteEvent",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteEvent/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_updateEvent15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEvent/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateEvent15_invoker = createInvoker(
    HomeController_0.updateEvent(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateEvent",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateEvent/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Assets_versioned16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned16_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_events1_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_events1_invoker.call(HomeController_0.events(cat))
      }
  
    // @LINE:8
    case controllers_HomeController_venues2_route(params@_) =>
      call { 
        controllers_HomeController_venues2_invoker.call(HomeController_0.venues)
      }
  
    // @LINE:9
    case controllers_HomeController_aboutus3_route(params@_) =>
      call { 
        controllers_HomeController_aboutus3_invoker.call(HomeController_0.aboutus)
      }
  
    // @LINE:10
    case controllers_HomeController_profile4_route(params@_) =>
      call { 
        controllers_HomeController_profile4_invoker.call(HomeController_0.profile)
      }
  
    // @LINE:11
    case controllers_HomeController_form5_route(params@_) =>
      call { 
        controllers_HomeController_form5_invoker.call(HomeController_0.form)
      }
  
    // @LINE:12
    case controllers_HomeController_Danny6_route(params@_) =>
      call { 
        controllers_HomeController_Danny6_invoker.call(HomeController_0.Danny)
      }
  
    // @LINE:13
    case controllers_HomeController_Gorillaz7_route(params@_) =>
      call { 
        controllers_HomeController_Gorillaz7_invoker.call(HomeController_0.Gorillaz)
      }
  
    // @LINE:14
    case controllers_HomeController_Jeff8_route(params@_) =>
      call { 
        controllers_HomeController_Jeff8_invoker.call(HomeController_0.Jeff)
      }
  
    // @LINE:15
    case controllers_HomeController_Kanye9_route(params@_) =>
      call { 
        controllers_HomeController_Kanye9_invoker.call(HomeController_0.Kanye)
      }
  
    // @LINE:16
    case controllers_HomeController_Keith10_route(params@_) =>
      call { 
        controllers_HomeController_Keith10_invoker.call(HomeController_0.Keith)
      }
  
    // @LINE:17
    case controllers_HomeController_Michael11_route(params@_) =>
      call { 
        controllers_HomeController_Michael11_invoker.call(HomeController_0.Michael)
      }
  
    // @LINE:19
    case controllers_HomeController_addEvent12_route(params@_) =>
      call { 
        controllers_HomeController_addEvent12_invoker.call(HomeController_0.addEvent)
      }
  
    // @LINE:20
    case controllers_HomeController_addEventSubmit13_route(params@_) =>
      call { 
        controllers_HomeController_addEventSubmit13_invoker.call(HomeController_0.addEventSubmit)
      }
  
    // @LINE:21
    case controllers_HomeController_deleteEvent14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteEvent14_invoker.call(HomeController_0.deleteEvent(id))
      }
  
    // @LINE:22
    case controllers_HomeController_updateEvent15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateEvent15_invoker.call(HomeController_0.updateEvent(id))
      }
  
    // @LINE:25
    case controllers_Assets_versioned16_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned16_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
