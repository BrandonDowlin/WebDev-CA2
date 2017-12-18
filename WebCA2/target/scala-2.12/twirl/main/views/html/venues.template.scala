
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

object venues extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Venues],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(venues: List[models.Venues]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
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
    <title>Venues</title>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <img src ="/assets/images/logo.png">
            </div>
            
            <ul class="nav navbar-nav"><li><a href="/"><font color="#d3d3d3"; size="3">Ticket Shark |</font></a></li>
                <li><a href="/">Home</a></li>
                <li class="active"><a href="/venues">Venues</a></li>
                <li><a href="/events">Events</a></li>
                <li><a href="/aboutus">About us</a></li>
				<li><a href="/profile">My Profile</a></li>
                
    </nav>

    <div class="container">

        
        <div class="row">
            <div class="col-sm-8">
                <div class="well main">

                    <table id="venuesTable" class="table table-bordered table-condensed">
                        
                        <thead>
                        
                        
                        <tr>
                        
                        <th>ID</th>
                        
                        <th>Name</th>
                        
                        <th>Country</th>
                        
                        <th>City</th>
                        
                        <th>Capacity</th>
                        
                        </tr>
                        
                        </thead>
                        
                        <tbody>
                        
                        """),_display_(/*63.26*/for(v<-venues) yield /*63.40*/ {_display_(Seq[Any](format.raw/*63.42*/("""
                        """),format.raw/*64.25*/("""<tr>
                        
                        <td>"""),_display_(/*66.30*/v/*66.31*/.getId),format.raw/*66.37*/("""</td>
                        
                        <td>"""),_display_(/*68.30*/v/*68.31*/.getName),format.raw/*68.39*/("""</td>
                        
                        <td>"""),_display_(/*70.30*/v/*70.31*/.getCountry),format.raw/*70.42*/("""</td>
                        
                        <td>"""),_display_(/*72.30*/v/*72.31*/.getCity),format.raw/*72.39*/("""</td>
                        
                        <td>"""),_display_(/*74.30*/v/*74.31*/.getCapacity),format.raw/*74.43*/("""</td>

                        

                        <td>
                          <a href=""""),_display_(/*79.37*/routes/*79.43*/.HomeController.updateVenue(v.getId)),format.raw/*79.79*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-pencil"></span>
                          </a>
                        </td>
                        <td>
                          <a href=""""),_display_(/*84.37*/routes/*84.43*/.HomeController.deleteVenue(v.getId)),format.raw/*84.79*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span>
                          </a>
                        </td>
                        </tr>
                      """)))}),format.raw/*89.24*/("""
                        
                        """),format.raw/*91.25*/("""</tbody>
                        
                        </table>
                        
                        <p>
                          <a href=""""),_display_(/*96.37*/routes/*96.43*/.HomeController.addVenue()),format.raw/*96.69*/("""">
                              <button class="btn btn-primary">Add a venue</button>
                          </a>
                      
                        </p>
                </div>
            </div>
        </div>
        
        <div class="footer">
            <img src="/assets/images/Concert.jpg">
            </img></div>

</body>
</html>"""))
      }
    }
  }

  def render(venues:List[models.Venues]): play.twirl.api.HtmlFormat.Appendable = apply(venues)

  def f:((List[models.Venues]) => play.twirl.api.HtmlFormat.Appendable) = (venues) => apply(venues)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 18 18:14:54 GMT 2017
                  SOURCE: /home/brandon/Web/WebDev-CA2/WebCA2/app/views/venues.scala.html
                  HASH: 31fda3f7239cff35d8267345eb98d63df609edb5
                  MATRIX: 962->1|1086->30|1113->31|3459->2353|3489->2367|3529->2369|3582->2394|3668->2453|3678->2454|3705->2460|3792->2520|3802->2521|3831->2529|3918->2589|3928->2590|3960->2601|4047->2661|4057->2662|4086->2670|4173->2730|4183->2731|4216->2743|4341->2841|4356->2847|4413->2883|4706->3149|4721->3155|4778->3191|5062->3444|5140->3494|5323->3650|5338->3656|5385->3682
                  LINES: 28->1|33->1|34->2|95->63|95->63|95->63|96->64|98->66|98->66|98->66|100->68|100->68|100->68|102->70|102->70|102->70|104->72|104->72|104->72|106->74|106->74|106->74|111->79|111->79|111->79|116->84|116->84|116->84|121->89|123->91|128->96|128->96|128->96
                  -- GENERATED --
              */
          