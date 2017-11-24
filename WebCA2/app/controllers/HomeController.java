package controllers;

import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }
    public Result events() {
        return ok(views.html.events.render());
    }
    public Result venues() {
        return ok(views.html.venues.render());
    }
    public Result form() {
        return ok(views.html.form.render());
    }
    public Result profile() {
        return ok(views.html.profile.render());
    }
    public Result aboutus() {
        return ok(views.html.aboutus.render());
    }
    public Result Danny() {
        return ok(views.html.Danny.render());
    }
    public Result Gorillaz() {
        return ok(views.html.Gorillaz.render());
    }
    public Result Jeff() {
        return ok(views.html.Jeff.render());
    }
    public Result Kanye() {
        return ok(views.html.Kanye.render());
    }
    public Result Keith() {
        return ok(views.html.Keith.render());
    }
    public Result Michael() {
        return ok(views.html.Michael.render());
    }

}
