# Belajar Springboot & Kafka

- Produce Message to Kafka
- Consume Message from Kafka

## Running Kafka in Docker

```bash
docker-compose -f .docker/kafka.docker-compose.yaml \
--env-file .docker/.env \
-p <your-project-name> \
up -d
```

## Connection to kafka

How to consume message

```bash
docker-compose -f .docker/kafka.docker-compose.yaml \
--env-file .docker/.env \
-p <your-project-name> \
exec kafka \
kafka-console-consumer --from-beginning --bootstrap-server localhost:9092 --topic <your-topic>
```

How to produce message

```bash
docker-compose -f .docker/kafka.docker-compose.yaml \
--env-file .docker/.env \
-p <your-project-name> \
exec kafka \
kafka-console-producer --bootstrap-server --topic <your-topic>
```
