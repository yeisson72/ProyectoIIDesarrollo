<%-- 
    Document   : resintoView
    Created on : 04-nov-2012, 2:03:59
    Author     : Macho
http://www.ejemplode.com/21-xml/522-ejemplo_de_catalogo_de_cds_en_xml.html
http://www.ejemplode.com/21-xml/527-ejemplo_de_ver_archivo_xml_en_html.html
http://metafisicainformatica.blogspot.com/2009/07/integrar-javascript-y-xml-un-ejemplo.html
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
   <h3>Resintos adentro</h3>
   <table border="1">
	 <tr>
		 <th>Codigo</th>
		 <th>Zona</th>
		 <th>Calle</th>
		 <th>Avenida</th>
		 <th>Distancia</th>
		 <th>Latitud</th>
		 <th>Logintud</th>
		 <th>Razon Social</th>
	 </tr>
	 <c:forEach items="${model.resintos}" var="obj">
	   <tr>
		<td><c:out value="${obj.codigo}"/></td>
		<td><c:out value="${obj.zona}"/></td>
		<td><c:out value="${obj.calle}"/></td>
		<td><c:out value="${obj.avenida}"/></td>
		<td><c:out value="${obj.distancia}"/></td>
		<td><c:out value="${obj.latitud}"/></td>
		<td><c:out value="${obj.longitud}"/></td>
		<td><c:out value="${obj.zon_social}"/></td>
	   </tr>
	 </c:forEach>
   </table>
    </body>
</html>
