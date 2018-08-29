/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var slideIndex = 0;
showSlides();

function showSlides() {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
    }
    slideIndex++;
    if (slideIndex > slides.length) {
        slideIndex = 1
    }
    slides[slideIndex - 1].style.display = "block";
    setTimeout(showSlides, 2000); // Change image every 2 seconds
}

//function for flexibility searches
function myFunction() {
    // Declare variables
    var input, filter, dataTable, outputText, a, i;
    input = document.getElementById("mySearch");
    filter = input.value.toUpperCase();
    dataTable = document.getElementById("myMenu");
    outputText = dataTable.getElementsByTagName("outputText");

    // Loop through all list items, and hide those who don't match the search query
    for (i = 0; i < outputText.length; i++) {
        a = outputText[i].getElementsByTagName("a")[0];
        if (a.innerHTML.toUpperCase().indexOf(filter) > -1) {
            outputText[i].style.display = "";
        } else {
            outputText[i].style.display = "none";
        }
    }
}

//Para copiar texto.
function myFunction2() {
    var copyText = document.getElementById("myInput");
    copyText.select();
    document.execCommand("copy");
    alert("Texto copiado: " + copyText.value);
}

$(document).ready(function() {
    $('#example').DataTable();
} );




