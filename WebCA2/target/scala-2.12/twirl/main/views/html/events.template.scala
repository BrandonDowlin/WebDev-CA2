
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

object events extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Events],List[models.Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events: List[models.Events], categories: List[models.Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.66*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
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
    <title>Events</title>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <img src ="/assets/images/logo.png">
            </div>
            <ul class="nav navbar-nav"><li><a href="/"><font color="#d3d3d3"; size="3">Ticket Shark |</font></a></li>
                <li><a href="/">Home</a></li>
                <li><a href="/venues">Venues</a></li>
                <li class="active"><a href="/events">Events</a></li>
                <li><a href="/aboutus">About us</a></li>
				<li><a href="/profile">My Profile</a></li>
                
    </nav>

    <div class="container">

        """),_display_(/*36.10*/if(flash.containsKey("success"))/*36.42*/{_display_(Seq[Any](format.raw/*36.43*/("""
            """),format.raw/*37.13*/("""<div class="alert alert-success">
              """),_display_(/*38.16*/flash/*38.21*/.get("success")),format.raw/*38.36*/("""
            """),format.raw/*39.13*/("""</div>
        """)))}),format.raw/*40.10*/("""
  
        """),format.raw/*42.9*/("""<div class="row">
            <div class="col-sm-8">
                <div class="well main">

                    

                    <table class="table table-bordered table-condensed">
                        
                        <thead>
                        
                        <!-- The header row-->
                        
                        <tr>
                        
                        <th>ID</th>
                        
                        <th>Name</th>
                      
                        <th>Category</th>
                        
                        <th>Description</th>
                        
                        <th>Stock</th>
                        
                        <th>Price</th>
                        
                        </tr>
                        
                        </thead>
                        
                        <tbody>
                        
                        <!-- Product row(s) -->
                        """),_display_(/*75.26*/for(e<-events) yield /*75.40*/ {_display_(Seq[Any](format.raw/*75.42*/("""
                        """),format.raw/*76.25*/("""<tr>
                        
                        <td>"""),_display_(/*78.30*/e/*78.31*/.getId),format.raw/*78.37*/("""</td>
                        
                        <td>"""),_display_(/*80.30*/e/*80.31*/.getName),format.raw/*80.39*/("""</td>
                      
                        <td>"""),_display_(/*82.30*/e/*82.31*/.getCategory.getName),format.raw/*82.51*/("""</td>
                        
                        <td>"""),_display_(/*84.30*/e/*84.31*/.getVenue),format.raw/*84.40*/("""</td>
                        
                        <td>"""),_display_(/*86.30*/e/*86.31*/.getDate),format.raw/*86.39*/("""</td>
                      
                        <td class="numeric">&euro; """),_display_(/*88.53*/("%.0f".format(e.getPrice))),format.raw/*88.80*/("""</td>
                      
                        <td>
                          <a href=""""),_display_(/*91.37*/routes/*91.43*/.HomeController.updateEvent(e.getId)),format.raw/*91.79*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-pencil"></span>
                          </a>
                        </td>
                      
                        <td>
                          <a href=""""),_display_(/*97.37*/routes/*97.43*/.HomeController.deleteEvent(e.getId)),format.raw/*97.79*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                          </a>
                        </td>
                        
                        </tr>
                      """)))}),format.raw/*103.24*/("""
                        
                        """),format.raw/*105.25*/("""</tbody>
                        
                        </table>
                        <p>
                            <a href=""""),_display_(/*109.39*/routes/*109.45*/.HomeController.addEvent()),format.raw/*109.71*/("""">
                                <button class="btn btn-primary">Add a event</button>
                            </a>
                </div>
            </div>
        </div>
        <div class="footer">
            <img src="/assets/images/Concert.jpg">
            </img></div>
            <script src=""""),_display_(/*118.27*/routes/*118.33*/.Assets.versioned("javascripts/main.js")),format.raw/*118.73*/(""""></script>
</body>
</html>"""))
      }
    }
  }

  def render(events:List[models.Events],categories:List[models.Category]): play.twirl.api.HtmlFormat.Appendable = apply(events,categories)

  def f:((List[models.Events],List[models.Category]) => play.twirl.api.HtmlFormat.Appendable) = (events,categories) => apply(events,categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 18 18:04:48 GMT 2017
                  SOURCE: /home/brandon/Web/WebDev-CA2/WebCA2/app/views/events.scala.html
                  HASH: a506812bc7f58cb04369c0fccaa50a3c559eaeb2
                  MATRIX: 984->1|1143->65|1170->66|2641->1513|2682->1545|2721->1546|2762->1559|2838->1608|2852->1613|2888->1628|2929->1641|2976->1657|3015->1669|4069->2696|4099->2710|4139->2712|4192->2737|4278->2796|4288->2797|4315->2803|4402->2863|4412->2864|4441->2872|4526->2930|4536->2931|4577->2951|4664->3011|4674->3012|4704->3021|4791->3081|4801->3082|4830->3090|4938->3171|4986->3198|5107->3292|5122->3298|5179->3334|5495->3623|5510->3629|5567->3665|5877->3943|5956->3993|6117->4126|6133->4132|6181->4158|6518->4467|6534->4473|6596->4513
                  LINES: 28->1|33->1|34->2|68->36|68->36|68->36|69->37|70->38|70->38|70->38|71->39|72->40|74->42|107->75|107->75|107->75|108->76|110->78|110->78|110->78|112->80|112->80|112->80|114->82|114->82|114->82|116->84|116->84|116->84|118->86|118->86|118->86|120->88|120->88|123->91|123->91|123->91|129->97|129->97|129->97|135->103|137->105|141->109|141->109|141->109|150->118|150->118|150->118
                  -- GENERATED --
              */
          