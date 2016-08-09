<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Metah -->
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

<!-- ============================================================= TOP NAVIGATION ============================================================= -->
<%@include file="fragments/nav.jsp" %>        
<!-- ============================================================= TOP NAVIGATION : END ============================================================= -->       <!-- ============================================================= HEADER ============================================================= -->
<%@include file="fragments/header.jsp" %>
<!-- ============================================================= HEADER : END ============================================================= --><div class="animate-dropdown"><!-- ========================================= BREADCRUMB ========================================= -->
  
        
<!-- ============================================================= HEADER : END ============================================================= --><div class="animate-dropdown"><!-- ========================================= BREADCRUMB ========================================= -->
<div id="top-mega-nav">
    <div class="container">
        <nav>
            <ul class="inline">
<!--                <li class="dropdown le-dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-list"></i> shop by department
                    </a>-->
                    
<!--                    <ul class="dropdown-menu">
                        <li><a href="#">IPhone</a></li>
                        <li><a href="#">CPUs, Processors</a></li>
                    </ul>-->
                <!--</li>-->
                      <%@include file="fragments/dropdown le-dropdown.jsp" %>

                <li class="breadcrumb-nav-holder"> 
                    <ul>
                 
                        <!--/.breadcrumb-item--> 

                        <li class="breadcrumb-item">
                            <a href="<c:url value='/index'/>">Home</a>
                        </li> 
                        <!--/.breadcrumb-item--> 

                        <li class="breadcrumb-item current">
                            <a href="<c:url value='/machines'/>">Three Roll Mills</a>
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


<!-- ========================================= BREADCRUMB : END ========================================= --></div>     <section id="category-grid">
    <div class="container">
     
        <!-- ========================================= SIDEBAR ========================================= -->
        <div class="col-xs-12 col-sm-3 no-margin sidebar narrow">

            <!-- ========================================= PRODUCT FILTER ========================================= -->
            <div class="widget">
                <h1>My filter</h1>
                <form action="#" id="filter-form">
                    <div class="body bordered" style="display: none">
                        <!-- Сортируем по типу -->
                        <div class="category-filter cb-category-filter">
                            <h5>Тип</h5>
                            <hr>
                            <ul class="type-box">
                                <li><input type="checkbox" class="le-checkbox" name="selectedType" value="Asynchronous"/><label>Ассиметричный</label></li>
                                <li><input type="checkbox" class="le-checkbox" name="selectedType" value="Hydraulic"/><label>Гидравлический</label></li>
                                <li><input type="checkbox" class="le-checkbox" name="selectedType" value="Manual"/><label>Ручной</label></li>
                            </ul>
                        </div>
                        <!-- Сортируем по году выпуска -->
                        <div class="category-filter">
                            <hr>
                            <h5>Год выпуска</h5>
                            <hr>
                            <ul id="year-list">
                                <li><input type="checkbox" class="le-checkbox"  value="2000"/><label>2000</label></li>
                                <li><input type="checkbox" class="le-checkbox"  value="2001"/><label>2001</label></li>
                                <li><input type="checkbox" class="le-checkbox"  value="2002"/><label>2002</label></li>
                                <li><input type="checkbox" class="le-checkbox"  value="2003"/><label>2003</label></li>
                                <li><input type="checkbox" class="le-checkbox"  value="2004" /><label>2004</label></li>
                                <div class="input-year-fields">
                                    <input type="number" id="from-year" name="minSelectedYear" placeholder="2000" />
                                    <input type="number" id="to-year" name="maxSelectedYear" placeholder="2016" />
                                </div>
                            </ul>
                        </div>
                        <!-- Сортируем по толщине -->
                        <div class="category-filter">
                            <hr>
                            <h5>Толщина материала</h5>
                            <hr>
                            <ul id="thickness-list">
                                <li><input type="checkbox" class="le-checkbox"  value="0 20"/><label>0 - 20</label></li>
                                <li><input type="checkbox" class="le-checkbox"  value="20 40"/><label>20 - 40</label></li>
                                <li><input type="checkbox" class="le-checkbox"  value="40 60"/><label>40 - 60</label></li>
                                <li><input type="checkbox" class="le-checkbox"  value="60 80"/><label>60 - 80</label></li>
                                <li><input type="checkbox" class="le-checkbox"  value="80 999999"/><label>80 и более</label></li>
                                <div class="input-thickness-fields">
                                    <input type="number" id="from-thickness" name="minSelectedThickness" placeholder="from" />
                                    <input type="number" id="to-thickness" name="maxSelectedThickness" placeholder="to" />
                                </div>
                            </ul>
                        </div>
                        <hr>
                        <!-- Сортируем по ширине -->
                        <div class="category-filter">
                            <hr>
                            <h5>Ширина материала</h5>
                            <hr>
                            <ul id="width-list">
                                <li><input type="checkbox" class="le-checkbox"  value="0 500"/><label>0 - 500</label></li>
                                <li><input type="checkbox" class="le-checkbox"  value="500 1000"/><label>500 - 1000</label></li>
                                <li><input type="checkbox" class="le-checkbox"  value="1000 1500"/><label>1000 - 1500</label></li>
                                <li><input type="checkbox" class="le-checkbox"  value="1500 2000"/><label>1500 - 2000</label></li>
                                <li><input type="checkbox" class="le-checkbox"  value="2000 999999" /><label>2000 и более</label></li>
                                <div class="input-width-fields">
                                    <input type="number" id="from-width" name="minSelectedWidth" placeholder="from" />
                                    <input type="number" id="to-width" name="maxSelectedWidth" placeholder="to" />
                                </div>
                            </ul>
                        </div>
                        <hr>
                        
                        <!-- Сортируем по скорости гибки -->
                        <div class="category-filter">
                            <hr>
                            <h5>Скорость гибки</h5>
                            <hr>
                            <ul id="bending-list">
                                <li><input type="checkbox" class="le-checkbox"  value="0 2"/><label>0 - 2</label></li>
                                <li><input type="checkbox" class="le-checkbox"  value="2 4"/><label>2 - 4</label></li>
                                <li><input type="checkbox" class="le-checkbox"  value="4 6"/><label>4 - 6</label></li>
                                <li><input type="checkbox" class="le-checkbox"  value="6 8"/><label>6 - 8</label></li>
                                <li><input type="checkbox" class="le-checkbox"  value="8 999999" /><label>8 и более</label></li>
                                <div class="input-bending-fields">
                                    <input type="number" id="from-bending" name="minSelectedBS" placeholder="from" />
                                    <input type="number" id="to-bending" name="maxSelectedBS" placeholder="to" />
                                </div>
                            </ul>
                        </div>
                        
                        <!--Сортируем по цене--> 
                        <div class="category-filter">
                            <hr>
                            <h5>Цена</h5>
                            <hr>
                                <div class="input-price-fields">
                                    <input type="number" name="minSelectedPrice" placeholder="from" />
                                    <input type="number" name="maxSelectedPrice" placeholder="to" />
                                </div>
                        </div>
                        
                        <hr>
                        <input type="submit" id="send-btn" class="btn btn-success" />
                    </div>
                </form>
            </div>
            
<!-- ========================================= PRODUCT FILTER : END ========================================= -->

<!-- ========================================= FEATURED PRODUCTS : END ========================================= -->
        </div>
                                <!--ok-->
        <!-- ========================================= SIDEBAR : END ========================================= -->

        <!-- ========================================= CONTENT ========================================= -->

        <div class="col-xs-12 col-sm-9 no-margin wide sidebar">


           
<section id="gaming">
    <div class="grid-list-products">
        <!--<h2 class="section-title">Gaming</h2>-->
        
        <div class="control-bar">
            <div class="grid-list-buttons">
                <ul>
                    <li class="grid-list-button-item active"><a data-toggle="tab" href="#grid-view"><i class="fa fa-th-large"></i> Grid</a></li>
                    <li class="grid-list-button-item "><a data-toggle="tab" href="#list-view"><i class="fa fa-th-list"></i> List</a></li>
                </ul>
            </div>
        </div><!-- /.control-bar -->  
        <%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>

        <div class="tab-content">
            <div id="grid-view" class="products-grid fade tab-pane in active">
                
                <div class="product-grid-holder">
                    <div class="row no-margin">
                        <!--Список товаров тут-->   
                        <div id="grid-filter-render" style="display: none">
                            <c:forEach items="${machines_list}" var="item"> 
                                <div class="col-xs-12 col-sm-4 no-margin product-item-holder hover">
                                    <div class="product-item">
                                        <div class="ribbon red"><span>В продаже</span></div> 
                                        <div class="image">
                                            <img alt="" src="<c:url value='/static/assets/images/products/${item.mainPhoto}'/>" width="246" height="186" />
                                        </div>
                                        <div class="body">
                                            <div class="title">
                                                <a href="<c:url value='machine-${item.id}'/>">${item.brand} ${item.model} ${item.type}</a>
                                            </div>
                                            <div class="brand">${item.yearOfIssue} | Location: ${item.location} | Id: ${item.commonId} </div>
                                            </div>
                                        <div class="hover-area">
                                            <div class="add-cart-button">
                                                <a href="add-product-to-customer-basket.htm?id=${item.id}&page=ru-index" class="le-button">в корзину</a>
                                            </div>
                                            <div class="wish-compare">
                                                <a class="btn-add-to-wishlist" href="add-product-to-wish-list-${item.id}">В понравившиеся</a>
                                                <a class="btn-add-to-compare" href="add-product-to-compare-${item.id}">Сравнить</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                    
                </div><!-- /.product-grid-holder -->
                
                <div class="pagination-holder">
                    <div class="row">
                        
                        <div class="col-xs-12 col-sm-6 text-left">
                            <ul class="pagination ">  
                               
                                <c:forEach var="i" begin="1" end="${kol_vo_page}">
                                                <c:choose>
                                                    <c:when test="${i == page}">
                                                        <li class="current" ><a href="ru-index.htm?page_nomber=${i}"><c:out value="${i}"/></a></li>
                                                    </c:when>                                                  
                                                    <c:otherwise>
                                                        <li><a href="ru-index.htm?page_nomber=${i}"><c:out value="${i}"/></a></li>
                                                    </c:otherwise>
                                                </c:choose>
                                     
                                </c:forEach>   

                            </ul>
                        </div>

                        <div class="col-xs-12 col-sm-6">
                            <div class="result-counter">
                                tt<!--Показано <span> ${kol_vo_on_page*page_nomber-kol_vo_on_page+1} - ${kol_vo_on_page*page_nomber} </span> из <span>${kol_vo_prod}</span> найденых.-->
                            </div>
                        </div>

                    </div> 
                            <!--/.row--> 
                </div>
                <!-- /.pagination-holder -->
            </div><!-- /.products-grid #grid-view -->

            <div id="list-view" class="products-grid fade tab-pane ">
                <div class="products-list">
                    <div id="list-filter-render">
                        <c:forEach items="${machines_list}" var="item">
                            <div class="product-item product-item-holder">
                                <div class="ribbon red"><span>sale</span></div> 
                                <div class="ribbon blue"><span>new!</span></div>
                                <div class="row">
                                    <div class="no-margin col-xs-12 col-sm-4 image-holder">
                                        <div class="image">
                                            <img alt="" src="<c:url value='/static/assets/images/products/${item.mainPhoto}'/>"  width="246" height="186"/>
                                        </div>
                                    </div>
                                    <div class="no-margin col-xs-12 col-sm-5 body-holder">
                                        <div class="body">

                                            <div class="title">
                                                <a href="<c:url value='machine-${item.id}'/>">${item.brand} ${item.model} ${item.type}</a>
                                            </div>
                                                <div class="brand">Year: ${item.yearOfIssue} | Location: ${item.location} | Id: ${item.commonId}</div>

                                            <div class="excerpt">
                                                <p>${item.location}</p>
                                            </div>
                                            
                                        </div>
                                    </div>
                                    <div class="no-margin col-xs-12 col-sm-3 price-area">
                                        <div class="right-clmn">
                                            <div class="availability"><label>availability:</label><span class="available">  in stock</span></div>
                                            <a class="le-button" href="add-product-to-customer-basket.htm?id=${iphone.id}">add to cart</a>
                                            <a class="btn-add-to-wishlist" href="add-product-to-wish-list.htm?id=${iphone.id}">add to wishlist</a>
                                            <div class="addto-compare">
                                                <a class="btn-add-to-compare" href="add-product-to-compare-${item.id}">Сравнить</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                      </c:forEach> 

                    </div>
                    
                    </div>
                <!-- /.products-list -->
                    
         

            </div>
            <!-- /.products-grid #list-view -->

        </div><!-- /.tab-content -->
    </div><!-- /.grid-list-products -->

</section><!-- /#gaming -->            
        </div><!-- /.col -->
        <!-- ========================================= CONTENT : END ========================================= -->    
    </div><!-- /.container -->
    
</section><!-- /#category-grid -->      <!-- ============================================================= FOOTER ============================================================= -->


<!--f-->


<%@include file="fragments/footer.jsp" %>


<!-- ============================================================= FOOTER : END ============================================================= -->   </div><!-- /.wrapper -->

    <!-- JavaScripts placed at the end of the document so the pages load faster -->
    <script src="<c:url value='/static/assets/js/jquery.cookie.js'/>"></script>
    <script src="<c:url value='/static/assets/js/jquery.session.js'/>"></script>
    <script src="<c:url value='/static/assets/js/jquery-migrate-1.2.1.js'/>"></script>
    <script  src="<c:url value='/static/assets/js/windowhashloader.js'/>"></script>
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
    <script src="<c:url value='/static/assets/js/machine_filter.js'/>"></script>
    <script src="<c:url value='/static/assets/js/compare-handler.js'/>"></script>


    <!-- For demo purposes â can be removed on production -->
    
    <script src="<c:url value='/static/assets/switchstylesheet/switchstylesheet.js'/>"></script>
    
    <!-- For demo purposes â can be removed on production : End -->

    <script src="http://w.sharethis.com/button/buttons.js"></script>

</body>
</html>