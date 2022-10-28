//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PairV2DTO {
  /// Returns a new [PairV2DTO] instance.
  PairV2DTO({
    this.entryTime,
    this.recvTime,
    this.blockNumber,
    this.vid,
    this.id,
    this.token0,
    this.token1,
    this.reserve0,
    this.reserve1,
    this.totalSupply,
    this.reserveEth,
    this.reserveUsd,
    this.trackedReserveEth,
    this.token0Price,
    this.token1Price,
    this.volumeToken0,
    this.volumeToken1,
    this.volumeUsd,
    this.untrackedVolumeUsd,
    this.txCount,
    this.createdAtTimestamp,
    this.liquidityProviderCount,
    this.evaluatedAsk,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? entryTime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? recvTime;

  /// 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? blockNumber;

  /// 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? vid;

  /// 
  String? id;

  /// 
  String? token0;

  /// 
  String? token1;

  /// 
  String? reserve0;

  /// 
  String? reserve1;

  /// 
  String? totalSupply;

  /// 
  String? reserveEth;

  /// 
  String? reserveUsd;

  /// 
  String? trackedReserveEth;

  /// 
  String? token0Price;

  /// 
  String? token1Price;

  /// 
  String? volumeToken0;

  /// 
  String? volumeToken1;

  /// 
  String? volumeUsd;

  /// 
  String? untrackedVolumeUsd;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BigInteger? txCount;

  /// 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? createdAtTimestamp;

  /// 
  String? liquidityProviderCount;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  double? evaluatedAsk;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PairV2DTO &&
     other.entryTime == entryTime &&
     other.recvTime == recvTime &&
     other.blockNumber == blockNumber &&
     other.vid == vid &&
     other.id == id &&
     other.token0 == token0 &&
     other.token1 == token1 &&
     other.reserve0 == reserve0 &&
     other.reserve1 == reserve1 &&
     other.totalSupply == totalSupply &&
     other.reserveEth == reserveEth &&
     other.reserveUsd == reserveUsd &&
     other.trackedReserveEth == trackedReserveEth &&
     other.token0Price == token0Price &&
     other.token1Price == token1Price &&
     other.volumeToken0 == volumeToken0 &&
     other.volumeToken1 == volumeToken1 &&
     other.volumeUsd == volumeUsd &&
     other.untrackedVolumeUsd == untrackedVolumeUsd &&
     other.txCount == txCount &&
     other.createdAtTimestamp == createdAtTimestamp &&
     other.liquidityProviderCount == liquidityProviderCount &&
     other.evaluatedAsk == evaluatedAsk;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (entryTime == null ? 0 : entryTime!.hashCode) +
    (recvTime == null ? 0 : recvTime!.hashCode) +
    (blockNumber == null ? 0 : blockNumber!.hashCode) +
    (vid == null ? 0 : vid!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (token0 == null ? 0 : token0!.hashCode) +
    (token1 == null ? 0 : token1!.hashCode) +
    (reserve0 == null ? 0 : reserve0!.hashCode) +
    (reserve1 == null ? 0 : reserve1!.hashCode) +
    (totalSupply == null ? 0 : totalSupply!.hashCode) +
    (reserveEth == null ? 0 : reserveEth!.hashCode) +
    (reserveUsd == null ? 0 : reserveUsd!.hashCode) +
    (trackedReserveEth == null ? 0 : trackedReserveEth!.hashCode) +
    (token0Price == null ? 0 : token0Price!.hashCode) +
    (token1Price == null ? 0 : token1Price!.hashCode) +
    (volumeToken0 == null ? 0 : volumeToken0!.hashCode) +
    (volumeToken1 == null ? 0 : volumeToken1!.hashCode) +
    (volumeUsd == null ? 0 : volumeUsd!.hashCode) +
    (untrackedVolumeUsd == null ? 0 : untrackedVolumeUsd!.hashCode) +
    (txCount == null ? 0 : txCount!.hashCode) +
    (createdAtTimestamp == null ? 0 : createdAtTimestamp!.hashCode) +
    (liquidityProviderCount == null ? 0 : liquidityProviderCount!.hashCode) +
    (evaluatedAsk == null ? 0 : evaluatedAsk!.hashCode);

  @override
  String toString() => 'PairV2DTO[entryTime=$entryTime, recvTime=$recvTime, blockNumber=$blockNumber, vid=$vid, id=$id, token0=$token0, token1=$token1, reserve0=$reserve0, reserve1=$reserve1, totalSupply=$totalSupply, reserveEth=$reserveEth, reserveUsd=$reserveUsd, trackedReserveEth=$trackedReserveEth, token0Price=$token0Price, token1Price=$token1Price, volumeToken0=$volumeToken0, volumeToken1=$volumeToken1, volumeUsd=$volumeUsd, untrackedVolumeUsd=$untrackedVolumeUsd, txCount=$txCount, createdAtTimestamp=$createdAtTimestamp, liquidityProviderCount=$liquidityProviderCount, evaluatedAsk=$evaluatedAsk]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.entryTime != null) {
      json[r'entry_time'] = this.entryTime!.toUtc().toIso8601String();
    } else {
      json[r'entry_time'] = null;
    }
    if (this.recvTime != null) {
      json[r'recv_time'] = this.recvTime!.toUtc().toIso8601String();
    } else {
      json[r'recv_time'] = null;
    }
    if (this.blockNumber != null) {
      json[r'block_number'] = this.blockNumber;
    } else {
      json[r'block_number'] = null;
    }
    if (this.vid != null) {
      json[r'vid'] = this.vid;
    } else {
      json[r'vid'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.token0 != null) {
      json[r'token_0'] = this.token0;
    } else {
      json[r'token_0'] = null;
    }
    if (this.token1 != null) {
      json[r'token_1'] = this.token1;
    } else {
      json[r'token_1'] = null;
    }
    if (this.reserve0 != null) {
      json[r'reserve_0'] = this.reserve0;
    } else {
      json[r'reserve_0'] = null;
    }
    if (this.reserve1 != null) {
      json[r'reserve_1'] = this.reserve1;
    } else {
      json[r'reserve_1'] = null;
    }
    if (this.totalSupply != null) {
      json[r'total_supply'] = this.totalSupply;
    } else {
      json[r'total_supply'] = null;
    }
    if (this.reserveEth != null) {
      json[r'reserve_eth'] = this.reserveEth;
    } else {
      json[r'reserve_eth'] = null;
    }
    if (this.reserveUsd != null) {
      json[r'reserve_usd'] = this.reserveUsd;
    } else {
      json[r'reserve_usd'] = null;
    }
    if (this.trackedReserveEth != null) {
      json[r'tracked_reserve_eth'] = this.trackedReserveEth;
    } else {
      json[r'tracked_reserve_eth'] = null;
    }
    if (this.token0Price != null) {
      json[r'token_0_price'] = this.token0Price;
    } else {
      json[r'token_0_price'] = null;
    }
    if (this.token1Price != null) {
      json[r'token_1_price'] = this.token1Price;
    } else {
      json[r'token_1_price'] = null;
    }
    if (this.volumeToken0 != null) {
      json[r'volume_token_0'] = this.volumeToken0;
    } else {
      json[r'volume_token_0'] = null;
    }
    if (this.volumeToken1 != null) {
      json[r'volume_token_1'] = this.volumeToken1;
    } else {
      json[r'volume_token_1'] = null;
    }
    if (this.volumeUsd != null) {
      json[r'volume_usd'] = this.volumeUsd;
    } else {
      json[r'volume_usd'] = null;
    }
    if (this.untrackedVolumeUsd != null) {
      json[r'untracked_volume_usd'] = this.untrackedVolumeUsd;
    } else {
      json[r'untracked_volume_usd'] = null;
    }
    if (this.txCount != null) {
      json[r'tx_count'] = this.txCount;
    } else {
      json[r'tx_count'] = null;
    }
    if (this.createdAtTimestamp != null) {
      json[r'created_at_timestamp'] = this.createdAtTimestamp!.toUtc().toIso8601String();
    } else {
      json[r'created_at_timestamp'] = null;
    }
    if (this.liquidityProviderCount != null) {
      json[r'liquidity_provider_count'] = this.liquidityProviderCount;
    } else {
      json[r'liquidity_provider_count'] = null;
    }
    if (this.evaluatedAsk != null) {
      json[r'evaluated_ask'] = this.evaluatedAsk;
    } else {
      json[r'evaluated_ask'] = null;
    }
    return json;
  }

  /// Returns a new [PairV2DTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PairV2DTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PairV2DTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PairV2DTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PairV2DTO(
        entryTime: mapDateTime(json, r'entry_time', ''),
        recvTime: mapDateTime(json, r'recv_time', ''),
        blockNumber: mapValueOfType<int>(json, r'block_number'),
        vid: mapValueOfType<int>(json, r'vid'),
        id: mapValueOfType<String>(json, r'id'),
        token0: mapValueOfType<String>(json, r'token_0'),
        token1: mapValueOfType<String>(json, r'token_1'),
        reserve0: mapValueOfType<String>(json, r'reserve_0'),
        reserve1: mapValueOfType<String>(json, r'reserve_1'),
        totalSupply: mapValueOfType<String>(json, r'total_supply'),
        reserveEth: mapValueOfType<String>(json, r'reserve_eth'),
        reserveUsd: mapValueOfType<String>(json, r'reserve_usd'),
        trackedReserveEth: mapValueOfType<String>(json, r'tracked_reserve_eth'),
        token0Price: mapValueOfType<String>(json, r'token_0_price'),
        token1Price: mapValueOfType<String>(json, r'token_1_price'),
        volumeToken0: mapValueOfType<String>(json, r'volume_token_0'),
        volumeToken1: mapValueOfType<String>(json, r'volume_token_1'),
        volumeUsd: mapValueOfType<String>(json, r'volume_usd'),
        untrackedVolumeUsd: mapValueOfType<String>(json, r'untracked_volume_usd'),
        txCount: BigInteger.fromJson(json[r'tx_count']),
        createdAtTimestamp: mapDateTime(json, r'created_at_timestamp', ''),
        liquidityProviderCount: mapValueOfType<String>(json, r'liquidity_provider_count'),
        evaluatedAsk: mapValueOfType<double>(json, r'evaluated_ask'),
      );
    }
    return null;
  }

  static List<PairV2DTO>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PairV2DTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PairV2DTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PairV2DTO> mapFromJson(dynamic json) {
    final map = <String, PairV2DTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PairV2DTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PairV2DTO-objects as value to a dart map
  static Map<String, List<PairV2DTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PairV2DTO>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PairV2DTO.listFromJson(entry.value, growable: growable,);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

