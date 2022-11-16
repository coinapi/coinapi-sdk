//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'uniswap_v2_user_v2_dto.g.dart';

/// A user entity is created for any address that provides liquidity to a pool on Uniswap. This entity can be used to track open positions for users.
///
/// Properties:
/// * [entryTime] 
/// * [recvTime] 
/// * [blockNumber] - Number of block in which entity was recorded.
/// * [id] - User address.
/// * [usdSwapped] - Total USD value swapped.
/// * [vid] - 
@BuiltValue()
abstract class UniswapV2UserV2DTO implements Built<UniswapV2UserV2DTO, UniswapV2UserV2DTOBuilder> {
  @BuiltValueField(wireName: r'entry_time')
  DateTime? get entryTime;

  @BuiltValueField(wireName: r'recv_time')
  DateTime? get recvTime;

  /// Number of block in which entity was recorded.
  @BuiltValueField(wireName: r'block_number')
  int? get blockNumber;

  /// User address.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Total USD value swapped.
  @BuiltValueField(wireName: r'usd_swapped')
  String? get usdSwapped;

  /// 
  @BuiltValueField(wireName: r'vid')
  int? get vid;

  UniswapV2UserV2DTO._();

  factory UniswapV2UserV2DTO([void updates(UniswapV2UserV2DTOBuilder b)]) = _$UniswapV2UserV2DTO;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UniswapV2UserV2DTOBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UniswapV2UserV2DTO> get serializer => _$UniswapV2UserV2DTOSerializer();
}

class _$UniswapV2UserV2DTOSerializer implements PrimitiveSerializer<UniswapV2UserV2DTO> {
  @override
  final Iterable<Type> types = const [UniswapV2UserV2DTO, _$UniswapV2UserV2DTO];

  @override
  final String wireName = r'UniswapV2UserV2DTO';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UniswapV2UserV2DTO object, {
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
    if (object.usdSwapped != null) {
      yield r'usd_swapped';
      yield serializers.serialize(
        object.usdSwapped,
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
    UniswapV2UserV2DTO object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UniswapV2UserV2DTOBuilder result,
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
        case r'usd_swapped':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.usdSwapped = valueDes;
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
  UniswapV2UserV2DTO deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UniswapV2UserV2DTOBuilder();
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

