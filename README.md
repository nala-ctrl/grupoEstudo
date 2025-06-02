# Grupo de Estudos

Este repositório principal organiza os projetos de estudo por semanas, usando **submódulos Git** para manter cada projeto separado, mas versionado dentro do grupo.

---

## Estrutura

- `semana-01/`  
  Contém o projeto da semana 1 (ex: desafios de Java)
- `semana-02/`  
  Contém o projeto da semana 2 (`maiorOuMenor`), que é um submódulo Git

---

## Como clonar este repositório com os submódulos

Para clonar o repositório principal junto com todos os submódulos, use:

git clone --recurse-submodules https://github.com/nala-ctrl/grupoEstudo.git

---

Se já clonou sem os submódulos, rode:

git submodule update --init --recursive

---

Como atualizar os submódulos

Sempre que puxar mudanças no repositório principal, rode para atualizar os submódulos:

git submodule update --recursive --remote

----

Como trabalhar dentro dos submódulos

Cada submódulo é um repositório Git independente. Para fazer alterações dentro dele:

1. Entre na pasta do submódulo. Exemplo:

cd semana-02/maiorOuMenor

2. Faça suas alterações, adicione, commit e dê push normalmente:

git add .
git commit -m "Minha alteração no maiorOuMenor"
git push

3. Volte para o repositório principal:

cd ../../

4. Atualize a referência do submódulo no repositório principal:

git add semana-02/maiorOuMenor
git commit -m "Atualiza submódulo maiorOuMenor"
git push
