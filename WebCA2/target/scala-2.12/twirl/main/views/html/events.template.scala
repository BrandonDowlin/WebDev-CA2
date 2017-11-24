
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

object events extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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

        <!-- first row in middle section -->
        <div class="row">
            <div class="col-sm-8">
                <div class="well main">

                    <h2>Filter Table</h2>
                    <p>Search for a location in the input field.</p>

                    <input class="search" type="text" placeholder="Search by performer.." id="myInput" onkeyup="myFunction()">

                    <table class="w3-table-all w3-margin-top" id="myTable">
                        <tr>
                            <th style="width:15%;text-align:center">Type</th>
                            <th style="width:20%;text-align:center">Performer</th>
                            <th style="width:20%;text-align:center">Time</th>
                            <th style="width:20%;text-align:center">Price</th>
                            <th style="width:5%;text-align:center">Venue</th>
                        </tr>

                        <tr class="av">
                            <td>Concert</td>
                            <td>The Script</td>
                            <td>20:35</td>
                            <td>€55.50</td>

                            <td>
                                <div class="dropdown">
                                    <button class="dropbtn av">More info</button>
                                    <div class="dropdown-content">

                                        <a href="#">Country: Germany</a>
                                        <a href="#">Location: Berlin</a>
                                        <a href="#">SO36</a>
                                        <a href="#">Date: 1st January 2018</a>
                                    </div>
                                </div>

                            </td>

                        </tr>
                        <tr class="bv">
                            <td>Stand-Up</td>
                            <td>Michael McIntrye</td>
                            <td>21:00</td>
                            <td>€32.50</td>

                            <td>
                                <div class="dropdown">
                                    <button class="dropbtn av">More info</button>
                                    <div class="dropdown-content">

                                        <a href="#">Country: Sweden</a>
                                        <a href="#">Location: Stockholm</a>
                                        <a href="#">Nalen</a>
                                        <a href="#">Date: 3rd November 2018</a>
                                    </div>
                                </div>

                            </td>

                        </tr>
                        <tr>
                            <tr class="av">
                                <td>Concert</td>
                                <td>Sam Smith</td>
                                <td>18:00</td>
                                <td>€52.50</td>

                                <td>
                                    <div class="dropdown">
                                        <button class="dropbtn av">More info</button>
                                        <div class="dropdown-content">

                                            <a href="#">Country: UK</a>
                                            <a href="#">Location: London</a>
                                            <a href="#">Wembley Stadium</a>
                                            <a href="#">Date: 8th December 2017</a>
                                        </div>
                                    </div>

                                </td>

                            </tr>

                            <tr>
                                <tr class="bv">
                                    <td>Concert</td>
                                    <td>Niall Horan</td>
                                    <td>21:00</td>
                                    <td>€62.50</td>

                                    <td>
                                        <div class="dropdown">
                                            <button class="dropbtn av">More info</button>
                                            <div class="dropdown-content">

                                                <a href="#">Country: Ireland</a>
                                                <a href="#">Location: Dublin</a>
                                                <a href="#">3Arena</a>
                                                <a href="#">Date: 27th May 2018</a>
                                            </div>
                                        </div>

                                    </td>

                                </tr>
                                <tr>
                                    <tr class="av">
                                        <td>Stand-Up</td>
                                        <td>Russell-Howard</td>
                                        <td>20:30</td>
                                        <td>€35.50</td>

                                        <td>
                                            <div class="dropdown">
                                                <button class="dropbtn av">More info</button>
                                                <div class="dropdown-content">

                                                    <a href="#">Country: USA</a>
                                                    <a href="#">Location: Chicago</a>
                                                    <a href="#">The Second City</a>
                                                    <a href="#">Date: 13th March 2018</a>
                                                </div>
                                            </div>

                                        </td>

                                    </tr>
                                    <tr>
                                        <tr class="bv">
                                            <td>Musical</td>
                                            <td>Hamilton</td>
                                            <td>17:30</td>
                                            <td>€27.50</td>

                                            <td>
                                                <div class="dropdown">
                                                    <button class="dropbtn av">More info</button>
                                                    <div class="dropdown-content">

                                                        <a href="#">Country: Italy</a>
                                                        <a href="#">Location: Venice</a>
                                                        <a href="#">Chorus</a>
                                                        <a href="#">Date: 11th February 2018</a>
                                                    </div>
                                                </div>

                                            </td>

                                        </tr>
                                        <tr>
                                            <tr class="av">
                                                <td>Hypnotist</td>
                                                <td>Keith Barry</td>
                                                <td>21:00</td>
                                                <td>€40.00</td>

                                                <td>
                                                    <div class="dropdown">
                                                        <button class="dropbtn av">More info</button>
                                                        <div class="dropdown-content">

                                                            <a href="#">Country: Ireland</a>
                                                            <a href="#">Location: Dublin</a>
                                                            <a href="#">Aviva</a>
                                                            <a href="#">Date: 19th March 2018</a>
                                                        </div>
                                                    </div>

                                                </td>

                                            </tr>
                                            <tr>
                                                <tr class="bv">
                                                    <td>Science</td>
                                                    <td>Adam Savage & Michael Stevens</td>
                                                    <td>17:00</td>
                                                    <td>€25.00</td>

                                                    <td>
                                                        <div class="dropdown">
                                                            <button class="dropbtn av">More info</button>
                                                            <div class="dropdown-content">

                                                                <a href="#">Country: France</a>
                                                                <a href="#">Location: Paris</a>
                                                                <a href="#">U-Arena</a>
                                                                <a href="#">Date: 19th March 2018</a>
                                                            </div>
                                                        </div>

                                                    </td>

                                                </tr>

                    </table>
                </div>
            </div>
        </div>
        <div class="footer">
            <img src="/assets/images/Concert.jpg">
            </img></div>

</body>

<script>
    function myFunction() """),format.raw/*238.27*/("""{"""),format.raw/*238.28*/("""
        """),format.raw/*239.9*/("""var input, filter, table, tr, td, i;
        input = document.getElementById("myInput");
        filter = input.value.toUpperCase();
        table = document.getElementById("myTable");
        tr = table.getElementsByTagName("tr");
        for (i = 0; i < tr.length; i++) """),format.raw/*244.41*/("""{"""),format.raw/*244.42*/("""
            """),format.raw/*245.13*/("""td = tr[i].getElementsByTagName("td")[1];
            if (td) """),format.raw/*246.21*/("""{"""),format.raw/*246.22*/("""
                """),format.raw/*247.17*/("""if (td.innerHTML.toUpperCase().indexOf(filter) > -1) """),format.raw/*247.70*/("""{"""),format.raw/*247.71*/("""
                    """),format.raw/*248.21*/("""tr[i].style.display = "";
                """),format.raw/*249.17*/("""}"""),format.raw/*249.18*/(""" """),format.raw/*249.19*/("""else """),format.raw/*249.24*/("""{"""),format.raw/*249.25*/("""
                    """),format.raw/*250.21*/("""tr[i].style.display = "none";
                """),format.raw/*251.17*/("""}"""),format.raw/*251.18*/("""
            """),format.raw/*252.13*/("""}"""),format.raw/*252.14*/("""
        """),format.raw/*253.9*/("""}"""),format.raw/*253.10*/("""
    """),format.raw/*254.5*/("""}"""),format.raw/*254.6*/("""
"""),format.raw/*255.1*/("""</script>

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
                  SOURCE: /home/wdd/fuck you/WebDev-CA2/WebCA2/app/views/events.scala.html
                  HASH: 63b9fd6bfaa381eccd5283e8274d736feb2683a1
                  MATRIX: 1031->0|12472->11415|12502->11416|12539->11425|12840->11697|12870->11698|12912->11711|13003->11773|13033->11774|13079->11791|13161->11844|13191->11845|13241->11866|13312->11908|13342->11909|13372->11910|13406->11915|13436->11916|13486->11937|13561->11983|13591->11984|13633->11997|13663->11998|13700->12007|13730->12008|13763->12013|13792->12014|13821->12015
                  LINES: 33->1|270->238|270->238|271->239|276->244|276->244|277->245|278->246|278->246|279->247|279->247|279->247|280->248|281->249|281->249|281->249|281->249|281->249|282->250|283->251|283->251|284->252|284->252|285->253|285->253|286->254|286->254|287->255
                  -- GENERATED --
              */
          