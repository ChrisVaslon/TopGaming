<%-- 
    Document   : detail-panier
    Created on : 21 janv. 2021, 16:04:17
    Author     : Ousseynou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


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
        <title>Detail-Panier</title>
    </head> 
    <body>

        <c:import url="/menu-main" />

        <div class="container mt-4">
            <c:if test="${empty requestScope.lignes}">
                <p class="alert alert-success alert-dismissible">Votre Panier est Vide </p>
            </c:if>

            <div class="col-md-12 col-lg-12 col-sm-12 order-md-last">
                <div class="w-25 text-center d-flex justify-content-end">
                    <a class="btn btn-outline-danger"
                       href='panier?operation=enlever&id=<c:out value="${jeu.id}"/>'>
                        Vider le panier
                    </a>

                </div>                
                <h4 class="d-flex justify-content-between align-items-center mb-3">
                    <span class=" "><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
                        Votre panier</font></font></span>
                    <span class="badge bg-secondary rounded-pill"><font style="vertical-align: inherit;">
                        <font style="vertical-align: inherit;">${requestScope.qte}</font></font></span>
                </h4>
                <div class="table-responsive-lg">
                    <table class="table table-hover table-bordered table-dark text-center">
                        <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Nom du produit</th>
                                <th scope="col">Prix du produit(HT)</th>
                                <th scope="col">Quantités </th>
                                <th scope="col">Total </th>  
                                <th scope="col">Supprimer</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${requestScope.lignes}" var="ligne">
                                <tr class="table-active">
                                    <th scope="row"><c:out value="${ligne.jeu.id}"/></th>
                                    <td><c:out value="${ligne.jeu.nom}" /> </td>
                                    <td> <c:out value="${ligne.jeu.prixHT}" /> € </td>
                                    <td> <c:out value="${ligne.quantite}" /> </td>
                                    <td> <fmt:formatNumber value="${ligne.totalLigne}" minFractionDigits="2" maxFractionDigits="2"/> €</td>
                                    <td>
                                        <a  href='panier?operation=supprimer&id=<c:out value="${ligne.jeu.id}"/>' class="btn btn-danger">
                     <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-x" viewBox="0 0 16 16">
                                            <path d="M4.646 4.646a.5.5 0 0 1 .708 0L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707
                 8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0 1-.708-.708L7.293 8 4.646 5.354a.5.5 0 0 1 0-.708z"/>
                                            </svg>
                                        </a>
                                    </td> 
                                </tr>  
                            </c:forEach>                    
                        </tbody> 
                        <tfoot>
                            <c:if test="${not empty requestScope.lignes}">
                                <tr>
                                    <th scope="row">  Total (EURO)  </th>
                                    <td colspan="4" style="text-align: right">
                                        <fmt:formatNumber value="${total}" minFractionDigits="2" maxFractionDigits="2"/> €
                                    </td>
                                    <td> <a  href='#' class="btn btn-success"> Payer </a> </td>
                                </tr>
                            </c:if>
                        </tfoot>
                    </table>              

                </div>
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