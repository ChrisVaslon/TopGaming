<%-- 
    Document   : detail-panier
    Created on : 21 janv. 2021, 16:04:17
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
        <title>Accueil</title>
    </head> 
    <body>

        <c:import url="/menu-main" />

        <div class="container mt-4">
            <c:if test="${empty requestScope.lignes}">
                <p class="alert alert-success alert-dismissible">Votre Panier est Vide </p>
            </c:if>

            <div class="col-md-12 col-lg-12 col-sm-12 order-md-last">
        
                    <h4 class="d-flex justify-content-between align-items-center mb-3">
                        <span class=" "><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Votre panier</font></font></span>
                        <span class="badge bg-secondary rounded-pill"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">${requestScope.qte}</font></font></span>
                    </h4>


                    <ul class="list-group mb-3">

                        <div class="list-group-item d-flex justify-content-between bg-secondary">
                            <div  class="col-lg-3" >
                                <h6 class="my-0 ">Nom du produit</h6>
                            </div>
                            <div  class="col-lg-3 text-center" >
                                <h6 class="my-0">Prix du produit(HT)</h6>
                            </div>
                            <div  class="col-lg-3 text-center" >

                                <h6 class="my-0 "> Quantités  </h6>
                            </div>
                            <div  class="col-lg-3 text-center">

                                <h6 class="my-0 "> Total  </h6>
                            </div>


                        </div>

        <c:forEach items="${requestScope.lignes}" var="ligne">
                        <li class="list-group-item d-flex justify-content-between lh-sm ">
                            <div class="col-lg-3">
                                <small class="text-muted"><font style="vertical-align: inherit;">
                                    <td><c:out value="${ligne.jeu.nom}" /> </td> 
                                    </font></font></small>
                            </div>
                            <div class="col-lg-3 text-center">   

                                <span class="text-muted ">
                                    <font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
                                    <c:out value="${ligne.jeu.prixHT}" /> € 
                                    </font></font></span>
                            </div>
                            <div class="col-lg-3 text-center">   

                                <span class="text-muted">
                                    <font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
                                    <c:out value="${ligne.quantite}" />  
                                    </font></font></span>
                            </div>
                            <div class="col-lg-3 text-center">  
                                <span class="text-muted">
                                    <font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
                                    <c:out value="${ligne.quantite}" />  
                                    </font></font></span>

                            </div>








                        </li>
        </c:forEach>
                        <li class="list-group-item d-flex justify-content-between text-dark">
                            <span><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Total (EURO)</font></font></span>
                            <strong><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">20 €</font></font></strong>
                        </li>

                    </ul>
            

            </div>




        </div>


        <!-- Site footer -->
        <c:import url="WEB-INF/menus/menus-footer.jsp" />





        <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
        <script src="js/swipper.js" type="text/javascript"></script>

    </body>
</html>