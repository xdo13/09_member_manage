function loginCheck(){
	if(document.frm.userid.value.length == 0) {
		alert("아이디를 써주세요");
		frm.userid.focus();
		return false;
	}
	var url = "idCheck.do?userid=" +document.frm.userid.value;
	window.open(url, "_blank_1", "toolbar=no, menubar=no, scrollbars=yes, resizeable=no, width=450, height=200");
	
	if(document.frm.pwd.value == "") {
		alert("암호는 반드시 입력해야 합니다");
		frm.pwd.focus();
		return false;
	}
	return true;
}