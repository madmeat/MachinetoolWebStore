$(document).ready(function() {
    var matchData = function(data) {
        $.ajax({
            type: 'POST',
            url: "http://localhost:8084/compare",
            contentType: 'application/json',
            data: JSON.stringify(data),
            dataType: 'json',
            timeout: 10000,
            success: function(data) {
                $.each(data, function(index, item) {
                    var htmlRender = '<td data-id="' + item.id +'" class="text-center product-' + item.id + '">' 
                                        + '<div class="image-wrap">'
                                            + '<a href="/machine-' + item.id + '" ><img width="170" height="120" alt="" class="attachment-yith-woocompare-image" src="/static/assets/images/products/' + item.mainPhoto + '"></a>'                     
                                        + '</div><p><a href="/machine-' + item.id + '"><strong>' + item.brand + ' ' + item.model + '</strong>'
                                        + '<a class="remove-icon" href="/remove-' + item.id + '"><img style="padding-bottom: 2px" width="16" height="16" src="/static/assets/images/remove-icon.png"></a>'
                                        +'</a></p></td>';
                    $('.product-images').append(htmlRender);            
                    htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.type + '</p></td>';
                    $('.type-cell').append(htmlRender);
                    htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.model + '</p></td>';
                    $('.model-cell').append(htmlRender);
                    htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.brand + '</p></td>';
                    $('.brand-cell').append(htmlRender);
                    htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.manufacturer + '</p></td>';
                    $('.manufacturer-cell').append(htmlRender);
                    var htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.machineState + '</p></td>';
                    $('.machine-state-cell').append(htmlRender);
                    htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.yearOfIssue + '</p></td>';
                    $('.year-of-issue-cell').append(htmlRender);
                    htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.location + '</p></td>';
                    $('.location-cell').append(htmlRender);
                    htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.materialThickness + '</p></td>';
                    $('.material-thickness-cell').append(htmlRender);
                    var htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.materialWidth + '</p></td>';
                    $('.material-width-cell').append(htmlRender);
                    htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.bendingSpeed + '</p></td>';
                    $('.bending-speed-cell').append(htmlRender);
                    htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.minDiameterMaxBend + '</p></td>';
                    $('.min-diameter-max-bend-cell').append(htmlRender);
                    htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.topRollDiameter + '</p></td>';
                    $('.top-roll-diameter-cell').append(htmlRender);
                    var htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.middleRollDiameter + '</p></td>';
                    $('.middle-roll-diameter-cell').append(htmlRender);
                    htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.distanceOfBottomTwoRolls + '</p></td>';
                    $('.distance-of-bottom-two-rolls-cell').append(htmlRender);
                    htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.materialProofStress + '</p></td>';
                    $('.material-proof-stress-cell').append(htmlRender);
                    htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.mainEnginePower + '</p></td>';
                    $('.main-engine-power-cell').append(htmlRender);
                    var htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.machineDimensions + '</p></td>';
                    $('.machine-dimensions-cell').append(htmlRender);
                    htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.machineWeight + '</p></td>';
                    $('.machine-weight-cell').append(htmlRender);
                    htmlRender = 
                            '<td data-id="' + item.id +'" class="comparison-item-cell odd product-' + item.id + '"><p>' + item.machinePrice + '</p></td>';
                    $('.machine-price-cell').append(htmlRender);
                });
            },
            error: function(error) {
                console.log(error);
            }
        });
    };
    
    $(window).load(function() {    
        var sessionStorageData = $.session.get('compareValues').split(',');
        var matchArray = [];
        $.each(sessionStorageData, function(index, item) {
            matchArray.push(item);
        });
        matchData(matchArray);
    }); 
    
    $('.remove-icon').live('click', event, function() {
        event.preventDefault();
        var current = $(this).attr('href').match(/\d+/);
        $('.product-' + current).each(function() {
           $(this).remove(); 
        });
        var tmpValues = [];
        var tmpCount = $.session.get('compareCount');
        var sessionStorageData = $.session.get('compareValues').split(',');
        $.each(sessionStorageData, function(index, item) {
            tmpValues.push(item);
        });
        tmpValues.splice($.inArray(current[0], tmpValues), 1);
        $.session.set('compareCount', --tmpCount);
        $.session.set('compareValues', tmpValues);
        if(tmpCount === 0) {
            window.location.href = "/machines";
        }
        counterSetter();
    });
    
    var counterSetter = function() {
        $('.compare-value').html($.session.get('compareCount')).css({
            'background': '#5EA226',
            'border-radius' : '0.8em',
            '-moz-border-radius': '0.8em',
            '-webkit-border-radius': '0.8em',
            'color': '#ffffff',
            'display': 'inline-block',
            'font-weight': 'bold',
            'line-height': '1.6em',
            'margin-left': '5px',
            'text-align': 'center',
            'width': '1.6em'
        });
    };
});

