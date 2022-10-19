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
    listaTodo = document.getElementsByTagName("li")
    for (let tarea in listaTodo){
        if (Object.hasOwnProperty.call(listaTodo, tarea)){
            a = listaTodo[tarea].childNodes [0]
            b = leer()
            console.log("a", typeof a.textContent, "b", typeof b)
            if(){
                
            }
        }
    }
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