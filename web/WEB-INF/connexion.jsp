
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Inscription</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
              integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/categorie.css" rel="stylesheet" type="text/css"/>   
        <link href="css/contact.css" rel="stylesheet" type="text/css"/>   
        <link href="css/inscription.css" rel="stylesheet" type="text/css"/>
         <link href="css/normalize.css" rel="stylesheet" type="text/css"/>
    </head> 


    <body>

        <c:import url="WEB-INF/menus/menus-navbar.jsp" />



        <div class = "container my-5 connexionContainer">
            <div class= "row justify justify-content-center">
                <div class="col-11 col-md-8 col-lg-6 col-xl-5">
                    <form id = "formulaire-inscription" class = "p-4" action="connexion-valider" method="POST">

                        <div class ="mx-5 my-5">
                            <h1 class ="d-flex justify-content-center"> Connexion :</h1>
                        </div>
                        
                        <c:if test ="${not empty requestScope.errLogin}">
                            <p class="text-danger"><c:out value="${requestScope.errLogin}" /></p>
                        </c:if>
                        

                        <div class="form">
                            <c:if test ="${not empty requestScope.errPseudo}">
                                <p><c:out value="${requestScope.errPseudo}" /></p>
                            </c:if>
                            <div class="form-group">
                                <label for="inputPseudo"> Pseudo : </label>
                                <input type="text" name ="Pseudo" required value='<c:out value ="${requestScope.Pseudo}"/>'class="form-control" id="inputPseudo" placeholder="Pseudo">
                            </div>

                            <c:if test ="${not empty requestScope.errPassword}">
                                <p><c:out value="${requestScope.errPassword}" /></p>
                            </c:if>
                            <div class="form-group">
                                <label for="inputPassword"> Mot de passe :</label>
                                <input type="password" name ="Pwd" required value='<c:out value ="${requestScope.pwd}"/>'class="form-control" id="inputPassword" placeholder="Password">
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="form-check">
                                <input class="form-check-input" name="resterCo" type="checkbox" id="gridCheck">
                                <label class="form-check-label" for="gridCheck">
                                    Rester Connecter
                                </label>
                            </div>
                        </div>

                        <div class="form-group row justify-content-center mb-0">
                            <div class="col-md-12 px-3"> <input type="submit" value="Soumettre" class="btn btn-block rm-border"> </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <c:import url="WEB-INF/menus/menus-footer.jsp" />

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    </body>
</html>