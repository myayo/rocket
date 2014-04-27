<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rocket Agriculture</title>
<!-- Bootstrap -->
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="<c:url value='/resources/css/login.cs' />s">

</head>
<body>
	  <div class="container">
	      <form class="form-login" role="form" action="<c:url value='j_spring_security_check' />" method='POST'>
	        <h2 class="form-login-heading">Connecter vous pour acceder à Rocket Agriculture</h2>
	        <input type="text"  name="username"  class="form-control" placeholder="nom d'utilisateur" required="true" autofocus="">
	        <input type="password" name="password" class="form-control" placeholder="mot de passe" required="true">
	        <label class="checkbox">
	          <input type="checkbox" value="remember-me"> Rester connecter
	        </label>
	        <button class="btn btn-lg btn-primary btn-block" type="submit">Se connecter</button>
	        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	      </form>
	   </div>
	   <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
</body>
</html>