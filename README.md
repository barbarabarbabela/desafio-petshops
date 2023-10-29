# Desafio Petshops
<div style="display: inline block">
<img src="https://www.vectorlogo.zone/logos/java/java-ar21.svg" width="200px"/>
</div>   

# Instruções para executar o projeto
## GitHub
1. Certifique-se que você tenha o Java instalado no seu computador. Caso contrário, acesse https://www.java.com/br/download/ para realizar o download.
2. Clone o repositório disponibilizado no GitHub.
  ```sh
  git clone https://github.com/barbarabarbabela/desafio-petshops.git
  ```
3. Execute o projeto na sua IDE de preferência.

## Arquivo .exe
1. Certifique-se de que você tenha o Java Runtime Environment instalado no seu computador.
2. Baixe o arquivo com a extensão .exe e execute.   

# Decisões de projeto
1. Decidi criar o arquivo em Java, porque estou aprendendo sobre a linguagem e achei que fosse uma boa maneira de praticar.
2. Como as informações de "distância" dos petshops são estáticas, apenas as inseri na array na ordem crescente. Assim, quando houver empate, o código sempre escolherá a primeira opção, respeitando, assim, o critério de desempate imposto pelo desafio. É possível, também, criar um método de ordenação de lista.
3. Decidi utilizar algumas bibliotecas padrão do Java, como o java.util e o java.text.
4. Optei por não incluir uma reinicialização do programa ao final de sua execução. Caso o usuário queira inserir novos dados, será necessário inicializar novamente o projeto.
5. Decidi incluir um detalhamento dos valores de cada um dos petshops e, ao final, o programa escolherá o petshop de melhor custo-benefício.

# Premissas assumidas
1. Estou considerando que usuário levará todos os cães no mesmo dia, não sendo possível levar os cães pequenos em um dia de semana e os grandes no fim de semana, por exemplo.
2. Estou considerando que o usuário poderá digitar datas no tempo passado. O programa funcionará do mesmo jeito.
