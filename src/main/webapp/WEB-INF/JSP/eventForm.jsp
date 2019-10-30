<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<form:form modelAttribute="event" method="POST" action="addEvent">

	<h2>Enter the Event Details</h2>

	<table>
		<tr>
			<td width="50%" align="right">Name of the Event</td>
			<td width="50%" align="left"><form:input path="eventTitle"
					size="30" /></td>
		</tr>
		<tr>
			<td width="50%" align="right">Event City</td>
			<td width="50%" align="left"><form:input path="city" size="30" />
			</td>
		</tr>
		<tr>
			<td width="50%" align="right">Ticket Price</td>
			<td width="50%" align="left"><form:input path="ticketPrice" /></td>
		</tr>
		<tr>
			<td width="50%" align="right">Event Type</td>
			<td width="50%" align="left"><form:select path="eventType">
					<form:option value="NONE" label="--- Select ---" />
					<form:options items="${eventTypes}" />
				</form:select></td>
		</tr>
		<tr>
			<td><input type="submit" name="submit" value="Submit"></td>
	</table>
</form:form>