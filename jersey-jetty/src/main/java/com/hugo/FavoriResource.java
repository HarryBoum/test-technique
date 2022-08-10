package com.hugo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/favori")
public class FavoriResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String favori() {
        return ("<!DOCTYPE html>\n" +
                "<html lang=\"en\">" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Favori</title>\n" +
                "</head>\n" +
                "<script>" +
                "   document.onload = function () {\n" +
                "       let li = document.createElement(\"LI\");\n" +
                "       li.innerHTML = \"LoL\";\n" +
                "       let btn = document.createElement('button');\n" +
                "       btn.type = 'button';\n" +
                "       btn.textContent = 'Delete';\n" +
                "       btn.addEventListener(\"click\", (e) => deleteNote(e));\n" +
                "       let checkbox = document.createElement(\"checkbox\");\n" +
                "       li.appendChild(checkbox)\n" +
                "       li.appendChild(btn);\n" +
                "       document.getElementById(\"film_list\").appendChild(li);\n" +
                "   }" +
                "</script>" +
                "<body>\n" +
                "<a href=\"home\">Home</a>\n" +
                "<a href=\"favori\" style=\"margin-left: 900px\">Favori</a>\n" +
                "<br>" +
                "<ul id=\"film_list\" ></ul>" +
                "</body>\n" +
                "</html>");
    }

}