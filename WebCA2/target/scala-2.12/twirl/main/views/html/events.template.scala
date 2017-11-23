
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
            <ul class="nav navbar-nav">
                <li><a href="/">Home</a></li>
                <li><a href="/venues">Venues</a></li>
                <li class="active"><a href="/events">Events</a></li>
                <li><a href="/aboutus">About us</a></li>
				<li><a href="/profile">My Profile</a></li>
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
            <img src="/assets/images/concert.jpg">
            </img></div>

</body>

<script>
    function myFunction() """),format.raw/*262.27*/("""{"""),format.raw/*262.28*/("""
        """),format.raw/*263.9*/("""var input, filter, table, tr, td, i;
        input = document.getElementById("myInput");
        filter = input.value.toUpperCase();
        table = document.getElementById("myTable");
        tr = table.getElementsByTagName("tr");
        for (i = 0; i < tr.length; i++) """),format.raw/*268.41*/("""{"""),format.raw/*268.42*/("""
            """),format.raw/*269.13*/("""td = tr[i].getElementsByTagName("td")[1];
            if (td) """),format.raw/*270.21*/("""{"""),format.raw/*270.22*/("""
                """),format.raw/*271.17*/("""if (td.innerHTML.toUpperCase().indexOf(filter) > -1) """),format.raw/*271.70*/("""{"""),format.raw/*271.71*/("""
                    """),format.raw/*272.21*/("""tr[i].style.display = "";
                """),format.raw/*273.17*/("""}"""),format.raw/*273.18*/(""" """),format.raw/*273.19*/("""else """),format.raw/*273.24*/("""{"""),format.raw/*273.25*/("""
                    """),format.raw/*274.21*/("""tr[i].style.display = "none";
                """),format.raw/*275.17*/("""}"""),format.raw/*275.18*/("""
            """),format.raw/*276.13*/("""}"""),format.raw/*276.14*/("""
        """),format.raw/*277.9*/("""}"""),format.raw/*277.10*/("""
    """),format.raw/*278.5*/("""}"""),format.raw/*278.6*/("""
"""),format.raw/*279.1*/("""</script>

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
                  SOURCE: C:/Users/brand/Documents/WebDev-CA2-master/WebCA2 Play/app/views/events.scala.html
                  HASH: 4a53d82422da6b8b1d69bb12a4e059d7c7d24ac4
                  MATRIX: 1031->0|14128->13071|14158->13072|14195->13081|14496->13353|14526->13354|14568->13367|14659->13429|14689->13430|14735->13447|14817->13500|14847->13501|14897->13522|14968->13564|14998->13565|15028->13566|15062->13571|15092->13572|15142->13593|15217->13639|15247->13640|15289->13653|15319->13654|15356->13663|15386->13664|15419->13669|15448->13670|15477->13671
                  LINES: 33->1|294->262|294->262|295->263|300->268|300->268|301->269|302->270|302->270|303->271|303->271|303->271|304->272|305->273|305->273|305->273|305->273|305->273|306->274|307->275|307->275|308->276|308->276|309->277|309->277|310->278|310->278|311->279
                  -- GENERATED --
              */
          