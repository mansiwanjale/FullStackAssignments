$(document).ready(function() {

    $("#panel1").show();
    $("#panel2, #panel3").hide();

    $("h3").click(function() {
        var clickedId = $(this).attr("id");

        if (clickedId == "Personal") {
            $("#panel1").slideDown(); // Show 1
            $("#panel2").slideUp();   // Hide 2
            $("#panel3").slideUp();   // Hide 3
        } 
        else if (clickedId == "College_Information") {
            $("#panel1").slideUp();   // Hide 1
            $("#panel2").slideDown(); // Show 2
            $("#panel3").slideUp();   // Hide 3
        } 
        else if (clickedId == "Documents") {
            $("#panel1").slideUp();   // Hide 1
            $("#panel2").slideUp();   // Hide 2
            $("#panel3").slideDown(); // Show 3
        }
    });

  // TICKMARK 
 
  $('input[type="file"]').change(function() {
    // Find the checkbox in the same table row (tr) and check it
    $(this).closest('tr').find('input[type="checkbox"]').prop('checked', true);
  });

});