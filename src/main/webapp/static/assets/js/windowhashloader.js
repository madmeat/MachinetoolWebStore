$(document).ready(function() {
    var hashObject = function(hash) {
        var object={};
        var tempArray = [];
        var array=hash.split('$');
        var length= array.length,temp;
        var prevElement = '';
        for(var i=0; i<length; i++){
            temp=array[i].split('=');
            if(i !== 0 && prevElement === temp[0]) {
                if(i > 1) {
                    tempArray.push(temp[1]);
                    object[temp[0]]=tempArray;
                    continue;
                }
                tempArray.push(object[prevElement]);
                tempArray.push(temp[1]);
                object[temp[0]]=tempArray;
            } else {
                prevElement=temp[0];
                object[temp[0]]=temp[1];
            }
        }
        return object;
    };
    
    var pageDataRender = function(pageData) {
        $.ajax({
            type: 'POST',
            url: 'http://localhost:8084/filter',
            contentType: 'application/json',
            data: JSON.stringify(pageData),
            dataType: 'json',
            timeout: 10000,
            success: function(data) {
                console.log(data);
                $('#grid-filter-render').html('');
                $.each(data, function(index, item) {
                    var htmlRender = '<div class="col-xs-12 col-sm-4 no-margin product-item-holder hover">'+
                                     '<div class="product-item">'+
                                         '<div class="ribbon red"><span>В продаже</span></div>'+ 
                                         '<div class="image">'+
                                             '<img alt="" src="/static/assets/images/products/' + item.mainPhoto + '" width="246" height="186" />'+
                                         '</div>'+
                                         '<div class="body">'+
                                             '<div class="title">'+
                                                 '<a href="/machine-'+ item.id +'">' + ' ' + item.brand + ' ' + item.model + ' ' + item.type + '</a>'+
                                             '</div>'+
                                             '<div class="brand">' + item.yearOfIssue + '| Location:' + item.location + '| Id:' + item.commonId + '</div>'+
                                             '</div>'+
                                         '<div class="hover-area">'+
                                             '<div class="add-cart-button">'+
                                                 '<a href="add-product-to-customer-basket.htm?id=' + item.id + '&page=ru-index" class="le-button">в корзину</a>'+
                                             '</div>'+
                                             '<div class="wish-compare">'+
                                                 '<a class="btn-add-to-wishlist" href="add-product-to-wish-list.htm?id=' + item.id + '">в понравившиеся</a>'+
                                                 '<a class="btn-add-to-compare" href="add-product-to-compare-list.htm?id=' + item.id + '">сравнить</a>'+
                                             '</div>'+
                                         '</div>'+
                                     '</div>'+
                                 '</div>';
                    $('#grid-filter-render').append(htmlRender);
                });

                $('#list-filter-render').html('');
                $.each(data, function(index, item) {
                    var htmlRender = '<div class="product-item product-item-holder">'+
                                '<div class="ribbon red"><span>sale</span></div>'+
                                '<div class="ribbon blue"><span>new!</span></div>'+
                                '<div class="row">'+
                                    '<div class="no-margin col-xs-12 col-sm-4 image-holder">'+
                                        '<div class="image">'+
                                            '<img alt="" src="/static/assets/images/products/' + item.mainPhoto + '" width="246" height="186"/>'+
                                        '</div>'+
                                    '</div>'+
                                    '<div class="no-margin col-xs-12 col-sm-5 body-holder">'+
                                        '<div class="body">'+
                                            '<div class="title">'+
                                                '<a href="machine-' + item.id + '">' + item.brand + ' ' + item.model + ' ' + item.type + '</a>'+
                                            '</div>'+
                                                '<div class="brand">Year:' + item.yearOfIssue + ' | Location:' + item.location + ' | Id:' + item.commonId + '</div>'+
                                            '<div class="excerpt">'+
                                                '<p>' + item.location + '</p>'+
                                            '</div>'+
                                            '<div class="addto-compare">'+
                                                '<a class="btn-add-to-compare" href="add-product-to-compare-list.htm?id=' + item.id + '">add to compare list</a>'+
                                            '</div>'+
                                        '</div>'+
                                    '</div>'+
                                    '<div class="no-margin col-xs-12 col-sm-3 price-area">'+
                                        '<div class="right-clmn">'+
                                            '<div class="availability"><label>availability:</label><span class="available">  in stock</span></div>'+
                                            '<a class="le-button" href="add-product-to-customer-basket.htm?id=' + item.id + '">add to cart</a>'+
                                            '<a class="btn-add-to-wishlist" href="add-product-to-wish-list.htm?id=' + item.id + '">add to wishlist</a>'+
                                        '</div>'+
                                    '</div>'+
                                '</div>'+
                            '</div>';
                    $('#list-filter-render').append(htmlRender);
                });
            },
            error: function(e) {
               console.log(e);
           }
        });
    };
    
    $(window).load(function() {
        var originalSearchPath = (window.location.search).substring(1);
        if(originalSearchPath !== '') {
            var requestData = hashObject(originalSearchPath);
            var keys = Object.keys(requestData);
            $.each(keys, function(index, data) {
                if(typeof(requestData[data]) === 'object') {
                    $('.cb-category-filter').find(':checkbox').each(function() {
                        if($.inArray(this.value, requestData[data]) !== -1) {
                            $(this).attr('checked','checked');
                        }
                    });
                } else if(data === 'selectedType') {
                    $('.cb-category-filter').find(':checkbox').each(function() {
                        if(requestData[data] === this.value) {
                            $(this).attr('checked','checked');
                        }
                    });
                } 
                $('.bordered input[type="number"]').each(function() {
                    if(data === this.name) {
                        $(this).val(requestData[data]);
                        return;
                    }
                });
            });
            pageDataRender(requestData);
        }
    });
    
});


