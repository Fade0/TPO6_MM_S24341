<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
    <title>PokeMaster</title>
    <link rel="stylesheet" href = "style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&display=swap" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@700&display=swap" rel="stylesheet">
    <script src = "script.js"></script>

</head>
<body>
<div class="main_div">
    <div class="navbar">
        <div class="logo_div">
            <img class="logo_img" src="assets/pokemonLogo.png">
        </div>
        <div class="search_regular">
            <a>REGULAR SEARCH</a>
        </div>
    </div>
    <div class="page content"></div>
    <div class="div_text">
        <a>FIND YOUR POKEMON!</a>
    </div>
    <div class="mid_left">
        <form>
            <input type="text"   id="pokemon_name"  name="pokemon_name"     placeholder = "NAME"><br><br><br>
            <input type="text"   id="pokemon_id"    name="pokemon_id"       placeholder = "ID"><br><br><br>
            <input type="text"   id="pokemon_type"  name="pokemon_type"     placeholder = "TYPE"><br><br><br>
            <input type="button" id="submit_button" name="submitter"        value = "SEARCH" onclick = "n()">
        </form>
    </div>
    <div class="output_div">
        <div class="pokemon_name_output">
            <p>
                <a>MUDKIP</a><br>
            </p>

            <img id="img_maybe" src="assets/mudkip.png" alt="ooga booga" width="100px" height="350px">
        </div>
        <div id = "sec_half" style="overflow:scroll; width:500px;  height: 500px; padding-top: 20px; padding-bottom: 20px">

        </div>
    </div>
</div>
</body>
</html>