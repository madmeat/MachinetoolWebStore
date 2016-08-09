<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
    Document   : functionality
    Created on : 06.05.2016, 19:59:32
    Author     : main
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<c:url value='/static/assets/css/bootstrap.min.css'/>"/>
        <link rel="stylesheet" href="<c:url value ='/static/assets/css/style.css'/>"/>
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <div class="container">
                <ul class="main_menu">
                    <li><a href="#" data-class="1" class="tab"><span>IMPORT</span></a></li>
                    <li><a href="#" data-class="2" class="tab"><span>FUNC_2</span></a></li>
                    <li><a href="#" data-class="3" class="tab"><span>FUNC_3</span></a></li>
                    <li><a href="#" data-class="4" class="tab"><span>FUNC_4</span></a></li>
                    <li><a href="#" data-class="5" class="tab"><span>FUNC_5</span></a></li>
                    <li><a href="#" data-class="6" class="tab"><span>FUNC_6</span></a></li>
                    
                </ul>
                    <a href="#" class="logout">LOGOUT</a>
            </div>
        </header>
        <div class="container">
            
            <div class="content content-1 active">
                <h2>Import from excel file</h2>
                <form:form method="POST" modelAttribute="object" class="edit-form" action="add-machine">
                    <table style="width:100%">
                        <tr>
                            <th><label for="commonId">ID</label></th>
                            <td><form:input path="commonId" id="commonId"/></td>
                        </tr>
                        <tr>
                            <th><label for="type">Тип</label></th>
                            <td><form:input path="type" id="type"/></td>
                        </tr>
                        <tr>
                            <th><label for="model">Модель станка</label></th>
                            <td><form:input path="model" id="model"/></td>
                        </tr>
                        <tr>
                            <th><label for="brand">Бренд</label></th>
                            <td><form:input path="brand" id="brand"/></td>
                        </tr>
                        <tr>
                            <th><label for="manufacturer">Производитель</label></th>
                            <td><form:input path="manufacturer" id="manufacturer"/></td>
                        </tr>
                        <tr>
                            <th><label for="machineState">Состояние</label></th>
                            <td><form:input path="machineState" id="machineState"/></td>
                        </tr>
                        <tr>
                            <th><label for="yearOfIssue">Год выпуска</label></th>
                            <td><form:input path="yearOfIssue" id="yearOfIssue"/></td>
                        </tr>
                        <tr>
                            <th><label for="location">Место нахождения</label></th>
                            <td><form:input path="location" id="location"/></td>
                        </tr>
                        <tr>
                            <th><label for="sales">Продано</label></th>
                            <td><form:input path="sales" id="sales"/></td>
                        </tr>
                        <tr>
                            <th><label for="materialThickness">Толщина материала, мм</label></th>
                            <td><form:input path="materialThickness" id="materialThickness"/></td>
                        </tr>
                        <tr>
                            <th><label for="materialWidth">Ширина материала, мм</label></th>
                            <td><form:input path="materialWidth" id="materialWidth"/></td>
                        </tr>
                        <tr>
                            <th><label for="bendingSpeed">Скорость гибки, м/мин</label></th>
                            <td><form:input path="bendingSpeed" id="bendingSpeed"/></td>
                        </tr>
                        <tr>
                            <th><label for="minDiameterMaxBend">Мин. диаметр при макс. сгибе, мм</label></th>
                            <td><form:input path="minDiameterMaxBend" id="minDiameterMaxBend"/></td>
                        </tr>
                        <tr>
                            <th><label for="topRollDiameter">Диаметр верхнего ролика, мм</label></th>
                            <td><form:input path="topRollDiameter" id="topRollDiameter"/></td>
                        </tr>
                        <tr>
                            <th><label for="middleRollDiameter">Диаметр нижнего ролика, мм</label></th>
                            <td><form:input path="middleRollDiameter" id="middleRollDiameter"/></td>
                        </tr>
                        <tr>
                            <th><label for="distanceOfBottomTwoRolls">Расстояние между нижними двумя волками, мм</label></th>
                            <td><form:input path="distanceOfBottomTwoRolls" id="distanceOfBottomTwoRolls"/></td>
                        </tr>
                        <tr>
                            <th><label for="materialProofStress">Условный предел текучести для гибочного листа, МПа</label></th>
                            <td><form:input path="materialProofStress" id="materialProofStress"/></td>
                        </tr>
                        <tr>
                            <th><label for="mainEnginePower">Мощность главного двигателя, кВт</label></th>
                            <td><form:input path="mainEnginePower" id="mainEnginePower"/></td>
                        </tr>
                        <tr>
                            <th><label for="machineDimensions">Габариты станка (ДхШ), мм</label></th>
                            <td><form:input path="machineDimensions" id="machineDimensions"/></td>
                        </tr>
                        <tr>
                            <th><label for="machineWeight">Вес станка, кг</label></th>
                            <td><form:input path="machineWeight" id="machineWeight"/></td>
                        </tr>
                        <tr>
                            <th><label for="machinePrice">Цена</label></th>
                            <td><form:input path="machinePrice" id="machinePrice"/></td>
                        </tr>
                        <tr>
                            <th><label for="description">Описание</label></th>
                            <td><form:textarea path="description" id="description"/></td>
                    </table>
                    <div class="show-images">
                        <hr/>
                        <c:forEach var="photo" items="${object.photoList}">
                            <img src="<c:url value='/static/assets/images/products/${photo.imageName}'/>">
                        </c:forEach>
                        <hr/>
<!--                        <input type="submit" value="Add" class="btn btn-primary btn-success" />
                        <hr/>-->
                    </div>       
                </form:form>
                        
                <form:form method="POST" action="excel-import" modelAttribute="fileKeeper" enctype="multipart/form-data" class="form-horizontal">
                    <div class="form-group">
                            <form:input type="file" path="file" id="file" class="form-control input-sm"/>
                            <input type="submit" value="Import" class="btn btn-primary btn-sm" />
                            <div class="has-error">
                                <form:errors path="file" class="help-inline"/>
                            </div>                      
                    </div>
            </form:form>
                <a href="<c:url value='/index'/>">Главная</a>
            </div>
     
            <div class="content content-2">
                <label class="col-md-3 control-lable" for="file">2</label>
            </div>
            
            <div class="content content-3">
                <label class="col-md-3 control-lable" for="file">3</label>
            </div>
            
            <div class="content content-4">
                <label class="col-md-3 control-lable" for="file">4</label>
            </div>
            
            <div class="content content-5">
                <label class="col-md-3 control-lable" for="file">5</label>
            </div>
            
            <div class="content content-6">
                <label class="col-md-3 control-lable" for="file">6</label>
            </div>
            
            
        </div>
        <script   src="https://code.jquery.com/jquery-2.2.4.min.js"   integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="   crossorigin="anonymous"></script>
        <script src="<c:url value='/static/assets/js/jquery-1.10.2.min.js'/>"></script>
        <script src="<c:url value='/static/assets/js/autoresize.jquery.js'/>"></script>
        <script src="<c:url value='/static/assets/js/main.js'/>"></script>
        
        <script>
            $(document).ready(function() {
                $('.tab').on('click', function() {
                    var current = $(this).attr('data-class');
                    $('.content').fadeOut(0);
                    $('.content-' + current).fadeIn(300);
                });
            });
        </script>
    </body>
</html>
