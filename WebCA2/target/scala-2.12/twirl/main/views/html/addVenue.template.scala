
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

object addVenue extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Venues],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(venueForm: Form[models.Venues]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/temp("Add Venue")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""
"""),format.raw/*6.1*/("""<p class="lead">Add or update a new venue</p>

    """),_display_(/*8.6*/form(action=routes.HomeController.addVenueSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.103*/ {_display_(Seq[Any](format.raw/*8.105*/("""
    
    """),_display_(/*10.6*/CSRF/*10.10*/.formField),format.raw/*10.20*/("""

    """),_display_(/*12.6*/inputText(venueForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.79*/("""
    """),_display_(/*13.6*/inputText(venueForm("country"), '_label -> "Country", 'class -> "form-control")),format.raw/*13.85*/("""
    """),_display_(/*14.6*/inputText(venueForm("city"), '_label -> "City", 'class -> "form-control")),format.raw/*14.79*/("""
    """),_display_(/*15.6*/inputText(venueForm("capacity"), '_label -> "Capacity", 'class -> "form-control")),format.raw/*15.87*/("""

    """),_display_(/*17.6*/inputText(venueForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*17.68*/("""

    """),format.raw/*19.5*/("""<div class="actions">

        <input type="submit" value="Add/Update Venue" class="btn btn-primary">
        <a href=""""),_display_(/*22.19*/routes/*22.25*/.HomeController.venues),format.raw/*22.47*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>

    </div>
""")))}),format.raw/*27.2*/("""
""")))}))
      }
    }
  }

  def render(venueForm:Form[models.Venues]): play.twirl.api.HtmlFormat.Appendable = apply(venueForm)

  def f:((Form[models.Venues]) => play.twirl.api.HtmlFormat.Appendable) = (venueForm) => apply(venueForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 18 17:42:00 GMT 2017
                  SOURCE: /home/brandon/Web/WebDev-CA2/WebCA2/app/views/addVenue.scala.html
                  HASH: 66e3ec735966b3877ecdd92f135292c14ab09d03
                  MATRIX: 964->1|1069->36|1114->33|1142->52|1169->54|1194->71|1233->73|1260->74|1337->126|1443->223|1483->225|1520->236|1533->240|1564->250|1597->257|1691->330|1723->336|1823->415|1855->421|1949->494|1981->500|2083->581|2116->588|2199->650|2232->656|2379->776|2394->782|2437->804|2570->907
                  LINES: 28->1|31->3|34->1|36->4|37->5|37->5|37->5|38->6|40->8|40->8|40->8|42->10|42->10|42->10|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|49->17|49->17|51->19|54->22|54->22|54->22|59->27
                  -- GENERATED --
              */
          