<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en" dir="ltr">

<head>
  <meta charset="utf-8">
  <title>Air Avenue</title>
  <script src="https://kit.fontawesome.com/b96d968a85.js" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Bree+Serif&display=swap" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Changa&display=swap" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Ubuntu:ital,wght@0,400;1,700&display=swap" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@900&display=swap" rel="stylesheet">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  <link href="https://fonts.googleapis.com/css2?family=Ubuntu&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="resources/style.css">
</head>

<body>
  <div class="navigation">


    <div id="header" class="navbar nav navbar-expand-md">








      <img class="navbar-brand logo" src="resources/images/logo 2.jpg" alt="image not found">



      <ul class="navbar-nav item">
        <li class="nav-item"> <a class="nav-link" href="#homw">Home</a> </li>
        <li class="nav-item"> <a class="nav-link" href="#about">About</a> </li>
        <li class="nav-item"> <a class="nav-link" href="#service">Service</a> </li>
        <li class="nav-item"> <a class="nav-link" href="#contact">Contact</a> </li>

      </ul>
    </div>
  </div>

  <div id="home">
    <h1 class="tagline">Fly the friendly skies with us</h1>
    <div class="home-button">

    </div>
    <button type="button" class="btn btn-dark btn-lg home-btn"><i class="fa-brands fa-apple"></i> Download</button>
    <a href="search">
    <button type="button" class="btn btn-lg btn-light home-btn book" name="book"> <i class="fa-solid fa-check-double"></i>Book Now</button>
    </a>
    <button type="button" class=" btn btn-dark btn-lg download home-btn"><i class="fa-brands fa-google-play"></i> Download</button>
  </div>
  <section id="service">

    <div class="row service-row">

      <div class="feature-box col-md-4">

        <i class="fa-solid fa-plane-circle-check fa-4x"></i>
        <h3> Tickets booking</h3>
        <p>Book tickets without commition</p>
      </div>
      <div class="feature-box col-md-4">
        <i class="fa-solid fa-taxi fa-4x"></i>
        <h3>Taxi Service</h3>
        <p>Home pick-up facility(T&C applied)</p>
      </div>
      <div class="feature-box col-md-4">
        <i class="fa-solid fa-pot-food fa-4x"></i>
        <h3>Complementry Meals</h3>
        <p>One complementry meal with each ticket</p>
      </div>
    </div>

  </section>
  <div class="destination">
    <h1 class="destination-tagline ">Top travel destinations </h1>
    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
      <ol class="carousel-indicators">
        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>


      </ol>
      <div class="carousel-inner">
        <div class="carousel-item active">

          <div class="row">
            <div class="col col-lg-6">
              <img class="destination-img" src="resources/images/taj-mahal.jpg" alt="">
              <h3>Taj Mahal,Agra</h3>
            </div>
            <div class="col col-lg-6">
              <img class="destination-img" src="resources/images/Kapaleeshwarar Temple.jpg" alt="">
              <h3>Kapaleeshwarar Temple, Chennai</h3>
            </div>

          </div>

        </div>
        <div class="carousel-item">
          <div class="row">
            <div class="col col-lg-6">
              <img class="destination-img" src="resources/images/Gateway of India.jpg" alt="">
              <h3>Gateway of India, Mumbai</h3>
            </div>
            <div class="col col-lg-6">
              <img class="destination-img" src="resources/images/Golden Temple.jpg" alt="">
              <h3>Golden Temple,Panjab</h3>
            </div>

          </div>
        </div>

        <div class="carousel-item">
          <div class="row">
            <div class="col col-lg-6">
              <img class="destination-img" src="resources/images/Cola Beach.jpg" alt="">
              <h3>Cola Beach, Goa</h3>
            </div>
            <div class="col col-lg-6">
              <img class="destination-img" src="resources/images/Bada Bagh.jpg" alt="">
              <h3>Bada Bagh, Jaisalmer</h3>
            </div>

          </div>
        </div>


      </div>
      <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>
  </div>

  <div id="about">
    <div class="row about-row">


      <div class="col col-lg-6 ">

        <div class="about-text">

          <h3 class="about-heading">Why Air Avenue?</h3>
          <p class="text">
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
            aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
          </p>
        </div>
      </div>
      <div class="col col-lg-6 about-img">


        <img class="img" src="resources/images/logo 2.jpg" alt="">
      </div>
    </div>
  </div>

  <div id="contact">
    <i class="fa-brands fa-twitter"></i>
    <i class="fa-brands fa-facebook"></i>
    <i class="fa-brands fa-instagram"></i>
    <i class="fa-solid fa-envelope"></i>
    <br />
    <p>© Copyright Air Avenue</p>

  </div>


</body>

</html>
