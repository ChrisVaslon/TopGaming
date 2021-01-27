<%-- 
    Document   : contact
    Created on : 24 janv. 2021, 07:25:29
    Author     : Djouela
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Categories</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
              integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">




        <link href="css/normalize.css" rel="stylesheet" type="text/css"/>
        <link href="css/categorie.css" rel="stylesheet" type="text/css"/>   
        <link href="css/contact.css" rel="stylesheet" type="text/css"/>   


    </head> 
    <body>
<c:import url="/menu-main" />


    <div class="container mt-4">
        <div class="row justify justify-content-center">
            <div class="col-11 col-md-8 col-lg-6 col-xl-5">
                <form class="">
                    <div class="card bg-dark">
                        <div class="row mt-0">
                            <div class="col-md-12 ">
                                <h4 class="">Contactez-nous</h4>
                                <p>Besoin d'information? Laissez-nous un message:</p>
                            </div>
                        </div>
                        
                         <div class="form-group row mb-3">
                            <div class="col-md-12 mb-0">
                                <p class="mb-1">Nom</p> <input id="nom-id" type="text" placeholder="Saisissez votre nom" name="nom" class="form-control input-box rm-border">
                            </div>
                        </div>
                        <div class="form-group row mb-3">
                            <div class="col-md-12 mb-0">
                                <p class="mb-1">Prénom</p> <input id="prenom-id" type="text" placeholder="Saisissez votre prénom" name="prenom" class="form-control input-box rm-border">
                            </div>
                        </div>
                        
                        <div class="form-group row mb-3">
                            <div class="col-md-12 mb-0">
                                <p class="mb-1">Email</p> <input id="e-mail-id" type="text" placeholder="Saisissez votre adresse e-mail" name="email" class="form-control input-box rm-border">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-md-12 mb-2">
                                <p class="mb-1">Message</p> <textarea id="message" type="text" placeholder="Ecrivez votre message..." name="message" class="form-control input-box rm-border"></textarea>
                            </div>
                        </div>
                        <div class="form-group row justify-content-center mb-0">
                            <div class="col-md-12 px-3"> <input type="submit" value="Soumettre" class="btn btn-block rm-border"> </div>
                        </div>
                    </div>
                </form>
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