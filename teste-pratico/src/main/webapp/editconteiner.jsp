<%@ include file="header.jsp"%>

<h1>Adicionar Contêiner</h1>

<form action="">
<div class="mb-3">
		<label for="formGroupExampleInput" class="form-label">ID
			</label> <input type="text" class="form-control"
			id="formGroupExampleInput" placeholder="Example input placeholder"
			name="id_conteiner" value="<% out.print(request.getAttribute("id_conteiner"));%>" readonly>
	</div>

	<div class="mb-3">
		<label for="formGroupExampleInput" class="form-label">Nome
			Cliente</label> <input type="text" class="form-control"
			id="formGroupExampleInput" placeholder="Example input placeholder"
			name="nome_cliente" maxlength="255" value="<% out.print(request.getAttribute("nome_cliente"));%>" required>
	</div>
	<div class="mb-3">
		<label for="formGroupExampleInput2" class="form-label">Número
			Contêiner</label> <input type="text" class="form-control"
			id="formGroupExampleInput2" placeholder="Another input placeholder"
			name="numero_conteiner" value="<% out.print(request.getAttribute("numero_conteiner"));%>" maxlength="11" required>
	</div>
	<div class="input-group mb-3">
		<label class="input-group-text" for="inputGroupSelect01">Tipo</label>
		<select class="form-select" id="inputGroupSelect01"
			name="tipo_conteiner">
			
			<%-- Parei na hora de mudar os values dos select --%>
			
			<option value="<% out.print(request.getAttribute("nome_cliente"));%>" selected>value="<% out.print(request.getAttribute("nome_cliente"));%>"</option>
			<option value="20">20</option>
			<option value="40">40</option>
		</select>
	</div>
	<div class="input-group mb-3">
		<label class="input-group-text" for="inputGroupSelect01">Status</label>
		<select class="form-select" id="inputGroupSelect01"
			name="status_conteiner">
			<option value="<% out.print(request.getAttribute("nome_cliente"));%>" selected>value="<% out.print(request.getAttribute("nome_cliente"));%>"</option>
			<option value="Cheio">Cheio</option>
			<option value="Vazio">Vazio</option>
		</select>
	</div>
	<div class="input-group mb-3">
		<label class="input-group-text" for="inputGroupSelect01">Categoria</label>
		<select class="form-select" id="inputGroupSelect01"
			name="categoria_conteiner">
			<option value="<% out.print(request.getAttribute("nome_cliente"));%>" selected>value="<% out.print(request.getAttribute("nome_cliente"));%>"</option>
			<option value="Exportação">Exportação</option>
			<option value="Importação">Importação</option>
		</select>
	</div>
	<button type="submit">Salvar</button>
</form>

<%@ include file="footer.jsp"%>