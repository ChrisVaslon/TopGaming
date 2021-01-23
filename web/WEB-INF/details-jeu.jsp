<%-- 
    Document   : details_catalogue
    Created on : 19 janv. 2021, 18:44:29
    Author     : Ousseynou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        <link
            rel="stylesheet"
            href="https://unpkg.com/swiper/swiper-bundle.min.css"
            />
        <link href="css/normalize.css" rel="stylesheet" type="text/css"/>

        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>Détails Du Jeu</title>
    </head> 
    <body>

      
   <c:import url="/menu-main" />
        <div class="container">

            <h1>Détails Du Jeu !</h1>
            
            
               <c:if test="${empty requestScope.jeu}">
                <p> Jeu introuvable</p>
            </c:if>
            <c:if test="${not empty requestScope.jeu}">
                <img  src='images/<c:out value="${requestScope.jeu.image}" />' 
                      alt='couverture <c:out value="${requestScope.jeu.nom}" />'>
                       <br>
                       <p> titre : <c:out value="${requestScope.jeu.nom}" /> </p>
                         <p> Resumé : <c:out value="${requestScope.jeu.description}" /> </p>
                       
                             <p> PrixHT : <c:out value="${requestScope.jeu.prixHT}" /> </p>
                      
                             <p> PrixTTC : <c:out value="${requestScope.jeu.prixTTC}" /> </p>
                             
                             
                             
            </c:if>
            
            
            
            
            
            
            
            
        </div>
         <!-- Site footer -->
        <c:import url="WEB-INF/menus/menus-footer.jsp" />





        <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
        <script src="js/swipper.js" type="text/javascript"></script>

    </body>
</html>