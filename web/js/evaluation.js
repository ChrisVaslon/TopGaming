/* 
 *  @author chris
 */

var star1 = document.getElementById("star1");
var star2 = document.getElementById("star2");
var star3 = document.getElementById("star3");
var star4 = document.getElementById("star4");
var star5 = document.getElementById("star5");
var clique = new Boolean(false);
 
 
star1.addEventListener("mouseover", function () {
   
    star1.style.color = "red";
    star1.addEventListener("click", function (event) {
     event.preventDefault();
    clique = true;
    }
    );
    if(clique == false){
    star1.addEventListener("mouseleave", function () {
    star1.style.color = "";
    }
    );
    }
}
);

star2.addEventListener("mouseover", function () {
    star1.style.color = "red";
    star2.style.color = "red";
    
    star1.addEventListener("click", function (event) {
        event.preventDefault();
        clique = true;
    }
    );


     if(clique == false){
    star2.addEventListener("mouseleave", function () {
    star1.style.color = "";
    star2.style.color = "";
    }
    );
    }
}
);

star3.addEventListener("mouseover", function () {
    star1.style.color = "red";
    star2.style.color = "red";
    star3.style.color = "red";
    
    star1.addEventListener("click", function (event) {
    event.preventDefault();
    clique = true;
    }
    );
    if(clique == false){
    star3.addEventListener("mouseleave", function () {
    star1.style.color = "";
    star2.style.color = "";
    star3.style.color = "";
    }
    );
    }
}
);

star4.addEventListener("mouseover", function () {
    star1.style.color = "red";
    star2.style.color = "red";
    star3.style.color = "red";
    star4.style.color = "red";
    
    star1.addEventListener("click", function (event) {
         event.preventDefault();
    clique = true;
    }
    );
    
    if(clique == false){
    star4.addEventListener("mouseleave", function () {
    star1.style.color = "";
    star2.style.color = "";
    star3.style.color = "";
     star4.style.color = "";
     }
     );
    }
    
}
);

star5.addEventListener("mouseover", function () {
    star1.style.color = "red";
    star2.style.color = "red";
    star3.style.color = "red";
    star4.style.color = "red";
    star5.style.color = "red";
    
    star1.addEventListener("click", function (event) {
    event.preventDefault();
    clique = true;
    }
    );
    if(clique == false){
    star5.addEventListener("mouseleave", function () {
    star1.style.color = "";
    star2.style.color = "";
    star3.style.color = "";
    star4.style.color = "";
    star5.style.color = "";
    }
    );
    }
}
);

