App CSV Reader
===================


Sobre
-------------

Aplicativo via console que ler linhas do arquivo CSV e dos comandos de consulta:
Alguns comandos:
- **count** * - escreve no console a contagem total de registros importados (não deve considerar a linha de cabeçalho)
- **count distinct [propriedade]** - escreve no console o total de valores distintos da propriedade (coluna) enviada 
- **filter [propriedade] [valor]** - escreve no console a linha de cabeçalho e todas as linhas em que a propriedade enviada possua o valor enviado 

Requisitos
-------------
- Maven
- Java (jdk 8)

Executando o app
-------------

- Após o Java e o Maven instalado. Entrar no diretório raiz e executar o comando **mvn install**.
- Será gerado um arquivo zipado dentro do diretório **/target/[arquivo].zip**.
- Descompactar o arquivo entrar dentro do diretórios descompactado e executar o script **start.bat**   caso  SO Windows ou **start.sh** para SO Linux.


