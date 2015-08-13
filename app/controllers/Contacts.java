package controllers;

import models.Contact;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

import java.util.Arrays;
import java.util.List;


public class Contacts extends Controller {

	public static Result index() {
		// List<String> names = Arrays.asList("James", "Emma", "Ollie", "Nate");
		List<Contact> contacts = Contact.find.all();
		return ok(index.render(contacts));
	}

	public static Result another() {
		if(!session().containsKey("counter")) {
			session("counter", "0");
		}

		String currentStringValue = session("counter");
		Integer currentValue = Integer.parseInt(currentStringValue);
		Integer newValue = currentValue + 1;
		session("counter", newValue.toString());

		return ok(another.render());
	}

	public static Result create() {
		return TODO;
	}

	public static Result edit(Long id) {
		return TODO;
	}

	public static Result update(Long id) {
		return TODO;
	}

	public static Result delete(Long id) {
		return TODO;
	}

}