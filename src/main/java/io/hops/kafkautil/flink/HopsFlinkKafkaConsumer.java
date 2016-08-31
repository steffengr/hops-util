package io.hops.kafkautil.flink;

import java.util.Properties;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer09;
import org.apache.flink.streaming.util.serialization.DeserializationSchema;

/**
 *
 * Hops Wrapper for FlinkKafkaConsumer.
 */
public class HopsFlinkKafkaConsumer extends FlinkKafkaConsumer09 {

  //TODO: Remove public to for initialization from hopsKafkaUtil
  public HopsFlinkKafkaConsumer(String topic, DeserializationSchema schema,
          Properties props) {
    super(topic, schema, props);
  }

}
