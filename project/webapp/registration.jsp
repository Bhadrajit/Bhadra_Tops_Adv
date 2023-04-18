<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>aranoz</title>
    <link rel="icon" href="img/favicon.png">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- animate CSS -->
    <link rel="stylesheet" href="css/animate.css">
    <!-- owl carousel CSS -->
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <!-- font awesome CSS -->
    <link rel="stylesheet" href="css/all.css">
    <!-- flaticon CSS -->
    <link rel="stylesheet" href="css/flaticon.css">
    <link rel="stylesheet" href="css/themify-icons.css">
    <!-- font awesome CSS -->
    <link rel="stylesheet" href="css/magnific-popup.css">
    <!-- swiper CSS -->
    <link rel="stylesheet" href="css/slick.css">
    <!-- style CSS -->
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<%@ include file="header.jsp" %>
<%-- <%@ include file="slider.jsp" %> --%>
<%-- <%@ include file="content.jsp" %> --%>

<!-- ================ contact section start ================= -->
  <section class="contact-section padding_top">
    <div class="container">

      <div class="row">
        <div class="col-12">
          <h1 class="contact-title">Customer Registration</h1>
        </div>
        <div class="col-lg-8">
          <form class="form-contact contact_form" action="CustomerController" method="post" >
            <div class="row">
             
              <div class="col-sm-6">
                <div class="form-group">
                  <input class="form-control" name="firstname" id="name" type="text" onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Enter your First Name'" placeholder='Enter your First Name'>
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <input class="form-control" name="lastname" id="name" type="text" onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Enter your Last Name'" placeholder='Enter your Last Name'>
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <input name="gender" value="Male" id="name" type="radio"> Male
                <input  name="gender" value="FeMale" id="name" type="radio"> Female
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <input class="form-control" name="mobno" id="name" type="text" onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Enter your Mobile Number'" placeholder='Enter your Mobile Number'>
                </div>
              </div>
               <div class="col-12">
                <div class="form-group">

                  <textarea class="form-control w-100" name="address" id="message" cols="20" rows="5"
                    onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter Address'"
                    placeholder='Enter Address'></textarea>
                </div>
              </div>
              
              <div class="col-sm-6">
                <div class="form-group">
                  <input class="form-control" name="email" id="email" type="email" onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Enter email address'" placeholder='Enter email address'>
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <input class="form-control" name="password" id="name" type="password" onfocus="this.placeholder = ''"
                    onblur="this.placeholder = 'Enter your name'" placeholder='Enter your Password'>
                </div>
              </div>
             
            </div>
            <div class="form-group mt-3">
              <input type="submit" name="action" value="register" class="btn_3 button-contactForm"/>
            </div>
          </form>
        </div>
      
      </div>
    </div>
  </section>
  <!-- ================ contact section end ================= -->
 

<%@ include file="footer.jsp" %>





 <!-- jquery plugins here-->
    <script src="js/jquery-1.12.1.min.js"></script>
    <!-- popper js -->
    <script src="js/popper.min.js"></script>
    <!-- bootstrap js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- easing js -->
    <script src="js/jquery.magnific-popup.js"></script>
    <!-- swiper js -->
    <script src="js/swiper.min.js"></script>
    <!-- swiper js -->
    <script src="js/masonry.pkgd.js"></script>
    <!-- particles js -->
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.nice-select.min.js"></script>
    <!-- slick js -->
    <script src="js/slick.min.js"></script>
    <script src="js/jquery.counterup.min.js"></script>
    <script src="js/waypoints.min.js"></script>
    <script src="js/contact.js"></script>
    <script src="js/jquery.ajaxchimp.min.js"></script>
    <script src="js/jquery.form.js"></script>
    <script src="js/jquery.validate.min.js"></script>
    <script src="js/mail-script.js"></script>
    <!-- custom js -->
    <script src="js/custom.js"></script>
</body>

</html> 