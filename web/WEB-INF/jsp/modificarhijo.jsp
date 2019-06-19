<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>  
                <meta http-equiv=""Content-Type" content="text/html; charset=UTF-8">            
                      <title>Modificar hijo</title>
    </head>
    <body>
        <h1>Modificar un hijo</h1>
        <br>
       
        <form:form action="modificarhijo.html" method="POST" commandName="hijo">
             <c:out value="'La madre es': ${hijo.getMadre().getCi()} ${hijo.getMadre().getNombre()}  "></c:out>
             <br>
             <form:label path="ci">CI</form:label>
            <form:input path="ci"></form:input>
            <br>
            <form:label path="nombre">Nombre</form:label>
            <form:input path="nombre"></form:input>
            <br>

            <form:button>Aceptar</form:button>
        </form:form>
    </body>
</html>
