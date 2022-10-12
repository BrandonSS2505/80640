// var todo = document.getElementById("todo").value;

function leer(){
    return document.getElementById("todo").value
}

function agregar(){
    nodo = document.createElement("li")
    // texto = document.createTextNode("hola")
    texto = document.createTextNode(leer())
    console.log(texto)
    nodo.appendChild(texto)
    nodo.setAttribute("id","valor")
    document.getElementById("lista").appendChild(nodo)
}

function buscar(){
    //buscar por id
    if(document.getElementById(leer()) ==null){
        console.log("si existe")
    }else{
        alert("no existe")
    }

    
    // listaTodo = document.getElementsByTagName("li");
    // for (const element of listaTodo) {
    //     if (element.textContent == leer()){
    //         console.log("si existe", element)
    //     }else{
    //         console.log("no existe", element)
    //     }
        
    // }
}