<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

        <title>MediaCenter - Responsive eCommerce Template</title>

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
        <script   src="https://code.jquery.com/jquery-2.2.4.min.js"   integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="   crossorigin="anonymous"></script>
    </head>
<body>
    
    <div class="wrapper">

        
<!-- ============================================================= TOP NAVIGATION ============================================================= -->
<%@include file="fragments/nav.jsp" %>        
<!-- ============================================================= TOP NAVIGATION : END ============================================================= -->       <!-- ============================================================= HEADER ============================================================= -->
<%@include file="fragments/header.jsp" %>
<!-- ============================================================= HEADER : END ============================================================= --><div class="animate-dropdown"><!-- ========================================= BREADCRUMB ========================================= -->

    
    
    <div id="top-mega-nav">
    <div class="container">
        <nav>
            <ul class="inline">
                       <%@include file="fragments/dropdown le-dropdown.jsp" %>
                
                <li class="breadcrumb-nav-holder"> 
                    <ul>
                        <li class="breadcrumb-item">
                            <a href="/index">Home</a>
                        </li>
                        <li class="breadcrumb-item current gray">
                            <!--<a href="index.php?page=compaore">Product Comparison</a>-->
                            <a href="#">Product Comparison</a>
                        </li>
                    </ul>
                </li> 
                <!--/.breadcrumb-nav-holder--> 
            </ul>
        </nav>
    </div>
        <!--/.container--> 
</div> 
    <!--/#top-mega-nav--> 
<!-- ========================================= BREADCRUMB : END ========================================= --></div>     <div class="main-content" id="main-content">
    <div class="container">
        <div class="inner-xs">
            <div class="page-header">
                <h2 class="page-title">
                    Product Comparison            
                </h2>
            </div>
        </div><!-- /.section-page-title -->

        <div class="table-responsive inner-bottom-xs inner-top-xs">

            <table class="table table-bordered table-striped compare-list">
                <thead>
                    <tr class="product-images">
                        <td>&nbsp;</td>
<!--                        dynamic content-->
                    </tr>
                </thead>
                <tbody>     
                    <tr class="type-cell cell-format">
                        <th>Тип</th>
                    </tr>
                    <tr class="model-cell cell-format">
                        <th>Модель</th> 
                    </tr>
                    <tr class="brand-cell cell-format">
                        <th>Брэнд</th> 
                    </tr>                
                    <tr class="manufacturer-cell cell-format">
                        <th>Производитель</th> 
                    </tr>
                    <tr class="machine-state-cell cell-format">
                        <th>Состояние</th> 
                    </tr>
                    <tr class="year-of-issue-cell cell-format">
                        <th>Год выпуска</th> 
                    </tr>
                    <tr class="location-cell cell-format">
                        <th>Место нахождения</th> 
                    </tr>
                    <tr class="material-thickness-cell cell-format">
                        <th>Толщина материала</th> 
                    </tr>
                    <tr class="material-width-cell cell-format">
                        <th>Ширина материала</th> 
                    </tr>
                    <tr class="bending-speed-cell cell-format">
                        <th>Скорость гибки</th>
                    </tr>
                    <tr class="min-diameter-max-bend-cell cell-format">
                        <th>Мин. диаметр при макс. сгибе</th>
                    </tr>
                    <tr class="top-roll-diameter-cell cell-format">
                        <th>Диаметр верхнего ролика</th> 
                    </tr>
                    <tr class="middle-roll-diameter-cell cell-format">
                        <th>Диаметр среднего ролика</th> 
                    </tr>
                    <tr class="distance-of-bottom-two-rolls-cell cell-format">
                        <th>Расстояние между нижними двумя волками</th> 
                    </tr>
                    <tr class="material-proof-stress-cell cell-format">
                        <th>Условный предел текучести</th> 
                    </tr>
                    <tr class="main-engine-power-cell cell-format">
                        <th>Мощность главного двигателя</th> 
                    </tr>
                    <tr class="machine-dimensions-cell cell-format">
                        <th>Габариты ДВШ</th> 
                    </tr>
                    <tr class="machine-weight-cell cell-format">
                        <th>Вес станка</th> 
                    </tr>
                    <tr class="machine-price-cell cell-format">
                        <th>Цена</th> 
                    </tr>
                </tbody>
            </table>
        </div><!-- /.table-responsive -->
    </div><!-- /.container -->  
</div>   


<!-- ============================================================= FOOTER ============================================================= -->

<%@include file="fragments/footer.jsp" %>

<!-- ============================================================= FOOTER : END ============================================================= -->   </div><!-- /.wrapper -->

  
    <!-- JavaScripts placed at the end of the document so the pages load faster -->
    <script src="<c:url value='/static/assets/js/jquery.cookie.js'/>"></script>
    <script src="<c:url value='/static/assets/js/jquery.session.js'/>"></script>
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
    <script src="<c:url value='/static/assets/js/matcher.js'/>"></script>
    <script src="<c:url value='/static/assets/js/compare-handler.js'/>"></script>


    <!-- For demo purposes â can be removed on production -->
    
    <script src="<c:url value='/static/assets/switchstylesheet/switchstylesheet.js'/>"></script>
    
    <!-- For demo purposes â can be removed on production : End -->

    <script src="http://w.sharethis.com/button/buttons.js"></script>

</body>
</html>