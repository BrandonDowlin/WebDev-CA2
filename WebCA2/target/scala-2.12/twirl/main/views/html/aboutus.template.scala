
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

object aboutus extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
        <link rel="stylesheet" href="/assets/stylesheets/index.css" />
        <script  type="text/javascript" src="/assets/bootstrap/js/bootstrap.js"></script>
    </head>

    <title>About Us</title>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <img src="../assets/images/logo.png">
            </div>
            <ul class="nav navbar-nav">
			
			
			<li><a href="/"><font color="#d3d3d3"; size="3">Ticket Shark |</font></a></li>
			
                <li><a href="/">Home</a></li>
                <li><a href="/venues">Venues</a></li>
                <li><a href="/events">Events</a></li>
                <li class="active"><a href="/aboutus">About us</a></li>
                <li><a href="/profile">My Profile</a></li>
			</ul>

    </nav>
	<body>
		    
 
			<div class="well mainAbout">
                  <h1> Who we are. </h1>
                  <h4>In establishing ourselves in such a competitive industry, this is something we have had to ask ourselves frequently. We are an aspiring group of musical hobbylist, businessmen and programmers. An unusual combination for most companies however the irregular team has provided us with a unique ablility to supply and understand our customer's needs all in a way that allows us to grow as a business.</h4>
                </div>
            
            
    


        <div class="well mainAbout">
                  <h1> What we do. </h1>
                  <h4>Currently we provide a service similar to many others, we sell tickets to concerts and other live events. In the future, we aim to branch out into other areas and host new types of events that will accommodate more opportunities more opportunities for people to meet their favourite celebrities. We also anticipate funding a program for sponsoring local talent and hosting new unsigned bands to smaller events.</h4>
                </div>
            
           
       
		
	
            
     
				<div class="well mainAbout">
                  <h1>Where are we?</h1>
                  <h4>Our main branch is located in Bogtown, Clonygowan, Tullamore, Co.Offally, Ireland. </h4>

                </div>

                <div class="well mainAbout">
                    <h1>Contact us</h1>
                    <h4>If you have any questions please contact us by Email: theTicketShark@gmail.com  or by phone at 0858358380</h4>
                </div>
				
				<div class="footerabout">
		<img src="assets/images/Concert.jpg">
		</img></div>
           
        
</body>
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
                  DATE: Fri Nov 24 14:05:56 GMT 2017
                  SOURCE: /home/wdd/fuck you/WebDev-CA2/WebCA2/app/views/aboutus.scala.html
                  HASH: 1ce5844b13b6ef5e8795577b73e343a2e83ba2a5
                  MATRIX: 1032->0
                  LINES: 33->1
                  -- GENERATED --
              */
          