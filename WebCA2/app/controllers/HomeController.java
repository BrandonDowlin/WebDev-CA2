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
        return ok(views.html.index.render());
    }
    public Result events(Long cat) {
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

    

    private FormFactory formFactory;
    
        @Inject
        public HomeController(FormFactory f){
            this.formFactory = f;
        }
        public Result addEvent(){
            Form<Events> eventForm = formFactory.form(Events.class);
            return ok(addEvent.render(eventForm));
        }

        public Result addEventSubmit(){
    
            Form<Events> newEventForm = formFactory.form(Events.class).bindFromRequest();
    
            if (newEventForm.hasErrors()) {
                return badRequest(addEvent.render(newEventForm));
            } else {
                Events newEvent = newEventForm.get();
                if (newEvent.getId() == null){
                    newEvent.save();
                } else if (newEvent.getId() != null) {
                    newEvent.update();
                }
                flash("success", "Event "+ newEvent.getName() + " was added");
                return redirect(controllers.routes.HomeController.events(0));
            }
        }



    public Result deleteEvent(Long id){
        Events.find.ref(id).delete();
        flash("success", "Event has been deleted");
        return redirect(routes.HomeController.events(0));
    }

    @Transactional
    public Result updateEvent(Long id){
        Events e;
        Form<Events> eventForm;

        try {
            e = Events.find.byId(id);
            eventForm = formFactory.form(Events.class).fill(e);
        } catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addEvent.render(eventForm));
    }
}
