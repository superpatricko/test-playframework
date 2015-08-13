package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

import java.util.Arrays;
import java.util.List;


public class Contacts extends Controller {

	public static Result index() {
		List<String> names = Arrays.asList();
		return ok(index.render("Hello, once again, World", names));
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