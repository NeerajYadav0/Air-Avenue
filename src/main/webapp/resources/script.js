$("#date").datepicker();

function GetDetails()
{  alert("clicked");
alert(" js");
	 var init = document.getElementById("initialDetails");
  var moreText = document.getElementById("more");
  var btnText = document.getElementById("myBtn");

  if (init.style.display === "none") {
    init.style.display = "inline";
    btnText.innerHTML = "More Details"; 
    moreText.style.display = "none";
  } else {
    init.style.display = "none";
    btnText.innerHTML = "Less Details"; 
    moreText.style.display = "inline";
  }
}
$( "#myBtn" ).click(function()
{  alert("clicked");
   alert(" js");
	 var init = document.getElementById("initialDetails");
  var moreText = document.getElementById("more");
  var btnText = document.getElementById("myBtn");

  if (init.style.display === "none") {
    init.style.display = "inline";
    btnText.innerHTML = "More Details"; 
    moreText.style.display = "none";
  } else {
    init.style.display = "none";
    btnText.innerHTML = "Less Details"; 
    moreText.style.display = "inline";
  }
});