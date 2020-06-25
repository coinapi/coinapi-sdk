/**
 * OMS - REST API .
 * Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import org.openapitools.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Balance".equalsIgnoreCase(className)) {
      return new TypeToken<List<Balance>>(){}.getType();
    }
    
    if ("BalanceData".equalsIgnoreCase(className)) {
      return new TypeToken<List<BalanceData>>(){}.getType();
    }
    
    if ("CancelAllOrder".equalsIgnoreCase(className)) {
      return new TypeToken<List<CancelAllOrder>>(){}.getType();
    }
    
    if ("CancelOrder".equalsIgnoreCase(className)) {
      return new TypeToken<List<CancelOrder>>(){}.getType();
    }
    
    if ("CreateOrder400".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateOrder400>>(){}.getType();
    }
    
    if ("Messages".equalsIgnoreCase(className)) {
      return new TypeToken<List<Messages>>(){}.getType();
    }
    
    if ("MessagesInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<MessagesInfo>>(){}.getType();
    }
    
    if ("MessagesOk".equalsIgnoreCase(className)) {
      return new TypeToken<List<MessagesOk>>(){}.getType();
    }
    
    if ("NewOrder".equalsIgnoreCase(className)) {
      return new TypeToken<List<NewOrder>>(){}.getType();
    }
    
    if ("Order".equalsIgnoreCase(className)) {
      return new TypeToken<List<Order>>(){}.getType();
    }
    
    if ("OrderData".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderData>>(){}.getType();
    }
    
    if ("OrderLive".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderLive>>(){}.getType();
    }
    
    if ("OrderStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<OrderStatus>>(){}.getType();
    }
    
    if ("Position".equalsIgnoreCase(className)) {
      return new TypeToken<List<Position>>(){}.getType();
    }
    
    if ("PositionData".equalsIgnoreCase(className)) {
      return new TypeToken<List<PositionData>>(){}.getType();
    }
    
    if ("TimeInForce".equalsIgnoreCase(className)) {
      return new TypeToken<List<TimeInForce>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Balance".equalsIgnoreCase(className)) {
      return new TypeToken<Balance>(){}.getType();
    }
    
    if ("BalanceData".equalsIgnoreCase(className)) {
      return new TypeToken<BalanceData>(){}.getType();
    }
    
    if ("CancelAllOrder".equalsIgnoreCase(className)) {
      return new TypeToken<CancelAllOrder>(){}.getType();
    }
    
    if ("CancelOrder".equalsIgnoreCase(className)) {
      return new TypeToken<CancelOrder>(){}.getType();
    }
    
    if ("CreateOrder400".equalsIgnoreCase(className)) {
      return new TypeToken<CreateOrder400>(){}.getType();
    }
    
    if ("Messages".equalsIgnoreCase(className)) {
      return new TypeToken<Messages>(){}.getType();
    }
    
    if ("MessagesInfo".equalsIgnoreCase(className)) {
      return new TypeToken<MessagesInfo>(){}.getType();
    }
    
    if ("MessagesOk".equalsIgnoreCase(className)) {
      return new TypeToken<MessagesOk>(){}.getType();
    }
    
    if ("NewOrder".equalsIgnoreCase(className)) {
      return new TypeToken<NewOrder>(){}.getType();
    }
    
    if ("Order".equalsIgnoreCase(className)) {
      return new TypeToken<Order>(){}.getType();
    }
    
    if ("OrderData".equalsIgnoreCase(className)) {
      return new TypeToken<OrderData>(){}.getType();
    }
    
    if ("OrderLive".equalsIgnoreCase(className)) {
      return new TypeToken<OrderLive>(){}.getType();
    }
    
    if ("OrderStatus".equalsIgnoreCase(className)) {
      return new TypeToken<OrderStatus>(){}.getType();
    }
    
    if ("Position".equalsIgnoreCase(className)) {
      return new TypeToken<Position>(){}.getType();
    }
    
    if ("PositionData".equalsIgnoreCase(className)) {
      return new TypeToken<PositionData>(){}.getType();
    }
    
    if ("TimeInForce".equalsIgnoreCase(className)) {
      return new TypeToken<TimeInForce>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
