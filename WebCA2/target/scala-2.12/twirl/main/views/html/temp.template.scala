
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

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script data-require="jquery@3.0.0" data-semver="3.0.0" src="/assets/javascripts/jquery.js"></script>
    <script src="/assets/bootstrap/js/bootstrap.min.js"></script>
    <link data-require="bootstrap-css@3.3.6" data-semver="3.3.6" rel="stylesheet" href="/assets/bootstrap/css/bootstrap.css" />
    <link data-require="bootstrap@3.3.6" data-semver="3.3.6" rel="stylesheet" href="/assets/bootstrap/css/bootstrap.css" />
    <link rel="stylesheet" href="/assets/stylesheets/main.css" />
    <script  type="text/javascript" src="/assets/bootstrap/js/bootstrap.js"></script>
</head>

<body>

    <title>Venues</title>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <img src ="/assets/images/logo.png">
            </div>
            
            <ul class="nav navbar-nav"><li><a href="/"><font color="#d3d3d3"; size="3">Ticket Shark |</font></a></li>
                <li><a href="/">Home</a></li>
                <li><a href="/venues">Venues</a></li>
                <li><a href="/events">Events</a></li>
                <li><a href="/aboutus">About us</a></li>
				<li><a href="/profile">My Profile</a></li>
                
    </nav>

<container>

<div class="row">
<div class="col-md-12">
<div class="content">
"""),_display_(/*40.2*/content),format.raw/*40.9*/("""
"""),format.raw/*41.1*/("""</div>
</div>
</div>

</container>

<container>

<div class="row">
<div class="col-md-12">
</div>
</div>

</container>

<div class="footer">
    <img src="/assets/images/Concert.jpg">
    </img></div>
<script src=""""),_display_(/*59.15*/routes/*59.21*/.Assets.versioned("javascripts/main.js")),format.raw/*59.61*/(""""></script>
</body>

</html> """))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 18 19:02:45 GMT 2017
                  SOURCE: /home/brandon/Web/WebDev-CA2/WebCA2/app/views/temp.scala.html
                  HASH: e87d9e68e329d0c814d473b1dd6768131a6e95d5
                  MATRIX: 952->1|1077->31|1105->33|2551->1456|2578->1463|2606->1464|2848->1679|2863->1685|2924->1725
                  LINES: 28->1|33->1|35->3|72->40|72->40|73->41|91->59|91->59|91->59
                  -- GENERATED --
              */
          