<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; 
    charset=ISO-8859-1">
<title>Events</title>
</head>
<body>
<h1>Events</h1>
	<jstl:if test="${not empty eventList }">

		<table border="1">
			<tr>
				<th>Event Title</th>
				<th>Event Type</th>
				<th>City</th>
				<th>Ticket Price</th>
				
			</tr>
			<jstl:forEach var="event_data" items="${eventList}" varStatus="st">
				<tr>
					<td><jstl:out value="${ event_data.eventTitle }">
						</jstl:out></td>
						<td><jstl:out value="${ event_data.eventType }">
						</jstl:out></td>
					<td><jstl:out value="${ event_data.city }">
						</jstl:out></td>
					<td><jstl:out value="${ event_data.ticketPrice }">
						</jstl:out></td>
					
				</tr>
			</jstl:forEach>
		</table>
	</jstl:if>
	<jstl:if test="${empty eventList }">
		<jstl:out value="No Event Found"></jstl:out>
	</jstl:if>
</body>