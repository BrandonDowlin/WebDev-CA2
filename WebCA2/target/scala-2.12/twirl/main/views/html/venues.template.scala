
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
            <img src="/assets/images/concert.jpg">
            </img></div>

</body>

<script>
    function myFunction() """),format.raw/*241.27*/("""{"""),format.raw/*241.28*/("""
        """),format.raw/*242.9*/("""var input, filter, table, tr, td, i;
        input = document.getElementById("myInput");
        filter = input.value.toUpperCase();
        table = document.getElementById("myTable");
        tr = table.getElementsByTagName("tr");
        for (i = 0; i < tr.length; i++) """),format.raw/*247.41*/("""{"""),format.raw/*247.42*/("""
            """),format.raw/*248.13*/("""td = tr[i].getElementsByTagName("td")[1];
            if (td) """),format.raw/*249.21*/("""{"""),format.raw/*249.22*/("""
                """),format.raw/*250.17*/("""if (td.innerHTML.toUpperCase().indexOf(filter) > -1) """),format.raw/*250.70*/("""{"""),format.raw/*250.71*/("""
                    """),format.raw/*251.21*/("""tr[i].style.display = "";
                """),format.raw/*252.17*/("""}"""),format.raw/*252.18*/(""" """),format.raw/*252.19*/("""else """),format.raw/*252.24*/("""{"""),format.raw/*252.25*/("""
                    """),format.raw/*253.21*/("""tr[i].style.display = "none";
                """),format.raw/*254.17*/("""}"""),format.raw/*254.18*/("""
            """),format.raw/*255.13*/("""}"""),format.raw/*255.14*/("""
        """),format.raw/*256.9*/("""}"""),format.raw/*256.10*/("""
    """),format.raw/*257.5*/("""}"""),format.raw/*257.6*/("""
"""),format.raw/*258.1*/("""</script>

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
                  SOURCE: C:/Users/brand/Documents/WebDev-CA2-master/WebCA2 Play/app/views/venues.scala.html
                  HASH: 34d82de2d4c9c72d0e557ebc21c399ece532881f
                  MATRIX: 1031->0|14130->13073|14160->13074|14197->13083|14498->13355|14528->13356|14570->13369|14661->13431|14691->13432|14737->13449|14819->13502|14849->13503|14899->13524|14970->13566|15000->13567|15030->13568|15064->13573|15094->13574|15144->13595|15219->13641|15249->13642|15291->13655|15321->13656|15358->13665|15388->13666|15421->13671|15450->13672|15479->13673
                  LINES: 33->1|273->241|273->241|274->242|279->247|279->247|280->248|281->249|281->249|282->250|282->250|282->250|283->251|284->252|284->252|284->252|284->252|284->252|285->253|286->254|286->254|287->255|287->255|288->256|288->256|289->257|289->257|290->258
                  -- GENERATED --
              */
          