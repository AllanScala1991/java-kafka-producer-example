
# Java Kafka Producer

Projeto que implementa um producer do Kafka em uma aplicação Java com Spring Boot.


## Instalação

Como requisito obrigatório é necessario ter um container com o zookepper e com cluster rodando na maquina. Crie um tópico com nome "topic1"

Com isso basta rodar o KafkaApplication para iniciar a aplicação.


## Documentação da API

#### Produz uma mensagem no topico

```http
  POST /send
```

### Payload

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `topic` | `string` | **Obrigatório**. nome do topico |
| `message` | `string - object` | **Obrigatório**. nensagem a ser enviada para o tópico |