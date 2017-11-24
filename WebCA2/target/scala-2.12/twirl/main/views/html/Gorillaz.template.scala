
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

object Gorillaz extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/temp("Gorillaz")/*1.18*/ {_display_(Seq[Any](format.raw/*1.20*/("""
    
    """),format.raw/*3.5*/("""<div class="containter">
        <div class="col-sm-2"></div>
        <div id="Content" class="col-sm-5 col-centered">
            <div id="contentWellTemp" class="well well-sm">
                    <img src="/assets/images/Gorillaz.png" alt=>
                    <h3> Gorillaz </h3>
                    <h4>Performer Genre: Virtual Band</h4>
                    <p>Gorillaz are an English virtual band created in 1998 by musician Damon Albarn 
                        and artist Jamie Hewlett. The band consists of four animated members: 
                        2-D (lead vocals, keyboards), Murdoc Niccals (bass guitar), Noodle 
                        (guitar, keyboards) and Russel Hobbs (drums and percussion). These members 
                        are fictional and are not personas of any "real life" musicians involved in 
                        the project.[1] Their fictional universe is explored through the band's music 
                        videos, as well as a number of other short cartoons. In reality, Albarn is the 
                        only permanent musical contributor, and the music is often a collaboration between 
                        various musicians.
                            
                           
                    <a href="https://en.wikipedia.org/wiki/Gorillaz" >Read more...</a></p>
            </div>
        </div>
    </div>
    """)))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 15:16:00 GMT 2017
                  SOURCE: /home/wdd/fuck off/WebDev-CA2/WebCA2/app/views/Gorillaz.scala.html
                  HASH: c1c01735b21dcf55014569c1ca2bcc95337528c1
                  MATRIX: 1033->1|1057->17|1096->19|1132->29
                  LINES: 33->1|33->1|33->1|35->3
                  -- GENERATED --
              */
          