<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
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
        <div class="search_advanced">
            <a>ADVANCED SEARCH</a>
        </div>
    </div>
    <div class="page content"></div>
    <div class="div_text">
        <a>FIND YOUR POKEMON!</a>
    </div>
    <div class="mid_left">
        <form>
            <input type="text"   id="pokemon_name"  name="pokemon_name"     value = "NAME"><br><br><br>
            <input type="text"   id="pokemon_id"    name="pokemon_id"       value = "ID"><br><br><br>
            <input type="text"   id="pokemon_type"  name="pokemon_type"     value = "TYPE"><br><br><br>
            <input type="button" id="submit_button" name="submiter"         value = "SEARCH" onclick = "n()">
        </form>
    </div>
    <div class="output_div">
        <div class="pokemon_name_output">
            <p>
                <a>MUDKIP</a><br>
            </p>

            <img id="img_maybe" src="assets/mudkip.webp" alt="ooga booga" width="100px" height="350px">
        </div>
        <div class="sec_half">
            <p>
                <a id="pokemon_type_output">type 1 + type 2</a><br><br><br>
                    <a id="pokemon_id_output">id</a><br><br><br>
                    <a id="pokemon_hp_output">hp</a><br><br><br>
                    <a id="pokemon_ad_output">ad</a><br><br><br>
                    <a id="pokemon_def_output">def</a><br><br><br>
                    <a id="pokemon_speed_output">speed</a><br><br>
            </p>
        </div>
    </div>
</div>
</body>
</html>