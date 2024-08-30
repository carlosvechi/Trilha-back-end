package br.com.gcontato.Servlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdicionaContatoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public AdicionaContatoServlet() {
		super();
	}
	
	@Override //Indica que estamos sobrescrevendo o método service da classe mãe HttpServlet
protected void service(HttpServletRequest request, 
		HttpServletResponse response)
	throws ServletException, IOException{
	
		response.setContentType("text/html"); //Define o tipo de conteúdo como html. Para usarmos tags HTML no println, precisaremos desta linha.
		
	PrintWriter out = response.getWriter(); //Para que o usuário veja algo na página web. Será a resposta que o Servlet enviará para o cliente.
	String nome = request.getParameter("nome");
    out.println("<h1>" + nome + "</h1>"); // Exibe o nome como um título
    
    String endereco = request.getParameter("end");
    out.println("<h1>" + endereco + "</h1>"); // Exibe o endereço como um parágrafo
    
    String telefone = request.getParameter("tel");
    out.println("<h1>" + telefone + "</h1>");
}
	
	//Os dois métodos abaixo, serão utilizados quando se desejar tratar
	// a passagem de dados, respectivamente pelos métodos GET e POST.
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response)
	throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException {
		
	}
}
