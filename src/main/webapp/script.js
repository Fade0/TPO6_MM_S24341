const apiUrl = "http://localhost:8080/TPO6_MM_S24341_war_exploded/pokecenter"



function createNewUrl() {
const form = document.querySelectorAll('#pokemon_id, #pokemon_name, #pokemon_type');

let url = apiUrl
let empty = true;

for(let i = 0; i < form.length; i++){
    if(form[i].value == null || form[i].value === '') {
        continue;
    }

    if(empty) {
        url = url + "?";
        empty = false;
    }
    else{
        url = url + "&";
    }

    url = url + form[i].name + "=" + form[i].value;
}

return url;
}

async function n(){
    document.getElementById("sec_half").innerText = ""
    var a = createNewUrl()
    console.log(a)
    const response = await fetch(createNewUrl())
    const tempJson = await response.json()
    tempJson.forEach((item)=>{
        document.getElementById("sec_half").innerText = document.getElementById("sec_half").innerText
            + item.pokemon_id + " "
            + item.name + " "
            + item.type_primary + " "
            + item.type_secondary + " "
            + item.hp + " "
            + item.attack + " "
            + item.defense + " "
            + item.speed + " "
            +"\n"
    })


}