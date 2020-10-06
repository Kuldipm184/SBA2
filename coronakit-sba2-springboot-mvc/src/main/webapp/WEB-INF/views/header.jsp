<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title>Covid KIT WellsFargo</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>

<nav class="navbar navbar-expand-md navbar-dark" style="background-color: teal">
  <!-- Brand -->
  <a class="navbar-brand" href="#">CORONA KIT WEBSITE</a>

  <!-- Toggler/collapsibe Button -->
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>

  <!-- Navbar links -->
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/home">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="product-list">Products List</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="product-entry">Add New Product</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/custom-login">Logout</a>
      </li>
    </ul>
  </div>
</nav>
</body>
</html>