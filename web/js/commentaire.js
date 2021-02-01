/* 
Auteur: Carine
Date de création: 31/01/2021
 */
/*
"https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"


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

        document.querySelector('.btn-soumission').onclick = function(btn) {
            btn.preventDefault();
            axios.post('http://localhost:8080/topGaming/jeu?id=18/liste-cmtaires', {
                "commentaire": document.querySelector('#comment').value,
                "jeux_id": 18
            }).then(function() {
                document.querySelector('#comment').value = '';
                listCommentaires()
            });
        }
        
        listCommentaires();
   */


