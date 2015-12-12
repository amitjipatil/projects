/**
 * @author amit patil
 */
$(document).ready(function(){
	$(".updt").click(function(){
		
		$("#update").slideDown('fast');
		/*var x=$("#name").val();
		var y=$("#password").val();*/
		
		alert($('#tbl_data tr .v1').html());
		alert($('#tbl_data tr .v2').html());
		alert($('#tbl_data tr .v3').html());
		
		$.ajax({
			type:"post",
			url:"login",
			data:{
				username:x,password:y
			},
			success: function (responsetext){
				
			},
			error:function(responsetext1)
			{
				//alert ("failure");
				$("#failure").slideDown('fast').delay(3000).slideUp('fast');
			},
			
		});
	});
});