
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

object addEvent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Events],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(eventForm: Form[models.Events]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/temp("Add Event")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""
"""),format.raw/*6.1*/("""<p class="lead">Add or update a new event</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addEventSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.103*/ {_display_(Seq[Any](format.raw/*8.105*/("""
    
    """),_display_(/*10.6*/CSRF/*10.10*/.formField),format.raw/*10.20*/("""

    """),_display_(/*12.6*/inputText(eventForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.79*/("""
    """),_display_(/*13.6*/inputText(eventForm("venue"), '_label -> "Venue", 'class -> "form-control")),format.raw/*13.81*/("""
        """),_display_(/*14.10*/select(
            eventForm("category.id"),
            options(Category.options),
            '_label -> "Category", '_default -> "-- Choose a category --",
            '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*19.14*/("""

    """),_display_(/*21.6*/inputText(eventForm("date"), '_label -> "Date", 'class -> "form-control")),format.raw/*21.79*/("""
    """),_display_(/*22.6*/inputText(eventForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*22.81*/("""

    """),_display_(/*24.6*/inputText(eventForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*24.68*/("""

    """),format.raw/*26.5*/("""<div class="actions">

        <input type="submit" value="Add/Update Event" class="btn btn-primary">
        <a href=""""),_display_(/*29.19*/routes/*29.25*/.HomeController.events(0)),format.raw/*29.50*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>

    </div>
""")))}),format.raw/*34.2*/("""
""")))}))
      }
    }
  }

  def render(eventForm:Form[models.Events]): play.twirl.api.HtmlFormat.Appendable = apply(eventForm)

  def f:((Form[models.Events]) => play.twirl.api.HtmlFormat.Appendable) = (eventForm) => apply(eventForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Dec 14 22:04:37 GMT 2017
                  SOURCE: C:/Users/brand/Documents/stop/WebDev-CA2/WebCA2/app/views/addEvent.scala.html
                  HASH: f982cab571faa59129b4c744b2f6020836933761
                  MATRIX: 964->1|1069->38|1114->33|1144->55|1172->58|1197->75|1236->77|1264->79|1343->133|1449->230|1489->232|1528->245|1541->249|1572->259|1607->268|1701->341|1734->348|1830->423|1868->434|2132->677|2167->686|2261->759|2294->766|2390->841|2425->850|2508->912|2543->920|2693->1043|2708->1049|2754->1074|2892->1182
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|42->10|42->10|42->10|44->12|44->12|45->13|45->13|46->14|51->19|53->21|53->21|54->22|54->22|56->24|56->24|58->26|61->29|61->29|61->29|66->34
                  -- GENERATED --
              */
          