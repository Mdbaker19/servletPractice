<%--
  Created by IntelliJ IDEA.
  User: matthewbaker
  Date: 1/20/21
  Time: 8:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza form</title>
</head>
<body>


    <form method="POST" action="pizzaOrder.jsp">
        <label>
            Topping
            <input name="topping">
        </label>
        <label>
            Crust
            <input name="crust">
        </label>
        <label>
            Sauce
            <input name="sauce">
        </label>
        <label>
            Size
            <input name="size">
        </label>
        <button type="submit">Order</button>
    </form>

</body>
</html>
