//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'position_v3_dto.g.dart';

/// PositionV3DTO
///
/// Properties:
/// * [entryTime] 
/// * [recvTime] 
/// * [blockNumber] - 
/// * [id] - 
/// * [owner] - 
/// * [pool] - 
/// * [token0] - 
/// * [token1] - 
/// * [tickLower] - 
/// * [tickUpper] - 
/// * [liquidity] - 
/// * [depositedToken0] - 
/// * [depositedToken1] - 
/// * [withdrawnToken0] - 
/// * [withdrawnToken1] - 
/// * [collectedFeesToken0] - 
/// * [collectedFeesToken1] - 
/// * [transaction] - 
/// * [feeGrowthInside0LastX128] - 
/// * [feeGrowthInside1LastX128] - 
/// * [vid] - 
@BuiltValue()
abstract class PositionV3DTO implements Built<PositionV3DTO, PositionV3DTOBuilder> {
  @BuiltValueField(wireName: r'entry_time')
  DateTime? get entryTime;

  @BuiltValueField(wireName: r'recv_time')
  DateTime? get recvTime;

  /// 
  @BuiltValueField(wireName: r'block_number')
  int? get blockNumber;

  /// 
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// 
  @BuiltValueField(wireName: r'owner')
  String? get owner;

  /// 
  @BuiltValueField(wireName: r'pool')
  String? get pool;

  /// 
  @BuiltValueField(wireName: r'token_0')
  String? get token0;

  /// 
  @BuiltValueField(wireName: r'token_1')
  String? get token1;

  /// 
  @BuiltValueField(wireName: r'tick_lower')
  String? get tickLower;

  /// 
  @BuiltValueField(wireName: r'tick_upper')
  String? get tickUpper;

  /// 
  @BuiltValueField(wireName: r'liquidity')
  String? get liquidity;

  /// 
  @BuiltValueField(wireName: r'deposited_token_0')
  String? get depositedToken0;

  /// 
  @BuiltValueField(wireName: r'deposited_token_1')
  String? get depositedToken1;

  /// 
  @BuiltValueField(wireName: r'withdrawn_token_0')
  String? get withdrawnToken0;

  /// 
  @BuiltValueField(wireName: r'withdrawn_token_1')
  String? get withdrawnToken1;

  /// 
  @BuiltValueField(wireName: r'collected_fees_token_0')
  String? get collectedFeesToken0;

  /// 
  @BuiltValueField(wireName: r'collected_fees_token_1')
  String? get collectedFeesToken1;

  /// 
  @BuiltValueField(wireName: r'transaction')
  String? get transaction;

  /// 
  @BuiltValueField(wireName: r'fee_growth_inside_0_last_x128')
  String? get feeGrowthInside0LastX128;

  /// 
  @BuiltValueField(wireName: r'fee_growth_inside_1_last_x128')
  String? get feeGrowthInside1LastX128;

  /// 
  @BuiltValueField(wireName: r'vid')
  int? get vid;

  PositionV3DTO._();

  factory PositionV3DTO([void updates(PositionV3DTOBuilder b)]) = _$PositionV3DTO;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PositionV3DTOBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PositionV3DTO> get serializer => _$PositionV3DTOSerializer();
}

class _$PositionV3DTOSerializer implements PrimitiveSerializer<PositionV3DTO> {
  @override
  final Iterable<Type> types = const [PositionV3DTO, _$PositionV3DTO];

  @override
  final String wireName = r'PositionV3DTO';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PositionV3DTO object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.entryTime != null) {
      yield r'entry_time';
      yield serializers.serialize(
        object.entryTime,
        specifiedType: const FullType(DateTime),
      );
    }
    if (object.recvTime != null) {
      yield r'recv_time';
      yield serializers.serialize(
        object.recvTime,
        specifiedType: const FullType(DateTime),
      );
    }
    if (object.blockNumber != null) {
      yield r'block_number';
      yield serializers.serialize(
        object.blockNumber,
        specifiedType: const FullType(int),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.owner != null) {
      yield r'owner';
      yield serializers.serialize(
        object.owner,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.pool != null) {
      yield r'pool';
      yield serializers.serialize(
        object.pool,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.token0 != null) {
      yield r'token_0';
      yield serializers.serialize(
        object.token0,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.token1 != null) {
      yield r'token_1';
      yield serializers.serialize(
        object.token1,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.tickLower != null) {
      yield r'tick_lower';
      yield serializers.serialize(
        object.tickLower,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.tickUpper != null) {
      yield r'tick_upper';
      yield serializers.serialize(
        object.tickUpper,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.liquidity != null) {
      yield r'liquidity';
      yield serializers.serialize(
        object.liquidity,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.depositedToken0 != null) {
      yield r'deposited_token_0';
      yield serializers.serialize(
        object.depositedToken0,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.depositedToken1 != null) {
      yield r'deposited_token_1';
      yield serializers.serialize(
        object.depositedToken1,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.withdrawnToken0 != null) {
      yield r'withdrawn_token_0';
      yield serializers.serialize(
        object.withdrawnToken0,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.withdrawnToken1 != null) {
      yield r'withdrawn_token_1';
      yield serializers.serialize(
        object.withdrawnToken1,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.collectedFeesToken0 != null) {
      yield r'collected_fees_token_0';
      yield serializers.serialize(
        object.collectedFeesToken0,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.collectedFeesToken1 != null) {
      yield r'collected_fees_token_1';
      yield serializers.serialize(
        object.collectedFeesToken1,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.transaction != null) {
      yield r'transaction';
      yield serializers.serialize(
        object.transaction,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.feeGrowthInside0LastX128 != null) {
      yield r'fee_growth_inside_0_last_x128';
      yield serializers.serialize(
        object.feeGrowthInside0LastX128,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.feeGrowthInside1LastX128 != null) {
      yield r'fee_growth_inside_1_last_x128';
      yield serializers.serialize(
        object.feeGrowthInside1LastX128,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.vid != null) {
      yield r'vid';
      yield serializers.serialize(
        object.vid,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PositionV3DTO object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PositionV3DTOBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'entry_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DateTime),
          ) as DateTime;
          result.entryTime = valueDes;
          break;
        case r'recv_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DateTime),
          ) as DateTime;
          result.recvTime = valueDes;
          break;
        case r'block_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.blockNumber = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'owner':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.owner = valueDes;
          break;
        case r'pool':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pool = valueDes;
          break;
        case r'token_0':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.token0 = valueDes;
          break;
        case r'token_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.token1 = valueDes;
          break;
        case r'tick_lower':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.tickLower = valueDes;
          break;
        case r'tick_upper':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.tickUpper = valueDes;
          break;
        case r'liquidity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.liquidity = valueDes;
          break;
        case r'deposited_token_0':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.depositedToken0 = valueDes;
          break;
        case r'deposited_token_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.depositedToken1 = valueDes;
          break;
        case r'withdrawn_token_0':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.withdrawnToken0 = valueDes;
          break;
        case r'withdrawn_token_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.withdrawnToken1 = valueDes;
          break;
        case r'collected_fees_token_0':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.collectedFeesToken0 = valueDes;
          break;
        case r'collected_fees_token_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.collectedFeesToken1 = valueDes;
          break;
        case r'transaction':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.transaction = valueDes;
          break;
        case r'fee_growth_inside_0_last_x128':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.feeGrowthInside0LastX128 = valueDes;
          break;
        case r'fee_growth_inside_1_last_x128':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.feeGrowthInside1LastX128 = valueDes;
          break;
        case r'vid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.vid = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PositionV3DTO deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PositionV3DTOBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

