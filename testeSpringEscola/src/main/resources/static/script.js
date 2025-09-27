// -------------------- Alunos --------------------
async function listarAlunos() {
    const res = await fetch('/alunos');
    const alunos = await res.json();
    const ul = document.getElementById('alunos-list');
    ul.innerHTML = '';
    alunos.forEach(a => {
        const li = document.createElement('li');
        li.textContent = `${a.id} - ${a.nome} (${a.idade} anos)`;
        li.innerHTML += ` <button onclick="editarAluno(${a.id}, '${a.nome}', ${a.idade})">Editar</button>`;
        li.innerHTML += ` <button onclick="deletarAluno(${a.id})">Excluir</button>`;
        ul.appendChild(li);
    });
}

async function cadastrarOuEditarAluno(e) {
    e.preventDefault();
    const id = document.getElementById('aluno-id').value;
    const nome = document.getElementById('aluno-nome').value;
    const idade = parseInt(document.getElementById('aluno-idade').value);

    const url = '/alunos' + (id ? `/${id}` : '');
    const method = id ? 'PUT' : 'POST';

    await fetch(url, {
        method: method,
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ nome, idade })
    });

    document.getElementById('aluno-form').reset();
    listarAlunos();
}

function editarAluno(id, nome, idade) {
    document.getElementById('aluno-id').value = id;
    document.getElementById('aluno-nome').value = nome;
    document.getElementById('aluno-idade').value = idade;
}

async function deletarAluno(id) {
    await fetch(`/alunos/${id}`, { method: 'DELETE' });
    listarAlunos();
}

document.getElementById('aluno-form').addEventListener('submit', cadastrarOuEditarAluno);

// -------------------- Disciplinas --------------------
async function listarDisciplinas() {
    const res = await fetch('/disciplinas');
    const disciplinas = await res.json();
    const ul = document.getElementById('disciplinas-list');
    ul.innerHTML = '';
    disciplinas.forEach(d => {
        const li = document.createElement('li');
        li.textContent = `${d.id} - ${d.nomeDisciplina}`;
        li.innerHTML += ` <button onclick="editarDisciplina(${d.id}, '${d.nomeDisciplina}')">Editar</button>`;
        li.innerHTML += ` <button onclick="deletarDisciplina(${d.id})">Excluir</button>`;
        ul.appendChild(li);
    });
}

async function cadastrarOuEditarDisciplina(e) {
    e.preventDefault();
    const id = document.getElementById('disciplina-id').value;
    const nomeDisciplina = document.getElementById('disciplina-nome').value;

    const url = '/disciplinas' + (id ? `/${id}` : '');
    const method = id ? 'PUT' : 'POST';

    await fetch(url, {
        method: method,
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ nomeDisciplina })
    });

    document.getElementById('disciplina-form').reset();
    listarDisciplinas();
}

function editarDisciplina(id, nomeDisciplina) {
    document.getElementById('disciplina-id').value = id;
    document.getElementById('disciplina-nome').value = nomeDisciplina;
}

async function deletarDisciplina(id) {
    await fetch(`/disciplinas/${id}`, { method: 'DELETE' });
    listarDisciplinas();
}

document.getElementById('disciplina-form').addEventListener('submit', cadastrarOuEditarDisciplina);

// -------------------- Histórico --------------------
async function listarHistorico() {
    const res = await fetch('/historico');
    const historicos = await res.json();
    const ul = document.getElementById('historico-list');
    ul.innerHTML = '';
    historicos.forEach(h => {
        const li = document.createElement('li');
        li.textContent = `Aluno ${h.aluno.id} - Disciplina ${h.disciplina.id} - Nota: ${h.nota}`;
        li.innerHTML += ` <button onclick="editarHistorico(${h.id}, ${h.aluno.id}, ${h.disciplina.id}, '${h.nota}')">Editar</button>`;
        li.innerHTML += ` <button onclick="deletarHistorico(${h.id})">Excluir</button>`;
        ul.appendChild(li);
    });
}

async function cadastrarOuEditarHistorico(e) {
    e.preventDefault();
    const id = document.getElementById('historico-id').value;
    const alunoId = parseInt(document.getElementById('historico-alunoId').value);
    const disciplinaId = parseInt(document.getElementById('historico-disciplinaId').value);
    const nota = document.getElementById('historico-nota').value;

    const url = '/historico' + (id ? `/${id}` : '');
    const method = id ? 'PUT' : 'POST';

    await fetch(url, {
        method: method,
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ aluno: { id: alunoId }, disciplina: { id: disciplinaId }, nota })
    });

    document.getElementById('historico-form').reset();
    listarHistorico();
}

function editarHistorico(id, alunoId, disciplinaId, nota) {
    document.getElementById('historico-id').value = id;
    document.getElementById('historico-alunoId').value = alunoId;
    document.getElementById('historico-disciplinaId').value = disciplinaId;
    document.getElementById('historico-nota').value = nota;
}

async function deletarHistorico(id) {
    await fetch(`/historico/${id}`, { method: 'DELETE' });
    listarHistorico();
}

document.getElementById('historico-form').addEventListener('submit', cadastrarOuEditarHistorico);

// -------------------- Reitores --------------------
async function listarReitores() {
    const res = await fetch('/reitor');
    const reitores = await res.json();
    const ul = document.getElementById('reitor-list');
    ul.innerHTML = '';
    reitores.forEach(r => {
        const li = document.createElement('li');
        li.textContent = `${r.id} - ${r.nome}`;
        li.innerHTML += ` <button onclick="editarReitor(${r.id}, '${r.nome}')">Editar</button>`;
        li.innerHTML += ` <button onclick="deletarReitor(${r.id})">Excluir</button>`;
        ul.appendChild(li);
    });
}

async function cadastrarOuEditarReitor(e) {
    e.preventDefault();
    const id = document.getElementById('reitor-id').value;
    const nome = document.getElementById('reitor-nome').value;

    const url = '/reitor' + (id ? `/${id}` : '');
    const method = id ? 'PUT' : 'POST';

    await fetch(url, {
        method: method,
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ nome })
    });

    document.getElementById('reitor-form').reset();
    listarReitores();
}

function editarReitor(id, nome) {
    document.getElementById('reitor-id').value = id;
    document.getElementById('reitor-nome').value = nome;
}

async function deletarReitor(id) {
    await fetch(`/reitor/${id}`, { method: 'DELETE' });
    listarReitores();
}

document.getElementById('reitor-form').addEventListener
