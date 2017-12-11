
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
"""),format.raw/*2.1*/("""<html>

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

  
        <div class="row">
            <div class="col-sm-8">
                <div class="well main">

                    <table class="table table-hover table-condensed">
                        <thead>
                        <!-- The header row-->
                        <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Category</th>
                        <th>Venue</th>
                        <th>Date</th>
                        <th>Price</th>
                        </tr>
                        </thead>
                        <tbody>
                        
                        <!-- Product row(s) -->
                        """),_display_(/*53.26*/for(e<-events) yield /*53.40*/ {_display_(Seq[Any](format.raw/*53.42*/("""
                        """),format.raw/*54.25*/("""<tr>
                        <td>"""),_display_(/*55.30*/e/*55.31*/.getId),format.raw/*55.37*/("""</td>
                        <td>"""),_display_(/*56.30*/e/*56.31*/.getName),format.raw/*56.39*/("""</td>
                        <td>"""),_display_(/*57.30*/e/*57.31*/.getCategory.getName),format.raw/*57.51*/("""</td>
                        <td>"""),_display_(/*58.30*/e/*58.31*/.getVenue),format.raw/*58.40*/("""</td>
                        <td>"""),_display_(/*59.30*/e/*59.31*/.getDate),format.raw/*59.39*/("""</td>
                        <td class="numeric">&euro; """),_display_(/*60.53*/("%.2f".format(e.getPrice))),format.raw/*60.80*/("""</td>
                        </tr>
                      """)))}),format.raw/*62.24*/("""
                        """),format.raw/*63.25*/("""</tbody> 
                        </table>
                </div>
            </div>
        </div>
        <div class="footer">
            <img src="/assets/images/Concert.jpg">
            </img></div>

</body>

<!-- <script>
    function myFunction() """),format.raw/*75.27*/("""{"""),format.raw/*75.28*/("""
        """),format.raw/*76.9*/("""var input, filter, table, tr, td, i;
        input = document.getElementById("myInput");
        filter = input.value.toUpperCase();
        table = document.getElementById("myTable");
        tr = table.getElementsByTagName("tr");
        for (i = 0; i < tr.length; i++) """),format.raw/*81.41*/("""{"""),format.raw/*81.42*/("""
            """),format.raw/*82.13*/("""td = tr[i].getElementsByTagName("td")[1];
            if (td) """),format.raw/*83.21*/("""{"""),format.raw/*83.22*/("""
                """),format.raw/*84.17*/("""if (td.innerHTML.toUpperCase().indexOf(filter) > -1) """),format.raw/*84.70*/("""{"""),format.raw/*84.71*/("""
                    """),format.raw/*85.21*/("""tr[i].style.display = "";
                """),format.raw/*86.17*/("""}"""),format.raw/*86.18*/(""" """),format.raw/*86.19*/("""else """),format.raw/*86.24*/("""{"""),format.raw/*86.25*/("""
                    """),format.raw/*87.21*/("""tr[i].style.display = "none";
                """),format.raw/*88.17*/("""}"""),format.raw/*88.18*/("""
            """),format.raw/*89.13*/("""}"""),format.raw/*89.14*/("""
        """),format.raw/*90.9*/("""}"""),format.raw/*90.10*/("""
    """),format.raw/*91.5*/("""}"""),format.raw/*91.6*/("""
"""),format.raw/*92.1*/("""</script> -->

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
                  DATE: Mon Dec 11 14:58:58 GMT 2017
                  SOURCE: /home/wdd/webapps/WebDev-CA2/WebCA2/app/views/events.scala.html
                  HASH: eb5e99cc08e31b5d4c1103f211093c6fbcd1e0d7
                  MATRIX: 984->1|1143->65|1170->66|3318->2190|3348->2204|3388->2206|3441->2231|3502->2265|3512->2266|3539->2272|3601->2307|3611->2308|3640->2316|3702->2351|3712->2352|3753->2372|3815->2407|3825->2408|3855->2417|3917->2452|3927->2453|3956->2461|4041->2519|4089->2546|4179->2605|4232->2630|4515->2885|4544->2886|4580->2895|4880->3167|4909->3168|4950->3181|5040->3243|5069->3244|5114->3261|5195->3314|5224->3315|5273->3336|5343->3378|5372->3379|5401->3380|5434->3385|5463->3386|5512->3407|5586->3453|5615->3454|5656->3467|5685->3468|5721->3477|5750->3478|5782->3483|5810->3484|5838->3485
                  LINES: 28->1|33->1|34->2|85->53|85->53|85->53|86->54|87->55|87->55|87->55|88->56|88->56|88->56|89->57|89->57|89->57|90->58|90->58|90->58|91->59|91->59|91->59|92->60|92->60|94->62|95->63|107->75|107->75|108->76|113->81|113->81|114->82|115->83|115->83|116->84|116->84|116->84|117->85|118->86|118->86|118->86|118->86|118->86|119->87|120->88|120->88|121->89|121->89|122->90|122->90|123->91|123->91|124->92
                  -- GENERATED --
              */
          