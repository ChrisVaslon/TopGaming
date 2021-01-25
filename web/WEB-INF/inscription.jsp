
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>inscription</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <meta name="viewport" content="width=device-width, initial-scale=1">

    </head>

    <c:import url="WEB-INF/menus/menus-navbar.jsp" />
    <body>
        <header class ="mx-5 my-5">
            <h1 class ="d-flex justify-content-center"> Formulaire d'inscription :</h1>
        </header>
        <div class = "container mt-4">
            <form action="inscription-valider" method="POST">

                <div class="form-row">

                    <div class="form-group">
                        <label for="inputPseudo">Pseudo</label>
                        <input type="text" name ="Pseudo" value='<c:out value ="${requestScope.Pseudo}"/>'class="form-control" id="inputPseudo" placeholder="Pseudo">
                    </div>

                    <div class="form-group col-md-6">
                        <label for="inputNom">Nom</label>
                        <input type="text" name ="Nom" value='<c:out value ="${requestScope.Nom}"/>' class="form-control" id="inputNom" placeholder="Nom">
                    </div>
                    <div class="form-group col-md-6">
                        <label for="inputPrenom">Prenom</label>
                        <input type="text" name ="Prenom" value='<c:out value ="${requestScope.Prenom}"/>' class="form-control" id="inputPrenom" placeholder="Prenom">
                    </div>
                </div>        

                <div class="form-group">
                    <label for="inputdateNaissance">Date naissance:</label>
                    <input type="date" name ="dateNaissance" value='<c:out value ="${requestScope.dateNaissance}"/>'class="form-control" id="inputDateNaissance" placeholder="Date naissance">
                </div>

                <div class="form-group">
                    <label for="inputmail">Mail:</label>
                    <input type="email" name ="Mail" value='<c:out value ="${requestScope.Mail}"/>'class="form-control" id="inputMail" placeholder="Mail">
                </div>
                
                <div class="form-group">
                    <label for="inputPassword">Password</label>
                    <input type="password" name ="pwd" value='<c:out value ="${requestScope.pwd}"/>'class="form-control" id="inputPassword" placeholder="Password">
                </div>

                <div class="form-group">
                    <label for="inputAddress">Rue</label>
                    <input type="text" name ="Rue" value='<c:out value ="${requestScope.Rue}"/>'class="form-control" id="inputRue" placeholder="1234 Main St">
                </div>

                <div class="form-group">
                    <label for="inputCp">CP</label>
                    <input type="text" name ="Cp" value='<c:out value ="${requestScope.Cp}"/>' class="form-control" id="inputCp" placeholder="Apartment, studio, or floor">
                </div>

                <div class="form-group">
                    <label for="inputVille"> Ville</label>
                    <input type="text"  name = "Ville" value='<c:out value ="${requestScope.Ville}"/>'class="form-control" id="inputVille" placeholder="1234 Main St">
                </div>

                <div class="form-group">
                    <label for="inputTel">Tel:</label>
                    <input type="text" name = "Tel" value='<c:out value ="${requestScope.Tel}"/>'class="form-control" id="inputTel" placeholder="Apartment, studio, or floor">
                </div>


                <div class="form-group">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" id="gridCheck">
                        <label class="form-check-label" for="gridCheck">
                            J'accepte les conditions d'utilisation
                        </label>
                    </div>
                </div>

                <button type="submit" class="btn btn-primary"> S'inscrire !</button>
            </form>
        </div>
        <c:import url="WEB-INF/menus/menus-footer.jsp" />