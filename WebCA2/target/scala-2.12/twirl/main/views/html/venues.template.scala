
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

object venues extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <title>Venues</title>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <img src ="/assets/images/logo.png">
            </div>
            <ul class="nav navbar-nav">
                <li><a href="/">Home</a></li>
                <li class="active"><a href="/venues">Venues</a></li>
                <li><a href="/events">Events</a></li>
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

                    <input class="search" type="text" placeholder="Search by city.." id="myInput" onkeyup="myFunction()">

                    <table class="w3-table-all w3-margin-top" id="myTable">
                        <tr>
                            <th style="width:15%;text-align:center">Country</th>
                            <th style="width:20%;text-align:center">City</th>
                            <th style="width:20%;text-align:center">Venues</th>
                            <th style="width:20%;text-align:center">Date</th>
                            <th style="width:5%;text-align:center">Event</th>
                        </tr>

                        <tr class="av">

                            <td>Germany</td>
                            <td>Berlin</td>
                            <td>SO36</td>
                            <td>1st January 2018</td>
                            <td>
                                <div class="dropdown">
                                    <button class="dropbtn av">More info</button>
                                    <div class="dropdown-content">
                                        <a href="#">Type: Concert</a>
                                        <a href="#">Artist: The Script</a>
                                        <a href="#">Time: 20:35</a>
                                        <a href="#">Price: €55.50</a>
                                    </div>
                                </div>

                            </td>

                        </tr>
                        <tr class="bv">

                            <td>Sweden</td>
                            <td>Stockholm</td>
                            <td>Nalen</td>
                            <td>3rd November 2018</td>
                            <td>
                                <div class="dropdown">
                                    <button class="dropbtn bv">More info</button>
                                    <div class="dropdown-content">
                                        <a href="#">Type: Stand-Up</a>
                                        <a href="#">Comedian: Michael McIntyre</a>
                                        <a href="#">Time: 21:00</a>
                                        <a href="#">Price: €32.50</a>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <tr class="av">

                                <td>UK</td>
                                <td>London</td>
                                <td>Wembley Stadium</td>
                                <td>8th December 2017</td>
                                <td>
                                    <div class="dropdown">
                                        <button class="dropbtn bv">More info</button>
                                        <div class="dropdown-content">
                                            <a href="#">Type: Concert</a>
                                            <a href="#">Artist: Sam Smith</a>
                                            <a href="#">Time: 18:00</a>
                                            <a href="#">Price: €52.50</a>
                                        </div>
                                    </div>
                                </td>
                            </tr>

                            <tr>
                                <tr class="bv">

                                    <td>Ireland</td>
                                    <td>Dublin</td>
                                    <td>3Arena</td>
                                    <td>27th May 2018</td>
                                    <td>
                                        <div class="dropdown">
                                            <button class="dropbtn bv">More info</button>
                                            <div class="dropdown-content">
                                                <a href="#">Type: Concert</a>
                                                <a href="#">Artist: Niall Horan</a>
                                                <a href="#">Time: 21:00</a>
                                                <a href="#">Price: €62.50</a>
                                            </div>
                                        </div>
                                    </td>
                                </tr>
                                <tr>
                                    <tr class="av">

                                        <td>USA</td>
                                        <td>Chicago</td>
                                        <td>The Second City</td>
                                        <td>13th March 2018</td>
                                        <td>
                                            <div class="dropdown">
                                                <button class="dropbtn bv">More info</button>
                                                <div class="dropdown-content">
                                                    <a href="#">Type: Stand-Up</a>
                                                    <a href="#">Comedian: Russel Howard</a>
                                                    <a href="#">Time: 20:30</a>
                                                    <a href="#">Price: €35.50</a>
                                                </div>
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <tr class="bv">

                                            <td>Italy</td>
                                            <td>Venice</td>
                                            <td>Chorus</td>
                                            <td>11th February 2018</td>
                                            <td>
                                                <div class="dropdown">
                                                    <button class="dropbtn bv">More info</button>
                                                    <div class="dropdown-content">
                                                        <a href="#">Type: Musical</a>
                                                        <a href="#">Show: Hamilton</a>
                                                        <a href="#">Time: 17:30</a>
                                                        <a href="#">Price: €27.50</a>
                                                    </div>
                                                </div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <tr class="av">

                                                <td>Ireland</td>
                                                <td>Dublin</td>
                                                <td>Aviva</td>
                                                <td>1st December 2018</td>
                                                <td>
                                                    <div class="dropdown">
                                                        <button class="dropbtn bv">More info</button>
                                                        <div class="dropdown-content">
                                                            <a href="#">Type: Hypnotist</a>
                                                            <a href="#">Artist: Keith Barry</a>
                                                            <a href="#">Time: 21:00</a>
                                                            <a href="#">Price: €40.00</a>
                                                        </div>
                                                    </div>
                                                </td>
                                            </tr>
                                            <tr>
                                                <tr class="bv">

                                                    <td>France</td>
                                                    <td>Paris</td>
                                                    <td>U-Arena</td>
                                                    <td>19th March 2018</td>
                                                    <td>
                                                        <div class="dropdown">
                                                            <button class="dropbtn bv">More info</button>
                                                            <div class="dropdown-content">
                                                                <a href="#">Type: Science</a>
                                                                <a href="#">Starring: Adam Savage & Michael Stevens</a>
                                                                <a href="#">Time: 17:00</a>
                                                                <a href="#">Price: €25.00</a>
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
    function myFunction() """),format.raw/*217.27*/("""{"""),format.raw/*217.28*/("""
        """),format.raw/*218.9*/("""var input, filter, table, tr, td, i;
        input = document.getElementById("myInput");
        filter = input.value.toUpperCase();
        table = document.getElementById("myTable");
        tr = table.getElementsByTagName("tr");
        for (i = 0; i < tr.length; i++) """),format.raw/*223.41*/("""{"""),format.raw/*223.42*/("""
            """),format.raw/*224.13*/("""td = tr[i].getElementsByTagName("td")[1];
            if (td) """),format.raw/*225.21*/("""{"""),format.raw/*225.22*/("""
                """),format.raw/*226.17*/("""if (td.innerHTML.toUpperCase().indexOf(filter) > -1) """),format.raw/*226.70*/("""{"""),format.raw/*226.71*/("""
                    """),format.raw/*227.21*/("""tr[i].style.display = "";
                """),format.raw/*228.17*/("""}"""),format.raw/*228.18*/(""" """),format.raw/*228.19*/("""else """),format.raw/*228.24*/("""{"""),format.raw/*228.25*/("""
                    """),format.raw/*229.21*/("""tr[i].style.display = "none";
                """),format.raw/*230.17*/("""}"""),format.raw/*230.18*/("""
            """),format.raw/*231.13*/("""}"""),format.raw/*231.14*/("""
        """),format.raw/*232.9*/("""}"""),format.raw/*232.10*/("""
    """),format.raw/*233.5*/("""}"""),format.raw/*233.6*/("""
"""),format.raw/*234.1*/("""</script>

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
                  DATE: Fri Nov 24 10:14:49 GMT 2017
                  SOURCE: /home/wdd/fuck off/WebDev-CA2/WebCA2/app/views/venues.scala.html
                  HASH: 46fe04465cea1364f8b366a62dd1c2f4a879a031
                  MATRIX: 1031->0|12396->11339|12426->11340|12463->11349|12764->11621|12794->11622|12836->11635|12927->11697|12957->11698|13003->11715|13085->11768|13115->11769|13165->11790|13236->11832|13266->11833|13296->11834|13330->11839|13360->11840|13410->11861|13485->11907|13515->11908|13557->11921|13587->11922|13624->11931|13654->11932|13687->11937|13716->11938|13745->11939
                  LINES: 33->1|249->217|249->217|250->218|255->223|255->223|256->224|257->225|257->225|258->226|258->226|258->226|259->227|260->228|260->228|260->228|260->228|260->228|261->229|262->230|262->230|263->231|263->231|264->232|264->232|265->233|265->233|266->234
                  -- GENERATED --
              */
          