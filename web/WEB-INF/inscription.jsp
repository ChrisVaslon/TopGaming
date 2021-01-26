
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

        <link href="css/normalize.css" rel="stylesheet" type="text/css"/>
        <link href="css/categorie.css" rel="stylesheet" type="text/css"/>   
        <link href="css/contact.css" rel="stylesheet" type="text/css"/>   
        <link href="css/inscription.css" rel="stylesheet" type="text/css"/>
    </head> 


    <body>
        
        <c:import url="WEB-INF/menus/menus-navbar.jsp" />
            
        
        <div class = "container my-4">
            
           
            <form id = "formulaire-inscription" class = "p-4" action="inscription-valider" method="POST">

                 <div class ="mx-5 my-5">
            <h1 class ="d-flex justify-content-center"> Formulaire d'inscription :</h1>
        </div>
                   <c:if test="${not empty requestScope.msg}">
                <p class ="erreur">${requestScope.msg}</p>              
            </c:if>
                
                <div class="form-row">

                    <div class="form-group">
                        <label for="inputPseudo">Pseudo</label>
                        <input type="text" name ="Pseudo" required value='<c:out value ="${requestScope.Pseudo}"/>'class="form-control" id="inputPseudo" placeholder="Pseudo">
                    <c:if test="${not empty requestScope.errPseudo}">
                        <p>${requestScope.errPseudo}</p>              
                    </c:if>
                    </div>

                    <div class="form-group col-md-6">
                        <label for="inputNom">Nom</label>
                        <input type="text" name ="Nom" required value='<c:out value ="${requestScope.Nom}"/>' class="form-control" id="inputNom" placeholder="Nom">
                    </div>
                    <div class="form-group col-md-6">
                        <label for="inputPrenom">Prenom</label>
                        <input type="text" name ="Prenom" value='<c:out value ="${requestScope.Prenom}"/>' class="form-control" id="inputPrenom" placeholder="Prenom">
                    </div>
                </div>        

                <div class="form-group">
                    <label for="inputdateNaissance">Date naissance:</label>
                    <input type="date" name ="dateNaissance" required value='<c:out value ="${requestScope.dateNaissance}"/>'class="form-control" id="inputDateNaissance" placeholder="Date naissance">
                </div>

                <div class="form-group">
                    <label for="inputmail">Mail:</label>
                    <input type="email" name ="Mail" required value='<c:out value ="${requestScope.Mail}"/>'class="form-control" id="inputMail" placeholder="Mail">
                <c:if test="${not empty requestScope.errMail}">
                        <p>${requestScope.errMail}</p>              
                    </c:if>
               
                </div>
                
                <div class="form-group">
                    <label for="inputPassword">Password</label>
                    <input type="password" name ="pwd" required value='<c:out value ="${requestScope.pwd}"/>'class="form-control" id="inputPassword" placeholder="Password">
                </div>

                <div class="form-group">
                    <label for="inputAddress">Rue</label>
                    <input type="text" name ="Rue" required value='<c:out value ="${requestScope.Rue}"/>'class="form-control" id="inputRue" placeholder="1234 Main St">
                </div>

                <div class="form-group">
                    <label for="inputCp">CP</label>
                    <input type="text" name ="Cp"  required value='<c:out value ="${requestScope.Cp}"/>' class="form-control" id="inputCp" placeholder="Apartment, studio, or floor">
                </div>

                <div class="form-group">
                    <label for="inputVille"> Ville</label>
                    <input type="text"  name = "Ville" required value='<c:out value ="${requestScope.Ville}"/>' class="form-control" id="inputVille" placeholder="1234 Main St">
                </div>

                <div class="form-group">
                    <label for="inputTel">Tel:</label>
                    <input type="text" name = "Tel" required value='<c:out value ="${requestScope.Tel}"/>' class="form-control" id="inputTel" placeholder="Apartment, studio, or floor">
                         <c:if test="${not empty requestScope.errTel}">
                        <p>${requestScope.errTel}</p>              
                    </c:if>
                </div>


                <div class="form-group">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" id="gridCheck">
                        <label class="form-check-label" for="gridCheck">
                            J'accepte les conditions d'utilisation
                        </label>
                    </div>
                </div>

                 <div class="form-group row justify-content-center mb-0">
                            <div class="col-md-12 px-3"> <input type="submit" value="Soumettre" class="btn btn-block rm-border"> </div>
                        </div>
                
            </form>
        </div>
        <c:import url="WEB-INF/menus/menus-footer.jsp" />