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
        
        <link href="css/allCommentaires.css" rel="stylesheet" type="text/css"/>
        
        <title>Détails Du Jeu</title>
    </head> 
    <body>


        <c:import url="/menu-main" />
        <div class="container mb-2">

            <h1>Détails Du Jeu !</h1>


            <c:if test="${empty requestScope.jeu}">
                <p> Jeu introuvable!<br> Echec envoi commentaire. </p>
            </c:if>
            <c:if test="${not empty requestScope.jeu}">
                <img  src='images/jeux-accueil/<c:out value="${requestScope.jeu.image}" />' 
                      alt='couverture <c:out value="${requestScope.jeu.nom}" />'>
                <br>
                <p> titre : <c:out value="${requestScope.jeu.nom}" /> </p>
                <p> Resumé : <c:out value="${requestScope.jeu.description}" /> </p>

                <p> PrixHT : <c:out value="${requestScope.jeu.prixHT}" /> </p>

                <p> PrixTTC : <c:out value="${requestScope.jeu.prixTTC}" /> </p>
                
           
 </c:if>
        

            <c:forEach items="${requestScope.commentaires}" var="commentaire">
                     
                     
                     
              <div class="row">
        <div class="col-12">
            <div class="card card-white post">
                <div class="post-heading">
                    <div class="float-left image">
                        <img src="http://bootdey.com/img/Content/user_1.jpg" class="img-circle avatar" alt="user profile image">
                    </div>
                    
                    <div class="float-left meta">
                        <div class="title h5">
                            <a href="#"><b><c:out value ="${commentaire.membre.nom}" /> <c:out value ="${commentaire.membre.prenom}" /></b></a>
                            
                        </div>
                        
                    </div>
                </div> 
                <div class="post-description"> 
                    <p><c:out value ="${commentaire.valeur}" /> </p>

                </div>
            </div>
        </div>
        
    </div>   
                     
                   
               </c:forEach> 
                
                
                 <form action="vers-commentaire" method ="POST">
                <input type="hidden" name="idJeu" value="${requestScope.jeu.id}" >
                <input type="hidden" name="idMembre" value="${requestScope.user.id}" >

                <div class="form-group">
                    <label for ="comment" style="color: palegoldenrod" > <b> Visiteur?</b> Inscrivez vous <a href="/topGaming/inscription"><b>ici</b></a> pour commenter les jeux<br><b>Adhérant?</b> entrez un commentaire </label>
                    <textarea  name="valeur"    class="form-control" placeholder="Ecrire un commentaire" id="comment"><c:out value= "${requestScope.valeur}" /></textarea>
                </div> 
                <button type="submit" class="btn btn-primary btn-dark">Soumettre</button>
            </form>  

           
 </div>
       





        <!-- Site footer -->
        <c:import url="WEB-INF/menus/menus-footer.jsp" />





        <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
        <script src="js/swipper.js" type="text/javascript"></script>


    </body>
</html>
