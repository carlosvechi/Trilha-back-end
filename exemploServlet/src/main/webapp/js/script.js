function validaContato() {
	
	//var é a declaração da variavél. document é um padrão do JS. frm é o nome dado ao nosso formulário
	//'nome' é o name dado ao nosso input e 'value' é o conteúdo que será declarado neste input.
	var nome = document.frm.nome.value; 
	
	//expRegNome é um tipo de padrão aceito em tal input, declarado pelo dev.
	var expRegNome = new RegExp("^[A-zÁ-ü]{3,}([ ]{1}[A-zÁ-ü]{2,})+$");
	
	//aqui validará se o que foi digitado no input 'nome', segue o padrão declarado no expRegNome. Caso não, 
	//aparecerá a msg "Preencha o campo 'Nome' corretamente. "
	if (!expRegNome.test(nome)) {
		alert("Preencha o campo 'Nome' corretamente. ")
		document.frm.nome.focus();
		return false;
	}
	
	if(document.frm.end.value == "") {
		alert("Preencha o campo 'Endereço. ");
		document.frm.end.focus();
		return false;
	}
	
	if(document.frm.tel.value == "") {
		alert("Preencha o campo 'Telefone'. ");
		return false;	
	}
	return true;
}