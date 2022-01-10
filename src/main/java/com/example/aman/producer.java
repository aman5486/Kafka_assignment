package com.example.aman;



        import org.apache.kafka.clients.producer.KafkaProducer;
        import org.apache.kafka.clients.producer.ProducerRecord;
        import java.util.Properties;

public class producer {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "com.example.aman.serialization");

        KafkaProducer<String, User> kafkaProducer = new KafkaProducer<>(properties);

        try {
            for (int i = 1; i <= 10; i++) {
                User user = new User(i,"aman",21,"Btech");
                kafkaProducer.send(new ProducerRecord("mytopic2", String.valueOf(user.getId()), user));
                //System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            kafkaProducer.close();
        }
    }
}