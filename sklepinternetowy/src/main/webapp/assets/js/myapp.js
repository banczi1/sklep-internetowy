$(function(){
	//rozwiazanie aktywengo menu
	switch(menu){
	case 'About As':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	default:
		$('#home').addClass('active');
		break;
		
	}
	
	
});