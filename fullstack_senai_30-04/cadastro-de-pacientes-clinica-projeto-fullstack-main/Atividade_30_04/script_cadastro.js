const cadastrarPaciente = () => {
    const nome = document.getElementById('nome').value;
    const telefone = document.getElementById('telefone').value;
    const email = document.getElementById('email').value;
    const senha = document.getElementById('senha').value;
    const mensagem = document.getElementById('mensagem');

    fetch('http://localhost:8081/paciente', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ nome, telefone, email, senha })
    })
    .then(response =>
        response.json().then(data => ({ status: response.status, body: data }))
    )
    .then(({ status, body }) => {
        if (status >= 400 || (body.mensagem && body.mensagem.toLowerCase().includes('erro'))) {
            let erroMensagem = body.mensagem;
            if (body.erros) {
                erroMensagem += ' ' + Object.values(body.erros).join(', ');
            }
            mensagem.textContent = erroMensagem;
            mensagem.classList.remove('sucesso');
            mensagem.classList.add('erro', 'visivel');
        } else {
            mensagem.textContent = body.mensagem || 'Paciente cadastrado com sucesso!';
            mensagem.classList.remove('erro');
            mensagem.classList.add('sucesso', 'visivel');
        
            document.getElementById('cadastroForm').reset();
        }

        exibirMensagem();
    })
    .catch(() => {
        mensagem.textContent = 'Erro ao conectar ao servidor.';
        mensagem.classList.remove('erro');
        mensagem.classList.add('sucesso', 'visivel');

        exibirMensagem();
    });
};

const exibirMensagem = () => {
    const mensagem = document.getElementById('mensagem');
    mensagem.classList.remove('oculto');   
    mensagem.classList.add('visivel');     
    
    setTimeout(() => fecharMensagem(), 5000);
};

const fecharMensagem = () => {
    const mensagem = document.getElementById('mensagem');
    mensagem.classList.remove('visivel');  
    mensagem.classList.add('oculto');      // Adiciona a classe 'oculto' para esconder
};
