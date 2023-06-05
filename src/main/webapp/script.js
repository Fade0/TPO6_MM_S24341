async function n(){
    document.getElementById("sec_half").innerText = ""
    const response = await fetch ("http://localhost:8080/TPO6_MM_S24341_war_exploded/pokecenter?pokemon_id=1")
    const tempJson = await response.json()
    tempJson.forEach((item)=>{
        document.getElementById("sec_half").innerText = document.getElementById("sec_half").innerText
            + item.pokemon_id + "\n" +
            + item.name + "\n" +
            + item.type_primary + "\n" +
            + item.type_secondary + "\n" +
            + item.pokemon_hp + "\n" +
            + item.pokemon_attack + "\n" +
            + item.pokemon_defense + "\n"
    })


}
