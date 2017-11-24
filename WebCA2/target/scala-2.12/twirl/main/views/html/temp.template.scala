
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object temp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script data-require="jquery@3.0.0" data-semver="3.0.0" src="/assets/javascripts/jquery.js"></script>
        <script src="/assets/bootstrap/js/bootstrap.min.js"></script>
        <link data-require="bootstrap-css@3.3.6" data-semver="3.3.6" rel="stylesheet" href="/assets/bootstrap/css/bootstrap.css" />
        <link data-require="bootstrap@3.3.6" data-semver="3.3.6" rel="stylesheet" href="/assets/bootstrap/css/bootstrap.css" />
        <link rel="stylesheet" href="/assets/stylesheets/index.css" />
        <script  type="text/javascript" src="/assets/bootstrap/js/bootstrap.js"></script>
    </head>
    <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <img src ="/assets/images/logo.png">
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="/">Home</a></li>
                    <li><a href="/venues">Venues</a></li>
                    <li><a href="/events">Events</a></li>
                    <li><a href="/aboutus">About us</a></li>
                    <li><a href="/profile">My Profile</a></li>
                    
                    <li class="dropdown">
              <a href="/events" class="login-a" data-toggle="dropdown"> <b>Sign in</b> <span class="caret"></span> </a>
                <ul id="login" class="dropdown-menu">
                    <li>
                         <div class="row">
                                <div class="col-md-12">
                        
                                    <p></p>
                                    
                                     <form class="form" role="form" method="post" action="login" accept-charset="UTF-8" id="login-nav">
                                            <div class="form-group">
                                                 <label class="email">Email address</label>
                                                 <input type="email" class="form-control" placeholder="Email address" required>
                                            </div>
                                            <div class="form-group">
                                                 <label class="password">Password</label>
                                                 <input type="password" class="form-control" placeholder="Password" required>
                                            <p></p>
                                            <div class="form-group">
                                                 <button type="submit" class="btn btn-primary btn-block">Sign in</button>
                                            </div>
                                            
                
                </ul>
                </li>
    
                </ul>
            </div>
        </nav>
    <body>
        """),_display_(/*64.10*/content),format.raw/*64.17*/("""

        
    """),format.raw/*67.5*/("""</body>
    <div class="footerTemp">
		<img src="/assets/images/Concert.jpg">
		</img></div>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 11:51:23 GMT 2017
                  SOURCE: /home/wdd/fuck off/WebDev-CA2/WebCA2/app/views/temp.scala.html
                  HASH: 50e825d61b7d8ee95e2c1845ca0255cb8d84d278
                  MATRIX: 1206->260|1331->290|1359->292|1439->397|1475->406|1510->414|1536->419|4526->3385|4554->3392|4596->3407
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|95->64|95->64|98->67
                  -- GENERATED --
              */
          