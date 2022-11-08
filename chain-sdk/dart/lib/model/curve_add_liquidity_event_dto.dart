//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CurveAddLiquidityEventDTO {
  /// Returns a new [CurveAddLiquidityEventDTO] instance.
  CurveAddLiquidityEventDTO({
    this.entryTime,
    this.recvTime,
    this.blockNumber,
    this.id,
    this.pool,
    this.provider,
    this.tokenAmounts = const [],
    this.fees = const [],
    this.invariant,
    this.tokenSupply,
    this.block,
    this.timestamp,
    this.transaction,
    this.vid,
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

  /// Number of block in which entity was recorded.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? blockNumber;

  /// 
  String? id;

  /// 
  String? pool;

  /// 
  String? provider;

  /// 
  List<String>? tokenAmounts;

  /// 
  List<String>? fees;

  /// 
  String? invariant;

  /// 
  String? tokenSupply;

  /// 
  String? block;

  /// 
  String? timestamp;

  /// 
  String? transaction;

  /// 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? vid;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CurveAddLiquidityEventDTO &&
     other.entryTime == entryTime &&
     other.recvTime == recvTime &&
     other.blockNumber == blockNumber &&
     other.id == id &&
     other.pool == pool &&
     other.provider == provider &&
     other.tokenAmounts == tokenAmounts &&
     other.fees == fees &&
     other.invariant == invariant &&
     other.tokenSupply == tokenSupply &&
     other.block == block &&
     other.timestamp == timestamp &&
     other.transaction == transaction &&
     other.vid == vid;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (entryTime == null ? 0 : entryTime!.hashCode) +
    (recvTime == null ? 0 : recvTime!.hashCode) +
    (blockNumber == null ? 0 : blockNumber!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (pool == null ? 0 : pool!.hashCode) +
    (provider == null ? 0 : provider!.hashCode) +
    (tokenAmounts == null ? 0 : tokenAmounts!.hashCode) +
    (fees == null ? 0 : fees!.hashCode) +
    (invariant == null ? 0 : invariant!.hashCode) +
    (tokenSupply == null ? 0 : tokenSupply!.hashCode) +
    (block == null ? 0 : block!.hashCode) +
    (timestamp == null ? 0 : timestamp!.hashCode) +
    (transaction == null ? 0 : transaction!.hashCode) +
    (vid == null ? 0 : vid!.hashCode);

  @override
  String toString() => 'CurveAddLiquidityEventDTO[entryTime=$entryTime, recvTime=$recvTime, blockNumber=$blockNumber, id=$id, pool=$pool, provider=$provider, tokenAmounts=$tokenAmounts, fees=$fees, invariant=$invariant, tokenSupply=$tokenSupply, block=$block, timestamp=$timestamp, transaction=$transaction, vid=$vid]';

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
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.pool != null) {
      json[r'pool'] = this.pool;
    } else {
      json[r'pool'] = null;
    }
    if (this.provider != null) {
      json[r'provider'] = this.provider;
    } else {
      json[r'provider'] = null;
    }
    if (this.tokenAmounts != null) {
      json[r'token_amounts'] = this.tokenAmounts;
    } else {
      json[r'token_amounts'] = null;
    }
    if (this.fees != null) {
      json[r'fees'] = this.fees;
    } else {
      json[r'fees'] = null;
    }
    if (this.invariant != null) {
      json[r'invariant'] = this.invariant;
    } else {
      json[r'invariant'] = null;
    }
    if (this.tokenSupply != null) {
      json[r'token_supply'] = this.tokenSupply;
    } else {
      json[r'token_supply'] = null;
    }
    if (this.block != null) {
      json[r'block'] = this.block;
    } else {
      json[r'block'] = null;
    }
    if (this.timestamp != null) {
      json[r'timestamp'] = this.timestamp;
    } else {
      json[r'timestamp'] = null;
    }
    if (this.transaction != null) {
      json[r'transaction'] = this.transaction;
    } else {
      json[r'transaction'] = null;
    }
    if (this.vid != null) {
      json[r'vid'] = this.vid;
    } else {
      json[r'vid'] = null;
    }
    return json;
  }

  /// Returns a new [CurveAddLiquidityEventDTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CurveAddLiquidityEventDTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CurveAddLiquidityEventDTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CurveAddLiquidityEventDTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CurveAddLiquidityEventDTO(
        entryTime: mapDateTime(json, r'entry_time', ''),
        recvTime: mapDateTime(json, r'recv_time', ''),
        blockNumber: mapValueOfType<int>(json, r'block_number'),
        id: mapValueOfType<String>(json, r'id'),
        pool: mapValueOfType<String>(json, r'pool'),
        provider: mapValueOfType<String>(json, r'provider'),
        tokenAmounts: json[r'token_amounts'] is List
            ? (json[r'token_amounts'] as List).cast<String>()
            : const [],
        fees: json[r'fees'] is List
            ? (json[r'fees'] as List).cast<String>()
            : const [],
        invariant: mapValueOfType<String>(json, r'invariant'),
        tokenSupply: mapValueOfType<String>(json, r'token_supply'),
        block: mapValueOfType<String>(json, r'block'),
        timestamp: mapValueOfType<String>(json, r'timestamp'),
        transaction: mapValueOfType<String>(json, r'transaction'),
        vid: mapValueOfType<int>(json, r'vid'),
      );
    }
    return null;
  }

  static List<CurveAddLiquidityEventDTO>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CurveAddLiquidityEventDTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CurveAddLiquidityEventDTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CurveAddLiquidityEventDTO> mapFromJson(dynamic json) {
    final map = <String, CurveAddLiquidityEventDTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CurveAddLiquidityEventDTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CurveAddLiquidityEventDTO-objects as value to a dart map
  static Map<String, List<CurveAddLiquidityEventDTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CurveAddLiquidityEventDTO>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CurveAddLiquidityEventDTO.listFromJson(entry.value, growable: growable,);
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

