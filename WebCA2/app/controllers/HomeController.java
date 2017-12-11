package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.*;
import javax.inject.Inject;

import models.*;

import views.html.*;

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
        return ok(index.render());
    }
    public Result events(Long cat){ 
        List<Events> eventList = null;
        List<Category> categoryList = Category.findAll();
        if (cat == 0){
            eventList = Events.findAll();
        } else {
            eventList = Category.find.ref(cat).getEvents();
        }
        return ok(events.render(eventList, categoryList));
    }
    public Result venues() {
        return ok(venues.render());
    }
    public Result form() {
        return ok(form.render());
    }
    public Result profile() {
        return ok(profile.render());
    }
    public Result aboutus() {
        return ok(aboutus.render());
    }
    public Result Danny() {
        return ok(Danny.render());
    }
    public Result Gorillaz() {
        return ok(Gorillaz.render());
    }
    public Result Jeff() {
        return ok(Jeff.render());
    }
    public Result Kanye() {
        return ok(Kanye.render());
    }
    public Result Keith() {
        return ok(Keith.render());
    }
    public Result Michael() {
        return ok(Michael.render());
    }

}
