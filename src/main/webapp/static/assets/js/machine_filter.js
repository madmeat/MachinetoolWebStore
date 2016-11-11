$(document).ready(function() {
   //Form to object
    $.fn.serializeObject = function() {
        var o = {};
        var a = this.serializeArray();
        $.each(a, function() {
            if (o[this.name]) {
                if (!o[this.name].push) {
                    o[this.name] = [o[this.name]];
                }
                o[this.name].push(this.value || '');
            } else {
                o[this.name] = this.value || '';
            }
        });
        return o;
    };
   
    $('#filter-form').on('change keyup', function() {
        var searchPath = '';
        $('.type-box input[type=checkbox]').each( function() {
            if($(this).is(':checked') ) {
                searchPath += this.name + '=' + $(this).val() + '$';
            }
        });
        $('input[type=number]').each(function() {
           if($(this).val() !== '') {
               searchPath += this.name + '=' + $(this).val() + '$';
           } 
        });
        
        searchPath = searchPath.slice('$', -1);
        if(searchPath === '') {
            history.pushState("", document.title, window.location.pathname);
        } else {
            history.pushState("", document.title, window.location.pathname + '?' + searchPath);
        }
        
//            history.pushState("", document.title, window.location.pathname + window.location.search);
        
        var formData = $(this).serializeObject();
        $.ajax({
            type: 'POST',
            url: 'http://localhost:8084/filter',
            contentType: 'application/json',
            data: JSON.stringify(formData),
            dataType: 'json',
            timeout: 10000,
            success: function(data) {
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
    });
    
    //thickness block
    $('#thickness-list :checkbox').on('click', function() {
        var allChecked = '';
        $('#thickness-list :checkbox:checked').each(function() {
            var checked = $(this).val();
            allChecked = allChecked === '' ? checked : allChecked + ' ' + checked;  
        });
        
        var numRange = allChecked.split(' ').map(function(item) {
           return parseInt(item, 10); 
        });
              
        var min = Math.min.apply(null, numRange);
        var max = Math.max.apply(null, numRange);

        if(allChecked !== '') {
            $('#from-thickness').val(min);
            max === 999999 ? $('#to-thickness').val('') : $('#to-thickness').val(max); 
        } else {
            $('#from-thickness').val('');
            $('#to-thickness').val('');
        }
    });
    
    $('.input-thickness-fields [type="number"]').on('keyup', function() {
        $('#thickness-list :checkbox:checked').each(function() {
            $(this).prop('checked', false);
        });
    });
    
    //width block
    $('#width-list :checkbox').on('click', function() {
        var allChecked = '';
        $('#width-list :checkbox:checked').each(function() {
            var checked = $(this).val();
            allChecked = allChecked === '' ? checked : allChecked + ' ' + checked;  
        });
        
        var numRange = allChecked.split(' ').map(function(item) {
           return parseInt(item, 10); 
        });
        
        var min = Math.min.apply(null, numRange);
        var max = Math.max.apply(null, numRange);

        if(allChecked !== '') {
            $('#from-width').val(min);
            max === 999999 ? $('#to-width').val('') : $('#to-width').val(max); 
        } else {
            $('#from-width').val('');
            $('#to-width').val('');
        }
    });
    
    $('.input-width-fields [type="number"]').on('keyup', function() {
        $('#width-list :checkbox:checked').each(function() {
            $(this).prop('checked', false);
        });
    });
    
    //year block
    $('#year-list :checkbox').on('click', function() {
        var allChecked = '';
        $('#year-list :checkbox:checked').each(function() {
            var checked = $(this).val();
            allChecked = allChecked === '' ? checked : allChecked + ' ' + checked;  
        });
        
        var numRange = allChecked.split(' ').map(function(item) {
           return parseInt(item, 10); 
        });
        
        var min = Math.min.apply(null, numRange);
        var max = Math.max.apply(null, numRange);

        if(allChecked !== '') {
            $('#from-year').val(min);
            max === 999999 ? $('#to-year').val('') : $('#to-year').val(max); 
        } else {
            $('#from-year').val('');
            $('#to-year').val('');
        }
    });
    
    $('.input-year-fields [type="number"]').on('keyup', function() {
        $('#year-list :checkbox:checked').each(function() {
            $(this).prop('checked', false);
        });
    });
    
    //bending block
    $('#bending-list :checkbox').on('click', function() {
        var allChecked = '';
        $('#bending-list :checkbox:checked').each(function() {
            var checked = $(this).val();
            allChecked = allChecked === '' ? checked : allChecked + ' ' + checked;  
        });
        
        var numRange = allChecked.split(' ').map(function(item) {
           return parseInt(item, 10); 
        });
        
        var min = Math.min.apply(null, numRange);
        var max = Math.max.apply(null, numRange);

        if(allChecked !== '') {
            $('#from-bending').val(min);
            max === 999999 ? $('#to-bending').val('') : $('#to-bending').val(max); 
        } else {
            $('#from-bending').val('');
            $('#to-bending').val('');
        }
    });
    
    $('.input-bending-fields [type="number"]').on('keyup', function() {
        $('#bending-list :checkbox:checked').each(function() {
            $(this).prop('checked', false);
        });
    });
    
    setTimeout(function() {
        $('#grid-filter-render').css('display', 'block');
        $('.bordered').css('display', 'block');
    }, 600);
});
