
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>

    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script data-require="jquery@3.0.0" data-semver="3.0.0" src="/assets/javascripts/jquery.js"></script>
        <script src="/assets/bootstrap/js/bootstrap.min.js"></script>
        <link data-require="bootstrap-css@3.3.6" data-semver="3.3.6" rel="stylesheet" href="/assets/bootstrap/css/bootstrap.css" />
        <link data-require="bootstrap@3.3.6" data-semver="3.3.6" rel="stylesheet" href="/assets/bootstrap/css/bootstrap.css" />
        <link rel="stylesheet" href="/assets/stylesheets/style.css" />
        <script  type="text/javascript" src="/assets/bootstrap/js/bootstrap.js"></script>
    </head>
<body>
    <!--Ronan did this page-->
    <title>Profile Information</title>
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
				<li class="active"><a href="/profile">My Profile</a></li>
                
    </nav>
    <div class="container">
        <div class="col-sm-8">
            <div class="well main1">

                <div class="row">
                    <div class="col-sm-6">
                        <div class="wellprofile">
                            <h4>Account balance</h4>
                            <p>€0.00</p>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="wellprofile">
                            <h4>Profile Information</h4>
                            <p>Name: dd</p>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="wellprofilelow">
                            <h4>Last Transaction</h4>
                            <p>blah</p>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="wellprofilelow">
                            <h4>Email address</h4>
                            <p> fdfdf@gmail.com</p>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="wellprofilelow">
                            <h4>Update profile</h4>
                            <li><a href="/form">Click me</li>
						</div>
					</div>

                </div>
				</div>
				</div></div>
				
				<div class="footerprofile">
                    <img src="/assets/images/Concert.jpg">
                    </img></div>
				
	 
</body>
    </div>



</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 14 22:04:37 GMT 2017
                  SOURCE: C:/Users/brand/Documents/stop/WebDev-CA2/WebCA2/app/views/profile.scala.html
                  HASH: 85536231444816c82a17fde2ad0fcf667e5d420f
                  MATRIX: 1032->0
                  LINES: 33->1
                  -- GENERATED --
              */
          