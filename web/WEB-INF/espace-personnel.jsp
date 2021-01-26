<%-- 
    Document   : espace_personnel
    Created on : 20 janv. 2021, 09:35:17
    Author     : thula
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
        <link
            href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.1.0/mdb.min.css"
            rel="stylesheet"
            />
        
        <link href="css/espace.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>Détails Catalogue</title>
    </head> 
    <body>

        <c:import url="WEB-INF/menus/menus-navbar.jsp" />
        <div class="container">

            <div class="row py-5 px-4">
                <div class="col-md-20 mx-auto">
                    <!-- Profile widget -->
                    <div class="bg-white shadow rounded overflow-hidden">
                        <div class="px-4 pt-0 pb-4 cover">
                            <div class="media align-items-end profile-head">
                                <div class="profile mr-3"><img src="images/espace-perso/mob.jpg" alt="..." width="130" class="rounded mb-2 img-thumbnail">
                                    <a href="interface-admin" class="btn btn-outline-dark btn-sm btn-block">Modifier le profile</a>
                                </div>
                                <div class="media-body mb-5 text-white">
                                    <h4 class="mt-0 mb-0">Pseudo</h4>
                                    <p class="small mb-4"> <i class="fas fa-map-marker-alt mr-2"></i>New York</p>
                                </div>
                            </div>
                        </div>
                        <div class="bg-light p-4 d-flex justify-content-end text-center">
                            <ul class="list-inline mb-0">
                                <li class="list-inline-item">
                                    <h5 class="font-weight-bold mb-0 d-block">215</h5><small class="text-muted"> <i class="fas fa-image mr-1"></i>Jeux</small>
                                </li>
                                <li class="list-inline-item">
                                    <h5 class="font-weight-bold mb-0 d-block">745</h5><small class="text-muted"> <i class="fas fa-user mr-1"></i>Likes</small>
                                </li>
                                <li class="list-inline-item">
                                    <h5 class="font-weight-bold mb-0 d-block">340</h5><small class="text-muted"> <i class="fas fa-user mr-1"></i>Commentaires</small>
                                </li>
                            </ul>
                        </div>
                        <div class="px-4 py-3">
                            <h5 class="mb-0">Bio</h5>
                            <div class="p-4 rounded shadow-sm bg-light">
                                <p class="font-italic mb-0 ">
                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
                                    Sed ullamcorper suscipit eros, nec laoreet neque euismod mattis. 
                                    Proin ultrices ante quis tellus maximus convallis. Vestibulum sed porttitor velit. 
                                    Quisque vel luctus purus. Phasellus mi ligula, consequat id posuere eu, efficitur at mi.
                                </p>
                            </div>
                        </div>
                        <div class="py-4 px-4">
                            <div class="d-flex align-items-center justify-content-between mb-3">
                                <h5 class="mb-0">Jeux</h5><a href="#" class="btn btn-link text-muted">Show all</a>
                            </div>
                            <div class="row">
                                <div class="col-lg-6 mb-2 pr-lg-1 bg-image hover-overlay hover-zoom hover-shadow ripple">
                                    <a href="#!"><img src="images/acval.jpg" alt="" class="img-fluid rounded shadow-sm"></a>
                                    <div class="mask" style="background-color: rgba(57, 192, 237, 0.2)"></div>
                                </div>
                                <div class="col-lg-6 mb-2 pl-lg-1 bg-image hover-overlay hover-zoom hover-shadow ripple">
                                    <a href="#!"><img src="images/amongus.jpg" alt="" class="img-fluid rounded shadow-sm"></a>
                                    <div class="mask" style="background-color: rgba(57, 192, 237, 0.2)"></div>
                                </div>
                                <div class="col-lg-6 pr-lg-1 mb-2 bg-image hover-overlay hover-zoom hover-shadow ripple">
                                    <a href="#!"><img src="images/mine.jpg" alt="" class="img-fluid rounded shadow-sm"></a>
                                    <div class="mask" style="background-color: rgba(57, 192, 237, 0.2)"></div>
                                </div>
                                <div class="col-lg-6 pl-lg-1 bg-image hover-overlay hover-zoom hover-shadow ripple">
                                    <a href="#!"><img src="images/espace-perso/apex.jpg" alt="" class="img-fluid rounded shadow-sm"></a>
                                    <div class="mask" style="background-color: rgba(57, 192, 237, 0.2)"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <c:import url="WEB-INF/menus/menus-footer.jsp" />

    </body>
</html>
