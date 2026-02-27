Projeto desenvolvido em Java aplicando conceitos de Programação Orientada a Objetos.

## Descrição do Projeto
No projeto é possível criar bicicletas e manipular seus atributos e comportamentos através de métodos.

## Classe Bicicleta
Nessa classe é posível encontrar Marcha e Velocidade como atributos de nossas bicicletas.
Ela possui 3 métodos **mudarMacha**, **acelerar** e **frear**.

### mudarMacha
Nesse método o sistema avalia se estão aumentando ou diminuindo a marcha. Se estiver aumentando a macha muda de valor (ex: de 5 para 6) e a velocidade sobe 0.5.
Já se estiver diminuindo ela confere se já estar na marcha 1, caso sim, ele avisa que a menor marcha já está sendo utilizada. Caso contrário ele diminui em 1 a macha e em 0.5 a velocidade.

### acelerar
O método começa conferindo a marcha se for menor ou igual a 5 a velocidade aumenta em 1, caso contrário aumenta em 2.

### freiar 
Esse método diminiu a velocidade em 1 cada vez que for acionado e se a velocidade já estiver zerada ele emite um aviso.



- Raquel Amaral
