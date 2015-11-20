<%-- 
    Document   : test
    Created on : 19 Nov, 2015, 1:33:38 PM
    Author     : suvradipsaha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="com.google.gson.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%
            class Albums {
                public String title;
                public String message;
                public String[] errors = new String[]{};
                public String total;
                public int total_pages;
                public int page;
                public String limit;
            }
         
            
            
            Albums albums = new Albums();
            albums.title = "Free Music Archive - Albums";
            albums.message = "";
            albums.total = "11259";
            albums.total_pages = 2252;
            albums.page = 1;
            albums.limit = "5";
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            out.println(gson.toJson(albums));
            
            
  
          
           // out.println(albums.title);    
            %>
        
        
    </body>
</html>
