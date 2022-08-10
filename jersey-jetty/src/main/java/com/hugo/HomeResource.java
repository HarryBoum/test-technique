package com.hugo;

import jakarta.ws.rs.*;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.List;

@Path("/home")
public class HomeResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String home() {
        return ("<!DOCTYPE html>\n" +
                "<html lang=\"en\">" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Home</title>\n" +
                "</head>\n" +
                "<script>\n" +
                "    function addItem(){\n" +
                "        var li = document.createElement(\"LI\");  \n" +
                "        var input = document.getElementById(\"input_film\");\n" +
                "        if (input.value.length === 0) return;" +
                "        li.innerHTML = input.value;\n" +
                "        var btn = document.createElement('button');\n" +
                "        btn.type = 'button';\n" +
                "        btn.textContent = 'Delete';\n" +
                "        btn.addEventListener(\"click\", (e) => deleteNote(e));\n" +
                "        let checkbox = document.createElement(\"INPUT\");\n" +
                "        checkbox.setAttribute(\"type\", \"checkbox\");" +
                "        li.appendChild(checkbox)" +
                "        \n" +
                "        li.appendChild(btn);\n" +
                "        \n" +
                "        input.value = \"\";\n" +
                "        document.getElementById(\"film_list\").appendChild(li);\n" +
                "    }\n" +
                "function deleteNote(e) {\n" +
                "  const parent = e.target.parentNode;\n" +
                "  parent.remove();\n" +
                "}" +
                "</script>" +
                "<body>\n" +
                "<a href=\"home\">Home</a>\n" +
                "<a href=\"favori\" style=\"margin-left: 900px\" onclick=\"addFavorites()\">Favori</a>\n" +
                "<br>" +
                "<input type=\"text \" id=\"input_film\">" +
                "<button id=\"button_add\" onclick=\"addItem()\">add</button>" +
                "<ul id=\"film_list\" ></ul>" +
                "</body>\n" +
                "</html>");
    }
    @Path("/{name}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User user(@PathParam("name") String name) {

        User obj = new User();
        obj.setId(0);
        obj.setName(name);

        return obj;

    }

    @Path("/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> helloList() {

        List<User> list = new ArrayList<>();

        User obj1 = new User();
        obj1.setId(1);
        obj1.setName("hugo");
        list.add(obj1);

        return list;
    }
    /*@POST
    public void post_film{
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://img.omdbapi.com/?apikey=[9c59ea6c]&").path("resource");

        Form form = new Form();
        form.param("s", Val1);

        MyJAXBBean bean =
                target.request(MediaType.APPLICATION_JSON_TYPE)
                        .post(Entity.entity(form,MediaType.APPLICATION_FORM_URLENCODED_TYPE),
                                MyJAXBBean.class);
    }*/

}