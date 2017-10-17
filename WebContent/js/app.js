"use strict"

var resultDiv = document.getElementById("results");
resultDiv.innerHTML = "<p>Message injected from js..!!</p>";

// function is object

function showMessage(msg){
	console.log(msg);
} 

showMessage("msg"); 

function take(){
	var xmlhttp;
	xmlhttp = new XMLHttpRequest();
	xmlhttp.open("GET","insert.php?nm="+document.getElementById("username").value+"&ct="+document.getElementById("password").value,false);
	xmlhttp.send(null);
}