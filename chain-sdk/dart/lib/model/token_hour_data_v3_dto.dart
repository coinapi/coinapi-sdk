//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TokenHourDataV3DTO {
  /// Returns a new [TokenHourDataV3DTO] instance.
  TokenHourDataV3DTO({
    this.entryTime,
    this.recvTime,
    this.blockNumber,
    this.id,
    this.periodStartUnix,
    this.token,
    this.volume,
    this.volumeUsd,
    this.untrackedVolumeUsd,
    this.totalValueLocked,
    this.totalValueLockedUsd,
    this.priceUsd,
    this.feesUsd,
    this.open,
    this.high,
    this.low,
    this.close,
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

  /// 
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
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? periodStartUnix;

  /// 
  String? token;

  /// 
  String? volume;

  /// 
  String? volumeUsd;

  /// 
  String? untrackedVolumeUsd;

  /// 
  String? totalValueLocked;

  /// 
  String? totalValueLockedUsd;

  /// 
  String? priceUsd;

  /// 
  String? feesUsd;

  /// 
  String? open;

  /// 
  String? high;

  /// 
  String? low;

  /// 
  String? close;

  /// 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? vid;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TokenHourDataV3DTO &&
     other.entryTime == entryTime &&
     other.recvTime == recvTime &&
     other.blockNumber == blockNumber &&
     other.id == id &&
     other.periodStartUnix == periodStartUnix &&
     other.token == token &&
     other.volume == volume &&
     other.volumeUsd == volumeUsd &&
     other.untrackedVolumeUsd == untrackedVolumeUsd &&
     other.totalValueLocked == totalValueLocked &&
     other.totalValueLockedUsd == totalValueLockedUsd &&
     other.priceUsd == priceUsd &&
     other.feesUsd == feesUsd &&
     other.open == open &&
     other.high == high &&
     other.low == low &&
     other.close == close &&
     other.vid == vid;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (entryTime == null ? 0 : entryTime!.hashCode) +
    (recvTime == null ? 0 : recvTime!.hashCode) +
    (blockNumber == null ? 0 : blockNumber!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (periodStartUnix == null ? 0 : periodStartUnix!.hashCode) +
    (token == null ? 0 : token!.hashCode) +
    (volume == null ? 0 : volume!.hashCode) +
    (volumeUsd == null ? 0 : volumeUsd!.hashCode) +
    (untrackedVolumeUsd == null ? 0 : untrackedVolumeUsd!.hashCode) +
    (totalValueLocked == null ? 0 : totalValueLocked!.hashCode) +
    (totalValueLockedUsd == null ? 0 : totalValueLockedUsd!.hashCode) +
    (priceUsd == null ? 0 : priceUsd!.hashCode) +
    (feesUsd == null ? 0 : feesUsd!.hashCode) +
    (open == null ? 0 : open!.hashCode) +
    (high == null ? 0 : high!.hashCode) +
    (low == null ? 0 : low!.hashCode) +
    (close == null ? 0 : close!.hashCode) +
    (vid == null ? 0 : vid!.hashCode);

  @override
  String toString() => 'TokenHourDataV3DTO[entryTime=$entryTime, recvTime=$recvTime, blockNumber=$blockNumber, id=$id, periodStartUnix=$periodStartUnix, token=$token, volume=$volume, volumeUsd=$volumeUsd, untrackedVolumeUsd=$untrackedVolumeUsd, totalValueLocked=$totalValueLocked, totalValueLockedUsd=$totalValueLockedUsd, priceUsd=$priceUsd, feesUsd=$feesUsd, open=$open, high=$high, low=$low, close=$close, vid=$vid]';

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
    if (this.periodStartUnix != null) {
      json[r'period_start_unix'] = this.periodStartUnix;
    } else {
      json[r'period_start_unix'] = null;
    }
    if (this.token != null) {
      json[r'token'] = this.token;
    } else {
      json[r'token'] = null;
    }
    if (this.volume != null) {
      json[r'volume'] = this.volume;
    } else {
      json[r'volume'] = null;
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
    if (this.totalValueLocked != null) {
      json[r'total_value_locked'] = this.totalValueLocked;
    } else {
      json[r'total_value_locked'] = null;
    }
    if (this.totalValueLockedUsd != null) {
      json[r'total_value_locked_usd'] = this.totalValueLockedUsd;
    } else {
      json[r'total_value_locked_usd'] = null;
    }
    if (this.priceUsd != null) {
      json[r'price_usd'] = this.priceUsd;
    } else {
      json[r'price_usd'] = null;
    }
    if (this.feesUsd != null) {
      json[r'fees_usd'] = this.feesUsd;
    } else {
      json[r'fees_usd'] = null;
    }
    if (this.open != null) {
      json[r'open'] = this.open;
    } else {
      json[r'open'] = null;
    }
    if (this.high != null) {
      json[r'high'] = this.high;
    } else {
      json[r'high'] = null;
    }
    if (this.low != null) {
      json[r'low'] = this.low;
    } else {
      json[r'low'] = null;
    }
    if (this.close != null) {
      json[r'close'] = this.close;
    } else {
      json[r'close'] = null;
    }
    if (this.vid != null) {
      json[r'vid'] = this.vid;
    } else {
      json[r'vid'] = null;
    }
    return json;
  }

  /// Returns a new [TokenHourDataV3DTO] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TokenHourDataV3DTO? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TokenHourDataV3DTO[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TokenHourDataV3DTO[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TokenHourDataV3DTO(
        entryTime: mapDateTime(json, r'entry_time', ''),
        recvTime: mapDateTime(json, r'recv_time', ''),
        blockNumber: mapValueOfType<int>(json, r'block_number'),
        id: mapValueOfType<String>(json, r'id'),
        periodStartUnix: mapValueOfType<int>(json, r'period_start_unix'),
        token: mapValueOfType<String>(json, r'token'),
        volume: mapValueOfType<String>(json, r'volume'),
        volumeUsd: mapValueOfType<String>(json, r'volume_usd'),
        untrackedVolumeUsd: mapValueOfType<String>(json, r'untracked_volume_usd'),
        totalValueLocked: mapValueOfType<String>(json, r'total_value_locked'),
        totalValueLockedUsd: mapValueOfType<String>(json, r'total_value_locked_usd'),
        priceUsd: mapValueOfType<String>(json, r'price_usd'),
        feesUsd: mapValueOfType<String>(json, r'fees_usd'),
        open: mapValueOfType<String>(json, r'open'),
        high: mapValueOfType<String>(json, r'high'),
        low: mapValueOfType<String>(json, r'low'),
        close: mapValueOfType<String>(json, r'close'),
        vid: mapValueOfType<int>(json, r'vid'),
      );
    }
    return null;
  }

  static List<TokenHourDataV3DTO>? listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TokenHourDataV3DTO>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TokenHourDataV3DTO.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TokenHourDataV3DTO> mapFromJson(dynamic json) {
    final map = <String, TokenHourDataV3DTO>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TokenHourDataV3DTO.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TokenHourDataV3DTO-objects as value to a dart map
  static Map<String, List<TokenHourDataV3DTO>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TokenHourDataV3DTO>>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TokenHourDataV3DTO.listFromJson(entry.value, growable: growable,);
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

