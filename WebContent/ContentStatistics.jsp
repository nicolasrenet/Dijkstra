<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<a href="${pageContext.request.contextPath}/">Back</a>

<table class="listing">
    <tr>
        <th>Number of Books</th>
        <th>Average Price</th>
    </tr>
    <tr>
        <td>${bookCount}</td>
        <td>${averagePrice}</td>
    </tr>
</table>