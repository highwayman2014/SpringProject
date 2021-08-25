<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<body>
<form:form action="resultForm" modelAttribute="product">
    <br>
    Title: <form:input path="title" />
    <br>
    Cost: <form:input path="cost" />
    <br>
    <input type="submit" value="Add" />
</form:form>
</body>
</html>