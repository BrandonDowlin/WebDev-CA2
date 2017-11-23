
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
    <title>Profile Information</title>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <img src ="/assets/images/logo.png">
            </div>
            <ul class="nav navbar-nav">
                <li><a href="/">Home</a></li>
                <li><a href="/venues">Venues</a></li>
                <li><a href="/events">Events</a></li>
                <li><a href="/aboutus">About us</a></li>
				<li class="active"><a href="/profile">My Profile</a></li>
                <li class="dropdown">
                    <a href="events.html" class="login-a" data-toggle="dropdown"> <b>Sign in</b> <span class="caret"></span> </a>
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
    </nav>
    <div class="container">
        <div class="col-sm-8">
            <div class="well main">

                <div class="row">
                    <div class="col-sm-6">
                        <div class="well">
                            <h4>Account balance</h4>
                            <p>€0.00</p>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <div class="well">
                            <h4>Profile Information</h4>
                            <p>Name: dd</p>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="well low">
                            <h4>Last Transaction</h4>
                            <p>blah</p>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="well low">
                            <h4>Email address</h4>
                            <p> fdfdf@gmail.com</p>
                        </div>
                    </div>
                    <div class="col-sm-4">
                        <div class="well low">
                            <h4>Update profile</h4>
                            <li><a href="form.html">Click me</li>
						</div>
					</div>

                </div>
				</div>
				</div></div>
				
				<div class="footer">
                    <img src="/assets/images/concert.jpg">
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
                  DATE: Thu Nov 23 23:12:13 GMT 2017
                  SOURCE: C:/Users/brand/Documents/WebDev-CA2-master/WebCA2 Play/app/views/profile.scala.html
                  HASH: 27cae30827feaf95c9463f85aa572d2cd4e710e5
                  MATRIX: 1032->0
                  LINES: 33->1
                  -- GENERATED --
              */
          