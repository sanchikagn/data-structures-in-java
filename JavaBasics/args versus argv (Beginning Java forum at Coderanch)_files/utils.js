function showEmail(beforeAt, afterAt)
{
	return beforeAt + "@" + afterAt;
}

function addBookmark(rootUrl, relationType, relationId)
{
	var w = window.open(rootUrl + '/bookmarks/insert/' + relationType + '/' + relationId, 'bookmark_add', 'width=728, height=252, scrollbars=auto, resizable=true');
	w.focus();
}

function hideLeftNavPanel(hide, submitUrl, token) {
    var params = {
          toggle_hide_left_nav_panel: hide,
          OWASP_CSRFTOKEN: token
    };  
    $.ajax({
         url: submitUrl,
         type: 'POST',
         data: params,
         dataType: 'json',
         headers: {'OWASP_CSRFTOKEN': token},
         success: function (data) {
           $("#categorySidebar").toggleClass('hiddenDisplay');
           $("#rightPanel").toggleClass("rightPanel");
           $("#rightPanel").toggleClass("rightPanelExpanded");
         }  
   });
}

function showActionMessageBar(msgTxt, isSuccessMsg) {
    $("#actionMessageBar").text(msgTxt);
    if ( isSuccessMsg) {
        $("#actionMessageBar").removeClass( "hiddenDisplay failureActionMessage" ).addClass( "successActionMessage" );
    } else {
        $("#actionMessageBar").removeClass( "hiddenDisplay successActionMessage" ).addClass( "failureActionMessage" );
    }
    $("#actionMessageBar").show();
    /** hide the message bar in 10 seconds **/
    setTimeout(function() {$("#actionMessageBar").hide();}, 10000);
}

function isPositiveInteger(value){
	return value.indexOf('.') < 0 && isFinite(value) && value > 0;
}

function showPieSender(pieSender){
	var $pan = $(pieSender).closest('.pieoffer').find('.pan');
	$pan.slideDown(200);
	var $text = $pan.find('input.nofpie');
	$text.focus();
	$text.select();
}

function sendPies(pieSendButton){
	var $pan = $(pieSendButton).closest('.pan');
	var $noOfPieText = $pan.find('input.nofpie');
	var numberOfSlices = $noOfPieText.val();
	if(numberOfSlices.indexOf(".") != -1){
		alert('Please enter a valid integer indicating the number of pie slices you wish to send.');
		return;
	}
	if(numberOfSlices < 1){
		alert('Please choose to send one or more pie slices');
		return;
	}
	$pan.closest('form').submit();
}

function openForumRatings() {
	$('.fratings').each(function(){
		$(this).slideDown(200);
	})
}