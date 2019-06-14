<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Madre</title>
    </head>
    <body>
        <h1> Listar los datos de la madre </h1>
        <h1><a href="adicionarmadre.html">Adicionar </a>  </h1>
        <table border="1">
            <tbody><th>ci</th><th>nombre</th><th>apellido</th><th>Mod</th><th>Borrar</th>
        <th>Hijos</th>
        </tbody>
        
        <c:forEach items="${mivariable}" var="dato" >
            <tr>
                <td>    
            <h1><c:out value="${dato.ci}"></c:out></h1>
                </td>
                
                <td>    
             <h1><c:out value="${dato.nombre}"></c:out></h1>
                </td>
                <td>
             <h1><c:out value="${dato.apellido}"></c:out></h1>
                </td>
                <td> 
                    <h1><a href="<c:url value="modificarmadre.html?ci=${dato.ci}"/>">Mod</a></h1>
                </td>
                <td> 
                    <h1><a href="<c:url value="borrarmadre.html?ci=${dato.ci}"/>">Borr</a></h1>
                </td> 
                 <td> 
                    <h1><a href="<c:url value="listarhijo.html?ci=${dato.ci}"/>">Ver</a></h1>
                </td> 
             </tr>
        </c:forEach>
        </table>  
           
            
       
    </body>
</html>