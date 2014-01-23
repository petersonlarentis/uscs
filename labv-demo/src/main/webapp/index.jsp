<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Pessoa</title>
    </head>
    <body>
        <h2>Cadastro Pessoa</h2>
        <hr><br>
        <form action="cadastroPessoa" method="post">
        	<div>
        		<p>
        			<label>Nome:
        				<input name="nome">
        			</label>
        		</p>
        		<p>
        			<label>Idade:
        				<input name="idade">
        			</label>
        		</p>
        	</div>
        	<input type="submit" value="Cadastrar">
        </form>
    </body>
</html>
