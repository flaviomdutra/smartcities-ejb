<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Busca de estabelecimentos</title>
  </head>
  <body>
    <form action="estabelecimentos" method="get">
      <input type="text" placeholder="Termo" name="termo" />
      <input type="submit" value="Buscar" />
    </form>

    <h2>Resultados: ${encontrados}</h2>
    <ul>
      ${resultado}
    </ul>
    
    <h2>Histórico:</h2>
    <ul>
     	${historico}
    </ul>
  </body>
</html>
