<%--
  Created by IntelliJ IDEA.
  User: elnino228
  Date: 18/06/2019
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form action="/display-discount" method="get">
    Product Description:<br/>
    <input type="text" name="description" placeholder="Enter description"/><br/>
    List price:<br/>
    <input type="text" name="price" placeholder="Enter price"/><br/>
    Discount Percent:<br/>
    <input type="text" name="discount" placeholder="Enter product discount"/><br/>
    <input type="submit" id="submit" value="Calculate Discount"/>
  </form>
  </body>
</html>
