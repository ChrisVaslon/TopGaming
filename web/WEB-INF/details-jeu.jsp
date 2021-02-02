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
                <p> Jeu introuvable </p>
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


        </div>
        <div class="container mt-3 mb-3">
            <div class="row">
                <div class="col-12">
                    


                    <div class="col-md-6">

                        <ul class="nav nav-tabs " id="mytab" role="tablist">


                            <li role="presentation" class="nav-item">
                                <a href="#commentaires" aria-controls="commentaires" role="tab" data-toggle="tab" class="nav-link active text-dark ">Laisser un avis </a>
                            </li>
                            <li role="presentation" class="nav-item">
                                <a href="#liste-cmtaires" aria-controls="liste-cmtaires" role="tab" data-toggle="tab" class="nav-link text-dark ">Voir les avis</a>
                            </li>

                        </ul>     
                    </div>

                    <div class="col-md-6 " >
                        <div class="tab-content">



                            <div role="tabpanel" class="tab-pane  active py-3 mh-100" id="commentaires">
                                <h6>Laisser un commentaire</h6>

                                <form action="form-floating ">
                                    <div class="form-group">



                                        <textarea class="form-control" rows="1" id="comment" placeholder="Ecrire un commentaire" name="text"></textarea>
                                    </div>
                                    <button type="submit" class="btn btn-primary btn-dark">Soumettre</button>
                                </form>
                            </div>

                            <div role="tabpanel" class="tab-pane py-3 mh-100" id="liste-cmtaires">
                                <h6>Voir les commentaires</h6>
                                <ul class="list-group" id="liste-commentaires"></ul>
                            </div>

                        </div>



                    </div>
                </div>


            </div>












            <!-- Site footer -->
            <c:import url="WEB-INF/menus/menus-footer.jsp" />





            <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>

            <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
            <script src="js/swipper.js" type="text/javascript"></script>
            <script>
                function listCommentaires() {
            document.querySelector("#liste-commentaires").innerHTML = '';
            axios.get('http://localhost:8080/topGaming/jeu?id=18').then(function(results) {
                results.data.comments.reverse().map(function(commentaire, id) {
                    document.querySelector("#liste-commentaires").innerHTML += `<li class="list-group-item">
                    ${commentaire.commentaire}
                </li>`;
                    return commentaire;
                })
            });
        }
        listCommentaires();
            </script>

    </body>
</html>
