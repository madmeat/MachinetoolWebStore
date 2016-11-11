/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {
    $('#add-excel-file').click(function() {
                    var counter = $('#multiFileKeeper').attr('data-count');
                    console.log(counter);
                    counter++;
                    $('#multiFileKeeper').attr('data-count', counter);
    });
    
    $('textarea').autoResize();
    
    $(window).load(function() {
       $('textarea').change();
       console.log("das");
    });

});

