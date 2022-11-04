/**
 * OnChain API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
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
    
    if ("NumericsBigInteger".equalsIgnoreCase(className)) {
      return new TypeToken<List<NumericsBigInteger>>(){}.getType();
    }
    
    if ("SushiswapPairDTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<SushiswapPairDTO>>(){}.getType();
    }
    
    if ("SushiswapSwapDTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<SushiswapSwapDTO>>(){}.getType();
    }
    
    if ("SushiswapTokenDTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<SushiswapTokenDTO>>(){}.getType();
    }
    
    if ("TransactionsETradeAggressiveSide".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransactionsETradeAggressiveSide>>(){}.getType();
    }
    
    if ("UniswapV2PairV2DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV2PairV2DTO>>(){}.getType();
    }
    
    if ("UniswapV2SwapV2DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV2SwapV2DTO>>(){}.getType();
    }
    
    if ("UniswapV2TokenV2DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV2TokenV2DTO>>(){}.getType();
    }
    
    if ("UniswapV3BundleV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV3BundleV3DTO>>(){}.getType();
    }
    
    if ("UniswapV3BurnV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV3BurnV3DTO>>(){}.getType();
    }
    
    if ("UniswapV3FactoryV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV3FactoryV3DTO>>(){}.getType();
    }
    
    if ("UniswapV3MintV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV3MintV3DTO>>(){}.getType();
    }
    
    if ("UniswapV3PoolDayDataV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV3PoolDayDataV3DTO>>(){}.getType();
    }
    
    if ("UniswapV3PoolHourDataV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV3PoolHourDataV3DTO>>(){}.getType();
    }
    
    if ("UniswapV3PoolV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV3PoolV3DTO>>(){}.getType();
    }
    
    if ("UniswapV3PositionSnapshotV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV3PositionSnapshotV3DTO>>(){}.getType();
    }
    
    if ("UniswapV3PositionV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV3PositionV3DTO>>(){}.getType();
    }
    
    if ("UniswapV3SwapV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV3SwapV3DTO>>(){}.getType();
    }
    
    if ("UniswapV3TickDayDataV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV3TickDayDataV3DTO>>(){}.getType();
    }
    
    if ("UniswapV3TickV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV3TickV3DTO>>(){}.getType();
    }
    
    if ("UniswapV3TokenHourDataV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV3TokenHourDataV3DTO>>(){}.getType();
    }
    
    if ("UniswapV3TokenV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV3TokenV3DTO>>(){}.getType();
    }
    
    if ("UniswapV3TokenV3DayDataDTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV3TokenV3DayDataDTO>>(){}.getType();
    }
    
    if ("UniswapV3UniswapDayDataV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<List<UniswapV3UniswapDayDataV3DTO>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("NumericsBigInteger".equalsIgnoreCase(className)) {
      return new TypeToken<NumericsBigInteger>(){}.getType();
    }
    
    if ("SushiswapPairDTO".equalsIgnoreCase(className)) {
      return new TypeToken<SushiswapPairDTO>(){}.getType();
    }
    
    if ("SushiswapSwapDTO".equalsIgnoreCase(className)) {
      return new TypeToken<SushiswapSwapDTO>(){}.getType();
    }
    
    if ("SushiswapTokenDTO".equalsIgnoreCase(className)) {
      return new TypeToken<SushiswapTokenDTO>(){}.getType();
    }
    
    if ("TransactionsETradeAggressiveSide".equalsIgnoreCase(className)) {
      return new TypeToken<TransactionsETradeAggressiveSide>(){}.getType();
    }
    
    if ("UniswapV2PairV2DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV2PairV2DTO>(){}.getType();
    }
    
    if ("UniswapV2SwapV2DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV2SwapV2DTO>(){}.getType();
    }
    
    if ("UniswapV2TokenV2DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV2TokenV2DTO>(){}.getType();
    }
    
    if ("UniswapV3BundleV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV3BundleV3DTO>(){}.getType();
    }
    
    if ("UniswapV3BurnV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV3BurnV3DTO>(){}.getType();
    }
    
    if ("UniswapV3FactoryV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV3FactoryV3DTO>(){}.getType();
    }
    
    if ("UniswapV3MintV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV3MintV3DTO>(){}.getType();
    }
    
    if ("UniswapV3PoolDayDataV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV3PoolDayDataV3DTO>(){}.getType();
    }
    
    if ("UniswapV3PoolHourDataV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV3PoolHourDataV3DTO>(){}.getType();
    }
    
    if ("UniswapV3PoolV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV3PoolV3DTO>(){}.getType();
    }
    
    if ("UniswapV3PositionSnapshotV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV3PositionSnapshotV3DTO>(){}.getType();
    }
    
    if ("UniswapV3PositionV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV3PositionV3DTO>(){}.getType();
    }
    
    if ("UniswapV3SwapV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV3SwapV3DTO>(){}.getType();
    }
    
    if ("UniswapV3TickDayDataV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV3TickDayDataV3DTO>(){}.getType();
    }
    
    if ("UniswapV3TickV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV3TickV3DTO>(){}.getType();
    }
    
    if ("UniswapV3TokenHourDataV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV3TokenHourDataV3DTO>(){}.getType();
    }
    
    if ("UniswapV3TokenV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV3TokenV3DTO>(){}.getType();
    }
    
    if ("UniswapV3TokenV3DayDataDTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV3TokenV3DayDataDTO>(){}.getType();
    }
    
    if ("UniswapV3UniswapDayDataV3DTO".equalsIgnoreCase(className)) {
      return new TypeToken<UniswapV3UniswapDayDataV3DTO>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
