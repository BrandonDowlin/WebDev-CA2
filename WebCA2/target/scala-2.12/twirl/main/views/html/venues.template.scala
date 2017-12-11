
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
    function myFunction() """),format.raw/*219.27*/("""{"""),format.raw/*219.28*/("""
        """),format.raw/*220.9*/("""var input, filter, table, tr, td, i;
        input = document.getElementById("myInput");
        filter = input.value.toUpperCase();
        table = document.getElementById("myTable");
        tr = table.getElementsByTagName("tr");
        for (i = 0; i < tr.length; i++) """),format.raw/*225.41*/("""{"""),format.raw/*225.42*/("""
            """),format.raw/*226.13*/("""td = tr[i].getElementsByTagName("td")[1];
            if (td) """),format.raw/*227.21*/("""{"""),format.raw/*227.22*/("""
                """),format.raw/*228.17*/("""if (td.innerHTML.toUpperCase().indexOf(filter) > -1) """),format.raw/*228.70*/("""{"""),format.raw/*228.71*/("""
                    """),format.raw/*229.21*/("""tr[i].style.display = "";
                """),format.raw/*230.17*/("""}"""),format.raw/*230.18*/(""" """),format.raw/*230.19*/("""else """),format.raw/*230.24*/("""{"""),format.raw/*230.25*/("""
                    """),format.raw/*231.21*/("""tr[i].style.display = "none";
                """),format.raw/*232.17*/("""}"""),format.raw/*232.18*/("""
            """),format.raw/*233.13*/("""}"""),format.raw/*233.14*/("""
        """),format.raw/*234.9*/("""}"""),format.raw/*234.10*/("""
    """),format.raw/*235.5*/("""}"""),format.raw/*235.6*/("""
"""),format.raw/*236.1*/("""</script>

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
                  DATE: Mon Dec 11 14:08:03 GMT 2017
                  SOURCE: /home/wdd/webapps/WebDev-CA2/WebCA2/app/views/venues.scala.html
                  HASH: a03cbd5f23be5fcf815133f3dc0f0ac0a4142510
                  MATRIX: 1031->0|12482->11425|12512->11426|12549->11435|12850->11707|12880->11708|12922->11721|13013->11783|13043->11784|13089->11801|13171->11854|13201->11855|13251->11876|13322->11918|13352->11919|13382->11920|13416->11925|13446->11926|13496->11947|13571->11993|13601->11994|13643->12007|13673->12008|13710->12017|13740->12018|13773->12023|13802->12024|13831->12025
                  LINES: 33->1|251->219|251->219|252->220|257->225|257->225|258->226|259->227|259->227|260->228|260->228|260->228|261->229|262->230|262->230|262->230|262->230|262->230|263->231|264->232|264->232|265->233|265->233|266->234|266->234|267->235|267->235|268->236
                  -- GENERATED --
              */
          