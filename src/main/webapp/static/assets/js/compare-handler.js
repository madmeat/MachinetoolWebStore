$(document).ready(function() {
    $(window).load(function() {
        init();
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
    
    var buttonChecker = function() {
        var temp = [];
        var sessionStorageData = $.session.get('compareValues').split(',');
        $.each(sessionStorageData, function(index, item) {
            temp.push(item);
        });
        $('.btn-add-to-compare').each(function() {
            var suffix = $(this).attr('href').match(/\d+/);
            if($.inArray(suffix[0], temp) !== -1) {  
                $(this).toggleClass('mark');
                $(this).css('color', '#59b210');
            }
        });
    };
    
    $('.btn-add-to-compare').live('click', event, function(){
        event.preventDefault();
        var current = $(this).attr('href').match(/\d+/);
        var tmpValues = [];
        if($.session.get('compareValues').length === 0) {
            var tmpCount = tmpValues.length;
            tmpValues.push(current);
            $.session.set('compareCount', ++tmpCount);
            $(this).toggleClass('mark');
            $(this).css('color', '#59b210');
            $.session.set('compareValues', tmpValues);
            counterSetter();
        } else {
            var sessionStorageData = $.session.get('compareValues').split(',');
            $.each(sessionStorageData, function(index, item) {
                tmpValues.push(item);
            });
            var tmpCount = tmpValues.length;
            if($.inArray(current[0], tmpValues) === -1) {
                tmpValues.push(current);
                $.session.set('compareCount', ++tmpCount);
                $(this).toggleClass('mark');
                $(this).css('color', '#59b210');
            } else {
                tmpValues.splice($.inArray(current, tmpValues), 1);
                $.session.set('compareCount', --tmpCount);
                $(this).css('color', '#3d3d3d');
                $(this).removeClass('mark');
            }
            counterSetter();
            $.session.set('compareValues', tmpValues);
        }
    });
    
    $('.compare').on('click', event, function() {
        if($.session.get('compareValues').length === 0) {
            event.preventDefault();
        } 
    });
    
    var init = function() {
        if($.session.get('compareCount') === 0 || isNaN($.session.get('compareCount'))) {
            $.session.set('compareCount', 0);
        } 
        if(typeof($.session.get('compareValues'))  === 'undefined' || $.session.get('compareValues').length === 0) {
            $.session.set('compareValues', []);
        } else {
            buttonChecker();
        }
        counterSetter();
    };
});
