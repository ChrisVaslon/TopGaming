<%-- 
    Document   : evaluation-affichage
    Created on : 20 janv. 2021
    Author     : chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="../../css/eval-css.css" rel="stylesheet" type="text/css"/>

<!--
<span class="fa fa-star checked" id="star1" name="stars1"> </span>
<span class="fa fa-star checked" id="star2" name="stars2"></span>
<span class="fa fa-star checked" id="star3" name="stars3"></span>
<span class="fa fa-star" id="star4" name="stars4"></span>
<span class="fa fa-star" id="star5" name="stars5"></span>
-->


 <a href="evaluation?operation=evaluer&valeur=1&id=<c:out value='${requestScope.jeu.id}'/>"><span class="fa fa-star" id="star1" name="stars1"> </span></a>
 <a href="evaluation?operation=evaluer&valeur=2&id=<c:out value='${requestScope.jeu.id}'/>"><span class="fa fa-star" id="star2" name="stars2"> </span></a>
  <a href="evaluation?operation=evaluer&valeur=3&id=<c:out value='${requestScope.jeu.id}'/>"><span class="fa fa-star" id="star3" name="stars3"> </span></a>
  <a href="evaluation?operation=evaluer&valeur=4&id=<c:out value='${requestScope.jeu.id}'/>"><span class="fa fa-star" id="star4" name="stars4"> </span></a>
   <a href="evaluation?operation=evaluer&valeur=5&id=<c:out value='${requestScope.jeu.id}'/>"><span class="fa fa-star" id="star5" name="stars5"> </span></a>
  
  
<script src="../../js/evaluation.js" type="text/javascript"></script>
