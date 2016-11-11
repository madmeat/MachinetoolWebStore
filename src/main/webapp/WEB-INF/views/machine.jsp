<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
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

        <title>Three Roll Mills</title>
        
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
                  
                <!--</li>-->
                <li class="breadcrumb-nav-holder"> 
                    <ul>
                        <li class="breadcrumb-item">
                            <a href="<c:url value='/index'/>">Главная</a>
                        </li> 
                        <!--/.breadcrumb-item--> 
                        <li class="breadcrumb-item">
                            <a href="<c:url value='/machines'/>">Three Roll Mills</a>
                        </li>
                        <li class="breadcrumb-item current">
                            <a href="">${machine.brand} ${machine.model} ${machine.type}</a>
                        </li> 
                        <!--/.breadcrumb-item--> 
                    </ul>
                </li> 
                <!--/.breadcrumb-nav-holder--> 

            </ul> 
            <!--/.inline--> 
        </nav>

    </div> 
        <!--/.container--> 
</div> 
    <!--/#top-mega-nav--> 






<!-- ========================================= BREADCRUMB : END ========================================= -->
</div>     <div id="single-product">
    <div class="container">

         <div class="no-margin col-xs-12 col-sm-6 col-md-5 gallery-holder">
    <div class="product-item-holder size-big single-product-gallery small-gallery">

        <div id="owl-single-product">
            
            <c:forEach items="${machine.photoList}" var="photo" varStatus="counter">
                <div class="single-product-gallery-item" id="slide${counter.count}">
                    <a data-rel="prettyphoto" href="<c:url value='/static/assets/images/products/${photo.imageName}'/>">
                        <img class="img-responsive" alt="" 
                            src="<c:url value='/static/assets/images/products/${photo.imageName}'/>" 
                            data-echo="<c:url value='/static/assets/images/products/${photo.imageName}'/>" />
                    </a>
                </div>
            </c:forEach>
            
            
            
        </div><!-- /.single-product-slider -->


        <div class="single-product-gallery-thumbs gallery-thumbs">

            <div id="owl-single-product-thumbnails">
                <c:forEach items="${machine.photoList}" var="photo" varStatus="counter">
                    <a class="horizontal-thumb active" data-target="#owl-single-product" data-slide="${counter.index}" href="#slide${counter.count}">
                        <img width="67" alt="" src="<c:url value='/static/assets/images/products/${photo.imageName}'/>" 
                         data-echo="<c:url value='/static/assets/images/products/${photo.imageName}'/>" />
                    </a>
                </c:forEach>

            </div> 
                <!--/#owl-single-product-thumbnails--> 

            <div class="nav-holder left hidden-xs">
                <a class="prev-btn slider-prev" data-target="#owl-single-product-thumbnails" href="#prev"></a>
            </div> 
            <!--/.nav-holder--> 
            
            <div class="nav-holder right hidden-xs">
                <a class="next-btn slider-next" data-target="#owl-single-product-thumbnails" href="#next"></a>
            </div> 
            <!--/.nav-holder--> 

        </div>
                <!-- /.gallery-thumbs -->

    </div><!-- /.single-product-gallery -->
</div><!-- /.gallery-holder -->        
        <div class="no-margin col-xs-12 col-sm-7 body-holder">
    <div class="body">
        <!--<div class="star-holder inline"><div class="star" data-score="4"></div></div>-->
        <div class="availability"><label>Availability:</label><span class="available">  in stock</span></div>

        <div class="title"><a href="#">${machine.brand} ${machine.model} ${machine.type}</a></div>
        <div class="brand">${machine.yearOfIssue} | Location: ${machine.location}   </div>

<!--        <div class="social-row">
            <span class="st_facebook_hcount"></span>
            <span class="st_twitter_hcount"></span>
        </div>-->

        <div class="buttons-holder">
            <a href="/download-pdf-${machine.id}"><img style="margin-right: 10px" width="110" height="30" src="<c:url value='/static/assets/images/download-pdf-button.png'/>"</a>
            <a class="btn-add-to-wishlist" href="add-product-to-wish-list.htm?id=${machine.id}">add to wishlist</a>
            <a class="btn-add-to-compare" href="add-product-to-compare-${machine.id}">Сравнить</a>
        </div>

        <div class="excerpt">
            <p>${machine.description}</p>
            
        </div>
        
        <div class="prices">
<!--            <div class="price-current">$1740.00</div>
            <div class="price-prev">$2199.00</div>-->
        </div>

        <div class="qnt-holder">
<!--            <div class="le-quantity">
                <form>
                    <a class="minus" href="#reduce"></a>
                    <input name="quantity" readonly="readonly" type="text" value="1" />
                    <a class="plus" href="#add"></a>
                </form>
            </div>-->
            <a id="addto-cart" href="add-product-to-customer-basket.htm?id=${machine.id}" class="le-button huge">add to cart</a>
        </div><!-- /.qnt-holder -->
    </div><!-- /.body -->

</div><!-- /.body-holder -->
    </div><!-- /.container -->
    
    
    
    
    
</div><!-- /.single-product -->

<!-- ========================================= SINGLE PRODUCT TAB ========================================= -->
<section id="single-product-tab">
    <div class="container">
        <div class="tab-holder">
            
            <ul class="nav nav-tabs simple" >
                <li class="active"><a href="#description" data-toggle="tab">Видео</a></li>
                <li><a href="#additional-info" data-toggle="tab">Характеристики</a></li>
            </ul>

            <div class="tab-content clearfix">
                <div class="tab-pane active" id="description">
<!--                    <div class="row">
                        <c:forEach items="${machine.videoList}" var="video">
                            <div class="col-md-4">
                                <iframe width="100%" height="200" src="${video.videoUrl}" frameborder="0" allowfullscreen></iframe>
                            </div>
                        </c:forEach>
                    </div>
                   -->
                    <div class="meta-row">
                        <div class="inline">
                            <label>SKU:</label>
                            <span>${machine.commonId}</span>
                        </div><!-- /.inline -->

                        <span class="seperator">/</span>

                        <div class="inline">
                            <label>categories:</label>
                            <!--<span><a href="#">-50% sale</a>,</span>-->
                            <span><a href="#">cat1</a>,</span>
                            <span><a href="#">cat2</a></span>
                        </div><!-- /.inline -->

                        <span class="seperator">/</span>

                        <div class="inline">
                            <label>tag:</label>
                            <span><a href="#">tag1</a>,</span>
                            <span><a href="#">tag1</a>,</span>
                            <span><a href="#">tag1</a></span>
                        </div><!-- /.inline -->
                    </div><!-- /.meta-row -->
                </div><!-- /.tab-pane #description -->

                <div class="tab-pane" id="additional-info">
                    
                <ul class="tabled-data">
                    <li>
                        <label>ID</label>
                        <div class="value">${machine.commonId}</div>
                    </li>
                    <li>
                        <label>Бренд</label>
                        <div class="value">${machine.brand}</div>
                    </li>
                    <li>
                        <label>Модель</label>
                        <div class="value">${machine.model}</div>    
                    </li>
                    <li>
                        <label>Тип</label>
                        <div class="value">${machine.type}</div>
                    </li>                
                    <li>
                        <label>Производитель</label>
                        <div class="value">${machine.manufacturer}</div>
                    </li>
                    <li>
                        <label>Состояние</label>
                        <div class="value">${machine.machineState}</div>
                    </li>
                    <li>
                        <label>Год выпуска</label>
                        <div class="value">${machine.yearOfIssue}</div>
                    </li>
                    <li>
                        <label>Место расположения</label>
                        <div class="value">${machine.location}</div>
                    </li>
                    <li>
                        <label>Продано</label>
                        <div class="value">${machine.sales}</div>
                    </li>
                    <li>
                        <label>Толщина материала, мм</label>
                        <div class="value">${machine.materialThickness}</div>
                    </li>
                    <li>
                        <label>Ширина материала, мм</label>
                        <div class="value">${machine.materialWidth}</div>
                    </li>
                    <li>
                        <label>Скорость гибки, м/мин</label>
                        <div class="value">${machine.bendingSpeed}</div>
                    </li>
                    <li>
                        <label>Min диаметр при max сгибе, мм</label>
                        <div class="value">${machine.minDiameterMaxBend}</div>
                    </li>
                    <li>
                        <label>Диаметр верхнего ролика, мм</label>
                        <div class="value">${machine.topRollDiameter}</div>
                    </li>
                    <li>
                        <label>Диаметр среднего ролика, мм</label>
                        <div class="value">${machine.middleRollDiameter}</div>
                    </li>
                    <li>
                        <label>Расстояние между нижними двумя волками, мм</label>
                        <div class="value">${machine.distanceOfBottomTwoRolls}</div>
                    </li>
                    <li>
                        <label>Условный предел текучести для гибочного листа, МПа</label>
                        <div class="value">${machine.materialProofStress}</div>
                    </li>
                    <li>
                        <label>Мощность главного двигателя, кВт</label>
                        <div class="value">${machine.mainEnginePower}</div>
                    </li>
                    <li>
                        <label>Габариты ДВШ, мм</label>
                        <div class="value">${machine.machineDimensions}</div>
                    </li>
                    <li>
                        <label>Вес станка, кг</label>
                        <div class="value">${machine.machineWeight}</div>
                    </li>
                    <li>
                        <label>Цена, $</label>
                        <div class="value">${machine.machinePrice}</div>
                    </li>
                </ul><!-- /.tabled-data -->

                    <div class="meta-row">
                        <div class="inline">
                            <label>SKU:</label>
                            <span>${machine.commonId}</span>
                        </div><!-- /.inline -->

                        <span class="seperator">/</span>

                        <div class="inline">
                            <label>categories:</label>
                            <!--<span><a href="#">-50% sale</a>,</span>-->
                            <span><a href="#">cat1</a>,</span>
                            <span><a href="#">cat2</a></span>
                        </div><!-- /.inline -->

                        <span class="seperator">/</span>

                        <div class="inline">
                            <label>tag:</label>
                            <span><a href="#">tag1</a>,</span>
                            <span><a href="#">tag2</a>,</span>
                            <span><a href="#">tag3</a></span>
                        </div><!-- /.inline -->
                    </div><!-- /.meta-row -->
                </div><!-- /.tab-pane #additional-info -->
        </div><!-- /.tab-holder -->
    </div><!-- /.container -->
</section><!-- /#single-product-tab -->
<!-- ========================================= SINGLE PRODUCT TAB : END ========================================= -->

<!-- ========================================= RECENTLY VIEWED ========================================= -->

<!-- ========================================= RECENTLY VIEWED : END ========================================= -->      <!-- ============================================================= FOOTER ============================================================= -->

<%@include file="fragments/footer.jsp" %>

<!-- ============================================================= FOOTER : END ============================================================= -->   </div><!-- /.wrapper -->

    <!-- JavaScripts placed at the end of the document so the pages load faster -->
    <script src="<c:url value='/static/assets/js/jquery-1.10.2.min.js'/>"></script>
    <script src="<c:url value='/static/assets/js/jquery-migrate-1.2.1.js'/>"></script>
    <script src="<c:url value='/static/assets/js/jquery.session.js'/>"></script>
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
    <script src="<c:url value='/static/assets/js/compare-handler.js'/>"></script>

</body>
</html>