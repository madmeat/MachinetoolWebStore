<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Meta -->
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <meta name="keywords" content="MediaCenter, Template, eCommerce">
        <meta name="robots" content="all">

        <title>Tree Roll Mills Page</title>

        <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" href="<c:url value='/static/assets/css/bootstrap.min.css'/>"/>
        
        <!-- Customizable CSS -->
        
        <link rel="stylesheet" href="<c:url value ='/static/assets/css/main.css'/>"/>
        <link rel="stylesheet" href="<c:url value ='/static/assets/css/green.css'/>"/>
        <link rel="stylesheet" href="<c:url value ='/static/assets/css/owl.carousel.css'/>"/>
        <link rel="stylesheet" href="<c:url value ='/static/assets/css/owl.transitions.css'/>"/>
        <link rel="stylesheet" href="<c:url value ='/static/assets/css/animate.min.css'/>"/>

        <!-- Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800' rel='stylesheet' type='text/css'>
        
        <!-- Icons/Glyphs -->
        <link rel="stylesheet" href="<c:url value ='/static/assets/css/font-awesome.min.css'/>"/>
        
        <!-- Favicon -->
        <link rel="shortcut icon" href="<c:url value ='/static/assets/images/favicon.ico'/>"/>

        <!-- HTML5 elements and media queries Support for IE8 : HTML5 shim and Respond.js -->
        <!--[if lt IE 9]>
            <script src="resources/assets/js/html5shiv.js"></script>
            <script src="resources/assets/js/respond.min.js"></script>
        <![endif]-->
    </head>
<body>
   
    <div class="wrapper">
        <!-- ============================================================= TOP NAVIGATION ============================================================= -->

              
<!-- ============================================================= TOP NAVIGATION ============================================================= -->
<%@include file='fragments/nav.jsp' %>        
<!-- ============================================================= TOP NAVIGATION : END ============================================================= -->       <!-- ============================================================= HEADER ============================================================= -->
<%@include file='fragments/header.jsp' %>
<!-- ============================================================= HEADER : END ============================================================= --><div class="animate-dropdown"><!-- ========================================= BREADCRUMB ========================================= -->
  
        
        
<!-- ============================================================= HEADER : END ============================================================= -->       <div id="top-banner-and-menu">
    <div class="container">
        
        <div class="col-xs-12 col-sm-4 col-md-3 sidemenu-holder">
            <!-- ================================== TOP NAVIGATION ================================== -->
<div class="side-menu animate-dropdown">
    <div class="head"><i class="fa fa-list"></i> Разделы</div>        
    <nav class="yamm megamenu-horizontal" role="navigation">
        <ul class="nav">

            

        
            
            <!--<li><a href="vmc.htm">IPhone 5</a></li>-->
            <li><a href="<c:url value='/machines'/>">Three Roll Mills</a></li>
            <li><a href="<c:url value='/admin'/>">admin page</a></li>
            <!--<li><a href="vmc.htm">IPhone 7</a></li>-->
<!--            <li><a href="#">Horizontal machine CNC</a></li>
            -->
        </ul><!-- /.nav -->
    </nav><!-- /.megamenu-horizontal -->
</div><!-- /.side-menu -->
<!-- ================================== TOP NAVIGATION : END ================================== -->     </div><!-- /.sidemenu-holder -->

        <div class="col-xs-12 col-sm-8 col-md-9 homebanner-holder">
            <!-- ========================================== SECTION â HERO ========================================= -->
            
<div id="hero">
    <div id="owl-main" class="owl-carousel owl-inner-nav owl-ui-sm">
        
        <div class="item" style="background-image: url(<c:url value='/static/assets/images/sliders/index_slide_1.jpg'/>);">
            <div class="container-fluid">
                   <div class="caption vertical-center text-left">
                    <div class="big-text fadeInDown-1">
                        <!--Want a<span class="big"><span class="sign">$</span>200</span>Discount?-->
                       <span class="big"><span class="sign"></span></span>Some text 
                    </div>

                    <div class="excerpt fadeInDown-2">
                        <!--on selected <br>desktop pcs<br>-->
                        <!--Deckel Maho<br>Germany<br>-->
                        <br>Some text<br>
                    </div>
                    <div class="small fadeInDown-2">
                        <!--terms and conditions apply-->
                        Some Text
                    </div>
<!--                    <div class="button-holder fadeInDown-3">
                        <a href="single-product.html" class="big le-button ">shop now</a>
                    </div>-->
                </div>
            </div><!-- /.container-fluid -->
        </div><!-- /.item -->
        
        

        <!--<div class="item" style="background-image: url(resources/assets/images/sliders/slider03.jpg);">-->
        <div class="item" style="background-image: url(<c:url value='/static/assets/images/sliders/index_slide_2.jpg'/>);">
            <div class="container-fluid">
                <div class="caption vertical-center text-left">
                    <div class="big-text fadeInDown-1">
                        <!--Want a<span class="big"><span class="sign">$</span>200</span>Discount?-->
                        <span class="big"><span class="sign"></span> </span>Some text
                    </div>

                    <div class="excerpt fadeInDown-2">
                        <!--on selected <br>desktop pcs<br>-->
                        <br>Some text<br>
                    </div>
                    <div class="small fadeInDown-2">
                        <!--terms and conditions apply-->
                        Some text
                    </div>
<!--                    <div class="button-holder fadeInDown-3">
                        <a href="single-product.html" class="big le-button ">shop now</a>
                    </div>-->
                </div>
                <!-- /.caption -->
            </div><!-- /.container-fluid -->
        </div><!-- /.item -->
        
        <div class="item" style="background-image: url(<c:url value='/static/assets/images/sliders/index_slide_3.jpg'/>);">
            <div class="container-fluid">
                <div class="caption vertical-center text-left">
                    <div class="big-text fadeInDown-1">
                        <span class="big"><span class="sign"></span></span>Some text
                    </div>

                    <div class="excerpt fadeInDown-2">
                        <!--on selected <br>desktop pcs<br>-->
                        <br>Some text<br>
                    </div>
                    <div class="small fadeInDown-2">
                         Some text
                    </div>
<!--                    <div class="button-holder fadeInDown-3">
                        <a href="single-product.html" class="big le-button ">shop now</a>
                    </div>-->
                </div><!-- /.caption -->
            </div><!-- /.container-fluid -->
        </div><!-- /.item -->

    </div><!-- /.owl-carousel -->
</div>
            
<!-- ========================================= SECTION â HERO : END ========================================= -->           
        </div><!-- /.homebanner-holder -->

    </div><!-- /.container -->
</div><!-- /#top-banner-and-menu -->


<!-- ========================================= RECENTLY VIEWED : END ========================================= -->
<!-- ========================================= TOP BRANDS ========================================= -->
<section id="top-brands" class="wow fadeInUp">
    <div class="container">
        <div class="carousel-holder" >
            
            <div class="title-nav">
                <h1>Top Brands</h1>
                <div class="nav-holder">
                    <a href="#prev" data-target="#owl-brands" class="slider-prev btn-prev fa fa-angle-left"></a>
                    <a href="#next" data-target="#owl-brands" class="slider-next btn-next fa fa-angle-right"></a>
                </div>
            </div> 
            <!--/.title-nav--> 
            
            <div id="owl-brands" class="owl-carousel brands-carousel">
                
                <div class="carousel-item">
                    <!--<a href="#">-->
                    <img alt="LOGO" src="<c:url value='/static/assets/images/brands/#'/>" />
                    <!--</a>-->
                </div> 
                <!--/.carousel-item--> 
                
                <div class="carousel-item">
                    <!--<a href="#">-->
                        <img alt="LOGO" src="<c:url value='/static/assets/images/brands/#'/>" />
                    <!--</a>-->
                </div> 


               
            </div> 
            <!--/.brands-caresoul--> 

        </div> 
        <!--/.carousel-holder--> 
    </div> 
    <!--/.container--> 
</section> 
<!--/#top-brands--> 
<!-- ========================================= TOP BRANDS : END ========================================= -->       <!-- ============================================================= FOOTER ============================================================= -->

<%@include file='fragments/footer.jsp' %>

<!-- ============================================================= FOOTER : END ============================================================= -->   </div><!-- /.wrapper -->

    
    
    
    <!-- For demo purposes â can be removed on production : End -->

    <!-- JavaScripts placed at the end of the document so the pages load faster -->
    <script src="<c:url value='/static/assets/js/jquery-1.10.2.min.js'/>"></script>
    <script src="<c:url value='/static/assets/js/jquery-migrate-1.2.1.js'/>"></script>
    <script src="<c:url value='/static/assets/js/bootstrap.min.js'/>"></script>
    <script src="http://maps.google.com/maps/api/js?sensor=false&amp;language=en"></script>
    <script src="<c:url value='/static/assets/js/gmap3.min.js'/>"></script>
    <script src="<c:url value='/static/assets/js/bootstrap-hover-dropdown.min.js'/>"></script>
    <script src="<c:url value='/static/assets/js/owl.carousel.min.js'/>"></script>
    <script src="<c:url value='/static/assets/js/css_browser_selector.min.js'/>"></script>
    <script src="<c:url value='/static/assets/js/echo.min.js'/>"></script>
    <script src="<c:url value='/static/assets/js/jquery.easing-1.3.min.js'/>"></script>
    <script src="<c:url value='/static/assets/js/bootstrap-slider.min.js'/>"></script>
    <script src="<c:url value='/static/assets/js/jquery.raty.min.js'/>"></script>
    <script src="<c:url value='/static/assets/js/jquery.prettyPhoto.min.js'/>"></script>
    <script src="<c:url value='/static/assets/js/jquery.customSelect.min.js'/>"></script>
    <script src="<c:url value='/static/assets/js/wow.min.js'/>"></script>
    <script src="<c:url value='/static/assets/js/scripts.js'/>"></script>

    <!-- For demo purposes â can be removed on production -->
    
    <script src="<c:url value='/static/assets/switchstylesheet/switchstylesheet.js'/>"></script>
    
    <script>
        $(document).ready(function(){ 
            $(".changecolor").switchstylesheet( { seperator:"color"} );
            $('.show-theme-options').click(function(){
                $(this).parent().toggleClass('open');
                return false;
            });
        });

        $(window).bind("load", function() {
           $('.show-theme-options').delay(2000).trigger('click');
        });
    </script>
    <!-- For demo purposes â can be removed on production : End -->

    <script src="http://w.sharethis.com/button/buttons.js"></script>

</body>
</html>