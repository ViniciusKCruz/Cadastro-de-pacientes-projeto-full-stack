document.addEventListener('DOMContentLoaded', carregarPacientesCadastrados);

function carregarPacientesCadastrados() {
    fetch('http://localhost:8081/paciente')
        .then(response => {
            if (!response.ok) {
                throw new Error("Erro ao buscar usuários");
            }
            return response.json();
        })
        .then(usuarios => {
            const lista = document.getElementById('lista-pacientes');
            lista.innerHTML = '';

            if (usuarios.length === 0) {
                lista.innerHTML = `<li>Nenhum paciente encontrado.</li>`;
                return;
            }

            usuarios.forEach(usuario => {
                const item = document.createElement('li');
                item.innerHTML = `<strong>Nome:</strong> ${usuario.nome} <br>
                                  <strong>Telefone:</strong> ${usuario.telefone} <br>  
                                  <strong>E-mail:</strong> ${usuario.email}`;
                lista.appendChild(item);
            });
        })
        .catch(erro => {
            document.getElementById('lista-pacientes').innerHTML =
                '<li>Erro ao carregar usuários</li>';
        });
}