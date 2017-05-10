$(function() {
	$("#users_login").validate({
		rules : {
			email : {
				required : true,
				minlength : 4,
				maxlength : 20,
				email:true
			},
			passw : {
				required : true,
				minlength : 8
			}
		},
		messages : {
			email : {
				required : "Please enter a email",
				minlength : $.format("Minimum {0} characters required!"),
				maxlength : $.format("Maximum {0} characters allowed!")

			},
			passw : {
				required : "Please enter a password",
				minlength : $.format("Minimum {0} characters required!"),
			

			}
		}
	});
	
});
