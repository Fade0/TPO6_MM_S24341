async function n(){
    document.getElementById("output").innerText = ""
    const response = await fetch ("http://localhost:8080/TPO6_MM_S24341_war_exploded/book-store?author=J.R.R. Tolkien")
    const tempJson = await response.json()
    tempJson.forEach((item)=>{
        document.getElementById("output").innerText = document.getElementById("output").innerText
            + item.author + "\n" +
            + item.title + "\n" +
            + item.description + "\n" +
            + item.isbn + "\n" +
            + item.publishDate + "\n" +
            + item. rating + "\n" +
            + item.creationDate + "\n"
    })


}